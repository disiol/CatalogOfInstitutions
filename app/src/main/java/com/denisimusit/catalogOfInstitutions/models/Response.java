
package com.denisimusit.catalogOfInstitutions.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

public class Response implements Serializable, Parcelable
{

    @SerializedName("headerLocation")
    @Expose
    private String headerLocation;
    @SerializedName("headerFullLocation")
    @Expose
    private String headerFullLocation;
    @SerializedName("headerLocationGranularity")
    @Expose
    private String headerLocationGranularity;
    @SerializedName("query")
    @Expose
    private String query;
    @SerializedName("totalResults")
    @Expose
    private Integer totalResults;
    @SerializedName("groups")
    @Expose
    private List<Group> groups = null;
    public final static Creator<Response> CREATOR = new Creator<Response>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Response createFromParcel(Parcel in) {
            return new Response(in);
        }

        public Response[] newArray(int size) {
            return (new Response[size]);
        }

    }
    ;
    private final static long serialVersionUID = 3843918579920167191L;

    protected Response(Parcel in) {
        this.headerLocation = ((String) in.readValue((String.class.getClassLoader())));
        this.headerFullLocation = ((String) in.readValue((String.class.getClassLoader())));
        this.headerLocationGranularity = ((String) in.readValue((String.class.getClassLoader())));
        this.query = ((String) in.readValue((String.class.getClassLoader())));
        this.totalResults = ((Integer) in.readValue((Integer.class.getClassLoader())));
        in.readList(this.groups, (Group.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Response() {
    }

    /**
     * 
     * @param totalResults
     * @param headerLocationGranularity
     * @param query
     * @param headerLocation
     * @param headerFullLocation
     * @param groups
     */
    public Response(String headerLocation, String headerFullLocation, String headerLocationGranularity, String query, Integer totalResults, List<Group> groups) {
        super();
        this.headerLocation = headerLocation;
        this.headerFullLocation = headerFullLocation;
        this.headerLocationGranularity = headerLocationGranularity;
        this.query = query;
        this.totalResults = totalResults;
        this.groups = groups;
    }

    public String getHeaderLocation() {
        return headerLocation;
    }

    public void setHeaderLocation(String headerLocation) {
        this.headerLocation = headerLocation;
    }

    public String getHeaderFullLocation() {
        return headerFullLocation;
    }

    public void setHeaderFullLocation(String headerFullLocation) {
        this.headerFullLocation = headerFullLocation;
    }

    public String getHeaderLocationGranularity() {
        return headerLocationGranularity;
    }

    public void setHeaderLocationGranularity(String headerLocationGranularity) {
        this.headerLocationGranularity = headerLocationGranularity;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("headerLocation", headerLocation).append("headerFullLocation", headerFullLocation).append("headerLocationGranularity", headerLocationGranularity).append("query", query).append("totalResults", totalResults).append("groups", groups).toString();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(headerLocation);
        dest.writeValue(headerFullLocation);
        dest.writeValue(headerLocationGranularity);
        dest.writeValue(query);
        dest.writeValue(totalResults);
        dest.writeList(groups);
    }

    public int describeContents() {
        return  0;
    }

}
