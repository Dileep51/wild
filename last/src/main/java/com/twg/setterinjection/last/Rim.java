package com.twg.setterinjection.last;

public class Rim extends Dum
{
	private Jim jim;
	public Jim getJim() {
		return jim;
	}
	public void setJim(Jim jim) {
		this.jim = jim;
	}
	public void rim()
	{
		System.out.println("Rim first next");
		jim.jim();
	}
	public void kottu()
	{
		System.out.println("rim tho kottu");
	}
}
