package javaexample;

public class palindrome {

	public class Shape {

	}

	public static void main(String[] args) {
	    String a,b="";
	    a="levet";
	    int n=a.length();
	    for(int i=n-1;i>=0;i--)
	    	
	    	b=b+a.charAt(i);
	    
	

	if(a.equalsIgnoreCase(b))
	{
		System.out.println("String is palindrom");
		
	}
	else
	{
		System.out.println("String is not palimdrome");
	}
		    
	
	    
	    	
	}

}
