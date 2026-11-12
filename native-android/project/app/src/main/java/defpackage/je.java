package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum je extends Enum {
    public static final je n = null;
    public static final je o = null;
    public static final je p = null;
    public static final je q = null;
    public static final je r = null;
    public static final je s = null;
    public static final je t = null;
    public static final /* synthetic */ je[] u = null;

    static {
        je r0 = new je("Paragraph", 0);
        n = r0;
        je r1 = new je("Span", 1);
        o = r1;
        je r2 = new je("VerbatimTts", 2);
        p = r2;
        je r3 = new je("Url", 3);
        q = r3;
        je r4 = new je("Link", 4);
        r = r4;
        je r5 = new je("Clickable", 5);
        s = r5;
        je r6 = new je("String", 6);
        t = r6;
        u = new je[]{r0, r1, r2, r3, r4, r5, r6};
    }

    public static je valueOf(String r1) {
        return (je) Enum.valueOf(je.class, r1);
    }

    public static je[] values() {
        return (je[]) u.clone();
    }
}
