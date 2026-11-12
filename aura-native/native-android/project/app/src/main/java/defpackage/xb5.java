package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xb5 implements wb5 {
    public final String b;
    public final jz1 c;
    public final jz1 d;

    public xb5(String str) {
        this.b = str;
        this.c = new jz1(str);
        this.d = new jz1(str.concat(" maximum"));
    }

    public final String toString() {
        return this.b;
    }
}
