/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

/**
 *
 * @author watsa9604
 */
public class FlagExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] nums = {2, 64, 4, 5, 6, 6, 12, 1, 4};
        boolean flag = false;

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            if (flag) {
                System.out.println("Last number was odd");
            }
            if (nums[i] % 2 == 1) {
                flag = true;
            } else {
                flag = false;
            }
        }


    }
}
