import java.util.Scanner;

public class Calculator_1 {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		for (int i=0;;)
		{
			System.out.println("\nEnter Your Choice\n1==> Use Calculator\n2==> Exit");
			int ch1=Sc.nextInt();
			if (ch1==1)
			{
				System.out.println("\nEnter function to perform\n\n1==> Addition '+'\n2==> Subtraction '-'\n3==> Multiplication '*'\n4==> Division '/'");
				int ch2=Sc.nextInt();
				switch (ch2)
				{
				case 1:
					System.out.println("\nEnter Two Numbers to find the sum ");
					double a1=Sc.nextDouble();
					double b1=Sc.nextDouble();
					System.out.println("\nThe Sum is "+((double)(a1+b1)));
					break;
				case 2:
					System.out.println("\nEnter Two Numbers to find the difference ");
					double a2=Sc.nextDouble();
					double b2=Sc.nextDouble();
					System.out.println("\nThe Difference is "+((double)(a2-b2)));
					break;
				case 3:
					System.out.println("\nEnter Two Numbers to find the product ");
					double a3=Sc.nextDouble();
					double b3=Sc.nextDouble();
					System.out.println("\nThe product is "+((double)(a3*b3)));
					break;
				case 4:
					System.out.println("\nEnter Two Numbers to find the quotient and the remainder ");
					double a4=Sc.nextDouble();
					double b4=Sc.nextDouble();
					System.out.println("The quotient is "+((double)(a4/b4))+" and the remainder is "+((double)(a4%b4)));
					break;
				default:
					System.out.println("Invalid Choice!!\nPlease run the program again");
					break;
				}
			}
			else if (ch1==2)
			{
				System.out.println("\nThank You for Using the Program!!");
				break;
			}
			else
			{
				System.out.println("Invalid Choice!!\nPlease Enter a Valid Option");
			}
		}
				
	}
}