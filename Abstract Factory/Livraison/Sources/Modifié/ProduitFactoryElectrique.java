public class ProduitFactoryElectrique implements IProduitFactory {

    @Override
    public Scooter getScooter() {
        return new ScooterElectrique();
    }

    @Override
    public Automobile getAutomobile() {
        return new AutomobileElectrique();
    }
}
