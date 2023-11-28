package lab8.clonable;

public class Student implements Cloneable{
	private String nume; // non-mutabil
	private Masina masina; // mutabil
	private Carte carte;
	int i;
	
	public Student(String nume, Masina masina) {
		this.nume = nume;
		this.masina = masina;
	}

	public Student(String nume, Masina masina, Carte c) {
		this.nume = nume;
		this.masina = masina;
		this.carte = c;
	}

	public Student(Student x, boolean deep) { // copy constructor
		this.nume = x.nume; // string este mutabil oricum
		if (deep){
			/*	se creaza un obiect de tipul masina nou
				=> modificarile facute pe obiectul masina al copiei
				 NU SE vor transfera si la obiectul initial
			 */
			this.masina = new Masina(x.masina); // copie de profunzime !!! - se cheama copy constructor pentru variabilele instanta mutabile !!!
		}else {
			/*
				obiectul original si copia vor "imparti" acelasi field masina
				=>modificarile facute pe obiectul masina al copiei
				  SE vor transfera si la obiectul initial
			 */
			this.masina = x.masina;  // copie de suprafata!!!
		}

	}
	
	public Masina getMasina() {
		return masina;
	}
	
	public String toString() {
		return "Studentul "+nume+" conduce "+masina;
	}
	
	public Student clone() throws CloneNotSupportedException {
		//invocarea constructorului de baza al clasei parinte (Object in cazul asta)
		Student c = (Student) super.clone(); // clona de suprafata - shallow copy
		//resetareare valorilor pentru fieldurile mutabile
		c.masina = masina.clone(); // clona de profunzime - deep copy - se apeleaza clone pentru variabilele instanta mutabile!!!
		c.carte = carte.clone();
		return c;
	}

}
