
public  class  TestRandom {
	public static void main(String[]  args) {
	
		int N = Integer.parseInt(args[0]);
		int biggerThanHalf = 0;
		int lowerThanHalf = 0;

			for(int i=0 ; i<N ; i++) {
				if(Math.random()>0.5){
					biggerThanHalf++;
				} else {
					lowerThanHalf++;
				}
		}
		if(biggerThanHalf*lowerThanHalf == 0){
			System.out.println("> 0.5: "+biggerThanHalf);
			System.out.println("<= 0.5: "+lowerThanHalf);
		}	else{
			System.out.println("> 0.5: "+biggerThanHalf);
			System.out.println("<= 0.5: "+lowerThanHalf);
			System.out.println("Ratio: "+((double)biggerThanHalf / (double)lowerThanHalf));
		}
	}
}
