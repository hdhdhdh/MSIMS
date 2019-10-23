package cn.edu.whut.msims.bean;

public class SpecialInfo
{
    private  String employ_num;
    private  String special_class;
    private  String special_project ;
    private  String admin_id;
    private  String special_note;
    private  String special_id;
    private  String special_first_date;
    private  String special_exch_date;
    private  String special_date;
    private  String special_recheck_date;
    private  String special_expiry_date;

    public String getEmploy_num() {
        return employ_num;
    }

    public void setEmploy_num(String employ_num) {
        this.employ_num = employ_num;
    }

    public String getSpecial_class() {
        return special_class;
    }

    public void setSpecial_class(String special_class) {
        this.special_class = special_class;
    }

    public String getSpecial_project() {
        return special_project;
    }

    public void setSpecial_project(String special_project) {
        this.special_project = special_project;
    }

    public String getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id;
    }

    public String getSpecial_note() {
        return special_note;
    }

    public void setSpecial_note(String special_note) {
        this.special_note = special_note;
    }

    public String getSpecial_id() {
        return special_id;
    }

    public void setSpecial_id(String special_id) {
        this.special_id = special_id;
    }

    public String getSpecial_first_date() {
        return special_first_date;
    }

    public void setSpecial_first_date(String special_first_date) {
        this.special_first_date = special_first_date;
    }

    public String getSpecial_exch_date() {
        return special_exch_date;
    }

    public void setSpecial_exch_date(String special_exch_date) {
        this.special_exch_date = special_exch_date;
    }

    public String getSpecial_date() {
        return special_date;
    }

    public void setSpecial_date(String special_date) {
        this.special_date = special_date;
    }

    public String getSpecial_recheck_date() {
        return special_recheck_date;
    }

    public void setSpecial_recheck_date(String special_recheck_date) {
        this.special_recheck_date = special_recheck_date;
    }

    public String getSpecial_expiry_date() {
        return special_expiry_date;
    }

    public void setSpecial_expiry_date(String special_expiry_date) {
        this.special_expiry_date = special_expiry_date;
    }

    @Override
    public String toString() {
        return "SpecialInfo{" +
                "employ_num='" + employ_num + '\'' +
                ", special_class='" + special_class + '\'' +
                ", special_project='" + special_project + '\'' +
                ", admin_id='" + admin_id + '\'' +
                ", special_note='" + special_note + '\'' +
                ", special_id='" + special_id + '\'' +
                ", special_first_date='" + special_first_date + '\'' +
                ", special_exch_date='" + special_exch_date + '\'' +
                ", special_date='" + special_date + '\'' +
                ", special_recheck_date='" + special_recheck_date + '\'' +
                ", special_expiry_date='" + special_expiry_date + '\'' +
                '}';
    }
}
