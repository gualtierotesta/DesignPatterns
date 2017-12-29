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
 * LazyHolderClass: singleton with a lazy holder inner class
 *
 * Thread safe creation. Lazy initialization
 *
 * @see http://en.wikipedia.org/wiki/Initialization_on_demand_holder_idiom
 */
public class LazyHolderClass {

    /**
     * @return the singleton instance
     */
    public static LazyHolderClass getInstance() {
        return SimpleHolder.INSTANCE;
    }

    private LazyHolderClass() {
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

    private static class SimpleHolder {

        private static final LazyHolderClass INSTANCE = new LazyHolderClass();
    }
}
