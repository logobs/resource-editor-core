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

public final class Constants {

	public static final String VERSION = "9.99";
	public static final int SECONDSPERMINUTES = 60;
	public static final int ONE_SECOND = 1000;
	public static final int WAIT_COEFFICIENT = 1;
	public static final String CTRL_PROPERTY = "Property";
	public static final String CTRL_PROPERTY_ATTRIBUTE = "Attribute";
	public static final String CTRL_TYPE_IMAGEBUTTON = "IMAGEBUTTON";
	public static final String CTRL_TYPE_MENUBUTTON = "MENUBUTTON";
	public static final String CTRL_TYPE_POPUPMENU = "POPUPMENU";
	public static final String PROPERTY_PROPERTY_ATTRIBUTE_CUSTOM = "CUSTOM";
	public static final String CTRL_ATTRIBUTE_CLOSE = "CLOSE";
	public static final String CTRL_ATTRIBUTE_SAVECLOSE = "SAVECLOSE";
	public static final String CTRL_ATTRIBUTE_NEW = "DBNEW";
	public static final String CTRL_ATTRIBUTE_UPDATE = "DBUPDATE";
	public static final String CTRL_ATTRIBUTE_DELETE = "DBDELETE";
	public static final String CTRL_ATTRIBUTE_DUPLICATE = "DBDUPLICATE";
	public static final String CTRL_ATTRIBUTE_VIEW = "DBVIEW";
	public static final String CTRL_ATTRIBUTE_SELECT = "DBSELECT";
	public static final String CTRL_TAG = "Tag";
	public static final String CTRL_TYPE = "Type";
	public static final String CTRL_XUIDOC = "XUIDoc";
	public static final String MODULE_NAME = "Name";
	public static final String MODULE_PARAMETER = "ModuleParameter";
	public static final String MODULE_PARAMETER_NAME = "Name";
	public static final String MODULE_PARAMETER_VALUE = "Value";
	public static final String OPERATION_FORM = "Form";
	public static final String OPERATION_CONFIG = "Config";
	// Config File analysis
	public static final String CONFIG_NODETYPE_DEFINITIONS = "Definitions";
	public static final String CONFIG_NODETYPE_TRANSACTIONS = "Transactions";
	public static final String CONFIG_NODE_ATTRIBUTES_CODE = "code";
	public static final String CONFIG_NODE_ATTRIBUTES_NAME = "name";
	public static final String CONFIG_NODE_ATTRIBUTES_ID = "id";
	public static final String CONFIG_NODE_ATTRIBUTES_CODEVALUE_C = "C";
	public static final String CONFIG_NODE_ATTRIBUTES_CODEVALUE_O = "O";
	public static final String CONFIG_NODE_ATTRIBUTES_NAMEVALUE_DEF = "Definitions";
	public static final String CONFIG_NODE_ATTRIBUTES_NAMEVALUE_TRANS = "Transactions";
	public static final String CONFIG_NODE_ATTRIBUTES_NAMEVALUE_TYPES = "Types";
	public static final String CONFIG_NODE_ATTRIBUTES_NAMEVALUE_DEFAULTSANDPARAMETERS = "Defaults and Parameters";
	// DB operations
	public static final int VALUE_POSITIVE = 1;
	public static final int VALUE_NEGATIVE = -1;
	public static final String VALUE_EVET = "YES";
	public static final String VALUE_HAYIR = "NO";
	public static final String VALUE_VAR = "THERE IS";
	public static final String VALUE_YOK = "NO";
	public static final String VALUE_FORMSCANNER = "FormScanner";
	// Other utility
	public static final String VALUE_FIELD_MENUBUTTONITEMNO = "MenuButtonItemNo";
	public static final String VALUE_FIELD_MENUPATH = "MenuPath";
	public static final String VALUE_FIELD_FORMAY = "FormAy";
	public static final String VALUE_TRUE = "true";
	public static final String VALUE_FALSE = "false";
	public static final String VALUE_UNKNOWN = "Unknown";
	public static final String VALUE_NAME = "name";
	public static final String VALUE_MODE = "mode";
	public static final String VALUE_TITLE = "title";
	public static final String VALUE_VERSION = "version";
	public static final String VALUE_MENUBUTTONITEMNO = "menuButtonItemNo";
	public static final String VALUE_MENUBUTTONITEMNAME = "menuButtonItemName";
	public static final String VALUE_FORMAY = "formAy";
	public static final String VALUE_FORMAYINDEX = "formAyIndex";
	public static final String VALUE_FORMAYNO = "formAyNo";
	public static final String VALUE_FORMAYNAME = "formAyName";
	public static final String VALUE_PARENTID = "parentID";
	public static final String VALUE_MENUPATH = "menuPath";
	public static final String VALUE_MENUPATHTITLE = "menuPathTitle";
	public static final String VALUE_TABBEDPANE = "Tabbed Pane - Selected Index";
	public static final String VALUE_REGEX_EXCLUDE = "<$!>";
	public static final String VALUE_REGEX_GROUPPED = "<$gr>";
	public static final String VALUE_REGEX_LOWVALUE = "<$gt>";
	public static final String VALUE_REGEX_HIGHVALUE = "<$lt>";
	public static final String TEXT_PERCENTSIGN = "%";
	public static final String TEXT_AND = "&";
	public static final String TEXT_AND_SCRIPT = "^&";
	public static final String TEXT_UNDERSCORE = "_";
	public static final String TEXT_NEWLINE = "\n";
	public static final String TEXT_NEWLINE_SCRIPT = "\r\n";
	public static final String TEXT_DOUBLE_NEWLINE = "\n\n";
	public static final String TEXT_HTML_NEWLINE = "<br>";
	public static final String TEXT_TAB = "\t";
	public static final String DOUBLE_TEXT_TAB = "\t\t";
	public static final String TEXT_DUOTAB = TEXT_TAB + TEXT_TAB;
	public static final String TEXT_TRIPLETAB = TEXT_DUOTAB + TEXT_TAB;
	public static final String TEXT_COMMANEWLINE = ";\n";
	public static final String TEXT_SEMICOLON = ";";
	public static final String TEXT_COMMA = ",";
	public static final String TEXT_COMMA_WITH_SPACE = ", ";
	public static final String TEXT_DASH = " - ";
	public static final String TEXT_COLON = ":";
	public static final String TEXT_BLANK = " ";

	public static final String EQUAL = "=";
	public static final String BLANK = " ";

	/**
	 * String EMPTY_STRING
	 */
	public static final String EMPTY_STRING = "";
	/**
	 * String COMMAND_SPLIT_STRING
	 */
	public static final String COMMAND_SPLIT_STRING = " ";

	public static final String RESOURCEEDITOR_DATE_FORMAT = "dd-MM-yy";
	public static final String RESOURCEEDITOR_DB_DATE_FORMAT = "dd/MM/yy HH:mm:ss";

	public static final int READ = 1;
	public static final int WRITE = 2;
	public static final int DELETE = 4;

	public static final String JPLATFORM = "jplatform";
	public static final String TIGER = "tiger";
	public static final String DICTIONARY = "dictionary";

	/**
	 * DICTIONARY_DATABASE
	 */
	public static final String DICTIONARY_DATABASE = "DICTIONARY";

	private Constants() {
	}

}