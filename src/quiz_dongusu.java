import java.util.Scanner;

public class quiz_dongusu {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 

		
	 System.out.println( " Sayi giriniz.. ");
	 int number1 = sc.nextInt();
	 
	 System.out.println( " Tekrar bir sayi giriniz.. ");
	 int number2 = sc.nextInt();
	
			
	
	 if ( number1 < number2 ) {
		 System.out.println( " Lutfen 2.sayiyi 1.sayidan buyuk giriniz! ");
		 System.out.println( " Sayi giriniz.. ");
		 
		 int newnumber1 = sc.nextInt();
		 
		 System.out.println( " Tekrar bir sayi giriniz.. ");
		 int newnumber2 = sc.nextInt();
		 
		
	}
	
	
	 System.out.println( " Iki sayiyi birbirinden cikariniz.. " );
	 System.out.println( number2 + "-"  + number1 + " = " + "?" );
	 int result = sc.nextInt();
	 int real_result = number2-number1 
	 
	 
	 int j = 0;
	
	 while (j<5){
	 if ( result != real_result ) {
		 System.out.println( " Yanlis bildiniz, tekrar deneyiniz.. ");
		  j++;
	 }
	   
	 
	 else {
	 System.out.println( " Dogru bildiniz, tebrikler.. ");
	 }

	}

	}
}
