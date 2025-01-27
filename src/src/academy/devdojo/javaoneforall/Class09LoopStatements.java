package academy.devdojo.javaoneforall;

//the diferrence between while and do-while is if the conditional, in this case counter be less then 10 be false
//the while block never be executed, and the do-while will be executed in the same way

public class Class09LoopStatements {
    public static void main(String[] args) {
        int counter = 0;
        while(counter <= 10){
            System.out.println(counter); //i can use "++counter" here, but in this way
            counter += 1;               //will cont from 1 and not from 0
            //counter = counter + 1;
        }

// do-while
        do{
            System.out.println("inside do-while " + ++counter);
        }
        while(counter <10);

// the "for" is used when we dont have one index as the counter for example
    for(int i=0; i <= 10; ++i){
        System.out.println("inside the for " + i);
    }


    }

}
