package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ja implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ ra o;

    public /* synthetic */ ja(ra r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r6) {
        int r0 = this.n;
        j15 r1 = j15.a;
        ra r5 = this.o;
        switch(r0) {
            case 0: goto L31;
            case 1: goto L18;
            case 2: goto L16;
            case 3: goto L14;
            case 4: goto L12;
            case 5: goto L10;
            case 6: goto L8;
            case 7: goto L6;
            default: goto L4;
        };
    L4:
        mf3 r7 = (mf3) r6;
        return r5.getPointerIconService();
    L6:
        mf3 r8 = (mf3) r6;
        return r5.getTextToolbar();
    L8:
        mf3 r9 = (mf3) r6;
        return r5.getSoftwareKeyboardController();
    L10:
        mf3 r10 = (mf3) r6;
        return r5.getTextInputService();
    L12:
        mf3 r11 = (mf3) r6;
        return r5.getInputModeManager();
    L14:
        mf3 r12 = (mf3) r6;
        return Boolean.valueOf(r5.getScrollCaptureInProgress());
    L16:
        mf3 r13 = (mf3) r6;
        return r5.getSavedStateRegistry();
    L18:
        u91 r14 = r5.getFocusOwner();
        int r15 = ((o91) r6).a;
        ey r16 = (ey) r14;
        ra r2 = (ra) r16.a;
        jx3 r3 = new jx3();
        r3.n = Boolean.FALSE;
        ba1 r4 = r16.f();
        Boolean r17 = r16.e(r15, r2.getEmbeddedViewFocusRect(), new v91(r15, r3));
        if (h12.c(r17, Boolean.TRUE) == true) goto L21;
    L23:
        if (r17 != null) goto L25;
    L30:
        return r1;
    L25:
        if (r3.n == null) goto L30;
        if (r17.booleanValue() == false) goto L30;
        ((Boolean) r3.n).getClass();
        goto L30
    L21:
        if (r4 == r16.f()) goto L23;
    L31:
        gf1 r18 = (gf1) r6;
        Handler r19 = r5.getHandler();
        if (r19 == null) goto L34;
        Looper r20 = r19.getLooper();
    L36:
        if (r20 != Looper.myLooper()) goto L38;
        r18.invoke();
    L41:
        return r1;
    L38:
        Handler r21 = r5.getHandler();
        if (r21 == null) goto L41;
        r21.post(new ga(0, r18));
        goto L41
    L34:
        r20 = null;
        goto L36
    }
}
