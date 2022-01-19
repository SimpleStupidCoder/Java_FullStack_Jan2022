package com.javaacademy;

public class Class03Array {
    public static void main(String[] args) {
        //array - contiguous memory location
        //0 index based construct
        int[] arr1=new int[10];
        arr1[0]=10;
        arr1[1]=5;
        arr1[2]=7;
        arr1[3]=9;
        arr1[4]=19;
        arr1[5]=29;
        arr1[6]=90;
        arr1[7]=80;
        arr1[8]=78;
        arr1[9]=89;

        char arr2[]=new char[5];

        System.out.print("\nAll even nos. in the array: ");
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]%2==0){
                System.out.print(arr1[i]+"\t");
            }
        }

        //for-each loop/advance for loop
        System.out.print("\nAll odd nos. in the array (advance for loop): ");
        for(int ele: arr1){
            if(ele%2!=0){
                System.out.print(ele+"\t");
            }
        }

        String name="Java trainer";
        String[] names={"Java","C","C++","Python","R"};//array of Strings
        for (String s : names) {
            System.out.print("\n"+s);
            if (s.equals("C") || s.equals("C++")) {
                System.out.print(": Primitive programming language");
            } else {
                System.out.print(": Modern programming language");
            }
        }

        //2D array
        int[][] a2d = new int[5][];
        a2d[0]=new int[5];
        a2d[1]=new int[10];
        a2d[2]=new int[2];
        a2d[3]=new int[7];
        a2d[4]=new int[9];
        System.out.println("\n2D array example: ");
        for(int row=0;row<a2d.length;row++){
            for(int col=0,ele=1;col<a2d[row].length;col++,ele++){
                a2d[row][col]=ele;
            }
        }

        for(int[] row:a2d) {
            for (int ele : row) {
                System.out.print(ele + "\t");
            }
            System.out.println();
        }
    }
}
