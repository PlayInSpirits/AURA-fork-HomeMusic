package defpackage;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class p80
extends bq {
    public final HashMap h = new HashMap();
    public Handler i;
    public rw4 j;

    @Override
    public final void d() {
        for (o80 o802 : this.h.values()) {
            o802.a.c(o802.b);
        }
    }

    @Override
    public final void f() {
        for (o80 o802 : this.h.values()) {
            o802.a.e(o802.b);
        }
    }

    @Override
    public void j() {
        Iterator iterator = this.h.values().iterator();
        while (iterator.hasNext()) {
            ((o80)iterator.next()).a.j();
        }
    }

    @Override
    public void p() {
        HashMap hashMap = this.h;
        for (o80 o802 : hashMap.values()) {
            bq bq5 = o802.a;
            n80 n802 = o802.c;
            bq5.o(o802.b);
            bq5.r(n802);
            bq5.q(n802);
        }
        hashMap.clear();
    }

    public abstract mt2 t(Object var1, mt2 var2);

    public long u(long l16, Object object) {
        return l16;
    }

    public int v(int n16, Object object) {
        return n16;
    }

    public abstract void w(Object var1, bq var2, cu4 var3);

    public final void x(Integer object, bq bq5) {
        Object object2 = this.h;
        rr2.l(((HashMap)object2).containsKey(object) ^ true);
        m80 m802 = new m80(this, object);
        Object object3 = new n80(this, object);
        ((HashMap)object2).put(object, new o80(bq5, m802, (n80)object3));
        object = this.i;
        object.getClass();
        bq5.getClass();
        object2 = bq5.c;
        object2.getClass();
        object2 = (CopyOnWriteArrayList)((ue1)object2).q;
        Object object4 = new Object();
        ((rt2)object4).a = object;
        ((rt2)object4).b = object3;
        ((CopyOnWriteArrayList)object2).add(object4);
        object = this.i;
        object.getClass();
        object2 = bq5.d;
        object2.getClass();
        object4 = ((sw0)object2).c;
        object2 = new Object();
        ((rw0)object2).a = object;
        ((rw0)object2).b = object3;
        ((CopyOnWriteArrayList)object4).add(object2);
        object3 = this.j;
        object = this.g;
        object.getClass();
        bq5.k(m802, (rw4)object3, (ik3)object);
        if (this.b.isEmpty()) {
            bq5.c(m802);
        }
    }

    public final void y(Integer object) {
        Object object2 = (o80)this.h.remove(object);
        object2.getClass();
        object = ((o80)object2).a;
        ((bq)object).o(((o80)object2).b);
        object2 = ((o80)object2).c;
        ((bq)object).r((st2)object2);
        ((bq)object).q((tw0)object2);
    }
}

