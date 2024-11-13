package singleInheritance;

public class Plant {
	 public void grow() {

	        System.out.println("Plant is growing");

	    }

	}

	class Flower extends Plant {

	    public void bloom() {

	        System.out.println("Flower is blooming");

	    }

	}

	class Sol {

	    public static void main(String[] args) {

	        Plant plant = new Flower();

	        plant.grow();

	        //plant.bloom();

	    }

	}

