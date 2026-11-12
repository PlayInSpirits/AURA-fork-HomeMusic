package defpackage;

import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oa extends ig1 implements xf1 {
    @Override // defpackage.xf1
    public final Object a(Object r5, Object r6, Object r7) {
        if (r5 != null) goto L6;
        ra r4 = (ra) this.receiver;
        Resources r1 = r4.getContext().getResources();
        ro0 r3 = new ro0(r1.getDisplayMetrics().density, r1.getConfiguration().fontScale);
        t70 r2 = new t70(r3, ((qf4) r6).a, (if1) r7);
        return Boolean.valueOf(bb.a.a(r4, null, r2));
    L6:
        kf2.k();
        return null;
    }
}
