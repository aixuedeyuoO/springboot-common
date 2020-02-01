package com.stream.controller;

import com.stream.bean.LoginInfo;
import com.stream.bean.ResultData;
import com.stream.bean.TestBean;
import com.stream.bean.TestTable;
import com.stream.model.TestTableInfo;
import com.stream.service.TestTableService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * UserController
 *
 * @author aixuedeyuoO
 * @date 2020/2/1
 */
@Slf4j
@RestController
public class UserController {
    @ResponseBody
    @RequestMapping(value = "/userLogin", method= RequestMethod.POST)
    public ResultData test(@RequestBody LoginInfo loginInfo){
        System.out.println(loginInfo.getUserName());
        ResultData resultData = new ResultData();
        resultData.setResultCode("000000");
        resultData.setResultMsg("SUCCESS");
        return resultData;
    }
}
