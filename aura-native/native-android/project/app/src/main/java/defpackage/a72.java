package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a72 {
    public static final a72 n;
    public static final a72 o;
    public static final a72 p;
    public static final /* synthetic */ a72[] q;

    static {
        a72 a72Var = new a72("InMeasureBlock", 0);
        n = a72Var;
        a72 a72Var2 = new a72("InLayoutBlock", 1);
        o = a72Var2;
        a72 a72Var3 = new a72("NotUsed", 2);
        p = a72Var3;
        q = new a72[]{a72Var, a72Var2, a72Var3};
    }

    public static a72 valueOf(String str) {
        return (a72) Enum.valueOf(a72.class, str);
    }

    public static a72[] values() {
        return (a72[]) q.clone();
    }
}
