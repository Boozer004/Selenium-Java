package org.sports;

public class Sports {
	public void acheiver(String name, int medalCount) {
		System.out.println("The name of the acheiver is " + name + " and medal count is " + medalCount);
	}

	public void acheiver(String country, String sportName, int rank) {
		System.out.println("Country is " + country + " and sports is " + sportName
				+ " adn the rank is " + rank);
	}

	public void acheiver(float weight, int height, long contactNo) {
		System.out.println("Weight is " + weight + " and height is " + height
				+ " and contact number is " + contactNo);
	}

	public void acheiver(String tournamentName, long prizeMoney) {
		System.out.println("Tournament name is " + tournamentName + " and prize money is " + prizeMoney);
	}

	public static void main(String[] args) {
		Sports sport = new Sports();
		sport.acheiver("SaniaMirza", 2);
		sport.acheiver("India", "Tennis", 5);
		sport.acheiver(65, 164, 9876543210L);
		sport.acheiver("Olympics", 50000000L);
	}
}
