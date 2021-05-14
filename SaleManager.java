
public class SaleManager implements SaleService{
	
	private double discountRate;
	
	public SaleManager(double discountRate) {
		this.discountRate = discountRate;
	}

	public double getDiscount() {
		return discountRate;
	}

	public void setDiscount(double discountRate) {
		this.discountRate = discountRate;
	}

	@Override
	public void sale(Customer customer, Game game) {
		System.out.println("The customer purchased " + game.getGameName() + " for this price " + game.getGamePrice());
		
	}

	@Override
	public void campaignSale(Customer customer, Game game, Campaign campaign) {
		System.out.println("The customer purchased " + game.getGameName() + " for this price " + (game.getGamePrice() - (game.getGamePrice()*this.discountRate/100)) 
		+ " by using " + campaign.getCampaignName() + " campaign");
	}

}
