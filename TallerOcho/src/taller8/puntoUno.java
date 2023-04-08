package taller8;

public class puntoUno {

	int numSides;
	boolean regular;
	puntoUno(){
	numSides = 3;
	regular=true;
	}
	puntoUno(int n, boolean regular){
	numSides = n;
	
	this.regular = regular;
	}
	public boolean isRegular(){
	return regular;
	}
	public int getSides(){
	return numSides;
	}
	public void setSides(int s){
	numSides = s;
	}
	public void setRegular(boolean regular){
	this.regular = regular;
	}
	}
