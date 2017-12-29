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
package it.gualtierotesta.designpatterns.behavioral.command;

import it.gualtierotesta.designpatterns.util.Logger;

/**
 * The client: a mother which gives cooking instructions to his/her kid (the invoker) because whe will be at home for dinner
 *
 * Note: this is a NO REFLECTION implementation
 */
public class MotherClient {

    private final KidInvoker mInvoker = new KidInvoker();
    private final OvenReceiver mReceiver = new OvenReceiver();

    public void prepareDinner() {
        Logger.INSTANCE.log("Client: prepare the dinner");
        // Prepare the commands
        PreparePizzaCommand command1 = new PreparePizzaCommand(mReceiver);
        PrepareBreadCommand command2 = new PrepareBreadCommand(mReceiver);

        // Send/gives the commands to the kid
        mInvoker.addNew(command1);
        mInvoker.addNew(command2);

        // Ask the kid to prepare the dinner
        mInvoker.doIt();

    }
}
