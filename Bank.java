import java.util.Scanner;
public class bank {
String name;
String bankaccount;
int amount;
int withdrawamt;
public void getdata() {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the name of the account holder: ");
name = sc.nextLine();
System.out.print("Enter the type of bank account he/she holds: ");
bankaccount = sc.nextLine();
System.out.print("Enter the total amount initially present in the bank account: ");
amount= sc.nextInt();
}
public void deposit() {
Scanner sc = new Scanner(System.in);
int newamount;
System.out.print("Enter the new amount deposited in the bank account: " );
newamount=sc.nextInt();
System.out.print(" the new amount present in the bank account is: " +(amount+newamount));
amount=amount+newamount;
}
public void withdraw() {
if(amount>=500)
{
Scanner sc=new Scanner(System.in);
System.out.println("\n enter the amount to withdraw") ;
withdrawamt= sc.nextInt();
System.out.println("balance left in the account is" +(amount-withdrawamt)) ;
}}
public void display()
{
System.out.println("After transaction.....................");
System.out.println("Name:"+name);
System.out.println("Balance amount:"+(amount-withdrawamt));
}
public static void main(String args[]) {
int n,i;
System.out.println("enter the number of accountholders");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
bank holders[]=new bank[100];
for(i=0;i<n;i++) {
System.out.println("enter the details of bankholder " + (i+1));
holders[i]=new bank();
holders[i].getdata();
holders[i].deposit();
holders[i].withdraw();
holders[i].display();
}
}}


