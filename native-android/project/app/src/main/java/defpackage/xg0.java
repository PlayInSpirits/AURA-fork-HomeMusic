package defpackage;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class xg0 extends pw3 {
    public RecyclerView a;
    public Scroller b;
    public final ah4 c;
    public final /* synthetic */ int d;
    public ib3 e;
    public ib3 f;

    public xg0(int r1) {
        this.d = r1;
        this.c = new ah4(this);
    }

    public static int c(View r1, qz0 r2) {
        int r0 = r2.g(r1);
        int r3 = (r2.e(r1) / 2) + r0;
        int r4 = r2.m();
        return r3 - ((r2.n() / 2) + r4);
    }

    public static View e(mw3 r8, qz0 r9) {
        int r0 = r8.v();
        View r1 = null;
        if (r0 != 0) goto L5;
        return null;
    L5:
        int r2 = r9.m();
        int r3 = (r9.n() / 2) + r2;
        int r4 = Integer.MAX_VALUE;
        int r5 = 0;
    L6:
        if (r5 >= r0) goto L11;
        View r6 = r8.u(r5);
        int r7 = r9.g(r6);
        int r10 = Math.abs(((r9.e(r6) / 2) + r7) - r3);
        if (r10 >= r4) goto L10;
        r1 = r6;
        r4 = r10;
    L10:
        r5 = r5 + 1;
        goto L6
    L11:
        return r1;
    }

    public static View f(mw3 r8, qz0 r9) {
        int r0 = r8.v();
        View r1 = null;
        if (r0 != 0) goto L5;
        return null;
    L5:
        int r2 = r9.m();
        int r3 = (r9.n() / 2) + r2;
        int r4 = Integer.MAX_VALUE;
        int r5 = 0;
    L6:
        if (r5 >= r0) goto L11;
        View r6 = r8.u(r5);
        int r7 = r9.g(r6);
        int r10 = Math.abs(((r9.e(r6) / 2) + r7) - r3);
        if (r10 >= r4) goto L10;
        r1 = r6;
        r4 = r10;
    L10:
        r5 = r5 + 1;
        goto L6
    L11:
        return r1;
    }

    public final void a(RecyclerView r4) {
        RecyclerView r0 = this.a;
        if (r0 == r4) goto L20;
        ah4 r1 = this.c;
        if (r0 == null) goto L11;
        ArrayList r2 = r0.w0;
        if (r2 == null) goto L10;
        r2.remove(r1);
    L10:
        this.a.setOnFlingListener(null);
    L11:
        this.a = r4;
        if (r4 != null) goto L14;
        return;
    L14:
        if (r4.getOnFlingListener() != null) goto L17;
        this.a.j(r1);
        this.a.setOnFlingListener(this);
        this.b = new Scroller(this.a.getContext(), new DecelerateInterpolator());
        l();
        return;
    L17:
        kf2.o("An instance of OnFlingListener already set.");
        return;
    }

    public final int[] b(mw3 r8, View r9) {
        switch(this.d) {
            case 0: goto L13;
            default: goto L4;
        };
    L4:
        int[] r0 = new int[2];
        if (r8.d() == false) goto L7;
        r0[0] = c(r9, i(r8));
    L9:
        if (r8.e() == false) goto L11;
        r0[1] = c(r9, k(r8));
    L12:
        return r0;
    L11:
        r0[1] = 0;
        goto L12
    L7:
        r0[0] = 0;
        goto L9
    L13:
        int[] r1 = new int[2];
        if (r8.d() == false) goto L16;
        qz0 r4 = h(r8);
        int r5 = r4.g(r9);
        int r6 = (r4.e(r9) / 2) + r5;
        int r7 = r4.m();
        r1[0] = r6 - ((r4.n() / 2) + r7);
    L18:
        if (r8.e() == false) goto L20;
        qz0 r10 = j(r8);
        int r11 = r10.g(r9);
        int r12 = (r10.e(r9) / 2) + r11;
        int r13 = r10.m();
        r1[1] = r12 - ((r10.n() / 2) + r13);
    L21:
        return r1;
    L20:
        r1[1] = 0;
        goto L21
    L16:
        r1[0] = 0;
        goto L18
    }

    public int d(mw3 r11, qz0 r12, int r13, int r14) {
        this.b.fling(0, 0, r13, r14, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int[] r10 = {this.b.getFinalX(), this.b.getFinalY()};
        int r15 = r11.v();
        float r1 = 1.0f;
        if (r15 == 0) goto L23;
        View r2 = null;
        int r6 = 0;
        int r5 = Integer.MIN_VALUE;
        int r4 = Integer.MAX_VALUE;
        View r3 = null;
    L6:
        if (r6 >= r15) goto L15;
        View r7 = r11.u(r6);
        int r8 = mw3.I(r7);
        if (r8 == (-1)) goto L14;
        if (r8 >= r4) goto L12;
        r2 = r7;
        r4 = r8;
    L12:
        if (r8 <= r5) goto L14;
        r3 = r7;
        r5 = r8;
    L14:
        r6 = r6 + 1;
        goto L6
    L15:
        if (r2 == null) goto L23;
        if (r3 == null) goto L23;
        int r16 = Math.max(r12.d(r2), r12.d(r3)) - Math.min(r12.g(r2), r12.g(r3));
        if (r16 == 0) goto L23;
        r1 = (r16 * 1.0f) / ((r5 - r4) + 1);
    L23:
        if (r1 > 0.0f) goto L26;
        return 0;
    L26:
        if (Math.abs(r10[0]) <= Math.abs(r10[1])) goto L28;
        int r17 = r10[0];
    L30:
        return Math.round(r17 / r1);
    L28:
        r17 = r10[1];
        goto L30
    }

    public View g(mw3 r7) {
        switch(this.d) {
            case 0: goto L12;
            default: goto L5;
        };
    L5:
        if (r7.e() == false) goto L8;
        return f(r7, k(r7));
    L8:
        if (r7.d() == true) goto L10;
        return null;
    L10:
        return f(r7, i(r7));
    L12:
        if ((r7 instanceof LinearLayoutManager) == false) goto L25;
        LinearLayoutManager r0 = (LinearLayoutManager) r7;
        View r2 = r0.S0(0, r0.v(), true, false);
        int r5 = -1;
        if (r2 != null) goto L16;
        int r3 = -1;
    L17:
        if (r3 == 0) goto L33;
        View r4 = r0.S0(r0.v() - 1, -1, true, false);
        if (r4 == null) goto L23;
        r5 = mw3.I(r4);
    L23:
        if (r5 != (r0.D() - 1)) goto L25;
        return null;
    L33:
        return null;
    L16:
        r3 = mw3.I(r2);
    L25:
        if (r7.e() == false) goto L28;
        return e(r7, j(r7));
    L28:
        if (r7.d() == true) goto L30;
        return null;
    L30:
        return e(r7, h(r7));
    }

    public qz0 h(mw3 r3) {
        ib3 r0 = this.f;
        if (r0 != null) goto L5;
    L6:
        this.f = new ib3(r3, 0);
    L8:
        return this.f;
    L5:
        if (((mw3) r0.b) == r3) goto L8;
        goto L6
    }

    public qz0 i(mw3 r3) {
        ib3 r0 = this.f;
        if (r0 != null) goto L5;
    L6:
        this.f = new ib3(r3, 0);
    L8:
        return this.f;
    L5:
        if (((mw3) r0.b) == r3) goto L8;
        goto L6
    }

    public qz0 j(mw3 r3) {
        ib3 r0 = this.e;
        if (r0 != null) goto L5;
    L6:
        this.e = new ib3(r3, 1);
    L8:
        return this.e;
    L5:
        if (((mw3) r0.b) == r3) goto L8;
        goto L6
    }

    public qz0 k(mw3 r3) {
        ib3 r0 = this.e;
        if (r0 != null) goto L5;
    L6:
        this.e = new ib3(r3, 1);
    L8:
        return this.e;
    L5:
        if (((mw3) r0.b) == r3) goto L8;
        goto L6
    }

    public final void l() {
        RecyclerView r0 = this.a;
        if (r0 == null) goto L19;
        mw3 r1 = r0.getLayoutManager();
        if (r1 == null) goto L20;
        View r2 = g(r1);
        if (r2 == null) goto L21;
        int[] r3 = b(r1, r2);
        int r4 = r3[0];
        if (r4 == 0) goto L14;
    L17:
        this.a.l0(r4, r3[1], false);
        return;
    L14:
        if (r3[1] != 0) goto L17;
        return;
    L21:
        return;
    L20:
        return;
    }
}
