package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sa implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ ya o;

    public /* synthetic */ sa(ya r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r5) {
        int r0 = this.n;
        ya r4 = this.o;
        switch(r0) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        p64 r6 = (p64) r5;
        if (r6.o.contains(r6) == false) goto L9;
        wb3 r1 = r4.q.getSnapshotObserver();
        sa r2 = r4.Z;
        fa r3 = new fa(1, r6, r4);
        r1.a.e(r6, r2, r3);
    L9:
        return j15.a;
    L10:
        View r7 = r4.q;
        ViewParent r8 = r7.getParent();
        return Boolean.valueOf(r8.requestSendAccessibilityEvent(r7, (AccessibilityEvent) r5));
    }
}
