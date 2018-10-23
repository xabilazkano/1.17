import java.util.Scanner;
public class Mix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		
		while (flag==0) {
		
		System.out.println("Choose what exercise do you want me to do between 1 and 7 (0 to quit): ");
		System.out.println("1 Given a positive number tells how many even digits has the number");
		System.out.println("2 Given a positive number and a digit tells whether the digit appears in the number or not and in case yes, how many times it does");
		System.out.println("3 Given a positive number it gives us the inverted number");
		System.out.println("4 Given a binary number it gives us its decimal value");
		System.out.println("5 Given a sentence and a letter it gives the number of words of the sentence that begin with that letter");
		System.out.println("6 Given a sentence and a letter it gives the number of words of the sentence that end with that letter");
		System.out.println("7 Given a word it tells the user whether the word is a palindrome or it is not");
		int a = sc.nextInt();
		
		switch (a) {
		
		case 0:
			System.out.println("Good bye!");
			flag=1;
			break;
		case 1: 
			
			System.out.println("Enter a positive number and I will tell you how many even numbers has:");
			
			String b = sc.next();
			
			int number = Integer.parseInt(b);
			if (number>0) {
			int c = b.length();
			char[] dgt = b.toCharArray();
			int counter=0;
			for (int i=0;i<c;i++) {
				if (dgt[i]%2==0) {
					counter++;
				}
			}
			
				System.out.println("The number " + b + " has "+counter+" even numbers");
				System.out.println();	
			
			}
			break;
			
		case 2:
		
			System.out.println("Enter a positive number:");
			
			String ñ = sc.next(); //we receive a string for using length function
			int j = Integer.parseInt(ñ); //converts a string into an integer
			
			System.out.println("Enter a digit");
			char d = sc.next().charAt(0); //we receive a digit	
			
			int c = ñ.length(); //we save length of the string
			
			char[] arraia = ñ.toCharArray(); //we create an array with the given number
			
			int counter=0;
			if (j>0 && d>0) { //it verifies that the number and the digit are positive (the ASCII value of the chars)
			for (int i=0;i<c;i++) { // it goes on from cell to cell
				
			if (arraia[i]==d) { //if both chars are the same it sums 1 to the counter
				counter++;
			}
			
			}
			System.out.println("The digit is repeated " + counter + " times.");
			}
			
			else {
				System.out.println("One of the arguments is not a positive number");
			}
			break;
		case 3:
			System.out.println("Give me a number and I will give you its inverted one");
			String case3 = sc.next(); //we receive a string for using length function
		    int luz = case3.length(); //we save the length of the string
		    char[] ariketa = case3.toCharArray(); //we create a char array with the number
		    
			System.out.println("Your number is " + case3); 
			System.out.print("The inverted number is ");
		    
		    for (int i=luz-1;i>-1;i--) { //it creates a loop starting from the last cell of the array and finishing in the first one
		    	System.out.print(ariketa[i]); //it prints the chars in the same line
		    	
		    }
		    System.out.println();
		    break;
		
		case 4:  
			System.out.println("Enter a binary value and I will return you the decimal");
			String bi = sc.next();
			int decimal = Integer.parseInt(bi,2);
			System.out.println("Your binary number was "+bi+" and the decimal is "+decimal);
			break;
		    
		case 5:
		    
			System.out.println("Give me a sentence");
			String q = sc.next();
			q += sc.nextLine(); 
			System.out.println("Give me a char");
			char fi = sc.next().charAt(0);
			
			String[] al = q.split(" ");
			int size = al.length;
			int count=0;
			
			for (int i=0;i<size;i++) {
				
				char first = al[i].charAt(0);
				if (first==fi) {
					count++;
				}
				
			}
			
		    System.out.println(count + " words of your sentence start with "+ fi);
		   // System.out.println(sc.nextLine()); 
			System.out.println();
			break;
		    
			
		case 6:
			System.out.println("Give me a sentence");
			String u = sc.next();
			u += sc.nextLine(); 
			System.out.println("Give me a char");
			char l= sc.next().charAt(0);
			
			String[] hitz = u.split(" ");
			int luzera = hitz.length;
			int kont=0;
			
			for (int i=0;i<luzera;i++) {
				
				int lu = hitz[i].length();
				
				char last = hitz[i].charAt(lu-1);
				if (last==l) {
					kont++;
				}
				
			}
			
		    System.out.println(kont + " words of your sentence finish with "+ l);
		   // System.out.println(sc.nextLine()); 
			System.out.println();
			break;
		   
		case 7:
			System.out.println("Give me a word");
			String hitza = sc.next();
			char[] letrak = hitza.toCharArray();
			int luze = hitza.length();
			String alderantziz="";
			
			for (int i=luze-1;i>-1;i--) {
				alderantziz=alderantziz+letrak[i];
			}
			
			if (hitza.equals(alderantziz)){
				System.out.println("The word is a palindrome");
			}
			else {
				System.out.println("The word is not a palindrome");
			}
		break;
		}
		}

	}

}