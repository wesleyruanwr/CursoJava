package academy.devdojo.javaoneforall;

import java.time.LocalDate;

public class Class03PrimitiveTypesExercice {
    public static void main(String[] args){
        String name = "Wesley";
        String address = "345 brookling";
        double salary = 1500.55;
        LocalDate salaryDateReceived = LocalDate.of(2025, 1, 21);
        String report = "I " +name+ " livin at " +address + " confirm i received the salary of " +salary + " on " +salaryDateReceived;
        System.out.println(report);
    }
}



