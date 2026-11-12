package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ye2 {
    public static final byte[] a = null;

    static {
        byte[] r0 = new byte[128];
        Arrays.fill(r0, (byte) -1);
        int r1 = 0;
        int r2 = 0;
    L4:
        if (r2 >= 10) goto L7;
        r0[r2 + 48] = (byte) r2;
        r2 = r2 + 1;
    L7:
        if (r1 >= 26) goto L9;
        byte r3 = (byte) (r1 + 10);
        r0[r1 + 65] = r3;
        r0[r1 + 97] = r3;
        r1 = r1 + 1;
        goto L7
    L9:
        a = r0;
    }
}
