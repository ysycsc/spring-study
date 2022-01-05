package com.yy.dao;

import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author shkstart
 * @create 2021-12-30 16:47
 */
public class Student {
    private String name;
    private dao address;
    private String[] books;
    private List<String> hobbys;
    private Map<String,String> card;
    private String wife;
    private Properties info;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(dao address) {
        this.address = address;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public void setHobbys(List<String> hobbys) {
        this.hobbys = hobbys;
    }

    public void setCard(Map<String, String> card) {
        this.card = card;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", books=" + Arrays.toString(books) +
                ", hobbys=" + hobbys +
                ", card=" + card +
                ", wife='" + wife + '\'' +
                ", info=" + info +
                '}';
    }
}
