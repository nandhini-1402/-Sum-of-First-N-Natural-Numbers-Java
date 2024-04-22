import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//5->1+2+3+4+5
		int num=sc.nextInt();
	int sum=0;
	for(int i=1;i<=num;i++){
	    sum=sum+i;
	}
	System.out.print(sum);
	}
}
