package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tp3 {
    public static final tp3 n;
    public static final /* synthetic */ tp3[] o;

    /* JADX INFO: Fake field, exist only in values array */
    tp3 EF0;

    static {
        tp3 tp3Var = new tp3("SRGB", 0);
        tp3 tp3Var2 = new tp3("DISPLAY_P3", 1);
        n = tp3Var2;
        o = new tp3[]{tp3Var, tp3Var2};
    }

    public static tp3 valueOf(String str) {
        return (tp3) Enum.valueOf(tp3.class, str);
    }

    public static tp3[] values() {
        return (tp3[]) o.clone();
    }
}
