package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t60 extends v60 {
    public static v60 f(int r0) {
        if (r0 < 0) goto L4;
        if (r0 <= 0) goto L9;
        return v60.c;
    L9:
        return v60.a;
    L4:
        return v60.b;
    }

    @Override // defpackage.v60
    public final v60 a(int r1, int r2) {
        return f(Integer.compare(r1, r2));
    }

    @Override // defpackage.v60
    public final v60 b(Object r1, Object r2, Comparator r3) {
        return f(r3.compare(r1, r2));
    }

    @Override // defpackage.v60
    public final v60 c(boolean r1, boolean r2) {
        return f(Boolean.compare(r1, r2));
    }

    @Override // defpackage.v60
    public final v60 d(boolean r1, boolean r2) {
        return f(Boolean.compare(r2, r1));
    }

    @Override // defpackage.v60
    public final int e() {
        return 0;
    }
}
