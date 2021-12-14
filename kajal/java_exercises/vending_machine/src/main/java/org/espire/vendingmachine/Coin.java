package org.espire.vendingmachine;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

import org.junit.runner.Description;
import org.junit.runner.manipulation.Ordering;

public enum Coin {

	Penny(1), Nickel(5), Dime(10), Quarter(25);

	private int value;

	private Coin(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static final Ordering MOST_VALUABLE_FIRST = new Ordering() {
		public int compare(Coin left, Coin right) {
			return left.getValue() - right.getValue();
		}

		@Override
		protected List<Description> orderItems(Collection<Description> descriptions) {
			// TODO Auto-generated method stub
			return null;
		}
	};

	public static Predicate<Coin> maxValuePredicate(final int maxValue) {
		return new Predicate<Coin>() {
			public boolean apply(Coin input) {
				return input.getValue() <= maxValue;
			}

			@Override
			public boolean test(Coin t) {
				// TODO Auto-generated method stub
				return false;
			}

			
		};
	}

}