package org.soujava.microprofile.demo.heroes;


import org.jnosql.diana.api.document.DocumentCollectionManager;
import org.jnosql.diana.api.document.DocumentCollectionManagerFactory;
import org.jnosql.diana.couchbase.document.CouchbaseDocumentConfiguration;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

@ApplicationScoped
public class DocumentCollectionManagerProducer {


    private static final String DOCUMENT_COLLECTION = "heroes";

    private DocumentCollectionManager entityManager;

    @PostConstruct
    public void setUp() {
        CouchbaseDocumentConfiguration configuration = new CouchbaseDocumentConfiguration();
        DocumentCollectionManagerFactory managerFactory = configuration.get();
        entityManager = managerFactory.get(DOCUMENT_COLLECTION);
    }

    @Produces
    public DocumentCollectionManager getEntityManager() {
        return entityManager;
    }
}
