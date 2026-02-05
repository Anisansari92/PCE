package ToStringApp;

import java.util.ArrayList;
import java.util.Collections;

public class CompareToString {

	public static void main(String[] args) {
	   Employee e1 = new Employee("Anis",102,65000);
       Employee e2 = new Employee("Roopam",101,100000);
       Employee e3 = new Employee("Cosmo",103,70000);
       Employee e4 = new Employee("Lucky",105,50000);
       Employee e5 = new Employee("Om",104,60000);
       ArrayList al=new ArrayList();
       al.add(e1);
       al.add(e2);
       al.add(e3);
       al.add(e4);
       al.add(e5);
    	     System.out.println(al);
    	     Collections.sort(al);
    	     System.out.println(al);
  }
}

class Employee implements Comparable{
	String Emp_Name;
	int Emp_Id;
	int Salary;

	public Employee(String Emp_Name, int Emp_Id, int Salary) {
		this.Emp_Name = Emp_Name;
		this.Emp_Id = Emp_Id;
		this.Salary = Salary;
	}
	
	public String getEmp_Name() {
		return Emp_Name;
	}

	public void setEmp_Name(String emp_Name) {
		Emp_Name = emp_Name;
	}

	public int getEmp_Id() {
		return Emp_Id;
	}

	public void setEmp_Id(int emp_Id) {
		Emp_Id = emp_Id;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public String toString() {
		return Emp_Name + " " + Emp_Id + " " + Salary;
	}

	@Override
	public int compareTo(Object o) {
		int ann=(this.Emp_Name).compareTo(((Employee)(o)).Emp_Name);
		if(ann>0){
			return 1;
		}
		else {
			return -1;
		}
	}
}
