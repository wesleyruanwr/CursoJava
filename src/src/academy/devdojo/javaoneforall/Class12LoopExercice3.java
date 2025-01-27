package academy.devdojo.javaoneforall;

public class Class12LoopExercice3 {
    public static void main(String[] args) {

        int carPrice = 60000;
        int totalPerMonth = 800;
        int totalInstallments = 0;
        int totalPayed = 0;
        while(totalPayed<carPrice){
            totalPayed += totalPerMonth;
            totalInstallments++;
        }
        System.out.println("Total of Installments = "+ totalInstallments);
    }
}
