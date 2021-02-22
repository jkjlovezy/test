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
 *
 */

package com.study.util.time;

import lombok.EqualsAndHashCode;
import lombok.Getter;


/**
 * The model definition of a logic entity.
 */
@Getter
@EqualsAndHashCode
public class Model {
    private final String name;
   /* private final List<ModelColumn> columns;
    private final List<ExtraQueryIndex> extraQueryIndices;*/
    private final int scopeId;
    private final DownSampling downsampling;
    private final boolean record;
    private final boolean superDataset;
    private final boolean isTimeSeries;

    public Model(final String name,
                 /*final List<ModelColumn> columns,
                 final List<ExtraQueryIndex> extraQueryIndices,*/
                 final int scopeId,
                 final DownSampling downsampling,
                 final boolean record,
                 final boolean superDataset) {
        this.name = name;
        /*this.columns = columns;
        this.extraQueryIndices = extraQueryIndices;*/
        this.scopeId = scopeId;
        this.downsampling = downsampling;
        this.isTimeSeries = !DownSampling.None.equals(downsampling);
        this.record = record;
        this.superDataset = superDataset;
    }
}
