package com.example.xml.Bean;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 自定义单值处理器
 */
public class XStreamDateConverter extends AbstractSingleValueConverter {
    private final DateFormat DATEFORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 告诉xstream,该转换器用来转换Date类型的对象.
     *
     * @param type
     * @return
     */
    @Override
    public boolean canConvert(Class type) {
        return type.equals(Date.class);
    }

    /**
     * object->xml用
     * 将变量值转换为String,赋值为标签值.
     *
     * @param str
     * @return
     */
    @Override
    public Object fromString(String str) {
        // 这里将字符串转换成日期
        try {

            return DATEFORMAT.parseObject(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        throw new ConversionException("Cannot parse date " + str);
    }

    /**
     * xml->object用
     * 将xml的标签值,包装为对象,映射到成员变量中
     *
     * @param obj
     * @return
     */
    @Override
    public String toString(Object obj) {
        // 将日期转换成字符串
        return DATEFORMAT.format((Date) obj);
    }
}
