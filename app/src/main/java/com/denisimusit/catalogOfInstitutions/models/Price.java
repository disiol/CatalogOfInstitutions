
package com.denisimusit.catalogOfInstitutions.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Price implements Serializable, Parcelable
{

    @SerializedName("tier")
    @Expose
    private Integer tier;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("currency")
    @Expose
    private String currency;
    public final static Creator<Price> CREATOR = new Creator<Price>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Price createFromParcel(Parcel in) {
            return new Price(in);
        }

        public Price[] newArray(int size) {
            return (new Price[size]);
        }

    }
    ;
    private final static long serialVersionUID = -4450855885574050910L;

    protected Price(Parcel in) {
        this.tier = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.message = ((String) in.readValue((String.class.getClassLoader())));
        this.currency = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Price() {
    }

    /**
     * 
     * @param message
     * @param tier
     * @param currency
     */
    public Price(Integer tier, String message, String currency) {
        super();
        this.tier = tier;
        this.message = message;
        this.currency = currency;
    }

    public Integer getTier() {
        return tier;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("tier", tier).append("message", message).append("currency", currency).toString();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(tier);
        dest.writeValue(message);
        dest.writeValue(currency);
    }

    public int describeContents() {
        return  0;
    }

}
