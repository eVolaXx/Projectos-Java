class BicycleDemo {
	public static void main(String[] args) {
		
		Bicycle bike1 = new Bicycle();
		Bicycle bike2 = new Bicycle();
		
		
		bike1.changeCadence(30);
		bike1.speedUp(12);
		bike1.changeGear(3);
		bike1.printStates();
		
		bike2.changeCadence(30);
		bike2.speedUp(14);
		bike2.changeGear(4);
		bike2.changeCadence(40);
		bike2.changeGear(2);
		bike2.printStates();
		
	}
}