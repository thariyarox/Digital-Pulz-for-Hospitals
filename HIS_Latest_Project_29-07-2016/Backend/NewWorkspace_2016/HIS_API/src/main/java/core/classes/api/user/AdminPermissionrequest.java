package core.classes.api.user;

import java.util.Date;

/**
 * AdminPermissionrequest generated by hbm2java
 */
public class AdminPermissionrequest implements java.io.Serializable {

	private Integer requestId;
	private AdminUser adminUserByApprover;
	private AdminUser adminUserByRequester;
	private String reqestPermission;
	private String reason;
	private Date requestDate;
	private Date approveDate;
	private boolean isActive;

	public AdminPermissionrequest() {
	}

	public AdminPermissionrequest(AdminUser adminUserByRequester,
			String reqestPermission, String reason, Date requestDate,
			boolean isActive) {
		this.adminUserByRequester = adminUserByRequester;
		this.reqestPermission = reqestPermission;
		this.reason = reason;
		this.requestDate = requestDate;
		this.isActive = isActive;
	}

	public AdminPermissionrequest(AdminUser adminUserByApprover,
			AdminUser adminUserByRequester, String reqestPermission,
			String reason, Date requestDate, Date approveDate, boolean isActive) {
		this.adminUserByApprover = adminUserByApprover;
		this.adminUserByRequester = adminUserByRequester;
		this.reqestPermission = reqestPermission;
		this.reason = reason;
		this.requestDate = requestDate;
		this.approveDate = approveDate;
		this.isActive = isActive;
	}

	public Integer getRequestId() {
		return this.requestId;
	}

	public void setRequestId(Integer requestId) {
		this.requestId = requestId;
	}

	public AdminUser getAdminUserByApprover() {
		return this.adminUserByApprover;
	}

	public void setAdminUserByApprover(AdminUser adminUserByApprover) {
		this.adminUserByApprover = adminUserByApprover;
	}

	public AdminUser getAdminUserByRequester() {
		return this.adminUserByRequester;
	}

	public void setAdminUserByRequester(AdminUser adminUserByRequester) {
		this.adminUserByRequester = adminUserByRequester;
	}

	public String getReqestPermission() {
		return this.reqestPermission;
	}

	public void setReqestPermission(String reqestPermission) {
		this.reqestPermission = reqestPermission;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getRequestDate() {
		return this.requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public Date getApproveDate() {
		return this.approveDate;
	}

	public void setApproveDate(Date approveDate) {
		this.approveDate = approveDate;
	}

	public boolean isIsActive() {
		return this.isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

}