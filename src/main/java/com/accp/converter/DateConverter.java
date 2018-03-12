package com.accp.converter;

import com.opensymphony.xwork2.conversion.TypeConversionException;
import org.apache.struts2.util.StrutsTypeConverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * 时间类型转换器
 */
public class DateConverter extends StrutsTypeConverter {
    //支持转换多种日期格式,可增加时间格式
    private final SimpleDateFormat[] dfs = {
            new SimpleDateFormat("yyyy年MM月dd日"),
            new SimpleDateFormat("yyyy-MM-dd"),
            new SimpleDateFormat("yyyy/MM/dd"),
            new SimpleDateFormat("yyyy.MM.dd"),
            new SimpleDateFormat("yyyyMMdd"),
            new SimpleDateFormat("MM/dd/yyyy")
    };

    public Object convertFromString(Map map, String[] strings, Class toType) {
        String dateStr = strings[0];
        for (int i = 0;i<dfs.length;i++){
            try {
                return dfs[i].parse(dateStr);
            } catch (ParseException e) {
                continue;
            }
        }
        throw  new TypeConversionException();
    }

    public String convertToString(Map map, Object o) {
        Date date = (Date)o;
        return new SimpleDateFormat("yyyy-MM-dd").format(date);
    }
}
