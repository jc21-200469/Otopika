import jp.jc21.t.yoshizawa.otopika.Otopika;

/**
 *
 */


/**
 * @author AB2B99
 *
 */
public class Otokadai06  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Otopika oto1 = new Otopika();
		Otopika oto2 = new Otopika();
		oto1.powerOn();
		oto2.powerOn();
		while(true) {
			oto2.lightRed();
			 oto1.lightGreen();
			 oto1.sleep(10);
			 oto1.lightYellow();
			 oto1.sleep(3);
			 oto1.lightRed();
			 oto1.sleep();
			oto2.lightOff();
		
			oto1.lightRed();
			 oto2.lightGreen();
			 oto2.sleep(10);
			 oto2.lightYellow();
			 oto2.sleep(3);
			 oto2.lightRed();
			 oto2.sleep();
			oto1.lightOff();
			
		
		
		
		}  
		

	}

}
