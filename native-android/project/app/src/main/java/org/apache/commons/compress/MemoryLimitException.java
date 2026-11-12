package org.apache.commons.compress;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class MemoryLimitException extends IOException {
    public MemoryLimitException(long r2, int r4, Exception r5) {
        super(r2 + " kb of memory would be needed; limit was " + r4 + " kb. If the file is not corrupt, consider increasing the memory limit.", r5);
    }
}
