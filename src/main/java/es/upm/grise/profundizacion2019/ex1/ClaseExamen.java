package es.upm.grise.profundizacion2019.ex1;

public class ClaseExamen {
	
	public float metodoAProbar(int a, int b) {
		//nodo 1	
		float result = 0;
		
		while( a > b/*nodo2*/) {
			//nodo3
			a--;
		}
		
		if (a <= b/*nodo4*/) {
			//nodo5
			result = 0;
		}
		//nodo6
		else {
			result = b;
		}
		//nodo 7
		return result;
	}

}
