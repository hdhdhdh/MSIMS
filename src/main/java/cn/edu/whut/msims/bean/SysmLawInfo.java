package cn.edu.whut.msims.bean;

import java.util.Date;

import cn.edu.whut.msims.dao.SysmLawDao;
public class SysmLawInfo {
    private  String law_num;//发文字号
    private  String law_class;//法律法规类别
    private  String law_name;//法律法规标准名称
    private  Date law_sdate;//颁布时间
    private  Date law_edate;//实施时间
    private  String law_dep;//颁布部门
    private  String law_checker;//审核人
    private  Date law_checktime;//审核时间
    private  String law_note;//备注
    private  String law_admin_id;//上传人
    private  Date law_date;//上传时间


    public String getLaw_num() {
        return law_num;
    }

    public void setLaw_num(String law_num) {
        this.law_num = law_num;
    }

    public String getLaw_class() {
        return law_class;
    }

    public void setLaw_class(String law_class) {
        this.law_class = law_class;
    }

    public String getLaw_name() {
        return law_name;
    }

    public void setLaw_name(String law_name) {
        this.law_name = law_name;
    }

    public Date getLaw_sdate() {
        return law_sdate;
    }

    public void setLaw_sdate(Date law_sdate) {
        this.law_sdate = law_sdate;
    }

    public Date getLaw_edate() {
        return law_edate;
    }

    public void setLaw_edate(Date law_edate) {
        this.law_edate = law_edate;
    }

    public String getLaw_dep() {
        return law_dep;
    }

    public void setLaw_dep(String law_dep) {
        this.law_dep = law_dep;
    }

    public String getLaw_checker() {
        return law_checker;
    }

    public void setLaw_checker(String law_checker) {
        this.law_checker = law_checker;
    }

    public Date getLaw_checktime() {
        return law_checktime;
    }

    public void setLaw_checktime(Date law_checktime) {
        this.law_checktime = law_checktime;
    }

    public String getLaw_note() {
        return law_note;
    }

    public void setLaw_note(String law_note) {
        this.law_note = law_note;
    }

    public String getLaw_admin_id() {
        return law_admin_id;
    }

    public void setLaw_admin_id(String law_admin_id) {
        this.law_admin_id = law_admin_id;
    }

    public Date getLaw_date() {
        return law_date;
    }

    public void setLaw_date(Date law_date) {
        this.law_date = law_date;
    }

    @Override
    public String toString() {
        return "SysmLawInfo{" +
                "law_num='" + law_num + '\'' +
                ", law_class='" + law_class + '\'' +
                ", law_name='" + law_name + '\'' +
                ", law_sdate=" + law_sdate +
                ", law_edate=" + law_edate +
                ", law_dep='" + law_dep + '\'' +
                ", law_checker='" + law_checker + '\'' +
                ", law_checktime=" + law_checktime +
                ", law_note='" + law_note + '\'' +
                ", law_admin_id='" + law_admin_id + '\'' +
                ", law_date=" + law_date +
                '}';
    }
}
