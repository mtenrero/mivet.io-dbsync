package io.mivet.dbsync.mdbWatcher;

import com.healthmarketscience.jackcess.Database;

public class MdbQVetWatcher extends MDBWatcherImpl implements mdbWatcher {

    public MdbQVetWatcher(String filepath) {
        super(filepath);
    }

    @Override
    void loadHashDBToMemory() {

    }
}
