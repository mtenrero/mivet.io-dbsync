package io.mivet.dbsync.mdbWatcher;

import com.healthmarketscience.jackcess.Database;
import com.healthmarketscience.jackcess.DatabaseBuilder;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MDBWatcherImpl implements mdbWatcher {

    private final static Logger LOGGER = Logger.getLogger(MDBWatcherImpl.class.getName());

    protected String filePath;
    protected Database mdbDatabase;

    MDBWatcherImpl(String filePath) {
        this.filePath = filePath;
        openDatabase();
    }

    /**
     * Open the MDB database using the filepath class property previously defined
     */
    protected void openDatabase() {
        try {
            this.mdbDatabase = DatabaseBuilder.open(new File(this.filePath));
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "The MDB filepath is not valid!");
            e.printStackTrace();
        }
    }

    private Database getDatabase() {
        return mdbDatabase;
    }
}
