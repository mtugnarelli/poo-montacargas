
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
	 * post: devuelve el peso máximo [Kg] que el Montacargas
	 *       puede cargar.
	 */
	public double obtenerCargaMaximaSoportada() {
		
		return cargaMaximaSoportada;
	}
}
