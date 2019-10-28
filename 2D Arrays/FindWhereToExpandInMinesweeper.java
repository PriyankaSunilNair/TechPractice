import java.util.ArrayDeque;

public class MS2 {
    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        int[][] field1 = {{0, 0, 0, 0, 0},
                          {0, 1, 1, 1, 0},
                          {0, 1, -1, 1, 0}};

        // click(field1, 3, 5, 2, 2) should return:
        // [[0, 0, 0, 0, 0],
        //  [0, 1, 1, 1, 0],
        //  [0, 1, -1, 1, 0]]

        // click(field1, 3, 5, 1, 4) should return:
        // [[-2, -2, -2, -2, -2],
        //  [-2, 1, 1, 1, -2],
        //  [-2, 1, -1, 1, -2]]


        int[][] field2 = {{-1, 1, 0, 0},
                          {1, 1, 0, 0},
                          {0, 0, 1, 1},
                          {0, 0, 1, -1}};

        // click(field2, 4, 4, 0, 1) should return:
        // [[-1, 1, 0, 0],
        //  [1, 1, 0, 0],
        //  [0, 0, 1, 1],
        //  [0, 0, 1, -1]]

        // click(field2, 4, 4, 1, 3) should return:
        // [[-1, 1, -2, -2],
        //  [1, 1, -2, -2],
        //  [-2, -2, 1, 1],
        //  [-2, -2, 1, -1]]
    }

    // Implement your solution below.
    public static int[][] click(int[][] field, int numRows, int numCols, int givenI, int givenJ) {
        if(field[givenI][givenJ] != 0) {
            return field;
        }
		field[givenI][givenJ] = -2;
        ArrayDeque<int[]> tracker = new ArrayDeque<int[]>();
        int selected[] = {givenI, givenJ};
        tracker.add(selected);
        while(!tracker.isEmpty()) {
            int current[] = tracker.remove();
            int I = current[0];
            int J = current[1];
            for(int i=I-1; i<I+2; i++) {
                for(int j=J-1; j<J+2; j++) {
                    if(0<=i && i<numRows && 0<=j && j<numCols && field[i][j] == 0) {
                        field[i][j] = -2;
                        int toAdd[] = {i,j};
                        tracker.add(toAdd);
                    }
                }
            }
        }
        return field;
    }
 }
