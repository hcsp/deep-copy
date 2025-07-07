package com.github.hcsp;

import com.github.hcsp.pet.Cat;



// Complete deepCopy() method to make the program output "false"
// Return the deep copy of a Home instance
// 将传入的Home实例进行深拷贝，返回深拷贝后的实例


public class Main {
    public static void main(String[] args) {
        Home home = new Home ( new Cat("Tom"));
        Home deepCopy = deepCopy(home);
        System.out.println(home.cat == deepCopy.cat);
    }

    public static Home deepCopy(Home home) {
        Cat copiedCat = new Cat(home.cat.name); // 创建一个新的 Cat 实例
        Home copiedHome = new Home(copiedCat);  // 创建一个新的 Home 实例
        return copiedHome;
    }


    }
