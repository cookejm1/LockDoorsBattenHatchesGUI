
public class Launcher 
{
	public static void main(String[] args) {
		
		new login().setVisible(true);
	}

	
	
	public static boolean setOS()
	{
		String OS = System.getProperty("os.name");
		if(OS.charAt(0) == 'W' || OS.charAt(0) == 'w')
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}
