package InheritancePrograms;

import StringPrograms.subchildclass;

public class Childclass extends subchildclass {

	public void five()
	{
		System.out.println("five Method");
	}
	
	public void six()
	{
		System.out.println("six Method");
	}
	
	public static void main(String[] args) {
		
		Childclass childobject = new Childclass();
		
		childobject.one();
		childobject.two();
		childobject.three();
		childobject.four();
		childobject.five();
		childobject.six();
		
	}

}
