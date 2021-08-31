package com.constructor;

public class SocietyTest {

	public static void main(String[] args) {
		Address a = new Address ("Noida",201305,"india", "PS 1401 T6");
		
		
		Society1 s = new Society1 ("ShreeGanesha", a,2);
		
		
		
		Tower t = new Tower ();
		t.towernum = 1;
		t.towertype = "2bhk";
		t.towername = "Sidhi";
		t.floors1 = new floor [3];

		
		
		floor f = new floor(6);
		floor f1 = new floor(6);
		floor f2 = new floor(6);
		
		t.floors1[0] = f;
		t.floors1[1] =f1;
		t.floors1[2] = f2;
		
		//house h = new house(1,)
		
		
		Tower t1 = new Tower ();
		t1.towernum = 2;
		t1.towertype = "3bhk";
		t1.towername = "Vinayaka";
		t1.floors1 = new floor [2];
		
		
		floor f3 = new floor(2);
		floor f4 = new floor(2);
		t1.floors1[0] = f3;
		t1.floors1[1] =f4;
		
		s.towers[0] = t;
		s.towers[1] = t1;
		
		//System.out.println(t1.towername+" "+t1.floors1.length);
		//System.out.println(t.towername+" "+t.floors1.length);
		System.out.println(s.towers[0].floors1.length);

	}

}
