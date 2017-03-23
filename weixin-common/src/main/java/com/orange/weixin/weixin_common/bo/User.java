package com.orange.weixin.weixin_common.bo;

import java.util.Date;

public class User extends BaseBO{
	
	private static final long serialVersionUID = 5237761187213525266L;
	
    private Long id;

    private String userLoginName;

    private String userName;

    private Long superior;

    private Long roleId;

    private String title;

    private String company;

    private String country;

    private String province;

    private String city;

    private String street;

    private String zipcode;

    private String phoneNumber;

    private String cellphoneNumber;

    private String fax;

    private String status;

    private String primaryAccountId;

    private String email;

    private String password;

    private Date lastLoginTime;

    private Byte deleteFlag;

    private String changeLoginName;

    private String tempSessionState;

    private Long currentFunctionId;

    private String lastestloginIp;

    private Integer userRank;

    private Date passwordTime;

    private Integer userType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName == null ? null : userLoginName.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Long getSuperior() {
        return superior;
    }

    public void setSuperior(Long superior) {
        this.superior = superior;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber == null ? null : cellphoneNumber.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getPrimaryAccountId() {
        return primaryAccountId;
    }

    public void setPrimaryAccountId(String primaryAccountId) {
        this.primaryAccountId = primaryAccountId == null ? null : primaryAccountId.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Byte getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Byte deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getChangeLoginName() {
        return changeLoginName;
    }

    public void setChangeLoginName(String changeLoginName) {
        this.changeLoginName = changeLoginName == null ? null : changeLoginName.trim();
    }

    public String getTempSessionState() {
        return tempSessionState;
    }

    public void setTempSessionState(String tempSessionState) {
        this.tempSessionState = tempSessionState == null ? null : tempSessionState.trim();
    }

    public Long getCurrentFunctionId() {
        return currentFunctionId;
    }

    public void setCurrentFunctionId(Long currentFunctionId) {
        this.currentFunctionId = currentFunctionId;
    }

    public String getLastestloginIp() {
        return lastestloginIp;
    }

    public void setLastestloginIp(String lastestloginIp) {
        this.lastestloginIp = lastestloginIp == null ? null : lastestloginIp.trim();
    }

    public Integer getUserRank() {
        return userRank;
    }

    public void setUserRank(Integer userRank) {
        this.userRank = userRank;
    }

    public Date getPasswordTime() {
        return passwordTime;
    }

    public void setPasswordTime(Date passwordTime) {
        this.passwordTime = passwordTime;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

	@Override
	public String toString() {
		return this.userName + this.password + this.userLoginName;
	}
    
    
}