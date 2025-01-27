package academy.devdojo.javaoneforall.introduction;

public class Class15MultidimensionalArrays {
    public static void main(String[] args) {
        //arrays of arrays, is like a dictionary in python
        int[][] days = new int[3][3]; //the first bracket says how many columns and de second
                                     //says how many rows
        days[0][0] = 46;
        days[0][1] = 13;
        days[0][2] = 45;
        days[1][0] = 7;
        days[1][1] = 80;
        days[1][2] = 86;
        days[2][0] = 84;
        days[2][1] = 58;
        days[2][2] = 12;

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days.length; j++) {
                System.out.println(days[i][j]);
            }
        }
        System.out.println("--------------");

        //Foreach in multidimensional arrays
        for(int[] baseArray : days){
            for(int day : baseArray){
                System.out.println(day);
            }
        }

    }
}
