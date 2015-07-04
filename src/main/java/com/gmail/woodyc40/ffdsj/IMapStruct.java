/*
 * Copyright 2015 Pierre C
 * FFDSJ - Fast Fing Data Structures Java
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

package com.gmail.woodyc40.ffdsj;

import com.gmail.woodyc40.ffdsj.visitor.MapVisitor;

/**
 * Represents a struct which stores and allows key-value pair access
 *
 * @author Pierre C
 */
public interface IMapStruct<K, V> {

    V valueOf(K key);

    boolean hasKey(K key);

    void insert(K key, V value);

    V delete(K key);

    Struct<K> keys();

    Struct<V> values();

    void iterate(MapVisitor visitor);

    void purge();
}