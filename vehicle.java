public class vehicle {
	public static void main(String arg[]) {
		petrolEngine pe=new petrolEngine();
		deselEngine de=new deselEngine();
		System.out.println("Hello");
		pe.Start();
		de.Start();
		pe.Stop();
		de.Stop();
		//
	}
}