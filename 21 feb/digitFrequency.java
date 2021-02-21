import java.util.*;

public class digitFrequency
{
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		System.out.print("enter string : ");
		String str = s.nextLine();
		HashMap<Character,Integer> digitCounter = new HashMap<Character,Integer>();
		
		for(int i=48; i < 58; i++){
		    digitCounter.put((char)i,0);
		}
		char [] c = str.toCharArray();
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
