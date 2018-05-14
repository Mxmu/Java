package cn.itcase.demo46;
public class StringTest {
    public static void main(String[] args) {
        getCount("hkahfka234AFF");
        System.out.println(toConvert("AVADAfaf"));
        System.out.println(getStringCount("javajavajva","java"));
    }
    public static int getStringCount(String str,String key){
        int count=0;
        int index=0;
        while((index=str.indexOf(key))!=-1){
            count++;
            str=str.substring(index+key.length());
        }
        return count;
    }
    public static String toConvert(String str){
        String first=str.substring(0,1);
        String after=str.substring(1);
        first=first.toUpperCase();
        after=after.toLowerCase();
        return first+after;
    }
    public static void getCount(String str){
        int upper=0;
        int lower=0;
        int digit=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c>=65&&c<=90){
                upper++;
            }
            else if(c>=97&&c<=122){
                lower++;
            }
            else if(c>=48&&c<=57){
                digit++;
            }
        }
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(digit);
    }
}
