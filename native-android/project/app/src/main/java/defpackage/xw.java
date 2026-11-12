package defpackage;

import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xw {
    static {
        new ww();
    }

    public static byte[] a(ArrayDeque r6, int r7) {
        if (r6.isEmpty() == true) goto L5;
        byte[] r0 = (byte[]) r6.remove();
        if (r0.length != r7) goto L9;
        return r0;
    L9:
        int r2 = r7 - r0.length;
        byte[] r1 = Arrays.copyOf(r0, r7);
    L10:
        if (r2 <= 0) goto L12;
        byte[] r3 = (byte[]) r6.remove();
        int r4 = Math.min(r2, r3.length);
        System.arraycopy(r3, 0, r1, r7 - r2, r4);
        r2 = r2 - r4;
        goto L10
    L12:
        return r1;
    L5:
        return new byte[0];
    }

    public static byte[] b(InputStream r10) {
        ArrayDeque r0 = new ArrayDeque(20);
        int r2 = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int r4 = 0;
    L4:
        if (r4 >= 2147483639) goto L18;
        int r6 = Math.min(r2, 2147483639 - r4);
        byte[] r7 = new byte[r6];
        r0.add(r7);
        int r8 = 0;
    L6:
        if (r8 >= r6) goto L13;
        int r9 = r10.read(r7, r8, r6 - r8);
        if (r9 == (-1)) goto L10;
        r8 = r8 + r9;
        r4 = r4 + r9;
        goto L6
    L10:
        return a(r0, r4);
    L13:
        if (r2 >= 4096) goto L15;
        int r5 = 4;
    L16:
        r2 = jz4.I(((long) r2) * ((long) r5));
        goto L4
    L15:
        r5 = 2;
        goto L16
    L18:
        if (r10.read() != (-1)) goto L22;
        return a(r0, 2147483639);
    L22:
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
