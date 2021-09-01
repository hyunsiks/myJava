package myobj.pokerTeacher;

public class Suit {

	private int value;
	private char shape;
	private String korName;
	private String engName;
	
	public Suit(int value, char shape, String korName, String engName) {
		this.value = value;
		this.shape = shape;
		this.korName = korName;
		this.engName = engName;
	}
	
	public String getKorName() {
		return korName;
	}
	public char getShape() {
		return shape;
	}
	public int getValue() {
		return value;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Character.toString(shape);
	}
}
