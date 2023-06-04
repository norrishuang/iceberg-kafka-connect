/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.tabular.iceberg.connect.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OffsetTest {

  @Test
  public void testOffsetEquals() {
    assertEquals(0, new Offset(null, null).compareTo(new Offset(null, null)));
    assertEquals(0, new Offset(1L, null).compareTo(new Offset(1L, null)));
  }

  @Test
  public void testOffsetLessThan() {
    assertEquals(-1, new Offset(null, null).compareTo(new Offset(1L, null)));
    assertEquals(-1, new Offset(1L, null).compareTo(new Offset(2L, null)));
  }

  @Test
  public void testOffsetGreaterThan() {
    assertEquals(1, new Offset(1L, null).compareTo(new Offset(null, null)));
    assertEquals(1, new Offset(2L, null).compareTo(new Offset(1L, null)));
  }
}
