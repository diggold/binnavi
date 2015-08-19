/*
Copyright 2015 Google Inc. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.google.security.zynamics.binnavi.debug.models.breakpoints.conditions;

import com.google.common.collect.Lists;

/**
 * Represents a single parenthesed expression in a breakpoint condition tree.
 */
public class SubNode extends BaseNode {
  /**
   * Creates a new node object.
   *
   * @param expression The expression inside the parentheses.
   */
  public SubNode(final ConditionNode expression) {
    super(Lists.newArrayList(expression));
  }

  @Override
  public String toString() {
    return "(" + getChildren().get(0) + ")";
  }
}