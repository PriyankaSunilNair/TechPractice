import java.util.HashMap;

public class MF {
    public static void main(String[] args) {
        // NOTE: The following input values are used for testing your solution.

        // mostFrequent(array1) should return 1.
        int[] array1 = {1, 3, 1, 3, 2, 1};
        // mostFrequent(array2) should return 3.
        int[] array2 = {3, 3, 1, 3, 2, 1};
        // mostFrequent(array3) should return null.
        int[] array3 = {};
        // mostFrequent(array4) should return 0.
        int[] array4 = {0};
        // mostFrequent(array5) should return -1.
        int[] array5 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};
    }

    // Implement your solution below.
    public static Integer mostFreqent(int[] givenArray) {
        Integer maxItem = null;
        int maxCount = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<givenArray.length; i++) {
            int num = givenArray[i];
            map.put(num, map.getOrDefault(num,0) + 1);
            if(maxCount < map.get(num)){
                maxCount = map.get(num);
                maxItem = num;
            }
        }
        return maxItem;
    }
}
