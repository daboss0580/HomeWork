package Class9HW;

public class HW080423N7 {
    public static void main(String[] args) {
        int [] num={6,8,35,786,1000,6,3};
        int max=num[0];
        for (int a=0; a<num.length; a++){
            if (num[a]>max)
                max=num[a];

        }
        System.out.println("The largest number is "+max);
    }
}
