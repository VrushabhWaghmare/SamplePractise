package object_oriented_Programming_concept;

public class PolymorphismDemo extends AbstractionDemo {                                             // implements InterfaceDemo   // extends AbstractionDemo

	public PolymorphismDemo() {
		// TODO Auto-generated constructor stub
	}

	@Override                                                                               // Abstract method from AbstractionDemo
	public void vechicle(int speedLimit) {
		// TODO Auto-generated method stub
		
	}
	
	@Override                                                                               // Concrete method from AbstractionDemo
		public void speedLimit(int num) {
			// TODO Auto-generated method stub
			super.speedLimit(num);
		}
	

	@Override                                                                              // All three methods override from InterfaceDemo
	public void speedMeter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cluth() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selfStart() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	
}
