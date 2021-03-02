package com.oschina.excel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.oschina.entity.DriverTypeDto;
import com.oschina.entity.HostBindCardDto;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/11/16 9:55
 * @Version 1.0
 **/
@Slf4j
public class ExcelListerner extends AnalysisEventListener {

    //自定义用于暂时存储data。
    //可以通过实例获取该值
    private List<Object> data = new ArrayList<>();

    @Override
    public void invoke(Object o, AnalysisContext analysisContext) {
//        log.info("解析到一条数据：{}", o.toString());
        data.add(o);
    }



    /**
     * 解析完后销毁
     *
     * @param analysisContext
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        if (data.size() > 0) {
            Object o = data.get(0);
            if (o instanceof DriverTypeDto) {
                System.out.println("DriverTypeDto");
            } else if (o instanceof HostBindCardDto) {
                System.out.println("HostBindCardDto");
            }

        }
        log.info("销毁{}", data.size());
        for (Object datum : data) {
            log.info("数据：{}",datum.toString());
        }
        data.clear();
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }

}
