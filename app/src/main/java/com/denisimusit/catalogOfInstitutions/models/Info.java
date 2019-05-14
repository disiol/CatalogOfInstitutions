
package com.denisimusit.catalogOfInstitutions.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Info implements Serializable, Parcelable
{

    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("response")
    @Expose
    private Response response;
    public final static Creator<Info> CREATOR = new Creator<Info>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Info createFromParcel(Parcel in) {
            return new Info(in);
        }

        public Info[] newArray(int size) {
            return (new Info[size]);
        }

    }
    ;
    private final static long serialVersionUID = 2753059950236636136L;

    protected Info(Parcel in) {
        this.meta = ((Meta) in.readValue((Meta.class.getClassLoader())));
        this.response = ((Response) in.readValue((Response.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Info() {
    }

    /**
     * 
     * @param response
     * @param meta
     */
    public Info(Meta meta, Response response) {
        super();
        this.meta = meta;
        this.response = response;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("meta", meta).append("response", response).toString();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(meta);
        dest.writeValue(response);
    }

    public int describeContents() {
        return  0;
    }

}
