import javax.swing.*;
import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        String[] dogs = new String[5];

        dogs[0] = "Rex";
        dogs[1] = "Spot";
        dogs[2] = "Tyson";
        dogs[3] = "Sam";
        dogs[4] = "Daisy";

        for (int i = 0; i<dogs.length; i++){

            System.out.println("Dog " + (i+1) + " has the name " + dogs[i]);
        }

        for (int i = 0; i<dogs.length; i++){
            String rexSpot = "";
            if(dogs[i].contains("Rex") || dogs[i].contains("Spot")){
                rexSpot += dogs[i];
            }
            System.out.println(rexSpot);
        }

        int[] nums = new int[5];

        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 17;
        nums[3] = 10;
        nums[4] = 5;
        int average = 0;
        int total = 0;
        for (int i = 0; i<dogs.length; i++){
            total = total + nums[i];
            average = total/nums.length;
        }
        System.out.println(total);
        System.out.println(average);
        int max = largest(nums);
        System.out.println(max);

        populateArray(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void populateArray(int[] nums){
        for (int i =0; i<nums.length; i++){

            nums[i] = Integer.parseInt(JOptionPane.showInputDialog("Please enter the numbers "));
        }

    }

    public static int largest(int[] nums)
    {
        int largest = nums[0];

        for(int i=1; i<nums.length; i++)
            if(nums[i]>largest)
                largest = nums[i];

        return largest;
    }
}
