import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> name = new ArrayList<String>();

        Anime<String> FirstAnime= new Anime<String>();
        FirstAnime.setCharacter("Hisoka Morrow");
        FirstAnime.setTitle("HUNTERxHUNTER");
        FirstAnime.setGenre("Adventure");
        name.add("I am " +  FirstAnime.getCharacter() + " from " + FirstAnime.getTitle() + " and the type of this anime is " + FirstAnime.getGenre()+ ". Enjoy Watching!");

        Anime<String> SecondAnime = new Anime<String>();
        SecondAnime.setCharacter("Rimuru Tempest");
        SecondAnime.setTitle("That Time I Got Reincarnated as a Slime ");
        SecondAnime.setGenre("Adventure");
        name.add("I am " +  SecondAnime.getCharacter() + " from " + SecondAnime.getTitle() + " and the type of this anime is " + SecondAnime.getGenre()+ ". Enjoy Watching!");


        Anime<String> ThirdAnime = new Anime<String>();
        ThirdAnime.setCharacter("Kaneki Ken");
        ThirdAnime.setTitle("Tokyo ghoul");
        ThirdAnime.setGenre("dark fantasy");
        name.add("I am " +  ThirdAnime.getCharacter() + " from " + ThirdAnime.getTitle() + " and the type of this anime is " + ThirdAnime.getGenre()+ ". Enjoy Watching!");


        Anime<String> FourthAnime = new Anime<String>();
        FourthAnime.setCharacter("Satoru Gojo");
        FourthAnime.setTitle("Jujutsu Kaisen");
        FourthAnime.setGenre("supernatural");
        name.add("I am " +  FourthAnime.getCharacter() + " from " + FourthAnime.getTitle() + " and the type of this anime is " + FourthAnime.getGenre()+ ". Enjoy Watching!");


        Anime<String> FifthAnime = new Anime<String>();
        FifthAnime.setCharacter("Hatori Sohma");
        FifthAnime.setTitle("Fruit Basket");
        FifthAnime.setGenre("slice of life");
        name.add("I am " +  FifthAnime.getCharacter() + " from " + FifthAnime.getTitle() + " and the type of this anime is " + FifthAnime.getGenre()+ ". Enjoy Watching!");

        System.out.print("     [0,1,2,3,4]");
        System.out.print("\nEnter your choosen index:");
        int input = sc.nextInt();

        try {
            if (input < 0) {
                sc.close();
                throw new AnimeException("Your input is negative. Please input positive index.");
            }
            if (input > 5) {
                sc.close();
                throw new AnimeException("Your input exceeds the size of the arraarray.");
            }

            System.out.println("Index number: " + input);
            System.out.println(name.get(input));

        } catch (AnimeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();

    }
}