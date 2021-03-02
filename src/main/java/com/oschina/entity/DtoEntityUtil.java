package com.oschina.entity;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author hyly
 * @Description TODO
 * @Date 2020/11/16 11:37
 * @Version 1.0
 **/
public class DtoEntityUtil {


    private static Mapper mapper = new DozerBeanMapper();

    public static <D,E> E trans(D t,Class<E> clazz){
        if(t == null)
            return null;
        return mapper.map(t, clazz);
    }

    public static <D,E> List<E> trans(D[] ts,Class<E> clazz){
        List<E> es = new ArrayList<E>();
        if(ts == null)
            return es;

        for(D d:ts) {
            E e = (E)trans(d,clazz);
            if(e != null)
                es.add(e);
        }

        return es;
    }


    /**
     *
     * @param ts 源对象
     * @param clazz 目标对象
     * @param <D>
     * @param <E>
     * @return
     */
    public static <D,E> List<E> trans(List<D> ts,Class<E> clazz){
        List<E> es = new ArrayList<E>();
        if(ts == null )
            return es;
        for(D d:ts) {
            E e = (E)trans(d,clazz);
            if(e != null)
                es.add(e);
        }
        return es;
    }
}
