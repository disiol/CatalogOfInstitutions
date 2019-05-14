
package com.denisimusit.catalogOfInstitutions.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

public class Item implements Serializable, Parcelable
{

    @SerializedName("venue")
    @Expose
    private Venue venue;
    @SerializedName("tips")
    @Expose
    private List<Tip> tips = null;
    @SerializedName("referralId")
    @Expose
    private String referralId;
    public final static Creator<Item> CREATOR = new Creator<Item>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Item createFromParcel(Parcel in) {
            return new Item(in);
        }

        public Item[] newArray(int size) {
            return (new Item[size]);
        }

    }
    ;
    private final static long serialVersionUID = 1121623994339649152L;

    protected Item(Parcel in) {
        this.venue = ((Venue) in.readValue((Venue.class.getClassLoader())));
        in.readList(this.tips, (Tip.class.getClassLoader()));
        this.referralId = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Item() {
    }

    /**
     * 
     * @param referralId
     * @param tips
     * @param venue
     */
    public Item(Venue venue, List<Tip> tips, String referralId) {
        super();
        this.venue = venue;
        this.tips = tips;
        this.referralId = referralId;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public List<Tip> getTips() {
        return tips;
    }

    public void setTips(List<Tip> tips) {
        this.tips = tips;
    }

    public String getReferralId() {
        return referralId;
    }

    public void setReferralId(String referralId) {
        this.referralId = referralId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("venue", venue).append("tips", tips).append("referralId", referralId).toString();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(venue);
        dest.writeList(tips);
        dest.writeValue(referralId);
    }

    public int describeContents() {
        return  0;
    }

}
