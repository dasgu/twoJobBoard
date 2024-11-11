package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysRoleLower;
import com.ruoyi.system.domain.SysRoleMenu;

/**
 * 管辖角色Mapper接口
 * 
 * @author ruoyi
 * @date 2024-09-12
 */
public interface SysRoleLowerMapper 
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
     * 删除管辖角色
     * 
     * @param roleId 管辖角色主键
     * @return 结果
     */
    public int deleteSysRoleLowerByRoleId(Long roleId);

    /**
     * 批量删除管辖角色
     * 
     * @param roleIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysRoleLowerByRoleIds(Long[] roleIds);
    /**
     * 批量新增角色管辖信息
     *
     * @param roleLowerList 角色管辖列表
     * @return 结果
     */
    public int batchRoleLower(List<SysRoleLower> roleLowerList);
}
