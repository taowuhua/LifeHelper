package com.ns.yc.lifehelper.api;

import com.blankj.utilcode.util.Utils;
import com.ns.yc.lifehelper.utils.FileUtils;

/**
 * ================================================
 * 作    者：杨充
 * 版    本：1.0
 * 创建日期：2017/9/18
 * 描    述：追书神器API
 * 修订历史：
 * ================================================
 */
public class ConstantZssqApi {

    public static final String API_BASE_URL = "http://api.zhuishushenqi.com";
    public static String PATH_DATA = FileUtils.createRootPath(Utils.getContext()) + "/cache";
    public static String PATH_COLLECT = FileUtils.createRootPath(Utils.getContext()) + "/collect";
    public static final String IMG_BASE_URL = "http://statics.zhuishushenqi.com";

}
