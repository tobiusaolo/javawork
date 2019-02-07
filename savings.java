import java.util.Scanner;
import java.io.*;
public class savings{
	
	
	
		public class Member{
			String name;
			int memberId;
			int Account_balance;
			public void printdetails(String name,int memberId){
				System.out.println("Client Loan Details ");
				System.out.println("Client ID "+memberId);
				System.out.println("Client Name "+name);
					
				
			}
			}
		public double calc_half(double amt){
			double half=0.5*amt;
			return half;
		}
		public void calculate_si(double loan,int time){
		double p,r,si;
		if(time ==0){
			System.out.println("Time should be greater than zero");
		} else if(time <=5){
			si=50000;
			p=loan*5;
			r=(si/p*time)*100;
			System.out.println("Loan "+ p);
			System.out.println("Period of payment "+ time + " months");
			System.out.println("Intrest Rate "+ r);
			
		}else {
			
			p=loan*2;
			si=100000;
			r=(si/p*time)*100;
			System.out.println("Loan "+ p);
			System.out.println("Period of payment "+ time + " months");
			System.out.println("Intrest Rate "+ r);
		}
		}

	
public static void main(String[] args){
		String name;
			int memberId;
			double Account_balance;
			String choice;
			double request;
			int repayment_period;
		savings client = new savings();
		savings.Member member = client.new Member();
		Scanner data = new Scanner(System.in);
	
		System.out.println("Enter Details here");
		System.out.println("Enter Member id");
		memberId=data.nextInt();
		System.out.println("Enter Member name");
		name=data.next();
		System.out.println("Enter Account balance\n");
		Account_balance=data.nextInt();
		
		member.printdetails(name,memberId);
		
		if(Account_balance >= 500000){
			double loan_half=client.calc_half(Account_balance);
			System.out.println("Enter Y to get a loan and N to cancel");
			choice=data.next();
			if(choice.equals("Y")){
				System.out.println("Enter Amount loan request now");
				request=data.nextDouble();
				if(request >= loan_half){
					System.out.println("Loan Request cannot be greater than half your account balance");
				}
				else {
					System.out.println("Enter Repayment Period");
					repayment_period=data.nextInt();
					client.calculate_si(request,repayment_period);	
						
					}
			}
			else{
				System.out.println("Loan Request canceled\n");
			}	
		}
		else {
			System.out.println("Your balance is low to get a loan");
		}

}	

}
