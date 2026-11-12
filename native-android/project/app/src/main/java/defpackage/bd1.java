package defpackage;

import android.webkit.WebView;
import com.eddyizm.tempus.homemusic.HubFragment;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bd1 extends v83 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bd1(int r1, Object r2) {
        this.d = r1;
        this.e = r2;
        super(false);
    }

    @Override // defpackage.v83
    public final void a() {
        int r0 = this.d;
        Object r2 = this.e;
        switch(r0) {
            case 0: goto L53;
            case 1: goto L42;
            case 2: goto L40;
            case 3: goto L11;
            case 4: goto L9;
            default: goto L4;
        };
    L4:
        v23 r3 = (v23) r2;
        if (r3.g.isEmpty() == true) goto L58;
        r23 r7 = r3.g();
        r7.getClass();
        r3.p(r7.u, true);
        return;
    L58:
        return;
    L9:
        ((MainActivity) r2).q();
        return;
    L11:
        HubFragment r4 = (HubFragment) r2;
        MainActivity r1 = r4.m0;
        if (r1 == null) goto L38;
        zg5 r5 = r1.V;
        if (r5 == null) goto L25;
        au r6 = (au) r5.n;
        if (r6.a == true) goto L21;
        int r8 = ((BottomSheetBehavior) r6.b).Y;
        if (r8 == 3) goto L21;
        if (r8 != 2) goto L25;
    L21:
        if (r1 == null) goto L23;
        r1.q();
        return;
    L23:
        h12.Q("activity");
        throw null;
    L25:
        WebView r9 = r4.n0;
        if (r9 != null) goto L28;
    L32:
        c(false);
        MainActivity r10 = r4.m0;
        if (r10 == null) goto L36;
        r10.i().b().a();
        return;
    L36:
        h12.Q("activity");
        throw null;
    L28:
        if (r9.canGoBack() != true) goto L32;
        WebView r11 = r4.n0;
        if (r11 == null) goto L60;
        r11.goBack();
        return;
    L60:
        return;
    L38:
        h12.Q("activity");
        throw null;
    L40:
        ((rm3) r2).z();
        return;
    L42:
        fo1 r12 = (fo1) r2;
        if (r12.a == true) goto L62;
        co1 r13 = (co1) r12.d;
        if (r13 != co1.p) goto L49;
        if (((String) r12.f) != null) goto L49;
    L50:
        r12.s(co1.o);
        return;
    L49:
        if (r13 == co1.q) goto L50;
        r12.s(co1.n);
        return;
    L62:
        return;
    L53:
        ld1 r14 = (ld1) r2;
        r14.y(true);
        if (r14.h.b == false) goto L56;
        r14.Q();
        return;
    L56:
        r14.g.b().a();
    }

    public bd1(MainActivity r2, boolean r3) {
        this.d = 4;
        this.e = r2;
        super(r3);
    }
}
