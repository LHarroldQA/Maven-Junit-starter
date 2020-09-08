package com.qa.main;

public class Blackjack {
	
	private int dealer,player;
	
	public int play(int dealer,int player) {
		this.dealer = dealer;
		this.player = player;
		if(dealer > 21 && player > 21) {
			return 0;
		} else if(dealer > 21) {
			return player;
		} else if(player > 21) {
			return dealer;
		} 
		return Math.max(dealer, player);
	}
	
	public int getDealer() {
		return dealer;
	}
	
	public int getPlayer() {
		return player;
	}
}
