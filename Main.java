import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args)
    {
//       1) ***

//        int array[] = new int[50];
//        for (int i = 1, j = 0; i <= 99; i = i + 2, j++) {
//            array[j] = i;
//            System.out.println(i);
//        }

//        ***

//        2) ***

//        int array[] = new int[20];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) Math.round(Math.random() * 9);
//            System.out.print("Стартовий масив ["+array[i]+"] замінюється -> [");
//
//
//            if (array[i] %2 != 0){array[i] = 0;}
//            System.out.println(array[i]+"]" );
//        }
//        System.out.println(" ");

//        ***

//    3) ***

//        int array1[] = new int[5];
//        int array2[] = new int[5];
//        int array3[] = new int[5];
//        double mid1 = 0, mid2 = 0, mid3 = 0 ;
//        System.out.println("Перший масив ");
//        for (int i = 0; i < 5; i++) {
//            array1[i] = (int) Math.round(Math.random() * 5);
//            mid1 = mid1 + array1[i];
//            System.out.print(array1[i] + " ");
//        }
//        System.out.println(" ");
//        System.out.println("Другий масив ");
//        for (int i = 0; i < 5; i++) {
//            array2[i] = (int) Math.round(Math.random() * 5);
//            mid2 = mid2 + array2[i];
//            System.out.print(array2[i] + " ");
//        }
//        System.out.println(" ");
//        System.out.println("Третій масив ");
//        for (int i = 0; i < 5; i++) {
//            array3[i] = (int) Math.round(Math.random() * 5);
//            mid3 = mid3 + array3[i];
//            System.out.print(array3[i] + " ");
//        }
//        System.out.println(" ");
//        System.out.println("mid = "+mid1+"; "+"mid = "+mid2+"; "+"mid = "+mid3);
//        System.out.println(" ");
//        if ((mid1 == mid2)&&(mid2 == mid3)){
//            System.out.println("Середнє арефметичне однакрве");}
//        else if ((mid1>mid2)&&(mid1>mid3)) {
//            System.out.println("Перший масив має найбільше сер. арфм.");}
//        else if ((mid2>mid1)&&(mid2>mid3)) {
//            System.out.println("Другий масив має найбільше сер. арфм.");}
//        else if ((mid3>mid2)&&(mid3>mid1)) {
//            System.out.println("Третій масив має найбільше сер. арфм.");}

//        ***

//        4) ***
//        int array1[]= new int[10];
//        int array2[]= new int[10];
//        int arraySum[]= new int[10];
//        System.out.println("Перший масив ");
//        for (int i = 0; i < array1.length; i++) {
//            array1[i] = (int) Math.round(Math.random() * 10);
//
//            System.out.print("["+array1[i] + "]");}
//        System.out.println(" ");
//        System.out.println("Другий  масив ");
//
//        for (int i = 0; i < array2.length; i++) {
//            array2[i] = (int) Math.round(Math.random() * 10);
//            System.out.print("["+array2[i] + "]");}
//        System.out.println(" ");
//        System.out.println(" Сума індексів масиву ");
//        for (int i = 0; i < arraySum.length; i++){
//            arraySum[i] = array1[i]+array2[i];
//            System.out.print("["+arraySum[i]+"]");
//        }
//        ***

////        5) ***
//    int array[] = new int[15];
//    for (int i = 0; i < array.length; i++) {
//        array[i] = (int) Math.round(Math.random() * 10);
//        System.out.print("["+array[i] + "]");}
//    System.out.println(" ");
//    int count = 0 ;
//    for (int e : array ){
//        if (e % 2 == 0){
//            count++;
//            System.out.print("["+e+"]");
//        }
//    }System.out.println(" ");
//        System.out.print("Парних елементів  = "+count);
//        ***

//        6) ***

//        int array[][]= new int[15][];
//        array[0]= new int [5];
//        array[1]= new int [5];
//        array[2]= new int [5];
//        array[3]= new int [5];
//        array[4]= new int [8];
//        array[5]= new int [8];
//        array[6]= new int [8];
//        array[7]= new int [8];
//        array[8]=new int [3];
//        array[9]= new int [3];
//        array[10]= new int [3];
//        array[11]= new int [3];
//        array[12]= new int [9];
//        array[13]= new int [9];
//        array[14]= new int [9];
//        for (int i = 0; i < array.length; i++){
//            for (int j = 0; j < array[i].length;j++){
//                array[i][j]=(int)(Math.random()*15);
//                System.out.print("["+array[i][j]+"]");
//            }
//            System.out.println(" ");
//        }

//        ***

//        7) ***

//        int array[][]= new int[7][7];
//        for (int  i = 0;i<array.length;i++){
//            int sum = 0;
//            for (int j =0;j<array[i].length;j++){
//                int num = (int)(Math.random()*7);
//                array[i][j] = num;
//                System.out.print("["+array[i][j]+"]");
//                sum += num;}
//            System.out.println(" = "+sum+ " сума стрічки ");
//            }
//            System.out.println(" ");

//        ***
    }
}