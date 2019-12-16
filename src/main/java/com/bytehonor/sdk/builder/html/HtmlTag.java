package com.bytehonor.sdk.builder.html;

import java.util.Objects;

import com.bytehonor.sdk.builder.html.tag.TagEnd;
import com.bytehonor.sdk.builder.html.tag.TagNoEnd;

public class HtmlTag {

    public static TagEnd tagEnd(String name) {
        Objects.requireNonNull(name);
        return new TagEnd(name);
    }

    public static Html tagNoEnd(String name) {
        Objects.requireNonNull(name);
        return new TagNoEnd(name);
    }

    public static Html html() {
        return tagEnd("html");
    }

    public static Html head() {
        return tagEnd("head");
    }

    public static Html title() {
        return tagEnd("title");
    }

    public static Html body() {
        return tagEnd("body");
    }

    public static Html div() {
        return tagEnd("div");
    }

    public static Html p() {
        return tagEnd("p");
    }

    public static Html span() {
        return tagEnd("span");
    }
    
    public static Html font() {
        return tagEnd("font");
    }

    public static Html a() {
        return tagEnd("a");
    }

    public static Html h1() {
        return tagEnd("h1");
    }

    public static Html h2() {
        return tagEnd("h2").attr("style",
                "font-size: 1.5em; line-height: 1.225; color: #000000; padding-bottom: .3em; border-bottom: 1px solid #eee;");
    }

    public static Html h3() {
        return tagEnd("h3").attr("style",
                "margin-top: 1em; margin-bottom: 16px; font-size: 1.25em; color: #343434; line-height: 1.43;");
    }

    public static Html strong() {
        return tagEnd("strong");
    }
    
    public static Html i() {
        return tagEnd("i"); // italic斜体
    }

    public static Html ul() {
        return tagEnd("ul");
    }

    public static Html li() {
        return tagEnd("li");
    }

    public static Html blockquote() {
        return tagEnd("blockquote").attr("style",
                "color: #666; border-left: 4px solid #ddd; padding-left: 20px; margin-left: 0; font-size: 14px;");
    }
    
    public static Html small() {
        return tagEnd("small");
    }

    ///
    public static Html img() {
        return tagNoEnd("img");
    }

    public static Html input() {
        return tagNoEnd("input");
    }

    public static Html br() {
        return tagNoEnd("br");
    }
    
    public static Html hr() {
        return tagNoEnd("hr");
    }
}
