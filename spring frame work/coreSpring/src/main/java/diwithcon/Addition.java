package diwithcon;

public class Addition {

	private Data d;

	public Addition(Data d) {
		super();
		this.d =d;
	}
	
	public int add() {
		return d.getNum1()+ d.getNum2();
	}
	
	public Data getD() {
		return d;
		
	}
	
}
