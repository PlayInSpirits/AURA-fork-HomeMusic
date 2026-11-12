package defpackage;

import android.database.Observable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ew3 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        int r0 = ((Observable) this).mObservers.size() - 1;
    L3:
        if (r0 < 0) goto L5;
        ((fw3) ((Observable) this).mObservers.get(r0)).a();
        r0 = r0 - 1;
        goto L3
    }

    public final void c(int r3, int r4) {
        int r0 = ((Observable) this).mObservers.size() - 1;
    L3:
        if (r0 < 0) goto L5;
        ((fw3) ((Observable) this).mObservers.get(r0)).d(r3, r4);
        r0 = r0 - 1;
        goto L3
    }

    public final void d(int r3, int r4, Object r5) {
        int r0 = ((Observable) this).mObservers.size() - 1;
    L3:
        if (r0 < 0) goto L5;
        ((fw3) ((Observable) this).mObservers.get(r0)).b(r3, r4, r5);
        r0 = r0 - 1;
        goto L3
    }

    public final void e(int r3, int r4) {
        int r0 = ((Observable) this).mObservers.size() - 1;
    L3:
        if (r0 < 0) goto L5;
        ((fw3) ((Observable) this).mObservers.get(r0)).c(r3, r4);
        r0 = r0 - 1;
        goto L3
    }

    public final void f(int r3, int r4) {
        int r0 = ((Observable) this).mObservers.size() - 1;
    L3:
        if (r0 < 0) goto L5;
        ((fw3) ((Observable) this).mObservers.get(r0)).e(r3, r4);
        r0 = r0 - 1;
        goto L3
    }

    public final void g() {
        int r0 = ((Observable) this).mObservers.size() - 1;
    L3:
        if (r0 < 0) goto L5;
        ((fw3) ((Observable) this).mObservers.get(r0)).f();
        r0 = r0 - 1;
        goto L3
    }
}
