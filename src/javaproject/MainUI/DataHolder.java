/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproject.MainUI;

/**
 *
 * @author L3gend
 */
public class DataHolder {

    private Integer itemid;
    private String itemnamedata;
    private String itemimgdata;
    private String itemtypedata;
    private String itemtype2data;
    private Integer basepricedata;

    private Integer iddata;
    private String usernamedata;
    private String namedata;
    private String profileimgdata;
    private String acctypedata;
    private String password;
    private String joined_date;
    private String phnum;
    private String location;

    //user
    public Integer getIDdata() {
        return iddata;
    }

    public String getusernamedata() {
        return usernamedata;
    }

    public String getnamedata() {
        return namedata;
    }

    public String getprofileimgdata() {
        return profileimgdata;
    }

    public String getacctypedata() {
        return acctypedata;
    }

    public String getpassworddata() {
        return password;
    }

    public String getaccdatedata() {
        return joined_date;
    }

    public String getphnumdata() {
        return phnum;
    }

    public String getlocationdata() {
        return location;
    }

    //item
    public Integer getItemIDdata() {
        return itemid;
    }

    public String getitemnamedata() {
        return itemnamedata;
    }

    public String getitemimgdata() {
        return itemimgdata;
    }

    public String itemtypedata() {
        return itemtypedata;
    }

    public String itemtyp2data() {
        return itemtype2data;
    }

    public Integer basepricedata() {
        return basepricedata;
    }

    public void setData(Integer ID, String itemNamedata, String itemImgdata, String itemtype, String itemtype2, Integer baseprice) {
        this.itemid = ID;
        this.itemnamedata = itemNamedata;
        this.itemimgdata = itemImgdata;
        this.itemtypedata = itemtype;
        this.itemtype2data = itemtype2;
        this.basepricedata = baseprice;
    }

    public void setuserData(Integer ID, String username, String name, String profileimg, String acctype, String password, String date, String phnum, String location) {
        this.iddata = ID;
        this.usernamedata = username;
        this.namedata = name;
        this.profileimgdata = profileimg;
        this.acctypedata = acctype;
        this.password = password;
        this.joined_date = date;
        this.phnum = phnum;
        this.location = location;
    }
}
