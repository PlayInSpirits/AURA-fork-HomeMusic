package defpackage;

import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q72 extends Number {
    public final String n;

    public q72(String r1) {
        this.n = r1;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.n);
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof q72) == false) goto L14;
        Object r5 = ((q72) r4).n;
        String r3 = this.n;
        if (r3 != r5) goto L10;
    L13:
        return true;
    L10:
        if (r3.equals(r5) == true) goto L13;
        return false;
    L14:
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.n);
    }

    public final int hashCode() {
        return this.n.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String r2 = this.n;
        return Integer.parseInt(r2);
    L5:
        return (int) Long.parseLong(r2);
    L9:
        return new BigDecimal(r2).intValue();
    }

    @Override // java.lang.Number
    public final long longValue() {
        String r2 = this.n;
        return Long.parseLong(r2);
    L6:
        return new BigDecimal(r2).longValue();
    }

    public final String toString() {
        return this.n;
    }
}
