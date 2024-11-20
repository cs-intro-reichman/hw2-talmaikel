
public class CalcPi {
	public static void main(String [] args) { 
	    int length = Integer.parseInt(args[0]);
		double sumApprox = 1;
		for(double i = 1; i < length ; i++) {
			if (i%2==1) {
				sumApprox-=(1/(2*i+1));
			} else{
				sumApprox+=(1/(2*i+1));
			}	
		}
		System.out.println("pi according to Java: "+ Math.PI);
		System.out.println("pi, approximated: "+4*sumApprox);
	}
}
