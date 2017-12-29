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
package it.gualtierotesta.designpatterns.structural.decorator.gof;

/**
 * MAIN class for the Decorator pattern (GoF version)
 *
 * @author Gualtiero Testa <www.gualtierotesta.it>
 */
@SuppressWarnings("UseOfSystemOutOrSystemErr")
public class Main {

    public static void main(String[] args) {

        System.out.println("START DECORATOR");

        // Instance to be decorated
        VisualComponent myTextView = new TextView();
        System.out.println("\nExecute undecorated method: ");
        myTextView.draw();

        // Decorated instance with a border
        VisualComponent myDecoratedTextView = new BorderDecorator(myTextView, 2);
        System.out.println("\nExecute decorated method: ");
        myDecoratedTextView.draw();

        System.out.println("\nEND DECORATOR");
    }
}
