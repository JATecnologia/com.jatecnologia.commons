package com.jatecnologia.commons.core.indentifier;

import java.util.UUID;

public class UUIDUtil {
	public static UUID getUIID() {
		return java.util.UUID.randomUUID();
	}
	public static String getUUIDtoString() {
		return java.util.UUID.randomUUID().toString();
	}
}
