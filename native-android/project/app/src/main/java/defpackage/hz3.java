package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hz3 {
    public static final hz3 n;
    public static final hz3 o;
    public static final /* synthetic */ hz3[] p;

    static {
        hz3 hz3Var = new hz3("Restart", 0);
        n = hz3Var;
        hz3 hz3Var2 = new hz3("Reverse", 1);
        o = hz3Var2;
        p = new hz3[]{hz3Var, hz3Var2};
    }

    public static hz3 valueOf(String str) {
        return (hz3) Enum.valueOf(hz3.class, str);
    }

    public static hz3[] values() {
        return (hz3[]) p.clone();
    }
}
