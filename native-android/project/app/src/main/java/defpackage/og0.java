package defpackage;

import android.database.DataSetObserver;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class og0 extends DataSetObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ og0(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int r0 = this.a;
        Object r1 = this.b;
        switch(r0) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        bc2 r2 = (bc2) r1;
        if (r2.M.isShowing() == false) goto L10;
        r2.f();
        return;
    L10:
        return;
    L8:
        co4 r3 = (co4) r1;
        r3.n = true;
        r3.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        int r0 = this.a;
        Object r1 = this.b;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((bc2) r1).dismiss();
        return;
    L6:
        co4 r2 = (co4) r1;
        r2.n = false;
        r2.notifyDataSetInvalidated();
    }
}
