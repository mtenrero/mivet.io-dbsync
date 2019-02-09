package io.mivet.dbsync.hashFormer;

import org.junit.Assert;
import org.junit.Test;

public class MD5Test {

    @Test
    public void testMD5Strings() {
        String [] data = {"test1", "test2", "test3", "test4"};

        MD5HashFormer hashFormer = new MD5HashFormer();

        String md5 = hashFormer.genHash(data);
        Assert.assertEquals("A83B651AFEC1F6DFC714C8D483AC4A08", md5);
    }

    @Test
    public void testMD5Integers() {
        Integer [] data = {0,1,2,3,4,5};

        MD5HashFormer hashFormer = new MD5HashFormer();

        String md5 = hashFormer.genHash(data);
        Assert.assertEquals("D6A9A933C8AAFC51E55AC0662B6E4D4A", md5);
    }

    @Test
    public void testMD5StringCaseIntegers() {
        Object [] data = {"string0", 1, 2, "String2", "String3"};

        MD5HashFormer hashFormer = new MD5HashFormer();

        String md5 = hashFormer.genHash(data);
        Assert.assertEquals("058AC393031BBD311D56861E573DB1D7", md5);
    }
}
