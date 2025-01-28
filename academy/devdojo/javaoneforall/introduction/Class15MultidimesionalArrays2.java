package academy.devdojo.javaoneforall.introduction;

public class Class15MultidimesionalArrays2 {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int num = 0;
        for(int i=0; i<array.length; i++){
            System.out.println("\n-----");
            for (int j = 0; j < array.length; j++) {
                array[i][j] = num;
                num++;
                System.out.print(array[i][j]);
                }
            }
        }
}

