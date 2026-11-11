public class ProduitFactoryHybride implements IProduitFactory {

    @Override
    public Scooter getScooter() {
        return new ScooterHybride();
    }

    @Override
    public Automobile getAutomobile() {
        return new AutomobileHybride();
    }
}
