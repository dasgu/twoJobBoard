package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysProjectJob;
import com.ruoyi.system.domain.vo.YearAndMonth;

/**
 * 项目任务Service接口
 * 
 * @author ruoyi
 * @date 2024-09-13
 */
public interface ISysProjectJobService 
{
    /**
     * 查询项目任务
     * 
     * @param id 项目任务主键
     * @return 项目任务
     */
    public SysProjectJob selectSysProjectJobById(Long id);

    /**
     * 查询项目任务列表
     * 
     * @param sysProjectJob 项目任务
     * @return 项目任务集合
     */
    public List<SysProjectJob> selectSysProjectJobList(SysProjectJob sysProjectJob);

    /**
     * 新增项目任务
     * 
     * @param sysProjectJob 项目任务
     * @return 结果
     */
    public int insertSysProjectJob(SysProjectJob sysProjectJob);

    /**
     * 修改项目任务
     * 
     * @param sysProjectJob 项目任务
     * @return 结果
     */
    public int updateSysProjectJob(SysProjectJob sysProjectJob);

    /**
     * 批量删除项目任务
     * 
     * @param ids 需要删除的项目任务主键集合
     * @return 结果
     */
    public int deleteSysProjectJobByIds(Long[] ids);

    /**
     * 删除项目任务信息
     * 
     * @param id 项目任务主键
     * @return 结果
     */
    public int deleteSysProjectJobById(Long id);

    public List<SysProjectJob> selectSysProjectJobByYearAndMonth(YearAndMonth yearAndMonth);
}
