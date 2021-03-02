package com.oschina;

import java.util.List;

public class TableA {
    private String a;

    List<TableB> list;

    public List<TableB> getList() {
        return list;
    }

    public void setList(List<TableB> list) {
        this.list = list;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
}
