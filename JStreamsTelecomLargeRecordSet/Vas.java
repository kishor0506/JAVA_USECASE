package JStreamsTelecomLargeRecordSet;

public class Vas extends Basemodel{
	public String vas;

	public boolean isActive;

	public Vas(String vas, boolean isActive) {
		super();
		this.vas = vas;
		this.isActive = isActive;
	}

	public String getVas() {
		return vas;
	}

	public void setVas(String vas) {
		this.vas = vas;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
}
