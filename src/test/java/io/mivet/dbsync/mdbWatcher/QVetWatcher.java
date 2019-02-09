package io.mivet.dbsync.mdbWatcher;

import org.junit.Test;

import java.io.File;
import java.net.URL;

public class QVetWatcher {

    @Test
    public void testOpenFile() {
        URL testQVetResourceDB = this.getClass().getClassLoader().getResource("databases/qvet-test-empty.mdb");
        MdbQVetWatcher mdbWatcher = new MdbQVetWatcher(testQVetResourceDB.getFile());
        System.out.println("Succesfully read");
    }
}
