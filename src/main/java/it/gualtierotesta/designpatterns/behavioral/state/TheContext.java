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
package it.gualtierotesta.designpatterns.behavioral.state;

import it.gualtierotesta.designpatterns.util.Logger;

/**
 * The Context
 */
public class TheContext {

    /**
     * Keep the current state of the context
     */
    private TheState mCurrentState;

    /**
     * Constructor. set the initial state
     */
    public TheContext() {
        Logger.INSTANCE.log("Initial state set to One");
        this.mCurrentState = new StateOne();
    }

    /**
     * the method invoked by the client
     */
    public void execute() {
        Logger.INSTANCE.log("Execute the state dependent behaviour");
        mCurrentState.theMethod(this);
    }

    /**
     * Set new current state
     *
     * @param pCurrentState the new current state
     */
    protected void setCurrentState(final TheState pCurrentState) {
        Logger.INSTANCE.log("State change");
        this.mCurrentState = pCurrentState;
    }

}
