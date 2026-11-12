package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ax1 {
    public final Object a;
    public final Object b;
    public final Object c;

    public ax1(Object r1, Object r2, Object r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    public final IllegalArgumentException a() {
        StringBuilder r1 = new StringBuilder("Multiple entries with same key: ");
        Object r2 = this.a;
        r1.append(r2);
        r1.append("=");
        r1.append(this.b);
        r1.append(" and ");
        r1.append(r2);
        r1.append("=");
        r1.append(this.c);
        return new IllegalArgumentException(r1.toString());
    }
}
