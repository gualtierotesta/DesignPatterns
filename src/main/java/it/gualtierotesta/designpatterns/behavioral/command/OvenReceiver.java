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
 * The receiver, that is the one that knows how to do
 */
public class OvenReceiver {

    private int mCookingTemperature;  // in Celsius degrees
    private int mDurationTime;  // in seconds

    /**
     * "Cook a pizza" command
     */
    public void cookPizza() {
        Logger.INSTANCE.log("Receiver: cook pizza");
        mCookingTemperature = 250;
        mDurationTime = 15 * 60;
    }

    /**
     * "Defrost a frozen piece of bread" command
     */
    public void defrostFrozenBread() {
        Logger.INSTANCE.log("Receiver: defrost bread");
        mCookingTemperature = 100;
        mDurationTime = 3 * 60;
    }

}
