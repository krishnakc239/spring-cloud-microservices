package com.altimetrik.countryservice.domain;

import java.util.Objects;

public class CountryDTO {
	
	public CountryDTO() {}
    public CountryDTO( 
    		String iso2Code, 
    		String name,
    		String region,
    		String incomeLevel,
    		String lendingType,
			String capitalCity,
			String longitude,
			String latitude) {
		super();
		this.iso2Code = iso2Code;
		this.name = name;
		this.region = region;
		this.incomeLevel = incomeLevel;
		this.lendingType = lendingType;
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
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getIncomeLevel() {
		return incomeLevel;
	}
	public void setIncomeLevel(String incomeLevel) {
		this.incomeLevel = incomeLevel;
	}
	public String getLendingType() {
		return lendingType;
	}
	public void setLendingType(String lendingType) {
		this.lendingType = lendingType;
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
	private String id;
    private String iso2Code;
    private String name;
    private String region;
    private String incomeLevel;
    private String lendingType;
    private String capitalCity;
    private String longitude;
    private String latitude;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof CountryDTO)) return false;
		CountryDTO that = (CountryDTO) o;
		return Objects.equals(id, that.id) &&
				Objects.equals(iso2Code, that.iso2Code) &&
				Objects.equals(name, that.name) &&
				Objects.equals(region, that.region) &&
				Objects.equals(incomeLevel, that.incomeLevel) &&
				Objects.equals(lendingType, that.lendingType) &&
				Objects.equals(capitalCity, that.capitalCity) &&
				Objects.equals(longitude, that.longitude) &&
				Objects.equals(latitude, that.latitude);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, iso2Code, name, region, incomeLevel, lendingType, capitalCity, longitude, latitude);
	}

	@Override
	public String toString() {
		return "CountryDTO{" +
				"id='" + id + '\'' +
				", iso2Code='" + iso2Code + '\'' +
				", name='" + name + '\'' +
				", region='" + region + '\'' +
				", incomeLevel='" + incomeLevel + '\'' +
				", lendingType='" + lendingType + '\'' +
				", capitalCity='" + capitalCity + '\'' +
				", longitude='" + longitude + '\'' +
				", latitude='" + latitude + '\'' +
				'}';
	}
}
