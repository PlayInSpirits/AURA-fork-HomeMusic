package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class yd5 implements ga2, fg1 {
    public final /* synthetic */ u80 a;

    public yd5(u80 u80Var) {
        this.a = u80Var;
    }

    @Override // defpackage.fg1
    public final sf1 a() {
        return new ig1(1, 0, u80.class, this.a, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;");
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ga2) && (obj instanceof fg1)) {
            return a().equals(((fg1) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
