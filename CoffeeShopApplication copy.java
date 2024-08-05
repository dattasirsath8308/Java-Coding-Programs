


// 1. CoffeeShopApplication.java


package com.coffeeshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoffeeShopApplication {
    public static void main(String[] args) {
        SpringApplication.run(CoffeeShopApplication.class, args);
    }
}



------------------



// 2. OrderController.java

package com.coffeeshop.controller;

import com.coffeeshop.model.Order;
import com.coffeeshop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.findAllOrders();
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.saveOrder(order);
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable Long id) {
        return orderService.findOrderById(id);
    }

    @PutMapping("/{id}")
    public Order updateOrder(@PathVariable Long id, @RequestBody Order order) {
        return orderService.updateOrder(id, order);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
    }
}


-------------------


// 3. Order.java

package com.coffeeshop.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String customerName;

    @Column(nullable = false)
    private String details;

    public Order() {
    }

    public Order(String customerName, String details) {
        this.customerName = customerName;
        this.details = details;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}



--------------------



// 4. MenuItem.java



package com.coffeeshop.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double price;

    public MenuItem() {
    }

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.price, price) == 0 &&
                Objects.equals(id, menuItem.id) &&
                Objects.equals(name, menuItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

--------------------


// 5. OrderService.java


package com.coffeeshop.service;

import com.coffeeshop.model.Order;
import com.coffeeshop.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAllOrders() {
        return orderRepository.findAll();
    }

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order findOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public Order updateOrder(Long id, Order orderDetails) {
        Order order = orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
        order.setCustomerName(orderDetails.getCustomerName());
        order.setDetails(orderDetails.getDetails());
        return orderRepository.save(order);
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}

-----------------------

// 6. MenuRepository.java



package com.coffeeshop.repository;

import com.coffeeshop.model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<MenuItem, Long> {
}




-----------------------


// 7. AppConfig.java


package com.coffeeshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // Define any beans or configuration settings here

}



-------------------



// 8. MenuConfigLoader.java


package com.coffeeshop.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Component
public class MenuConfigLoader {

    @Value("${menu.config.file}")
    private String menuConfigFile;

    public Properties loadMenuConfig() throws IOException {
        Properties properties = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream(menuConfigFile)) {
            if (input == null) {
                throw new IOException("Menu configuration file not found: " + menuConfigFile);
            }
            properties.load(input);
        }
        return properties;
    }
}



----------------------



// 9. OrderServiceTest.java



package com.coffeeshop;

import com.coffeeshop.model.Order;
import com.coffeeshop.repository.OrderRepository;
import com.coffeeshop.service.OrderService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Arrays;
import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderServiceTest {

    @Mock
    private OrderRepository orderRepository;

    @InjectMocks
    private OrderService orderService;

    public OrderServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindAllOrders() {
        Order order1 = new Order("Alice", "Latte");
        Order order2 = new Order("Bob", "Espresso");
        when(orderRepository.findAll()).thenReturn(Arrays.asList(order1, order2));
        
        assertEquals(2, orderService.findAllOrders().size());
        verify(orderRepository, times(1)).findAll();
    }

    @Test
    void testSaveOrder() {
        Order order = new Order("Charlie", "Cappuccino");
        when(orderRepository.save(order)).thenReturn(order);

        Order savedOrder = orderService.saveOrder(order);
        assertNotNull(savedOrder);
        assertEquals("Charlie", savedOrder.getCustomerName());
        verify(orderRepository, times(1)).save(order);
    }

    @Test
    void testFindOrderById() {
        Order order = new Order("Diana", "Macchiato");
        when(orderRepository.findById(1L)).thenReturn(Optional.of(order));

        Order foundOrder = orderService.findOrderById(1L);
        assertNotNull(foundOrder);
        assertEquals("Diana", foundOrder.getCustomerName());
        verify(orderRepository, times(1)).findById(1L);
    }

    @Test
    void testUpdateOrder() {
        Order existingOrder = new Order("Eve", "Mocha");
        Order updatedOrder = new Order("Eve", "Mocha with extra shot");
        when(orderRepository.findById(1L)).thenReturn(Optional.of(existingOrder));
        when(orderRepository.save(existingOrder)).thenReturn(updatedOrder);

        Order result = orderService.updateOrder(1L, updatedOrder);
        assertNotEquals("Mocha", result.getDetails());
        verify(orderRepository, times(1)).findById(1L);
        verify(orderRepository, times(1)).save(existingOrder);
    }

    @Test
    void testDeleteOrder() {
        doNothing().when(orderRepository).deleteById(1L);
        orderService.deleteOrder(1L);
        verify(orderRepository, times(1)).deleteById(1L);
    }
}



