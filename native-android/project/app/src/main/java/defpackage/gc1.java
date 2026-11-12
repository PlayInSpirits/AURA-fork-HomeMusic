package defpackage;

import android.os.Bundle;
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

    public gc1(kc1 kc1Var, zg5 zg5Var, AtomicReference atomicReference, su3 su3Var, p5 p5Var) {
        this.e = kc1Var;
        this.a = zg5Var;
        this.b = atomicReference;
        this.c = su3Var;
        this.d = p5Var;
    }

    @Override // defpackage.ic1
    public final void a() {
        StringBuilder sb = new StringBuilder("fragment_");
        kc1 kc1Var = this.e;
        sb.append(kc1Var.r);
        sb.append("_rq#");
        sb.append(kc1Var.h0.getAndIncrement());
        final String string = sb.toString();
        kc1 kc1Var2 = (kc1) this.a.n;
        mc1 mc1Var = kc1Var2.G;
        final j70 j70Var = mc1Var != null ? mc1Var.E.u : kc1Var2.X().u;
        LinkedHashMap linkedHashMap = j70Var.c;
        ea2 ea2Var = kc1Var.c0;
        if (ea2Var.h.compareTo(r92.q) >= 0) {
            StringBuilder sb2 = new StringBuilder("LifecycleOwner ");
            sb2.append(kc1Var);
            r92 r92Var = ea2Var.h;
            sb2.append(" is attempting to register while current state is ");
            sb2.append(r92Var);
            sb2.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb2.toString().toString());
        }
        j70Var.d(string);
        v5 v5Var = (v5) linkedHashMap.get(string);
        if (v5Var == null) {
            v5Var = new v5(ea2Var);
        }
        final p5 p5Var = this.d;
        final su3 su3Var = this.c;
        w92 w92Var = new w92() { // from class: s5
            @Override // defpackage.w92
            public final void b(ba2 ba2Var, q92 q92Var) {
                j70 j70Var2 = j70Var;
                LinkedHashMap linkedHashMap2 = j70Var2.e;
                q92 q92Var2 = q92.ON_START;
                String str = string;
                if (q92Var2 != q92Var) {
                    if (q92.ON_STOP == q92Var) {
                        linkedHashMap2.remove(str);
                        return;
                    } else {
                        if (q92.ON_DESTROY == q92Var) {
                            j70Var2.e(str);
                            return;
                        }
                        return;
                    }
                }
                Bundle bundle = j70Var2.g;
                LinkedHashMap linkedHashMap3 = j70Var2.f;
                p5 p5Var2 = p5Var;
                su3 su3Var2 = su3Var;
                linkedHashMap2.put(str, new u5(p5Var2, su3Var2));
                if (linkedHashMap3.containsKey(str)) {
                    Object obj = linkedHashMap3.get(str);
                    linkedHashMap3.remove(str);
                    p5Var2.i(obj);
                }
                o5 o5Var = (o5) hw.l(str, bundle);
                if (o5Var != null) {
                    bundle.remove(str);
                    p5Var2.i(su3Var2.B(o5Var.o, o5Var.n));
                }
            }
        };
        v5Var.a.a(w92Var);
        v5Var.b.add(w92Var);
        linkedHashMap.put(string, v5Var);
        this.b.set(new w5(j70Var, string, su3Var, 0));
    }
}
