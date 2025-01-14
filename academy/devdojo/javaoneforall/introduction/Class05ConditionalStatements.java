package academy.devdojo.javaoneforall.introduction;

public class Class05ConditionalStatements {
    public static void main(String[] args) {
        int age = 6;
        if(age >= 15){
            age++;
            System.out.println(age);
        }
        else if (age <15) {
            System.out.println("you still i child, go sleep");
        }

        //ternary operator
        double salary = 200;
        String negativeMessage = "dont buy an ps5";
        String positiveMessage = "buy an ps5";
        // condition ? True : False
        String displayMessage = salary >= 2000 ? positiveMessage : negativeMessage;
        System.out.println(displayMessage);
    }
}
