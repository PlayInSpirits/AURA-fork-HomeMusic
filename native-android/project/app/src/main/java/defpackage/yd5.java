package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yd5 implements ga2, fg1 {
    public final /* synthetic */ u80 a;

    public yd5(u80 r1) {
        this.a = r1;
    }

    @Override // defpackage.fg1
    public final sf1 a() {
        return new ig1(1, 0, u80.class, this.a, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;");
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof ga2) == true) goto L5;
        return false;
    L5:
        if ((r2 instanceof fg1) == true) goto L7;
        return false;
    L7:
        return a().equals(((fg1) r2).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
