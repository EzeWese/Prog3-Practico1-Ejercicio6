package Practico2_Ejercicio6_Metodos_Arbol;

import java.util.List;

public class ArbolBinario {
	private Node raiz;
	
	public ArbolBinario() {
		raiz = null;
	}
	
	public void setRoot(Node root) {
		raiz = root;
	}
	
	public Node getRoot() {
		return raiz;
	}
	
	public void insert(int value) {
		if(raiz != null) {
			raiz.add(value);
		}
		else {
			raiz = new Node(value);
		}
	}
	
	public List<Object> getFrontera() {
		return raiz.getFrontera();
	}
	
	public void printInOrder() {
		raiz.printInOrder();
	}
	
}
