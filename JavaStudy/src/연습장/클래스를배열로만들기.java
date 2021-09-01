package 연습장;

public class 클래스를배열로만들기 {

	public static void main(String[] args) {
		
		String seoul = null;
		String korea = null ;
		Area aa = new Area(korea, seoul);

	}

}

class Area{
	
	String city;
	String country;
	
	public Area(String country, String city) {
		this.city = city;
		this.country = country;
	}
}
