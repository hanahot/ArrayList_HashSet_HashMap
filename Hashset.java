import java.util.*;

public class Hashset{

          public static void main(String[] args) {
                    try (Scanner input = new Scanner(System.in)) {

                              final Set<String> set = new HashSet<String>();

                              System.out.println("Please input your five favourite songs");
                              set.add(input.nextLine());
                              set.add(input.nextLine());
                              set.add(input.nextLine());
                              set.add(input.nextLine());
                              set.add(input.nextLine());

                              System.out.println(set);

                              Iterator<String> it = set.iterator();
                              while (it.hasNext()) {

                                        System.out.println(" You have a good taste of music! " + it.next());
                              }
                    }
          }
}