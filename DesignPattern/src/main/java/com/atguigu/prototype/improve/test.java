package com.atguigu.prototype.improve;

public class test {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("喜洋洋", 2, "white");
        Sheep clone = (Sheep)sheep.clone();
        System.out.println(clone == sheep);

    }
}
