//LeetCode Problem: FizzBuzz
//Language: Java 
/*Description: 
Given an integer n, return a string array answer (1-n) where:
"FizzBuzz" if i is divisible by 3 and 5.
"Fizz" if i is divisible by 3.
"Buzz" if i is divisible by 5.
number itself (as a string) otherwise.
*/
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) 
    {
        String [] answer = new String [n]; //initialize return string
        for (int i = 0; i < answer.length; i++) //loop 1 to n inclusive
        {
            int num = i+1;
            //check divisibility by 3 & 5 
            if(num % 3 == 0 && num % 5  == 0){
                answer[i] = "FizzBuzz";
            //check divisibility by 3
            } else if (num % 3 == 0){
                answer[i] = "Fizz";
            //check divisibility by 5
            } else if (num % 5 == 0){
                answer[i] = "Buzz";
            //default if no condition is met
            } else {
                answer[i] = String.valueOf(i+1);
            }
        } 
        return Arrays.asList(answer); // Correct return type 
    } 

    //For testing 
    public static void main(String[] args){
        System.out.println(fizzbuzz(15));
    }
}