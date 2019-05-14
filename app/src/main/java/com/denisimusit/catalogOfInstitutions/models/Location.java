
package com.denisimusit.catalogOfInstitutions.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

public class Location implements Serializable, Parcelable
{

    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("crossStreet")
    @Expose
    private String crossStreet;
    @SerializedName("lat")
    @Expose
    private Float lat;
    @SerializedName("lng")
    @Expose
    private Float lng;
    @SerializedName("distance")
    @Expose
    private Integer distance;
    @SerializedName("postalCode")
    @Expose
    private String postalCode;
    @SerializedName("cc")
    @Expose
    private String cc;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("formattedAddress")
    @Expose
    private List<String> formattedAddress = null;
    public final static Creator<Location> CREATOR = new Creator<Location>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Location createFromParcel(Parcel in) {
            return new Location(in);
        }

        public Location[] newArray(int size) {
            return (new Location[size]);
        }

    }
    ;
    private final static long serialVersionUID = 7775688192423354124L;

    protected Location(Parcel in) {
        this.address = ((String) in.readValue((String.class.getClassLoader())));
        this.crossStreet = ((String) in.readValue((String.class.getClassLoader())));
        this.lat = ((Float) in.readValue((Float.class.getClassLoader())));
        this.lng = ((Float) in.readValue((Float.class.getClassLoader())));
        this.distance = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.postalCode = ((String) in.readValue((String.class.getClassLoader())));
        this.cc = ((String) in.readValue((String.class.getClassLoader())));
        this.city = ((String) in.readValue((String.class.getClassLoader())));
        this.state = ((String) in.readValue((String.class.getClassLoader())));
        this.country = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.formattedAddress, (String.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Location() {
    }

    /**
     * 
     * @param distance
     * @param postalCode
     * @param address
     * @param state
     * @param formattedAddress
     * @param lng
     * @param cc
     * @param lat
     * @param country
     * @param city
     * @param crossStreet
     */
    public Location(String address, String crossStreet, Float lat, Float lng, Integer distance, String postalCode, String cc, String city, String state, String country, List<String> formattedAddress) {
        super();
        this.address = address;
        this.crossStreet = crossStreet;
        this.lat = lat;
        this.lng = lng;
        this.distance = distance;
        this.postalCode = postalCode;
        this.cc = cc;
        this.city = city;
        this.state = state;
        this.country = country;
        this.formattedAddress = formattedAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCrossStreet() {
        return crossStreet;
    }

    public void setCrossStreet(String crossStreet) {
        this.crossStreet = crossStreet;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Float getLng() {
        return lng;
    }

    public void setLng(Float lng) {
        this.lng = lng;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getFormattedAddress() {
        return formattedAddress;
    }

    public void setFormattedAddress(List<String> formattedAddress) {
        this.formattedAddress = formattedAddress;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("address", address).append("crossStreet", crossStreet).append("lat", lat).append("lng", lng).append("distance", distance).append("postalCode", postalCode).append("cc", cc).append("city", city).append("state", state).append("country", country).append("formattedAddress", formattedAddress).toString();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(address);
        dest.writeValue(crossStreet);
        dest.writeValue(lat);
        dest.writeValue(lng);
        dest.writeValue(distance);
        dest.writeValue(postalCode);
        dest.writeValue(cc);
        dest.writeValue(city);
        dest.writeValue(state);
        dest.writeValue(country);
        dest.writeList(formattedAddress);
    }

    public int describeContents() {
        return  0;
    }

}
