package com.kodnest.composition;

class Book {
	Page page;
	
//	public Book(Page page){
//		this.page = page;
//	}
	
	public Book(String content) {
		this.page = new Page(content);
		
	} 
	
	void readPage() {
		System.out.println("The pages are");
		page.display();
		//System.out.println("Reading......");
	}
	
	

}
