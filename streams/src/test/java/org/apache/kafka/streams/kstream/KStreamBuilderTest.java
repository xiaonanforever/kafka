/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.kafka.streams.kstream;

import org.apache.kafka.streams.kstream.internals.KStreamImpl;
import org.apache.kafka.streams.processor.TopologyException;
import org.junit.Test;

public class KStreamBuilderTest {

    @Test(expected = TopologyException.class)
    public void testFrom() {
        final KStreamBuilder builder = new KStreamBuilder();

        builder.from("topic-1", "topic-2");

        builder.addSource(KStreamImpl.SOURCE_NAME + KStreamImpl.INDEX.decrementAndGet(), "topic-3");
    }
}
