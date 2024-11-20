
public class Collatz {
	public static void main(String args[]) {

	int num = Integer.parseInt(args[0]);
	String mode = args[1];
	if(mode.equals("v")){
		for (int i = 1; i <= num; i++) {
			int j = i;
			System.out.print(i+" ");
			int counter = 1;
			do {
				if(j%2 == 1){
					j= j * 3 + 1;
					System.out.print(j+" ");
				} else {
					j = j / 2;
					System.out.print(j+" ");
				}
				counter++;
			} while(j != 1 );
			System.out.println("("+counter+")");
		}
		System.out.println("Every one of the first "+ num+ " hailstone sequences reached 1.");
	}
	if(mode.equals("c")){
		for (int i = 1; i <= num; i++) {
			int j = i;
			int counter = 1;
			do {
				if(j%2 == 1){
					j= j * 3 + 1;
				
				} else {
					j = j / 2;
					
				}
				counter++;
			} while(j != 1 );
			
		}
		System.out.println("Every one of the first "+ num+ " hailstone sequences reached 1.");
	}
	}
}
