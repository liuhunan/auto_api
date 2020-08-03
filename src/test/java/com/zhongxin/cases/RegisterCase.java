package com.zhongxin.cases;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.alibaba.fastjson.JSONObject;
import com.zhongxin.pojo.CaseInfo;
import com.zhongxin.utils.ExcelUtils;
import com.zhongxin.utils.HttpUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 注册接口测试类型
 */
public class RegisterCase {

    @Test(dataProvider = "datas")
    public void test(CaseInfo caseInfo) {
        HttpUtils.call(caseInfo);
    }

    @DataProvider
    public Object[] datas() {
        List list = ExcelUtils.read(0, 1, CaseInfo.class);
        return list.toArray();
    }
}
