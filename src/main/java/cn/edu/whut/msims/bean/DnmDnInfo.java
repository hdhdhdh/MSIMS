package cn.edu.whut.msims.bean;

import java.sql.Date;

public class DnmDnInfo {
    private int duno_num;
    private String site_id;
    private double duno_dust1;
    private double duno_dust2;
    private double duno_dust3;
    private double duno_dusta;
    private double duno_noise1;
    private double duno_noise2;
    private double duno_noise3;
    private double duno_noisea;
    private double duno_room;
    private String duno_name;
    private Date duno_date;

    public int getDuno_num() {
        return duno_num;
    }

    public void setDuno_num(int duno_num) {
        this.duno_num = duno_num;
    }

    public String getSite_id() {
        return site_id;
    }

    public void setSite_id(String site_id) {
        this.site_id = site_id;
    }

    public double getDuno_dust1() {
        return duno_dust1;
    }

    public void setDuno_dust1(double duno_dust1) {
        this.duno_dust1 = duno_dust1;
    }

    public double getDuno_dust2() {
        return duno_dust2;
    }

    public void setDuno_dust2(double dunno_dust2) {
        this.duno_dust2 = dunno_dust2;
    }

    public double getDuno_dust3() {
        return duno_dust3;
    }

    public void setDuno_dust3(double duno_dust3) {
        this.duno_dust3 = duno_dust3;
    }

    public double getDuno_dusta() {
        return duno_dusta;
    }

    public void setDuno_dusta(double duno_dusta) {
        this.duno_dusta = duno_dusta;
    }

    public double getDuno_noise1() {
        return duno_noise1;
    }

    public void setDuno_noise1(double duno_noise1) {
        this.duno_noise1 = duno_noise1;
    }

    public double getDuno_noise2() {
        return duno_noise2;
    }

    public void setDuno_noise2(double duno_noise2) {
        this.duno_noise2 = duno_noise2;
    }

    public double getDuno_noise3() {
        return duno_noise3;
    }

    public void setDuno_noise3(double duno_noise3) {
        this.duno_noise3 = duno_noise3;
    }

    public double getDuno_noisea() {
        return duno_noisea;
    }

    public void setDuno_noisea(double duno_noisea) {
        this.duno_noisea = duno_noisea;
    }

    public double getDuno_room() {
        return duno_room;
    }

    public void setDuno_room(double duno_room) {
        this.duno_room = duno_room;
    }

    public String getDuno_name() {
        return duno_name;
    }

    public void setDuno_name(String duno_name) {
        this.duno_name = duno_name;
    }

    public Date getDuno_date() {
        return duno_date;
    }

    public void setDuno_date(Date duno_date) {
        this.duno_date = duno_date;
    }

    @Override
    public String toString() {
        return "DnmDnInfo{" +
                "duno_num=" + duno_num +
                ", site_id='" + site_id + '\'' +
                ", duno_dust1=" + duno_dust1 +
                ", dunno_dust2=" + duno_dust2 +
                ", duno_dust3=" + duno_dust3 +
                ", duno_dusta=" + duno_dusta +
                ", duno_noise1=" + duno_noise1 +
                ", duno_noise2=" + duno_noise2 +
                ", duno_noise3=" + duno_noise3 +
                ", duno_noisea=" + duno_noisea +
                ", duno_room=" + duno_room +
                ", duno_name='" + duno_name + '\'' +
                ", duno_date=" + duno_date +
                '}';
    }
}

