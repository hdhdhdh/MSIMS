package cn.edu.whut.msims.bean;

import java.sql.Date;


public class EmeResouInfo {
    private String resou_num;//物资编号
    private String resou_name;//物资名称
    private String resou_amount;//物资数量
    private Date resou_date;    //有效期
    private String resou_note;  //备注
    private String instit_num;  //机构编号

    public String getResou_num() {
        return resou_num;
    }

    public void setResou_num(String resou_num) {
        this.resou_num = resou_num;
    }

    public String getResou_name() {
        return resou_name;
    }

    public void setResou_name(String resou_name) {
        this.resou_name = resou_name;
    }

    public String getResou_amount() {
        return resou_amount;
    }

    public void setResou_amount(String resou_amount) {
        this.resou_amount = resou_amount;
    }

    public Date getResou_date() {
        return resou_date;
    }

    public void setResou_date(Date resou_date) {
        this.resou_date = resou_date;
    }

    public String getResou_note() {
        return resou_note;
    }

    public void setResou_note(String resou_note) {
        this.resou_note = resou_note;
    }

    public String getInstit_num() {
        return instit_num;
    }

    public void setInstit_num(String instit_num) {
        this.instit_num = instit_num;
    }

    @Override
    public String toString() {
        return "EmeResouInfo{" +
                "resou_num='" + resou_num + '\'' +
                ", resou_name='" + resou_name + '\'' +
                ", resou_amount='" + resou_amount + '\'' +
                ", resou_date=" + resou_date +
                ", resou_note='" + resou_note + '\'' +
                ", instit_num='" + instit_num + '\'' +
                '}';
    }
}
