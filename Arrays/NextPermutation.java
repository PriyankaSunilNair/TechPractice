public class Solution {
    public ArrayList<Integer> nextPermutation(ArrayList<Integer> A) {
        int n = A.size();
        int index = -1;
        
        /* 
            traverse the list from back and find the first occurance of 
            element a[i] such that a[i] > a[i-1]. Store i-1 in index
            eg. for a list a = {20, 10, 40, 48, 44, 34}, 40 is such an element. 
            put index = 2 and break. 
        */
        for (int i = n-1; i > 0; i--) {
            if (A.get(i) > A.get(i-1)) {
                index = i-1;
                break;
            }
        }
        /*
            if such element does not exist, that means the list is in highest permutaion. 
            return the list sorted in ascending order. 
        */
        if (index == -1) {
            Collections.sort(A);
        }
        else {
            /*
                find the succssor element of a[index] in the traversed part of the
                list. Eg. for the given example list, look for an element which is successor 
                of 40 in the traversed part. a[index+1:n]. when found such element store
                the index in swapWithIndex. In this scenario swapWithIndex = 4 and the 
                element is 44.
            */
            int swapWithIndex = -1;
            for(int j = n-1; j >index; j--) {
                if (A.get(j) > A.get(index)) {
                    swapWithIndex = j;
                    break;
                }
            }
            /*
                swap elements a[index] with a[swapWithIndex]. 
                The list in scenario looks like this after this operation:
                a = {20, 10, 44, 48, 40, 34}
            */
            int temp = A.get(index);
            A.set(index, A.get(swapWithIndex));
            A.set(swapWithIndex, temp);
            /*
                sort the post index part of the list a[index+1:n] in ascending order.
                That means, in the example sort a[3:6] = {48, 40, 34}
            */
            Collections.sort(A.subList(index+1, n));
        }
        return A;
    }
}
