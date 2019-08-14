/**
 * @ClassName Factory
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月12日  09:25:50
 * @Version 1.0.0
 */
public class Factory {
/*
    private  static Factory factory;
    private Factory(){

    }
    public Factory getInstance(){
        if (factory==null){
            factory = new Factory();
        }
        return factory;
    }*/

    public int[] twoSum(int[] nums, int target)  {

       /* for (int i = 0; i < sums.length; i++) {

            for (int j = i +1; j < sums.length; j++) {
                System.out.print(sums[j]);
                if (sums[j] ==  target-sums[i]) {
                    return new int[]{i, j};


                }
            }
            System.out.println(i);

        }
        throw new Exception("不存在！");*/
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {

        try {
            Factory factory = new Factory();
            int[] sum = {2, 5, 9, 12};
            factory.twoSum(sum, 11);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
