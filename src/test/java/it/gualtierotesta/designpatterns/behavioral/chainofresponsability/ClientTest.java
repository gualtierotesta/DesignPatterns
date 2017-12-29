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
package it.gualtierotesta.designpatterns.behavioral.chainofresponsability;

import it.gualtierotesta.designpatterns.behavioral.chainofresponsability.EmptyHandler;
import it.gualtierotesta.designpatterns.behavioral.chainofresponsability.Client;
import it.gualtierotesta.designpatterns.behavioral.chainofresponsability.StandardHandler;
import it.gualtierotesta.designpatterns.behavioral.chainofresponsability.NullHandler;
import it.gualtierotesta.designpatterns.util.Logger;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Gualtiero Testa (www.gualtierotesta.it)
 */
public class ClientTest {

    private Client sut;

    @Before
    public void setUp() {
        sut = new Client(headOfChain());
        Logger.INSTANCE.clear();
    }

    @Test
    public void nullStringCase() {
        // given
        String str = null;
        // when
        sut.process(str);
        // then
        assertThat(Logger.INSTANCE.messages())
            .hasSize(1)
            .contains("String is null");
    }

    @Test
    public void emptyStringCase() {
        // given
        String str = "";
        // when
        sut.process(str);
        // then
        assertThat(Logger.INSTANCE.messages())
            .hasSize(1)
            .contains("String is empty");
    }

    @Test
    public void standardStringCase() {
        // given
        String str = "test";
        // when
        sut.process(str);
        // then
        assertThat(Logger.INSTANCE.messages())
            .hasSize(1)
            .contains("String is OK: test");
    }

    // Creates the chain and return its head
    private NullHandler headOfChain() {
        NullHandler nullHandler = new NullHandler();
        EmptyHandler emptyHandler = new EmptyHandler();
        StandardHandler standardHandler = new StandardHandler();
        nullHandler.setNext(emptyHandler);
        emptyHandler.setNext(standardHandler);
        return nullHandler;
    }

}
