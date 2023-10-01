package Employees;

public class Main extends Employee {

	public Main(String name, int empId) {
		super(name, empId);
	
	}

	public static void main(String[] args) {
		Manager manager = new Manager("Mano", 1014,"B.Tech");
              manager.display();
              
       Technician technician = new  Technician("MA", 1004, "Java");
              technician.display();
	}


	}

