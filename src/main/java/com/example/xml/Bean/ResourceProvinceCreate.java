package com.example.xml.Bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("root")
public class ResourceProvinceCreate {
        @XStreamAlias("common")
        public  CommonBean commonBean;
        @XStreamAlias("data")
        public  ResourceData resourceData;


    public CommonBean getCommonBean() {
        return commonBean;
    }

    public void setCommonBean(CommonBean commonBean) {
        this.commonBean = commonBean;
    }

    public ResourceData getResourceData() {
        return resourceData;
    }

    public void setResourceData(ResourceData resourceData) {
        this.resourceData = resourceData;
    }

    @Override
    public String toString() {
        return "ResourceProvinceCreate{" +
                "commonBean=" + commonBean +
                ", resourceData=" + resourceData +
                '}';
    }
}
