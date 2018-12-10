public class TestArrays
{
    public static void main(String[] args)
    {
        int[] myArray = {5,7,3,9,14,5,29,6};
        if(ArrayUtils.changeValue(myArray, 4, 30))
        //System.out.println(mrArray);
            ArrayUtils.printArray(myArray);
        else
            System.out.println("Invalid parameter");

        if (ArrayUtils.changeValue(myArray,14,-23))
            ArrayUtils.printArray(myArray);
        else
            System.out.println("Invalid parameter");

        System.out.println();
        int favoriteNum = 100;
        myArray = ArrayUtils.addElement(myArray, favoriteNum);
        ArrayUtils.printArray(myArray);
    }

}
/* types of error
compile error - syntax error
logical error - compiles and runs fine, gives wrong answer code
runtime error - compiled, can't run

 */