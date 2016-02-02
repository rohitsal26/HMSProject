package com.java.hms.main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VersionService {
	
		@Value("${app.version}")
		private String version;

		public String getVersion() {
			return version;
		}
		
}
