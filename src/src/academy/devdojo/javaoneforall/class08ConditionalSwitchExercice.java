package academy.devdojo.javaoneforall;

public class class08ConditionalSwitchExercice {
    public static void main(String[] args) {
        int weekDay = 4;
        switch (weekDay){
            case 7:
            case 1:
                System.out.println("Its not a bussiness day");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Its a bussiness day");
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}
