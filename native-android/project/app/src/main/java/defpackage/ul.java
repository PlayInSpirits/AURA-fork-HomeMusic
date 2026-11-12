package defpackage;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ul implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;

    public /* synthetic */ ul(q41 r1, int r2, boolean r3) {
        this.n = 3;
        this.p = r1;
        this.o = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        int r1 = 1;
        int r2 = this.o;
        Object r5 = this.p;
        switch(r0) {
            case 0: goto L24;
            case 1: goto L22;
            case 2: goto L20;
            case 3: goto L18;
            case 4: goto L10;
            case 5: goto L8;
            default: goto L4;
        };
    L4:
        SideSheetBehavior r6 = (SideSheetBehavior) r5;
        View r3 = (View) r6.C.get();
        if (r3 == null) goto L26;
        r6.z(r3, r2, false);
        return;
    L26:
        return;
    L8:
        ((au0) r5).M(r2);
        return;
    L10:
        bm2 r7 = (bm2) r5;
        qi r4 = r7.k;
        r4.remove(Integer.valueOf(r2));
        r7.l.delete(r2);
        cb4 r8 = r7.n;
        if (r8 != null) goto L13;
        return;
    L13:
        if (r8.a.f() < 5) goto L15;
        return;
    L15:
        if (r4.isEmpty() == false) goto L29;
        r7.m.postDelayed(new sl2(r7, r1), 500);
        return;
    L29:
        return;
    L18:
        q41 r9 = (q41) r5;
        nj0 r10 = r9.K;
        int r11 = ((kq) r9.n[r2].e).o;
        r10.b0(r10.a0(), 1033, new oi0(13));
        return;
    L20:
        ((ft0) r5).n.d(r2, 1, null);
        return;
    L22:
        qm r12 = (qm) ((xc5) r5).p;
        String r13 = f35.a;
        r12.b(r2);
        return;
    L24:
        ((vl) r5).b.onAudioFocusChange(r2);
    }

    public /* synthetic */ ul(int r1, int r2, Object r3) {
        this.n = r2;
        this.p = r3;
        this.o = r1;
    }
}
