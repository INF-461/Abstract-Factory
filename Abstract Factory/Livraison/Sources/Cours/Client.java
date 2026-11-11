public class Client {

    public static void main(String[] args) {

        IProduitFactory produitFactory1 = new ProduitFactory1();
        IProduitFactory produitFactory2 = new ProduitFactory2();

        Scooter scooter;
        Automobile automobile;

        System.out.println("===== FAMILLE ESSENCE =====");

        scooter = produitFactory1.getScooter();
        automobile = produitFactory1.getAutomobile();

        scooter.methodeScooter();
        automobile.methodeAutomobile();

        System.out.println();

        System.out.println("===== FAMILLE ELECTRIQUE =====");

        scooter = produitFactory2.getScooter();
        automobile = produitFactory2.getAutomobile();

        scooter.methodeScooter();
        automobile.methodeAutomobile();
    }
}
