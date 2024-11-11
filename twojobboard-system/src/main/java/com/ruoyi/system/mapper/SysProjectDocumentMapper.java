package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysProjectDocument;

/**
 * 文档以及工具栏Mapper接口
 * 
 * @author ruoyi
 * @date 2024-09-23
 */
public interface SysProjectDocumentMapper 
{
    /**
     * 查询文档以及工具栏
     * 
     * @param documentId 文档以及工具栏主键
     * @return 文档以及工具栏
     */
    public SysProjectDocument selectSysProjectDocumentByDocumentId(Long documentId);

    /**
     * 查询文档以及工具栏列表
     * 
     * @param sysProjectDocument 文档以及工具栏
     * @return 文档以及工具栏集合
     */
    public List<SysProjectDocument> selectSysProjectDocumentList(SysProjectDocument sysProjectDocument);

    /**
     * 新增文档以及工具栏
     * 
     * @param sysProjectDocument 文档以及工具栏
     * @return 结果
     */
    public int insertSysProjectDocument(SysProjectDocument sysProjectDocument);

    /**
     * 修改文档以及工具栏
     * 
     * @param sysProjectDocument 文档以及工具栏
     * @return 结果
     */
    public int updateSysProjectDocument(SysProjectDocument sysProjectDocument);

    /**
     * 删除文档以及工具栏
     * 
     * @param documentId 文档以及工具栏主键
     * @return 结果
     */
    public int deleteSysProjectDocumentByDocumentId(Long documentId);

    /**
     * 批量删除文档以及工具栏
     * 
     * @param documentIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysProjectDocumentByDocumentIds(Long[] documentIds);
}
