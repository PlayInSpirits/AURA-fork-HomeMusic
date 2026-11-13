package defpackage;

import android.database.DataSetObserver;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class og0 extends DataSetObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ og0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                co4 co4Var = (co4) obj;
                co4Var.n = true;
                co4Var.notifyDataSetChanged();
                break;
            default:
                bc2 bc2Var = (bc2) obj;
                if (bc2Var.M.isShowing()) {
                    bc2Var.f();
                    break;
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                co4 co4Var = (co4) obj;
                co4Var.n = false;
                co4Var.notifyDataSetInvalidated();
                break;
            default:
                ((bc2) obj).dismiss();
                break;
        }
    }
}
