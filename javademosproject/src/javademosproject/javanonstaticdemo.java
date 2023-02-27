package javademosproject;

public class javanonstaticdemo {
	public javanonstaticdemo(){ //"constructor" name same as class
		System.out.println("From constructor");
	}
	static{
		System.out.println("From static-block");
	}
	{
		System.out.println("From non-static-block");
	}
	public static void main(String[] args) {
		 System.out.println("From main method");
		 javanonstaticdemo jnsd1 = new javanonstaticdemo();//calling constructor & creating object
		 javanonstaticdemo jnsd2 = new javanonstaticdemo();//creating an other object
		 
		 car mycar=new car();
		 System.out.println("noofwheels");
		 System.out.println(mycar.noofwheels);//non-static variable
		 System.out.println(car.manufacturer);//static variable
		 System.out.println(mycar.colour);
		 System.out.println(car.model);
		 
}
}

//whenever the object is created,the non-static block and the constructor is executed
//even if we remove the constructor we can create the object,because the compiler creates a default constructor