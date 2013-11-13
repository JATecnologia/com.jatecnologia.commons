package com.jatecnologia.commons.core.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExUtil {
	/**
	 * Validate one extension of file
	 * @param extension:   extension of file, sample: txt , xml , doc 
	 * @return
	 */
	public static boolean validateExtensionFile(String extension) {
		Pattern p = Pattern.compile("[a-z,A-Z]{1,3}");
		Matcher m = p.matcher(extension);

		if (m.matches()) {
			return true;
		}
		return false;

	}
}
