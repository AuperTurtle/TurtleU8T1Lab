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
}
