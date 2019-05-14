
package com.denisimusit.catalogOfInstitutions.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

public class Likes implements Serializable, Parcelable
{

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("groups")
    @Expose
    private List<Object> groups = null;
    @SerializedName("summary")
    @Expose
    private String summary;
    public final static Creator<Likes> CREATOR = new Creator<Likes>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Likes createFromParcel(Parcel in) {
            return new Likes(in);
        }

        public Likes[] newArray(int size) {
            return (new Likes[size]);
        }

    }
    ;
    private final static long serialVersionUID = -854327390297330098L;

    protected Likes(Parcel in) {
        this.count = ((Integer) in.readValue((Integer.class.getClassLoader())));
        in.readList(this.groups, (Object.class.getClassLoader()));
        this.summary = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Likes() {
    }

    /**
     * 
     * @param summary
     * @param count
     * @param groups
     */
    public Likes(Integer count, List<Object> groups, String summary) {
        super();
        this.count = count;
        this.groups = groups;
        this.summary = summary;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Object> getGroups() {
        return groups;
    }

    public void setGroups(List<Object> groups) {
        this.groups = groups;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("count", count).append("groups", groups).append("summary", summary).toString();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(count);
        dest.writeList(groups);
        dest.writeValue(summary);
    }

    public int describeContents() {
        return  0;
    }

}
