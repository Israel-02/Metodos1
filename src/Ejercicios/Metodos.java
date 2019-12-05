package Ejercicios;

public class Metodos {

	public static void main (String[]args) {
		System.out.println(devolucionVar());
		System.out.println(numEnt(76));
	}
	public static String var1 () {
	
		String var1 ="hola";
		String var2 = ", que tal?";
		String varfinal = var1+var2;
		return varfinal;
	}
	
	public static String devolucionVar() {
		var1();
	return var1();
	}
	
	public static char numEnt (int var1) {
		char var2 =  (char) var1;
		return var2;
		
	}
}
