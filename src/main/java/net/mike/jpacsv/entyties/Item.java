package net.mike.jpacsv.entyties;

public class Item {

	private int id;
	private String name_parts;
	private String mainArt_brands;
	private String mainArt_code_parts;
	private int ttc_art_id;
	private String brands;
	private String code_parts;
	private String code_parts_advanced;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName_parts() {
		return name_parts;
	}
	public void setName_parts(String name_parts) {
		this.name_parts = name_parts;
	}
	public String getMainArt_brands() {
		return mainArt_brands;
	}
	public void setMainArt_brands(String mainArt_brands) {
		this.mainArt_brands = mainArt_brands;
	}
	public String getMainArt_code_parts() {
		return mainArt_code_parts;
	}
	public void setMainArt_code_parts(String mainArt_code_parts) {
		this.mainArt_code_parts = mainArt_code_parts;
	}
	public int getTtc_art_id() {
		return ttc_art_id;
	}
	public void setTtc_art_id(int ttc_art_id) {
		this.ttc_art_id = ttc_art_id;
	}
	public String getBrands() {
		return brands;
	}
	public void setBrands(String brands) {
		this.brands = brands;
	}
	public String getCode_parts() {
		return code_parts;
	}
	public void setCode_parts(String code_parts) {
		this.code_parts = code_parts;
	}
	public String getCode_parts_advanced() {
		return code_parts_advanced;
	}
	public void setCode_parts_advanced(String code_parts_advanced) {
		this.code_parts_advanced = code_parts_advanced;
	}
	
	public Item(int id, String name_parts, String mainArt_brands, String mainArt_code_parts, int ttc_art_id,
			String brands, String code_parts, String code_parts_advanced) {
		super();
		this.id = id;
		this.name_parts = name_parts;
		this.mainArt_brands = mainArt_brands;
		this.mainArt_code_parts = mainArt_code_parts;
		this.ttc_art_id = ttc_art_id;
		this.brands = brands;
		this.code_parts = code_parts;
		this.code_parts_advanced = code_parts_advanced;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brands == null) ? 0 : brands.hashCode());
		result = prime * result + ((code_parts == null) ? 0 : code_parts.hashCode());
		result = prime * result + ((code_parts_advanced == null) ? 0 : code_parts_advanced.hashCode());
		result = prime * result + id;
		result = prime * result + ((mainArt_brands == null) ? 0 : mainArt_brands.hashCode());
		result = prime * result + ((mainArt_code_parts == null) ? 0 : mainArt_code_parts.hashCode());
		result = prime * result + ((name_parts == null) ? 0 : name_parts.hashCode());
		result = prime * result + ttc_art_id;
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
		Item other = (Item) obj;
		if (brands == null) {
			if (other.brands != null)
				return false;
		} else if (!brands.equals(other.brands))
			return false;
		if (code_parts == null) {
			if (other.code_parts != null)
				return false;
		} else if (!code_parts.equals(other.code_parts))
			return false;
		if (code_parts_advanced == null) {
			if (other.code_parts_advanced != null)
				return false;
		} else if (!code_parts_advanced.equals(other.code_parts_advanced))
			return false;
		if (id != other.id)
			return false;
		if (mainArt_brands == null) {
			if (other.mainArt_brands != null)
				return false;
		} else if (!mainArt_brands.equals(other.mainArt_brands))
			return false;
		if (mainArt_code_parts == null) {
			if (other.mainArt_code_parts != null)
				return false;
		} else if (!mainArt_code_parts.equals(other.mainArt_code_parts))
			return false;
		if (name_parts == null) {
			if (other.name_parts != null)
				return false;
		} else if (!name_parts.equals(other.name_parts))
			return false;
		if (ttc_art_id != other.ttc_art_id)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name_parts=" + name_parts + ", mainArt_brands=" + mainArt_brands
				+ ", mainArt_code_parts=" + mainArt_code_parts + ", ttc_art_id=" + ttc_art_id + ", brands=" + brands
				+ ", code_parts=" + code_parts + ", code_parts_advanced=" + code_parts_advanced + "]";
	}
	
	
	
}
