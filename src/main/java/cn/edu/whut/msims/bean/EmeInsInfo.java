package cn.edu.whut.msims.bean;

import java.sql.Date;


public class EmeInsInfo {
    private String instit_num;  //机构编号
    private String instit_name; //机构名称
    private String instit_func; //负责人
    private String instit_tel;  //电话
    private String admin_id;    //上传人
    private Date insti_date;    //上传时间

    public String getInstit_num() {
        return instit_num;
    }

    public void setInstit_num(String instit_num) {
        this.instit_num = instit_num;
    }

    public String getInstit_name() {
        return instit_name;
    }

    public void setInstit_name(String instit_name) {
        this.instit_name = instit_name;
    }

    public String getInstit_func() {
        return instit_func;
    }

    public void setInstit_func(String instit_func) {
        this.instit_func = instit_func;
    }

    public String getInstit_tel() {
        return instit_tel;
    }

    public void setInstit_tel(String instit_tel) {
        this.instit_tel = instit_tel;
    }

    public String getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id;
    }

    public Date getInsti_date() {
        return insti_date;
    }

    public void setInsti_date(Date insti_date) {
        this.insti_date = insti_date;
    }

    @Override
    public String toString() {
        return "EmeInsinfo{" +
                "instit_num='" + instit_num + '\'' +
                ", instit_name='" + instit_name + '\'' +
                ", instit_func='" + instit_func + '\'' +
                ", instit_tel='" + instit_tel + '\'' +
                ", admin_id='" + admin_id + '\'' +
                ", insti_date=" + insti_date +
                '}';
    }
}
