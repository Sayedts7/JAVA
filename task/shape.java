package task;


class tri{  
	String s="parent";
	 
} 
class shape extends tri{  
	String c="child";
	public static void main(String args[]){
	
		shape p=new shape();  
		System.out.println("this is "+p.s); 
		System.out.println("This is "+p.c);  
		}
	}
