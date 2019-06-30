import java.util.Scanner;
import java.lang.Math;
/*
 * 
 */



class MyCalculator {
	   
	    long power(int base, int power) throws Exception
	    {
	        if(base<0 || power< 0)
	        {
	            throw new Exception("base or power should not be negative."); //throwing an Exception if either base or power is negative  
	        }
	        else if( base==0 && power==0)
	        {
	            throw new Exception("base and power should not be zero.");//throwing an Exception if both base or power are 0 
	        }
	        else{
	           
	        return (long)Math.pow(base,power); //calculating base^power with Math.pow predefined function and coverting it into long because return type of Math.power is double 
	        }
	    }
	    
	}

	public class  ExceptionHandling{
	    public static final MyCalculator my_calculator = new MyCalculator();//creating object for class MyCalculator
	    public static final Scanner in = new Scanner(System.in);
	    
	    public static void main(String[] args) 
	    {
	        while (in .hasNextInt()) 
	        {
	            int base = in .nextInt();	//reading base variable
	            int power = in .nextInt();	//reading power variable
	            try 
	            {
	                System.out.println(my_calculator.power(base, power));//calling power function with MyCalculator object
	            } 
	            catch (Exception e) 
	            {
	                System.out.println(e);//printing exception
	            }
	        }
	    }
	}


