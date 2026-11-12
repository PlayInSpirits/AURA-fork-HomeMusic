package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ic5 {
    public static final w03 a = null;

    static {
        long[] r0 = v54.a;
        a = new w03();
    }

    public static final u80 a(View r1) {
        Object r2 = r1.getTag(R.id.androidx_compose_ui_view_composition_context);
        if ((r2 instanceof u80) == true) goto L5;
        return null;
    L5:
        return (u80) r2;
    }

    public static final tv3 b(View r10) {
        if (r10.isAttachedToWindow() == true) goto L5;
        cz1.b("Cannot locate windowRecomposer; View " + r10 + " is not attached to a window");
    L5:
        Object r0 = au0.z(r10);
    L7:
        if ((r0 instanceof View) == false) goto L12;
        View r1 = (View) r0;
        if (r1.getId() == 16908290) goto L12;
        r0 = r1.getParent();
        r10 = r1;
    L12:
        u80 r2 = a(r10);
        vd0 r3 = null;
        if (r2 != null) goto L55;
        ((ec5) fc5.a.get()).getClass();
        ne0 r4 = q01.n;
        rp4 r5 = bd.z;
        if (Looper.myLooper() != Looper.getMainLooper()) goto L17;
        ne0 r6 = (ne0) bd.z.getValue();
    L19:
        ne0 r7 = r6.J(r4);
        ed r8 = (ed) r7.K(rv2.p);
        if (r8 == null) goto L29;
        ed r9 = new ed(r8);
        ll r11 = (ll) r9.p;
        Object r12 = r11.p;
        monitor-enter(r12);
        r11.o = false;     // Catch: Throwable -> L26
        monitor-exit(r12);
    L30:
        jx3 r13 = new jx3();
        ne0 r14 = (qx2) r7.K(rv2.q);
        if (r14 != null) goto L33;
        r14 = new rx2(r10.getContext().getApplicationContext());
        r13.n = r14;
    L33:
        if (r9 == null) goto L35;
        r4 = r9;
    L35:
        ne0 r15 = r7.J(r4).J(r14);
        tv3 r16 = new tv3(r15);
        Object r17 = r16.c;
        monitor-enter(r17);
        r16.t = true;     // Catch: Throwable -> L49
        monitor-exit(r17);
        td0 r18 = te5.a(r15);
        ba2 r19 = j51.u(r10);
        if (r19 == null) goto L43;
        ea2 r20 = r19.h();
    L44:
        if (r20 == null) goto L47;
        r10.addOnAttachStateChangeListener(new vc1(2, r10, r16));
        r20.a(new ed1(r18, r9, r16, r13));
        r10.setTag(R.id.androidx_compose_ui_view_composition_context, r16);
        xi1 r21 = xi1.n;
        Handler r22 = r10.getHandler();
        int r23 = gl1.a;
        r10.addOnAttachStateChangeListener(new bc(8, fu.G(r21, new fl1(r22, "windowRecomposer cleanup", false).s, null, new p(r16, r10, r3, 19), 2)));
        return r16;
    L47:
        cz1.c("ViewTreeLifecycleOwner not found from " + r10);
        er1.a();
        return null;
    L43:
        r20 = null;
    L49:
        th = move-exception;
        throw th;
    L26:
        th = move-exception;
        throw th;
    L29:
        r9 = null;
        goto L30
    L17:
        r6 = (ne0) bd.A.get();
        if (r6 != null) goto L19;
        kf2.o("no AndroidUiDispatcher for this thread");
        return null;
    L55:
        if ((r2 instanceof tv3) == true) goto L57;
        kf2.o("root viewTreeParentCompositionContext is not a Recomposer");
        return null;
    L57:
        return (tv3) r2;
    }
}
