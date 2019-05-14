
package com.denisimusit.catalogOfInstitutions.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

public class Group implements Serializable, Parcelable
{

    @SerializedName("items")
    @Expose
    private List<Item> items = null;
    public final static Creator<Group> CREATOR = new Creator<Group>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Group createFromParcel(Parcel in) {
            return new Group(in);
        }

        public Group[] newArray(int size) {
            return (new Group[size]);
        }

    }
    ;
    private final static long serialVersionUID = 1621177936304232620L;

    protected Group(Parcel in) {
        in.readList(this.items, (Item.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Group() {
    }

    /**
     * 
     * @param items
     */
    public Group(List<Item> items) {
        super();
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("items", items).toString();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(items);
    }

    public int describeContents() {
        return  0;
    }

}
