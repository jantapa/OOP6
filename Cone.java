public class Cone extends Shape3D{

	private double radius;
	private double height;

	public Cone(String name,double radius,double height){
		super(name);
		this.radius=radius;
		this.height=height;

	}

	public void setRadius(double radius){
		this.radius=radius;
	}

	public double getRadius(){
		return this.radius;
	}
	public void setHeigth(double height){
		this.height=height;
	}

	public double getHeigth(){
		return this.height;
	}

	 @Override
     public double getVolume(){

		double answer;

		answer = 1.0/3 * Math.PI * radius * radius * height;
          
          return  answer;

	}

	@Override
	public double getLongest(){

		return Math.PI*(radius+height);
	}

}