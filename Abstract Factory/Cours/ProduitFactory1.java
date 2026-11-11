public class ProduitFactory1 implements IProduitFactory {

    @Override
    public Scooter getScooter() {
        return new ScooterEssence();
    }

    @Override
    public Automobile getAutomobile() {
        return new AutomobileEssence();
    }
}
