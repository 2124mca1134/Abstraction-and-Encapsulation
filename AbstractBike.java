package fundamental;

 abstract class Bike {
	abstract void run();
}
class Honda extends Bike
{
	void run()
	{
		System.out.println("running safely");
	}
	
public class  AbstractBike
{
public static void main(String[] args) {
		Honda ob = new Honda();
		ob.run();

	}

}
}
