public class Client {

    public static void main(String[] args) {

        IProduitFactory essence = new ProduitFactoryEssence();
        IProduitFactory electrique = new ProduitFactoryElectrique();
        IProduitFactory hybride = new ProduitFactoryHybride();

        System.out.println("===== FAMILLE ESSENCE =====");
        essence.getScooter().methodeScooter();
        essence.getAutomobile().methodeAutomobile();

        System.out.println();

        System.out.println("===== FAMILLE ELECTRIQUE =====");
        electrique.getScooter().methodeScooter();
        electrique.getAutomobile().methodeAutomobile();

        System.out.println();

        System.out.println("===== FAMILLE HYBRIDE =====");
        hybride.getScooter().methodeScooter();
        hybride.getAutomobile().methodeAutomobile();

        System.out.println();
        System.out.println("===== FIN DES TESTS =====");
    }
}
