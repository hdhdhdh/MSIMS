package cn.edu.whut.msims.bean;

import java.util.Date;

public class EmeDirInfo {
    private String dirll_num;
    private String dirll_name;
    private String dirll_year;
    private String employ_num;
    private String admin_id;
    private Date dirll_date;
    private String dirll_note;
    private String dirll_path;

    public String getDirll_num() {
        return dirll_num;
    }

    public void setDirll_num(String dirll_num) {
        this.dirll_num = dirll_num;
    }

    public String getDirll_name() {
        return dirll_name;
    }

    public void setDirll_name(String dirll_name) {
        this.dirll_name = dirll_name;
    }

    public String getDirll_year() {
        return dirll_year;
    }

    public void setDirll_year(String dirll_year) {
        this.dirll_year = dirll_year;
    }

    public String getEmploy_num() {
        return employ_num;
    }

    public void setEmploy_num(String employ_num) {
        this.employ_num = employ_num;
    }

    public String getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id;
    }

    public Date getDirll_date() {
        return dirll_date;
    }

    public void setDirll_date(Date dirll_date) {
        this.dirll_date = dirll_date;
    }

    public String getDirll_note() {
        return dirll_note;
    }

    public void setDirll_note(String dirll_note) {
        this.dirll_note = dirll_note;
    }

    public String getDirll_path() {
        return dirll_path;
    }

    public void setDirll_path(String dirll_path) {
        this.dirll_path = dirll_path;
    }

    @Override
    public String toString() {
        return "EmeDirInfo{" +
                "dirll_num='" + dirll_num + '\'' +
                ", dirll_name='" + dirll_name + '\'' +
                ", dirll_year='" + dirll_year + '\'' +
                ", employ_num='" + employ_num + '\'' +
                ", admin_id='" + admin_id + '\'' +
                ", dirll_date=" + dirll_date +
                ", dirll_note='" + dirll_note + '\'' +
                ", dirll_path='" + dirll_path + '\'' +
                '}';
    }
}
