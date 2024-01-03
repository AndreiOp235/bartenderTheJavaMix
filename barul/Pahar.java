package barul;

public class Pahar implements Bautura {
	private String tip;
	
	public Pahar(String tip)
	{
		this.tip=tip;
	}
	public void bea() {
		System.out.println("A bea din paharul de " + tip);
	}

}
