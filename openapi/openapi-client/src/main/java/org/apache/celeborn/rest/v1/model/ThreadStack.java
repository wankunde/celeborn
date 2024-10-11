/*
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


package org.apache.celeborn.rest.v1.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ThreadStack
 */
@JsonPropertyOrder({
  ThreadStack.JSON_PROPERTY_THREAD_ID,
  ThreadStack.JSON_PROPERTY_THREAD_NAME,
  ThreadStack.JSON_PROPERTY_THREAD_STATE,
  ThreadStack.JSON_PROPERTY_STACK_TRACE,
  ThreadStack.JSON_PROPERTY_BLOCKED_BY_THREAD_ID,
  ThreadStack.JSON_PROPERTY_BLOCKED_BY_LOCK,
  ThreadStack.JSON_PROPERTY_HOLDING_LOCKS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class ThreadStack {
  public static final String JSON_PROPERTY_THREAD_ID = "threadId";
  private Long threadId;

  public static final String JSON_PROPERTY_THREAD_NAME = "threadName";
  private String threadName;

  public static final String JSON_PROPERTY_THREAD_STATE = "threadState";
  private String threadState;

  public static final String JSON_PROPERTY_STACK_TRACE = "stackTrace";
  private List<String> stackTrace = new ArrayList<>();

  public static final String JSON_PROPERTY_BLOCKED_BY_THREAD_ID = "blockedByThreadId";
  private Long blockedByThreadId;

  public static final String JSON_PROPERTY_BLOCKED_BY_LOCK = "blockedByLock";
  private String blockedByLock;

  public static final String JSON_PROPERTY_HOLDING_LOCKS = "holdingLocks";
  private List<String> holdingLocks = new ArrayList<>();

  public ThreadStack() {
  }

  public ThreadStack threadId(Long threadId) {
    
    this.threadId = threadId;
    return this;
  }

  /**
   * The id of the thread.
   * @return threadId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_THREAD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getThreadId() {
    return threadId;
  }


  @JsonProperty(JSON_PROPERTY_THREAD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setThreadId(Long threadId) {
    this.threadId = threadId;
  }

  public ThreadStack threadName(String threadName) {
    
    this.threadName = threadName;
    return this;
  }

  /**
   * The name of the thread.
   * @return threadName
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_THREAD_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getThreadName() {
    return threadName;
  }


  @JsonProperty(JSON_PROPERTY_THREAD_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setThreadName(String threadName) {
    this.threadName = threadName;
  }

  public ThreadStack threadState(String threadState) {
    
    this.threadState = threadState;
    return this;
  }

  /**
   * The state of the thread.
   * @return threadState
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_THREAD_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getThreadState() {
    return threadState;
  }


  @JsonProperty(JSON_PROPERTY_THREAD_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setThreadState(String threadState) {
    this.threadState = threadState;
  }

  public ThreadStack stackTrace(List<String> stackTrace) {
    
    this.stackTrace = stackTrace;
    return this;
  }

  public ThreadStack addStackTraceItem(String stackTraceItem) {
    if (this.stackTrace == null) {
      this.stackTrace = new ArrayList<>();
    }
    this.stackTrace.add(stackTraceItem);
    return this;
  }

  /**
   * The stacktrace of the thread.
   * @return stackTrace
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STACK_TRACE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getStackTrace() {
    return stackTrace;
  }


  @JsonProperty(JSON_PROPERTY_STACK_TRACE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStackTrace(List<String> stackTrace) {
    this.stackTrace = stackTrace;
  }

  public ThreadStack blockedByThreadId(Long blockedByThreadId) {
    
    this.blockedByThreadId = blockedByThreadId;
    return this;
  }

  /**
   * The id of the thread that the current thread is blocked by.
   * @return blockedByThreadId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLOCKED_BY_THREAD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBlockedByThreadId() {
    return blockedByThreadId;
  }


  @JsonProperty(JSON_PROPERTY_BLOCKED_BY_THREAD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlockedByThreadId(Long blockedByThreadId) {
    this.blockedByThreadId = blockedByThreadId;
  }

  public ThreadStack blockedByLock(String blockedByLock) {
    
    this.blockedByLock = blockedByLock;
    return this;
  }

  /**
   * The lock that the current thread is blocked by.
   * @return blockedByLock
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLOCKED_BY_LOCK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBlockedByLock() {
    return blockedByLock;
  }


  @JsonProperty(JSON_PROPERTY_BLOCKED_BY_LOCK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlockedByLock(String blockedByLock) {
    this.blockedByLock = blockedByLock;
  }

  public ThreadStack holdingLocks(List<String> holdingLocks) {
    
    this.holdingLocks = holdingLocks;
    return this;
  }

  public ThreadStack addHoldingLocksItem(String holdingLocksItem) {
    if (this.holdingLocks == null) {
      this.holdingLocks = new ArrayList<>();
    }
    this.holdingLocks.add(holdingLocksItem);
    return this;
  }

  /**
   * The locks that the current thread is holding.
   * @return holdingLocks
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOLDING_LOCKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getHoldingLocks() {
    return holdingLocks;
  }


  @JsonProperty(JSON_PROPERTY_HOLDING_LOCKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHoldingLocks(List<String> holdingLocks) {
    this.holdingLocks = holdingLocks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreadStack threadStack = (ThreadStack) o;
    return Objects.equals(this.threadId, threadStack.threadId) &&
        Objects.equals(this.threadName, threadStack.threadName) &&
        Objects.equals(this.threadState, threadStack.threadState) &&
        Objects.equals(this.stackTrace, threadStack.stackTrace) &&
        Objects.equals(this.blockedByThreadId, threadStack.blockedByThreadId) &&
        Objects.equals(this.blockedByLock, threadStack.blockedByLock) &&
        Objects.equals(this.holdingLocks, threadStack.holdingLocks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threadId, threadName, threadState, stackTrace, blockedByThreadId, blockedByLock, holdingLocks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreadStack {\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    threadName: ").append(toIndentedString(threadName)).append("\n");
    sb.append("    threadState: ").append(toIndentedString(threadState)).append("\n");
    sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
    sb.append("    blockedByThreadId: ").append(toIndentedString(blockedByThreadId)).append("\n");
    sb.append("    blockedByLock: ").append(toIndentedString(blockedByLock)).append("\n");
    sb.append("    holdingLocks: ").append(toIndentedString(holdingLocks)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

