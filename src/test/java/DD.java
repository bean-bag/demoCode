import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

/**
 * Project Name:demoCode
 * File Name:DD.java
 * Package Name:
 * Date:2018年1月5日下午5:15:53
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

/**
 * Description:   <br/>
 * Date:     2018年1月5日 下午5:15:53 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class DD {

        private final static Logger LOG = Logger.getLogger(DD.class);

        public static void main(String[] args) {

            Map<String, String> map = new HashMap<String, String>();

            map.put("刘朋","荆州");
            map.put("高世庆","孝感");
            map.put("吕锐玲","荆门");
            map.put("杜森","宜昌");
            map.put("宋杭", "襄阳");
            LOG.info(map.entrySet());// 返回此映射所包含的映射关系的 Set 视图
            LOG.info(map.get("杜森"));// 返回指定键所映射的值；如果对于该键来说，此映射不包含任何映射关系，则返回 null。
            LOG.info(map.keySet());// 返回此映射中所包含的键的 Set 视图。
            LOG.info(map.values());// 返回此映射所包含的值的 Collection 视图。

    }

}

/**
a0 = 1
a1 = (a0 +1)*2
a2 = (a1 +1)*2
a3 = (a2 +1)*2


*/