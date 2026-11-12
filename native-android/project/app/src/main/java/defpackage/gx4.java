package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gx4 extends fx4 {
    public final /* synthetic */ oi a;
    public final /* synthetic */ hx4 b;

    public gx4(hx4 r1, oi r2) {
        this.b = r1;
        this.a = r2;
    }

    @Override // defpackage.bx4
    public final void c(dx4 r3) {
        ViewGroup r0 = this.b.o;
        ((ArrayList) this.a.get(r0)).remove(r3);
        r3.u(this);
    }
}
