package io.mivet.dbsync.mdbWatcher;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class QVetWatcher {

    MdbQVetWatcher mdbQVetWatcher;

    private MdbQVetWatcher openMdbWatcher() {
        if (mdbQVetWatcher == null) {
            File db = new File("src/test/resources/q.mdb");
            mdbQVetWatcher= new MdbQVetWatcher(db.getAbsolutePath());
        }
        return mdbQVetWatcher;
    }

    @After
    public void closeDescriptor() {
        try {
            mdbQVetWatcher.mdbDatabase.close();
        } catch (IOException e) {
        }
    }

    @Test
    public void testOpenFile() {
        MDBWatcherImpl qWatcher = openMdbWatcher();
        assertNotNull(qWatcher.mdbDatabase);   
    }
}
