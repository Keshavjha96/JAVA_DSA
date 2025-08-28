package loops;

public class continuestatement {
    public static void main(String[] args) {
//        for (int i=1;i<=100;i++){
//            if (i%2==0 || i%3==0){
//                if (i==41 || i==27)continue;
//                System.out.println(i);
//            }
//        }
        for (int i = 1; i <=100 ; i++) {
            System.out.println("Hello");
          if (i%2==1)continue;
            System.out.println(i);
        }
    }
}
