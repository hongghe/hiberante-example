package com.hongghe.hiberanteexample.domain;

import lombok.Builder;
import lombok.Data;

/**
 * Http request header .
 *
 * @author hongghe 07/2018
 */
@Data
@Builder(builderClassName = "Builder", toBuilder = true)
public class Header {
    private final Long uid;
    private final String remoteIp;
    private final Long uuid;
    private final String UserAgent;
    private final String channel;
    private final String deviceId;
    private final String host;
    private final String referer;
}
