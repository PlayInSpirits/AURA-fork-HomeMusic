package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ht1 implements a83, fg1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ if1 b;

    public /* synthetic */ ht1(if1 r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // defpackage.fg1
    public final sf1 a() {
        int r0 = this.a;
        return this.b;
    }

    @Override // defpackage.a83
    public final /* synthetic */ void b(Object r2) {
        int r0 = this.a;
        if1 r1 = this.b;
        switch(r0) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        r1.invoke(r2);
        return;
    L6:
        r1.invoke(r2);
        return;
    L8:
        r1.invoke(r2);
    }

    public final boolean equals(Object r3) {
        int r0 = this.a;
        if1 r2 = this.b;
        switch(r0) {
            case 0: goto L17;
            case 1: goto L11;
            default: goto L5;
        };
    L5:
        if ((r3 instanceof a83) == true) goto L7;
        return false;
    L7:
        if ((r3 instanceof fg1) == true) goto L9;
        return false;
    L9:
        return r2.equals(((fg1) r3).a());
    L11:
        if ((r3 instanceof a83) == true) goto L13;
        return false;
    L13:
        if ((r3 instanceof fg1) == true) goto L15;
        return false;
    L15:
        return r2.equals(((fg1) r3).a());
    L17:
        if ((r3 instanceof a83) == true) goto L19;
        return false;
    L19:
        if ((r3 instanceof fg1) == true) goto L21;
        return false;
    L21:
        return r2.equals(((fg1) r3).a());
    }

    public final int hashCode() {
        int r0 = this.a;
        if1 r1 = this.b;
        switch(r0) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return r1.hashCode();
    L7:
        return r1.hashCode();
    L9:
        return r1.hashCode();
    }
}
