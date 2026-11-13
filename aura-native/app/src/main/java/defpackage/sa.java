package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class sa implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ ya o;

    public /* synthetic */ sa(ya yaVar, int i) {
        this.n = i;
        this.o = yaVar;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        int i = this.n;
        ya yaVar = this.o;
        switch (i) {
            case 0:
                View view = yaVar.q;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                p64 p64Var = (p64) obj;
                if (p64Var.o.contains(p64Var)) {
                    wb3 snapshotObserver = yaVar.q.getSnapshotObserver();
                    snapshotObserver.a.e(p64Var, yaVar.Z, new fa(1, p64Var, yaVar));
                }
                return j15.a;
        }
    }
}
