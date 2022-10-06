package ch07_oop;

class Time{
	private int hour;
	private int minute; 
	private int second;

	public void setHour(int hour) { //private니까 public을 제공해줘야 함. 
		if(isValidHour(hour)) return; 
		
		this.hour = hour;
	}

	// 매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
	private boolean isValidHour(int hour) { //이 안에서밖에 안쓰니깐 private로 쓰는게 나음. 밖에선 쓸 일 없음.
		return hour < 0 || hour > 23; //alt + shift + M 누르면 메서드 추출 가능. (isValidHour메서드 추출)
	}
	
	public int getHour() {return hour;};
}


public class TimeTest {
	public static void main(String[] args) {
	Time t = new Time();
	t.setHour(21);
	System.out.println(t.getHour());
	t.setHour(100);
	System.out.println(t.getHour());
	}
}
