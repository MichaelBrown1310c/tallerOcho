package taller8;

public class puntoAnimal {
	
		
		int weight;
		int height;
		double speed;
		puntoAnimal() {
		weight = 50;
		height = 4;
		speed = 2; //millas por hora
		}
		puntoAnimal(int w, int h, int s){
		weight=w;
		h=height;
		speed=s;
		}
		public double getTime(double miles){ //obtiene el numero de horas para recorrer estas millas
		return miles/speed;
		}
		public int getWeight(){
		return weight;
		}
		public int getHeight(){
		return height;
		}
		public double getSpeed(){
		return speed;
		}
		}