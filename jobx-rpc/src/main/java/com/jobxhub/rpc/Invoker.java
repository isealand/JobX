/**
 * Copyright (c) 2015 The JobX Project
 * <p>
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.jobxhub.rpc;

import com.jobxhub.common.job.Request;
import com.jobxhub.common.job.Response;

/**
 * @author benjobs
 */
public interface Invoker {

    /**
     * 同步阻塞调用
     * @param request
     * @return
     * @throws Exception
     */
    Response sentSync(Request request) throws Exception;

    /**
     * 单向调用
     * @param request
     * @throws Exception
     */
    void sentOneWay(Request request) throws Exception;

    /**
     * 异步非阻塞,通知回调方式调用
     * @param request
     * @param callback
     * @throws Exception
     */
    void sentAsync(Request request, InvokeCallback callback) throws Exception;

}
