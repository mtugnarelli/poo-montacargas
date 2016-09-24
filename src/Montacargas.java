
public class Montacargas {

	private double cargaMaximaSoportada = 1.0;
	
	private double carga = 0;
	
	/**
	 * pre : 'pesoDeLaCargaMaxima' es un valor mayor a cero.
	 * post: Montacargas sin carga, listo para cargar hasta
	 *       'pesoDeLaCargaMaxima' [Kg].
	 */
	public Montacargas(double pesoDeLaCargaMaxima) {
		
		if (pesoDeLaCargaMaxima > 0) {
			
			cargaMaximaSoportada = pesoDeLaCargaMaxima;
		}
	}

	/**
	 * post: devuelve el peso m�ximo [Kg] que el Montacargas
	 *       puede cargar.
	 */
	public double obtenerCargaMaximaSoportada() {
		
		return cargaMaximaSoportada;
	}
	
	/**
	 * post: devuelve la carga actual [Kg] 
	 */
	public double obtenerCarga() {
		
		return carga;
	}
	
	/**
	 * pre : no est� cargado y 'unaCarga' es un valor mayor a cero.
	 * post: coloca 'unaCarga' [Kg] en el Montacargas.
	 */
	public void cargar(double unaCarga) {
		
		if (! estaCargado() && 
			(unaCarga > 0) && (unaCarga <= cargaMaximaSoportada)) {
			
			carga = unaCarga;
		}
	}
	
	/**
	 * post: devuelve si el Montacargas actualmente est� cargado.
	 */
	public boolean estaCargado() {
		
		return (carga > 0);
	}
}
