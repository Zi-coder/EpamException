package Driver;

import Exceptions.Driver.CharInputException;
import Exceptions.Driver.IntegerInputException;
import org.apache.logging.log4j.LogManager;

import java.util.Scanner;

public class Driver {
    public static Scanner scan ;
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        try{
            System.out.println("\nEnter integer for Normal Execution and Character for Getting IntegerInputException");
            char n =  scan.next().charAt(0);
            if(!Character.isDigit(n)){
                throw new IntegerInputException("");
            }
        }catch (IntegerInputException e){
            System.out.println(e);
        }
        System.out.println("Enter Character for normal execution and integer to get Exception");
        try{
            char n = scan.next().charAt(0);
            if(Character.isDigit(n)){
                throw new CharInputException("");
            }
        }catch (CharInputException exp){
            System.out.println(exp);
        }

    }
}
