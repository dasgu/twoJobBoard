package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.domain.vo.YearAndMonth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysProjectJobMapper;
import com.ruoyi.system.domain.SysProjectJob;
import com.ruoyi.system.service.ISysProjectJobService;

/**
 * 项目任务Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-09-13
 */
@Service
public class SysProjectJobServiceImpl implements ISysProjectJobService 
{
    @Autowired
    private SysProjectJobMapper sysProjectJobMapper;

    /**
     * 查询项目任务
     * 
     * @param id 项目任务主键
     * @return 项目任务
     */
    @Override
    public SysProjectJob selectSysProjectJobById(Long id)
    {
        return sysProjectJobMapper.selectSysProjectJobById(id);
    }

    /**
     * 查询项目任务列表
     * 
     * @param sysProjectJob 项目任务
     * @return 项目任务
     */
    @Override
    public List<SysProjectJob> selectSysProjectJobList(SysProjectJob sysProjectJob)
    {
        return sysProjectJobMapper.selectSysProjectJobList(sysProjectJob);
    }

    /**
     * 新增项目任务
     * 
     * @param sysProjectJob 项目任务
     * @return 结果
     */
    @Override
    public int insertSysProjectJob(SysProjectJob sysProjectJob)
    {
        sysProjectJob.setCreateTime(DateUtils.getNowDate());
        sysProjectJob.setIssueDate(DateUtils.getNowDate());
        return sysProjectJobMapper.insertSysProjectJob(sysProjectJob);
    }

    /**
     * 修改项目任务
     * 
     * @param sysProjectJob 项目任务
     * @return 结果
     */
    @Override
    public int updateSysProjectJob(SysProjectJob sysProjectJob)
    {
        sysProjectJob.setUpdateTime(DateUtils.getNowDate());
        return sysProjectJobMapper.updateSysProjectJob(sysProjectJob);
    }

    /**
     * 批量删除项目任务
     * 
     * @param ids 需要删除的项目任务主键
     * @return 结果
     */
    @Override
    public int deleteSysProjectJobByIds(Long[] ids)
    {
        return sysProjectJobMapper.deleteSysProjectJobByIds(ids);
    }

    /**
     * 删除项目任务信息
     * 
     * @param id 项目任务主键
     * @return 结果
     */
    @Override
    public int deleteSysProjectJobById(Long id)
    {
        return sysProjectJobMapper.deleteSysProjectJobById(id);
    }


    @Override
    public List<SysProjectJob> selectSysProjectJobByYearAndMonth(YearAndMonth yearAndMonth) {

        List<SysProjectJob> sysProjectJobs = sysProjectJobMapper.selectSysProjectJobByYearAndMonth(yearAndMonth);
        return sysProjectJobs;
    }
}
