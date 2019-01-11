package com.lbs.re.data.service.impl.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lbs.re.data.service.language.AlbaniankvService;
import com.lbs.re.data.service.language.ArabicegService;
import com.lbs.re.data.service.language.ArabicjoService;
import com.lbs.re.data.service.language.ArabicsaService;
import com.lbs.re.data.service.language.AzerbaijaniazService;
import com.lbs.re.data.service.language.BulgarianbgService;
import com.lbs.re.data.service.language.EnglishusService;
import com.lbs.re.data.service.language.FrenchfrService;
import com.lbs.re.data.service.language.GeorgiangeService;
import com.lbs.re.data.service.language.GermandeService;
import com.lbs.re.data.service.language.PersianirService;
import com.lbs.re.data.service.language.RomanianroService;
import com.lbs.re.data.service.language.RussianruService;
import com.lbs.re.data.service.language.TurkishtrService;
import com.lbs.re.data.service.language.TurkmentmService;

@Service
public class LanguageServices {

	@Autowired
	private TurkishtrService turkishService;

	@Autowired
	private AlbaniankvService albanianService;

	@Autowired
	private ArabicegService arabicEgService;

	@Autowired
	private ArabicjoService arabicJoService;

	@Autowired
	private ArabicsaService arabicSaService;

	@Autowired
	private AzerbaijaniazService azerbaijaniazService;

	@Autowired
	private BulgarianbgService bulgarianService;

	@Autowired
	private EnglishusService englishService;

	@Autowired
	private FrenchfrService frenchService;

	@Autowired
	private GeorgiangeService georgianService;

	@Autowired
	private GermandeService germanService;

	@Autowired
	private PersianirService persianService;

	@Autowired
	private RomanianroService romanianService;

	@Autowired
	private RussianruService russianruService;

	@Autowired
	private TurkmentmService turkmenService;

	public TurkishtrService getTurkishService() {
		return turkishService;
	}

	public AlbaniankvService getAlbanianService() {
		return albanianService;
	}

	public ArabicegService getArabicEgService() {
		return arabicEgService;
	}

	public ArabicjoService getArabicJoService() {
		return arabicJoService;
	}

	public ArabicsaService getArabicSaService() {
		return arabicSaService;
	}

	public AzerbaijaniazService getAzerbaijaniazService() {
		return azerbaijaniazService;
	}

	public BulgarianbgService getBulgarianService() {
		return bulgarianService;
	}

	public EnglishusService getEnglishService() {
		return englishService;
	}

	public FrenchfrService getFrenchService() {
		return frenchService;
	}

	public GeorgiangeService getGeorgianService() {
		return georgianService;
	}

	public GermandeService getGermanService() {
		return germanService;
	}

	public PersianirService getPersianService() {
		return persianService;
	}

	public RomanianroService getRomanianService() {
		return romanianService;
	}

	public RussianruService getRussianruService() {
		return russianruService;
	}

	public TurkmentmService getTurkmenService() {
		return turkmenService;
	}

}
