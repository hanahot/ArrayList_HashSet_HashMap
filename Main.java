import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String mycloth[] = {"Puma", "Ettiquite", "FUBU", "Dyse One", "Grandsler"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the index of the favorite Sport you want to display: ");
        int choice = scan.nextInt();
        try{
            if(choice < 0){
                scan.close();
                throw new ClothesException("The index is negative!");
            }if(choice > 5){
                scan.close();
                throw new ClothesException("The index "+ choice +" is not valid!");
            }
            System.out.println(mycloth[choice]);
        }catch(ClothesException e){

            System.out.println(e.getMessage());

        }
        scan.close();
    }
}
