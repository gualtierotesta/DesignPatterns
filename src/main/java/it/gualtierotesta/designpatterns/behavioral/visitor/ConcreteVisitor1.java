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

import it.gualtierotesta.designpatterns.util.Logger;

/**
 * Concrete Visitor 1
 */
public class ConcreteVisitor1 implements Visitor {

    private int countA;
    private int countB;

    /**
     * Print statistics
     */
    @Override
    public void printStats() {
        Logger.INSTANCE.log(String.format("Visited %d A and %d B", countA, countB));
    }

    /**
     * Visit the concrete element A passed as argument
     *
     * @param pElement the element to be visited
     */
    @Override
    public void visit(final ConcreteElementA pElement) {
        Logger.INSTANCE.log("Visiting ConcreteElementA");
        countA += 1;
    }

    /**
     * Visit the concrete element B passed as argument
     *
     * @param pElement the element to be visited
     */
    @Override
    public void visit(final ConcreteElementB pElement) {
        Logger.INSTANCE.log("Visiting ConcreteElementB");
        countB += 1;
    }

}
