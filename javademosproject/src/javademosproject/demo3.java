package javademosproject;

public class demo3 {
	public static void main(String[] args) {
	 System.out.println("From main method");
	 method1();
	 method2();
	 
	 demo3 d3=new demo3();   //for calling non-static method in static method create an object
	 d3.method3();
}
  static void method1(){
	System.out.println("From static method1");
}
  static  void method2(){
	System.out.println("From static method2");
}
  void method3(){
	  System.out.println("From nonstatic method3");
  }


}
