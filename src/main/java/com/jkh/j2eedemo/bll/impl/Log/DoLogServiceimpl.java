package com.jkh.j2eedemo.bll.impl.Log;

import com.jkh.j2eedemo.bll.inter.Ilogbllinter;
import com.jkh.j2eedemo.dao.Ilog;
import com.jkh.j2eedemo.entity.KesunReturn;
import com.jkh.j2eedemo.entity.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoLogServiceimpl implements Ilogbllinter {
    @Autowired
    private Ilog ilog;

    @Override
    public KesunReturn addLog(Log log) {
        KesunReturn back = new KesunReturn();

        if (ilog == null) {
            back.setCode("0000");
            back.setMessage("数据访问出错!");
            return back;
        }
        if (ilog == null) {
            back.setCode("0001");
            back.setMessage("日志对象为空出错!");
            return back;
        }
        try {
            int i = ilog.add(log);

            if (i > 0) {
                back.setCode("1000");
                back.setMessage("日志记录成功!");
                back.setObj(i);
            } else {
                back.setCode("1000");
                back.setMessage("日志记录失败!");

            }
        } catch (Exception ex) {
            back.setCode("0002");
            back.setMessage("日志记录出错,请重新记录!");
            return back;
        }
        return back;
    }
}
