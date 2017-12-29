/*
 * Copyright 2015 Gualtiero Testa <www.gualtierotesta.it>.
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
package it.gualtierotesta.designpatterns.structural.facade.gof;

/**
 * This class is the "builder" in a builder pattern where Scanner is the "director"
 *
 * Implemented as standard class that COULD be extended by concrete classes
 *
 * Product (ProgramNode) is returned by each method to the directoer which will be the assembler.
 */
class ProgramNodeBuilder {

    private ProgramNode node;

    static ProgramNode newVariable(String pVariableName) {
        return null;
    }

    static ProgramNode newAssignment(ProgramNode pVariable, ProgramNode pExpression) {
        return null;
    }

    static ProgramNode newReturnStatement(ProgramNode pValue) {
        return null;
    }

    static ProgramNode newCondition(ProgramNode pCondition, ProgramNode pTruePart, ProgramNode pFalsePart) {
        return null;
    }

    ProgramNode getRootNode() {
        // Return new ExpressioneNode just to make main working
        return new ExpressionNode();
    }
}
