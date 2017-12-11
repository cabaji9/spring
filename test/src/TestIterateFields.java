import java.lang.reflect.Field;

/**
 * Created by Hyun Woo Son on 11/16/17.
 */
public class TestIterateFields {


    public static void main(String args[]) throws Exception{
        A a = new A();
        a.setB("B");
        a.setC("C");

        Field[] fields=    a.getClass().getDeclaredFields();

        for(Field field:fields){
            field.setAccessible(true);
           String value =(String)field.get(a);
            System.out.println(value);
            System.out.println("type is : "+ field.getType());
            System.out.println(field.getType().equals(java.lang.String.class));


        }


    }
}


class A{

    private String b;
    private String c;
    private Integer d;

    public Integer getD() {
        return d;
    }

    public void setD(Integer d) {
        this.d = d;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
}