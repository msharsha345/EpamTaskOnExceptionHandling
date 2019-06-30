import java.util.Scanner;
import java.lang.Math;
	class MyCalculator {
	   
	    long power(int base, int power) throws Exception
	    {
	        if(base<0 || power< 0)
	        {
	            throw new Exception("base or power should not be negative.");
	        }
	        else if( base==0 && power==0)
	        {
	            throw new Exception("base and power should not be zero.");
	        }
	        else{
	           
	        return (long)Math.pow(base,power);
	        }
	    }
	    
	}

	public class  ExceptionHandling{
	    public static final MyCalculator my_calculator = new MyCalculator();
	    public static final Scanner in = new Scanner(System.in);
	    
	    public static void main(String[] args) {
	        while (in .hasNextInt()) {
	            int n = in .nextInt();
	            int p = in .nextInt();
	            
	            try {
	                System.out.println(my_calculator.power(n, p));
	            } catch (Exception e) {
	                System.out.println(e);
	            }
	        }
	    }
	}


