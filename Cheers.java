// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String name = args[0];
            int numOfTimes = Integer.parseInt(args[1]);

            for(int i = 0; i < name.length(); i++){
               char ch = Character.toUpperCase(name.charAt(i));

                if (ch =='A' ||ch == 'E'||ch == 'F'||ch == 'H'||ch == 'I'||ch == 'L'||ch == 'M'||ch == 'N'||ch == 'O'|| ch == 'R'||ch == 'S'||ch == 'X') {
                    System.out.println("Give me an "+ch+": "+ch+"!");
                } else {
                        System.out.println("Give me a "+ch+": "+ch+"!");  
                }
                
            }
            System.out.println("What does that spell?");
                for(int i = 0; i < numOfTimes ; i++) {
                        System.out.println(name.toUpperCase()+"!!!");
                }
        }
}
