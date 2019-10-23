package cn.edu.whut.msims.bean;

import java.sql.Date;

public class DnmMineInfo {
    private int mine_num;
    private String site_id;
    private double mine_speed;
    private double mine_area;
    private double mine_amount;
    private String mine_direct;
    private double mine_dust;
    private int mine_co;
    private double mine_temp;
    private String mine_name;
    private Date mine_date;

    public int getMine_num() {
        return mine_num;
    }

    public void setMine_num(int mine_num) {
        this.mine_num = mine_num;
    }

    public String getSite_id() {
        return site_id;
    }

    public void setSite_id(String site_id) {
        this.site_id = site_id;
    }

    public double getMine_speed() {
        return mine_speed;
    }

    public void setMine_speed(double mine_speed) {
        this.mine_speed = mine_speed;
    }

    public double getMine_area() {
        return mine_area;
    }

    public void setMine_area(double mine_area) {
        this.mine_area = mine_area;
    }

    public double getMine_amount() {
        return mine_amount;
    }

    public void setMine_amount(double mine_amount) {
        this.mine_amount = mine_amount;
    }

    public String getMine_direct() {
        return mine_direct;
    }

    public void setMine_direct(String mine_direct) {
        this.mine_direct = mine_direct;
    }

    public double getMine_dust() {
        return mine_dust;
    }

    public void setMine_dust(double mine_dust) {
        this.mine_dust = mine_dust;
    }

    public int getMine_co() {
        return mine_co;
    }

    public void setMine_co(int mine_co) {
        this.mine_co = mine_co;
    }

    public double getMine_temp() {
        return mine_temp;
    }

    public void setMine_temp(double mine_temp) {
        this.mine_temp = mine_temp;
    }

    public String getMine_name() {
        return mine_name;
    }

    public void setMine_name(String mine_name) {
        this.mine_name = mine_name;
    }

    public Date getMine_date() {
        return mine_date;
    }

    public void setMine_date(Date mine_date) {
        this.mine_date = mine_date;
    }

    @Override
    public String toString() {
        return "DnmMineInfo{" +
                "mine_num=" + mine_num +
                ", site_id='" + site_id + '\'' +
                ", mine_speed=" + mine_speed +
                ", mine_area=" + mine_area +
                ", mine_amount=" + mine_amount +
                ", mine_direct='" + mine_direct + '\'' +
                ", mine_dust=" + mine_dust +
                ", mine_co=" + mine_co +
                ", mine_temp=" + mine_temp +
                ", mine_name='" + mine_name + '\'' +
                ", mine_date=" + mine_date +
                '}';
    }
}
