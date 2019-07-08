package com.cay.ssm.entity;

public class Food {
    private Integer id;

    private String name;

    private String proTime;

    private String expDate;

    public Food(Integer id, String name, String proTime, String expDate) {
        this.id = id;
        this.name = name;
        this.proTime = proTime;
        this.expDate = expDate;
    }

    public Food() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getProTime() {
        return proTime;
    }

    public void setProTime(String proTime) {
        this.proTime = proTime == null ? null : proTime.trim();
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate == null ? null : expDate.trim();
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", proTime='" + proTime + '\'' +
                ", expDate='" + expDate + '\'' +
                '}';
    }
}