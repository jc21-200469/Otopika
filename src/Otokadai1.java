import jp.jc21.t.yoshizawa.otopika.Otopika;

/**
 *
 */


/**
 * @author AB2B99
 *
 */
public class Otokadai1  {

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
			oto.lightGreen();
			oto.sleep();
			oto.lightGreenYellow();
			oto.sleep();
			oto.lightYellow();
			oto.sleep();
			oto.lightYellowRed();
			oto.sleep();
			oto.lightRed();
			oto.sleep();
			oto.lightGreenRed();
			oto.sleep();
		}

	}

}
