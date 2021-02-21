import java.util.*;

public class DynamicArray
{
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		
		int shelves = s.nextInt();
		
		ArrayList<Integer> [] pages = new ArrayList[shelves];
		for(int i=0 ; i < shelves; i++){
		    pages[i] = new ArrayList<Integer>();
		}
		
		int [] books = new int [shelves];
		for(int i = 0; i < shelves; i++){
		    books[i] = 0;
		}
		int queries = s.nextInt();
		while(queries > 0){
		    int queryType = s.nextInt();
		    
		    if(queryType == 1){
		        int x = s.nextInt();
		        int y = s.nextInt();
		        pages[x].add(y);
		        books[x]++;
		    }else if(queryType == 2){
		        int x = s.nextInt();
		        int y = s.nextInt();
		        System.out.println(pages[x].get(y));
		    }else{
		        int x = s.nextInt();
		        System.out.println(books[x]);
		    }
		    
		}
	}
}
