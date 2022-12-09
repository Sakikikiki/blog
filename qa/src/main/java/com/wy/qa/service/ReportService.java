package com.wy.qa.service;

import com.wy.qa.pojo.Report;

import java.util.List;

public interface ReportService {
    void add(Report report);

    Report getById(Integer reportId);

    List<Report> queryReportByStatus(Integer status);

    void updateStatus(Integer reportId);

    void del(Integer reportId);
}
