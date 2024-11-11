package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 文档以及工具栏对象 sys_project_document
 * 
 * @author ruoyi
 * @date 2024-09-23
 */
public class SysProjectDocument extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long documentId;

    /** 标题 */
    @Excel(name = "标题")
    private String documentTitle;

    /** 类型（1文档 2工具） */
    @Excel(name = "类型", readConverterExp = "1=文档,2=工具")
    private String documentType;

    /** 描述 */
    @Excel(name = "描述")
    private String documentContent;

    /** 状态（0正常 1关闭） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=关闭")
    private String status;

    /** 链接 */
    @Excel(name = "链接")
    private String documentUrl;

    /** 备用1 */
    private String remark1;

    public void setDocumentId(Long documentId) 
    {
        this.documentId = documentId;
    }

    public Long getDocumentId() 
    {
        return documentId;
    }
    public void setDocumentTitle(String documentTitle) 
    {
        this.documentTitle = documentTitle;
    }

    public String getDocumentTitle() 
    {
        return documentTitle;
    }
    public void setDocumentType(String documentType) 
    {
        this.documentType = documentType;
    }

    public String getDocumentType() 
    {
        return documentType;
    }
    public void setDocumentContent(String documentContent) 
    {
        this.documentContent = documentContent;
    }

    public String getDocumentContent() 
    {
        return documentContent;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setDocumentUrl(String documentUrl) 
    {
        this.documentUrl = documentUrl;
    }

    public String getDocumentUrl() 
    {
        return documentUrl;
    }
    public void setRemark1(String remark1) 
    {
        this.remark1 = remark1;
    }

    public String getRemark1() 
    {
        return remark1;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("documentId", getDocumentId())
            .append("documentTitle", getDocumentTitle())
            .append("documentType", getDocumentType())
            .append("documentContent", getDocumentContent())
            .append("status", getStatus())
            .append("documentUrl", getDocumentUrl())
            .append("remark1", getRemark1())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
