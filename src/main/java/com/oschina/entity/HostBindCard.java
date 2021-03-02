package com.oschina.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HostBindCard implements Serializable {
    private Long id;

    private Integer dataHostId;  //所属主机

    private String hostNumber;  //所属主机编号

    private Long deviceTypeId;  //设备类型ID

    private String deviceTypeName;  //设备类型名称

    private String deviceTypeNo;    //设备类型编号

    private String cardNo;  //卡片编号

    private Integer pathType;   //路数    1路还是2路

    private Integer cardType; //卡片类型，1开关量 2模拟量

    private Long dataId;    //数据源Id

    private Integer versionNo;  //更新版本号


    public static void main(String[] args) {
        List<HostBindCard> list=new ArrayList<>();
        HostBindCard hostBindCard = new HostBindCard();
        hostBindCard.setCardNo("23234wwfdsaf");
        hostBindCard.setCardType(1);
        list.add(hostBindCard);
        List<HostBindCardDto> trans = DtoEntityUtil.trans(list, HostBindCardDto.class);
        for (HostBindCardDto tran : trans) {
            System.out.println(111);
            System.out.println(tran);

        }
    }
}
