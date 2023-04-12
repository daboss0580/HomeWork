package Class9HW;

public class HW080423N4 {
    public static void main(String[] args) {
        String[] cars = {"Mercedes Benz", "Peugeot", "Tesla", "Ford", "Bentley", "Volvo"};
        for (int a = 0; a < cars.length; a++) {
            System.out.print(cars[a]+" ");
        }
        System.out.println();
        String[] cars1 = new String[6];
        cars1[0] = "Mercedes Benz";
        cars1[1] = "Peugeot";
        cars1[2] = "Tesla";
        cars1[3] = "Ford";
        cars1[4] = "Bentley";
        cars1[5] = "Volvo";
        int a = 0;
        while (a < cars1.length) {
            System.out.print(cars1[a]+" ");
            a++;
        }
    }
}
