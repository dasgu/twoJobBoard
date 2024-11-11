package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysProjectDocumentMapper;
import com.ruoyi.system.domain.SysProjectDocument;
import com.ruoyi.system.service.ISysProjectDocumentService;

/**
 * 文档以及工具栏Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-09-23
 */
@Service
public class SysProjectDocumentServiceImpl implements ISysProjectDocumentService 
{
    @Autowired
    private SysProjectDocumentMapper sysProjectDocumentMapper;

    /**
     * 查询文档以及工具栏
     * 
     * @param documentId 文档以及工具栏主键
     * @return 文档以及工具栏
     */
    @Override
    public SysProjectDocument selectSysProjectDocumentByDocumentId(Long documentId)
    {
        return sysProjectDocumentMapper.selectSysProjectDocumentByDocumentId(documentId);
    }

    /**
     * 查询文档以及工具栏列表
     * 
     * @param sysProjectDocument 文档以及工具栏
     * @return 文档以及工具栏
     */
    @Override
    public List<SysProjectDocument> selectSysProjectDocumentList(SysProjectDocument sysProjectDocument)
    {
        return sysProjectDocumentMapper.selectSysProjectDocumentList(sysProjectDocument);
    }

    /**
     * 新增文档以及工具栏
     * 
     * @param sysProjectDocument 文档以及工具栏
     * @return 结果
     */
    @Override
    public int insertSysProjectDocument(SysProjectDocument sysProjectDocument)
    {
        sysProjectDocument.setCreateTime(DateUtils.getNowDate());
        return sysProjectDocumentMapper.insertSysProjectDocument(sysProjectDocument);
    }

    /**
     * 修改文档以及工具栏
     * 
     * @param sysProjectDocument 文档以及工具栏
     * @return 结果
     */
    @Override
    public int updateSysProjectDocument(SysProjectDocument sysProjectDocument)
    {
        sysProjectDocument.setUpdateTime(DateUtils.getNowDate());
        return sysProjectDocumentMapper.updateSysProjectDocument(sysProjectDocument);
    }

    /**
     * 批量删除文档以及工具栏
     * 
     * @param documentIds 需要删除的文档以及工具栏主键
     * @return 结果
     */
    @Override
    public int deleteSysProjectDocumentByDocumentIds(Long[] documentIds)
    {
        return sysProjectDocumentMapper.deleteSysProjectDocumentByDocumentIds(documentIds);
    }

    /**
     * 删除文档以及工具栏信息
     * 
     * @param documentId 文档以及工具栏主键
     * @return 结果
     */
    @Override
    public int deleteSysProjectDocumentByDocumentId(Long documentId)
    {
        return sysProjectDocumentMapper.deleteSysProjectDocumentByDocumentId(documentId);
    }
}
