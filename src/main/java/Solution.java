import java.util.Scanner;

public class Solution {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the  amount of water (in litres) poured" +
                " into the glass:");
        String waterCapacityInput = input.nextLine();
        //input verification of water capacity
        if(!checkFloatInput(waterCapacityInput)){
            System.out.println("Incorrect value specified for water " +
                    "capacity");
            System.exit(0);
        }
        double waterCapacity = Double.parseDouble(waterCapacityInput);
        System.out.println("Enter the ith Row number of target glass:");
        String rowNumberInput = input.nextLine();
        if(!checkNumberInput(rowNumberInput)){
            System.out.println("Please enter a valid row input");
            System.exit(0);
        }
        int rowNumber = Integer.parseInt(rowNumberInput);
        System.out.println("Enter the jth Column number of target glass:");
        String columnNumberInput = input.nextLine();
        if(!checkNumberInput(columnNumberInput)){
            System.out.println("Please enter a valid column input");
            System.exit(0);
        }
        int columnNumber = Integer.parseInt(columnNumberInput);
        double glassCapacity = findGlassCapacity(waterCapacity,rowNumber,
                columnNumber);
        System.out.println("The total water capacity in row:" + rowNumber +
        " and column:" + columnNumber + " is - "+ glassCapacity + " " +
                "litres");
    }

    //helper function to verify the water capacity input
    // before passing the value to calculate glass water capacity
    public static boolean checkFloatInput(String input){
        try {
            double d = Double.parseDouble(input);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    // helper function to verify the row and column number input
    // before passing the value to calculate glass water capacity
    public static boolean checkNumberInput(String input){
        try {
            int d = Integer.parseInt(input);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    //helper function to determine the water capacity in the target glass
    static double findGlassCapacity(double waterCapacity, int rowNumber,
                                    int columnNumber) {
        if(columnNumber > rowNumber){
            System.out.println("Incorrect input - the value of jth column" +
                    " can't be greater than the value of ith row");
            return -1;
        }else{
            //assuming no water added to glass
            if(waterCapacity == 0){
                return 0.0;
            }
            int rowLevel = (int)Math.ceil(waterCapacity * 4);
            GlassObject[][] glasses =
                    new GlassObject[rowLevel][rowLevel];
            boolean capacityLeft = true;
            double glassCapacity = 0.25;
            //fill first glass with all the water poured into it
            for(int i=0;i< rowLevel;i++){
                for(int j=0;j< rowLevel;j++){
                    glasses[i][j] = new GlassObject();
                }
            }
            glasses[0][0].setCapacity(waterCapacity);
            //loop through glass levels and set capacity if water is left
            for (int i = 0;capacityLeft;i++){
                capacityLeft = false;
                for (int j=0;j<= i;j++){
                    if(glasses[i][j].getCapacity() > glassCapacity){
                        double excess = glasses[i][j].getCapacity() - glassCapacity;
                        glasses[i][j].setCapacity(glassCapacity);
                        glasses[i+1][j].setCapacity(glasses[i+1][j].getCapacity() + excess/2);
                        glasses[i+1][j+1].setCapacity(glasses[i+1][j+1].getCapacity() + excess/2);
                        capacityLeft = true;
                    }
                }
            }
            return glasses[rowNumber -1][columnNumber -1].getCapacity();
        }
    }
}
