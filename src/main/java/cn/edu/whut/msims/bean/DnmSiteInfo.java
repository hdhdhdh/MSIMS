package cn.edu.whut.msims.bean;

public class DnmSiteInfo {
    private String site_id;
    private String site_place;

    public String getSite_id() {
        return site_id;
    }

    public void setSite_id(String site_id) {
        this.site_id = site_id;
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
                "sie_id='" + site_id + '\'' +
                ", site_place='" + site_place + '\'' +
                '}';
    }
}
