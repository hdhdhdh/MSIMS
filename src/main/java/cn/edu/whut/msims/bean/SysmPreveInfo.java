package cn.edu.whut.msims.bean;

import java.sql.Date;

public class SysmPreveInfo {
    private String preve_num;//发文字号
    private String preve_name;//文件名称
    private Date preve_sdate;//颁布时间
    private Date preve_edate;//实施时间
    private String preve_dep;//颁布部门
    private String preve_path;//上传文件
    private String admin_id;//上传人
    private Date preve_date;//上传时间

    public String getPreve_num() {
        return preve_num;
    }

    public void setPreve_num(String preve_num) {
        this.preve_num = preve_num;
    }

    public String getPreve_name() {
        return preve_name;
    }

    public void setPreve_name(String preve_name) {
        this.preve_name = preve_name;
    }

    public Date getPreve_sdate() {
        return preve_sdate;
    }

    public void setPreve_sdate(Date preve_sdate) {
        this.preve_sdate = preve_sdate;
    }

    public Date getPreve_edate() {
        return preve_edate;
    }

    public void setPreve_edate(Date preve_edate) {
        this.preve_edate = preve_edate;
    }

    public String getPreve_dep() {
        return preve_dep;
    }

    public void setPreve_dep(String preve_dep) {
        this.preve_dep = preve_dep;
    }

    public String getPreve_path() {
        return preve_path;
    }

    public void setPreve_path(String preve_path) {
        this.preve_path = preve_path;
    }

    public String getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id;
    }

    public Date getPreve_date() {
        return preve_date;
    }

    public void setPreve_date(Date preve_date) {
        this.preve_date = preve_date;
    }

    @Override
    public String toString() {
        return "SysmPreveInfo{" +
                "preve_num='" + preve_num + '\'' +
                ", preve_name='" + preve_name + '\'' +
                ", preve_sdate=" + preve_sdate +
                ", preve_edate=" + preve_edate +
                ", preve_dep='" + preve_dep + '\'' +
                ", preve_path='" + preve_path + '\'' +
                ", admin_id='" + admin_id + '\'' +
                ", preve_date=" + preve_date +
                '}';
    }
}
