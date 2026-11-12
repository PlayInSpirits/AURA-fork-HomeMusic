package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hf2 {
    public static final hf2 n;
    public static final hf2 o;
    public static final hf2 p;
    public static final /* synthetic */ hf2[] q;

    static {
        hf2 hf2Var = new hf2("IsPlacedInLookahead", 0);
        n = hf2Var;
        hf2 hf2Var2 = new hf2("IsPlacedInApproach", 1);
        o = hf2Var2;
        hf2 hf2Var3 = new hf2("IsNotPlaced", 2);
        p = hf2Var3;
        q = new hf2[]{hf2Var, hf2Var2, hf2Var3};
    }

    public static hf2 valueOf(String str) {
        return (hf2) Enum.valueOf(hf2.class, str);
    }

    public static hf2[] values() {
        return (hf2[]) q.clone();
    }
}
