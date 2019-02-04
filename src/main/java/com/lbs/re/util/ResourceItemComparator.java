package com.lbs.re.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.lbs.re.model.ReResourceitem;

public class ResourceItemComparator {

	public static void orderResourceItems(List<ReResourceitem> resourceItems) {
		Collections.sort(resourceItems, new Comparator<ReResourceitem>() {
			@Override
			public int compare(ReResourceitem o1, ReResourceitem o2) {
				int c;
				c = o1.getOrdernr().compareTo(o2.getOrdernr());
				if (c == 0) {
					c = o1.getLevelnr().compareTo(o2.getLevelnr());
				}
				if (c == 0) {
					c = o1.getTagnr().compareTo(o2.getTagnr());
				}
				return c;
			}
		});
	}

}
