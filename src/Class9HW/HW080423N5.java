package Class9HW;

public class HW080423N5 {
    public static void main(String[] args) {
        //Create an array of animals and store 5 elements into it. Using 2 different loops print all elements from the array.
        String [] animals={"Lion", "Tiger", "Dog", "Ox", "Bear"};
        for (int a=0; a<animals.length; a++){
            System.out.print(animals[a]+" ");
        }
        System.out.println();
        String [] animals1= new String[5];
        animals1[0]="Lion";
        animals1[1]="Tiger";
        animals1[2]="Dog";
        animals1[3]="Ox";
        animals1[4]="Bear";
        int a=0;
        while (a<animals1.length){
            System.out.print(animals[a]+" ");
            a++;
        }

    }
}
