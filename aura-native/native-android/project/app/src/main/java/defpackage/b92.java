package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b92 {
    public static final b92 n;
    public static final /* synthetic */ b92[] o;

    /* JADX INFO: Fake field, exist only in values array */
    b92 EF0;

    static {
        b92 b92Var = new b92("SYNCHRONIZED", 0);
        b92 b92Var2 = new b92("PUBLICATION", 1);
        b92 b92Var3 = new b92("NONE", 2);
        n = b92Var3;
        o = new b92[]{b92Var, b92Var2, b92Var3};
    }

    public static b92 valueOf(String str) {
        return (b92) Enum.valueOf(b92.class, str);
    }

    public static b92[] values() {
        return (b92[]) o.clone();
    }
}
