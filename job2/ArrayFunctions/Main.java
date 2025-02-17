public class Main {
    public static void main(String[] args) {
        int[] array1 = {2, 1, 2, 3, 4};
        int[] array2 = {2, 2, 0};
        int[] array3 = {1, 3, 5};

        System.out.println(ArrayFunctions.countEvens(array1));
        System.out.println(ArrayFunctions.countEvens(array2));
        System.out.println(ArrayFunctions.countEvens(array3));

        System.out.println(ArrayFunctions.findDifference(array1));
        System.out.println(ArrayFunctions.findDifference(array2));
        System.out.println(ArrayFunctions.findDifference(array3));

        System.out.println(ArrayFunctions.hasTwoZeros(array1));
        System.out.println(ArrayFunctions.hasTwoZeros(array2));
        System.out.println(ArrayFunctions.hasTwoZeros(array3));
    }
}
