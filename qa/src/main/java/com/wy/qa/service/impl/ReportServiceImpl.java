package com.wy.qa.service.impl;

import com.wy.qa.mapper.ReportMapper;
import com.wy.qa.pojo.Report;
import com.wy.qa.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("reportService")
public class ReportServiceImpl implements ReportService {
    private final ReportMapper reportMapper;

    @Autowired
    public ReportServiceImpl(ReportMapper reportMapper) {
        this.reportMapper = reportMapper;
    }

    @Transactional
    @Override
    public void add(Report report) {
        reportMapper.add(report);
    }

    @Override
    public Report getById(Integer reportId) {
        return reportMapper.getById(reportId);
    }

    @Override
    public List<Report> queryReportByStatus(Integer status) {
        return reportMapper.queryReportByStatus(status);
    }

    @Transactional
    @Override
    public void updateStatus(Integer reportId) {
        reportMapper.updateStatus(reportId);
    }

    @Transactional
    @Override
    public void del(Integer reportId) {
        reportMapper.del(reportId);
    }
}
