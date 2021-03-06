package com.cleancity.wastebin.document;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class WasteBin {

	@Id
	private String id;

	private Double binCurrentCapacity = 00.00;

	private String addressLine1;
	private String addressLine2;
	private String addressLine3;

	// unique identification
	@Indexed(unique = true)
	private Long pincode;
	private Double latitude;
	private Double longitude;

	private Date timestamp;
	private Date createDate;

	private byte flag;

	public WasteBin() {

	}

	public WasteBin(String id, Long pincode) {
		super();
		this.id = id;
		this.pincode = pincode;
	}

	public WasteBin(Double binCurrentCapacity, String addressLine1, String addressLine2, String addressLine3,
			Long pincode, Double latitude, Double longitude) {
		super();
		this.binCurrentCapacity = binCurrentCapacity;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		this.pincode = pincode;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getBinCurrentCapacity() {
		return binCurrentCapacity;
	}

	public void setBinCurrentCapacity(Double binCurrentCapacity) {
		this.binCurrentCapacity = binCurrentCapacity;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public Long getPincode() {
		return pincode;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public byte getFlag() {
		return flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pincode == null) ? 0 : pincode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WasteBin other = (WasteBin) obj;
		if (pincode == null) {
			if (other.pincode != null)
				return false;
		} else if (!pincode.equals(other.pincode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "WasteBin [id=" + id + ", binCurrentCapacity=" + binCurrentCapacity + ", addressLine1=" + addressLine1
				+ ", addressLine2=" + addressLine2 + ", addressLine3=" + addressLine3 + ", pincode=" + pincode
				+ ", latitude=" + latitude + ", longitude=" + longitude + ", timestamp=" + timestamp + ", createDate="
				+ createDate + ", flag=" + flag + "]";
	}

}
