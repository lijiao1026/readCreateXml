package com.example.xml;

import com.example.xml.Bean.CommonBean;
import com.example.xml.Bean.Province;
import com.example.xml.Bean.ResourceData;
import com.example.xml.Bean.ResourceProvinceCreate;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.naming.NoNameCoder;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XppDriver;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Date;

@SpringBootTest
class ReadCreateXmlApplicationTests {

	@Test
	void contextLoads() {
		XStream xstream = new XStream(new DomDriver("utf-8"));

		File xmlFile = new File("H://resourceProvince.xml");
		// 若使用注解,则一定要调用此方法.
		xstream.processAnnotations(ResourceProvinceCreate.class);
		// 忽略掉xml中的未知元素.
		xstream.ignoreUnknownElements();
		ResourceProvinceCreate obj = (ResourceProvinceCreate) xstream.fromXML(xmlFile);
		System.out.println(obj.toString());
	}

	@Test
	void contextLoads2() {
		CommonBean commonBean=new CommonBean();
		commonBean.setOrgNo("2222");
		commonBean.setType("2211");

		ResourceData resourceData=new ResourceData();
		resourceData.setSequence("1112222");
		resourceData.setTime(new Date());
		Province province=new Province();
		province.setCode("3500000");
		resourceData.setProvince(province);

		ResourceProvinceCreate resourceProvinceCreate =new ResourceProvinceCreate();
		resourceProvinceCreate.setCommonBean(commonBean);
		resourceProvinceCreate.setResourceData(resourceData);

		XStream xstream = new XStream(new XppDriver(new NoNameCoder()));
		xstream.aliasSystemAttribute(null, "class"); // 去掉class 属性
		xstream.autodetectAnnotations(true);
		String xmlStr = xstream.toXML(resourceProvinceCreate);
		try{
			OutputStream out = new FileOutputStream(new File("H://test.xml"));

			OutputStreamWriter writer = new OutputStreamWriter(out, Charset

					.forName("utf-8"));
			writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
			xstream.toXML(resourceProvinceCreate, writer);

			out.close();
		}catch (Exception e){
			e.printStackTrace();
		}

		System.out.println(xmlStr);
	}
}
