package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class yg1 implements Runnable {
    public static final ThreadLocal r = new ThreadLocal();
    public static final ca1 s = new ca1(18);
    public long o;
    public long p;
    public final ArrayList n = new ArrayList();
    public final ArrayList q = new ArrayList();

    public static cx3 c(RecyclerView recyclerView, int i, long j) {
        int k = recyclerView.s.k();
        for (int i2 = 0; i2 < k; i2++) {
            cx3 N = RecyclerView.N(recyclerView.s.j(i2));
            if (N.c == i && !N.h()) {
                return null;
            }
        }
        hm2 hm2Var = recyclerView.p;
        if (j == Long.MAX_VALUE) {
            try {
                if (ov4.a()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } catch (Throwable th) {
                recyclerView.W(false);
                Trace.endSection();
                throw th;
            }
        }
        recyclerView.V();
        cx3 k2 = hm2Var.k(i, j);
        if (k2 != null) {
            if (!k2.g() || k2.h()) {
                hm2Var.a(k2, false);
            } else {
                hm2Var.h(k2.a);
            }
        }
        recyclerView.W(false);
        Trace.endSection();
        return k2;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.F) {
            if (RecyclerView.P0 && !this.n.contains(recyclerView)) {
                kf2.o("attempting to post unregistered view!");
                return;
            } else if (this.o == 0) {
                this.o = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        b30 b30Var = recyclerView.t0;
        b30Var.a = i;
        b30Var.b = i2;
    }

    public final void b(long j) {
        xg1 xg1Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        xg1 xg1Var2;
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            b30 b30Var = recyclerView3.t0;
            if (windowVisibility == 0) {
                b30Var.c(recyclerView3, false);
                i += b30Var.d;
            }
        }
        ArrayList arrayList2 = this.q;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i3);
            if (recyclerView4.getWindowVisibility() == 0) {
                b30 b30Var2 = recyclerView4.t0;
                int abs = Math.abs(b30Var2.b) + Math.abs(b30Var2.a);
                int i5 = z ? 1 : 0;
                while (i5 < b30Var2.d * 2) {
                    if (i4 >= arrayList2.size()) {
                        xg1Var2 = new xg1();
                        arrayList2.add(xg1Var2);
                    } else {
                        xg1Var2 = (xg1) arrayList2.get(i4);
                    }
                    int[] iArr = b30Var2.c;
                    int i6 = iArr[i5 + 1];
                    if (i6 <= abs) {
                        z = true;
                    }
                    xg1Var2.a = z;
                    xg1Var2.b = abs;
                    xg1Var2.c = i6;
                    xg1Var2.d = recyclerView4;
                    xg1Var2.e = iArr[i5];
                    i4++;
                    i5 += 2;
                    z = false;
                }
            }
            i3++;
            z = false;
        }
        Collections.sort(arrayList2, s);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (xg1Var = (xg1) arrayList2.get(i7)).d) != null; i7++) {
            cx3 c = c(recyclerView, xg1Var.e, xg1Var.a ? Long.MAX_VALUE : j);
            if (c != null && c.b != null && c.g() && !c.h() && (recyclerView2 = (RecyclerView) c.b.get()) != null) {
                if (recyclerView2.Q && recyclerView2.s.k() != 0) {
                    hm2 hm2Var = recyclerView2.p;
                    jw3 jw3Var = recyclerView2.c0;
                    if (jw3Var != null) {
                        jw3Var.e();
                    }
                    mw3 mw3Var = recyclerView2.A;
                    if (mw3Var != null) {
                        mw3Var.l0(hm2Var);
                        recyclerView2.A.m0(hm2Var);
                    }
                    ((ArrayList) hm2Var.d).clear();
                    hm2Var.f();
                }
                b30 b30Var3 = recyclerView2.t0;
                b30Var3.c(recyclerView2, true);
                if (b30Var3.d != 0) {
                    try {
                        Trace.beginSection(j == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                        yw3 yw3Var = recyclerView2.u0;
                        dw3 dw3Var = recyclerView2.z;
                        yw3Var.d = 1;
                        yw3Var.e = dw3Var.a();
                        yw3Var.g = false;
                        yw3Var.h = false;
                        yw3Var.i = false;
                        for (int i8 = 0; i8 < b30Var3.d * 2; i8 += 2) {
                            c(recyclerView2, b30Var3.c[i8], j);
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
            }
            xg1Var.a = false;
            xg1Var.b = 0;
            xg1Var.c = 0;
            xg1Var.d = null;
            xg1Var.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.n;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j) + this.p);
                }
            }
        } finally {
            this.o = 0L;
            Trace.endSection();
        }
    }
}
