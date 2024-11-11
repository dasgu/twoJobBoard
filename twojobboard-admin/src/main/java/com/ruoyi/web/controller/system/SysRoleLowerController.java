package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.system.domain.SysProjectJob;
import com.ruoyi.system.service.ISysProjectJobService;
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
import com.ruoyi.system.domain.SysRoleLower;
import com.ruoyi.system.service.ISysRoleLowerService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 管辖角色Controller
 * 
 * @author ruoyi
 * @date 2024-09-12
 */
@RestController
@RequestMapping("/system/lower")
public class SysRoleLowerController extends BaseController
{
    @Autowired
    private ISysRoleLowerService sysRoleLowerService;

    /**
     * 查询管辖角色列表
     */
    @PreAuthorize("@ss.hasPermi('system:lower:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysRoleLower sysRoleLower)
    {
        startPage();
        List<SysRoleLower> list = sysRoleLowerService.selectSysRoleLowerList(sysRoleLower);
        return getDataTable(list);
    }

    /**
     * 导出管辖角色列表
     */
    @PreAuthorize("@ss.hasPermi('system:lower:export')")
    @Log(title = "管辖角色", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysRoleLower sysRoleLower)
    {
        List<SysRoleLower> list = sysRoleLowerService.selectSysRoleLowerList(sysRoleLower);
        ExcelUtil<SysRoleLower> util = new ExcelUtil<SysRoleLower>(SysRoleLower.class);
        util.exportExcel(response, list, "管辖角色数据");
    }

    /**
     * 获取管辖角色详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:lower:query')")
    @GetMapping(value = "/{roleId}")
    public AjaxResult getInfo(@PathVariable("roleId") Long roleId)
    {
        return success(sysRoleLowerService.selectSysRoleLowerByRoleId(roleId));
    }

    /**
     * 新增管辖角色
     */
    @PreAuthorize("@ss.hasPermi('system:lower:add')")
    @Log(title = "管辖角色", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysRoleLower sysRoleLower)
    {
        return toAjax(sysRoleLowerService.insertSysRoleLower(sysRoleLower));
    }

    /**
     * 修改管辖角色
     */
    @PreAuthorize("@ss.hasPermi('system:lower:edit')")
    @Log(title = "管辖角色", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysRoleLower sysRoleLower)
    {
        return toAjax(sysRoleLowerService.updateSysRoleLower(sysRoleLower));
    }

    /**
     * 删除管辖角色
     */
    @PreAuthorize("@ss.hasPermi('system:lower:remove')")
    @Log(title = "管辖角色", businessType = BusinessType.DELETE)
	@DeleteMapping("/{roleIds}")
    public AjaxResult remove(@PathVariable Long[] roleIds)
    {
        return toAjax(sysRoleLowerService.deleteSysRoleLowerByRoleIds(roleIds));
    }

}
