package defpackage;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Trace
 */
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public final class yg1
implements Runnable {
    public static final ThreadLocal r = new ThreadLocal();
    public static final ca1 s = new ca1(18);
    public final ArrayList n = new ArrayList();
    public long o;
    public long p;
    public final ArrayList q = new ArrayList();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static cx3 c(RecyclerView recyclerView, int n16, long l16) {
        Throwable throwable2;
        block8: {
            hm2 hm22;
            cx3 cx32;
            block7: {
                int n17 = recyclerView.s.k();
                for (int i16 = 0; i16 < n17; ++i16) {
                    cx32 = RecyclerView.N(recyclerView.s.j(i16));
                    if (cx32.c != n16 || cx32.h()) continue;
                    return null;
                }
                hm22 = recyclerView.p;
                if (l16 == Long.MAX_VALUE) {
                    try {
                        if (!ov4.a()) break block7;
                        Trace.beginSection((String)"RV Prefetch forced - needed next frame");
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                }
            }
            recyclerView.V();
            cx32 = hm22.k(n16, l16);
            if (cx32 != null) {
                if (cx32.g() && !cx32.h()) {
                    hm22.h(cx32.a);
                } else {
                    hm22.a(cx32, false);
                }
            }
            recyclerView.W(false);
            Trace.endSection();
            return cx32;
        }
        recyclerView.W(false);
        Trace.endSection();
        throw throwable2;
    }

    public final void a(RecyclerView object, int n16, int n17) {
        if (((RecyclerView)object).F) {
            if (RecyclerView.P0 && !this.n.contains(object)) {
                kf2.o("attempting to post unregistered view!");
                return;
            }
            if (this.o == 0L) {
                this.o = ((RecyclerView)object).getNanoTime();
                object.post((Runnable)this);
            }
        }
        object = ((RecyclerView)object).t0;
        ((b30)object).a = n16;
        ((b30)object).b = n17;
    }

    public final void b(long l16) {
        Object object;
        Object object2;
        Object object3;
        int n16;
        Object object4;
        int n17;
        Object object5;
        int n18;
        Object object6 = this.n;
        int n19 = ((ArrayList)object6).size();
        int n26 = 0;
        for (n18 = 0; n18 < n19; ++n18) {
            object5 = (RecyclerView)((ArrayList)object6).get(n18);
            n17 = object5.getWindowVisibility();
            object4 = ((RecyclerView)object5).t0;
            n16 = n26;
            if (n17 == 0) {
                ((b30)object4).c((RecyclerView)object5, false);
                n16 = n26 + ((b30)object4).d;
            }
            n26 = n16;
        }
        object4 = this.q;
        ((ArrayList)object4).ensureCapacity(n26);
        n26 = 0;
        for (n16 = 0; n16 < n19; ++n16) {
            object3 = (RecyclerView)((ArrayList)object6).get(n16);
            if (object3.getWindowVisibility() != 0) {
                n17 = n26;
            } else {
                object2 = ((RecyclerView)object3).t0;
                n18 = Math.abs(((b30)object2).a);
                int n27 = Math.abs(((b30)object2).b) + n18;
                n18 = 0;
                while (true) {
                    boolean bl5 = false;
                    n17 = n26;
                    if (n18 >= ((b30)object2).d * 2) break;
                    if (n26 >= ((ArrayList)object4).size()) {
                        object5 = new Object();
                        ((ArrayList)object4).add(object5);
                    } else {
                        object5 = (xg1)((ArrayList)object4).get(n26);
                    }
                    object = ((b30)object2).c;
                    n17 = object[n18 + 1];
                    if (n17 <= n27) {
                        bl5 = true;
                    }
                    ((xg1)object5).a = bl5;
                    ((xg1)object5).b = n27;
                    ((xg1)object5).c = n17;
                    ((xg1)object5).d = object3;
                    ((xg1)object5).e = object[n18];
                    ++n26;
                    n18 += 2;
                }
            }
            n26 = n17;
        }
        Collections.sort(object4, s);
        for (n26 = 0; n26 < ((ArrayList)object4).size(); ++n26) {
            object6 = (xg1)((ArrayList)object4).get(n26);
            object5 = ((xg1)object6).d;
            if (object5 == null) break;
            long l17 = ((xg1)object6).a ? Long.MAX_VALUE : l16;
            if ((object5 = yg1.c((RecyclerView)object5, ((xg1)object6).e, l17)) != null && ((cx3)object5).b != null && ((cx3)object5).g() && !((cx3)object5).h() && (object2 = (RecyclerView)((cx3)object5).b.get()) != null) {
                if (((RecyclerView)object2).Q && ((RecyclerView)object2).s.k() != 0) {
                    object5 = ((RecyclerView)object2).p;
                    object3 = ((RecyclerView)object2).c0;
                    if (object3 != null) {
                        ((jw3)object3).e();
                    }
                    if ((object3 = ((RecyclerView)object2).A) != null) {
                        ((mw3)object3).l0((hm2)object5);
                        ((RecyclerView)object2).A.m0((hm2)object5);
                    }
                    ((ArrayList)((hm2)object5).d).clear();
                    ((hm2)object5).f();
                }
                object3 = ((RecyclerView)object2).t0;
                ((b30)object3).c((RecyclerView)object2, true);
                if (((b30)object3).d != 0) {
                    object5 = l16 == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame";
                    try {
                        Trace.beginSection((String)object5);
                        object5 = ((RecyclerView)object2).u0;
                        object = ((RecyclerView)object2).z;
                        ((yw3)object5).d = 1;
                        ((yw3)object5).e = ((dw3)object).a();
                        ((yw3)object5).g = false;
                        ((yw3)object5).h = false;
                        ((yw3)object5).i = false;
                        n16 = 0;
                    }
                    catch (Throwable throwable) {
                        Trace.endSection();
                        throw throwable;
                    }
                    while (true) {
                        if (n16 >= ((b30)object3).d * 2) break;
                        yg1.c((RecyclerView)object2, ((b30)object3).c[n16], l16);
                        n16 += 2;
                        continue;
                        break;
                    }
                    Trace.endSection();
                }
            }
            ((xg1)object6).a = false;
            ((xg1)object6).b = 0;
            ((xg1)object6).c = 0;
            ((xg1)object6).d = null;
            ((xg1)object6).e = 0;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        Throwable throwable2;
        block7: {
            block6: {
                ArrayList arrayList = this.n;
                try {
                    Trace.beginSection((String)"RV Prefetch");
                    boolean bl5 = arrayList.isEmpty();
                    if (bl5) break block6;
                    int n16 = arrayList.size();
                    long l16 = 0L;
                    for (int i16 = 0; i16 < n16; ++i16) {
                        RecyclerView recyclerView = (RecyclerView)arrayList.get(i16);
                        long l17 = l16;
                        if (recyclerView.getWindowVisibility() == 0) {
                            l17 = Math.max(recyclerView.getDrawingTime(), l16);
                        }
                        l16 = l17;
                    }
                    if (l16 == 0L) break block6;
                    this.b(TimeUnit.MILLISECONDS.toNanos(l16) + this.p);
                }
                catch (Throwable throwable2) {
                    break block7;
                }
            }
            this.o = 0L;
            Trace.endSection();
            return;
        }
        this.o = 0L;
        Trace.endSection();
        throw throwable2;
    }
}

