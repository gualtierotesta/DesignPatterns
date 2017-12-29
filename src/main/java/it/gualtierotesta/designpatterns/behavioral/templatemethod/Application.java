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
 * Example from GoF "Design Patterns"
 *
 * Abstract class which defines the algorithm to open a dcument
 *
 * openDocument is a "template method"
 *
 * Standard operations: addDocument, openDocument
 *
 * Specific operations: doCreateDocument, canOpenDocument, aboutToOpenDocument
 *
 * Note: this class should be named AbstractApplication but we respect GoF book
 */
public abstract class Application {

    //
    // standard application operations
    //
    public void addDocument(Document pDoc) {
        Logger.INSTANCE.log("Application.addDocument");
    }

    /**
     * The template method
     *
     * @param pName document name
     */
    public void openDocument(String pName) {

        Logger.INSTANCE.log("Application.openDocument");
        if (!canOpenDocument(pName)) {
            // cannot handle the document
            return;
        }

        Document doc = doCreateDocument(pName);

        if (doc != null) {
            addDocument(doc); // _docs = addDocument(doc) in GoF book
            aboutToOpenDocument(doc);
            doc.open();
            doc.doRead();
        }
    }

    //
    // Application specific operations
    //
    public abstract Document doCreateDocument(String pName);

    public abstract boolean canOpenDocument(String pName);

    public abstract void aboutToOpenDocument(Document pDoc);

}
