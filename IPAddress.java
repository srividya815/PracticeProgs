package com.vids.may13;

import java.util.ArrayList;
import java.util.List;

public class IPAddress {

	public static void main(String[] args) {
		final String[] log = { 
				"123.123.123.123 - - [26/Apr/2000:00:23:48 -0400] log data",
				"123.123.123.121 - [26/Apr/2000:00:23:47 -0400] log data",
				"123.123.123.124 - [26/Apr/2000:00:23:47 -0400] log data",
				"123.123.123.123 - [26/Apr/2000:00:23:47 -0400] log data",
				"123.123.123.123 - - [26/Apr/2000:00:23:48 -0400] log data",
				"123.123.123.121 - [26/Apr/2000:00:23:47 -0400] log data",
				"123.123.123.124 - [26/Apr/2000:00:23:47 -0400] log data",
				"123.123.123.123 - [26/Apr/2000:00:23:47 -0400] log data",
				"123.123.123.123 - - [26/Apr/2000:00:23:48 -0400] log data",
				"123.123.123.121 - [26/Apr/2000:00:23:47 -0400] log data",
				"123.123.123.124 - [26/Apr/2000:00:23:47 -0400] log data",
				"123.123.123.123 - [26/Apr/2000:00:23:47 -0400] log data",
				"123.123.123.123 - - [26/Apr/2000:00:23:48 -0400] log data",
				"123.123.123.121 - [26/Apr/2000:00:23:47 -0400] log data",
				"123.123.123.124 - [26/Apr/2000:00:23:47 -0400] log data",
				"123.123.123.123 - [26/Apr/2000:00:23:47 -0400] log data",
				"123.123.123.123 - [26/Apr/2000:00:23:47 -0400] log data",
				"123.123.123.123 - [26/Apr/2000:00:23:47 -0400] log data" };

		List<String> ipAddressList = new ArrayList<>();
		for (String s : log) {

			String[] logParts = s.split(" ");
			if (logParts.length > 0) {
				// System.out.println(logParts[0]);
				ipAddressList.add(logParts[0]);
			}

		}

		long maxCount = 0;
		String maxCountIP = "";

		for (String ip : ipAddressList) {
			long count = ipAddressList.stream().filter(listval -> ip.equals(listval)).count();

			if (count > maxCount) {
				maxCount = count;
				maxCountIP = ip;
			}
		}

		System.out.println("IP " + maxCountIP + " appears " + maxCount + " times in the log");

	}

}
