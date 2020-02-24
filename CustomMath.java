//Arshdeep Sidhu
//104567665
//Assignment 2b
//Class contains trig functions


package COMP4110;

public class CustomMath {

	//Default constructor
	public CustomMath() {}
	
	public static class CustomTrig{
		
		//Can't use Math.PI so using this approximation
		public final static double PI = 3.14159265358979323846;
		
		//Default constructor
		public CustomTrig() {}
		
		public static double sin(double a){

	        //Converts angle so its between -2 PI and 2 PI
	        a = a % (2 * PI);

	        // compute the Taylor series approximation
	        // ith term = x^i / i!
	        double term = 1.0;
	        // sum of first i terms in taylor series      
	        double sum  = 0.0;      

	        for (int i = 1; term != 0.0; i++) {
	            term *= (a / i);
	            if (i % 4 == 1) sum += term;
	            if (i % 4 == 3) sum -= term;
	        }

	        return sum;
	    
	    }
		
		public static double cos(double a){

	        //Converts angle so its between -2 PI and 2 PI
	        a = a % (2 * PI);

	        // compute the Taylor series approximation
	        // ith term = x^i / i!
	        double term = 1.0;
	        // sum of first i terms in taylor series      
	        double sum  = 1.0;      

	        for (int i = 1; term != 0.0; i++) {
	            term *= (a / i);
	            if (i % 4 == 0) sum += term;
	            if (i % 4 == 2) sum -= term;
	        }

	        return sum;
	    
	    }
		
		public static double tan(double a) {
			return 9999.99;
		}
		
		public static double sin_degree(double a){
	        a = a * (PI/180);
	        return sin(a);
	    }
		
		public static double cos_degree(double a){
	        a = a * (PI/180);
	        return cos(a);
	    }
		
		public static double tan_degree(double a) {
			return 9999.99;
		}
		
	}
}
