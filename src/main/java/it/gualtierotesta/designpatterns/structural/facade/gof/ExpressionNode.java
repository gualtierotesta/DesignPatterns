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
 *
 */
class ExpressionNode implements ProgramNode {

    @Override
    public void add(ProgramNode pRogramNode) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void getSourcePosition(int pLine, int pIndex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void remove(ProgramNode pRogramNode) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void traverse(CodeGenerator pCodeGenerator) {

        pCodeGenerator.visit(this);

        //TODO
    }

}
