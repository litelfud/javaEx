//import static java.lang.Math.*;

public class Calculate{
	public static void main(String[] args){
		System.out.println("Calculate...");
		long first = Integer.valueOf(args[0]);  // преобразование строки в нужный тип
		long second = Integer.valueOf(args[1]); 
		long summLong = first + second;
		System.out.println("long SummLong = " + summLong);
		
		long subtractionLong = first - second;
		System.out.println("long subtractionLong = " + subtractionLong);
		
		long multiplicationLong = first * second;
		System.out.println("long multiplicationLong = " + multiplicationLong);
		
		long divisionLong = first / second;
		System.out.println("long divisionLong = " + divisionLong);
		
		double sqrtdouble = Math.sqrt(2.2);
		System.out.println("long sqrtdouble = " + sqrtdouble);
		
		
		double f1 = Double.valueOf(args[0]); 
		double f2 = Double.valueOf(args[1]); 
		double sumd = f1+f2;
		System.out.println("double sumd = " + sumd);
	}
}