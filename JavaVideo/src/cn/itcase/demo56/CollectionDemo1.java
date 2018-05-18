package cn.itcase.demo56;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo1 {
    public static void main(String[] args) {
        //集合中,不指定存储的数据类型,集合什么都存
        Collection coll=new ArrayList();
        coll.add("233");
        coll.add("111");
        Iterator it=coll.iterator();
        while(it.hasNext())
        {
            //Object obj=it.next();
            //System.out.println(obj);
            String s=(String)it.next();
            System.out.println(s.length());
        }
    }
}
