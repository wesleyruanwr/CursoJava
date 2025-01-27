package academy.devdojo.javaoneforall;


public class Class06ConditionalStatementsExercice {
    public static void main(String[] args) {
        double salary = 800;
        String messageMinimumTaxes = "You stay in the minimum classification and will pay * 9.70% * in taxes ";
        String messageMediumTaxes = "You stay in the medium classification and will pay * 37.35% * in taxes ";
        String messageMaxTaxes = "You stay in the maximum classification and will pay * 49.50% * in taxes ";
        double minimumTaxes = 9.70/100;
        double mediumTaxes = 37.35/100;
        double maxTaxes = 49.50/100;

        if (salary <= 34712){
            double totalToPay = minimumTaxes * salary;
            System.out.println(messageMinimumTaxes);
            System.out.println("Total to pay= " + totalToPay);
        }
        else if (salary >= 34713 && salary <= 68507){
            double totalToPay = mediumTaxes * salary;
            System.out.println(messageMediumTaxes);
            System.out.println("Total to pay= " + totalToPay);
        }
        else if (salary >= 68508){
            double totalToPay = maxTaxes * salary;
            System.out.println(messageMaxTaxes);
            System.out.println("Total to pay= " + totalToPay);
        }
    }
}

