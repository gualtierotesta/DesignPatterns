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
package it.gualtierotesta.designpatterns.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Implements basic logging sistem with testing purposes only
 */
public enum Logger {

    /**
     * Enum instance
     */
    INSTANCE;

    private final List<String> mMessagesList = new ArrayList<String>(64);

    /**
     * Empty the messages lists
     */
    public void clear() {
        mMessagesList.clear();
    }

    /**
     * Log a message: prints on system.out and add to messages list
     *
     * @param pMessage
     */
    @SuppressWarnings("UseOfSystemOutOrSystemErr")
    public void log(final String pMessage) {
        System.out.println(pMessage);
        mMessagesList.add(pMessage);
    }

    /**
     * @return the list of the messages
     */
    public List<String> messages() {
        return Collections.unmodifiableList(mMessagesList);
    }

}
