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
 * Very simple singleton. Do NOT USE
 *
 * Non thread safe creation. Lazy initialization
 */
public class Simple {

    private static Simple instance;

    /**
     * @return the singleton instance, creating it if necessary
     */
    public static Simple getInstance() {
        //FindBugs reports here "Incorrect lazy initialization of static field"
        if (instance == null) {
            instance = new Simple();
        }
        return instance;
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
