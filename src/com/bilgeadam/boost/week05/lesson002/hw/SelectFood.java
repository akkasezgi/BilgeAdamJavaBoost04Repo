package com.bilgeadam.boost.week05.lesson002.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SelectFood {

	public static void main(String[] args) {
		
		
		
		
		foods();
		
		
		

	}

	private static void foods() {
		
		String [] mainFood = {"kebap", "doner", "musakka", "karniyarik", "kofte", "tavuk", "balik", "tazeFasulye", "pizza", "bamya"};
		String [] snackFood = {"pirincPilav", "makarna", "patatesKizartma", "barbunya", "findikLahmacun", "bulgurPilav", "cigKofte", "corba", "cacik", "salata"};
		String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		
		Random rd = new Random();
		int n = rd.nextInt(mainFood.length);
		int m = rd.nextInt(snackFood.length);
		int t = rd.nextInt(days.length);
		
		
		ArrayList<String> selected = new ArrayList<>();
		ArrayList<String> selectedMainFood = new ArrayList<>(Arrays.asList(mainFood));
		ArrayList<String> selectedSnackFood = new ArrayList<>(Arrays.asList(snackFood));
		ArrayList<String> selectedDays = new ArrayList<>(Arrays.asList(days));
		
		selected.add(selectedDays.get(t));
		selected.add(selectedMainFood.get(n));
		selected.add(selectedSnackFood.get(m));
		
		System.out.println(selected);
		
		
		
		
	}

}
