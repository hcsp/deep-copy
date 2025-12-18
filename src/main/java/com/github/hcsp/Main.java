package com.github.hcsp;

import com.github.hcsp.pet.Cat;

public class Main {
    public static void main(String[] args) {   // 程序入口
        Home home = new Home(new Cat("Tom"));   //new 了一个home对象 一个cat对象 赋值Tom string给name成员变量
        Home deepCopy = deepCopy(home);    // 调用deepcopy方法 传递home参数

        // Complete deepCopy() method to make the program output "false"
        System.out.println(home.cat == deepCopy.cat);
    }
    // Return the deep copy of a Home instance
    // 将传入的Home实例进行深拷贝，返回深拷贝后的实例
    public static Home deepCopy(Home home) {
        Home newHome = new Home(new Cat("Tom"));
        return newHome;
    }
}
