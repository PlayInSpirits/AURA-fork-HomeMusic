package defpackage;

import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l8 extends rw3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NestedScrollView b;

    public /* synthetic */ l8(NestedScrollView r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // defpackage.rw3
    public final void b(RecyclerView r1, int r2, int r3) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.b.scrollBy(0, r3);
        return;
    L6:
        this.b.scrollBy(0, r3);
    }
}
