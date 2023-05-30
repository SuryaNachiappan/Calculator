package concept;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE FIRST NUMBER");
int no1=sc.nextInt();
System.out.println("ENTER THE SECOND NUMBER ");
int no2 =sc.nextInt();
System.out.println("SLELECT SYMBOLS(+,-,x,/)");
String sym=sc.next();
int res; int i=20;

switch(sym) {
case"+":res=no1+no2;
System.out.println("The addition is : "+res);break;
case "-":res=no1-no2;System.out.println("The subraction is : "+res);break;
case"x":res=no1*no2;System.out.println("The multiplication  is : "+res);break;
case"/":res=no1/no2;System.out.println("The division is : "+res);break;
default :System.out.println("INVALID SYMBOL DA KURUTTU MUNDA");break;
} 
sc.close();
	} }


