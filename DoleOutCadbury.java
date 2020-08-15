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
		int minlen=5;
		int maxlen=7;
		int minwid=3;
		int maxwid=4;
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