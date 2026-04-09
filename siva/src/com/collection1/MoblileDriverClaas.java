package com.collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MoblileDriverClaas {

	public static void main(String[] args) {

		MobileListDTOExample1 m1 = new MobileListDTOExample1("t4 pro", " Vivo", 25000, "white", 8);
		MobileListDTOExample1 m2 = new MobileListDTOExample1("p4 pro", "realme", 20000, "blue", 16);
		MobileListDTOExample1 m3 = new MobileListDTOExample1("s4", "samsung", 35000, "black", 8);
		MobileListDTOExample1 m4 = new MobileListDTOExample1("17 pro", "iphone", 150000, "orange", 32);

		List<MobileListDTOExample1> mobiles = new ArrayList<>();

		mobiles.add(m1);
		mobiles.add(m2);
		mobiles.add(m3);
		mobiles.add(m4);

		Iterator<MobileListDTOExample1> itr = mobiles.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

//		for (MobileListDTOExample1 mobile : mobiles) {
//			System.out.println(mobile);
//
//		}

//		MobileListDTOExample1[] MobileList1 = new MobileListDTOExample1[4];
//
//		MobileList1[0] = m1;
//		MobileList1[1] = m2;
//		MobileList1[2] = m3;
//		MobileList1[3] = m4;
//
//		for (MobileListDTOExample1 mobiles : MobileList1) {
//			System.out.println(mobiles);
//			
//			
//		}

	}

}
