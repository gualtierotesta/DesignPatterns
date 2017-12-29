/*
 * Copyright 2014 Gualtiero Testa <www.gualtierotesta.it>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package it.gualtierotesta.designpatterns.behavioral.chainofresponsability;

/**
 * Client class
 */
public class Client {

    // Head of the chain
    private final AbstractHandler mHandler;

    /**
     * Constructor with chain head inizialitation
     *
     * @param pHandler the handler
     */
    public Client(final AbstractHandler pHandler) {
        this.mHandler = pHandler;
    }

    /**
     * Ask the chain to process the string
     *
     * @param pString string to be processed
     */
    public void process(final String pString) {
        mHandler.handleRequest(pString);
    }

}
