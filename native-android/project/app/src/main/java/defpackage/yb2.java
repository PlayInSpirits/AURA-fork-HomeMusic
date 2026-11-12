package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yb2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ bc2 o;

    public /* synthetic */ yb2(bc2 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        bc2 r2 = this.o;
        switch(r0) {
            case 0: goto L14;
            default: goto L4;
        };
    L4:
        cx0 r1 = r2.p;
        if (r1 != null) goto L7;
        return;
    L7:
        if (r1.isAttachedToWindow() == true) goto L9;
        return;
    L9:
        if (r2.p.getCount() > r2.p.getChildCount()) goto L11;
        return;
    L11:
        if (r2.p.getChildCount() > r2.z) goto L21;
        r2.M.setInputMethodMode(2);
        r2.f();
        return;
    L21:
        return;
    L14:
        cx0 r3 = r2.p;
        if (r3 == null) goto L22;
        r3.setListSelectionHidden(true);
        r3.requestLayout();
        return;
    }
}
