package defpackage;

import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s65 extends ig1 implements if1 {
    public static final s65 n = null;

    static {
        n = new s65(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // defpackage.if1
    public final Object invoke(Object r1) {
        return ((ViewParent) r1).getParent();
    }
}
