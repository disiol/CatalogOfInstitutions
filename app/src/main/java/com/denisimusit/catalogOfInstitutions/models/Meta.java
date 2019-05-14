
package com.denisimusit.catalogOfInstitutions.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Meta implements Serializable, Parcelable
{

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("requestId")
    @Expose
    private String requestId;
    public final static Creator<Meta> CREATOR = new Creator<Meta>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Meta createFromParcel(Parcel in) {
            return new Meta(in);
        }

        public Meta[] newArray(int size) {
            return (new Meta[size]);
        }

    }
    ;
    private final static long serialVersionUID = 7482204731136983076L;

    protected Meta(Parcel in) {
        this.code = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.requestId = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Meta() {
    }

    /**
     * 
     * @param requestId
     * @param code
     */
    public Meta(Integer code, String requestId) {
        super();
        this.code = code;
        this.requestId = requestId;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("code", code).append("requestId", requestId).toString();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(code);
        dest.writeValue(requestId);
    }

    public int describeContents() {
        return  0;
    }

}
