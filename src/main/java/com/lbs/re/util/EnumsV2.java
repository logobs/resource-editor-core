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

import com.lbs.re.localization.ResourceEditorLocalizerWrapper;

public class EnumsV2 {

	public enum ResourceEditorBoolean implements IEnumsV2 {

		FALSE(Boolean.FALSE.booleanValue(), 0, "enum.resourceeditorboolean.false"), //
		TRUE(Boolean.TRUE.booleanValue(), 1, "enum.resourceeditorboolean.true");

		private final Boolean value;
		private final Integer code;
		private final String id;

		ResourceEditorBoolean(Boolean value, Integer code, String id) {
			this.code = code;
			this.value = value;
			this.id = id;
		}

		public Integer getCode() {
			return code;
		}

		@Override
		public String getValue() {
			return value.toString();
		}

		public Boolean getBooleanValue() {
			return value;
		}

		@Override
		public String getId() {
			return id;
		}

		@Override
		public String toString() {
			return getLocaleValue(getId());
		}

	}

	public enum LogType {
		REPORT;
	}

	public enum LogMessage {
		ADD, DELETE, SIZE;
	}

	public enum ResourceEditorUserRole {
		ADMIN(Constants.ADMIN), TESTER(Constants.TESTER);

		private final String label;

		private ResourceEditorUserRole(String label) {
			this.label = label;
		}

		public static String[] getAllRoles() {
			return new String[] { ADMIN.toString(), TESTER.toString() };
		}

		@Override
		public String toString() {
			return this.label;
		}

		public static class Constants {

			public static final String ADMIN = "admin";
			public static final String TESTER = "tester";

			private Constants() {
				// Constants private constructor
			}
		}

	}

	public enum DocType {

		LOCALIZABLEHELP(1), NONLOCALIZABLEHELP(2), REUSABLEHELP(3), LOCALIZABLEJAVA(4);

		private final Integer typ;

		private DocType(Integer typ) {
			this.typ = typ;
		}

		@Override
		public String toString() {
			if (typ == 1) {
				return "Localizable Help Page";
			}
			if (typ == 2) {
				return "Non-Localizable Help Page";
			}
			if (typ == 3) {
				return "Reusable Paragraph";
			}
			if (typ == 4) {
				return "Localizable Javascript File";
			}
			return "";
		}
	}

	public enum ResourceState {

		ACTIVE(1), INACTIVE(0);

		private final Integer typ;

		private ResourceState(Integer typ) {
			this.typ = typ;
		}

		@Override
		public String toString() {
			if (typ == 0) {
				return "InActive";
			}
			if (typ == 1) {
				return "Active";
			}
			return "";
		}

		public Integer getTyp() {
			return typ;
		}

	}

	public enum MessageType {

		ERROR(1), INFO(2), WARN(3), SELECTION(4);

		private final Integer typ;

		private MessageType(Integer typ) {
			this.typ = typ;
		}

		@Override
		public String toString() {
			if (typ == 1) {
				return "Error";
			}
			if (typ == 2) {
				return "Info";
			}
			if (typ == 3) {
				return "Warn";
			}
			if (typ == 4) {
				return "Selection";
			}
			return "";
		}
	}

	public enum ResourceType {

		LOCALIZABLE(1), NONLOCALIZABLE(2);

		private final Integer typ;

		private ResourceType(Integer typ) {
			this.typ = typ;
		}

		@Override
		public String toString() {
			if (typ == 1) {
				return "Localizable";
			}
			if (typ == 2) {
				return "Non-Localizable";
			}
			return "";
		}

		public Integer getTyp() {
			return typ;
		}

	}

	public enum ResourceCase {

		NORESTRICTION(1), LOWERCASE(2), UPPERCASE(3), TITLECASE(4), SENTENCECASE(5);

		private final Integer typ;

		private ResourceCase(Integer typ) {
			this.typ = typ;
		}

		@Override
		public String toString() {
			if (typ == 1) {
				return "NoRestriction";
			}
			if (typ == 2) {
				return "Lowercase";
			}
			if (typ == 3) {
				return "Uppercase";
			}
			if (typ == 4) {
				return "Titlecase";
			}
			if (typ == 5) {
				return "Sentencecase";
			}
			return "";
		}
	}

	public enum OwnerProduct {

		INFRASTRUCTURE(-1), APPLICATION(0);

		private final Integer typ;

		private OwnerProduct(Integer typ) {
			this.typ = typ;
		}

		@Override
		public String toString() {
			if (typ == -1) {
				return "Infrastructure";
			}
			if (typ == 0) {
				return "Application";
			}
			return "";
		}
	}

	public enum UserLanguage {

		TRTR(LogoResConstants.RE_TURKISHTR_NAME), ENUS(LogoResConstants.RE_ENGLISHUS_NAME),
		DEDE(LogoResConstants.RE_GERMANDE_NAME), FAIR(LogoResConstants.RE_PERSIANIR_NAME),
		AZAZ(LogoResConstants.RE_AZERBAIJANIAZ_NAME), RURU(LogoResConstants.RE_RUSSIANRU_NAME),
		BGBG(LogoResConstants.RE_BULGARIANBG_NAME), RORO(LogoResConstants.RE_ROMANIANRO_NAME),
		KAGE(LogoResConstants.RE_GEORGIANGE_NAME), ARJO(LogoResConstants.RE_ARABICJO_NAME),
		FRFR(LogoResConstants.RE_FRENCHFR_NAME), SQKV(LogoResConstants.RE_ALBANIANKV_NAME),
		TKTM(LogoResConstants.RE_TURKMENTM_NAME), AREG(LogoResConstants.RE_ARABICEG_NAME),
		ARSA(LogoResConstants.RE_ARABICSA_NAME);

		private String name;

		private UserLanguage(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return name;
		}
	}

	public enum UserLayoutType {

		V("Vertical"), H("Horizontal");

		private String type;

		private UserLayoutType(String type) {
			this.type = type;
		}

		@Override
		public String toString() {
			return type;
		}
	}

	public enum UserType {

		ADMINISTRATOR(0), PROGRAMMER(1), INTERNALLOCALIZER(2), EXTERNALLOCALIZER(3);

		private final Integer typ;

		private UserType(Integer typ) {
			this.typ = typ;
		}

		@Override
		public String toString() {
			if (typ == 0) {
				return "Administrator";
			}
			if (typ == 1) {
				return "Programmer";
			}
			if (typ == 2) {
				return "Internal Localizer";
			}
			if (typ == 3) {
				return "External Localizer";
			}
			return "";
		}
	}

	public interface IEnumsV2 extends ResourceEditorLocalizerWrapper {

		String getValue();

		String getId();
	}

}
