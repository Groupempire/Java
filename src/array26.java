import  java .util.Scanner;
public class array26 {
    public static void main(String[] args) {
        Scanner val =new Scanner(System.in);
        System.out.println("enter size of arrays: ");
        int n= val.nextInt();

int classm []= new int [n];
classm[0]=46;
        System.out.printf("value of classm is " + classm[0] +" \n");
        for (int i = 0; i <n ; i++) {
          classm [i]= val.nextInt();
        }
        System.out.println(" value of arrays is ");
        for (int i = 0; i <n ; i++) {
            System.out.print(" " + classm[i]);
        }
        System.out.println(true);
            /*
           1.  int harish[] = new int [...]
           2.  int harish[];
                harish = new int [...];
           3. int harish ={ 1, 2, 2, 3 };



             */

        int harish[] ={ 1, 2, 2, 3 };
        for (int i = 0; i < 4; i++) {
            System.out.print(harish[i]);
        }
        System.out.println();

int m[] ;
     m = new int[5]  ;
    // m[5] = val.nextInt();
        System.out.println(" sise of array si " + m.length);

    }
}
