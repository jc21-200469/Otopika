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
			oto1.lightGreen();
			oto1.sleep();
			oto1.lightGreenYellow();
			oto1.sleep();
			oto1.lightYellow();
			oto1.sleep();
			oto1.lightYellowRed();
			oto1.sleep();
			oto1.lightRed();
			oto1.sleep();
			oto1.lightGreenRed();
			oto1.sleep();
		}

	}

}
