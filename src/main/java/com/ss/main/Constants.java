package com.ss.main;

/**
 * Created by baizz on 2015-3-18.
 */
public interface Constants {

    // Redis key
    String ACCESS_MESSAGE = "access_message";
    String IP_AREA_INFO = "ip_area_information";

    String DELIMITER = "-";

    // Elasticsearch index prefix
    String ACCESS_PREFIX = "access-";
    String VISITOR_PREFIX = "visitor-";

    // Elasticsearch field
    String REMOTE = "remote";
    String METHOD = "method";
    String VERSION = "version";
    String REGION = "region";
    String CITY = "city";
    String ISP = "isp";
    String CURR_ADDRESS = "loc";
    String UNIX_TIME = "utime";
    String T = "t";         // trackId
    String TT = "tt";       // 访问次数标识符
    String VID = "vid";     // 访客唯一标识符
    String UCV = "_ucv";    // 访客数(UV)区分标识符
    String RF = "rf";
    String SE = "se";
    String KW = "kw";
    String RF_TYPE = "rf_type";     // 1. 直接访问, 2. 搜索引擎, 3. 外部链接

    String ET = "et";       // 事件跟踪
    String ET_CATEGORY = "category";    // 监控目标的类型名称
    String ET_ACTION = "action";    // 与目标的交互行为
    String ET_LABEL = "label";      // 事件的额外信息
    String ET_VALUE = "value";      // 事件的额外数值信息

}
