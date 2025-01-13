package academy.devdojo.javaoneforall.introduction;

public class Class04Operators {
    public static void main(String[] args) {
        // +, -, /, *, %, <, >, <=, >=, !=

        // logical operators
        // && (and), || (or)

        int number1 = 10;
        int number2 = 20;
        int subtractionResult = number1 - number2;
        int addictionResult = number1 + number2;
        int divisionResult = number2 / number1;
        int multiplicationResult = number1 * number2;
        int module = 20 % 2;
        System.out.println(subtractionResult);
        System.out.println(addictionResult);
        System.out.println(divisionResult);
        System.out.println(multiplicationResult);
        System.out.println(module);

        int age = 35;
        float salary = 3600F;
        boolean isLegal = age >= 30 && salary>= 4612 || age >=31;
        boolean isNotLegal = age < 30 && salary >= 3300 || salary >= 3500;
        System.out.println(isLegal);
        System.out.println(isNotLegal);

    }
}
