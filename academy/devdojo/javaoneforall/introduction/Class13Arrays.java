package academy.devdojo.javaoneforall.introduction;

public class Class13Arrays {
    public static void main(String[] args) {
        //you can put the brackets "[]" after the type "int" or after the name "ages" but the
        //convetion is put after the type, and you have to define the size of yout array "3"
        //default values per types
        // byte, short, double, float, long, int = 0
        //char = "\u0000" = " "
        //boolean = false
        //String = null
        String[] names = new String[3];
        names[0] = "wesley";
        names[1] = "levi";
        names[2] = "julie";
        for (String name : names) {
            System.out.println(name);
        }
    }
}