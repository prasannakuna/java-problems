class GridGame{
	int x_co = 0,y_co = 0;
	private int ball_x,ball_y;
	private int count = 0;

	public void gameSetup(){
		ball_x = (int) (Math.random()*11);
		ball_y = (int) (Math.random()*11);
		System.out.println("Ball position is ("+ball_x+","+ball_y+")");
	}
	public void start(){
		System.out.println("You are ready to start the game.....\n");
		
		while(x_co!=ball_x || y_co!=ball_y){
			System.out.print("you are moving from ("+x_co+","+y_co+") to ");
			
			if(x_co<ball_x)
				x_co++;
			
			if(y_co<ball_y)
				y_co++;
			count++;
			System.out.print("("+x_co+","+y_co+").\n");
		}
		System.out.println("\nYeah...\n\nYou reached the ball in "+count+"steps");
	}
}