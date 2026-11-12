package defpackage;

import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wz4 extends gb3 {
    public final /* synthetic */ HashMap n;

    public wz4(HashMap r1) {
        this.n = r1;
    }

    @Override // java.util.Comparator
    public final int compare(Object r1, Object r2) {
        HashMap r0 = this.n;
        Object r3 = r0.get(r1);
        Objects.requireNonNull(r3);
        Object r4 = r0.get(r2);
        Objects.requireNonNull(r4);
        Comparable r5 = (Comparable) r3;
        Comparable r6 = (Comparable) r4;
        if (r5 != r6) goto L6;
        return 0;
    L6:
        return r6.compareTo(r5);
    }
}
