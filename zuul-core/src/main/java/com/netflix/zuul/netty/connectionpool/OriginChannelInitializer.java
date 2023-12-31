/*
 * Copyright 2018 Netflix, Inc.
 *
 *      Licensed under the Apache License, Version 2.0 (the "License");
 *      you may not use this file except in compliance with the License.
 *      You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 *      Unless required by applicable law or agreed to in writing, software
 *      distributed under the License is distributed on an "AS IS" BASIS,
 *      WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *      See the License for the specific language governing permissions and
 *      limitations under the License.
 */

package com.netflix.zuul.netty.connectionpool;

import com.netflix.netty.common.metrics.HttpMetricsChannelHandler;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;

/**
 * Origin Channel Initializer
 *
 * Author: Arthur Gonigberg
 * Date: December 01, 2017
 */
public abstract class OriginChannelInitializer extends ChannelInitializer<Channel> {

    public abstract HttpMetricsChannelHandler getHttpMetricsHandler();
}
