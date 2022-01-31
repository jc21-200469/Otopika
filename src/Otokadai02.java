import jp.jc21.t.yoshizawa.otopika.Otopika;

/**
 *
 */


/**
 * @author AB2B99
 *
 */
public class Otokadai02  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Otopika oto = new Otopika();
		oto.powerOn();
		while(true) {
			oto.lightGreen();
			oto.sleep();
			oto.lightYellow();
			oto.sleep();
			oto.lightRed();	
			oto.sleep();
			oto.lightOff();
			oto.sleep();
		
		
		}
	}
}
