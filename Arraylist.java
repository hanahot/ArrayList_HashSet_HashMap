import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.stream.Stream;
public class Arraylist
{
  /**
 * @param args
 */
public static void main(String[] args){
    try (Scanner input = new Scanner(System.in)) {
        ArrayList<String> knownDancers = new ArrayList<>();
        System.out.println("Enter your 6 Favorite Brand:");
        knownDancers.add(input.nextLine());
        knownDancers.add(input.nextLine());
        knownDancers.add(input.nextLine());
        knownDancers.add(input.nextLine());
        knownDancers.add(input.nextLine());
        knownDancers.add(input.nextLine());
        
    
        System.out.println(knownDancers);
        
  
            for (String people : knownDancers){
                System.out.println(" Hello! I Highly Recommend This Brand " + people);
            }
          
     
            Iterator<String> it = knownDancers.iterator();
            while(it.hasNext()){
               
                System.out.println( it.next());
            }
       
          Stream<String> str = knownDancers.stream();
            str.forEach(name -> {
                System.out.println(" Hello! Let Me Share My Top 6 Favorite Brand:) " + name);
            });
    }
        
    
    }
    
    
}