package IntermediatePrograms;
// have to add absolute value
public class SquareRoot {

	public static void main(String [] args){
		System.out.println(sqRec (9.0 , 57, .0001));
		System.out.println(sqNonRec(9.0 , 24654564564565.234, .0001));
	}
	// a. aprox  must be > 0
	public static double sqRec(double number, double aprox, double tol){
		number = Math.abs(number);
		if(Math.abs((Math.pow(aprox, 2)) - number) <= tol){
			return aprox;
		}
		else 
		{
			return sqRec(number,(Math.pow(aprox, 2) + number)/(2 * aprox)  ,tol);
		}
	}

	public static double sqNonRec(double number, double aprox, double tol){
		number = Math.abs(number);// abs value
		while (Math.abs((Math.pow(aprox, 2)) - number) > tol){
			aprox = (Math.pow(aprox, 2) + number)/(2 * aprox);
		}
		return aprox;
		
		
	}

}
