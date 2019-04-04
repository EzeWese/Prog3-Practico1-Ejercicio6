package Practico1_Ejercicio6;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaInt lista1 = new ListaInt();
		ListaInt lista2 = new ListaInt();
		
		lista1.insertFront(4);
		lista1.insertFront(7);
		lista1.insertFront(1);
		lista1.insertFront(6);
		
		lista2.insertFront(1);
		lista2.insertFront(2);
		lista2.insertFront(8);
		lista2.insertFront(4);
		
		ListaInt listaNueva = listaNueva(lista1, lista2);
		
		ListaInt.MyIteratorList it = listaNueva.iterator();
		
		while(it.hasNext()) {
			int tmp = it.next();
			System.out.println(tmp);
		}
		
	}
	
	public static ListaInt listaNueva(ListaInt lista1, ListaInt lista2) {  //Ejercicio 6 Lista con elementos que estan en la primera
		ListaInt auxList = new ListaInt();                                 //pero que no estan en la segunda.
		ListaInt.MyIteratorList it1 = lista1.iterator();
		
		while(it1.hasNext()) {
			ListaInt.MyIteratorList it2 = lista2.iterator();
			boolean contenido = false;
			while(it2.hasNext() && !contenido) {
				if(it1.get() == it2.get()) {
					contenido = true;
				}
				else {
					it2.next();
				}
			}
			if(!contenido) {
				auxList.insertFront(it1.get());
			}
			it1.next();
		}
		return auxList;
	}
	
}
