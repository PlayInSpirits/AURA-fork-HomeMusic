package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h71 implements aa4 {
    public final aa4 a;
    public final boolean b;
    public final if1 c;

    public h71(aa4 r1, boolean r2, if1 r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    @Override // defpackage.aa4
    public final Iterator iterator() {
        return new g71(this);
    }
}
