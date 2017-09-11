package Vo;

public class StateVo {
	
	private int sid;
	private String stateName;
	private String stateDescription;
	
	private CountryVo cvo;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStateDescription() {
		return stateDescription;
	}

	public void setStateDescription(String stateDescription) {
		this.stateDescription = stateDescription;
	}

	public CountryVo getCvo() {
		return cvo;
	}

	public void setCvo(CountryVo cvo) {
		this.cvo = cvo;
	}
}
