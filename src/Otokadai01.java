import jp.jc21.t.yoshizawa.otopika.Otopika;

/**
 *
 */


/**
 * @author AB2B99
 *
 */
public class Otokadai01  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Otopika oto = new Otopika();
		oto.powerOn();
		while(true) {
			oto.lightAll();
			oto.sleep();
			oto.lightOff();
			oto.sleep();
			
		}

	}

}
