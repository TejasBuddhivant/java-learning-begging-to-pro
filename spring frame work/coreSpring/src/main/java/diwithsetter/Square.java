package diwithsetter;

public class Square {

	private int s;
	private A obj;
	
	public int sq() {
		s= obj.getNum1()*obj.getNum1();
		return s;
	
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}

	public A getObj() {
		return obj;
	}

	public void setObj(A obj) {
		this.obj = obj;
	}
	
	
}
