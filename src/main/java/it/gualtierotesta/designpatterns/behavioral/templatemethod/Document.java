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
package it.gualtierotesta.designpatterns.behavioral.templatemethod;

import it.gualtierotesta.designpatterns.util.Logger;

/**
 * Abstract class which implements standard and specific document operations
 *
 * Standard operations: open, save, close
 *
 * Specific operations: doRead
 *
 * Note: this class should be named AbstractApplication but we respect GoF book
 */
public abstract class Document {

    //
    // standard document operations
    //
    public void save() {
        Logger.INSTANCE.log("Document.save");
    }

    public void open() {
        Logger.INSTANCE.log("Document.open");
    }

    public void close() {
        Logger.INSTANCE.log("Document.close");
    }

    //
    // document type specific operations
    //
    public abstract void doRead();
}
