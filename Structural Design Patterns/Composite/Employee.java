import java.util.List;
import java.util.ArrayList;
public class Employee implements EmployeePlan
{
    String name, designation;
    int salary;
    List<Employee> subordinates;
    Employee(String name, String designation, int salary)
    {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e1) {
        this.subordinates.add(e1);
    }

    public void remove(Employee e1) {
        this.subordinates.remove(e1);
    }

    public void showSubordinatesDetails(){
        // for (int i = 0; i < this.subordinates.size(); i++) {
		// 	System.out.println(this.subordinates.get(i));
		// }
        this.subordinates.forEach((item)-> {
            System.out.println("name :" + item.name + " position :" + item.designation + " salary :" + item.salary);
            item.showSubordinatesDetails();
        });
    }
}