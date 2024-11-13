package com.kodnest.abstraction;

import java.util.Scanner;

abstract class Vehicle {

    int speed;

    int fuel;

    public Vehicle(int speed, int fuel) {

        this.speed = speed;

        this.fuel = fuel;

    }

    abstract void start();

    abstract void stop();

    abstract void refuel();

}

class Car1 extends Vehicle {

    public Car1(int speed, int fuel) {

        super(speed, fuel);

    }

    @Override

    void start() {

        System.out.println("Car started.");

    }

    @Override

    void stop() {

        System.out.println("Car stopped.");

    }

    @Override

    void refuel() {

        System.out.println("Car refueled.");

    }

}

class Bike1 extends Vehicle {

    public Bike1(int speed, int fuel) {

        super(speed, fuel);

    }

    @Override

    void start() {

        System.out.println("Bike started.");

    }

    @Override

    void stop() {

        System.out.println("Bike stopped.");

    }

    @Override

    void refuel() {

        System.out.println("Bike refueled.");

    }

}

class Truck extends Vehicle {

    public Truck(int speed, int fuel) {

        super(speed, fuel);

    }

    @Override

    void start() {

        System.out.println("Truck started.");

    }

    @Override

    void stop() {

        System.out.println("Truck stopped.");

    }

    @Override

    void refuel() {

        System.out.println("Truck refueled.");

    }

}


class Main {
	public static void main(String[] args)

	{

	Scanner sc=new Scanner(System.in);

	int in=sc.nextInt();

	if(in==1)

	{

	int sp=sc.nextInt();

	int f=sc.nextInt();

	Vehicle v=new Car1(sp,f);

	v.start();

	v.stop();

	v.refuel();

	}

	else if(in==2)

	{

	int sp=sc.nextInt();

	int f=sc.nextInt();

	Vehicle v=new Bike1(sp,f);

	v.start();

	v.stop();

	v.refuel();

	}

	else if(in==3)

	{

	int sp=sc.nextInt();

	int f=sc.nextInt();

	Vehicle v=new Truck(sp,f);

	v.start();

	v.stop();

	v.refuel();

	}

	}
}
