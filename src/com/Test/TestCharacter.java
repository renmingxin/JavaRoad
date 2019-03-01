package com.Test;

public class TestCharacter {
    public static void main(String[] args){
        char[] charArray ={ 'a', 'b', 'c', 'd', 'e' };
        char ah = 'a';
        Character bh = new Character('b');
        Character ch ='c';
        System.out.print(charArray);
        System.out.print('\n');
        System.out.print(ah);
        System.out.print(bh);
        System.out.print(ch);
        System.out.print('\t');
        System.out.print(Character.toUpperCase(ah));
    }
}
