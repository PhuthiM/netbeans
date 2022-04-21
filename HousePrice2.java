
import java.util.Scanner;

public class HousePrice2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        House[] house = new House[n];
        for (int i = 0; i < n; i++) {
            int landSize = sc.nextInt();
            int quality = sc.nextInt();
            int floors = sc.nextInt();
            int houseArea = sc.nextInt();
            house[i] = new House(landSize, quality, floors, houseArea);
        }
        int maxsale = sc.nextInt();
        int minarea = sc.nextInt();
        boolean yep = false;
        for (int i = 0; i < n; i++) {
            if (maxsale >= house[i].price && minarea <= house[i].houseArea) {
                System.out.println(house[i].landSize + " " + house[i].quality + " " + house[i].floors + " " + house[i].houseArea + " " + house[i].price);
                yep = true;
            }
        }
        if (!yep) {
            System.out.println("none");
        }
    }
}
