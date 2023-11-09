package com.start;

public class main {
    public static void main(String[] args) {
        main m = new main();
        m.xyz(m.add2(10));
    }
    public void xyz(int a){
        System.out.println("No. " + a);
//        public void yzx(){
//            System.out.println("Hello");
//        }
//        yzx();
    }
    public int add2(int x){
        return x+2;
    }
}
