package barul;

//adaptor de tip clasa pentru doza
//! nu strica putin documentare, imi cam da cu virgula 
public class Doza extends Pahar
{
	public Doza(String tip)
	{
		super(tip);
	}
	
	public void bea()
	{
		desfaceDoza();
		super.bea();
	}
	
	private void desfaceDoza()
	{
		System.out.println("Desface doza pentru a deveni ca un pahar");
	}
}
