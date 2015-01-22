import java.util.ArrayList;
import java.util.Iterator;


public class coll1 {

	  int rollno;  
	  String name;  
	  int age;  
	  coll1(int rollno,String name,int age){  
	   this.rollno=rollno;  
	   this.name=name;  
	   this.age=age;  
	  }  
	
	public static void main(String[] args) {
		
		  coll1 s1=new coll1(101,"Sonoo",23);  
		  coll1 s2=new coll1(102,"Ravi",21);  
		  coll1 s3=new coll1(103,"Hanumat",25);  
		      
		  ArrayList<coll1> al=new ArrayList<coll1>();//creating arraylist  
		  al.add(s1);//adding coll1 class object  
		  al.add(s2);  
		  al.add(s3);  
		  
		  Iterator it1 = al.iterator();
		  while (it1.hasNext()){
			  coll1 c1= (coll1)it1.next();
			  System.out.println(c1.age + c1.name + c1.rollno);
		  }
		 
		    
		 }  
		}  