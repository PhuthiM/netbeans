
import java.util.Scanner;

public class HousePrice1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int landSize = sc.nextInt();
        int quality = sc.nextInt();
        int floors = sc.nextInt();
        int houseArea = sc.nextInt();
        House house = new House(landSize, quality, floors, houseArea);
        System.out.println(house.landSize + " " + house.quality + " " + house.floors + " " + house.houseArea);
        System.out.println(house.price);
    }
}

class House {

    int landSize, quality, floors, houseArea;
    int price;

    public House(int landSize, int quality, int floors, int houseArea) {
        this.landSize = landSize;
        this.quality = quality;
        this.floors = floors;
        this.houseArea = houseArea;
        this.price = computePrice(landSize, quality, floors, houseArea);
    }

    int computePrice(int landSize, int quality, int floors, int houseArea) {
        price += landSize * 10000;
        price += (floors - 1) * 200000;
        switch (quality) {
            case 1:
                price += houseArea * 10000;
                break;
            case 2:
                price += houseArea * 8000;
                break;
            case 3:
                price += houseArea * 5000;
                break;
        }
        return price;
    }
}
