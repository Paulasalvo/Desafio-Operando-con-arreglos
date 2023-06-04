package cl.desafiolatam;
import java.util.ArrayList;
public class SmartWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] steps = new int[args.length];
		int parametro;
		
		for(int i=0; i < args.length; i++) {
			parametro = Integer.parseInt(args[i]); 
			steps[i] = parametro;
		}
		ArrayList<Integer> stepsCleared = new ArrayList<Integer>();
		stepsCleared = clearSteps(steps); 
		double stepsPromedio = promedio(stepsCleared);
		System.out.printf("El valor promedio de pasos es %f", stepsPromedio);
	
	}

	public static ArrayList<Integer> clearSteps(int[] steps) {
		ArrayList<Integer> stepsCleared = new ArrayList<Integer>();
		for (int i=0; i< steps.length; i++) {
			if(steps [i]>=200 && steps[i]<=100000) {
				stepsCleared.add(steps[i]);
			}
		}
		return stepsCleared;	
	}
	
	public static double promedio(ArrayList<Integer> lista) {
		double suma = 0;
		if (lista.size()== 0) {
			return 0;
		}
		for (int i=0; i< lista.size(); i++) {
			suma = suma+ lista.get(i);
		}
		double promedio = suma/lista.size();
		return promedio;
		
	}	
	
	
		
}
