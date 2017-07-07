package javabean;

import org.junit.Test;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by chen on 06/07/2017.
 */
public class Demo1 {
    @Test
    public void test1() throws IntrospectionException {
       BeanInfo info = Introspector.getBeanInfo(Person.class);
       PropertyDescriptor[] pds = info.getPropertyDescriptors();
       for( PropertyDescriptor pd : pds){
           System.out.println(pd.getName());
       }
    }

    //操作BEAN里面的一个属性
    @Test
    public void test2() throws IntrospectionException, InvocationTargetException, IllegalAccessException {
        Person p = new Person();
        PropertyDescriptor pd = new PropertyDescriptor("age",Person.class);
        Method method = pd.getWriteMethod(); //SET age
        method.invoke(p,30);

        System.out.println(p.getAge());

    }
}
