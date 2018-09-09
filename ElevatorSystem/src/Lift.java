import java.util.Scanner;
public class Lift {
	static Scanner s=new Scanner(System.in);
	static int[] lif=new int[11];
	public static void main(String[] args) {
		System.out.println("Press the floor button(floor your in):");
		int f=s.nextInt();
		System.out.println("Wait for Lift....Open Lift Door");
		int t=0;lif[f]=1;int h=0;
		while(t==0 && f>=0 && f<11)
		{
			System.out.println("Current Flow:");
			for(int i=0;i<11;i++)
				if(lif[i]==1)
					{	System.out.println((i));h=i;	}
			System.out.println("Enter Floor you Wanna Go:");
			int go=s.nextInt();
			if(go<=10 && go>=0)
			{
				if(go>h)
				{	System.out.println("Lift Going up.....");
					for(int i=h;i<=go;i++)
						System.out.println(i);
				}
				else if(go==h)
					System.out.println("Lift On same floor");
				else
					{	System.out.println("Lift Going down....");
					for(int i=h;i>=go;i--)
						System.out.println(i);
					}
				for(int i=0;i<=10;i++)
				lif[i]=0;
			lif[go]=1;t=1;
			System.out.println("Floor Reached");
			}
			else
				System.out.println("Invalid floor");
		}
	}
}
