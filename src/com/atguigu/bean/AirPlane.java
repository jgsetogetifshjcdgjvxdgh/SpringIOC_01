package com.atguigu.bean;

public class AirPlane {
    private String jzName;
    private String fjsName;
    private Integer jyLength;

    public String getJzName() {
        return jzName;
    }

    public void setJzName(String jzName) {
        this.jzName = jzName;
    }

    public String getFjsName() {
        return fjsName;
    }

    public void setFjsName(String fjsName) {
        this.fjsName = fjsName;
    }

    public Integer getJyLength() {
        return jyLength;
    }

    public void setJyLength(Integer jyLength) {
        this.jyLength = jyLength;
    }

    @Override
    public String toString() {
        return "AirPlane{" +
                "jzName='" + jzName + '\'' +
                ", fjsName='" + fjsName + '\'' +
                ", jyLength=" + jyLength +
                '}';
    }
}
