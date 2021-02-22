import java.util.*;

public class rearrangeSpacesBetweenWords
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str  = s.nextLine();
		
	//counting the numbers of spaces
    	int count = 0;
	    	for(int i=0; i < str.length(); i++){
		        if(str.charAt(i) == ' '){
		            count++;
		    }
		}
	
	//removing front and after spaces
        str = str.trim();

	//spliting the words and storing in an array
        String [] words = str.split("\\s+");

	//spaces to add in middle
        int spaces = 0;
        if(words.length != 1){
		   spaces = count/(words.length - 1);
            }else{
                spaces = 0;
            }
		    StringBuilder sb = new StringBuilder();
		    for(int i = 0 ; i<words.length -1 ; i++){
		        sb.append(words[i]);
		        int temp = spaces;
		        while(temp > 0 && count > 0){
		            sb.append(" ");
                    temp--;
		        }
                count = count - spaces;
		    }
            sb.append(words[words.length - 1]);
            while(count > 0){
                sb.append(" ");
                count--;
        }
        System.out.println(sb.toString());
	}
}