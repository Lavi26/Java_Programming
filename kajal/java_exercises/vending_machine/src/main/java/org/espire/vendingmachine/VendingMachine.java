package org.espire.vendingmachine;

import java.util.List;

import org.espire.vendingmachine.bucket.Bucket;

public interface VendingMachine {
	public long selectItemAndGetPrice(Item item);

	public void insertCoin(Coin coin);

	public List<Coin> refund();

	public Bucket<Item, List<Coin>> collectItemAndChange();

	public void reset();
}
