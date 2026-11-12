package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
final class ParcelFileDescriptorRewinder$InternalRewinder {
    public final ParcelFileDescriptor a;

    public ParcelFileDescriptorRewinder$InternalRewinder(ParcelFileDescriptor r1) {
        this.a = r1;
    }

    public ParcelFileDescriptor rewind() {
        ParcelFileDescriptor r4 = this.a;
        Os.lseek(r4.getFileDescriptor(), 0, OsConstants.SEEK_SET);     // Catch: ErrnoException -> L5
        return r4;
    L5:
        e = move-exception;
        throw new IOException(e);
    }
}
