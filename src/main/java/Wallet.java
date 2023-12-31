import java.util.ArrayList;

public class Wallet {
    private ArrayList<IChargeable> iChargeables;
    private IChargeable selectedIChargeable;

    public Wallet(ArrayList<IChargeable> iChargeables, IChargeable selectedIChargeable){
        this.iChargeables = iChargeables;
        this.selectedIChargeable = selectedIChargeable;
    }

    public ArrayList<IChargeable> getiChargeables() {
        return iChargeables;
    }

    public IChargeable getSelectedIChargeable() {
        return selectedIChargeable;
    }

    public void setSelectedIChargeable(IChargeable selectedIChargeable) {
        this.selectedIChargeable = selectedIChargeable;
    }

    public void addNewIChargeable(IChargeable newIChargeable){
        iChargeables.add(newIChargeable);
    }
}
