package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v44 implements xr0 {
    public final /* synthetic */ w44 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ a54 c;

    public v44(w44 r1, Object r2, a54 r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    @Override // defpackage.xr0
    public final void a() {
        w44 r0 = this.a;
        w03 r1 = r0.o;
        Object r2 = this.b;
        Object r3 = r1.j(r2);
        a54 r4 = this.c;
        if (r3 != r4) goto L10;
        Map r5 = r0.n;
        Map r6 = r4.c();
        if (r6.isEmpty() == false) goto L8;
        r5.remove(r2);
        return;
    L8:
        r5.put(r2, r6);
        return;
    }
}
