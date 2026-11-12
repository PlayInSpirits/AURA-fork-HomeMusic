package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ko1 {
    public static final ko1 n;
    public static final ko1 o;
    public static final ko1 p;
    public static final /* synthetic */ ko1[] q;

    static {
        ko1 ko1Var = new ko1("NONE", 0);
        n = ko1Var;
        ko1 ko1Var2 = new ko1("PENDING", 1);
        o = ko1Var2;
        ko1 ko1Var3 = new ko1("ON_PHONE", 2);
        p = ko1Var3;
        q = new ko1[]{ko1Var, ko1Var2, ko1Var3};
    }

    public static ko1 valueOf(String str) {
        return (ko1) Enum.valueOf(ko1.class, str);
    }

    public static ko1[] values() {
        return (ko1[]) q.clone();
    }
}
