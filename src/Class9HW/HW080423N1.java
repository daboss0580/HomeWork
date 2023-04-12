package Class9HW;

public class HW080423N1 {
    public static void main(String[] args) {
        /*
        Create an array of chars and store grades into it: A,B,C,D. Then print a grade B (use 2 different ways of creating an array).
         */
        char[] grade = {'A', 'B', 'C', 'D'};
        for (int a = 0; a < grade.length; a++) {
            if (a == 1) {
                System.out.println(grade[a]);
            }
        }

        char [] grade1=new char[4];
        grade1[0]='A';
        grade1[1]='B';
        grade1[2]='C';
        grade1[3]='D';
        System.out.println(grade1[1]);
    }
}