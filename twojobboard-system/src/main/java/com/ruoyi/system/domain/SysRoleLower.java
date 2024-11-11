package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 管辖角色对象 sys_role_lower
 * 
 * @author ruoyi
 * @date 2024-09-12
 */
public class SysRoleLower extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 角色ID */
    private Long roleId;

    /** 下级角色ID */
    private Long lowerId;

    public void setRoleId(Long roleId) 
    {
        this.roleId = roleId;
    }

    public Long getRoleId() 
    {
        return roleId;
    }
    public void setLowerId(Long lowerId) 
    {
        this.lowerId = lowerId;
    }

    public Long getLowerId() 
    {
        return lowerId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("roleId", getRoleId())
            .append("lowerId", getLowerId())
            .toString();
    }
}
