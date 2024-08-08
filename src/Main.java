import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]   nums = new int[]{3,4,5,6};
        int target = 7;
System.out.println(Arrays.toString(twoSum(nums, target)));
    }

        public static int[] twoSum(int[] nums, int target) {
            int a=-1,b=-1;
            for (int i=0;i<nums.length-1;i++)
            {
                target=target-nums[i];
                for (int j=i+1;j<nums.length;j++)
                {
                    if(nums[j]==target)
                    {
                        if (i<j)
                        { a =i;b=j;}
                        else{ b=i;a=j;}
                    }
                }
            }
//int[] num = {a,b};

            return new int[]{a,b}  ;
        }
    }
