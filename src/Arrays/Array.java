package Arrays;

public class Array {
    /*
    Array is DS that allows us to store multiple values of the same type in a sequential manner
     */
    public static void main(String[] args) {
        int[] marks = new int[10];
        marks[0] = 10;
        marks[2] = 50;
        marks[5] = 70;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks);

        float[] arr = new float[10];
        System.out.println(arr[2]);
        String[] names = {"luffy", "zoro", "Sanji"};
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names.length);
        for (int x:marks) {
            System.out.print(x+",");
        }
    }
}
