package defpackage;

import android.view.View;
import android.view.ViewGroup;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zd5 {
    public static final ViewGroup.LayoutParams a = null;

    static {
        a = new ViewGroup.LayoutParams(-2, -2);
    }

    public static final wd5 a(b0 r7, h80 r8, r70 r9) {
        wd5 r3 = null;
        if (zi1.a.compareAndSet(false, true) == false) goto L13;
        aw r0 = su3.a(1, 6, null);
        fu.G(te5.a((ne0) bd.z.getValue()), null, null, new r(r0, null), 3);
        x r4 = new x(13, r0);
        Object r1 = jh4.c;
        monitor-enter(r1);
        jh4.i = q40.F0(r4, jh4.i);     // Catch: Throwable -> L9
        monitor-exit(r1);
        jh4.a();
    L9:
        th = move-exception;
        throw th;
    L13:
        if (r7.getChildCount() <= 0) goto L21;
        View r2 = r7.getChildAt(0);
        if ((r2 instanceof ra) == false) goto L17;
        ra r5 = (ra) r2;
    L18:
        if (r5 == null) goto L20;
        r5.setComposeViewContext(r8);
    L22:
        if (r5 != null) goto L24;
        r5 = new ra(r7.getContext(), r8);
        r7.addView(r5.getView(), a);
    L24:
        r5.setComposeViewContext(r8);
        if (r7.getComposeViewContext$ui() == null) goto L27;
        r8.e();
        r5.setComposeViewContextIncrementedDuringInit$ui(true);
    L27:
        Object r6 = r5.getTag(R.id.wrapped_composition_tag);
        if ((r6 instanceof wd5) == false) goto L30;
        r3 = (wd5) r6;
    L30:
        if (r3 != null) goto L32;
        r3 = new wd5(r5, new z80(r8.c(), new d15(r5.getRoot())));
        r5.setTag(R.id.wrapped_composition_tag, r3);
    L32:
        r3.c(r9);
        r5.setFrameEndScheduler$ui(new yd5(r8.c()));
        return r3;
    L20:
        r5 = null;
        goto L22
    L17:
        r5 = null;
        goto L18
    L21:
        r7.removeAllViews();
        goto L20
    }
}
