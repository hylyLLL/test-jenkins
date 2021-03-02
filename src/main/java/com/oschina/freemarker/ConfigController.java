package com.oschina.freemarker;/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/11/3 13:26
 * @Version 1.0
 **/

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.support.Property;
import com.oschina.TableA;
import com.oschina.TableAMapper;
import com.oschina.entity.CenterInfo;
import com.oschina.entity.ListInfo;
import com.oschina.entity.ListMenu;
import com.oschina.jdk8.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/11/3 13:26
 * @Version 1.0
 **/
@Controller
public class ConfigController {
    @Autowired
    private TableAMapper tableAMapper;

    @Autowired
    private ListMenu menu;

    @RequestMapping(value = {"/index", "/"})
    public String menuList(Model model) {
        Map<String, Object> menuList = new HashMap<>();
        menuList.put("menuList", menu.getMenu());
        model.addAllAttributes(menuList);
        return "index";
    }


    @RequestMapping("/centerInfo")
    public String centerInfo(Model model) {
        Map<String, Object> menuList = new HashMap<>();
        ArrayList<CenterInfo> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            CenterInfo centerInfo = new CenterInfo();
            centerInfo.setName("急救中心");
            centerInfo.setAddress("浙江宁波");
            list.add(centerInfo);
        }
        menuList.put("listAll", list);
        model.addAllAttributes(menuList);
        return "centerInfo";
    }


    @RequestMapping("/centerInfo2")
    public String centerInfo2(Model model) {
        Map<String, Object> menuList = new HashMap<>();
        ArrayList<CenterInfo> list = new ArrayList<>();
        CenterInfo centerInfo = new CenterInfo();
        centerInfo.setName("急救中心2");
        centerInfo.setAddress("浙江宁波2");
        list.add(centerInfo);
        menuList.put("listAll", list);
        model.addAllAttributes(menuList);
        return "centerInfo";
    }


    @GetMapping("listInfo")
    public String list(Model model) {
        List<ListInfo> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ListInfo listInfo = new ListInfo();
            listInfo.setId(new Long(i));
            listInfo.setChoice(1);
            listInfo.setDescription("清单" + (i + 1));
            listInfo.setSort(i);
            list.add(listInfo);
        }
        model.addAttribute("listInfo", list);
        return "listInfo";
    }

    @GetMapping("changeListStatus")
    @ResponseBody
    public String changeStatus(String id, Boolean choice) {
        System.out.println(id + ":" + choice);
        Integer status = 0;
        if (choice == null) {
            status = 0;
        } else {
            status = 1;
        }

        System.out.println("状态为：" + status);
        return "success";
    }

    @GetMapping("addItem")
    public String add() {
        int a = 1 / 0;
        return "addItem";
    }

    @GetMapping("addListInfo")
    public String addListInfo() {
        System.out.println("添加：addItem");
        return "redirect:listInfo";
    }


    @GetMapping("testUser")
    @ResponseBody
    public Person test() {
        Person person = new Person();
        person.setUserName("hyly");
        person.setSex(3);
//        person.setPassword("123456");

        LambdaQueryWrapper<TableA> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(TableA::getA, "异常前");
        List<TableA> tableAS = tableAMapper.selectList(lambdaQueryWrapper);
        for (TableA tableA : tableAS) {
            System.out.println(tableA);
        }

        Property<TableA, String> getA = TableA::getA;
        Property<Person, String> getPassword = Person::getPassword;
        return person;
    }


    @PostMapping("addUser")
    @ResponseBody
    public Person addUser(@RequestBody Person person) {
        System.out.println(111);
        return person;
    }
}
