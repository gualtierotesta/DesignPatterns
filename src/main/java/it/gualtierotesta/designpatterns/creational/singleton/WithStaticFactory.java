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
 * Using a static factory
 *
 * Thread safe creation. Eager initialization
 */
public class WithStaticFactory {

    // Instance is created at class loading time
    private static final WithStaticFactory INSTANCE = new WithStaticFactory();

    /**
     * @return singleton instance
     */
    public static WithStaticFactory getInstance() {
        return INSTANCE;
    }

    private WithStaticFactory() {
        // empty
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
