package org.allvehicle;
import org.fourwheeler.FouurWheeler;
import org.twowheeler.TwoWheeler;
import org.threewheeler.ThreeWheeler;


public class Vechile {
	
	private void VechileNecessery() {
System.out.println("biKe,cycle,Auto,Car,Bus,Lorry");
	
	}

	public static void main(String[] args) {
		
		Vechile V  = new Vechile();
		V.VechileNecessery();
		
		TwoWheeler T = new TwoWheeler();
		T.bike();
		T.cycle();
		
		ThreeWheeler T1 = new ThreeWheeler();
		T1.auto();
		
		FouurWheeler F = new FouurWheeler();
		F.car();
		F.bus();
		F.lorry();
		
	}
}
