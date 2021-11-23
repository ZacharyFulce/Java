public class Users
	{	protected String userName;
		protected String password;
		protected static int userCount;
		protected boolean loggedIn;

		public void Users (String userName, String password)
		{  this.userName = userName;
		   this.password = password;
		   userCount++;
		}
		public boolean verifyUserID (String enteredUserID, String enteredPassword)
		{	boolean validUser = false;
			validUser = (enteredUserID.equals(userName));
			if (validUser == true)
	            		validUser = (enteredPassword.equals(password));
	       		if (validUser)
	           		loggedIn = true;
	        		return validUser;
		}
		public int getUserCount()
		{    return userCount;
		}
	 	public String getuserName()
	 	{    return userName;
		}
		public boolean isUserLoggedIn()
		{
			return loggedIn;
		}
	}


