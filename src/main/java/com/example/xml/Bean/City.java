package com.example.xml.Bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

import java.util.List;

@XStreamAlias("city")
public class City {
    @XStreamAsAttribute
    private  String code;
    @XStreamAlias("cons")
    private List<Company> cons;
    @XStreamAlias("loads")
    private  List<Load> loads;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Company> getCons() {
        return cons;
    }

    public void setCons(List<Company> cons) {
        this.cons = cons;
    }

    public List<Load> getLoads() {
        return loads;
    }

    public void setLoads(List<Load> loads) {
        this.loads = loads;
    }
}