-----------------


// 10. OrderControllerTest.java


package com.coffeeshop;

import com.coffeeshop.controller.OrderController;
import com.coffeeshop.model.Order;
import com.coffeeshop.service.OrderService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import java.util.Arrays;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class OrderControllerTest {

    @Mock
    private OrderService orderService;

    @InjectMocks
    private OrderController orderController;

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper objectMapper = new ObjectMapper();

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllOrders() throws Exception {
        Order order1 = new Order("Alice", "Latte");
        Order order2 = new Order("Bob", "Espresso");
        when(orderService.findAllOrders()).thenReturn(Arrays.asList(order1, order2));

        mockMvc.perform(get("/orders"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$[0].customerName").value("Alice"))
                .andExpect(jsonPath("$[1].customerName").value("Bob"));

        verify(orderService, times(1)).findAllOrders();
    }

    @Test
    void testCreateOrder() throws Exception {
        Order order = new Order("Charlie", "Cappuccino");
        when(orderService.saveOrder(any(Order.class))).thenReturn(order);

        ResultActions result = mockMvc.perform(post("/orders")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(order)));

        result.andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.customerName").value("Charlie"))
                .andExpect(jsonPath("$.details").value("Cappuccino"));

        verify(orderService, times(1)).saveOrder(any(Order.class));
    }

    @Test
    void testGetOrderById() throws Exception {
        Order order = new Order("Diana", "Macchiato");
        when(orderService.findOrderById(1L)).thenReturn(order);

        mockMvc.perform(get("/orders/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.customerName").value("Diana"))
                .andExpect(jsonPath("$.details").value("Macchiato"));

        verify(orderService, times(1)).findOrderById(1L);
    }

    @Test
    void testUpdateOrder() throws Exception {
        Order existingOrder = new Order("Eve", "Mocha");
        Order updatedOrder = new Order("Eve", "Mocha with extra shot");
        when(orderService.updateOrder(eq(1L), any(Order.class))).thenReturn(updatedOrder);

        ResultActions result = mockMvc.perform(put("/orders/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(updatedOrder)));

        result.andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.customerName").value("Eve"))
                .andExpect(jsonPath("$.details").value("Mocha with extra shot"));

        verify(orderService, times(1)).updateOrder(eq(1L), any(Order.class));
    }

    @Test
    void testDeleteOrder() throws Exception {
        mockMvc.perform(delete("/orders/1"))
                .andExpect(status().isOk());

        verify(orderService, times(1)).deleteOrder(1L);
    }
}



--------



// 11. MenuRepositoryTest.java



package com.coffeeshop;

import com.coffeeshop.model.MenuItem;
import com.coffeeshop.repository.MenuRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class MenuRepositoryTest {

    @Autowired
    private MenuRepository menuRepository;

    @Test
    void testFindAll() {
        MenuItem item1 = new MenuItem("Latte", 3.5);
        MenuItem item2 = new MenuItem("Espresso", 2.5);
        menuRepository.save(item1);
        menuRepository.save(item2);

        List<MenuItem> items = menuRepository.findAll();

        assertEquals(2, items.size());
        assertTrue(items.contains(item1));
        assertTrue(items.contains(item2));
    }
}




------------------------



// 12. application.properties

# Application properties
spring.datasource.url=jdbc:mysql://localhost:3306/coffee_shop_db
spring.datasource.username=root
spring.datasource.password=password
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update




// 13. menu.properties
This file should contain your menu items in a key-value pair format. For example:



menu.item.latte.name=Latte
menu.item.latte.price=3.5

menu.item.espresso.name=Espresso
menu.item.espresso.price=2.5




// 14. application-test.properties


# Test-specific application properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=create



