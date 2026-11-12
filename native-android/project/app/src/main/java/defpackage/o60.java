package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o60 extends r1 {
    public final Object n;
    public int o;
    public final /* synthetic */ p60 p;

    public o60(p60 r2, int r3) {
        this.p = r2;
        Object r0 = p60.w;
        this.n = r2.j()[r3];
        this.o = r3;
    }

    public final void a() {
        int r0 = this.o;
        Object r2 = this.n;
        p60 r3 = this.p;
        if (r0 != (-1)) goto L5;
    L10:
        Object r1 = p60.w;
        this.o = r3.e(r2);
        return;
    L5:
        if (r0 >= r3.size()) goto L10;
        int r4 = this.o;
        if (si0.s(r2, r3.j()[r4]) == false) goto L10;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.n;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        p60 r0 = this.p;
        Map r1 = r0.c();
        if (r1 != null) goto L5;
        a();
        int r2 = this.o;
        if (r2 != (-1)) goto L11;
        return null;
    L11:
        return r0.k()[r2];
    L5:
        return r1.get(this.n);
    }

    @Override // defpackage.r1, java.util.Map.Entry
    public final Object setValue(Object r5) {
        p60 r0 = this.p;
        Map r1 = r0.c();
        Object r2 = this.n;
        if (r1 != null) goto L5;
        a();
        int r3 = this.o;
        if (r3 != (-1)) goto L10;
        r0.put(r2, r5);
        return null;
    L10:
        Object r4 = r0.k()[r3];
        int r6 = this.o;
        r0.k()[r6] = r5;
        return r4;
    L5:
        return r1.put(r2, r5);
    }
}
