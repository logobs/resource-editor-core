package com.lbs.re.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "RE_RESOURCEITEMS", indexes = {
		@Index(name = "I_RESOURCEITEMS_INFO", columnList = "INFO,ID", unique = true),
		@Index(name = "I_RESOURCEITEMS_ORDERNR_TAGNR", columnList = "RESOURCEREF,ORDERNR,TAGNR", unique = true),
		@Index(name = "I_RESOURCEITEMS_TAGNR", columnList = "RESOURCEREF,TAGNR", unique = true) })
@EntityListeners(AuditingEntityListener.class)
public class ReResourceitem extends ReResourceitemBase implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	public static final String PROPERTY_NAME_DATABASE_DRIVER = "db.driver";

	@Transient
	private String turkishTr;

	@Transient
	private String albanianKv;

	@Transient
	private String arabicEg;

	@Transient
	private String arabicJo;

	@Transient
	private String arabicSa;

	@Transient
	private String azerbaijaniAz;

	@Transient
	private String bulguarianBg;

	@Transient
	private String englishUs;

	@Transient
	private String frenchFr;

	@Transient
	private String georgianGe;

	@Transient
	private String germanDe;

	@Transient
	private String persianIr;

	@Transient
	private String romanianRo;

	@Transient
	private String russianRu;

	@Transient
	private String turkmenTm;

	public ReResourceitem() {
		/* */
	}

	public String getTurkishTr() {
		return turkishTr;
	}

	public void setTurkishTr(String turkishTr) {
		this.turkishTr = turkishTr;
	}

	public String getAlbanianKv() {
		return albanianKv;
	}

	public void setAlbanianKv(String albanianKv) {
		this.albanianKv = albanianKv;
	}

	public String getArabicEg() {
		return arabicEg;
	}

	public void setArabicEg(String arabicEg) {
		this.arabicEg = arabicEg;
	}

	public String getArabicJo() {
		return arabicJo;
	}

	public void setArabicJo(String arabicJo) {
		this.arabicJo = arabicJo;
	}

	public String getArabicSa() {
		return arabicSa;
	}

	public void setArabicSa(String arabicSa) {
		this.arabicSa = arabicSa;
	}

	public String getAzerbaijaniAz() {
		return azerbaijaniAz;
	}

	public void setAzerbaijaniAz(String azerbaijaniAz) {
		this.azerbaijaniAz = azerbaijaniAz;
	}

	public String getBulguarianBg() {
		return bulguarianBg;
	}

	public void setBulguarianBg(String bulguarianBg) {
		this.bulguarianBg = bulguarianBg;
	}

	public String getEnglishUs() {
		return englishUs;
	}

	public void setEnglishUs(String englishUs) {
		this.englishUs = englishUs;
	}

	public String getFrenchFr() {
		return frenchFr;
	}

	public void setFrenchFr(String frenchFr) {
		this.frenchFr = frenchFr;
	}

	public String getGeorgianGe() {
		return georgianGe;
	}

	public void setGeorgianGe(String georgianGe) {
		this.georgianGe = georgianGe;
	}

	public String getGermanDe() {
		return germanDe;
	}

	public void setGermanDe(String germanDe) {
		this.germanDe = germanDe;
	}

	public String getPersianIr() {
		return persianIr;
	}

	public void setPersianIr(String persianIr) {
		this.persianIr = persianIr;
	}

	public String getRomanianRo() {
		return romanianRo;
	}

	public void setRomanianRo(String romanianRo) {
		this.romanianRo = romanianRo;
	}

	public String getRussianRu() {
		return russianRu;
	}

	public void setRussianRu(String russianRu) {
		this.russianRu = russianRu;
	}

	public String getTurkmenTm() {
		return turkmenTm;
	}

	public void setTurkmenTm(String turkmenTm) {
		this.turkmenTm = turkmenTm;
	}

	public ReResourceitem copyResourceItem(ReResource resource) {
		ReResourceitem copiedResourceItem = new ReResourceitem();
		copiedResourceItem.setActive(getActive());
		copiedResourceItem.setInfo(getInfo());
		copiedResourceItem.setLevelnr(getLevelnr());
		copiedResourceItem.setLocalizationaffected(getLocalizationaffected());
		copiedResourceItem.setOrdernr(getOrdernr());
		copiedResourceItem.setOwnerproduct(getOwnerproduct());
		copiedResourceItem.setPrefixstr(getPrefixstr());
		copiedResourceItem.setRequested(getRequested());
		copiedResourceItem.setResourcecase(resource.getResourcecase());
		copiedResourceItem.setResourcecategory(resource.getResourcecategory());
		copiedResourceItem.setResourcetype(resource.getResourcetype().getTyp());
		copiedResourceItem.setRightlevelnr(getRightlevelnr());
		copiedResourceItem.setRightparentid(getRightparentid());
		copiedResourceItem.setTagnr(getTagnr());
		copiedResourceItem.setVersion(getVersion());
		// copiedResourceItem.setReTurkishtr(getReTurkishtr());
		// copiedResourceItem.setReEnglishus(getReEnglishus());
		// copiedResourceItem.setReGermande(getReGermande());
		// copiedResourceItem.setRePersianir(getRePersianir());
		// copiedResourceItem.setReAzerbaijaniaz(getReAzerbaijaniaz());
		// copiedResourceItem.setReBulgarianbg(getReBulgarianbg());
		// copiedResourceItem.setReRussianru(getReRussianru());
		// copiedResourceItem.setReRomanianro(getReRomanianro());
		// copiedResourceItem.setReGeorgiange(getReGeorgiange());
		// copiedResourceItem.setReArabicjo(getReArabicjo());
		// copiedResourceItem.setReFrenchfr(getReFrenchfr());
		// copiedResourceItem.setReAlbaniankv(getReAlbaniankv());
		// copiedResourceItem.setReTurkmentm(getReTurkmentm());
		// copiedResourceItem.setReArabiceg(getReArabiceg());
		// copiedResourceItem.setReArabicsa(getReArabicsa());
		// copiedResourceItem.setReStandard(getReStandard());
		return copiedResourceItem;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
	/**
	 * @PostRemove protected void afterDelete() { ReTurkishtrRep reTurkishtrRep =
	 *             LogoresMainUI.getMrepositorycontainer().getReTurkishtrRep();
	 *             List<ReTurkishtr> reTurkishtrs =
	 *             reTurkishtrRep.findByresourceitemrefEqualsForDelete(getId());
	 *             reTurkishtrs.forEach(item -> reTurkishtrRep.delete(item)); }
	 **/
}
