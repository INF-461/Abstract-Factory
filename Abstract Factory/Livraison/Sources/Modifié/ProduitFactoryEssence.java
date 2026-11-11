public class ProduitFactoryEssence implements IProduitFactory {

    @Override
    public Scooter getScooter() {
        return new ScooterEssence();
    }

    @Override
    public Automobile getAutomobile() {
        return new AutomobileEssence();
    }
}
