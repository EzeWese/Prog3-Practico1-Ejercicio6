package Practico1_Ejercicio6;

public class NodeInt {
	private int num;
	private NodeInt next;
	
	public NodeInt() {
		num = 0;
		next = null;
	}
	
	public NodeInt(int o, NodeInt n) {
		setNum(o);
		setNext(n);
	}
	
	public void setNum(int numero) {
		num = numero;
	}
	
	public void setNext(NodeInt n) {
		next = n;
	}
	
	public int getNum() {
		return num;
	}
	
	public NodeInt getNext() {
		return next;
	}
}

