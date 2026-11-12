package defpackage;

import com.google.gson.reflect.TypeToken;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ez4 implements cz4 {
    public final /* synthetic */ Class n;
    public final /* synthetic */ Class o;
    public final /* synthetic */ bz4 p;

    public ez4(Class r1, Class r2, bz4 r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    @Override // defpackage.cz4
    public final bz4 a(nk1 r1, TypeToken r2) {
        Class r3 = r2.getRawType();
        if (r3 == this.n) goto L10;
        if (r3 == this.o) goto L10;
        return null;
    L10:
        return this.p;
    }

    public final String toString() {
        return "Factory[type=" + this.o.getName() + "+" + this.n.getName() + ",adapter=" + this.p + "]";
    }
}
