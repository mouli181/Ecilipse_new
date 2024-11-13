package com.kodnest.bean;

public class Trainer {
		int id;
		String name;
		@Override
		public String toString() {
			return "Trainer [id=" + id + ", name=" + name + "]";
		}
		public int getId() {
			System.out.println("trainer is getter id ");
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
			System.out.println("Trainer setter id");
		}
		public String getName() {
			System.out.println("trainer is getter name ");
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
			System.out.println("Trainer setter name");
		}
		
		public Trainer(int id, String name) {
			super();
			this.id = id;
			this.name = name;
			System.out.println("Trainer para conns");
		}
		
		public Trainer() {
			super();
			System.out.println("Trainer 0 para cons");
		
		}
}
