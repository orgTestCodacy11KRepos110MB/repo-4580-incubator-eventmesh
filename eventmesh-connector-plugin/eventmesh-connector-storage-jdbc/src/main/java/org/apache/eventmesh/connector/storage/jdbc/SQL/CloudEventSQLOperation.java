/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.eventmesh.connector.storage.jdbc.SQL;

public interface CloudEventSQLOperation {

    public String createCloudEventSQL(String table);

    public String insertCloudEventSQL(String table);

    public String updateCloudEventOffsetSQL(String table);

    public String updateCloudEventReplySQL(String table);

    public String selectCloudEventByReplySQL(String table, String idNum);

    public String locationEventSQL(String table);

    public String queryLocationEventSQL(String table);

    public String selectFastMessageSQL(String table);

    public String selectLastMessageSQL(String table);

    public String selectNoConsumptionMessageSQL(String table);

    public String selectAppointTimeMessageSQL(String table);
}