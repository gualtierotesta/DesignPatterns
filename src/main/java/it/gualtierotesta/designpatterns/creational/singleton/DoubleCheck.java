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
package it.gualtierotesta.designpatterns.creational.singleton;

/**
 * Double check during creation to prevent multi-threading problems
 *
 * Thread safe creation. Lazy initialization
 *
 */
public class DoubleCheck {

    private static volatile DoubleCheck instance;

    /**
     * @return singleton instance
     */
    public static DoubleCheck getInstance() {
        if (instance == null) {  // first check
            synchronized (DoubleCheck.class) {
                if (instance == null) {  // second check
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }

    private DoubleCheck() {
        // Empty
    }

    /**
     * Example of singleton public method
     *
     * @return a string with dummy message
     */
    public String theMethod() {
        return "OK";
    }

}
