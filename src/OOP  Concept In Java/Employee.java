package OOPConcept;
class Employeeinfo{
	int empId;
	String name;
	double salary;
	Employeeinfo(int empId,String name,double salary){
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	 void Display() {
		System.out.println("EmployeeId:"+empId);
		System.out.println("EmployeeName:"+name);
		System.out.println("Salary:Rs."+salary);
	}
}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employeeinfo[] employee = { new Employeeinfo(1001,"Dainel",100233),
				                    new Employeeinfo(1002,"John ",100233)
			
		};
		for( Employeeinfo employee1: employee) {
			employee1.Display();
		}

	}

}
