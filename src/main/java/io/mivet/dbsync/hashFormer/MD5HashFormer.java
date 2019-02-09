package io.mivet.dbsync.hashFormer;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class MD5HashFormer implements HashFormer<String, Object[]> {

    private MessageDigest md;

    public MD5HashFormer() {
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String genHash(Object[] columnsData) {
        String plainString = Arrays.stream(columnsData)
                .map( Objects::toString )
                .collect( Collectors.joining(""));

        byte[] digest = md.digest(plainString.getBytes(StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(String.format("%02x", b));
        }

        return sb.toString().toUpperCase();
    }
}
