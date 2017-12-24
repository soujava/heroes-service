package org.soujava.microprofile.demo.heroes;


import org.jnosql.diana.api.Settings;
import org.jnosql.diana.api.SettingsBuilder;
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
        Settings settings = Settings.builder()
                .put("couchbase-host-1", "localhost")
                .put("couchbase-user", "root")
                .put("couchbase-password", "123456").build();
        DocumentCollectionManagerFactory managerFactory = configuration.get(settings);
        entityManager = managerFactory.get(DOCUMENT_COLLECTION);
    }

    @Produces
    public DocumentCollectionManager getEntityManager() {
        return entityManager;
    }
}
