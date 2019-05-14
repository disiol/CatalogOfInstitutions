
package com.denisimusit.catalogOfInstitutions.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Stats implements Serializable, Parcelable
{

    @SerializedName("checkinsCount")
    @Expose
    private Integer checkinsCount;
    @SerializedName("usersCount")
    @Expose
    private Integer usersCount;
    @SerializedName("tipCount")
    @Expose
    private Integer tipCount;
    public final static Creator<Stats> CREATOR = new Creator<Stats>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Stats createFromParcel(Parcel in) {
            return new Stats(in);
        }

        public Stats[] newArray(int size) {
            return (new Stats[size]);
        }

    }
    ;
    private final static long serialVersionUID = -7344943617224470470L;

    protected Stats(Parcel in) {
        this.checkinsCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.usersCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.tipCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Stats() {
    }

    /**
     * 
     * @param checkinsCount
     * @param usersCount
     * @param tipCount
     */
    public Stats(Integer checkinsCount, Integer usersCount, Integer tipCount) {
        super();
        this.checkinsCount = checkinsCount;
        this.usersCount = usersCount;
        this.tipCount = tipCount;
    }

    public Integer getCheckinsCount() {
        return checkinsCount;
    }

    public void setCheckinsCount(Integer checkinsCount) {
        this.checkinsCount = checkinsCount;
    }

    public Integer getUsersCount() {
        return usersCount;
    }

    public void setUsersCount(Integer usersCount) {
        this.usersCount = usersCount;
    }

    public Integer getTipCount() {
        return tipCount;
    }

    public void setTipCount(Integer tipCount) {
        this.tipCount = tipCount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("checkinsCount", checkinsCount).append("usersCount", usersCount).append("tipCount", tipCount).toString();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(checkinsCount);
        dest.writeValue(usersCount);
        dest.writeValue(tipCount);
    }

    public int describeContents() {
        return  0;
    }

}
