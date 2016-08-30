import java.util.Scanner;

public class NewClass {

	public static void main(String[] args) 
	{
		Scanner S=new Scanner(System.in);
		int c,r,x;

		System.out.print("Enter Size of Hollow Diamond: ");
		x=S.nextInt() ;

		if(x%2==0)
			x++;


			for (r=1;r<=(x/2)+1;r++) //upper triangle
			{

				for (c=1;c<=x-r;c++)
				System.out.print(" ");

				for (c=1;c<=(2*r)-1;c++)
				{
				if((c==1)||(c==(2*r)-1))
			    System.out.print("*");
				else
				System.out.print(" ");
				}

				for (c=1;c<=x-r;c++)
				System.out.print(" ");

				System.out.print("\n");

			}

			for (r=x/2;r>=1;r--) //lower triangle
			{
				for (c=1;c<=x-r;c++)
				System.out.print(" ");

				for (c=1;c<=(2*r)-1;c++)
				{
				if((c==1)||(c==(2*r)-1))
				System.out.print("*");
				else
				System.out.print(" ");
					}

				for (c=1;c<=x-r;c++)
				System.out.print(" ");

				System.out.print("\n");
			}

			System.out.print("C h  i   l    l     O      u       t");


	}
}