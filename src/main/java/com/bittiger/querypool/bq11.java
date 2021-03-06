package com.bittiger.querypool;

import java.util.StringTokenizer;
//sql.getMostRecentOrder.id
public class bq11 implements QueryMetaData {
	public String query = "SELECT o_id " + "FROM customer, orders "
			+ "WHERE customer.c_id = orders.o_c_id " + "AND c_uname not like '?' "
			+ "ORDER BY o_date, orders.o_id DESC limit 1";
	ParmGenerator pg = new ParmGenerator();

	public String getQueryStr() {
		String qString = "";
		int count = 0;
		StringTokenizer st = new StringTokenizer(query, "?", false);
		while (st.hasMoreTokens()) {
			qString += st.nextToken();
			count++;
			switch (count) {
			case 1:
				qString += pg.getCustomerUserName();
				break;
			case 2:
				break;
			default:
				System.out.println("More token than expected");
				System.exit(100);
			}
		}
		return qString;
	}

}
