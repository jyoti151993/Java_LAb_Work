package com.app.cdac;

public class Custmr {
	
		//tight encapsulation by using private access specifier(private state or data members)
			// instance vars (non static) : meb allocated on the heap , upon obj creation
	    private String  name, mail;
	    private int age;
	    private double credit;

		public void setName(String newname)
		{
			this.name= newname;
		}
		  public String getName()
		{
			return name;
		}
			
	    public void setEmail(String newmail)
		{  
		  this.mail= newmail;
		}
	    public String getEmail()
		{ 
		  return mail;
		}
		
		public void setAge(int newage)
		{ 

	               age=newage;
	            		   
		}
		 public int getAge()
		{
			
			return  age;
		}
		
		 public void setCredit(double newcredit)
		{
		
		   this.credit = newcredit;
			
	         }
		 
		public double getCredit()
		   {
				return credit;
		    }
		
			
	  
	}
			
