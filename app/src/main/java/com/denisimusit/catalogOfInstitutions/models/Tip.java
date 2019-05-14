
package com.denisimusit.catalogOfInstitutions.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Tip implements Serializable, Parcelable
{

    @SerializedName("createdAt")
    @Expose
    private Integer createdAt;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("canonicalUrl")
    @Expose
    private String canonicalUrl;
    @SerializedName("likes")
    @Expose
    private Likes likes;
    @SerializedName("agreeCount")
    @Expose
    private Integer agreeCount;
    @SerializedName("user")
    @Expose
    private User user;
    public final static Creator<Tip> CREATOR = new Creator<Tip>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Tip createFromParcel(Parcel in) {
            return new Tip(in);
        }

        public Tip[] newArray(int size) {
            return (new Tip[size]);
        }

    }
    ;
    private final static long serialVersionUID = -7388581136173307993L;

    protected Tip(Parcel in) {
        this.createdAt = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.text = ((String) in.readValue((String.class.getClassLoader())));
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        this.canonicalUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.likes = ((Likes) in.readValue((Likes.class.getClassLoader())));
        this.agreeCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.user = ((User) in.readValue((User.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Tip() {
    }

    /**
     * 
     * @param text
     * @param agreeCount
     * @param canonicalUrl
     * @param createdAt
     * @param likes
     * @param type
     * @param user
     */
    public Tip(Integer createdAt, String text, String type, String canonicalUrl, Likes likes, Integer agreeCount, User user) {
        super();
        this.createdAt = createdAt;
        this.text = text;
        this.type = type;
        this.canonicalUrl = canonicalUrl;
        this.likes = likes;
        this.agreeCount = agreeCount;
        this.user = user;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCanonicalUrl() {
        return canonicalUrl;
    }

    public void setCanonicalUrl(String canonicalUrl) {
        this.canonicalUrl = canonicalUrl;
    }

    public Likes getLikes() {
        return likes;
    }

    public void setLikes(Likes likes) {
        this.likes = likes;
    }

    public Integer getAgreeCount() {
        return agreeCount;
    }

    public void setAgreeCount(Integer agreeCount) {
        this.agreeCount = agreeCount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("createdAt", createdAt).append("text", text).append("type", type).append("canonicalUrl", canonicalUrl).append("likes", likes).append("agreeCount", agreeCount).append("user", user).toString();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(createdAt);
        dest.writeValue(text);
        dest.writeValue(type);
        dest.writeValue(canonicalUrl);
        dest.writeValue(likes);
        dest.writeValue(agreeCount);
        dest.writeValue(user);
    }

    public int describeContents() {
        return  0;
    }

}
