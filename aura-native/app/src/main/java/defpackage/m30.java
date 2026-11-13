package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class m30 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public m30(xi4 xi4Var) {
        xi4Var.getClass();
        this.b = xi4Var;
    }

    public final void a(we1 we1Var) {
        int i = this.a;
        Object obj = this.b;
        we1Var.getClass();
        switch (i) {
            case 0:
                we1Var.b();
                try {
                    StringBuilder sb = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
                    ((xi4) obj).getClass();
                    sb.append(System.currentTimeMillis() - 86400000);
                    sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                    we1Var.q(sb.toString());
                    we1Var.H();
                    return;
                } finally {
                    we1Var.n();
                }
            default:
                ((kl3) obj).invoke(we1Var);
                return;
        }
    }

    public m30(kl3 kl3Var) {
        this.b = kl3Var;
    }
}
