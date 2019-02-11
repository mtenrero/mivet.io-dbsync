package io.mivet.dbsync.mdbWatcher;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
 
import com.healthmarketscience.jackcess.Table;

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

    @Test
    public void testReadTables() {
        MDBWatcherImpl qWatcher = openMdbWatcher();
        Table table;
        try {
            table = qWatcher.mdbDatabase.getTable("Clientes");
            assertTrue(table.getColumnCount() > 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
