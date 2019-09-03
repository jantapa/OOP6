import java.util.*;
import java.io.*;

public class Hashmap{

	public static void main(String[] args) {
		 
		HashMap<String,Integer> hm = new HashMap<String,Integer>();

		hm = process();
     
           	System.out.println(hm);
           	System.out.println();
 
}
	public static HashMap<String,Integer> process() {

		HashMap<String,Integer> hm = new HashMap<String,Integer>();

		Scanner sc = new Scanner(System.in);
		String s;

        int aqi=0;
		int excellent=0;
		int good=0;
		int lightlyPolluted=0;
		int moderatelyPolluted=0;
		int heavilyPolluted=0;

		while(true){

		s = sc.nextLine();
		System.out.println();

		if (s.equals("Q"))
		
			break;
		
		s=s.substring(s.indexOf("=")+1);
        aqi = Integer.parseInt(s);

		if(aqi >= 0 && aqi <= 25 )
		
			excellent++;

		
		else if(aqi >= 26 && aqi <= 50 )
		
			good++;
		
		else if(aqi >= 51 && aqi <= 100 )
		
			lightlyPolluted++;
		
		else if(aqi >= 101 && aqi <= 200 )
		
			moderatelyPolluted++;
		
		else if(aqi >200 )
		
			heavilyPolluted++;

}
    hm.put("excellent",excellent);
    hm.put("Good",good);
    hm.put("lightly Polluted",lightlyPolluted);
    hm.put("Moderately Polluted",moderatelyPolluted);
    hm.put("Heavily Polluted",heavilyPolluted);
            return hm;

	       }
}

