package defpackage;

import java.io.File;
import java.io.FileDescriptor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tz3 {
    public static final sz3 Companion = new sz3();

    public static final tz3 create(ge3 ge3Var, b71 b71Var, hu2 hu2Var) {
        Companion.getClass();
        ge3Var.getClass();
        b71Var.getClass();
        return new rd0(ge3Var, b71Var, hu2Var);
    }

    public static final tz3 gzip(tz3 tz3Var) {
        Companion.getClass();
        tz3Var.getClass();
        return new rz3(tz3Var);
    }

    public long contentLength() {
        return -1L;
    }

    public abstract hu2 contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(ew ewVar);

    @zo0
    public static final tz3 create(hu2 hu2Var, File file) {
        Companion.getClass();
        file.getClass();
        return new qz3(hu2Var, file, 0);
    }

    @zo0
    public static final tz3 create(hu2 hu2Var, String str) {
        Companion.getClass();
        str.getClass();
        return sz3.b(str, hu2Var);
    }

    @zo0
    public static final tz3 create(hu2 hu2Var, byte[] bArr) {
        Companion.getClass();
        bArr.getClass();
        return sz3.a(hu2Var, bArr, 0, bArr.length);
    }

    @zo0
    public static final tz3 create(hu2 hu2Var, byte[] bArr, int i) {
        Companion.getClass();
        bArr.getClass();
        return sz3.a(hu2Var, bArr, i, bArr.length);
    }

    @zo0
    public static final tz3 create(hu2 hu2Var, yw ywVar) {
        Companion.getClass();
        ywVar.getClass();
        return new qz3(hu2Var, ywVar, 2);
    }

    public static final tz3 create(FileDescriptor fileDescriptor, hu2 hu2Var) {
        Companion.getClass();
        fileDescriptor.getClass();
        return new qz3(hu2Var, fileDescriptor, 1);
    }

    public static final tz3 create(String str, hu2 hu2Var) {
        Companion.getClass();
        return sz3.b(str, hu2Var);
    }

    public static final tz3 create(byte[] bArr) {
        sz3 sz3Var = Companion;
        sz3Var.getClass();
        bArr.getClass();
        return sz3.c(sz3Var, bArr, null, 0, 7);
    }

    public static final tz3 create(byte[] bArr, hu2 hu2Var) {
        sz3 sz3Var = Companion;
        sz3Var.getClass();
        bArr.getClass();
        return sz3.c(sz3Var, bArr, hu2Var, 0, 6);
    }

    public static final tz3 create(byte[] bArr, hu2 hu2Var, int i) {
        sz3 sz3Var = Companion;
        sz3Var.getClass();
        bArr.getClass();
        return sz3.c(sz3Var, bArr, hu2Var, i, 4);
    }

    public static final tz3 create(byte[] bArr, hu2 hu2Var, int i, int i2) {
        Companion.getClass();
        return sz3.a(hu2Var, bArr, i, i2);
    }

    public static final tz3 create(yw ywVar, hu2 hu2Var) {
        Companion.getClass();
        ywVar.getClass();
        return new qz3(hu2Var, ywVar, 2);
    }

    public static final tz3 create(File file, hu2 hu2Var) {
        Companion.getClass();
        file.getClass();
        return new qz3(hu2Var, file, 0);
    }

    @zo0
    public static final tz3 create(hu2 hu2Var, byte[] bArr, int i, int i2) {
        Companion.getClass();
        bArr.getClass();
        return sz3.a(hu2Var, bArr, i, i2);
    }
}
