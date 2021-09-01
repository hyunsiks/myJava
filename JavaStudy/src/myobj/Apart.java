package myobj;

public class Apart {
	public int perOfPrice;
	public int locateFromSeoul;
	public double value;
	
	public int floor;
	public int size;
	public double price;
	
	public Apart() {
		perOfPrice = 10000;
		locateFromSeoul = 1;
		value = 1;
	}
	
	public Apart(int perOfPrice, int locateFromSeoul, int value) {
		this.perOfPrice = perOfPrice;
		this.locateFromSeoul = locateFromSeoul;
		this.value = value;
	}
	
	public double floorValue(int floor) {
		if(floor > 20) {
			value = 1;
			return value;
		}
		value = (10 - Math.round(10 - floor))/10.0;
		return value;
	}
	
	public int locateValue(int locate) {
		if(locate >= 9) {
			locate = 9;
		}
		locateFromSeoul *= (10 - locate);
		return locateFromSeoul;
	}
	
	public double price(int size) {
		price = size * value * locateFromSeoul * perOfPrice;
		return price;
	}
}
