/*
 * Copyright 2017 Gregory P. Moyer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.syphr.lametrictime.api;

import org.syphr.lametrictime.api.impl.LaMetricTimeImpl;
import org.syphr.lametrictime.api.model.Device;
import org.syphr.lametrictime.api.model.Endpoints;
import org.syphr.lametrictime.api.model.Notification;

public interface LaMetricTime
{
    public Endpoints getEndPoints();

    public Device getDevice();

    public int createNotification(Notification notification);

    public static LaMetricTime create(Configuration config)
    {
        return new LaMetricTimeImpl(config);
    }
}