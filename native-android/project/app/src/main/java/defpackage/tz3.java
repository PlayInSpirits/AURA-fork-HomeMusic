package defpackage;

import java.io.File;
import java.io.FileDescriptor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tz3 {
    public static final sz3 Companion = null;

    static {
        Companion = new sz3();
    }

    public static final tz3 create(ge3 r1, b71 r2, hu2 r3) {
        Companion.getClass();
        r1.getClass();
        r2.getClass();
        return new rd0(r1, r2, r3);
    }

    public static final tz3 gzip(tz3 r1) {
        Companion.getClass();
        r1.getClass();
        return new rz3(r1);
    }

    public long contentLength() {
        return -1;
    }

    public abstract hu2 contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(ew r1);

    @zo0
    public static final tz3 create(hu2 r2, File r3) {
        Companion.getClass();
        r3.getClass();
        return new qz3(r2, r3, 0);
    }

    @zo0
    public static final tz3 create(hu2 r1, String r2) {
        Companion.getClass();
        r2.getClass();
        return sz3.b(r2, r1);
    }

    @zo0
    public static final tz3 create(hu2 r2, byte[] r3) {
        Companion.getClass();
        r3.getClass();
        return sz3.a(r2, r3, 0, r3.length);
    }

    @zo0
    public static final tz3 create(hu2 r1, byte[] r2, int r3) {
        Companion.getClass();
        r2.getClass();
        return sz3.a(r1, r2, r3, r2.length);
    }

    @zo0
    public static final tz3 create(hu2 r2, yw r3) {
        Companion.getClass();
        r3.getClass();
        return new qz3(r2, r3, 2);
    }

    public static final tz3 create(FileDescriptor r2, hu2 r3) {
        Companion.getClass();
        r2.getClass();
        return new qz3(r3, r2, 1);
    }

    public static final tz3 create(String r1, hu2 r2) {
        Companion.getClass();
        return sz3.b(r1, r2);
    }

    public static final tz3 create(byte[] r4) {
        sz3 r0 = Companion;
        r0.getClass();
        r4.getClass();
        return sz3.c(r0, r4, null, 0, 7);
    }

    public static final tz3 create(byte[] r3, hu2 r4) {
        sz3 r0 = Companion;
        r0.getClass();
        r3.getClass();
        return sz3.c(r0, r3, r4, 0, 6);
    }

    public static final tz3 create(byte[] r2, hu2 r3, int r4) {
        sz3 r0 = Companion;
        r0.getClass();
        r2.getClass();
        return sz3.c(r0, r2, r3, r4, 4);
    }

    public static final tz3 create(byte[] r1, hu2 r2, int r3, int r4) {
        Companion.getClass();
        return sz3.a(r2, r1, r3, r4);
    }

    public static final tz3 create(yw r2, hu2 r3) {
        Companion.getClass();
        r2.getClass();
        return new qz3(r3, r2, 2);
    }

    public static final tz3 create(File r2, hu2 r3) {
        Companion.getClass();
        r2.getClass();
        return new qz3(r3, r2, 0);
    }

    @zo0
    public static final tz3 create(hu2 r1, byte[] r2, int r3, int r4) {
        Companion.getClass();
        r2.getClass();
        return sz3.a(r1, r2, r3, r4);
    }
}
