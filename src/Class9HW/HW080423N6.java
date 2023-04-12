package Class9HW;

public class HW080423N6 {
    public static void main(String[] args) {
        //Create an array on integers and calculate the sum of all elements in an array
       int add=0;
        int [] num={5,6,34,7,33,8};
        for (int a=0; a<num.length; a++){
            add +=num[a];
        }
        System.out.println(add);
    }
}
