package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fq0 implements Executor {
    public static final fq0 n;
    public static final /* synthetic */ fq0[] o;

    static {
        fq0 fq0Var = new fq0("INSTANCE", 0);
        n = fq0Var;
        o = new fq0[]{fq0Var};
    }

    public static fq0 valueOf(String str) {
        return (fq0) Enum.valueOf(fq0.class, str);
    }

    public static fq0[] values() {
        return (fq0[]) o.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
