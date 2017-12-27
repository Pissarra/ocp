package br.com.ocp.chapter1;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

class Hippo {
    protected int height;
    protected String name;

    Hippo(String name, int height) {
        this.height = height;
        this.name = name;
    }

    @Override
    public String toString(){
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o);
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

    // Select values that needed to be equals
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof HippoShortString)) {
            return false;
        }
        HippoShortString obj = (HippoShortString) o;
        return new EqualsBuilder().appendSuper(super.equals(obj))
                .append(this.name, obj.name)
                .append(this.height, obj.height)
                .isEquals();
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

        System.out.println("Hippo is equal HippoShortString: " + hippo.equals(hippoShortString));

        System.out.println("HippoShortString is equal HippoShortString (OtherReference): " + hippoShortString.equals(hippoShortStringAndOtherReference));
    }
}
