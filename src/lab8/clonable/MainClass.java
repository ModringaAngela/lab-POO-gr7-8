package lab8.clonable;

public class  MainClass {

	/*
		Immutable / imutabil : un obiect ce nu poate fi modificat
		Mutable / mutabil : un obiect ce poate fi modificat
		https://www.digitalocean.com/community/tutorials/how-to-create-immutable-class-in-java

		Shallow copy -> daca o modifici, modifici si obiectul initial (cel din care s a facut clone sau care
		s a dat ca param la constructor)

		Deep copy -> daca o modifici, obiectul initial nu se schimba
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		Masina m1 = new Masina("VW","rosu");
		Masina m2 = new Masina("Skoda", "nergu");
		Masina m3 = new Masina("Renault", "verde");

		Student carina = new Student("Carina", m1, new Carte("a"));
		Student iulia = new Student("Iulia", m2, new Carte("a"));
		Student ana = new Student("Ana", m3, new Carte("a"));
		
		Student s1 = carina.clone();  // cu clone!
		Student s2 = new Student(iulia, true); // cu copy constructor, deep copy
		Student s3 = new Student(ana, false); // cu copy constructor, shallow copy

		System.out.println("Inainte de orice modificare:");
		System.out.println(carina);
		System.out.println(s1);
		System.out.println(iulia);
		System.out.println(s2);
		System.out.println(ana);
		System.out.println(s3);

		s1.getMasina().revopseste("alb");
		s2.getMasina().revopseste("portocaliu");
		s3.getMasina().revopseste("roz");

		System.out.println();
		System.out.println("Dupa modificari:");
		System.out.println(carina);
		System.out.println(s1);
		System.out.println(iulia);
		System.out.println(s2);
		System.out.println(ana);
		System.out.println(s3);

		//clasa care nu implementeaza interfata clonable
		//decomentati, rulati, analizati exceptia, si apoi comentati la loc
//		System.out.println("Incercam sa facem clone la o clasa ce nu implementeaza clonable");
//		StudentNonClonable c1 = new StudentNonClonable("Iulia", m1);
//		StudentNonClonable c2 = c1.clone();
//		System.out.println(c2);
	}

}
