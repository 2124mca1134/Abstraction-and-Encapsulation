package fundamental;
interface Person
{
	void disp();
}
interface ac{
	void ringtone();
}
class Student implements Person
{
	public void disp()
	{
		System.out.println("this is the method of child class");
	}
	public void rngtone() {
		System.out.print("jy");
	}
}
class Lecturer implements Person
{
	public void disp()
	{
		System.out.println("this is the method of lecturer class");
	}
}


public class DemoAbs {

	public static void main(String[] args) {
		Student person1=new Student();
		person1.disp();
		Lecturer person2=new Lecturer();
		person2.disp();

	}

}
