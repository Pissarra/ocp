package br.com.ocp.chapter1;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

class Hippo {
    private int height;
    private String name;

    Hippo(String name, int height) {
        this.height = height;
        this.name = name;
    }

    @Override
    public String toString(){
        return ToStringBuilder.reflectionToString(this);
    }
}

class HippoShortString extends Hippo {

    HippoShortString(String name, int height) {
        super(name, height);
    }

    @Override
    public String toString(){
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}

public class ReflectionValuesAsString {

    public static void main(String[] args) {
        Hippo hippo = new Hippo("Nina", 65);
        System.out.println(hippo);

        Hippo hippoShortStringAndOtherReference = new HippoShortString("Nina", 65);
        System.out.println(hippoShortStringAndOtherReference);

        HippoShortString hippoShortString = new HippoShortString("Nina", 65);
        System.out.println(hippoShortString);
    }
}
