package Default;

public class IndianTraffic implements centralTraffic,continentTraffic{

	public static void main(String[] args) {
		
		centralTraffic a= new IndianTraffic();
		a.Green();
		a.Red();
		a.yellow();

		
		continentTraffic ct= new IndianTraffic();
		IndianTraffic In= new IndianTraffic();
		In.Walking();
		ct.TrainSymbol();
		
	}

	@Override
	public void Green() {
		System.out.println("green light display");
		
	}
	
	public void Walking()
	{
		System.out.println("walk now");
	}
	@Override
	public void Red() {
		System.out.println("Red  light display");
	}

	@Override
	public void yellow() {
		System.out.println("Yellow  light display");		
	}

	@Override
	public void TrainSymbol() {
		System.out.println("Train symbol  light display");
	}

}
