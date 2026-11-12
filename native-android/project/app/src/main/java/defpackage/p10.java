package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class p10 extends u10 {
    public final /* synthetic */ int n = 0;
    public final Object o;

    public p10(String str) {
        char[] charArray = str.toString().toCharArray();
        this.o = charArray;
        Arrays.sort(charArray);
    }

    @Override // defpackage.ro3
    public final boolean apply(Object obj) {
        switch (this.n) {
            case 0:
                break;
        }
        return c(((Character) obj).charValue());
    }

    @Override // defpackage.u10
    public final boolean c(char c) {
        switch (this.n) {
            case 0:
                return Arrays.binarySearch((char[]) this.o, c) >= 0;
            default:
                return !((u10) this.o).c(c);
        }
    }

    @Override // defpackage.u10
    public u10 d() {
        switch (this.n) {
            case 1:
                return (u10) this.o;
            default:
                return super.d();
        }
    }

    public final String toString() {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
                for (char c : (char[]) obj) {
                    sb.append(u10.a(c));
                }
                sb.append("\")");
                return sb.toString();
            default:
                return ((u10) obj) + ".negate()";
        }
    }

    public p10(u10 u10Var) {
        u10Var.getClass();
        this.o = u10Var;
    }
}
