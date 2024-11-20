package com.ruoyi.system.domain.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;

import java.util.Date;

public class YearAndMonth {

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date beginDate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date endDate;
}
