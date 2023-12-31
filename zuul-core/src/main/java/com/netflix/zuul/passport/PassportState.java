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

package com.netflix.zuul.passport;

public enum PassportState {
    IN_REQ_HEADERS_RECEIVED,
    IN_REQ_CONTENT_RECEIVED,
    IN_REQ_LAST_CONTENT_RECEIVED,
    IN_REQ_REJECTED,
    IN_REQ_READ_TIMEOUT,
    IN_REQ_CANCELLED,

    OUT_REQ_HEADERS_SENDING,
    OUT_REQ_HEADERS_SENT,
    OUT_REQ_HEADERS_ERROR_SENDING,
    OUT_REQ_CONTENT_SENDING,
    OUT_REQ_CONTENT_SENT,
    OUT_REQ_CONTENT_ERROR_SENDING,
    OUT_REQ_LAST_CONTENT_SENDING,
    OUT_REQ_LAST_CONTENT_SENT,
    OUT_REQ_LAST_CONTENT_ERROR_SENDING,

    IN_RESP_HEADERS_RECEIVED,
    IN_RESP_CONTENT_RECEIVED,
    IN_RESP_LAST_CONTENT_RECEIVED,

    OUT_RESP_HEADERS_SENDING,
    OUT_RESP_HEADERS_SENT,
    OUT_RESP_HEADERS_ERROR_SENDING,
    OUT_RESP_CONTENT_SENDING,
    OUT_RESP_CONTENT_SENT,
    OUT_RESP_CONTENT_ERROR_SENDING,
    OUT_RESP_LAST_CONTENT_SENDING,
    OUT_RESP_LAST_CONTENT_SENT,
    OUT_RESP_LAST_CONTENT_ERROR_SENDING,

    FILTERS_INBOUND_START,
    FILTERS_INBOUND_END,
    FILTERS_OUTBOUND_START,
    FILTERS_OUTBOUND_END,

    FILTERS_INBOUND_BUF_START,
    FILTERS_INBOUND_BUF_END,
    FILTERS_OUTBOUND_BUF_START,
    FILTERS_OUTBOUND_BUF_END,

    ORIGIN_CONN_ACQUIRE_START,
    ORIGIN_CONN_ACQUIRE_END,
    ORIGIN_CONN_ACQUIRE_FAILED,

    MISC_IO_START,
    MISC_IO_STOP,

    SERVER_CH_DISCONNECT,
    SERVER_CH_CLOSE,
    SERVER_CH_EXCEPTION,
    SERVER_CH_IDLE_TIMEOUT,
    SERVER_CH_ACTIVE,
    SERVER_CH_INACTIVE,
    SERVER_CH_THROTTLING,
    SERVER_CH_REJECTING,
    SERVER_CH_SSL_HANDSHAKE_COMPLETE,

    ORIGIN_CH_CONNECTING,
    ORIGIN_CH_CONNECTED,
    ORIGIN_CH_DISCONNECT,
    ORIGIN_CH_CLOSE,
    ORIGIN_CH_EXCEPTION,
    ORIGIN_CH_ACTIVE,
    ORIGIN_CH_INACTIVE,
    ORIGIN_CH_IDLE_TIMEOUT,
    ORIGIN_CH_POOL_RETURNED,
    ORIGIN_CH_READ_TIMEOUT,
    ORIGIN_CH_IO_EX,
    ORIGIN_RETRY_START,
}
