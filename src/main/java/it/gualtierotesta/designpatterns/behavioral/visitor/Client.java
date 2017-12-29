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
package it.gualtierotesta.designpatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Client class
 */
public class Client {

    private static final int NUM_ELEM = 8;
    private final List<Element> structure;
    private final Visitor visitor1;

    /**
     * Constructor
     */
    public Client() {
        this.structure = new ArrayList<Element>(NUM_ELEM);
        this.visitor1 = new ConcreteVisitor1();
        fillTheStructure();
    }

    /**
     * Ask visitor1 to process all elements in the structure
     */
    public void walk1() {
        for (final Element element : structure) {
            element.accept(visitor1);
        }
        visitor1.printStats();
    }

    /**
     * Fill the structure
     */
    private void fillTheStructure() {
        structure.add(new ConcreteElementA());
        structure.add(new ConcreteElementA());
        structure.add(new ConcreteElementA());
        structure.add(new ConcreteElementB());
        structure.add(new ConcreteElementB());
    }

}
