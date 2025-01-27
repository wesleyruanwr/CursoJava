package academy.devdojo.javaoneforall.introduction;

public class Class14Foreach {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int[] numbers2 = {1,2,3,4,5};
        int[] numbers3 = new int[]{5,4,3,2,1}; //if you initialize the array you cant define the length

        //in this way the for fells more legible
        //foreach
        for (int number : numbers3) {
            System.out.println(number);
        }

    }
}
