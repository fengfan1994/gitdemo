package Test;

import java.io.UnsupportedEncodingException;
import java.util.Date;

public class SuperTest extends Date{
    private static final long serialVersionUID = 1L;
    private void test(){
        Date date=new Date();
        System.out.println(date.getClass());
        System.out.println(super.getClass());
    }

    public static void main(String[]args) throws UnsupportedEncodingException {
        byte[] bytes="fengfan".getBytes();
        String str=new String(bytes,"GBK");
        new SuperTest().test();
    }
}
