package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p94 {
    public final String a;
    public final wf1 b;
    public final boolean c;

    public /* synthetic */ p94(String r3) {
        this(r3, new m94(8));
    }

    public final String toString() {
        return xa3.g("AccessibilityKey: ", this.a);
    }

    public p94(String r1, wf1 r2) {
        this.a = r1;
        this.b = r2;
    }

    public p94(int r1, String r2) {
        this(r2);
        this.c = true;
    }

    public p94(String r1, boolean r2, wf1 r3) {
        this(r1, r3);
        this.c = r2;
    }
}
