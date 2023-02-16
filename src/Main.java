import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

//        String[][] studentList = {
//                {"Abby", "Don", "George", "Kim"},
//                {"Brian", "Elenor", "Harry", "Lenny"},
//                {"Cathy", "Fred", "Jill", "Matt"}
//        };
//
//        for (int i = 0; i < studentList.length; i++) {
//            System.out.println(Arrays.toString(studentList[i]));
//        }
//        System.out.println("");
//
//        studentList[1][2] = "Paul";
//        for (int i = 0; i < studentList.length; i++) {
//            System.out.println(Arrays.toString(studentList[i]));
//        }
//        System.out.println("");
//
//        String temp = studentList[0][0];
//        studentList[0][0] = studentList[2][3];
//        studentList[2][3] = temp;
//        for (int i = 0; i < studentList.length; i++) {
//            System.out.println(Arrays.toString(studentList[i]));
//        }
//        System.out.println("");
//
//        String[] temp2 = studentList[0];
//        studentList[0] = studentList[1];
//        studentList[1] = temp2;
//        for (int i = 0; i < studentList.length; i++) {
//            System.out.println(Arrays.toString(studentList[i]));
//        }
//        System.out.println("");
//
//        System.out.println(studentList[0][2] + studentList[2][0]);
//
//        int arr1[][] = new int[2][3];
//        int arr2[][] = new int[3][2];
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(Arrays.toString(arr1[i]));
//        }
//        System.out.println("");
//
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.println(Arrays.toString(arr2[i]));
//        }
//        System.out.println("");
//
//        arr1[0][0] = 1;
//        arr1[0][1] = 2;
//        arr1[0][2] = 3;
//        arr1[1][0] = 4;
//        arr1[1][1] = 5;
//        arr1[1][2] = 6;
//
//        arr2[0][0] = 1;
//        arr2[1][0] = 2;
//        arr2[2][0] = 3;
//        arr2[0][1] = 4;
//        arr2[1][1] = 5;
//        arr2[2][1] = 6;
//
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(Arrays.toString(arr1[i]));
//        }
//        System.out.println("");
//
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.println(Arrays.toString(arr2[i]));
//        }
//        System.out.println("");
//
//        System.out.println(arr1[0][2] + arr2[2][0]);

        // TEST CODE FOR swapFrontAndBackRows
        System.out.println("-------TEST 1-------");
        String[][] w1 = {{"hi", "bye", "stuff", "go"},
                {"time", "up", "you", "good"},
                {"map", "low", "bow", "mom"}};
        System.out.println("--Original:");
        for (String[] innerArr : w1) {
            System.out.println(Arrays.toString(innerArr));
        }
        System.out.println("--Modified:");
        FunWith2DArrays.swapFrontAndBackRows(w1);
        for (String[] innerArr : w1) {
            System.out.println(Arrays.toString(innerArr));
        }
        System.out.println("-------TEST 2-------");
        String[][] w2 = {{"time", "up", "bye"},
                {"hi", "hit", "up"},
                {"map", "bam", "low"},
                {"bow", "mom", "joy"}};
        System.out.println("--Original:");
        for (String[] innerArr : w2) {
            System.out.println(Arrays.toString(innerArr));
        }
        System.out.println("--Modified:");
        FunWith2DArrays.swapFrontAndBackRows(w2);
        for (String[] innerArr : w2) {
            System.out.println(Arrays.toString(innerArr));
        }

        System.out.println("-------TEST 3-------");
        String[][] w3 = {{"phone", "mouse", "keyboard"}};
        System.out.println("--Original:");
        for (String[] innerArr : w3) {
            System.out.println(Arrays.toString(innerArr));
        }
        System.out.println("--Modified:");
        FunWith2DArrays.swapFrontAndBackRows(w3);
        for (String[] innerArr : w3) {
            System.out.println(Arrays.toString(innerArr));
        }

        System.out.println("-------TEST 4-------");
        String[][] w4 = {{"cat"},
                {"dog"},
                {"hamster"},
                {"bird"}};
        System.out.println("--Original:");
        for (String[] innerArr : w4) {
            System.out.println(Arrays.toString(innerArr));
        }
        System.out.println("--Modified:");
        FunWith2DArrays.swapFrontAndBackRows(w4);
        for (String[] innerArr : w4) {
            System.out.println(Arrays.toString(innerArr));
        }

        System.out.println("-------TEST 5-------");
        String[][] w5 = {{"time"}};
        System.out.println("--Original:");
        for (String[] innerArr : w5) {
            System.out.println(Arrays.toString(innerArr));
        }
        System.out.println("--Modified:");
        FunWith2DArrays.swapFrontAndBackRows(w5);
        for (String[] innerArr : w5) {
            System.out.println(Arrays.toString(innerArr));
        }





    }
}
