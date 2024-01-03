package barul;

public class Sticla implements Bautura {
	private String tip;
	
	public Sticla(String tip)
	{
		this.tip=tip;
	}
	public void bea() 
	{
		System.out.println("A bea din sticla de "+ tip);
	}

}
