import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] nums = input.split(" ");
        int size = Integer.valueOf(nums[0]);
        int count = Integer.valueOf(nums[1]);
        BitSet bitSetOne = new BitSet(size);

        BitSet bitSetTwo = new BitSet(size);
        System.out.println(bitSetOne.toString());
        for (int i = 0; i < count; i++) {
            String action = sc.nextLine();
            String actions[] = action.split(" ");
            action = actions[0];
            String num1 = actions[1];
            String num2 = actions[2];

            if (action.equals("AND")) {
              bitSetOne.and(bitSetTwo);
            }else if (action.equals("OR")){
                bitSetOne.or(bitSetTwo);
            }else if (action.equals("XOR")){
                bitSetOne.xor(bitSetTwo);
            } else if (action.equals("FLIP")){
                bitSetOne.flip(0,size);
            }else if (action.equals("SET")){
                bitSetOne.set(0,size);
            }
            System.out.println(bitSetOne.cardinality()+" "+bitSetTwo.cardinality());
        }

    }
}
