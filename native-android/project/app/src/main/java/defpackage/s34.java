package defpackage;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s34 {
    public final f6 a;
    public final rm2 b;
    public final hy c;
    public final boolean d;
    public final List e;
    public int f;
    public List g;
    public final ArrayList h;

    public s34(f6 r1, rm2 r2, hy r3, boolean r4) {
        r1.getClass();
        r2.getClass();
        r3.getClass();
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        u01 r5 = u01.n;
        this.e = r5;
        this.g = r5;
        this.h = new ArrayList();
        gr1 r6 = r1.h;
        r6.getClass();
        URI r7 = r6.j();
        if (r7.getHost() != null) goto L5;
        List r8 = ze5.f(new Proxy[]{Proxy.NO_PROXY});
    L12:
        this.e = r8;
        this.f = 0;
        r6.getClass();
        return;
    L5:
        List<Proxy> r9 = r1.g.select(r7);
        if (r9 != null) goto L8;
    L11:
        r8 = ze5.f(new Proxy[]{Proxy.NO_PROXY});
        goto L12
    L8:
        if (r9.isEmpty() == true) goto L11;
        r8 = ze5.k(r9);
        goto L12
    }

    public final boolean a() {
        if (this.f >= this.e.size()) goto L6;
        return true;
    L6:
        if (this.h.isEmpty() == true) goto L9;
        return true;
    L9:
        return false;
    }
}
