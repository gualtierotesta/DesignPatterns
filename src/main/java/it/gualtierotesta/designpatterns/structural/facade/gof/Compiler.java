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

import java.io.InputStream;

/**
 * Facade class for the complete compiler subsystem
 */
public class Compiler {

    public void compile(InputStream pInput, BytecodeStream pOutput) {

        Scanner scanner = new Scanner(pInput);
        ProgramNodeBuilder builder = new ProgramNodeBuilder();

        Parser parser = new Parser();
        parser.parse(scanner, builder);

        CodeGenerator generator = new RISCCodeGenerator(pOutput);
        ProgramNode parseTree = builder.getRootNode();
        parseTree.traverse(generator);

    }
}
