package com.nezha.gcar.member.entity;

import java.io.Serializable;
import java.util.Date;

public class Member  implements Serializable {
    private Long id;

    private String name;

    private String mobile;

    private String openid;

    private Byte sex;

    private Byte fromMember;

    private Long marketingId;

    private String marketingName;

    private Long recommendId;

    private String recommendName;

    private Date created;

    private Byte statuts;

    private Byte isSelles;

    private Byte isButler;

    private Byte type;

    private Byte mark;

    private Byte focusType;

    private String modifierId;

    private String modifier;

    private Date lasttimeModify;

    private String cityId;

    private String cityCode;

    private String cityName;

    private String imageUrl;

    private Byte isTestDriver;

    private String imageQrcode;

    private String orgId;

    private String orgName;

    private String orgTel;

    private String sysuserId;

    private String sysuserName;

    private Byte infoAudit;

    private Byte useCarApproved;

    private Byte buyApproved;

    private Byte isAuditor;

    private String sureName;

    private String nationality;

    private Long nationalityId;

    private String idcard;

    private Date addtime;

    private Byte memberType;

    private Byte isSalesManager;

    private Byte isCustomerManager;

    private Byte isCustomer;

    private Byte isSalesSupport;

    private Date birthday;

    private Long channelId;

    private Long cardId;

    private Byte hasPassRecord;

    private Byte isGetcashAuditor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Byte getFromMember() {
        return fromMember;
    }

    public void setFromMember(Byte fromMember) {
        this.fromMember = fromMember;
    }

    public Long getMarketingId() {
        return marketingId;
    }

    public void setMarketingId(Long marketingId) {
        this.marketingId = marketingId;
    }

    public String getMarketingName() {
        return marketingName;
    }

    public void setMarketingName(String marketingName) {
        this.marketingName = marketingName;
    }

    public Long getRecommendId() {
        return recommendId;
    }

    public void setRecommendId(Long recommendId) {
        this.recommendId = recommendId;
    }

    public String getRecommendName() {
        return recommendName;
    }

    public void setRecommendName(String recommendName) {
        this.recommendName = recommendName;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Byte getStatuts() {
        return statuts;
    }

    public void setStatuts(Byte statuts) {
        this.statuts = statuts;
    }

    public Byte getIsSelles() {
        return isSelles;
    }

    public void setIsSelles(Byte isSelles) {
        this.isSelles = isSelles;
    }

    public Byte getIsButler() {
        return isButler;
    }

    public void setIsButler(Byte isButler) {
        this.isButler = isButler;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getMark() {
        return mark;
    }

    public void setMark(Byte mark) {
        this.mark = mark;
    }

    public Byte getFocusType() {
        return focusType;
    }

    public void setFocusType(Byte focusType) {
        this.focusType = focusType;
    }

    public String getModifierId() {
        return modifierId;
    }

    public void setModifierId(String modifierId) {
        this.modifierId = modifierId;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Date getLasttimeModify() {
        return lasttimeModify;
    }

    public void setLasttimeModify(Date lasttimeModify) {
        this.lasttimeModify = lasttimeModify;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Byte getIsTestDriver() {
        return isTestDriver;
    }

    public void setIsTestDriver(Byte isTestDriver) {
        this.isTestDriver = isTestDriver;
    }

    public String getImageQrcode() {
        return imageQrcode;
    }

    public void setImageQrcode(String imageQrcode) {
        this.imageQrcode = imageQrcode;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgTel() {
        return orgTel;
    }

    public void setOrgTel(String orgTel) {
        this.orgTel = orgTel;
    }

    public String getSysuserId() {
        return sysuserId;
    }

    public void setSysuserId(String sysuserId) {
        this.sysuserId = sysuserId;
    }

    public String getSysuserName() {
        return sysuserName;
    }

    public void setSysuserName(String sysuserName) {
        this.sysuserName = sysuserName;
    }

    public Byte getInfoAudit() {
        return infoAudit;
    }

    public void setInfoAudit(Byte infoAudit) {
        this.infoAudit = infoAudit;
    }

    public Byte getUseCarApproved() {
        return useCarApproved;
    }

    public void setUseCarApproved(Byte useCarApproved) {
        this.useCarApproved = useCarApproved;
    }

    public Byte getBuyApproved() {
        return buyApproved;
    }

    public void setBuyApproved(Byte buyApproved) {
        this.buyApproved = buyApproved;
    }

    public Byte getIsAuditor() {
        return isAuditor;
    }

    public void setIsAuditor(Byte isAuditor) {
        this.isAuditor = isAuditor;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Long getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(Long nationalityId) {
        this.nationalityId = nationalityId;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Byte getMemberType() {
        return memberType;
    }

    public void setMemberType(Byte memberType) {
        this.memberType = memberType;
    }

    public Byte getIsSalesManager() {
        return isSalesManager;
    }

    public void setIsSalesManager(Byte isSalesManager) {
        this.isSalesManager = isSalesManager;
    }

    public Byte getIsCustomerManager() {
        return isCustomerManager;
    }

    public void setIsCustomerManager(Byte isCustomerManager) {
        this.isCustomerManager = isCustomerManager;
    }

    public Byte getIsCustomer() {
        return isCustomer;
    }

    public void setIsCustomer(Byte isCustomer) {
        this.isCustomer = isCustomer;
    }

    public Byte getIsSalesSupport() {
        return isSalesSupport;
    }

    public void setIsSalesSupport(Byte isSalesSupport) {
        this.isSalesSupport = isSalesSupport;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    public Byte getHasPassRecord() {
        return hasPassRecord;
    }

    public void setHasPassRecord(Byte hasPassRecord) {
        this.hasPassRecord = hasPassRecord;
    }

    public Byte getIsGetcashAuditor() {
        return isGetcashAuditor;
    }

    public void setIsGetcashAuditor(Byte isGetcashAuditor) {
        this.isGetcashAuditor = isGetcashAuditor;
    }
}