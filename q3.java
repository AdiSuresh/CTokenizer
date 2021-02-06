import java.util.Scanner;

class q3{
	public static void main(String[] args){
		//Scanner sc = new Scanner(System.in);
		String s = new Scanner(System.in).nextLine();
	    if(s.matches("[a-zA-Z_][\\w]*")){
			System.out.println("Identifier");
	    }
	    else if(s.matches("\\d+")){
			System.out.println("Number");
	    }
	    else{
			System.out.println("Not a valid lexeme");
		}
	}
}
