package org.example;


import java.io.IOException;
import java.util.Map;

public interface CRUDOperations {

    void indexDocument(String index, String id, Map<String, Object> document) throws IOException;

    Map<String, Object> getDocument(String index, String id) throws IOException;
//
//    void updateDocument(String index, String id, Map<String, Object> updatedDocument) throws IOException;
//
    void deleteDocument(String index, String id) throws IOException;
//
        Map<String, Object> getAllDocument(String index) throws IOException;
}
