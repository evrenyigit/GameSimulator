public class Main {

	public static void main(String[] args) /*throws RemoteException*/ {
		
		ServisAdapter servisAdapter = new ServisAdapter();
		
		CustomerManager customerManager = new CustomerManager(servisAdapter);
		
		
		Customer customer = new Customer("FirstName","LastName","TcN0",1995);
		Customer customer1 = new Customer("FirstName","LastName","TcN0",1995);
		
		if (servisAdapter.UserCheckServiceForRealPerson(customer))
		
		{
		
			customerManager.add(customer);

			Game game = new Game("1001","CS GO",195.49);
			Game game1 = new Game("1002","DOTA2",95.49);
			Game game2 = new Game("1003","Rocket League",35.49);

			Campaign campaign = new Campaign("Black Friday" , "301");
			Campaign campaign1 = new Campaign("Spring Discount!" , "302");
			Campaign campaign2 = new Campaign("New Year Campaign!" , "303");

			CampaignManager campaignManager= new CampaignManager();
			campaignManager.add(campaign2);

			GameManager gameManager = new GameManager();
			gameManager.add(game,customer);


			SaleManager saleManager = new SaleManager(20);
			saleManager.sale(customer, game2);
			saleManager.campaignSale(customer, game1, campaign2);
		
		}
		else
			System.out.println("There is no one with those informations, enter an different infos");


	}

}
