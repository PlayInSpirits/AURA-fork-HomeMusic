package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public enum pr3 {
    p("http/1.0"),
    q("http/1.1"),
    r("spdy/3.1"),
    s("h2"),
    t("h2_prior_knowledge"),
    u("quic"),
    v("h3");

    public static final hh3 o = new hh3(7);
    public final String n;

    pr3(String str) {
        this.n = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.n;
    }
}
