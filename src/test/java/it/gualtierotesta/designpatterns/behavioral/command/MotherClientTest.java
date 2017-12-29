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
package it.gualtierotesta.designpatterns.behavioral.command;

import it.gualtierotesta.designpatterns.behavioral.command.MotherClient;
import it.gualtierotesta.designpatterns.util.Logger;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for the main class which is the client
 *
 * @author Gualtiero Testa (www.gualtierotesta.it)
 */
public class MotherClientTest {

    private MotherClient sut;

    @Before
    public void setUp() {
        sut = new MotherClient();
        Logger.INSTANCE.clear();
    }

    @Test
    public void dinnerPreparation() {
        // when
        sut.prepareDinner();
        // then
        assertThat(Logger.INSTANCE.messages())
            .hasSize(8)
            .contains("Client: prepare the dinner");
    }

}
