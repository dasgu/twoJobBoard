package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SysProjectJob;
import com.ruoyi.system.service.ISysProjectJobService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 项目任务Controller
 * 
 * @author ruoyi
 * @date 2024-09-13
 */
@RestController
@RequestMapping("/system/projectjob")
public class SysProjectJobController extends BaseController
{
    @Autowired
    private ISysProjectJobService sysProjectJobService;

    /**
     * 查询项目任务列表
     */
//    @PreAuthorize("@ss.hasPermi('system:projectjob:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysProjectJob sysProjectJob)
    {
        startPage();
        List<SysProjectJob> list = sysProjectJobService.selectSysProjectJobList(sysProjectJob);
        return getDataTable(list);
    }

    /**
     * 导出项目任务列表
     */
//    @PreAuthorize("@ss.hasPermi('system:projectjob:export')")
    @Log(title = "项目任务", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysProjectJob sysProjectJob)
    {
        List<SysProjectJob> list = sysProjectJobService.selectSysProjectJobList(sysProjectJob);
        ExcelUtil<SysProjectJob> util = new ExcelUtil<SysProjectJob>(SysProjectJob.class);
        util.exportExcel(response, list, "项目任务数据");
    }

    /**
     * 获取项目任务详细信息
     */
//    @PreAuthorize("@ss.hasPermi('system:projectjob:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(sysProjectJobService.selectSysProjectJobById(id));
    }

    /**
     * 新增项目任务
     */
//    @PreAuthorize("@ss.hasPermi('system:projectjob:add')")
    @Log(title = "项目任务", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysProjectJob sysProjectJob)
    {
        return toAjax(sysProjectJobService.insertSysProjectJob(sysProjectJob));
    }

    /**
     * 修改项目任务
     */
//    @PreAuthorize("@ss.hasPermi('system:projectjob:edit')")
    @Log(title = "项目任务", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysProjectJob sysProjectJob)
    {
        return toAjax(sysProjectJobService.updateSysProjectJob(sysProjectJob));
    }

    /**
     * 删除项目任务
     */
//    @PreAuthorize("@ss.hasPermi('system:projectjob:remove')")
    @Log(title = "项目任务", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysProjectJobService.deleteSysProjectJobByIds(ids));
    }
}
