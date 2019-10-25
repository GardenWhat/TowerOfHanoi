import java.util.Scanner;

public class TowerOfHanoi {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter how many disks you would like to play with: ");
        int numberOfDisks = userInput.nextInt();
        towerOfHanoi(numberOfDisks, 'A', 'B', 'C');

    }

    static void move(char firstLocation, char targetLocation){
        System.out.printf("Moved %c to %c!\n", firstLocation, targetLocation);
    }
    static void moveUsing(char firstLocation, char helpingLocation, char targetLocation){
        move(firstLocation,helpingLocation);
        move(helpingLocation,targetLocation);
    }
    static void towerOfHanoi(int numberOfDisks, char firstLocation, char helpingLocation, char targetLocation){
        if(numberOfDisks == 0)
            return;
        else {
            towerOfHanoi(numberOfDisks - 1, firstLocation, targetLocation, helpingLocation);
            move(firstLocation, targetLocation);
            towerOfHanoi(numberOfDisks - 1, helpingLocation, firstLocation, targetLocation);

        }
    }
}
