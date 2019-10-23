package cn.edu.whut.msims.bean;

import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;

import java.sql.Date;

public class LxmQualInfo {
    private String qual_num;//证书编号
    private String qual_class;//证书类型
    private Date qual_sdate;//有效期（起）
    private Date qual_edate;//有效期（止）
    private String qual_office;//发证机关
    private Date qual_time;//发证时间
    private String admin_id;//上传人
    private Date qual_date;//上传时间

    public String getQual_num() {
        return qual_num;
    }

    public void setQual_num(String qual_num) {
        this.qual_num = qual_num;
    }

    public String getQual_class() {
        return qual_class;
    }

    public void setQual_class(String qual_class) {
        this.qual_class = qual_class;
    }

    public Date getQual_sdate() {
        return qual_sdate;
    }

    public void setQual_sdate(Date qual_sdate) {
        this.qual_sdate = qual_sdate;
    }

    public Date getQual_edate() {
        return qual_edate;
    }

    public void setQual_edate(Date qual_edate) {
        this.qual_edate = qual_edate;
    }

    public String getQual_office() {
        return qual_office;
    }

    public void setQual_office(String qual_office) {
        this.qual_office = qual_office;
    }

    public Date getQual_time() {
        return qual_time;
    }

    public void setQual_time(Date qual_time) {
        this.qual_time = qual_time;
    }

    public String getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id;
    }

    public Date getQual_date() {
        return qual_date;
    }

    public void setQual_date(Date qual_date) {
        this.qual_date = qual_date;
    }

    @Override
    public String toString() {
        return "LxmQuelInfo{" +
                "qual_num='" + qual_num + '\'' +
                ", qual_class='" + qual_class + '\'' +
                ", qual_sdate=" + qual_sdate +
                ", qual_edate=" + qual_edate +
                ", qual_office='" + qual_office + '\'' +
                ", qual_time=" + qual_time +
                ", admin_id='" + admin_id + '\'' +
                ", qual_date=" + qual_date +
                '}';
    }
}
