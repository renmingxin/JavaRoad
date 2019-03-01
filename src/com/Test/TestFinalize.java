package com.Test;

public class TestFinalize {
    public static void main(String[] args){
        Cake c1 = new Cake(1);
        Cake c2 = new Cake(2);
        Cake c3 = new Cake(3);

        c2 = c3 = null;
        System.gc();
    }

}
class Cake extends Object{
    private int id;
    public Cake(int id){
        this.id = id;
        System.out.println("创建" + id );
    }
    protected void finalize() throws java.lang.Throwable{
        super.finalize();
        System.out.println("销毁"+ id);
    }
}
