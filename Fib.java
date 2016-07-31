package IntermediatePrograms;

public class Fib {
	
	public static void main(String [] args){
		
		
		for(int i = 0; i < 45; i++){
		System.out.println(fibRec(i));		
		
		}
		System.out.println();
		for(int i = 0; i < 45; i++){
		System.out.println(fibNonRec(i));		
		}
	}
	
	public static int fibRec(int fib){
		
		//fib(n-2) + fib(n-1)
		
		if(fib < 1){
			return 0;
		}
		if(fib == 1){
			return 1;
		}		
		return fibRec(fib-2) + fibRec(fib-1); 		
	}
	
	public static int fibNonRec(int n){
		int f = 0;
		int b = 1;
		int v = 1;
		
		while(n != 0){
			f = b;
			b = v;
			v = f + b;
			n--;
		}
		return f;
	}
}
