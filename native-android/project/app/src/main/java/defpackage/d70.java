package defpackage;

import android.util.Log;
import android.window.OnBackInvokedDispatcher;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d70 implements w92 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ d70(int r1, Object r2, Object r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    @Override // defpackage.w92
    public final void b(ba2 r7, q92 r8) {
        int r0 = this.n;
        Object r1 = this.p;
        Object r6 = this.o;
        switch(r0) {
            case 0: goto L19;
            default: goto L4;
        };
    L4:
        rd1 r9 = (rd1) r6;
        a23 r2 = (a23) r1;
        r2.getClass();
        if (r8 != q92.ON_RESUME) goto L13;
        if (((List) r9.b().e.n.getValue()).contains(r2) == false) goto L13;
        if (rd1.n() == false) goto L11;
        Log.v("FragmentNavigator", "Marking transition complete for entry " + r2 + " due to fragment " + r7 + " view lifecycle reaching RESUMED");
    L11:
        r9.b().b(r2);
    L13:
        if (r8 == q92.ON_DESTROY) goto L15;
        return;
    L15:
        if (rd1.n() == false) goto L17;
        Log.v("FragmentNavigator", "Marking transition complete for entry " + r2 + " due to fragment " + r7 + " view lifecycle reaching DESTROYED");
    L17:
        r9.b().b(r2);
        return;
    L19:
        a93 r10 = (a93) r6;
        l70 r3 = (l70) r1;
        if (r8 != q92.ON_CREATE) goto L24;
        OnBackInvokedDispatcher r11 = n3.j(r3);
        r11.getClass();
        r10.c(r11);
        return;
    }
}
