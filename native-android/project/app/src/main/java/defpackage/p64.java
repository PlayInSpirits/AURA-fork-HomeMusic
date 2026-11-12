package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p64 implements vb3 {
    public final int n;
    public final List o;
    public Float p;
    public Float q;
    public h64 r;
    public h64 s;

    public p64(int r1, ArrayList r2) {
        this.n = r1;
        this.o = r2;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
    }

    @Override // defpackage.vb3
    public final boolean j() {
        return this.o.contains(this);
    }
}
