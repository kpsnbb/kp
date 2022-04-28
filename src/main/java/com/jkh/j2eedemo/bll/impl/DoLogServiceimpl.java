package com.jkh.j2eedemo.bll.impl;

import com.jkh.j2eedemo.bll.inter.Ilogbllinter;
import com.jkh.j2eedemo.dao.IDoData;
import com.jkh.j2eedemo.dao.Ilog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoLogServiceimpl extends AbsSuperService implements Ilogbllinter {
    @Autowired
    private Ilog ilog;
    @Override
    public IDoData getDao() {
        return ilog;
    }
}
