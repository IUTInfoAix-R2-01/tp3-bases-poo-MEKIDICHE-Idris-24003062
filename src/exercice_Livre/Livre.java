package exercice_Livre;

public class Livre {
	private String name;
	private double price;
	private int quantite;

	public Livre(String name, double price, int quantite) {
		this.name = name;
		this.price = price;
		this.quantite = quantite;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantite() {
		return quantite;
	}

	public String toString() {
		return "Le livre est " + name + " le prix est de " + price + " la quantité est de " + quantite;
	}
}
