package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum mj5 extends Enum implements Comparator {
    public static final mj5 n = null;
    public static final /* synthetic */ mj5[] o = null;

    static {
        mj5 r0 = new mj5("INSTANCE", 0);
        n = r0;
        o = new mj5[]{r0};
    }

    public static mj5[] values() {
        return (mj5[]) o.clone();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object r4, Object r5) {
        byte[] r6 = (byte[]) r4;
        byte[] r7 = (byte[]) r5;
        int r3 = Math.min(r6.length, r7.length);
        int r0 = 0;
    L3:
        if (r0 >= r3) goto L9;
        byte r1 = r6[r0];
        int r2 = (r1 & 255) - (r7[r0] & 255);
        if (r2 != 0) goto L6;
        r0 = r0 + 1;
        goto L3
    L6:
        return r2;
    L9:
        return r6.length - r7.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
