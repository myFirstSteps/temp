package tk.pankratovm.mavenproject1;

import com.gargoylesoftware.htmlunit.html.*;
import javax.xml.bind.annotation.*;

/**
 *
 * @author pankratov
 */
@XmlType(propOrder = {
    "fullName",
    "shortName",
    "region",
    "tpp",
    "regDate",
    "certificateNumber",
    "okpo",
    "inn",
    "okato",
    "okved",
    "ogrn",
    "mainActivity",
    "legalAddress",
    "actualAddress",
    "postAddress",
    "phoneNumber",
    "faxNumber",
    "jobTitleOfManager",
    "manager",
    "email",
    "url"
})
@XmlRootElement(name = "ROOT")
public class MyISourceEntity {

    public MyISourceEntity() {

    }

    private String fullName;

    private String shortName;

    private String region;

    private String tpp;

    private String regDate;

    private String certificateNumber;

    private String okpo;

    private String inn;

    private String okato;

    private String okved;

    private String ogrn;

    private String mainActivity;

    private String legalAddress;

    private String actualAddress;

    private String postAddress;

    private String phoneNumber;

    private String faxNumber;

    private String jobTitleOfManager;

    private String manager;

    private String email;

    private String url;

    /**
     * @return the fullName
     */
    @XmlElement(required = false, name = "FULL_NAME")
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the shortName
     */
    @XmlElement(required = false)
    public String getShortName() {
        return shortName;
    }

    /**
     * @param shortName the shortName to set
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /**
     * @return the region
     */
    @XmlElement(required = false)
    public String getRegion() {
        return region;
    }

    /**
     * @param region the region to set
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * @return the tpp
     */
    @XmlElement(required = false)
    public String getTpp() {
        return tpp;
    }

    /**
     * @param tpp the tpp to set
     */
    public void setTpp(String tpp) {
        this.tpp = tpp;
    }

    /**
     * @return the regDate
     */
    @XmlElement(required = false)
    public String getRegDate() {
        return regDate;
    }

    /**
     * @param regDate the regDate to set
     */
    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    /**
     * @return the certificateNumber
     */
    @XmlElement(required = false)
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /**
     * @param certificateNumber the certificateNumber to set
     */
    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    /**
     * @return the okpo
     */
    @XmlElement(required = false)
    public String getOkpo() {
        return okpo;
    }

    /**
     * @param okpo the okpo to set
     */
    public void setOkpo(String okpo) {
        this.okpo = okpo;
    }

    /**
     * @return the inn
     */
    @XmlElement(required = false)
    public String getInn() {
        return inn;
    }

    /**
     * @param inn the inn to set
     */
    public void setInn(String inn) {
        this.inn = inn;
    }

    /**
     * @return the okato
     */
    @XmlElement(required = false)
    public String getOkato() {
        return okato;
    }

    /**
     * @param okato the okato to set
     */
    public void setOkato(String okato) {
        this.okato = okato;
    }

    /**
     * @return the okved
     */
    @XmlElement(required = false)
    public String getOkved() {
        return okved;
    }

    /**
     * @param okved the okved to set
     */
    public void setOkved(String okved) {
        this.okved = okved;
    }

    /**
     * @return the ogrn
     */
    @XmlElement(required = false)
    public String getOgrn() {
        return ogrn;
    }

    /**
     * @param ogrn the ogrn to set
     */
    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    /**
     * @return the mainActivity
     */
    @XmlElement(required = false)
    public String getMainActivity() {
        return mainActivity;
    }

    /**
     * @param mainActivity the mainActivity to set
     */
    public void setMainActivity(String mainActivity) {
        this.mainActivity = mainActivity;
    }

    /**
     * @return the legalAddress
     */
    @XmlElement(required = false)
    public String getLegalAddress() {
        return legalAddress;
    }

    /**
     * @param legalAddress the legalAddress to set
     */
    public void setLegalAddress(String legalAddress) {
        this.legalAddress = legalAddress;
    }

    /**
     * @return the actualAddress
     */
    @XmlElement(required = false)
    public String getActualAddress() {
        return actualAddress;
    }

    /**
     * @param actualAddress the actualAddress to set
     */
    public void setActualAddress(String actualAddress) {
        this.actualAddress = actualAddress;
    }

    /**
     * @return the postAddress
     */
    @XmlElement(required = false)
    public String getPostAddress() {
        return postAddress;
    }

    /**
     * @param postAddress the postAddress to set
     */
    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }

    /**
     * @return the phoneNumber
     */
    @XmlElement(required = false)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the faxNumber
     */
    @XmlElement(required = false)
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * @param faxNumber the faxNumber to set
     */
    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    /**
     * @return the jobTitleOfManager
     */
    @XmlElement(required = false)
    public String getJobTitleOfManager() {
        return jobTitleOfManager;
    }

    /**
     * @param jobTitleOfManager the jobTitleOfManager to set
     */
    public void setJobTitleOfManager(String jobTitleOfManager) {
        this.jobTitleOfManager = jobTitleOfManager;
    }

    /**
     * @return the managerName
     */
    @XmlElement(required = false)
    public String getManager() {
        return manager;
    }

    /**
     * @param managerName the managerName to set
     */
    public void setManager(String managerName) {
        this.manager = managerName;
    }

    /**
     * @return the email
     */
    @XmlElement(required = false)
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the url
     */
    @XmlElement(required = false)
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }
}
