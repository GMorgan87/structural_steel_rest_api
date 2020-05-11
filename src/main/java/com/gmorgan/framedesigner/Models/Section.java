package com.gmorgan.framedesigner.Models;

import javax.persistence.*;

@Entity
@Table(name="sections")

public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String desc;

    @Column
    private double csa;

    @Column
    private double ixx;

    @Column
    private double iyy;

    @Column
    private double zxx;

    @Column
    private double zyy;

    @Column
    private double thk;

    @Column
    private int x;

    @Column
    private int y;

    @Column
    private double mass;

    public Section(String desc, double csa, double ixx, double iyy, double zxx, double zyy, double thk, int x, int y, double mass) {
        this.desc = desc;
        this.csa = csa;
        this.ixx = ixx;
        this.iyy = iyy;
        this.zxx = zxx;
        this.zyy = zyy;
        this.thk = thk;
        this.x = x;
        this.y = y;
        this.mass = mass;
    }

    public Section() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getCsa() {
        return csa;
    }

    public void setCsa(double csa) {
        this.csa = csa;
    }

    public double getIxx() {
        return ixx;
    }

    public void setIxx(double ixx) {
        this.ixx = ixx;
    }

    public double getIyy() {
        return iyy;
    }

    public void setIyy(double iyy) {
        this.iyy = iyy;
    }

    public double getZxx() {
        return zxx;
    }

    public void setZxx(double zxx) {
        this.zxx = zxx;
    }

    public double getZyy() {
        return zyy;
    }

    public void setZyy(double zyy) {
        this.zyy = zyy;
    }

    public double getThk() {
        return thk;
    }

    public void setThk(double thk) {
        this.thk = thk;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }
}
