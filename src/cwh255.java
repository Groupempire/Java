public class cwh255 {
    public static void main(String[] args) {
       while(true){ for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.print("\n");
        }
        for (int i = 6; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            if(i==1) continue;
            System.out.print("\n");
        }
           for (int i = 6; i > 0; i--) {
               for (int j = 0; j < i; j++) {
                   System.out.print("*");
               }
               if(i==1) continue;
               System.out.print("\n");
           }


    }


    }
}
