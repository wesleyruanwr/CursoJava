package academy.devdojo.javaoneforall.introduction;

public class Class10LoopExercice {
    public static void main(String[] args) {
        for(int n=0; n <=100000; ++n){
            System.out.println(n);
        }
        int n = 0;
        while(n <= 100000){
            System.out.println(n);
            ++n;
        }
        do{
            System.out.println(n);
            ++n;
        }
        while(n <=10000);


    }
}
