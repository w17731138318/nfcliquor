

package com.wwx.nfc.common.utils;

import java.util.HashMap;


/**
 * Map工具类
 *
 * @email w17731138318@126.com
 * @since 2.0.0
 */
public class MapUtils extends HashMap<String, Object> {

    @Override
    public MapUtils put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
