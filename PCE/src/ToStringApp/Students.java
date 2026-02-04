package ToStringApp;

public class Students {

	public static void main(String[] args) {
		student1 s1 = new student1("Anis", 23, "Male");
		System.out.println(s1);
	}
}
class student1{
	String name;
	int age;
	String gender;
	
	public student1(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void getAge(int age) {
		this.age = age;
	}
	
	public String getGender() {
		return gender;
	}
	public void gender(String gender) {
		this.gender = gender;
	}
	
	public String toString() {
		return name+" "+age+" "+gender;
	}
}