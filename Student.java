package superkeyword;

public class Student extends Person{

		String name="xyz";
		
		public Student(){
			//call invoke
			super();
			System.out.println("In child class cont.");
		}
		
		void msg() {
			System.out.println("In child class Student");
		}
		
		//method
		public void display() {
			System.out.println("Calling parent class Name="+super.name);
			//child method
			msg();
			//parent class called
			super.msg();
		}
}