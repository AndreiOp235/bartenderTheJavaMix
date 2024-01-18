package barul;

import clienti.Student;

public class bartenderTheJavaMix {

	public static void main(String[] args) {
		System.out.println("Bun venit la 1301Bar");
		// title screen
		// sub numele noastre si 3 sec sleep

		Student student = new Student(); // initializez clientul

		student.beaBautura(null);

		// bautura din pahar, practic cazul de baza
		Bautura pahar = new Pahar("bere");
		student.beaBautura(pahar);

		// Berea din doza de bere (clasa adaptor)
		Bautura doza = new Doza("Doza de bere"); 
		student.beaBautura(doza);

		// Bearea din sticla de bere (obiect adaptor)
		Bautura sticla = new AdaptorSticla(new Sticla("bere"));
		student.beaBautura(sticla); //succes
		student.beaBautura(new Sticla("bere")); //de asta folosim adaptorul, practic nu se poate bea din sticla fara el
		
		//a se ignora ce codul ce urmeaza

		/*
		 * //part dos wiki Android android = new Android(); Iphone iPhone = new
		 * Iphone();
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
/*
 * interface ILightningPhone { void recharge();
 * 
 * void useLightning(); }
 * 
 * interface IMicroUsbPhone { void recharge();
 * 
 * void useMicroUsb(); }
 * 
 * class Iphone implements ILightningPhone { private boolean connector;
 * 
 * @Override public void useLightning() { connector = true;
 * System.out.println("Lightning connected"); }
 * 
 * @Override public void recharge() { if (connector) {
 * System.out.println("Recharge started");
 * System.out.println("Recharge finished"); } else {
 * System.out.println("Connect Lightning first"); } } }
 */

/*
 * class Android implements IMicroUsbPhone { private boolean connector;
 * 
 * @Override public void useMicroUsb() { connector = true;
 * System.out.println("MicroUsb connected"); }
 * 
 * @Override public void recharge() { if (connector) {
 * System.out.println("Recharge started");
 * System.out.println("Recharge finished"); } else {
 * System.out.println("Connect MicroUsb first"); } } } exposing the target
 * interface while wrapping source object class LightningToMicroUsbAdapter
 * implements IMicroUsbPhone { private final ILightningPhone lightningPhone;
 * 
 * public LightningToMicroUsbAdapter(ILightningPhone lightningPhone) {
 * this.lightningPhone = lightningPhone; }
 * 
 * @Override public void useMicroUsb() {
 * System.out.println("MicroUsb connected"); lightningPhone.useLightning(); }
 * 
 * @Override public void recharge() { lightningPhone.recharge(); } }
 */
