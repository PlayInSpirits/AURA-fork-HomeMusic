package defpackage;

import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oa extends ig1 implements xf1 {
    @Override // defpackage.xf1
    public final Object a(Object obj, Object obj2, Object obj3) {
        if (obj != null) {
            kf2.k();
            return null;
        }
        ra raVar = (ra) this.receiver;
        Resources resources = raVar.getContext().getResources();
        return Boolean.valueOf(bb.a.a(raVar, null, new t70(new ro0(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((qf4) obj2).a, (if1) obj3)));
    }
}
