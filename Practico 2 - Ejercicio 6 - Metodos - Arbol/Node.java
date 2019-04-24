package Practico2_Ejercicio6_Metodos_Arbol;
import java.util.ArrayList;
import java.util.List;

public class Node {
	private int info;
	private Node izq, der;
	
	public Node() {
		info = (Integer) null;
		izq = null;
		der = null;
	}
	
	public Node(int value) {
		info = value;
		izq = null;
		der = null;
	}
	
	public void add(int value) {
		if(value < this.info) {
			if(izq != null) {
				izq.add(value);
			}
			else {
				izq = new Node(value);
			}
		}
		else {
			if(der != null) {
				der.add(value);
			}
			else {
				der = new Node(value);
			}
		}
	}
	
	public List<Object> getFrontera(){
		List<Object> auxList = new ArrayList<Object>();
		
		if(this.izq == null && this.der == null) {
			auxList.add(this.getInfo());
		}
		if(this.izq != null) {
			auxList.addAll(this.izq.getFrontera());
		}
		if(this.der != null){
			auxList.addAll(this.der.getFrontera());
		}
		return auxList;
	}
	
	public void printInOrder() {
		if(izq != null) {
			izq.printInOrder();
		}
		else {
			System.out.println("-");
		}
		
		System.out.println(this.info);
		
		if(der != null) {
			der.printInOrder();
		}
		else {
			System.out.println("-");
		}
	}
	
	public void setInfo(int num) {
		this.info = num;
	}

	public void setDer(Node n) {
		this.der = n;
	}
	
	public void setIzq(Node n) {
		this.izq = n;
	}
	
	public int getInfo() {
		return info;
	}
	
	public Node getDer() {
		return der;
	}
	
	public Node getIzq() {
		return izq;
	}
}
