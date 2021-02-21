import java.util.*;

public class digitFrequency
{
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		System.out.print("enter string : ");
		String str = s.nextLine();
	
		//hashmap to store digits as keys and store the repeating values

		HashMap<Character,Integer> digitCounter = new HashMap<Character,Integer>();
		
		// Initialising the repeating values to 0 
		for(int i=48; i < 58; i++){
		    digitCounter.put((char)i,0);
		}

		//converting string to character array

		char [] c = str.toCharArray();

		//appending 1 to value whenever key repeats

		for(int i =0; i < c.length ; i++){
		    if(digitCounter.containsKey(c[i])){
		        digitCounter.put(c[i] , digitCounter.get(c[i]) + 1);
		    }
		}
		for(char i : digitCounter.keySet()){
		    System.out.print(digitCounter.get(i)+ " ");
		}
	}
}
