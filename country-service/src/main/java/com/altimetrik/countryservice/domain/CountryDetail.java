package com.altimetrik.countryservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Objects;


public class CountryDetail {
    private String id;
    private String iso2Code;
    private String name;
    Region region;
    @JsonIgnore
    Object AdminregionObject;
    IncomeLevel incomeLevelObject;
    LendingType lendingTypeObject;
    private String capitalCity;
    private String longitude;
    private String latitude;
    
    public CountryDetail() {}
	public CountryDetail(String id, String iso2Code, String name, Region region, IncomeLevel incomeLevelObject,
			LendingType lendingTypeObject, String capitalCity, String longitude, String latitude) {
		super();
		this.id = id;
		this.iso2Code = iso2Code;
		this.name = name;
		this.region = region;
		this.incomeLevelObject = incomeLevelObject;
		this.lendingTypeObject = lendingTypeObject;
		this.capitalCity = capitalCity;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIso2Code() {
		return iso2Code;
	}
	public void setIso2Code(String iso2Code) {
		this.iso2Code = iso2Code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
	public Object getAdminregionObject() {
		return AdminregionObject;
	}
	public void setAdminregionObject(Object adminregionObject) {
		AdminregionObject = adminregionObject;
	}
	public IncomeLevel getIncomeLevelObject() {
		return incomeLevelObject;
	}
	public void setIncomeLevelObject(IncomeLevel incomeLevelObject) {
		this.incomeLevelObject = incomeLevelObject;
	}
	public LendingType getLendingTypeObject() {
		return lendingTypeObject;
	}
	public void setLendingTypeObject(LendingType lendingTypeObject) {
		this.lendingTypeObject = lendingTypeObject;
	}
	public String getCapitalCity() {
		return capitalCity;
	}
	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof CountryDetail)) return false;
		CountryDetail that = (CountryDetail) o;
		return Objects.equals(id, that.id) &&
				Objects.equals(iso2Code, that.iso2Code) &&
				Objects.equals(name, that.name) &&
				Objects.equals(region, that.region) &&
				Objects.equals(AdminregionObject, that.AdminregionObject) &&
				Objects.equals(incomeLevelObject, that.incomeLevelObject) &&
				Objects.equals(lendingTypeObject, that.lendingTypeObject) &&
				Objects.equals(capitalCity, that.capitalCity) &&
				Objects.equals(longitude, that.longitude) &&
				Objects.equals(latitude, that.latitude);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, iso2Code, name, region, AdminregionObject, incomeLevelObject, lendingTypeObject, capitalCity, longitude, latitude);
	}
}
