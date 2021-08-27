package programmingbootcamp;

public class main {
    public int countEvenNum (int arr[], int size){
        int count;
        count= 0;
        for(int i =0; i < size;  i++){
            int num1 = arr[i];
            int num2 = num1 % 2;
            if (num2 == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]) {
        int [] foo = {0,1,2,3,4};
        int [] bar = new int[100];
        for (int i=0; i<100; i++){
            bar[i]=i;
        }
        main m = new main ();
        System.out.println("The number of even numbers in foo is:");
        System.out.println(m.countEvenNum(foo,5));
        System.out.println("The number of even numbers in bar is:");
        System.out.println(m.countEvenNum(bar,100));
    }
}
