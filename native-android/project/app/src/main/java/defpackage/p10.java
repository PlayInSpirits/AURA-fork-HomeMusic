package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class p10 extends u10 {
    public final /* synthetic */ int n;
    public final Object o;

    public p10(String r2) {
        this.n = 0;
        char[] r3 = r2.toString().toCharArray();
        this.o = r3;
        Arrays.sort(r3);
    }

    @Override // defpackage.ro3
    public final boolean apply(Object r2) {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return c(((Character) r2).charValue());
    L7:
        return c(((Character) r2).charValue());
    }

    @Override // defpackage.u10
    public final boolean c(char r2) {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return !((u10) this.o).c(r2);
    L7:
        if (Arrays.binarySearch((char[]) this.o, r2) < 0) goto L9;
        return true;
    L9:
        return false;
    }

    @Override // defpackage.u10
    public u10 d() {
        switch(this.n) {
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return super.d();
    L7:
        return (u10) this.o;
    }

    public final String toString() {
        int r0 = this.n;
        Object r4 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        StringBuilder r1 = new StringBuilder("CharMatcher.anyOf(\"");
        char[] r5 = (char[]) r4;
        int r2 = r5.length;
        int r3 = 0;
    L7:
        if (r3 >= r2) goto L9;
        r1.append(u10.a(r5[r3]));
        r3 = r3 + 1;
        goto L7
    L9:
        r1.append("\")");
        return r1.toString();
    L5:
        return ((u10) r4) + ".negate()";
    }

    public p10(u10 r2) {
        this.n = 1;
        r2.getClass();
        this.o = r2;
    }
}
