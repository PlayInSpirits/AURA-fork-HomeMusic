package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cr3 {
    public static final cr3 n;
    public static final cr3 o;
    public static final cr3 p;
    public static final /* synthetic */ cr3[] q;

    static {
        cr3 cr3Var = new cr3("PASS_THROUGH", 0);
        n = cr3Var;
        cr3 cr3Var2 = new cr3("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        o = cr3Var2;
        cr3 cr3Var3 = new cr3("DISCARDING", 2);
        p = cr3Var3;
        q = new cr3[]{cr3Var, cr3Var2, cr3Var3};
    }

    public static cr3 valueOf(String str) {
        return (cr3) Enum.valueOf(cr3.class, str);
    }

    public static cr3[] values() {
        return (cr3[]) q.clone();
    }
}
