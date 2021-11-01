import java.util.Scanner;
class StrongNumber{
public void strongNum(int a){
	int num=a;
	long fact=1;
	int sum=0;
	for (int i=num; i>=1; i--){
	fact*=i;
	sum+=i;}
	System.out.println(fact+ " Given Number factorial" );
	if(sum==fact){
	System.out.println("Given number is Strong Number Because its factors and it's factors addition are Equal;"); }
	if(sum!=fact){
	System.out.println("it is not Strong Number");
		}
	}
	public static void main(String args[]){
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the Number For Strong Number");
	int a=input.nextInt();
	StrongNumber find= new StrongNumber();
	find.strongNum(7);
	
	}
}