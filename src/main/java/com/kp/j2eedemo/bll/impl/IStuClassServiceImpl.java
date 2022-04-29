package com.kp.j2eedemo.bll.impl;

import com.kp.j2eedemo.bll.inter.IStuClassInter;
import com.kp.j2eedemo.dao.IDoData;
import com.kp.j2eedemo.dao.IStudentClass;
import com.kp.j2eedemo.entity.KesunReturn;
import com.kp.j2eedemo.entity.Student;
import com.kp.j2eedemo.entity.StudentClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IStuClassServiceImpl extends AbsSuperService implements IStuClassInter {
    @Autowired
    private IStudentClass dao;
    @Override
    public IDoData getDao() {
        return dao;
    }
    private KesunReturn checkDAO() {
        KesunReturn back = new KesunReturn();
        if (getDao() == null) {
            back.setCode("0000");
            back.setMessage("查询过程中数据访问层出错！");
            back.setObj(false);
        } else {
            back.setCode("0000");
            back.setMessage("查询过程中数据访问层出错！");
            back.setObj(true);
        }
        return back;
    }

    @Override
    public KesunReturn findStus() {
        KesunReturn back = new KesunReturn();
        if (getModel() == null
                || getModel() instanceof StudentClass == false
                || getModel().getId() == null) {
            back.setCode("0000");
            back.setMessage("未输入班级信息！");
            back.setObj(null);
            return back;
        }
        KesunReturn backdao = checkDAO();
        if ((Boolean) backdao.getObj() == false)return backdao;
        List<Student> stus = ((IStudentClass) getDao()).findStus(getModel().getId());
        if (stus==null||stus.size()==0){
            back.setCode("0000");
            back.setMessage("查询班级没有学生！");
            back.setObj(null);
        }else {
            back.setCode("6666");
            back.setMessage("查询班级所有学生成功！共有["+stus.size()+"]个学生");
            back.setObj(stus);
        }
        return back;
    }

}
