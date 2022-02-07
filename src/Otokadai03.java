import jp.jc21.t.yoshizawa.otopika.Otopika;

/**
 *
 */


/**
 * @author AB2B99
 *
 */
public class Otokadai03  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Otopika oto1 = new Otopika();
		Otopika oto2 = new Otopika();
		oto1.powerOn();
		oto2.powerOn();
		while(true) {
			oto1.lightAll();
			oto1.sleep();
			oto1.lightOff();
			oto1.sleep();

		}

	}

}
