//constructor 

class GLA 
{
	GLA()
	{
		System.out.println("Welcome GLA");

	}

	void bca()
	{
		System.out.println("BCA program..");
	}
	void btech()
	{
		System.out.println("B TEch program ..");
	}
	void bba()
	{
		System.out.println("BBA program ..");
	}

	public static void main(String args[])
	{
		GLA con = new GLA();
		con.bba();
		con.bca();
		con.btech();
	}

}