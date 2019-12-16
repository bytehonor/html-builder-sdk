package com.bytehonor.sdk.builder.html.attribute;

import java.util.Map;
import java.util.Map.Entry;

import com.bytehonor.sdk.builder.html.string.StringSdkUtils;

public class AttributeUtils {

    private static final String STYLE = "style";

    /**
     * 头空格，尾无空格
     * 
     * @param attributes
     * @return
     */
    public static String print(Map<String, String> attributes) {
        if (attributes == null || attributes.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Entry<String, String> attr : attributes.entrySet()) {
            if (StringSdkUtils.isEmpty(attr.getKey()) || StringSdkUtils.isEmpty(attr.getValue())) {
                continue;
            }
            sb.append(" ").append(attr.getKey()).append("=\"").append(format(attr)).append("\"");
        }

        return sb.toString();
    }

    private static String format(Entry<String, String> attr) {
        if (STYLE.equals(attr.getKey())) {
            return attr.getValue().endsWith(";") ? attr.getValue() : attr.getValue() + ";";
        }
        return attr.getValue();

    }
}
