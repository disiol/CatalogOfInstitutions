
package com.denisimusit.catalogOfInstitutions.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class HereNow implements Serializable, Parcelable
{

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("summary")
    @Expose
    private String summary;
    public final static Creator<HereNow> CREATOR = new Creator<HereNow>() {


        @SuppressWarnings({
            "unchecked"
        })
        public HereNow createFromParcel(Parcel in) {
            return new HereNow(in);
        }

        public HereNow[] newArray(int size) {
            return (new HereNow[size]);
        }

    }
    ;
    private final static long serialVersionUID = -7062635583906652696L;

    protected HereNow(Parcel in) {
        this.count = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.summary = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public HereNow() {
    }

    /**
     * 
     * @param summary
     * @param count
     */
    public HereNow(Integer count, String summary) {
        super();
        this.count = count;
        this.summary = summary;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("count", count).append("summary", summary).toString();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(count);
        dest.writeValue(summary);
    }

    public int describeContents() {
        return  0;
    }

}
