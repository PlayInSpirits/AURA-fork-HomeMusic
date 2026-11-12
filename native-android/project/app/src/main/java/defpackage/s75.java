package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s75 {
    public final WeakReference a;

    public s75(View r2) {
        this.a = new WeakReference(r2);
    }

    public final void a(float r1) {
        View r0 = (View) this.a.get();
        if (r0 == null) goto L6;
        r0.animate().alpha(r1);
        return;
    }

    public final void b() {
        View r0 = (View) this.a.get();
        if (r0 == null) goto L6;
        r0.animate().cancel();
        return;
    }

    public final void c(long r1) {
        View r0 = (View) this.a.get();
        if (r0 == null) goto L6;
        r0.animate().setDuration(r1);
        return;
    }

    public final void d(u75 r4) {
        View r3 = (View) this.a.get();
        if (r3 == null) goto L9;
        if (r4 == null) goto L7;
        r3.animate().setListener(new kw0(2, r3, r4));
        return;
    L7:
        r3.animate().setListener(null);
        return;
    }

    public final void e(float r1) {
        View r0 = (View) this.a.get();
        if (r0 == null) goto L6;
        r0.animate().translationY(r1);
        return;
    }
}
