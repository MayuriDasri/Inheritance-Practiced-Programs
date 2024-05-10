package InheritancePrograms;

public class MainMethodOverloading {
	
	public void main(int i) {
		System.out.println("Int method "+ i);
	}
	
	public void main(String s) {
		System.out.println("String method "+ s);

	}
	public static void main(String[] args) {
		System.out.println("Default Main");
		MainMethodOverloading mm = new MainMethodOverloading();
		mm.main(10);
		mm.main("Hello");
	}
	

}
