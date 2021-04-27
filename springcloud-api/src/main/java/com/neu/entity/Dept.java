package com.neu.entity;

public class Dept {
    private int did;
    private String dept_name;

    public Dept() {
    }

    public Dept(int did, String dept_name) {
        this.did = did;
        this.dept_name = dept_name;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }
}
