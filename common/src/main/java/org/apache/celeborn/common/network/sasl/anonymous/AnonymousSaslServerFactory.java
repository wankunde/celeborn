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

package org.apache.celeborn.common.network.sasl.anonymous;

import static org.apache.celeborn.common.network.sasl.SaslUtils.*;

import java.util.Map;

import javax.security.auth.callback.CallbackHandler;
import javax.security.sasl.SaslException;
import javax.security.sasl.SaslServer;
import javax.security.sasl.SaslServerFactory;

/**
 * This implements the {@code SaslServerFactory} interface for the ANONYMOUS SASL mechanism. It
 * allows the creation of SASL servers that can handle ANONYMOUS authentication requests from
 * clients.
 */
public class AnonymousSaslServerFactory implements SaslServerFactory {

  /**
   * Creates a SASL server for the ANONYMOUS mechanism.
   *
   * @param mechanism The requested SASL mechanism (e.g., ANONYMOUS).
   * @param protocol The name of the protocol being used.
   * @param serverName The name of the server.
   * @param props A map of properties to configure the SASL server.
   * @param cbh A callback handler for handling authentication callbacks.
   * @return A {@code CelebornAnonymousSaslServer} instance if ANONYMOUS is requested, or null
   *     otherwise.
   * @throws SaslException
   */
  @Override
  public SaslServer createSaslServer(
      String mechanism,
      String protocol,
      String serverName,
      Map<String, ?> props,
      CallbackHandler cbh)
      throws SaslException {
    if (mechanism.equals(ANONYMOUS)) {
      return new CelebornAnonymousSaslServer();
    }
    return null;
  }

  @Override
  public String[] getMechanismNames(Map<String, ?> props) {
    return new String[] {ANONYMOUS};
  }

  static class CelebornAnonymousSaslServer implements SaslServer {
    private boolean isCompleted = false;

    @Override
    public String getMechanismName() {
      return ANONYMOUS;
    }

    @Override
    public byte[] evaluateResponse(byte[] response) throws SaslException {
      if (isCompleted) {
        throw new IllegalStateException("Authentication has already completed.");
      }
      // Typically, we would process the response here. For ANONYMOUS, we just accept it.
      isCompleted = true;
      return new byte[0]; // No challenge is expected for ANONYMOUS.
    }

    @Override
    public boolean isComplete() {
      return isCompleted;
    }

    @Override
    public String getAuthorizationID() {
      return ANONYMOUS;
    }

    @Override
    public byte[] unwrap(byte[] incoming, int offset, int len) {
      throw new IllegalStateException("ANONYMOUS mechanism does not support wrap/unwrap");
    }

    @Override
    public byte[] wrap(byte[] outgoing, int offset, int len) {
      throw new IllegalStateException("ANONYMOUS mechanism does not support wrap/unwrap");
    }

    @Override
    public Object getNegotiatedProperty(String propName) {
      return null;
    }

    @Override
    public void dispose() {
      // Cleanup resources if any.
    }
  }
}
