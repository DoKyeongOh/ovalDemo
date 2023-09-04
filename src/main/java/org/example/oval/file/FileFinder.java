package org.example.oval.file;

import java.io.File;
import java.nio.file.AccessDeniedException;

public class FileFinder {
    public static void findDown(File baseDir, FileVisitor fileVisitor) {
        findDown(baseDir, Integer.MAX_VALUE, 0, fileVisitor);
    }

    public static void findDown(File baseDir, int maxDepth, int nowDepth, FileVisitor fileVisitor) {
        if (baseDir == null || !baseDir.isDirectory())
            return;
        File[] listFiles = baseDir.listFiles();
        if (listFiles == null || (listFiles != null && listFiles.length == 0))
            return;
        for (File file : listFiles) {
            fileVisitor.visit(file);
            if (file.isDirectory() && nowDepth < maxDepth)
                findDown(file, maxDepth, nowDepth + 1, fileVisitor);
        }
    }

    public interface FileVisitor {
        void visit(File file);
    }
}
