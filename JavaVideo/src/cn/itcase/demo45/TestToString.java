package cn.itcase.demo45;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class TestToString {
    public static void main(String[] args) {
        Person p=new Person("张三",20);
        String s=p.toString();
        System.out.println(s);
        Random r=new Random();
        System.out.println(r.toString());
        Scanner sc=new Scanner(System.in);
        System.out.println(sc.toString());
    }
}
