package com.mw.mw.domain;

import java.util.Date;

public class H5Plan {
    private Integer id;
    private String name;//计划名称
    private int advertierId;//广告主id
    private double price;//出价
    private int areaStatus;//地域定向:0关闭,1开启
    private String areaCode;//区域编码
    private Date startdate;//投放开始时间
    private Date enddate;//投放结束时间
    private int priority;//优先级
    private double dayBudget;//每日预算
    private int firstindustry;//行业一级分类
    private int secondindustry;//行业二级分类
    private String advertiserPos;//选择的广告位
    private String planformId;//平台id
    private int orientMediaType;//1白名单,2黑名单
    private String orientMedia;//媒体定向
    private String orientTime;//时段定向
    private String orientSystem;//地域定向
    private String orientBrowser;//浏览器定向
    private String browser;
    private int flag;//计划状态:1开启,2暂停
    private int status;//账户状态:0正常,1删除
    private int examine;//计划审核状态 1 代审核 2 审核中 3 审核通过 4 审核拒绝
    private String examineDesc;//1 创意图片不符合要求 2 创意广告标语不符合要求 3 创意落地页链接不符合要求 4 计划广告类型不符合要求 5 计划地域定向不符合要求
    private String examineText;//拒绝信息
    private int closeDesc;//1 投放结束 2 日预算到量 3账户余额不足 4 客户关闭  5计划无创意 6 创意修正,默认0
    private int createId;//创建者id
    private int updateId;//更新着id
    private int createTime;//创建时间
    private int updateTime;//更新时间


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAdvertierId() {
        return advertierId;
    }

    public void setAdvertierId(int advertierId) {
        this.advertierId = advertierId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAreaStatus() {
        return areaStatus;
    }

    public void setAreaStatus(int areaStatus) {
        this.areaStatus = areaStatus;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public double getDayBudget() {
        return dayBudget;
    }

    public void setDayBudget(double dayBudget) {
        this.dayBudget = dayBudget;
    }

    public int getFirstindustry() {
        return firstindustry;
    }

    public void setFirstindustry(int firstindustry) {
        this.firstindustry = firstindustry;
    }

    public int getSecondindustry() {
        return secondindustry;
    }

    public void setSecondindustry(int secondindustry) {
        this.secondindustry = secondindustry;
    }

    public String getAdvertiserPos() {
        return advertiserPos;
    }

    public void setAdvertiserPos(String advertiserPos) {
        this.advertiserPos = advertiserPos;
    }

    public String getPlanformId() {
        return planformId;
    }

    public void setPlanformId(String planformId) {
        this.planformId = planformId;
    }

    public int getOrientMediaType() {
        return orientMediaType;
    }

    public void setOrientMediaType(int orientMediaType) {
        this.orientMediaType = orientMediaType;
    }

    public String getOrientMedia() {
        return orientMedia;
    }

    public void setOrientMedia(String orientMedia) {
        this.orientMedia = orientMedia;
    }

    public String getOrientTime() {
        return orientTime;
    }

    public void setOrientTime(String orientTime) {
        this.orientTime = orientTime;
    }

    public String getOrientSystem() {
        return orientSystem;
    }

    public void setOrientSystem(String orientSystem) {
        this.orientSystem = orientSystem;
    }

    public String getOrientBrowser() {
        return orientBrowser;
    }

    public void setOrientBrowser(String orientBrowser) {
        this.orientBrowser = orientBrowser;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getExamine() {
        return examine;
    }

    public void setExamine(int examine) {
        this.examine = examine;
    }

    public String getExamineDesc() {
        return examineDesc;
    }

    public void setExamineDesc(String examineDesc) {
        this.examineDesc = examineDesc;
    }

    public String getExamineText() {
        return examineText;
    }

    public void setExamineText(String examineText) {
        this.examineText = examineText;
    }

    public int getCloseDesc() {
        return closeDesc;
    }

    public void setCloseDesc(int closeDesc) {
        this.closeDesc = closeDesc;
    }

    public int getCreateId() {
        return createId;
    }

    public void setCreateId(int createId) {
        this.createId = createId;
    }

    public int getUpdateId() {
        return updateId;
    }

    public void setUpdateId(int updateId) {
        this.updateId = updateId;
    }

    public int getCreateTime() {
        return createTime;
    }

    public void setCreateTime(int createTime) {
        this.createTime = createTime;
    }

    public int getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(int updateTime) {
        this.updateTime = updateTime;
    }
}
