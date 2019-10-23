package cn.edu.whut.msims.bean;

import java.sql.Date;


public class EmePlanInfo {
    private String plan_num;  //版本号
    private String plan_name; // 预案名称
    private Date plan_time;   //颁布时间
    private String plan_class;//预案类别
    private String admin_id;  //上传人
    private Date plan_date;   //上传时间
    private String plan_path; //上传文件

    public String getPlan_num() {
        return plan_num;
    }

    public void setPlan_num(String plan_num) {
        this.plan_num = plan_num;
    }

    public String getPlan_name() {
        return plan_name;
    }

    public void setPlan_name(String plan_name) {
        this.plan_name = plan_name;
    }

    public Date getPlan_time() {
        return plan_time;
    }

    public void setPlan_time(Date plan_time) {
        this.plan_time = plan_time;
    }

    public String getPlan_class() {
        return plan_class;
    }

    public void setPlan_class(String plan_class) {
        this.plan_class = plan_class;
    }

    public String getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id;
    }

    public Date getPlan_date() {
        return plan_date;
    }

    public void setPlan_date(Date plan_date) {
        this.plan_date = plan_date;
    }

    public String getPlan_path() {
        return plan_path;
    }

    public void setPlan_path(String plan_path) {
        this.plan_path = plan_path;
    }

    @Override
    public String toString() {
        return "EmePlanInfo{" +
                "plan_num='" + plan_num + '\'' +
                ", plan_name='" + plan_name + '\'' +
                ", plan_time=" + plan_time +
                ", plan_class='" + plan_class + '\'' +
                ", admin_id='" + admin_id + '\'' +
                ", plan_date=" + plan_date +
                ", plan_path='" + plan_path + '\'' +
                '}';
    }
}
