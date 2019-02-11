package io.mivet.dbsync.mdbWatcher;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.net.URL;

public class QVetWatcher {

    @Test
    public void testOpenFile() {
        File db = new File("src/test/resources/q.mdb");
        MdbQVetWatcher qWatcher = new MdbQVetWatcher(db.getAbsolutePath());
        assertNotNull(qWatcher.mdbDatabase);
    }
}
