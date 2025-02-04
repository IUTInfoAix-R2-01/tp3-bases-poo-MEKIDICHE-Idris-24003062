package exercice_Livre;

public class testLivre {

	public static void main(String[] args) {
		Livre livre = new Livre("charlie", 10, 5);
		System.out.println (livre.getName());
		System.out.println (livre.getPrice());
		System.out.println (livre.getQuantite());
		System.out.println (livre);
	}
}
