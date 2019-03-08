package com.Duotai;

public class TestDuotai {
    public static void main(String[] args){
        show(new CatCat());
        show(new DogDog());

        DuoTaiAnimal a = new CatCat();
        a.eat();
        CatCat c = (CatCat)a;
        c.work();
    }
    public static void show(DuoTaiAnimal a){
        a.eat();
        if (a instanceof CatCat){
            CatCat c = (CatCat)a;
            c.work();
        }else if (a instanceof DogDog){
            DogDog c = (DogDog)a;
            c.work();
        }
    }
}
abstract class DuoTaiAnimal{
    abstract void eat();
}

class CatCat extends DuoTaiAnimal{
    public void eat(){
        System.out.println("吃鱼");
    }
    public void work(){
        System.out.println("抓老鼠");
    }
}

class DogDog extends DuoTaiAnimal{
    public void eat(){
        System.out.println("吃骨头");
    }
    public void work(){
        System.out.println("看家");
    }
}