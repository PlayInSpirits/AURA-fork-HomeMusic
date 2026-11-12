package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p64 implements vb3 {
    public final int n;
    public final List o;
    public Float p = null;
    public Float q = null;
    public h64 r = null;
    public h64 s = null;

    public p64(int i, ArrayList arrayList) {
        this.n = i;
        this.o = arrayList;
    }

    @Override // defpackage.vb3
    public final boolean j() {
        return this.o.contains(this);
    }
}
