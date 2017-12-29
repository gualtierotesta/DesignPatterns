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
package it.gualtierotesta.designpatterns.structural.composite.gof;

/**
 * COMPOSITE design pattern example
 */
public class Main {

    public static void main(String[] args) {

        Graphic g1 = new Picture();
        Graphic g2 = new Rectangle();
        Graphic g3 = new Picture();
        Graphic g4 = new Rectangle();
        Graphic g5 = new Line();

        // G1 is the root and it contains a rectangle and a picture
        g1.add(g2);
        g1.add(g3);

        // G3 contains a rectangle and a line
        g3.add(g4);
        g3.add(g5);

        System.out.println("Execute operation on all hierarchy");
        g1.draw();

    }

}
