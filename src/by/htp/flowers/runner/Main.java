package by.htp.flowers.runner;

import by.htp.flowers.bean.Flower;
import by.htp.flowers.logic.BotanicEncyclopedia;
import by.htp.flowers.logic.FortuneTeller;

public class Main {

	public static void main(String[] args) {

		BotanicEncyclopedia enc = new BotanicEncyclopedia();

		String[] answer1 = { "Ans11", "Ans12", "Ans13", "Ans14", "Ans15", "Ans16" };
		FortuneTeller frt1 = new FortuneTeller("Question 1 ", answer1);

		String[] answer2 = { "Ans21", "Ans22", "Ans23", "Ans24" };
		FortuneTeller frt2 = new FortuneTeller("Question 2 ", answer2);

		String[] answer3 = { "Ans31", "Ans32", "Ans33", "Ans34", "Ans35", "Ans36", "Ans37", "Ans38", "Ans39", "Ans310",
				"Ans11", "Ans312" };
		FortuneTeller frt3 = new FortuneTeller("Question 3 ", answer3);

		System.out.println("-------------------");
		System.out.println("New flower born.");
		Flower flower = new Flower("Cammomile", 10, 1);

		enc.printFlowerInfo(flower);

		System.out.println("-------------------");
		System.out.println("Flower grow.");
		flower.grow(25, 3, 5);
		enc.printFlowerInfo(flower);

		System.out.println("-------------------");
		System.out.println("Flower bloom.");
		flower.bloom(8, "yellow");
		enc.printFlowerInfo(flower);

		System.out.println("-------------------");
		System.out.println("Flower wither.");
		flower.wither(4, "haki");
		enc.printFlowerInfo(flower);

		System.out.println("-------------------");
		System.out.println("Quantity of leaves: " + flower.getBud().getLeaves().length);

		frt1.tellTheTruth(flower);
		frt2.tellTheTruth(flower);
		frt3.tellTheTruth(flower);

	}

}
