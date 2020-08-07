public class HeartRate
{
	
			private String firstname;
			private String lastname;
			private int day;
			private int year;
			private int month;

			//constructor
			public HeartRate(String firstname , String lastname , String d , String y , String m)
			{
				setFirst(firstname);
				setLast(lastname);
				setDay(d);
				setYear(y);
				setMonth(m);
			}

			 public void setFirst(String firstname)
			 {
			 	this.firstname = firstname;
			 }

			 public void setMonth(String lastname)
			 {
			 	this.lastname = lastname;
			 }

			 public void setDay(int day)
			 {
			 	this.day= day;
			 }

			 public void setYear(int year)
			 {
			 	this.year = year;
			 }

			 public void setLast(int last)
			 {
			 	this.last = last;
			 }

			 //getter
			 public String getFirst()
			 {
			 	return firstname;
			 }

			 public String getLast()
			 {
			 	return lastname;
			 }

			 public int getYear()
			 {
			 	return year;
			 }

			 public int getMonth()
			 {
			 	return month;
			 }

			 public int getDay()
			 {
			 	return day;
			 }

			     public int getBirthDate()
			     {
        			return day/month/year;
   				 }
 


			 public int getAge()
			 {
        		return 2020 - year;
        	}

			  public int MaximumHeartRate()
			 {
        		return 220 - getAge();
    		 }

    		 public void targetHeartRate()
    		 {
    			System.out.print("Target Heart Rate "+ MaximumHeartRate() * 0.5 
    			+ " to "+ MaximumHeartRate() * 0.85);

    		}

    		public void print()
    		{
    			System.out.println("Your First Name is : " + firstname);
    			System.out.println("Your Last Name is : " + lastname);
    			System.out.println("Your Day is " + day);
    			System.out.println("Your Month is : " + month);
    			System.out.println("Your Year is : " + year);
    			System.out.println("Your Target Heart Rate is : " + targetHeartRate());
    			System.out.println("Your MaximumHeartRate is : " + MaximumHeartRate());
    			System.out.println("Your Age  is (in year) " + getAge(getAge));
    		}


	}
