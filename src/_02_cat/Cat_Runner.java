package _02_cat;

public class Cat_Runner {

	
	public static void main(String[] args) {
		
		Cat Spleens = new Cat("Spleens");
		
		Spleens.meow();
		Spleens.printName();
		for (int i = 0; i < 4990; i++) {
			Spleens.kill();
		}
	}
}
