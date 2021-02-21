import java.util.*;

public class DynamicArray
{
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		
		// input of number of shelves
		int shelves = s.nextInt();
		
		//creating and initialising array of arraylist for pages( substitute for pointer to pointer logic from c)
		
		ArrayList<Integer> [] pages = new ArrayList[shelves];
		for(int i=0 ; i < shelves; i++){
		    pages[i] = new ArrayList<Integer>();
		}
		
		// array for number of books in each shelf and initialising it to zero
		
		int [] books = new int [shelves];
		for(int i = 0; i < shelves; i++){
		    books[i] = 0;
		}
		int queries = s.nextInt();
		
		//iterating queries
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
