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
import com.ruoyi.system.domain.SysProjectDocument;
import com.ruoyi.system.service.ISysProjectDocumentService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 文档以及工具栏Controller
 * 
 * @author ruoyi
 * @date 2024-09-23
 */
@RestController
@RequestMapping("/system/document")
public class SysProjectDocumentController extends BaseController
{
    @Autowired
    private ISysProjectDocumentService sysProjectDocumentService;

    /**
     * 查询文档以及工具栏列表
     */
//    @PreAuthorize("@ss.hasPermi('system:document:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysProjectDocument sysProjectDocument)
    {
        startPage();
        List<SysProjectDocument> list = sysProjectDocumentService.selectSysProjectDocumentList(sysProjectDocument);
        return getDataTable(list);
    }

    /**
     * 导出文档以及工具栏列表
     */
//    @PreAuthorize("@ss.hasPermi('system:document:export')")
    @Log(title = "文档以及工具栏", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysProjectDocument sysProjectDocument)
    {
        List<SysProjectDocument> list = sysProjectDocumentService.selectSysProjectDocumentList(sysProjectDocument);
        ExcelUtil<SysProjectDocument> util = new ExcelUtil<SysProjectDocument>(SysProjectDocument.class);
        util.exportExcel(response, list, "文档以及工具栏数据");
    }

    /**
     * 获取文档以及工具栏详细信息
     */
//    @PreAuthorize("@ss.hasPermi('system:document:query')")
    @GetMapping(value = "/{documentId}")
    public AjaxResult getInfo(@PathVariable("documentId") Long documentId)
    {
        return success(sysProjectDocumentService.selectSysProjectDocumentByDocumentId(documentId));
    }

    /**
     * 新增文档以及工具栏
     */
//    @PreAuthorize("@ss.hasPermi('system:document:add')")
    @Log(title = "文档以及工具栏", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysProjectDocument sysProjectDocument)
    {
        return toAjax(sysProjectDocumentService.insertSysProjectDocument(sysProjectDocument));
    }

    /**
     * 修改文档以及工具栏
     */
//    @PreAuthorize("@ss.hasPermi('system:document:edit')")
    @Log(title = "文档以及工具栏", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysProjectDocument sysProjectDocument)
    {
        return toAjax(sysProjectDocumentService.updateSysProjectDocument(sysProjectDocument));
    }

    /**
     * 删除文档以及工具栏
     */
//    @PreAuthorize("@ss.hasPermi('system:document:remove')")
    @Log(title = "文档以及工具栏", businessType = BusinessType.DELETE)
	@DeleteMapping("/{documentIds}")
    public AjaxResult remove(@PathVariable Long[] documentIds)
    {
        return toAjax(sysProjectDocumentService.deleteSysProjectDocumentByDocumentIds(documentIds));
    }
}
