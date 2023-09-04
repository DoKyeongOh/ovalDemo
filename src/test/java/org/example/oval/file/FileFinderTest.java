package org.example.oval.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class FileFinderTest {

    @Test
    public void test() throws IOException {
        File baseDir = new File("target/temp/fileFinderTest");
        if (baseDir.exists())
            baseDir.delete();
        baseDir.mkdirs();
        new File(baseDir, "dumy0-1").createNewFile();
        new File(baseDir, "dumy0-2").createNewFile();
        new File(baseDir, "dumy0-3").createNewFile();

        File depth1 = new File(baseDir, "depth1");
        depth1.mkdir();
        new File(depth1, "dumy1-1").createNewFile();
        new File(depth1, "dumy1-2").createNewFile();
        new File(depth1, "dumy1-3").createNewFile();

        File depth2 = new File(depth1, "depth2");
        depth2.mkdir();
        new File(depth2, "dumy2-1").createNewFile();
        new File(depth2, "dumy2-2").createNewFile();
        new File(depth2, "dumy2-3").createNewFile();

        final Set<String> fileSet = new HashSet<>();
        FileFinder.findDown(baseDir, 0, 0, file -> fileSet.add(file.getAbsolutePath()));
        assert fileSet.size() == 4;

        fileSet.clear();
        FileFinder.findDown(baseDir, 1, 0, file -> fileSet.add(file.getAbsolutePath()));
        assert fileSet.size() == 8;

        fileSet.clear();
        FileFinder.findDown(baseDir, 2, 0, file -> fileSet.add(file.getAbsolutePath()));
        assert fileSet.size() == 11;
        baseDir.delete();
    }

    @Test
    public void testAllFilesInFS() {
        FileFinder.findDown(new File("/"), file -> {

        });
    }
}