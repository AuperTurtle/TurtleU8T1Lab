public class FunWith2DArrays {

    public static int totalElements(int[][] intList) {
        int counter = 0;
        for (int i = 0; i < intList.length; i++) {
            for (int z = 0; z < intList[i].length; z++) {
                counter++;
            }
        }
        return counter;
    }

    public static void fourCorners(String[][] wordList) {
        int maxRow = wordList.length - 1;
        int maxColumn = wordList[0].length - 1;

        System.out.println(wordList[0][0]);
        System.out.println(wordList[0][maxColumn]);
        System.out.println(wordList[maxRow][0]);
        System.out.println(wordList[maxRow][maxColumn]);
    }

    public static void swapFrontAndBackRows(String[][] wordList) {
        int maxRow = wordList.length - 1;
        String temp[] = wordList[0];
        wordList[0] = wordList[maxRow];
        wordList[maxRow] = temp;
    }

    public static void asciiPrinter(String[][] stuff) {
        for (int i = 0; i < stuff.length; i++) {
            for (int z = 0; z < stuff[i].length; z++) {
                System.out.print(stuff[i][z]);
            }
            System.out.println("");
        }
    }

    public static double average(int[][] intLists) {
        double average = 0;
        int counter = 0;
        for (int i = 0; i < intLists.length; i++) {
            for (int z = 0; z < intLists[i].length; z++) {
                average += intLists[i][z];
                counter++;
            }
        }
        return average / counter;
    }

    public static int[] indexFound(String[][] wordList, String find) {
        int index[] = {-1, -1};
        for (int i = 0; i < wordList.length; i++) {
            for (int z = 0; z < wordList[i].length; z++) {
                if (wordList[i][z].equals(find)) {
                    index[0] = i;
                    index[1] = z;
                    return index;
                }
            }
        }
        return index;
    }

    public static int[][] split(int[][] intList, int row, int column) {
        if (row >= intList.length || column >= intList[0].length) {
            return new int[0][0];
        }
        int[][] temp = new int[row + 1][column + 1];
        if (row < intList.length && column < intList[0].length) {
            for (int i = 0; i <= row; i++) {
                for (int z = 0; z <= column; z++) {
                    temp[i][z] = intList[i][z];
                }
            }
        }
            return temp;
    }

    public static int[][] invert(int[][] intLists) {
        int[][] newList = new int[intLists[0].length][intLists.length];
        for (int i = 0; i < newList.length; i++) {
            for (int z = 0; z < newList[i].length; z++) {
                newList[i][z] = intLists[z][i];
            }
        }
        return newList;
    }

}
