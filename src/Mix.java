import java.util.Scanner;
public class Mix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		
		while (flag==0) {
		
		System.out.println("Choose what exercise do you want me to do between 1 and 7 (0 to quit): ");
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
				
			
				
				
			
			}
			break;
			
		case 2:
		
			System.out.println("Enter a positive number:");
			
			String ñ = sc.next();
			int j = Integer.parseInt(ñ);
			
			System.out.println("Enter a digit");
			String d = sc.next();
			int y = Integer.parseInt(d);
		
			
			int c = ñ.length();
			int f = d.length();
			char[] arraia = ñ.toCharArray();
			char digit = d.charAt(0);
			
			int counter=0;
			if (j>0 && f==1 && y>0) {
			for (int i=0;i<c;i++) {
				
				//System.out.println(d);
		
			if (arraia[i]==digit) {
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
			String case3 = sc.next();
		    int luz = case3.length();
		    char[] ariketa = case3.toCharArray();
		    
			System.out.println("your number is " + case3);
			System.out.println("The inverted number is");
		    
		    for (int i=luz-1;i>-1;i--) {
		    	System.out.print(ariketa[i]);
		    	
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
