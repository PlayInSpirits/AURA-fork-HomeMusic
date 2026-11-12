package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m30 {
    public final /* synthetic */ int a;
    public final Object b;

    public m30(xi4 r2) {
        this.a = 0;
        r2.getClass();
        this.b = r2;
    }

    public final void a(we1 r6) {
        int r0 = this.a;
        Object r5 = this.b;
        r6.getClass();
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((kl3) r5).invoke(r6);
        return;
    L6:
        r6.b();
        StringBuilder r1 = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");     // Catch: Throwable -> L10
        ((xi4) r5).getClass();     // Catch: Throwable -> L10
        r1.append(System.currentTimeMillis() - 86400000);     // Catch: Throwable -> L10
        r1.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");     // Catch: Throwable -> L10
        r6.q(r1.toString());     // Catch: Throwable -> L10
        r6.H();     // Catch: Throwable -> L10
        r6.n();
        return;
    L10:
        th = move-exception;
        r6.n();
        throw th;
    }

    public m30(kl3 r2) {
        this.a = 1;
        this.b = r2;
    }
}
