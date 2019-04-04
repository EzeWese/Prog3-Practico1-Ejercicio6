package Practico1_Ejercicio6;
import java.util.Iterator;

public class ListaInt implements Iterable<Integer>{
	private NodeInt first;
	private int size;
	
	public ListaInt() {
		first = null;
		size = 0;
	}
	
	public void insertFront(int i) {
		NodeInt tmp = new NodeInt(i, null);
		tmp.setNext(first);
		first = tmp;
		size = size+1;
	}

	public void insertarOrdenado(int i) {
		NodeInt nuevo = new NodeInt();
		nuevo.setNum(i);
		
		if(getFirst() == null) { //Si nuestro inicio es null entonces
			insertFront(i); //entonces nuestro inicio sera nuestro nuevo nodo
		}
		else { //de lo contrario es que ya hay algo dentro de la lista y hay que recorrerla
			NodeInt auxInicio = getFirst(); //Creamos un nuevo nodo para recorrer la lista
			if(auxInicio.getNum() > i) { //Si nuestro inicio auxiliar es mayor que el dato a insertar
				nuevo.setNext(auxInicio); //Entonces hay que insertarlo antes, diciendo que el siguiente de nuevo sea nuestro auxiliarInicio
				insertFront(nuevo.getNum()); 
			}
			else {
				while(auxInicio.getNext() != null && auxInicio.getNext().getNum() < i) {
					auxInicio = auxInicio.getNext();
				}
				nuevo.setNext(auxInicio.getNext());
				auxInicio.setNext(nuevo);
				this.size++;
			}
		}
		
	}
	
	public int extractFront() { //te devuelve lo elimnado al principio
		int num = this.first.getNum();
		this.first = this.first.getNext();
		size = size-1;
		return num;
	}
	
	public int get(int i) {
		NodeInt tmp = this.first;
		
		for(int j = 1; j<i; j++) {
			tmp = tmp.getNext();
		}
		
		return tmp.getNum();
	}
	
	public NodeInt getFirst() {
		return this.first;
	}
	
	public void print(int n) { //Si quiero imprimir n elementos tengo que usar como base el metodo get(int i) e imprimir luego del for
		System.out.println("Numero: " + this.get(n));
	}
	
	public boolean isEmpty() {
		if(this.first == null) {
			return true;
		}
		return false;
	}
	
	public int size() {
		return this.size;
	}
	
	public void max() {
		NodeInt max = new NodeInt();
		NodeInt tmp = new NodeInt();
		tmp = this.first;
		int pos = 0;
		
		for(int i=1; i<size; i++) {
			if(tmp.getNum() > max.getNum()) {
				max = tmp;
				pos = i;
			}
			tmp = tmp.getNext();
		}
		System.out.println("El maximo es: "+ max.getNum()+" posision: "+ pos);
	}

	public MyIteratorList iterator() {
		MyIteratorList it = new MyIteratorList();
		return it;
	}
	
	
	public class MyIteratorList implements Iterator<Integer>{
		private int pos;
		private NodeInt nodeTmp;
		
		public MyIteratorList() {
			pos = 0;
			nodeTmp = first;
		}
		
		public boolean hasNext() {
			return pos < size;
		}
		
		public Integer get() {
			return nodeTmp.getNum();
		}
		
		public Integer next() {
			Integer tmp = nodeTmp.getNum();
			nodeTmp = nodeTmp.getNext();
			pos++;
			return tmp;
			
		}
		
	}
}
