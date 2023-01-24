package javaMethoed;

public class Multipal_Parameter {
	// Class - It is blueprint or Plan of Building
	// For Example Multipal_Parameter is name of Building
	
		  static void myMethod(String fname, int age) 
    //  MyMetod is one of the room of the building
		  
		  {
		    System.out.println(fname + " is " + age);
		  }
     //  System.out.println() is furniture of the room
		  
		  public static void main(String[] args) 
	// public static void main is entrance of the Building
		  {
		    myMethod("Liam", 5);
		    myMethod("Jenny", 8);
		    myMethod("Anja", 31);
		  }
		}
