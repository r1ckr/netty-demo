package com.r1ckr.demo;

import com.codahale.metrics.Meter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.logging.LoggingHandler;

import static com.r1ckr.demo.HexDumpProxy.metrics;

public class ProxyLoggingHandler extends LoggingHandler {
    private final Meter requests = metrics.meter("frontend-channel-active");
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        super.channelActive(ctx);
        requests.mark();
    }
}
