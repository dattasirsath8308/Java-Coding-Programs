/* 

4. Builder Design Pattern
	- The Builder Design Pattern is a creational pattern used in software design to construct a complex object step by step. 
	- It allows the construction of a product in a step-by-step fashion, where the construction process can vary based on the type of product being built. 
	- The pattern separates the construction of a complex object from its representation, allowing the same construction process to create different representations.	

	- while creating object when object contain may attributes there are many problm exists :
	1. We have to pass many argument to create object.
	2. some parameters might be optional.
	3. factory class taked all responsibility for creating object. If the object is heavy then all then all complexity is the part of factory class.

So, in builder pattern be create object step by step and finally return final object with desired values of attributes.

	- When to use Builder Design Pattern?
	    The Builder design pattern is used when you need to create complex objects with a large number of optional components or configuration parameters. This pattern is particularly useful when an object needs to be constructed step by step, some of the scenarios where the Builder design pattern is beneficial are:
	1. Complex Object Construction
	2. Avoiding constructors with multiple parameters.
	3. Immutable Objects
	4. Common Interface for Multiple Representations

	
	- When not to use Builder Design Pattern?
	1. Simple Object Construction
	2. Performance Concerns.
	3. Immutable Objects with Final Fields.
	4. Tight Coupling with Product	

*/
class User {
    private final String userId;
    private final String userName;
    private final String emailId;

    private User(UserBuilder builder) {
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.emailId = builder.emailId;

    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public String toString() {
        return this.userId + " " + this.userName + " " + this.emailId;
    }

    // Inner class

    static class UserBuilder {
        private String userId;
        private String userName;
        private String emailId;

        public UserBuilder() {

        }

        // Static Method
        public static UserBuilder getUserBuilder() {
            return new UserBuilder();
        }

        // Method chaining
        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }

    }

}

public class BuilderFactory {

    public static void main(String[] args) {

        User user1 = new User.UserBuilder()
                .setEmailId("datta@123").setUserId("D124")
                .setUserName("datta")
                .build();

        System.out.println(user1);

        // Here parameter is optional
        User user2 = new User.UserBuilder().getUserBuilder()
                .setEmailId("datta@123").setUserId("D124")
                .build();

        System.out.println(user2);

    }

}
