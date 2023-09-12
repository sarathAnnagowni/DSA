package com;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.Objects;

public class BeanUtils {

    public static void main (String[] args) throws Exception {
        Address address=new Address(1,"horamavu","banaswadi","bengaluru");
        Address address1=new Address(2,"horamavu","banaswadi","bengaluru");
        Address address2=new Address(1,"horamavu","banaswadi","bengaluru");

        Person p1 = new Person("1", "Mike", address);
        Person p2 = new Person("1", "Julia", address1);
        Person p3 = new Person("1", "Mike", address2);
        System.out.println(haveSamePropertyValues(Address.class,address,address1));
       /* boolean b = BeanUtils.haveSamePropertyValues(Person.class, p1, p2);
        System.out.println(b);

        b = BeanUtils.haveSamePropertyValues(Person.class, p1, p3);
        System.out.println(b);*/
    }
    public static <T> boolean haveSamePropertyValues (Class<T> type, T t1, T t2)
            throws Exception {

        BeanInfo beanInfo = Introspector.getBeanInfo(type);
        for (PropertyDescriptor pd : beanInfo.getPropertyDescriptors()) {
            Method m = pd.getReadMethod();
            Object o1 = m.invoke(t1);
            Object o2 = m.invoke(t2);
            if (!Objects.equals(o1, o2)) {
                return false;
            }
        }
        return true;
    }

}
class Person {
    private String id;
    private String name;
    private Address address;

    public Person (String id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getId () {
        return id;
    }

    public void setId (String id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Person person = (Person) o;

        return id != null ? id.equals(person.id) : person.id == null;
    }

    @Override
    public int hashCode () {
        return id != null ? id.hashCode() : 0;
    }
}

class Address{
    int aid;
    String addressLine1;
    String addressLine2;

    public Address(int aid) {
        this.aid = aid;
    }

    public Address(int aid, String addressLine1, String addressLine2, String addressLine3) {
        this.aid = aid;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
    }

    String addressLine3;


}
