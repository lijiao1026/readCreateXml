package com.example.xml.Bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

import java.util.Date;
import java.util.List;

@XStreamAlias("data")
public class ResourceData {
    @XStreamAlias("sequence")
    private  String sequence;
    @XStreamAlias("time")
    @XStreamConverter(value=XStreamDateConverter.class)
    private Date time;
    @XStreamAlias("province")
    private  Province province;
    @XStreamAlias("cons")
    private List<Company> companies;
    @XStreamAlias("devs")
    private  List<Device> devices;
    @XStreamAlias("loads")
    private  List<Load> loads;
    @XStreamAlias("citys")
    private  List<City> cities;

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public List<Load> getLoads() {
        return loads;
    }

    public void setLoads(List<Load> loads) {
        this.loads = loads;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "ResourceData{" +
                "sequence='" + sequence + '\'' +
                ", time=" + time +
                ", province=" + province +
                ", companies=" + companies +
                ", devices=" + devices +
                ", loads=" + loads +
                ", cities=" + cities +
                '}';
    }
}
