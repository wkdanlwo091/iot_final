package algorithm;

public class Solution {
	
	  public String solution(int n) {
	      String answer = "";
	      if(n <= 3) {
		       if(n % 3 == 1) {
		    	   	answer = Integer.toString(n);
		       }else if(n%3 == 2) {
		    	   answer = Integer.toString(n);
		       }else if(n%3 == 0) {
		    	   answer = Integer.toString(n);
		    	   System.out.println(answer);
		       }
	      }else {
	    	  if(n%3 == 1) {
	    		  while(true) {
	    			  
	    		  }
	    		  answer = Integer.toString(n);
	    	  }else if(n%3 ==2) {
	    		  	
	    	  }else if(n %3 == 0) {
	    		  	
	    	  }
	    	  
	    	  	
	      }
	       answer = "5";
	      System.out.println(answer);
	      return answer;
	  }

	public static void main(String[] args) {
		
		Solution a = new Solution();
		System.out.println(a.solution(3));		
	}

}
