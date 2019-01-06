/*
 * Copyright 2014-2019 Logo Business Solutions
 * (a.k.a. LOGO YAZILIM SAN. VE TIC. A.S)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.lbs.re.util;

public class Enums {

	public Enums() {
		super();
	}

	public enum Number implements IEnums {
		// VALUE-NAME-ID // EXPLANATION
		ZERO("ZERO", 0), // 0=ZERO
		ONE("ONE", 1), // 1=ONE
		TWO("TWO", 2), // 2=TWO
		THREE("THREE", 3), // 3=THREE
		FOUR("FOUR", 4); // 4=FOUR

		private final String name;
		private final Integer code;

		Number(String name, Integer code) {
			this.name = name;
			this.code = code;
		}

		public static Number fromCode(Integer code) {
			if (code != null) {
				for (Number numbers : values()) {
					if (numbers.getCode().equals(code)) {
						return numbers;
					}
				}
			}
			return getDefault();
		}

		/**
		 * @return <br>
		 *         this method getDefault
		 * @author Tarik.Mikyas
		 */
		public static Number getDefault() {
			return null;
		}

		@Override
		public Integer getCode() {
			return code;
		}

		/**
		 * @return <br>
		 *         this method getName
		 * @author Tarik.Mikyas
		 */
		public String getName() {
			return name;
		}

		/**
		 * this method getIntCode <br>
		 *
		 * @return <br>
		 * @author Tarik.Mikyas
		 */
		public int getIntCode() {
			return code.intValue();
		}
	}

	/**
	 * @author Tarik.Mikyas<br>
	 *         <p>
	 *         log message levels
	 */
	public enum ResourceEditorLogLevel implements IEnums {

		ALL("ALL", 0),
		TRACE("TRACE", 1),
		TRACE_INT("TRACE_INT", 2),
		DEBUG("DEBUG", 3),
		INFO("INFO", 4),
		WARN("WARN", 5),
		ERROR("ERROR", 6),
		FATAL("FATAL", 7),
		OFF("OFF", 8);

		private String levelName;
		private Integer levelCode;

		/**
		 * @param levelName
		 * @param levelCode
		 */
		ResourceEditorLogLevel(String levelName, Integer levelCode) {
			this.levelName = levelName;
			this.levelCode = levelCode;
		}

		public static ResourceEditorLogLevel getDefault() {
			return ALL;
		}

		public String getName() {
			return levelName;
		}

		@Override
		public Integer getCode() {
			return levelCode;
		}

	}

	public enum FileName {
		BASE("Base"), //
		CONTROL_FILE("controlFile.txt"), //
		FINISH_FILE("finishFile.txt"), //
		CONFIG_PROPERTIES("application.properties");

		private String name;

		private FileName(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}
	}

	public interface IEnums {
		// you return an enum value for each enum value from
		// a static value from the fromValue () routine.
		// Be Generic
		Object getCode();
	}

}
