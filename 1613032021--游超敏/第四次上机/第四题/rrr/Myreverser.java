package 第四题.rrr;

import 第四题.aaa.bbb.Stack;

public class Myreverser {
    public String input;
    public String output;
    public Myreverser(String myinput){
        input=myinput;
    }
    public void reverse(){
        int length=input.length();
        char[] Arrays=input.toCharArray();
        Stack stack=new Stack(length);
        for(int i=0;i<length;i++){
            stack.push(Arrays[i]);
        }
        for(int m=0;m<length;m++){
            Arrays[m]=stack.pop();
            System.out.println(Arrays[m]);
        }
        output=String.valueOf(Arrays);
    }
}

