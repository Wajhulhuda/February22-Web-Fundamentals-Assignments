package recursion_III_assignment;

public class SortStringAsc {
	 static final int MAX_CHAR = 26;
	 
	   
	    static void sortStringAsc(String str) {
	 
	    
	        int chr[] = new int[MAX_CHAR];
	 
	        for (char x : str.toCharArray()) {
	 
	            
	            chr[x - 'a']++;
	        }
	 
	        for (int i = 0; i < MAX_CHAR; i++) {
	            for (int j = 0; j < chr[i]; j++) {
	                System.out.print((char) (i + 'a'));
	            }
	        }
	    }
	 
	   
	    public static void main(String[] args) {
	    	String str="Wajhulhuda";
	    	str=str.toLowerCase();
	        sortStringAsc(str);
	    }

}
