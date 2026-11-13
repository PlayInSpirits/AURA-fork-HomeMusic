package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ob1 implements Comparable {
    public final int n;
    public final int o;
    public final String p;
    public final String q;

    public ob1(int i, int i2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.n = i;
        this.o = i2;
        this.p = str;
        this.q = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ob1 ob1Var = (ob1) obj;
        ob1Var.getClass();
        int i = this.n - ob1Var.n;
        return i == 0 ? this.o - ob1Var.o : i;
    }
}
