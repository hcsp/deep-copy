package com.github.hcsp;

import com.github.hcsp.pet.Cat;

public class Main {
    public static void main(String[] args) {
        Home home = new Home(new Cat("Tom"));
        Home deepCopy = deepCopy(home);

        // Complete deepCopy() method to make the program output "false"
        // 补全deepCopy()方法，使得程序输出"false"
        System.out.println(home.cat == deepCopy.cat);
    }
    // Return the deep copy of a Home instance
    // 将传入的Home实例进行深拷贝，返回深拷贝后的实例
    public static Home deepCopy(Home home) {
        Home newHome = new Home(new Cat());
        newHome.cat = home.cat;
        return newHome;
    }
}
