package binary_search_assignment_feb15;

public class IntersectionOfTwoArrays {
	 static int i,j,k,c=0,w;
	 static void intersection(int x[],int y[])
	    {
	        int []arrResult=new int[x.length+y.length];
	        for(int i=0;i <(x.length);i++)
	        {
	            for(int j=0;j < y.length;j++)
	            {
	                if(x[i]==y[j])
	                {
	                	arrResult[c]=x[i];
	                    
	                    c++;
	                }
	                
	                else
	                continue;
	                
	            }
	        }
	        System.out.println("Intersection of two  array is " +"  ");
	        for(k=0;k < c;k++)
	        {
	            System.out.print(arrResult[k]+" ");
	        }
	        System.out.println("            ");
	    }	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    	 int[] arr1= {2,5,3,7};
	         
	         int[] arr2={5,2,9,0,1};
	        
	         intersection(arr1,arr2);

	}

}
