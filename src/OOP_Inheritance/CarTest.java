package OOP_Inheritance;

public class CarTest {

	public static void main(String[] args) {

		
		BMW b = new BMW();
		b.refuel();//Inherited from Car
		b.stop();//Inherited from Car
		
		b.start();//Overridden method
		
		b.autoParking(); //independent method of BMW
		b.engine();
		
		BMW.wheels();
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		Car.wheels();
		
		//Top Casting:
		Car c1 = new BMW();//child object can be referred by parent class ref variable
		c1.start();
		c1.stop();
		c1.refuel();
		//ref type check
		
		Vehicle v1 = new BMW();
		v1.engine();
		
		//Down Casting:
		//BMW b1 = (BMW) new Car();//ClassCastException
		
		
	}

}
