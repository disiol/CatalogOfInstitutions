
package com.denisimusit.catalogOfInstitutions.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Hours implements Serializable, Parcelable
{

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("isOpen")
    @Expose
    private Boolean isOpen;
    @SerializedName("isLocalHoliday")
    @Expose
    private Boolean isLocalHoliday;
    public final static Creator<Hours> CREATOR = new Creator<Hours>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Hours createFromParcel(Parcel in) {
            return new Hours(in);
        }

        public Hours[] newArray(int size) {
            return (new Hours[size]);
        }

    }
    ;
    private final static long serialVersionUID = -5060746275374191104L;

    protected Hours(Parcel in) {
        this.status = ((String) in.readValue((String.class.getClassLoader())));
        this.isOpen = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.isLocalHoliday = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Hours() {
    }

    /**
     * 
     * @param isLocalHoliday
     * @param status
     * @param isOpen
     */
    public Hours(String status, Boolean isOpen, Boolean isLocalHoliday) {
        super();
        this.status = status;
        this.isOpen = isOpen;
        this.isLocalHoliday = isLocalHoliday;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    public Boolean getIsLocalHoliday() {
        return isLocalHoliday;
    }

    public void setIsLocalHoliday(Boolean isLocalHoliday) {
        this.isLocalHoliday = isLocalHoliday;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("status", status).append("isOpen", isOpen).append("isLocalHoliday", isLocalHoliday).toString();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(status);
        dest.writeValue(isOpen);
        dest.writeValue(isLocalHoliday);
    }

    public int describeContents() {
        return  0;
    }

}
