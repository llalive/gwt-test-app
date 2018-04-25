package ru.llalive.gwttestapp.client;

public class Realty {

	private int realtyTypeId;
	private int constructionYear;
	private int area;
	private Address address;

	public int getRealtyTypeId() {
		return realtyTypeId;
	}

	public void setRealtyTypeId(int realtyTypeId) {
		this.realtyTypeId = realtyTypeId;
	}

	public int getConstructionYear() {
		return constructionYear;
	}

	public void setConstructionYear(int constructionYear) {
		this.constructionYear = constructionYear;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	private class Address {
		private int country;
		private int postcode;
		private String region;
		private String district;
		private String town;
		private String street;
		private String house;
		private String block;
		private int flat;

		public int getCountry() {
			return country;
		}

		public void setCountry(int country) {
			this.country = country;
		}

		public int getPostcode() {
			return postcode;
		}

		public void setPostcode(int postcode) {
			this.postcode = postcode;
		}

		public String getRegion() {
			return region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getDistrict() {
			return district;
		}

		public void setDistrict(String district) {
			this.district = district;
		}

		public String getTown() {
			return town;
		}

		public void setTown(String town) {
			this.town = town;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getHouse() {
			return house;
		}

		public void setHouse(String house) {
			this.house = house;
		}

		public String getBlock() {
			return block;
		}

		public void setBlock(String block) {
			this.block = block;
		}

		public int getFlat() {
			return flat;
		}

		public void setFlat(int flat) {
			this.flat = flat;
		}

	}
}
