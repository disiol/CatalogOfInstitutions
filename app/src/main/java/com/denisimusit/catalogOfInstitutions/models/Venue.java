
package com.denisimusit.catalogOfInstitutions.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

public class Venue implements Serializable, Parcelable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("categories")
    @Expose
    private List<Category> categories = null;
    @SerializedName("stats")
    @Expose
    private Stats stats;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("price")
    @Expose
    private Price price;
    @SerializedName("rating")
    @Expose
    private Float rating;
    @SerializedName("hours")
    @Expose
    private Hours hours;
    @SerializedName("hereNow")
    @Expose
    private HereNow hereNow;
    public final static Creator<Venue> CREATOR = new Creator<Venue>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Venue createFromParcel(Parcel in) {
            return new Venue(in);
        }

        public Venue[] newArray(int size) {
            return (new Venue[size]);
        }

    }
    ;
    private final static long serialVersionUID = -2531747132189363978L;

    protected Venue(Parcel in) {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.location = ((Location) in.readValue((Location.class.getClassLoader())));
        in.readList(this.categories, (com.denisimusit.catalogOfInstitutions.models.Category.class.getClassLoader()));
        this.stats = ((Stats) in.readValue((Stats.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.price = ((Price) in.readValue((Price.class.getClassLoader())));
        this.rating = ((Float) in.readValue((Float.class.getClassLoader())));
        this.hours = ((Hours) in.readValue((Hours.class.getClassLoader())));
        this.hereNow = ((HereNow) in.readValue((HereNow.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Venue() {
    }

    /**
     * 
     * @param id
     * @param price
     * @param location
     * @param hours
     * @param stats
     * @param name
     * @param categories
     * @param rating
     * @param hereNow
     * @param url
     */
    public Venue(String id, String name, Location location, List<Category> categories, Stats stats, String url, Price price, Float rating, Hours hours, HereNow hereNow) {
        super();
        this.id = id;
        this.name = name;
        this.location = location;
        this.categories = categories;
        this.stats = stats;
        this.url = url;
        this.price = price;
        this.rating = rating;
        this.hours = hours;
        this.hereNow = hereNow;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public Hours getHours() {
        return hours;
    }

    public void setHours(Hours hours) {
        this.hours = hours;
    }

    public HereNow getHereNow() {
        return hereNow;
    }

    public void setHereNow(HereNow hereNow) {
        this.hereNow = hereNow;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).append("location", location).append("categories", categories).append("stats", stats).append("url", url).append("price", price).append("rating", rating).append("hours", hours).append("hereNow", hereNow).toString();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(name);
        dest.writeValue(location);
        dest.writeList(categories);
        dest.writeValue(stats);
        dest.writeValue(url);
        dest.writeValue(price);
        dest.writeValue(rating);
        dest.writeValue(hours);
        dest.writeValue(hereNow);
    }

    public int describeContents() {
        return  0;
    }

}
