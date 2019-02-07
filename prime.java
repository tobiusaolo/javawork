import java.util.Scanner;

public class prime{
	//Number whose values we are finding
		
	public static void main(String[] args){
		int number1;
		prime num = new prime();
		Scanner num1 = new Scanner(System.in);
		System.out.println("Please enter the number :");
		number1=num1.nextInt();
		System.out.println("The factors of number :"+number1);
		for(int i=1;i<=number1;i++ ){
			if(number1 % i==0){
				System.out.print(i +" ");
		}
		}

}
}
