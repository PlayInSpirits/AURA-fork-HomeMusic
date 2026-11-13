/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.aa2;
import defpackage.ea2;
import defpackage.ic1;
import defpackage.j70;
import defpackage.kc1;
import defpackage.mc1;
import defpackage.p5;
import defpackage.r92;
import defpackage.s5;
import defpackage.su3;
import defpackage.v5;
import defpackage.w5;
import defpackage.zg5;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;

public final class gc1
extends ic1 {
    public final zg5 a;
    public final AtomicReference b;
    public final su3 c;
    public final p5 d;
    public final kc1 e;

    public gc1(kc1 kc12, zg5 zg52, AtomicReference atomicReference, su3 su32, p5 p56) {
        this.e = kc12;
        this.a = zg52;
        this.b = atomicReference;
        this.c = su32;
        this.d = p56;
    }

    @Override
    public final void a() {
        Object object = new StringBuilder("fragment_");
        Object object2 = this.e;
        ((StringBuilder)object).append(((kc1)object2).r);
        ((StringBuilder)object).append("_rq#");
        ((StringBuilder)object).append(((kc1)object2).h0.getAndIncrement());
        String string = ((StringBuilder)object).toString();
        Object object3 = (kc1)this.a.n;
        object = ((kc1)object3).G;
        object = object != null ? ((mc1)object).E.u : ((kc1)object3).X().u;
        LinkedHashMap linkedHashMap = ((j70)object).c;
        Object object4 = ((kc1)object2).c0;
        if (((ea2)object4).h.compareTo(r92.q) < 0) {
            ((j70)object).d(string);
            object2 = object3 = (v5)linkedHashMap.get(string);
            if (object3 == null) {
                object2 = new v5((ea2)object4);
            }
            object4 = this.d;
            object3 = this.c;
            object4 = new s5((j70)object, string, (p5)object4, (su3)object3);
            ((v5)object2).a.a((aa2)object4);
            ((v5)object2).b.add(object4);
            linkedHashMap.put(string, object2);
            object = new w5((j70)object, string, (su3)object3, 0);
            this.b.set(object);
            return;
        }
        object = new StringBuilder("LifecycleOwner ");
        ((StringBuilder)object).append(object2);
        object2 = ((ea2)object4).h;
        ((StringBuilder)object).append(" is attempting to register while current state is ");
        ((StringBuilder)object).append(object2);
        ((StringBuilder)object).append(". LifecycleOwners must call register before they are STARTED.");
        throw new IllegalStateException(((StringBuilder)object).toString().toString());
    }
}

