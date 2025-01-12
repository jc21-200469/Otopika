/**
 * 
 */
package jp.jc21.t.yoshizawa.otopika;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

/**
 * @author t.yoshizawa
 *
 */
public class oto extends JFrame {
	private boolean power = false;
	private boolean green = false;
	private boolean yellow = false;
	private boolean red = false;

	// constructor

	public oto() {
		this.setSize(300, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	// control method

	/**
	 * ãã¨ã´ãã?®é»æºãONã«ãã
	 */
	public void powerOn() {
		setPower(true);
		repaint();
	}

	/**
	 * ãã¨ã´ãã?®é»æºãOFFã«ãã
	 */
	public void powerOff() {
		setPower(false);
		repaint();
	}

	/**
	 * ãã¨ã´ãã?®LEDããã¹ã¦æ¶ç?¯ãã
	 */
	public void lightOff() {
		setLed(false, false, false);
	}

	/**
	 * ãã¨ã´ãã?®LEDãç·ã ãç¹ç¯ãã
	 */
	public void lightGreen() {
		setLed(true, false, false);
	}

	/**
	 * ãã¨ã´ãã?®LEDãé»?è²ã?ãç¹ç¯ãã
	 */
	public void lightYellow() {
		setLed(false, true, false);
	}

	/**
	 * ãã¨ã´ãã?®LEDãèµ¤ã?ãç¹ç¯ãã
	 */
	public void lightRed() {
		setLed(false, false, true);
	}

	/**
	 * ãã¨ã´ãã?®LEDããã¹ã¦ç¹ç¯ãã
	 */
	public void lightAll() {
		setLed(true, true, true);
	}

	/**
	 * ãã¨ã´ãã?®LEDãç·ã¨é»?è²ãåæã«ç¹ç¯ãã
	 */
	public void lightGreenRed() {
		setLed(true, false, true);
	}

	/**
	 * ãã¨ã´ãã?®LEDãé»?è²ã¨èµ¤ãåæã«ç¹ç¯ãã
	 */
	public void lightGreenYellow() {
		setLed(true, true, false);
	}

	/**
	 * ãã¨ã´ãã?®LEDãç·ã¨èµ¤ãåæã«ç¹ç¯ãã
	 */
	public void lightYellowRed() {
		setLed(false, true, true);
	}

	public void sleep() {
		sleep(1);
	}

	public void sleep(float time) {
		try {
			Thread.sleep((long) (1000 * time));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void setLed(boolean green, boolean yellow, boolean red) {
		setGreen(green);
		setYellow(yellow);
		setRed(red);
		if (isPower() == true) {
			repaint();
		}
	}

	// setters and getters

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	private boolean isGreen() {
		return green;
	}

	private void setGreen(boolean green) {
		this.green = green;
	}

	private boolean isYellow() {
		return yellow;
	}

	private void setYellow(boolean yellow) {
		this.yellow = yellow;
	}

	private boolean isRed() {
		return red;
	}

	private void setRed(boolean red) {
		this.red = red;
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);

		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 300, 300);

		if (isPower() == true) {
			g.setColor(Color.BLUE);
			g.fillOval(10, 190, 20, 20);
			g.setColor(Color.black);
			g.drawRect(10, 130, 20, 40);
			g.fillRect(10, 130, 20, 20);

		} else {
			g.setColor(Color.BLUE);
			g.drawOval(10, 190, 20, 20);
			g.setColor(Color.black);
			g.drawRect(10, 130, 20, 40);
			g.fillRect(10, 150, 20, 20);

		}
		if (isGreen() == true) {
			g.setColor(Color.GREEN);
			g.fillOval(20, 60, 50, 50);
		}
		if (isYellow() == true) {
			g.setColor(Color.yellow);
			g.fillOval(120, 60, 50, 50);
		}
		if (isRed() == true) {
			g.setColor(Color.red);
			g.fillOval(220, 60, 50, 50);
		}
	}

}
