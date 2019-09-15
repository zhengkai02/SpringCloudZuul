package com.zk.eureka.VO;

public class TestParam {
    private int id;
    private String anme;

    public TestParam(int id, String anme) {
        this.id = id;
        this.anme = anme;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnme() {
        return anme;
    }

    public void setAnme(String anme) {
        this.anme = anme;
    }

    @Override
    public String toString() {
        return "testParam{" +
                "id=" + id +
                ", anme='" + anme + '\'' +
                '}';
    }
}
