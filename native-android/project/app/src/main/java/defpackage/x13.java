package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x13 extends gb3 implements Serializable {
    public static final x13 o = null;
    public static final x13 p = null;
    public final /* synthetic */ int n;

    static {
        o = new x13(0);
        p = new x13(1);
    }

    public /* synthetic */ x13(int r1) {
        this.n = r1;
    }

    @Override // defpackage.gb3
    public final gb3 a() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return o;
    L7:
        return p;
    }

    @Override // java.util.Comparator
    public final int compare(Object r1, Object r2) {
        switch(this.n) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        Comparable r3 = (Comparable) r1;
        Comparable r4 = (Comparable) r2;
        r3.getClass();
        if (r3 != r4) goto L8;
        return 0;
    L8:
        return r4.compareTo(r3);
    L9:
        Comparable r5 = (Comparable) r1;
        Comparable r6 = (Comparable) r2;
        r5.getClass();
        r6.getClass();
        return r5.compareTo(r6);
    }

    public final String toString() {
        switch(this.n) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return "Ordering.natural().reverse()";
    L6:
        return "Ordering.natural()";
    }
}
