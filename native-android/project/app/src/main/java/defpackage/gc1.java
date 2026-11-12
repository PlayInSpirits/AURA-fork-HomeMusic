package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gc1 extends ic1 {
    public final /* synthetic */ zg5 a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ su3 c;
    public final /* synthetic */ p5 d;
    public final /* synthetic */ kc1 e;

    public gc1(kc1 r1, zg5 r2, AtomicReference r3, su3 r4, p5 r5) {
        this.e = r1;
        this.a = r2;
        this.b = r3;
        this.c = r4;
        this.d = r5;
    }

    @Override // defpackage.ic1
    public final void a() {
        StringBuilder r0 = new StringBuilder("fragment_");
        kc1 r1 = this.e;
        r0.append(r1.r);
        r0.append("_rq#");
        r0.append(r1.h0.getAndIncrement());
        final String r2 = r0.toString();
        kc1 r3 = (kc1) this.a.n;
        mc1 r4 = r3.G;
        if (r4 == null) goto L5;
        final j70 r5 = r4.E.u;
    L6:
        LinkedHashMap r6 = r5.c;
        ea2 r7 = r1.c0;
        if (r7.h.compareTo(r92.q) >= 0) goto L13;
        r5.d(r2);
        v5 r8 = (v5) r6.get(r2);
        if (r8 != null) goto L11;
        r8 = new v5(r7);
    L11:
        final p5 r9 = this.d;
        final su3 r10 = this.c;
        w92 r11 = new s5(r5, r2, r9, r10);
        r8.a.a(r11);
        r8.b.add(r11);
        r6.put(r2, r8);
        w5 r12 = new w5(r5, r2, r10, 0);
        this.b.set(r12);
        return;
    L13:
        StringBuilder r13 = new StringBuilder("LifecycleOwner ");
        r13.append(r1);
        r92 r14 = r7.h;
        r13.append(" is attempting to register while current state is ");
        r13.append(r14);
        r13.append(". LifecycleOwners must call register before they are STARTED.");
        throw new IllegalStateException(r13.toString().toString());
    L5:
        r5 = r3.X().u;
        goto L6
    }
}
