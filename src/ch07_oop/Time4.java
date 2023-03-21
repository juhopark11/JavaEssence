package ch07_oop;

class Clock {
	private int hour;
	private int minute;
	private int second;

	public void setData(int hour, int minute, int second) {
		if (hour < 0 || 24 < hour) {
			System.out.println("hour 설정이 맞지 않습니다.");
			return;
		} else {
			this.hour = hour;
		}
		this.minute = minute;
		this.second = second;
	}

	public String getData() {
		return hour + ":" + minute + ":" + second;
	}

}

public class Time4 {
	public static void main(String[] args) {

		Clock c = new Clock();
		c.setData(232, 13, 14);

		System.out.println(c.getData());

	}
}
