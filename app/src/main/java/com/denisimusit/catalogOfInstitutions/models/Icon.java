
package com.denisimusit.catalogOfInstitutions.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Icon implements Serializable, Parcelable
{

    @SerializedName("prefix")
    @Expose
    private String prefix;
    @SerializedName("suffix")
    @Expose
    private String suffix;
    public final static Creator<Icon> CREATOR = new Creator<Icon>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Icon createFromParcel(Parcel in) {
            return new Icon(in);
        }

        public Icon[] newArray(int size) {
            return (new Icon[size]);
        }

    }
    ;
    private final static long serialVersionUID = 2688396317596906080L;

    protected Icon(Parcel in) {
        this.prefix = ((String) in.readValue((String.class.getClassLoader())));
        this.suffix = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Icon() {
    }

    /**
     * 
     * @param prefix
     * @param suffix
     */
    public Icon(String prefix, String suffix) {
        super();
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("prefix", prefix).append("suffix", suffix).toString();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(prefix);
        dest.writeValue(suffix);
    }

    public int describeContents() {
        return  0;
    }

}
