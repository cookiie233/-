package shiyan2;

public class province {
	String pro, city, id;
	
	public province() {}
	
	public province(String[] arr) {
		pro = arr[0];
		city = arr[1];
		id = arr[2];
	}

	public String getPro() {
		return pro;
	}

	public void setPro(String pro) {
		this.pro = pro;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}

