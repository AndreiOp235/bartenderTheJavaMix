package barul;

public class Doza extends Pahar {
    public Doza(String tip) {
        super(tip);
        setDeschis(false); // Forced to make the object incompatible
    }

    public void bea() {
        desfaceDoza();
        super.bea();
    }

    private void desfaceDoza() {
        setDeschis(true);
        System.out.println("Desface doza pentru a deveni ca un pahar");
    }
}
