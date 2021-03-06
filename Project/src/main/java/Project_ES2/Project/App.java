package Project_ES2.Project;

public class App 
{
	
	/**
	 *This method returns max number  between 'a' and 'b'
	 * @param a
	 * @param b
	 * @return
	 */
	
	public int max(int a, int b) {
		if(a > b)
			return a;
		return b;
	}
	
	/**
	 *This method returns min number  between 'a' and 'b'
	 * @param a
	 * @param b
	 * @return
	 */
	public int min(int a, int b) {
		if(a > b)
			return b;
		return a;
	}
	
	/**
	 * This method returns the average number between 'a' and 'b'
	 * @param a
	 * @param b
	 * @return
	 */
	
	public double average(int a, int b) {
		return (a+b) / 2.0;
	}

	/**
	 * Hello world!
	 * main
	 *
	 */
    public static void main( String[] args )
    {
    	App p = new App();
        System.out.println( "Hello World!" );
        System.out.println(p.max(2, 4));
        System.out.println(p.average(2, 4));
    }
}
