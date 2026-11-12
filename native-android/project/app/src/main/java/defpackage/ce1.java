package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ce1 extends fw3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ce1(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // defpackage.fw3
    public final void a() {
        int r0 = this.a;
        Object r2 = this.b;
        switch(r0) {
            case 0: goto L10;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        ((jw) r2).r();
        return;
    L6:
        RecyclerView r3 = (RecyclerView) r2;
        r3.k(null);
        r3.u0.f = true;
        r3.a0(true);
        if (r3.r.m() == true) goto L12;
        r3.requestLayout();
        return;
    L12:
        return;
    L10:
        ((de1) r2).b(true);
    }

    @Override // defpackage.fw3
    public final void b(int r5, int r6, Object r7) {
        int r0 = this.a;
        Object r1 = this.b;
        switch(r0) {
            case 0: goto L13;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        ((jw) r1).r();
        return;
    L6:
        RecyclerView r2 = (RecyclerView) r1;
        r2.k(null);
        c6 r3 = r2.r;
        ArrayList r4 = (ArrayList) r3.c;
        if (r6 < 1) goto L16;
        r4.add(r3.o(r7, 4, r5, r6));
        r3.a |= 4;
        if (r4.size() != 1) goto L15;
        g();
        return;
    L15:
        return;
    L16:
        return;
    L13:
        a();
    }

    @Override // defpackage.fw3
    public final void c(int r5, int r6) {
        int r0 = this.a;
        Object r1 = this.b;
        switch(r0) {
            case 0: goto L13;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        ((jw) r1).r();
        return;
    L6:
        RecyclerView r2 = (RecyclerView) r1;
        r2.k(null);
        c6 r3 = r2.r;
        ArrayList r4 = (ArrayList) r3.c;
        if (r6 < 1) goto L16;
        r4.add(r3.o(null, 1, r5, r6));
        r3.a |= 1;
        if (r4.size() != 1) goto L15;
        g();
        return;
    L15:
        return;
    L16:
        return;
    L13:
        a();
    }

    @Override // defpackage.fw3
    public final void d(int r5, int r6) {
        int r0 = this.a;
        Object r1 = this.b;
        switch(r0) {
            case 0: goto L13;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        ((jw) r1).r();
        return;
    L6:
        RecyclerView r2 = (RecyclerView) r1;
        r2.k(null);
        c6 r3 = r2.r;
        ArrayList r4 = (ArrayList) r3.c;
        if (r5 == r6) goto L16;
        r4.add(r3.o(null, 8, r5, r6));
        r3.a |= 8;
        if (r4.size() != 1) goto L15;
        g();
        return;
    L15:
        return;
    L16:
        return;
    L13:
        a();
    }

    @Override // defpackage.fw3
    public final void e(int r6, int r7) {
        int r0 = this.a;
        Object r1 = this.b;
        switch(r0) {
            case 0: goto L13;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        ((jw) r1).r();
        return;
    L6:
        RecyclerView r2 = (RecyclerView) r1;
        r2.k(null);
        c6 r3 = r2.r;
        ArrayList r4 = (ArrayList) r3.c;
        if (r7 < 1) goto L16;
        r4.add(r3.o(null, 2, r6, r7));
        r3.a |= 2;
        if (r4.size() != 1) goto L15;
        g();
        return;
    L15:
        return;
    L16:
        return;
    L13:
        a();
    }

    @Override // defpackage.fw3
    public void f() {
        switch(this.a) {
            case 1: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        RecyclerView r3 = (RecyclerView) this.b;
        if (r3.q == null) goto L22;
        dw3 r0 = r3.z;
        if (r0 == null) goto L19;
        int r1 = xa3.w(r0.p);
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L20;
    L17:
        r3.requestLayout();
        return;
    L20:
        return;
    L16:
        if (r0.a() > 0) goto L17;
        return;
    L19:
        return;
    }

    public void g() {
        RecyclerView r2 = (RecyclerView) this.b;
        if (r2.G == true) goto L5;
    L8:
        r2.N = true;
        r2.requestLayout();
        return;
    L5:
        if (r2.F == false) goto L8;
        bw3 r0 = r2.v;
        WeakHashMap r1 = j65.a;
        r2.postOnAnimation(r0);
    }
}
