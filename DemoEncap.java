package fundamental;
 class Encapulation
{
	private String NAME;
	public String getNAME()
	{
		return NAME;
	}
	public void setName(String name)
	{
	this.NAME = name;
	}
}
public class DemoEncap {
	public static void main(String[] args) {
		Encapulation ob =new Encapulation();
		ob.setName("anshul");
		System.out.println("Name is : "+ob.getNAME());
		
		
	}

}
