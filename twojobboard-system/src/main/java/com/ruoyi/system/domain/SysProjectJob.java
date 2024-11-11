package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 项目任务对象 sys_project_job
 * 
 * @author ruoyi
 * @date 2024-09-13
 */
public class SysProjectJob extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主建 */
    private Long id;

    /** 项目归纳表 */
    @Excel(name = "项目归纳表")
    private String projectInduce;

    /** 项目类型 */
    @Excel(name = "项目类型")
    private String projectType;

    /** 项目 */
    @Excel(name = "项目")
    private String projects;

    /** 车型 */
    @Excel(name = "车型")
    private String vehicleModel;

    /** 设备 */
    @Excel(name = "设备")
    private String device;

    /** 项目需求 */
    @Excel(name = "项目需求")
    private String requirement;

    /** 优先级 */
    @Excel(name = "优先级")
    private String priority;

    /** 期待交付时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "期待交付时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date expectationTime;

    /** 指派人(新建任务系统带出) */
    @Excel(name = "指派人(新建任务系统带出)")
    private String assignedPerson;
    private String assignedPersonName;
    public String getAssignedPersonName() {
        return assignedPersonName;
    }
    public void setAssignedPersonName(String assignedPersonName) {
        this.assignedPersonName = assignedPersonName;
    }
    /** 执行人 */
    @Excel(name = "执行人")
    private String implementer;
    private String implementerName;
    public String getImplementerName() {
        return implementerName;
    }
    public void setImplementerName(String implementerName) {
        this.implementerName = implementerName;
    }

    /** 下发日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "下发日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date issueDate;

    /** 工时预估 */
    @Excel(name = "工时预估")
    private String estimateTime;

    /** 任务描述（备用） */
    @Excel(name = "任务描述", readConverterExp = "备=用")
    private String describes;

    /** 任务状态 */
    @Excel(name = "任务状态")
    private String jobStatus;

    /** 实际完成时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "实际完成时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date finishTime;

    /** 结果 */
    @Excel(name = "结果")
    private String results;

    /** 备用1 */
    @Excel(name = "备用1")
    private String remark1;

    /** 备用2 */
    @Excel(name = "备用2")
    private String remark2;

    /** 备用3 */
    @Excel(name = "备用3")
    private String remark3;

    /** 备用4 */
    @Excel(name = "备用4")
    private String remark4;

    /** 备用5 */
    @Excel(name = "备用5")
    private String remark5;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setProjectInduce(String projectInduce)
    {
        this.projectInduce = projectInduce;
    }

    public String getProjectInduce()
    {
        return projectInduce;
    }
    public void setProjectType(String projectType)
    {
        this.projectType = projectType;
    }

    public String getProjectType()
    {
        return projectType;
    }
    public void setProjects(String projects)
    {
        this.projects = projects;
    }

    public String getProjects()
    {
        return projects;
    }
    public void setVehicleModel(String vehicleModel)
    {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleModel()
    {
        return vehicleModel;
    }
    public void setDevice(String device)
    {
        this.device = device;
    }

    public String getDevice()
    {
        return device;
    }
    public void setRequirement(String requirement)
    {
        this.requirement = requirement;
    }

    public String getRequirement()
    {
        return requirement;
    }
    public void setPriority(String priority)
    {
        this.priority = priority;
    }

    public String getPriority()
    {
        return priority;
    }
    public void setExpectationTime(Date expectationTime)
    {
        this.expectationTime = expectationTime;
    }

    public Date getExpectationTime()
    {
        return expectationTime;
    }
    public void setAssignedPerson(String assignedPerson)
    {
        this.assignedPerson = assignedPerson;
    }

    public String getAssignedPerson()
    {
        return assignedPerson;
    }
    public void setImplementer(String implementer)
    {
        this.implementer = implementer;
    }

    public String getImplementer()
    {
        return implementer;
    }
    public void setIssueDate(Date issueDate)
    {
        this.issueDate = issueDate;
    }

    public Date getIssueDate()
    {
        return issueDate;
    }
    public void setEstimateTime(String estimateTime)
    {
        this.estimateTime = estimateTime;
    }

    public String getEstimateTime()
    {
        return estimateTime;
    }
    public void setDescribes(String describes)
    {
        this.describes = describes;
    }

    public String getDescribes()
    {
        return describes;
    }
    public void setJobStatus(String jobStatus)
    {
        this.jobStatus = jobStatus;
    }

    public String getJobStatus()
    {
        return jobStatus;
    }
    public void setFinishTime(Date finishTime)
    {
        this.finishTime = finishTime;
    }

    public Date getFinishTime()
    {
        return finishTime;
    }
    public void setResults(String results)
    {
        this.results = results;
    }

    public String getResults()
    {
        return results;
    }
    public void setRemark1(String remark1)
    {
        this.remark1 = remark1;
    }

    public String getRemark1()
    {
        return remark1;
    }
    public void setRemark2(String remark2)
    {
        this.remark2 = remark2;
    }

    public String getRemark2()
    {
        return remark2;
    }
    public void setRemark3(String remark3)
    {
        this.remark3 = remark3;
    }

    public String getRemark3()
    {
        return remark3;
    }
    public void setRemark4(String remark4)
    {
        this.remark4 = remark4;
    }

    public String getRemark4()
    {
        return remark4;
    }
    public void setRemark5(String remark5)
    {
        this.remark5 = remark5;
    }

    public String getRemark5()
    {
        return remark5;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("projectInduce", getProjectInduce())
            .append("projectType", getProjectType())
            .append("projects", getProjects())
            .append("vehicleModel", getVehicleModel())
            .append("device", getDevice())
            .append("requirement", getRequirement())
            .append("priority", getPriority())
            .append("expectationTime", getExpectationTime())
            .append("assignedPerson", getAssignedPerson())
            .append("assignedPersonName", getAssignedPersonName())
            .append("implementer", getImplementer())
                .append("implementerName", getImplementerName())
            .append("issueDate", getIssueDate())
            .append("estimateTime", getEstimateTime())
            .append("describe", getDescribes())
            .append("jobStatus", getJobStatus())
            .append("finishTime", getFinishTime())
            .append("results", getResults())
            .append("remark", getRemark())
            .append("remark1", getRemark1())
            .append("remark2", getRemark2())
            .append("remark3", getRemark3())
            .append("remark4", getRemark4())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark5", getRemark5())
            .toString();
    }
}
