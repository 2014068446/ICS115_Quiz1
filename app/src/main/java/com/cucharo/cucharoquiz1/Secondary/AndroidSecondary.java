package com.cucharo.cucharoquiz1.Secondary;

/**
 * Created by Donnald on 9/28/2017.
 */

public class AndroidSecondary {
    int logo;
    String codename,api,version,date;

    public AndroidSecondary(int logo, String codename, String api, String version, String date) {
        this.logo = logo;
        this.codename = codename;
        this.api = api;
        this.version = version;
        this.date = date;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
