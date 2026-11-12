package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fe3 {
    public static final fe3 n;
    public static final /* synthetic */ fe3[] o;

    static {
        fe3 fe3Var = new fe3("CounterClockwise", 0);
        n = fe3Var;
        o = new fe3[]{fe3Var, new fe3("Clockwise", 1)};
    }

    public static fe3 valueOf(String str) {
        return (fe3) Enum.valueOf(fe3.class, str);
    }

    public static fe3[] values() {
        return (fe3[]) o.clone();
    }
}
