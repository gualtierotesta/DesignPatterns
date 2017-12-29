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

import it.gualtierotesta.designpatterns.creational.singleton.LazyHolderClass;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

/**
 * Unit test
 */
public class LazyHolderClassTest {

    @Test
    public void callSingletonMethod() {
        // when
        String res = LazyHolderClass.getInstance().theMethod();
        // then
        assertThat(res).isEqualTo("OK");
    }

}
