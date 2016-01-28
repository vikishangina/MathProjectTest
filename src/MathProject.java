
public class MathProject {
	private static double NEG_INFINITE	= 10000000;
	private static double POS_INFINITE	= 10000000;
	
	public static double MINIMUM_RADIUS	= 0;
	public static double MAXIMUM_RADIUS	= POS_INFINITE;
	public static double MINIMUM_DEGREE	= 0;
	public static double MAXIMUM_DEGREE	= 360;
	public static double MINIMUM_HEIGHT	= 0;
	public static double MAXIMUM_HEIGHT	= POS_INFINITE;
	
	private boolean isValidRadius(double r)
	{
		if(r < MINIMUM_RADIUS || r > MAXIMUM_RADIUS)
		{
			return false;
		}
		return true;
	}
	
	private boolean isValidDegree(double r)
	{
		if(r < MINIMUM_DEGREE || r > MAXIMUM_DEGREE)
		{
			return false;
		}
		return true;
	}
	
	private boolean isValidHeight(double r) throws Exception
	{
		if(r < MINIMUM_HEIGHT || r > MAXIMUM_HEIGHT)
		{
			System.out.println("Invalid height");
			throw new Exception();
			//return false;
		}
		return true;
	}
	
	public static void main(String[] args) {

	}

}
