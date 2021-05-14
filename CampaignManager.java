
public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " Campaign added ");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " Campaign deleted ");
		
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName() + " Campaign updated ");
	}

}
