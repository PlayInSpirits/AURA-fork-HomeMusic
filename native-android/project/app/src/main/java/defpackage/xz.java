package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xz {
    public static final xz n;
    public static final xz o;
    public static final xz p;
    public static final xz q;
    public static final /* synthetic */ xz[] r;

    static {
        xz xzVar = new xz("EMPTY", 0);
        n = xzVar;
        xz xzVar2 = new xz("RETRY", 1);
        o = xzVar2;
        xz xzVar3 = new xz("ACCEPTED", 2);
        p = xzVar3;
        xz xzVar4 = new xz("REFUSED", 3);
        q = xzVar4;
        r = new xz[]{xzVar, xzVar2, xzVar3, xzVar4};
    }

    public static xz valueOf(String str) {
        return (xz) Enum.valueOf(xz.class, str);
    }

    public static xz[] values() {
        return (xz[]) r.clone();
    }
}
