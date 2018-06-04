package 第二章;

public class LeapYear {
    int year,month,day;
    void setdate(int y,int m,int d){
        year=y;
        month=m;
        day=d;
    }
    boolean isleapyear(){
        return(year%400==0)|(year%100!=0)&(year%4==0);
    }
    void print(){
        System.out.println("Date is "+year+'-'+month+'-'+day);
    }
    public static void main(String[] args){
        LeapYear a=new LeapYear();
        a.setdate(2012,12,25);
        a.print();
        System.out.println(a.year+" is a leap year?"+a.isleapyear());
    }
}
