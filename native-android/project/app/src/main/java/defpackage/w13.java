package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w13 implements Comparator {
    public static final w13 o = null;
    public static final w13 p = null;
    public final /* synthetic */ int n;

    static {
        o = new w13(0);
        p = new w13(1);
    }

    public /* synthetic */ w13(int r1) {
        this.n = r1;
    }

    @Override // java.util.Comparator
    public final int compare(Object r1, Object r2) {
        switch(this.n) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        Comparable r3 = (Comparable) r1;
        Comparable r4 = (Comparable) r2;
        r3.getClass();
        r4.getClass();
        return r4.compareTo(r3);
    L6:
        Comparable r5 = (Comparable) r1;
        Comparable r6 = (Comparable) r2;
        r5.getClass();
        r6.getClass();
        return r5.compareTo(r6);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return o;
    L7:
        return p;
    }
}
