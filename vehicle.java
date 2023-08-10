public class vehicle {
	public static void main(String arg[]) {
		petrolEngine pe=new petrolEngine();
		deselEngine de=new deselEngine();
		ElectricEngine ee=new ElectricEngine();
		System.out.println("Hello");
		pe.Start();
		de.Start();
		pe.Stop();
		de.Stop();
		de.test();
		ee.start();
	
	}
}