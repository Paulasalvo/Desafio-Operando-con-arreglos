package cl.desafiolatam;

public class Visitas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] visitas = new int[args.length];
		
		for(int i=0; i < args.length; i++) {
			visitas[i] = Integer.parseInt(args[i]);
		}
		
		double result = promedio(visitas);
		System.out.println(result);
		
	}

	public static double promedio(int[] visitas) {
		double suma = 0;
		for (int i=0; i< visitas.length; i++) {
			suma = suma+ visitas[i];
		}
		double promedio = suma/visitas.length;
		return promedio;
		
	}
	
	
}
