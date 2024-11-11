package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysRoleLower;

/**
 * 管辖角色Service接口
 * 
 * @author ruoyi
 * @date 2024-09-12
 */
public interface ISysRoleLowerService 
{
    /**
     * 查询管辖角色
     * 
     * @param roleId 管辖角色主键
     * @return 管辖角色
     */
    public SysRoleLower selectSysRoleLowerByRoleId(Long roleId);

    /**
     * 查询管辖角色列表
     * 
     * @param sysRoleLower 管辖角色
     * @return 管辖角色集合
     */
    public List<SysRoleLower> selectSysRoleLowerList(SysRoleLower sysRoleLower);

    /**
     * 新增管辖角色
     * 
     * @param sysRoleLower 管辖角色
     * @return 结果
     */
    public int insertSysRoleLower(SysRoleLower sysRoleLower);

    /**
     * 修改管辖角色
     * 
     * @param sysRoleLower 管辖角色
     * @return 结果
     */
    public int updateSysRoleLower(SysRoleLower sysRoleLower);

    /**
     * 批量删除管辖角色
     * 
     * @param roleIds 需要删除的管辖角色主键集合
     * @return 结果
     */
    public int deleteSysRoleLowerByRoleIds(Long[] roleIds);

    /**
     * 删除管辖角色信息
     * 
     * @param roleId 管辖角色主键
     * @return 结果
     */
    public int deleteSysRoleLowerByRoleId(Long roleId);
}
