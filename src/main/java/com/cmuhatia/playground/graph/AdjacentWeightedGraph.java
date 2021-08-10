/*
 * Copyright 2021 Cornelius M.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cmuhatia.playground.graph;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Cornelius M.
 * @version 1.0.0, 10/08/2021
 */
public class AdjacentWeightedGraph<T> {

    private ArrayList<LinkedList<T>> graph;

    public AdjacentWeightedGraph(int capacity) {
        graph = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            graph.add(new LinkedList<>());
        }
    }

    public void addEdge(int u, T v) {
        graph.get(u).add(v);
    }
}
