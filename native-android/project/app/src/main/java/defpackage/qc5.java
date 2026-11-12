package defpackage;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qc5 {
    public final bq4 a;
    public final pq3 b;
    public final fd5 c;

    static {
        cx.i("WMFgUpdater");
    }

    public qc5(WorkDatabase workDatabase, pq3 pq3Var, bq4 bq4Var) {
        this.b = pq3Var;
        this.a = bq4Var;
        this.c = workDatabase.A();
    }
}
