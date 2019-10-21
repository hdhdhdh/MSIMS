package cn.edu.whut.msims.bean;

public class DnmSiteInfo {
    private String sie_id;
    private String site_place;

    public String getSie_id() {
        return sie_id;
    }

    public void setSie_id(String sie_id) {
        this.sie_id = sie_id;
    }

    public String getSite_place() {
        return site_place;
    }

    public void setSite_place(String site_place) {
        this.site_place = site_place;
    }

    @Override
    public String toString() {
        return "DnmSiteInfo{" +
                "sie_id='" + sie_id + '\'' +
                ", site_place='" + site_place + '\'' +
                '}';
    }
}
