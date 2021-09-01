
//public is an access modifier that allows us to define the scope or how other parts of the code or even some one else's code can access this code.
public class Hello {

//    public is an access modifier
    //need static for java to find our method to run the code we are going to add
    //void indicates the method won't return anything.
    //String[]args parameter
    //curly braces is the block of code statements describing a method.
    public static void main (String[]args){
        //statement to be executed that includes expressions.
        //Text in double quotes is called a literal string.
        //this is a literal
        System.out.println("Hello, Chris");
        //declaration statement
        //expression is a construct equals to a single value
        int myFirstNumber = 37;
        int myFirstProblem = 10 + 5;
        int mySecondProblem = (10 + 5) + (2 *10);
        //sout is a short cut.
        //use variable in the sout to print out the contents of the variable.
        System.out.println(myFirstNumber);
        System.out.println(myFirstProblem);
        System.out.println(mySecondProblem);
    }
}

