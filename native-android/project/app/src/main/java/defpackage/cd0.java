package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cd0 {
    public final av a;
    public final cz b;

    public cd0(av avVar, cz czVar) {
        this.a = avVar;
        this.b = czVar;
    }

    public final String toString() {
        cz czVar = this.b;
        se0 se0Var = (se0) czVar.r.K(se0.p);
        String str = se0Var != null ? se0Var.o : null;
        int iHashCode = hashCode();
        ya4.g(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        return "Request@" + string + (str != null ? xa3.h("[", str, "](") : "(") + "currentBounds()=" + this.a.invoke() + ", continuation=" + czVar + ")";
    }
}
