package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.eddyizm.tempus.helper.recyclerview.FastScrollbar;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c61 extends rw3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c61(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // defpackage.rw3
    public final void b(RecyclerView r8, int r9, int r10) {
        int r11 = this.a;
        Object r7 = this.b;
        switch(r11) {
            case 0: goto L31;
            default: goto L4;
        };
    L4:
        e61 r12 = (e61) r7;
        int r13 = r8.computeHorizontalScrollOffset();
        int r14 = r8.computeVerticalScrollOffset();
        int r15 = r12.a;
        int r0 = r12.s.computeVerticalScrollRange();
        int r1 = r12.r;
        if ((r0 - r1) <= 0) goto L8;
        if (r1 < r15) goto L8;
        boolean r2 = true;
    L9:
        r12.t = r2;
        int r3 = r12.s.computeHorizontalScrollRange();
        int r5 = r12.q;
        if ((r3 - r5) <= 0) goto L13;
        if (r5 < r15) goto L13;
        boolean r16 = true;
    L14:
        r12.u = r16;
        boolean r6 = r12.t;
        if (r6 == true) goto L21;
        if (r16 == true) goto L21;
        if (r12.v == 0) goto L33;
        r12.l(0);
        return;
    L33:
        return;
    L21:
        if (r6 == false) goto L24;
        float r4 = r1;
        r12.l = (int) ((((r4 / 2.0f) + r14) * r4) / r0);
        r12.k = Math.min(r1, (r1 * r1) / r0);
    L24:
        if (r12.u == false) goto L26;
        float r17 = r13;
        float r18 = r5;
        r12.o = (int) ((((r18 / 2.0f) + r17) * r18) / r3);
        r12.n = Math.min(r5, (r5 * r5) / r3);
    L26:
        int r19 = r12.v;
        if (r19 == 0) goto L29;
        if (r19 == 1) goto L29;
        return;
    L29:
        r12.l(1);
        return;
    L13:
        r16 = false;
    L8:
        r2 = false;
        goto L9
    L31:
        int r20 = FastScrollbar.t;
        ((FastScrollbar) r7).c();
    }
}
