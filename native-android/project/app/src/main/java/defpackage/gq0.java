package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum gq0 extends Enum implements Executor {
    public static final gq0 n = null;
    public static final /* synthetic */ gq0[] o = null;

    static {
        gq0 r0 = new gq0("INSTANCE", 0);
        n = r0;
        o = new gq0[]{r0};
    }

    public static gq0 valueOf(String r1) {
        return (gq0) Enum.valueOf(gq0.class, r1);
    }

    public static gq0[] values() {
        return (gq0[]) o.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r1) {
        r1.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
