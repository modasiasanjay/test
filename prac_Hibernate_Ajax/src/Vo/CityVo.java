package Vo;

public class CityVo {
	
	private int cityid;
	private String cityName;
	private String cityDescription;

	private StateVo svo;
	
	private CountryVo cvo;

	public int getCityid() {
		return cityid;
	}

	public void setCityid(int cityid) {
		this.cityid = cityid;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityDescription() {
		return cityDescription;
	}

	public void setCityDescription(String cityDescription) {
		this.cityDescription = cityDescription;
	}

	public StateVo getSvo() {
		return svo;
	}

	public void setSvo(StateVo svo) {
		this.svo = svo;
	}

	public CountryVo getCvo() {
		return cvo;
	}

	public void setCvo(CountryVo cvo) {
		this.cvo = cvo;
	}
	
}
