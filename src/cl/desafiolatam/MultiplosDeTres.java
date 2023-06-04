package cl.desafiolatam;

import java.util.ArrayList;

public class MultiplosDeTres {

	public static void main(String[] args) {
	//tomar solo los que sean múltiplos de 3
	//sumar la lista de múltiplos de 3
		int [] lista = new int[args.length];
		int parametro;
		
		for(int i=0; i < args.length; i++) {
			parametro = Integer.parseInt(args[i]); 
			lista[i] = parametro;
		}
		ArrayList<Integer> list3x = new ArrayList<Integer>();
		list3x = clearList(lista);
		int suma = suma(list3x);
		System.out.println(suma);
		double list3xPromedio = promedio(list3x);
		System.out.println(list3xPromedio);
	}
	
	public static ArrayList<Integer> clearList(int[] lista) {
		ArrayList<Integer> list3x = new ArrayList<Integer>();
		for (int i=0; i< lista.length; i++) {
			if(lista[i] % 3 == 0  ) {
				list3x.add(lista[i]);
			}
		}
		return list3x;	
	}
	
	public static int suma(ArrayList<Integer> lista) {
		int suma = 0;
		for (int i=0; i< lista.size(); i++) {
			suma = suma+ lista.get(i);
		}
		return suma;
		
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
