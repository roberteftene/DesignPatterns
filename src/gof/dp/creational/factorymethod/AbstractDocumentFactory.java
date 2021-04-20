package gof.dp.creational.factorymethod;

import gof.dp.creational.factorymethod.documentsAPI.DocInterface;
import gof.dp.creational.factorymethod.documentsAPI.DocType;

public abstract class AbstractDocumentFactory {
    protected abstract DocInterface createDocument(DocType docType);
    public DocInterface newDocument(DocType docType, String name) {
        DocInterface docInterface = createDocument(docType);
        if(docInterface != null){
            docInterface.setName(name);
        }
        return docInterface;
    }
}
