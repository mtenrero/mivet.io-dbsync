package io.mivet.dbsync.mdbWatcher;

import org.junit.Test;

import java.io.File;
import java.net.URL;

public class QVetWatcher {

    @Test
    public void testOpenFile() {
        MdbQVetWatcher qWatcher = new MdbQVetWatcher("q.mdb");
        System.out.println("Succesfully read");
    }
}
