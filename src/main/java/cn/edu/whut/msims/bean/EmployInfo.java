package cn.edu.whut.msims.bean;


import java.sql.Date;

public class EmployInfo
{
    private String employ_num;
    private String employ_name;
    private String employ_sex;
    private String employ_ID;
    private String depart_num;
    private String employ_tel;
    private String employ_duty;
    private String employ_address;
    private String employ_passw;
    private Date employ_born;
    private Date employ_join;
    private Date employ_exit;

    public String getEmploy_num() {
        return employ_num;
    }

    public void setEmploy_num(String employ_num) {
        this.employ_num = employ_num;
    }

    public String getEmploy_name() {
        return employ_name;
    }

    public void setEmploy_name(String employ_name) {
        this.employ_name = employ_name;
    }

    public String getEmploy_sex() {
        return employ_sex;
    }

    public void setEmploy_sex(String employ_sex) {
        this.employ_sex = employ_sex;
    }

    public String getEmploy_ID() {
        return employ_ID;
    }

    public void setEmploy_ID(String employ_ID) {
        this.employ_ID = employ_ID;
    }

    public String getDepart_num() {
        return depart_num;
    }

    public void setDepart_num(String depart_num) {
        this.depart_num = depart_num;
    }

    public String getEmploy_tel() {
        return employ_tel;
    }

    public void setEmploy_tel(String employ_tel) {
        this.employ_tel = employ_tel;
    }

    public String getEmploy_duty() {
        return employ_duty;
    }

    public void setEmploy_duty(String employ_duty) {
        this.employ_duty = employ_duty;
    }

    public String getEmploy_address() {
        return employ_address;
    }

    public void setEmploy_address(String employ_address) {
        this.employ_address = employ_address;
    }

    public String getEmploy_passw() {
        return employ_passw;
    }

    public void setEmploy_passw(String employ_passw) {
        this.employ_passw = employ_passw;
    }

    public Date getEmploy_born() {
        return employ_born;
    }

    public void setEmploy_born(Date employ_born) {
        this.employ_born = employ_born;
    }

    public Date getEmploy_join() {
        return employ_join;
    }

    public void setEmploy_join(Date employ_join) {
        this.employ_join = employ_join;
    }

    public Date getEmploy_exit() {
        return employ_exit;
    }

    public void setEmploy_exit(Date employ_exit) {
        this.employ_exit = employ_exit;
    }

    @Override
    public String toString() {
        return "EmployInfo{" +
                "employ_num='" + employ_num + '\'' +
                ", employ_name='" + employ_name + '\'' +
                ", employ_sex='" + employ_sex + '\'' +
                ", employ_ID='" + employ_ID + '\'' +
                ", depart_num='" + depart_num + '\'' +
                ", employ_tel='" + employ_tel + '\'' +
                ", employ_duty='" + employ_duty + '\'' +
                ", employ_address='" + employ_address + '\'' +
                ", employ_passw='" + employ_passw + '\'' +
                ", employ_born=" + employ_born +
                ", employ_join=" + employ_join +
                ", employ_exit=" + employ_exit +
                '}';
    }
}
