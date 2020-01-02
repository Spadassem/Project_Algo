package com.test.projetAPI.validator;

import java.util.regex.Pattern;

public class RequestValidator {

	public static int INVALID_STATUS_PARAM = 1;
	public static int INVALID_CATEGORY_IDS_PARAM = 2;
	public static int VALID_REQUEST = 0;

	public static int validate(String name, String categoriesIds, Integer status) {

		if (status != null) {
			if (status > 5 || status < 1) {
				return INVALID_STATUS_PARAM;
			}
		}

		if (categoriesIds != null) {
			String[] categoryArray = categoriesIds.split(",");
			for (int i = 0; i < categoryArray.length; i++) {
				if (!categoryArray[i].matches("-?([0-9]\\d*)")) {
					return INVALID_CATEGORY_IDS_PARAM;
				}
			}
		}
		return VALID_REQUEST;
	}

}
