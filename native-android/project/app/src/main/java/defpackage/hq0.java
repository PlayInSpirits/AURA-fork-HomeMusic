package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hq0 implements Executor {
    public static final hq0 n;
    public static final /* synthetic */ hq0[] o;

    static {
        hq0 hq0Var = new hq0("INSTANCE", 0);
        n = hq0Var;
        o = new hq0[]{hq0Var};
    }

    public static hq0 valueOf(String str) {
        return (hq0) Enum.valueOf(hq0.class, str);
    }

    public static hq0[] values() {
        return (hq0[]) o.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
