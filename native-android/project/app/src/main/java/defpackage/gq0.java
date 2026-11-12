package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gq0 implements Executor {
    public static final gq0 n;
    public static final /* synthetic */ gq0[] o;

    static {
        gq0 gq0Var = new gq0("INSTANCE", 0);
        n = gq0Var;
        o = new gq0[]{gq0Var};
    }

    public static gq0 valueOf(String str) {
        return (gq0) Enum.valueOf(gq0.class, str);
    }

    public static gq0[] values() {
        return (gq0[]) o.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
