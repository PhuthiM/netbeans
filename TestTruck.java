
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author phuth
 */
public class TestTruck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Truck[] truck = new Truck[n];
        for (int i = 0; i < n; i++) {
            int weight = sc.nextInt();
            int amount = sc.nextInt();
            truck[i] = new Truck(weight, amount);
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int number = sc.nextInt();
            int distance = sc.nextInt();
            System.out.println(truck[number - 1].calFuel(distance));
        }
    }
}

class Truck {

    int weight;
    int amount;

    public Truck(int weight, int amount) {
        this.weight = weight;
        this.amount = amount;
    }

    double calFuel(double distance) {
        double F = (distance + weight) / 10;
     
        return Math.ceil(F);
    }

}
