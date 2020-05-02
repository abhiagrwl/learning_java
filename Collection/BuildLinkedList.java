import java.util.*;  


class BuildLinkedList
{  
	public static void main(String args[])
	{  
		List<String> alist=new LinkedList<String>();//Creating arraylist    
		alist.add("Ravi");//Adding object in arraylist    
		alist.add("Vijay");    
		alist.add("Ravi");    
		alist.add("Ajay");    
		System.out.println(alist);  
		alist.set(0,"Abhi");    
		//Invoking arraylist object   
		System.out.println(alist);  
	  }  
 }  
