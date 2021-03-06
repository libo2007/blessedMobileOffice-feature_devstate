package com.jiaying.workstation.entity;

import android.graphics.Bitmap;

import com.jiaying.workstation.activity.sensor.IdentityCardActivity;

import java.io.Serializable;

/**
 * 作者：lenovo on 2016/3/4 17:09
 * 邮箱：353510746@qq.com
 * 功能：省份证实体
 */
public class IdentityCardEntity implements Serializable {
    private String name;
    private String sex;
    private String nation;
    private String year;
    private String month;
    private String day;
    private String addr;
    private String idcardno;
    private String grantdept;
    private Bitmap photoBmp;
    private IdentityCardEntity(){}
    private static IdentityCardEntity identityCardEntity=null;
    public synchronized static IdentityCardEntity getIntance(){
        if(identityCardEntity != null){
            return identityCardEntity;
        }
        else{
            identityCardEntity = new IdentityCardEntity();
            return identityCardEntity;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getIdcardno() {
        return idcardno;
    }

    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno;
    }

    public String getGrantdept() {
        return grantdept;
    }

    public void setGrantdept(String grantdept) {
        this.grantdept = grantdept;
    }

    public Bitmap getPhotoBmp() {
        return photoBmp;
    }

    public void setPhotoBmp(Bitmap photoBmp) {
        this.photoBmp = photoBmp;
    }

    @Override
    public String toString() {
        return "IdentityCardEntity{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", nation='" + nation + '\'' +
                ", year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", day='" + day + '\'' +
                ", addr='" + addr + '\'' +
                ", idcardno='" + idcardno + '\'' +
                ", grantdept='" + grantdept + '\'' +
                ", photoBmp=" + photoBmp +
                '}';
    }
}
