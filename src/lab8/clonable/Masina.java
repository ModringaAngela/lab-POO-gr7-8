package lab8.clonable;

public class Masina implements Cloneable{
	
	private String marca; //non-mutabil
	private String culoare; //non-mutabil
	
	public Masina(String marca, String culoare) {
		this.marca = marca;
		this.culoare = culoare;
	}
	
	public Masina(Masina x) { // copy constructor
		this.marca = x.marca;
		this.culoare = x.culoare;
		// este atat copie de suprafata cat si de profunzime!!!
	}
	
	public void revopseste(String nouaCuloare) {
		culoare=nouaCuloare;
	}
	
	public String toString() {
		return "Masina: "+marca+" de culoare "+culoare;
	}
	
	public Masina clone() throws CloneNotSupportedException {
		Masina c = (Masina)super.clone(); // atat clona de suprafata cat si clona de profunzime - nu avem variabile instanta mutabile
		return c;
	}

}
