package com.business.microbusiness.entity;
//
//import org.apache.axis2.databinding.types.soapencoding.DateTime;

import java.io.Serializable;
import java.util.Date;


/**
 * 影院信息Entity
 *
 * @author WangChen
 * @email wangchen.xa@mopon.cn
 * @date 2017-04-18 14:43:39
 */
public class TCinemaInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//主键
	private Integer id;
	//影院名称
	private String cinemaName;
	//影院编码
	private String cinemaCode;
	//NG版本 如7.1.1
	private String ngVersion;
	//UC版本 如1.0
	private String ucVersion;
	//是否已有更新任务 1是 0否
	private Integer updateTask;
	//操作系统类型 windows\linux
	private String osType;
	//影院级别A\B\C
	private String cinemaLevel;
	//数据罗盘返回的影院级别
	private String levelFromCompass;
	//记录状态 1正常 0删除
	private Integer recordStatus;
	//netProxy版本
	private String netproxyVersion;
	//院线：来源于OA
	private String companyTitle;
	//省份：来源于OA
	private String provinceTitle;
	//市：来源于OA
	private String cityTitle;
	//区：来源于OA
	private String countryTitle;
	//上年票房：来源OA
	private Float lastyearnum;
	//上年观影人次：来源OA
	private Float lastyearperson;
	//上月票房：来源OA
	private Float lastmonthnum;
	//大区：来源OA
	private String zoneTitle;
	//开业时间：来源OA
	private Date opentime;
	//影厅数量：来源OA
	private Integer hallnum;
	//座位数量：来源OA
	private Integer seatnum;
	//所属影投：来源OA
	private String investTitle;
	//是否泰久合作影院：来源OA
	private String taijiuCollaboration;
	//售票系统：来源OA
	private String saleSystem;
	//运营状态 1:未用；2:在用；3:已被切 4:疑似被切 5:已停业
	private String status;
	//UC是否上报了改影院0否1是
	private Integer ucReport;
	//ETL版本
	private String etlVersion;

	//影院联系人：来源OA
	private String linkman;

	//影院联系人职称：来源OA
	private String contacttitle;

	//联系人电话：来源OA
	private String tel;

	//影院地址：来源OA
	private String address;

	//部门ID
	private Integer departmentId;

	//是否申请代理：1、代理；2直销 ：来源OA
	private Integer isagent;

	//代理商code：来源OA
	private String agentCode;

	//代理商name：来源OA
	private String agentName;

	//代理商code2：来源OA
	private String agentCode2;

	//代理商name2：来源OA
	private String agentName2;

	//实施模式 :1、远程(online)；2、上门(offline)；
	private Integer actionMode;

	//实施工程师
	private String engineerName;

	//实施状态:0、未完成(unfinished )；1、完成(finished)
	private Integer actionStatus;

	//实施日期
	private Date actionTime;

	//院线id
	private Long companyId;

	//业务员名称 (来源OA)
	private String applyname;

	//业务员id(来源OA)
	private String applyid;

	//自助机是否补贴 1有 2无(来源OA)
	private Integer  isMachineSubsidy;

	//所属公司(来源OA)
	private String firm;

	//安装系统 0新装 2切换 (来源OA)
	private Integer  installationType;

	//被切系统： 0:辰星 1满天星 2凤凰佳影  3 vista  4 1905  5鼎新 数据来源于OA
	private Integer oldSaleSystem;

	//收费类型1、免费(free)；2、收费(charge)；
	private Integer chargetype;

	//是否培训 1是 0否
	private Integer istrain;

	//证书申请状态 0（未申请），1（已申请），2（审核通过）
	private Integer licenseApplyStatus;

	//影院类型：1全国连锁 2地区连锁 3单体影院
	private Integer cinemaType;

	private String cpu;
	private String serverversion;//服务器型号
	private String raid;//raid类型
	private String harddisk;//硬盘
	private String memory;//内存
	private String ip;
	private String mac;

	//最后一次操作人员id
	private Long lastUpdateId;


	private Integer installId;

	private Integer clientId;


	private Date reportDate;

	//系统类型 :1、地面；2、云+端；3、纯云
	private Integer systemType;

	//是否偷票房 :1、否；2、是
	private Integer isStole;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCinemaName() {
		return cinemaName;
	}

	public void setCinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}

	public String getCinemaCode() {
		return cinemaCode;
	}

	public void setCinemaCode(String cinemaCode) {
		this.cinemaCode = cinemaCode;
	}

	public String getNgVersion() {
		return ngVersion;
	}

	public void setNgVersion(String ngVersion) {
		this.ngVersion = ngVersion;
	}

	public String getUcVersion() {
		return ucVersion;
	}

	public void setUcVersion(String ucVersion) {
		this.ucVersion = ucVersion;
	}

	public Integer getUpdateTask() {
		return updateTask;
	}

	public void setUpdateTask(Integer updateTask) {
		this.updateTask = updateTask;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	public String getCinemaLevel() {
		return cinemaLevel;
	}

	public void setCinemaLevel(String cinemaLevel) {
		this.cinemaLevel = cinemaLevel;
	}

	public String getLevelFromCompass() {
		return levelFromCompass;
	}

	public void setLevelFromCompass(String levelFromCompass) {
		this.levelFromCompass = levelFromCompass;
	}

	public Integer getRecordStatus() {
		return recordStatus;
	}

	public void setRecordStatus(Integer recordStatus) {
		this.recordStatus = recordStatus;
	}

	public String getNetproxyVersion() {
		return netproxyVersion;
	}

	public void setNetproxyVersion(String netproxyVersion) {
		this.netproxyVersion = netproxyVersion;
	}

	public String getCompanyTitle() {
		return companyTitle;
	}

	public void setCompanyTitle(String companyTitle) {
		this.companyTitle = companyTitle;
	}

	public String getProvinceTitle() {
		return provinceTitle;
	}

	public void setProvinceTitle(String provinceTitle) {
		this.provinceTitle = provinceTitle;
	}

	public String getCityTitle() {
		return cityTitle;
	}

	public void setCityTitle(String cityTitle) {
		this.cityTitle = cityTitle;
	}

	public String getCountryTitle() {
		return countryTitle;
	}

	public void setCountryTitle(String countryTitle) {
		this.countryTitle = countryTitle;
	}

	public Float getLastyearnum() {
		return lastyearnum;
	}

	public void setLastyearnum(Float lastyearnum) {
		this.lastyearnum = lastyearnum;
	}

	public Float getLastyearperson() {
		return lastyearperson;
	}

	public void setLastyearperson(Float lastyearperson) {
		this.lastyearperson = lastyearperson;
	}

	public Float getLastmonthnum() {
		return lastmonthnum;
	}

	public void setLastmonthnum(Float lastmonthnum) {
		this.lastmonthnum = lastmonthnum;
	}

	public String getZoneTitle() {
		return zoneTitle;
	}

	public void setZoneTitle(String zoneTitle) {
		this.zoneTitle = zoneTitle;
	}

	public Date getOpentime() {
		return opentime;
	}

	public void setOpentime(Date opentime) {
		this.opentime = opentime;
	}

	public Integer getHallnum() {
		return hallnum;
	}

	public void setHallnum(Integer hallnum) {
		this.hallnum = hallnum;
	}

	public Integer getSeatnum() {
		return seatnum;
	}

	public void setSeatnum(Integer seatnum) {
		this.seatnum = seatnum;
	}

	public String getInvestTitle() {
		return investTitle;
	}

	public void setInvestTitle(String investTitle) {
		this.investTitle = investTitle;
	}

	public String getTaijiuCollaboration() {
		return taijiuCollaboration;
	}

	public void setTaijiuCollaboration(String taijiuCollaboration) {
		this.taijiuCollaboration = taijiuCollaboration;
	}

	public String getSaleSystem() {
		return saleSystem;
	}

	public void setSaleSystem(String saleSystem) {
		this.saleSystem = saleSystem;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getUcReport() {
		return ucReport;
	}

	public void setUcReport(Integer ucReport) {
		this.ucReport = ucReport;
	}

	public String getEtlVersion() {
		return etlVersion;
	}

	public void setEtlVersion(String etlVersion) {
		this.etlVersion = etlVersion;
	}

	public String getLinkman() {
		return linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public String getContacttitle() {
		return contacttitle;
	}

	public void setContacttitle(String contacttitle) {
		this.contacttitle = contacttitle;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public Integer getIsagent() {
		return isagent;
	}

	public void setIsagent(Integer isagent) {
		this.isagent = isagent;
	}

	public String getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getAgentCode2() {
		return agentCode2;
	}

	public void setAgentCode2(String agentCode2) {
		this.agentCode2 = agentCode2;
	}

	public String getAgentName2() {
		return agentName2;
	}

	public void setAgentName2(String agentName2) {
		this.agentName2 = agentName2;
	}

	public Integer getActionMode() {
		return actionMode;
	}

	public void setActionMode(Integer actionMode) {
		this.actionMode = actionMode;
	}

	public String getEngineerName() {
		return engineerName;
	}

	public void setEngineerName(String engineerName) {
		this.engineerName = engineerName;
	}

	public Integer getActionStatus() {
		return actionStatus;
	}

	public void setActionStatus(Integer actionStatus) {
		this.actionStatus = actionStatus;
	}

	public Date getActionTime() {
		return actionTime;
	}

	public void setActionTime(Date actionTime) {
		this.actionTime = actionTime;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getApplyname() {
		return applyname;
	}

	public void setApplyname(String applyname) {
		this.applyname = applyname;
	}

	public String getApplyid() {
		return applyid;
	}

	public void setApplyid(String applyid) {
		this.applyid = applyid;
	}

	public Integer getIsMachineSubsidy() {
		return isMachineSubsidy;
	}

	public void setIsMachineSubsidy(Integer isMachineSubsidy) {
		this.isMachineSubsidy = isMachineSubsidy;
	}

	public String getFirm() {
		return firm;
	}

	public void setFirm(String firm) {
		this.firm = firm;
	}

	public Integer getInstallationType() {
		return installationType;
	}

	public void setInstallationType(Integer installationType) {
		this.installationType = installationType;
	}

	public Integer getChargetype() {
		return chargetype;
	}

	public void setChargetype(Integer chargetype) {
		this.chargetype = chargetype;
	}

	public Integer getIstrain() {
		return istrain;
	}

	public void setIstrain(Integer istrain) {
		this.istrain = istrain;
	}

	public Integer getLicenseApplyStatus() {
		return licenseApplyStatus;
	}

	public void setLicenseApplyStatus(Integer licenseApplyStatus) {
		this.licenseApplyStatus = licenseApplyStatus;
	}

	public Integer getCinemaType() {
		return cinemaType;
	}

	public void setCinemaType(Integer cinemaType) {
		this.cinemaType = cinemaType;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getServerversion() {
		return serverversion;
	}

	public void setServerversion(String serverversion) {
		this.serverversion = serverversion;
	}

	public String getRaid() {
		return raid;
	}

	public void setRaid(String raid) {
		this.raid = raid;
	}

	public String getHarddisk() {
		return harddisk;
	}

	public void setHarddisk(String harddisk) {
		this.harddisk = harddisk;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public Long getLastUpdateId() {
		return lastUpdateId;
	}

	public void setLastUpdateId(Long lastUpdateId) {
		this.lastUpdateId = lastUpdateId;
	}

//	public DateTime getLastUpdateTime() {
//		return lastUpdateTime;
//	}
//
//	public void setLastUpdateTime(DateTime lastUpdateTime) {
//		this.lastUpdateTime = lastUpdateTime;
//	}

	public Integer getInstallId() {
		return installId;
	}

	public void setInstallId(Integer installId) {
		this.installId = installId;
	}

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

//	public DateTime getCreateTime() {
//		return createTime;
//	}
//
//	public void setCreateTime(DateTime createTime) {
//		this.createTime = createTime;
//	}

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public Integer getSystemType() {
		return systemType;
	}

	public void setSystemType(Integer systemType) {
		this.systemType = systemType;
	}

	public Integer getIsStole() {
		return isStole;
	}

	public void setIsStole(Integer isStole) {
		this.isStole = isStole;
	}


	public Integer getOldSaleSystem() {
		return oldSaleSystem;
	}

	public void setOldSaleSystem(Integer oldSaleSystem) {
		this.oldSaleSystem = oldSaleSystem;
	}
}
