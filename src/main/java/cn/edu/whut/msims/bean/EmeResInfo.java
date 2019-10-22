package cn.edu.whut.msims.bean;

public class EmeResInfo {
    private String rescue_num;//应急救援人员编号
    private String rescue_name;//姓名
    private String rescue_duty;//职务
    private String rescue_tel;//电话
    private String instit_num;//所在机构

    public String getRescue_num() {
        return rescue_num;
    }

    public void setRescue_num(String rescue_num) {
        this.rescue_num = rescue_num;
    }

    public String getRescue_name() {
        return rescue_name;
    }

    public void setRescue_name(String rescue_name) {
        this.rescue_name = rescue_name;
    }

    public String getRescue_duty() {
        return rescue_duty;
    }

    public void setRescue_duty(String rescue_duty) {
        this.rescue_duty = rescue_duty;
    }

    public String getRescue_tel() {
        return rescue_tel;
    }

    public void setRescue_tel(String rescue_tel) {
        this.rescue_tel = rescue_tel;
    }

    public String getInstit_num() {
        return instit_num;
    }

    public void setInstit_num(String instit_num) {
        this.instit_num = instit_num;
    }

    @Override
    public String toString() {
        return "EmeResInfo{" +
                "rescue_num='" + rescue_num + '\'' +
                ", rescue_name='" + rescue_name + '\'' +
                ", rescue_duty='" + rescue_duty + '\'' +
                ", rescue_tel='" + rescue_tel + '\'' +
                ", instit_num='" + instit_num + '\'' +
                '}';
    }
}
