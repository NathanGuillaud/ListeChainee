
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MyList liste = new MyList();
		System.out.println("LISTE VIDE");
		System.out.println(liste.toString());
		System.out.println("----------");
		
		Element e1 = new Element(3);
		System.out.println("CREATION ELEMENT 3");
		System.out.println(e1.toString());
		System.out.println("----------");
		
		liste.addLast(e1);
		System.out.println("AJOUT 3 FIN DE LISTE");
		System.out.println(liste.toString());
		System.out.println("----------");
		
		Element e2 = new Element(1);
		System.out.println("CREATION ELEMENT 1");
		System.out.println(e2.toString());
		System.out.println("----------");
		
		liste.addFirst(e2);
		System.out.println("AJOUT 1 DEBUT DE LISTE");
		System.out.println(liste.toString());
		System.out.println("----------");
		
		Element e3 = new Element(4);
		System.out.println("CREATION ELEMENT 4");
		System.out.println(e3.toString());
		System.out.println("----------");
		
		liste.addLast(e3);
		System.out.println("AJOUT 4 FIN DE LISTE");
		System.out.println(liste.toString());
		System.out.println("----------");
		
		Element e4 = liste.removeFirst();
		System.out.println("SUPPRESSION 1e ELEMENT (1)");
		System.out.println(liste.toString());
		System.out.println("----------");
		
		liste.addLast(e4);
		System.out.println("AJOUT 1 FIN DE LISTE");
		System.out.println(liste.toString());
		System.out.println("----------");
		
		System.out.println("LISTE FINALE (3-4-1)");
		System.out.println(liste.toString());
	}

}
