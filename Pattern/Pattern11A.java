class Pattern11A
{
	
	public static void main(String[] args)
	{
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			
			}
			for(int k=1;k<=i;k++)
			{
				if(i>=2&&k>1)				//line 1
				{
				System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
				
			}
			
			System.out.println();
		}
	}
}

/*
Output
				*
			   *
			  *
		     *
			*
	 


line 1 ,if we remove if else loop then it will print next * also and the pattern will be like

	*
			   **
			  ***
			 ****
			*****
*/
