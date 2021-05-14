
public class GameManager implements GameService {
	
	
	@Override
	public void add(Game game, Customer customer) {
		System.out.println(game.getGameName() + " Added for " + customer.getCustomerFirstName() );

	}

	@Override
	public void delete(Game game,Customer customer) {
		System.out.println(game.getGameName() + " Deleted for " + customer.getCustomerFirstName());
		
	}

	@Override
	public void update(Game game,Customer customer) {
		System.out.println(game.getGameName() + " Updated for " + customer.getCustomerFirstName());
		
	}

}
