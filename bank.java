import java.io.*;
class Account
{
int acc_no;String acc_name;
double balance;
	Account(int a,String n,double b)
	{
	  acc_no=a;
	  acc_name=n;
	  balance=b;

	}
    
    void display()
    {
      System.out.println("Account number:---"+acc_no);
       System.out.println("Account name:--"+acc_name);
        System.out.println("Account balance:--"+balance);
    
    }
}

class Saving extends Account
{
   double Saving_bal; 
      double  amt;
Saving(int a,String n,double b,double am)
	{
	  super(a,n,b);
	  amt=am;
	  Saving_bal=amt+balance;
	   
	}
	 void display()
    {
       super.display();
    System.out.println("final balance:--"+Saving_bal);

    }
}

class Fixed_deposit extends Account
{
  
      double fd_bal;double fd_amt;int year;
Fixed_deposit(int a,String n,double b,double am,int y)
	{
	  super(a,n,b);
	  fd_amt=am;
	  year=y;
	  fd_bal=(fd_amt*y)+balance;
	   
	}
	 void display()
    {
       super.display();
    System.out.println("fiexd_deposit balance:--"+fd_bal);

    }
}

class bank
{
public static void main(String args[]) throws IOException 
{
int no;    double bal;
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Enter your acc_NO,name,initial balance\n:");
  no=Integer.parseInt(br.readLine());
 String name=br.readLine();
 bal=Double.parseDouble(br.readLine());
 
 System.out.println("Enter 1 for saving & 2 for Fixed deposite");
 int choice=Integer.parseInt(br.readLine());
 switch(choice)
 {
 	case 1:
            System.out.println("Enter amount to deposite");	
             double am=Double.parseDouble(br.readLine());
             Saving s1=new Saving(no,name,bal,am);
             s1.display();
             break;
             
         case 2:
             System.out.println("Enter amount to deposite");	
             double fd_am=Double.parseDouble(br.readLine());
             System.out.println("Enter NO of year");
             int year=Integer.parseInt(br.readLine());
           Fixed_deposit  s2=new Fixed_deposit(no,name,bal,fd_am,year);
             s2.display();
 		    break;
 
 }

} 

}
/*
output:====
student@complab1-1:~/Desktop/b10$ javac bank.java
student@complab1-1:~/Desktop/b10$ java bank
Enter your acc_NO,name,initial balance
:
123456789
vaibhav
1000 
Enter 1 for saving & 2 for Fixed deposite
1
Enter amount to deposite
500
Account number:---123456789
Account name:--vaibhav
Account balance:--1000.0
final balance:--1500.0
student@complab1-1:~/Desktop/b10$ javac bank.java
student@complab1-1:~/Desktop/b10$ java bank
Enter your acc_NO,name,initial balance
:
123456789
vaibhav
1000
Enter 1 for saving & 2 for Fixed deposite
2
Enter amount to deposite
500
Enter NO of year
2
Account number:---123456789
Account name:--vaibhav
Account balance:--1000.0
fiexd_deposit balance:--2000.0
student@complab1-1:~/Desktop/b10$ 

*/
