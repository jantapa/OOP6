import java.util.*;
import java.io.*;


public class Shape3DMain{

	public static void main(String args[]){

		Shape3D shapes[] = new Shape3D[10];
		shapes[1] = new Sphere("Sphere 1", 10);
		shapes[3] = new Sphere("Sphere 2", 5.5);
		shapes[2] = new Cone("Cone 1", 5, 10);
		shapes[5] = new Cone("Cone 2", 7.5, 10.5);

		

		Shape3D longest = findLongest(shapes);


		if(longest != null)

     {
			System.out.println("Longest = " + longest.getName() +
				" long = "+ longest.getLongest() +
				" volume = " + longest.getVolume());
	}		
		else
		{
			System.out.println("There are empty Shape");
		}
}

	public static Shape3D findLongest(Shape3D[] shapes){

		Shape3D area = new Shape3D("");


		for (int i=0 ; i < shapes.length ; i++ ) {

			if(shapes[i] != null)
			{
				area = shapes[i];
				break;
			}
			}	

			for (int i=0 ; i < shapes.length ; i++ ) {

				if (shapes[i] == null) {

					continue;
					
				}

            else{

          		if (area.getLongest() > shapes[i].getLongest() ) {

				area = shapes[i];

				}
			}
		}

        	         			
		           
           return area;

	}
}
