
/*

- The multiple inheritance problem can occur, when we have two interfaces with the default methods of same signature. Le

- This is because we have the same method in both the interface and the compiler is not sure which method to be invoked.

How to solve this issue?
To solve this problem, we can implement this method in the implementation class like this:
*/


interface MyInterface{  
 
    default void newMethod(){  
        System.out.println("Newly added default method");  
    }  
    void existingMethod(String str);  
}  

interface MyInterface2{  
	 
    default void newMethod(){  
        System.out.println("Newly added default method");  
    }  
    void disp(String str);  
} 


public class _4_Default_Method_Multiple_Inheritance implements MyInterface, MyInterface2{ 
	// implementing abstract methods
    public void existingMethod(String str){           
        System.out.println("String is: "+str);  
    }  
    public void disp(String str){
    	System.out.println("String is: "+str); 
    }
    //Implementation of duplicate default method
    public void newMethod(){  
        System.out.println("Implementation of default method");  
    }  
    public static void main(String[] args) {  
    	_4_Default_Method_Multiple_Inheritance obj = new _4_Default_Method_Multiple_Inheritance();
    	
    	//calling the default method of interface
        obj.newMethod();     
  

    }  
}