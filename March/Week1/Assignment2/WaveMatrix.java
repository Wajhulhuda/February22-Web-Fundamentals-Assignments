package two_d_matrix_assignment;

public class WaveMatrix {
	public static void wavePrint(int a[][]){
		System.out.println();
		int row=a.length;
		int col=a[0].length;
		for(int i=0;i<col;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<row;j++)
				{
					System.out.print(a[j][i]+" ");
				}
			}
			else
			{
				for(int j=row-1;j>=0;j--)
				{
					System.out.print(a[j][i]+" ");
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3,4},
						{11,12,13,14},
						{21,22,23,24}};
		wavePrint(arr);
		
	}

}
