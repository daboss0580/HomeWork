package Class9HW;

public class HW080423N3 {
    public static void main(String[] args) {
        /*
        Create an array of words: Java, Saturday, day, coding, is. Print the following sentence using elements of array: “Saturday is Java coding day”.
         */
        String [] sentence={"Java", "Saturday", "day", "coding", "is"};
        System.out.println(sentence[1]+" "+sentence[4]+" "+sentence[0]+" "+sentence[3]+" "+sentence[2]);

        String [] sent=new String[5];
        sent[0]="Java";
        sent[1]="Saturday";
        sent[2]="day";
        sent[3]="coding";
        sent[4]="is";
        System.out.println(sent[1]+" "+sent[4]+" "+sent[0]+" "+sent[3]+" "+sent[2]);
    }
}
