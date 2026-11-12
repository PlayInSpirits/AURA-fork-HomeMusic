package defpackage;

import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l8 extends rw3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NestedScrollView b;

    public /* synthetic */ l8(NestedScrollView nestedScrollView, int i) {
        this.a = i;
        this.b = nestedScrollView;
    }

    @Override // defpackage.rw3
    public final void b(RecyclerView recyclerView, int i, int i2) {
        switch (this.a) {
            case 0:
                this.b.scrollBy(0, i2);
                break;
            default:
                this.b.scrollBy(0, i2);
                break;
        }
    }
}
