package academy.devdojo.javaoneforall;

//in default settins of SWITCH, all after the correct case is executable
//so after each case, put the BREAK
//but remember, the BREAK will be stop all execution, not only the block of case

public class Class07ConditionalSwitch {
    public static void main(String[] args) {
        int day = 6;
        switch (day){
            case 1:
                System.out.println("It's sunday");
                break;
            case 2:
                System.out.println("It's monday");
                break;
            case 3:
                System.out.println("It's tuesday");
                break;
            case 4:
                System.out.println("It's wednesday");
                break;
            case 5:
                System.out.println("It's thursday");
                break;
            case 6:
                System.out.println("It's friday");
                break;
            case 7:
                System.out.println("It's saturday");
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}
