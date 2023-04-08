package taller8;


public class puntoTres {
	
	static puntoAnimal a1 = new puntoAnimal();
	static puntoAnimal a2 = new puntoAnimal(50,21,4);
	public static void main(String[] args) {
		System.out.println("Animal 1 tiene una velocidad de "+ a1.getSpeed() + "\nAnimal 2 tiene una velocidad de " + a2.getSpeed());
	}
	
	
}