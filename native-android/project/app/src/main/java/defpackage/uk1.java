package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uk1 {
    public static final byte[] e = null;
    public boolean a;
    public int b;
    public int c;
    public byte[] d;

    static {
        e = new byte[]{0, 0, 1};
    }

    public final void a(byte[] r4, int r5, int r6) {
        if (this.a == true) goto L5;
        return;
    L5:
        int r7 = r6 - r5;
        byte[] r0 = this.d;
        int r1 = r0.length;
        int r2 = this.b + r7;
        if (r1 >= r2) goto L8;
        this.d = Arrays.copyOf(r0, r2 * 2);
    L8:
        System.arraycopy(r4, r5, this.d, this.b, r7);
        this.b += r7;
    }
}
