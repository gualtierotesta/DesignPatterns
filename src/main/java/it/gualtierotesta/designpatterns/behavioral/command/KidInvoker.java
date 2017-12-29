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
import java.util.HashSet;
import java.util.Set;

/**
 * The invoker: a kid which executes the commands received from the mother (the client)
 */
public class KidInvoker {

    private final Set<CookingCommand> commandSet = new HashSet<CookingCommand>(0);

    /**
     * Add a new command in the set of commands to be executed
     *
     * @param pCookingCommand the command
     */
    public void addNew(final CookingCommand pCookingCommand) {
        Logger.INSTANCE.log("Invoker: add new command");
        commandSet.add(pCookingCommand);
    }

    /**
     * Executes all commands in the set
     */
    public void doIt() {
        Logger.INSTANCE.log("Invoker: executes all commands");
        for (final CookingCommand command : commandSet) {
            command.execute();
        }
    }
}
