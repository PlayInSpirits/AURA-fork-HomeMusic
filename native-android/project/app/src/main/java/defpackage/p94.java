package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p94 {
    public final String a;
    public final wf1 b;
    public final boolean c;

    public /* synthetic */ p94(String str) {
        this(str, new m94(8));
    }

    public final String toString() {
        return xa3.g("AccessibilityKey: ", this.a);
    }

    public p94(String str, wf1 wf1Var) {
        this.a = str;
        this.b = wf1Var;
    }

    public p94(int i, String str) {
        this(str);
        this.c = true;
    }

    public p94(String str, boolean z, wf1 wf1Var) {
        this(str, wf1Var);
        this.c = z;
    }
}
