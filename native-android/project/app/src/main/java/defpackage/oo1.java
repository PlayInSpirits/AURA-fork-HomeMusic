package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.eddyizm.tempus.viewmodel.a;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oo1 extends e22 {
    public final /* synthetic */ int f;
    public int g;
    public int h;
    public int i;
    public final /* synthetic */ kc1 j;

    public oo1(wk3 r2) {
        this.f = 1;
        this.j = r2;
        super(4);
        this.g = -1;
        this.h = -1;
        this.i = -1;
    }

    private final void j(cx3 r1) {
    }

    @Override // defpackage.e22
    public final void a(RecyclerView r10, cx3 r11) {
        int r0 = this.f;
        kc1 r1 = this.j;
        switch(r0) {
            case 0: goto L17;
            default: goto L4;
        };
    L4:
        super.a(r10, r11);
        int r5 = this.g;
        if (r5 != (-1)) goto L7;
    L15:
        this.g = -1;
        this.h = -1;
        this.i = -1;
        return;
    L7:
        if (this.h == (-1)) goto L15;
        int r6 = this.i;
        if (r6 == (-1)) goto L15;
        wk3 r2 = (wk3) r1;
        bl2 r4 = r2.v0;
        List r7 = r2.w0.s;
        WeakReference r12 = bo2.a;
        if (u52.q("move", r5, r6) == true) goto L15;
        if (r4 == null) goto L15;
        r4.f(new vn2(r4, r5, r6, r7, 2), gq0.n);
        goto L15
    L17:
        super.a(r10, r11);
        po1 r3 = (po1) r1;
        a r13 = r3.C0;
        r13.c = r3.D0.q;
        this.g = -1;
        this.h = -1;
        this.i = -1;
    }

    @Override // defpackage.e22
    public final boolean h(RecyclerView r5, cx3 r6, cx3 r7) {
        int r0 = this.f;
        kc1 r2 = this.j;
        switch(r0) {
            case 0: goto L10;
            default: goto L5;
        };
    L5:
        if (this.g != (-1)) goto L7;
        this.g = r6.c();
    L7:
        this.h = r6.c();
        int r8 = r7.c();
        this.i = r8;
        Collections.swap(((wk3) r2).w0.s, this.h, r8);
        dw3 r9 = r5.getAdapter();
        int r10 = this.h;
        int r4 = this.i;
        r9.n.c(r10, r4);
        return false;
    L10:
        if (this.g != (-1)) goto L12;
        this.g = r6.c();
    L12:
        this.h = r6.c();
        int r11 = r7.c();
        this.i = r11;
        Collections.swap(((po1) r2).D0.q, this.h, r11);
        dw3 r12 = r5.getAdapter();
        Objects.requireNonNull(r12);
        int r13 = this.h;
        int r14 = this.i;
        r12.n.c(r13, r14);
        return false;
    }

    @Override // defpackage.e22
    public final void i(cx3 r5) {
        switch(this.f) {
            case 0: goto L11;
            default: goto L4;
        };
    L4:
        wk3 r4 = (wk3) this.j;
        bl2 r0 = r4.v0;
        List r6 = r4.w0.s;
        int r1 = r5.c();
        WeakReference r2 = bo2.a;
        if (u52.q("remove", r1, r1 + 1) == true) goto L9;
        if (r0 == null) goto L9;
        r0.f(new gk(r0, r1, r6, 7), gq0.n);
    L9:
        r5.s.d();
        return;
    }

    public oo1(po1 r2) {
        this.f = 0;
        this.j = r2;
        super(0);
        this.g = -1;
        this.h = -1;
        this.i = -1;
    }
}
