package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysRoleLowerMapper;
import com.ruoyi.system.domain.SysRoleLower;
import com.ruoyi.system.service.ISysRoleLowerService;

/**
 * 管辖角色Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-09-12
 */
@Service
public class SysRoleLowerServiceImpl implements ISysRoleLowerService 
{
    @Autowired
    private SysRoleLowerMapper sysRoleLowerMapper;

    /**
     * 查询管辖角色
     * 
     * @param roleId 管辖角色主键
     * @return 管辖角色
     */
    @Override
    public SysRoleLower selectSysRoleLowerByRoleId(Long roleId)
    {
        return sysRoleLowerMapper.selectSysRoleLowerByRoleId(roleId);
    }

    /**
     * 查询管辖角色列表
     * 
     * @param sysRoleLower 管辖角色
     * @return 管辖角色
     */
    @Override
    public List<SysRoleLower> selectSysRoleLowerList(SysRoleLower sysRoleLower)
    {
        return sysRoleLowerMapper.selectSysRoleLowerList(sysRoleLower);
    }

    /**
     * 新增管辖角色
     * 
     * @param sysRoleLower 管辖角色
     * @return 结果
     */
    @Override
    public int insertSysRoleLower(SysRoleLower sysRoleLower)
    {
        return sysRoleLowerMapper.insertSysRoleLower(sysRoleLower);
    }

    /**
     * 修改管辖角色
     * 
     * @param sysRoleLower 管辖角色
     * @return 结果
     */
    @Override
    public int updateSysRoleLower(SysRoleLower sysRoleLower)
    {
        return sysRoleLowerMapper.updateSysRoleLower(sysRoleLower);
    }

    /**
     * 批量删除管辖角色
     * 
     * @param roleIds 需要删除的管辖角色主键
     * @return 结果
     */
    @Override
    public int deleteSysRoleLowerByRoleIds(Long[] roleIds)
    {
        return sysRoleLowerMapper.deleteSysRoleLowerByRoleIds(roleIds);
    }

    /**
     * 删除管辖角色信息
     * 
     * @param roleId 管辖角色主键
     * @return 结果
     */
    @Override
    public int deleteSysRoleLowerByRoleId(Long roleId)
    {
        return sysRoleLowerMapper.deleteSysRoleLowerByRoleId(roleId);
    }
}
