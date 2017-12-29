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

import java.util.ArrayList;
import java.util.List;

/**
 * The composite
 */
class Picture extends Graphic {

    private final List<Graphic> childrens = new ArrayList<Graphic>(0);

    @Override
    void add(Graphic pGraphic) {
        System.out.println("Picture.add()");
        childrens.add(pGraphic);
    }

    @Override
    void draw() {
        System.out.println("Picture.draw()");
        for (final Graphic children : childrens) {
            children.draw();
        }
    }

    @Override
    Graphic getChild(int pNumber) {
        System.out.println("Picture.getChild()");
        return childrens.get(pNumber);
    }

    @Override
    void remove(Graphic pGraphic) {
        System.out.println("Picture.remove()");
        childrens.remove(pGraphic);
    }

}
