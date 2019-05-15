package com.shm.product.utils;

import com.shm.product.VO.ResultVO;

/**
 * @Auther: shm
 * @Date: 2019/5/1
 * @Description: com.shm.product.utils
 * @version: 1.0
 */
public class ResultVOUtil {
    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}
