import java.util.*;
public class DoleOutCadbury{
	static int childrens(int row,int col)
	{
		int count=0;
		while(row!=0 && col!=0)
		{
			count++;
			if(row>col)
			{
				row=row-col;
			}
			else
			{
				col=col-row;
			}
		}
		return count;
	}
	public static void main(String args[]){
		Scanner s=new scanner(System.in);
		System.out.println("Enter the minlen:");
		int minlen=s.nextInt();
		System.out.println("Enter the maxlen:");
		int maxlen=s.nextInt();
		System.out.println("Enter the minwid:");
		int minwid=s.nextInt();
		System.out.println("Enter the maxwid:");
		int maxwid=s.nextInt();
		int sum=0;
		for(int i=minlen;i<=maxlen;i++)
		{
			for(int j=minwid;j<=maxwid;j++)
			{
				sum=sum+childrens(i,j);
			}
		}
		System.out.println(sum);
	}
}
