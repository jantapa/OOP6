
public class Sphere extends Shape3D{

	private double radius;

	

	public Sphere(String name,double radius){
		super(name);
		this.radius=radius;

	}

	public void setRadius(double radius){
		this.radius=radius;
	}

	public double getRadius(){
		return this.radius;
	}

	 @Override
     public double getVolume(){

		double answer;

		answer = 4.0/3*Math.PI*radius*radius*radius;
          
          return  answer;

	}

	@Override
	public double getLongest(){

		return Math.PI*radius*radius*radius;
	}

}