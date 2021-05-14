
public class Campaign {

	private String campaignName;
	private String campaignId;
	
	public Campaign(String campaignName, String campaignId) {
		this.campaignName = campaignName;
		this.campaignId = campaignId;
		
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}
}
