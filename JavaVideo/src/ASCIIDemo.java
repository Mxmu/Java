/* char存储汉字，查询Unicode编码表
 * char类型取值为0~65535，无符号的数据类型
 * char可以和int计算，提升为int类型，内存中两个字节*/
public class ASCIIDemo {
    public static void main(String[] args)
    {
        char c='a';
        int i=c+1;
        System.out.println(c);
        System.out.println(i);
        int j=90;
        char h=(char)j;
        System.out.println(h);
        System.out.println((char)7);
        char k='你';
        System.out.println(k);
    }
}
