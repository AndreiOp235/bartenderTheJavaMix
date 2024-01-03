package barul;

public class bartenderTheJavaMix {

    public static void main(String[] args) {
    	System.out.println("o oferta");
        
        System.out.println("part unos");
        Student student = new Student();
        //nimic
        student.beaBautura(null);

        // bautura din pahar, practic cazul de baza
        Bautura pahar = new Pahar("bere");
        student.beaBautura(pahar);

        // Bearea din doza de bere (clasa adaptor)
        Bautura dozaDeBere = new AdaptorDoza("tip2");
        student.beaBautura(dozaDeBere);

        // Bearea din sticla de bere (obiect adaptor)
        Bautura sticlaDeBere = new AdaptorSticla(new SticlaDeBere("tip3"));
        student.beaBautura(sticlaDeBere);
        
		/*
		 * //part dos wiki 
		 * Android android = new Android(); 
		 * Iphone iPhone = new Iphone();
		 * 
		 * System.out.println("Recharging android with MicroUsb");
		 * rechargeMicroUsbPhone(android);
		 * 
		 * System.out.println("Recharging iPhone with Lightning");
		 * rechargeLightningPhone(iPhone);
		 * 
		 * System.out.println("Recharging iPhone with MicroUsb");
		 * rechargeMicroUsbPhone(new LightningToMicroUsbAdapter (iPhone));
		 */
    }
    
	/*
	 * static void rechargeMicroUsbPhone(IMicroUsbPhone phone) {
	 * phone.useMicroUsb(); phone.recharge(); }
	 * 
	 * static void rechargeLightningPhone(ILightningPhone phone) {
	 * phone.useLightning(); phone.recharge(); }
	 */

}

interface ILightningPhone {
    void recharge();
    void useLightning();
}

interface IMicroUsbPhone {
    void recharge();
    void useMicroUsb();
}

class Iphone implements ILightningPhone {
    private boolean connector;

    @Override
    public void useLightning() {
        connector = true;
        System.out.println("Lightning connected");
    }

    @Override
    public void recharge() {
        if (connector) {
            System.out.println("Recharge started");
            System.out.println("Recharge finished");
        } else {
            System.out.println("Connect Lightning first");
        }
    }
}

class Android implements IMicroUsbPhone {
    private boolean connector;

    @Override
    public void useMicroUsb() {
        connector = true;
        System.out.println("MicroUsb connected");
    }

    @Override
    public void recharge() {
        if (connector) {
            System.out.println("Recharge started");
            System.out.println("Recharge finished");
        } else {
            System.out.println("Connect MicroUsb first");
        }
    }
}
/* exposing the target interface while wrapping source object */
class LightningToMicroUsbAdapter implements IMicroUsbPhone {
    private final ILightningPhone lightningPhone;

    public LightningToMicroUsbAdapter(ILightningPhone lightningPhone) {
        this.lightningPhone = lightningPhone;
    }

    @Override
    public void useMicroUsb() {
        System.out.println("MicroUsb connected");
        lightningPhone.useLightning();
    }

    @Override
    public void recharge() {
        lightningPhone.recharge();
    }
}





//Adaptor de tip clasă pentru doza
class AdaptorDoza extends Pahar {
 public AdaptorDoza(String tip) {
     super(tip);
 }

 @Override
 public void bea() {
     desfaceDoza();
     super.bea();
 }

 private void desfaceDoza() {
     System.out.println("Deschide doza pentru a deveni echivalentul unui pahar");
 }
}

//Clasa pentru sticla de bere
class SticlaDeBere implements Bautura {
 private String tip;

 public SticlaDeBere(String tip) {
     this.tip = tip;
 }

 @Override
 public void bea() {
     System.out.println("A bea din sticla de " + tip);
 }
}

//Adaptor de tip obiect pentru sticla
class AdaptorSticla implements Bautura {
 private SticlaDeBere sticlaDeBere;

 public AdaptorSticla(SticlaDeBere sticlaDeBere) {
     this.sticlaDeBere = sticlaDeBere;
 }

 @Override
 public void bea() {
     desfaceSticla();
     sticlaDeBere.bea();
 }

 private void desfaceSticla() {
     System.out.println("Deschide sticla cu un desfacător");
 }
}

//Clasa Student
class Student {
	Student()
	{
		System.out.println("o oferta !"); //welcome message in "consola"
	}
 public void beaBautura(Bautura bautura) {
	 if(bautura!=null)
		 bautura.bea();
	 else
		 System.out.println("studentul nu bea nimic");
 }
}
