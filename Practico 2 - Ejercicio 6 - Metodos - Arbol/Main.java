package Practico2_Ejercicio6_Metodos_Arbol;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArbolBinario arbol = new ArbolBinario();
		
		Node root = new Node(10);
		
		arbol.setRoot(root);
		
		arbol.insert(6);
		arbol.insert(4);
		arbol.insert(7);
		arbol.insert(13);
		arbol.insert(18);
		
		List<Object> lista = arbol.getFrontera();
		
		for(int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		
	}

}
