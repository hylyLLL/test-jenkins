package com.oschina.freemarker;/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/11/4 11:55
 * @Version 1.0
 **/

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.oschina.entity.DriverTypeDto;
import com.oschina.entity.HostBindCardDto;
import com.oschina.excel.ExcelListerner;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/11/4 11:55
 * @Version 1.0
 **/
@Slf4j
@Controller
public class FileController {
    @PostConstruct
    public void init(){

    }
    @PostMapping("/import")
    public String upload(MultipartFile file) throws Exception {

        System.out.println("start");
        System.out.println(file);
        TimeUnit.SECONDS.sleep(2);
        System.out.println("end");
        return "listInfo";
    }

    @GetMapping("/importFile")
    public String importFile() {
        return "import";
    }
}
