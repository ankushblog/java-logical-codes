class Pattern1
{
	public static void main(String[] args)
	{
		for(int i=1;i<5;i++)			//if we take i=0 then it will print one blank line as 2nd for() is false for 0<0 
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

/*

*
**
***
****

*/