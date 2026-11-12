package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wv {
    public static final wv n;
    public static final wv o;
    public static final wv p;
    public static final /* synthetic */ wv[] q;

    static {
        wv wvVar = new wv("SUSPEND", 0);
        n = wvVar;
        wv wvVar2 = new wv("DROP_OLDEST", 1);
        o = wvVar2;
        wv wvVar3 = new wv("DROP_LATEST", 2);
        p = wvVar3;
        q = new wv[]{wvVar, wvVar2, wvVar3};
    }

    public static wv valueOf(String str) {
        return (wv) Enum.valueOf(wv.class, str);
    }

    public static wv[] values() {
        return (wv[]) q.clone();
    }
}
