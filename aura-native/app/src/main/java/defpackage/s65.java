package defpackage;

import android.view.ViewParent;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class s65 extends ig1 implements if1 {
    public s65(int a0, java.lang.Class a1, java.lang.String a2, java.lang.String a3, int a4) {
        super(a0, a1, a2, a3, a4);
    }

    public static final s65 n = new s65(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        return ((ViewParent) obj).getParent();
    }
}
