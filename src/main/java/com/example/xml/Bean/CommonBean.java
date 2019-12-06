package com.example.xml.Bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("common")
public class CommonBean {
    @XStreamAlias("org_no")
    public  String orgNo;
    @XStreamAlias("type")
    public  String type;


    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CommonBean{" +
                "orgNo='" + orgNo + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
