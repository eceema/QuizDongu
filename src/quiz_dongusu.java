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
		 
		 System.out.println( " Iki sayiyi birbirinden cikariniz.. " );
		 System.out.println( newnumber2 + "-"  + newnumber1 + " = " + "?" );
		 int result1 = sc.nextInt();
		 int real_result1 = newnumber2 - newnumber1;
		
	}
	
	 else if ( number1 > number2 );
	 System.out.println( " Iki sayiyi birbirinden cikariniz.. " );
	 System.out.println( number2 + "-"  + number1 + " = " + "?" );
	 int result2 = sc.nextInt();
	 int real_result2 = number2 - number1 ;
	 
	 
	 
	 
	 int j = 0;
	
	 while (j<5){
	 if ( result != real_result1 || result2 != real_result2 ) {
		 System.out.println( " Yanlis bildiniz, tekrar deneyiniz.. ");
		  j++;
	 }
	   
	 }
	 
	 else  {
	 System.out.println( " Dogru bildiniz, tebrikler.. ");
	 }

	

	}
}
