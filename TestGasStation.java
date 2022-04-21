
public class TestGasStation {

}

class GasStation {

    double[] amount;

    GasStation(double[] amount) {
        this.amount = amount.clone();
    }

    void fillTank(int i, Truck trucks, double distance) {
        double fill = trucks.calFuel(distance);
        if (amount[i] >= fill) {
            amount[i] -= fill;
        } else {
            amount[i] = 0;
            System.out.println(i + " out of gasoline");
        }
    }
}
