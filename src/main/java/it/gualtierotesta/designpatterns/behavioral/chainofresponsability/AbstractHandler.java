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
 * Base class for all handlers
 */
public abstract class AbstractHandler {

    private AbstractHandler next;

    /**
     * Set the next handler in the chain
     *
     * @param pNext next element in the chain
     */
    public void setNext(final AbstractHandler pNext) {
        this.next = pNext;
    }

    /**
     * Abstract method to be implemented by concrete classes
     *
     * @param request the String to be processed
     */
    abstract public void handleRequest(String request);

    /**
     * Forward request to the next in the chain or raise exception if we are the last
     *
     * @param request the String to be processed
     * @throws IllegalStateException
     */
    protected void forward(final String request) {
        if (next == null) {
            throw new IllegalStateException("Chain is finished at request " + request);
        } else {
            next.handleRequest(request);
        }
    }
}
