package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jb {
    public static final jb n;
    public static final jb o;
    public static final /* synthetic */ jb[] p;

    static {
        jb jbVar = new jb("SHOW_ORIGINAL", 0);
        n = jbVar;
        jb jbVar2 = new jb("SHOW_TRANSLATED", 1);
        o = jbVar2;
        p = new jb[]{jbVar, jbVar2};
    }

    public static jb valueOf(String str) {
        return (jb) Enum.valueOf(jb.class, str);
    }

    public static jb[] values() {
        return (jb[]) p.clone();
    }
}
