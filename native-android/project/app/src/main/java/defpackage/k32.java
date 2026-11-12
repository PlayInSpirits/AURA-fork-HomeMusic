package defpackage;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k32 extends h32 {
    public final Serializable n;

    public k32(Boolean r1) {
        Objects.requireNonNull(r1);
        this.n = r1;
    }

    public static boolean f(k32 r1) {
        Serializable r2 = r1.n;
        if ((r2 instanceof Number) == false) goto L16;
        Number r3 = (Number) r2;
        if ((r3 instanceof BigInteger) == false) goto L7;
        return true;
    L7:
        if ((r3 instanceof Long) == false) goto L9;
        return true;
    L9:
        if ((r3 instanceof Integer) == false) goto L11;
        return true;
    L11:
        if ((r3 instanceof Short) == false) goto L13;
        return true;
    L13:
        if ((r3 instanceof Byte) == false) goto L22;
        return true;
    L22:
        return false;
    L16:
        return false;
    }

    @Override // defpackage.h32
    public final String b() {
        Serializable r0 = this.n;
        if ((r0 instanceof String) == false) goto L7;
        return (String) r0;
    L7:
        if ((r0 instanceof Number) == false) goto L11;
        return e().toString();
    L11:
        if ((r0 instanceof Boolean) == false) goto L15;
        return ((Boolean) r0).toString();
    L15:
        throw new AssertionError("Unexpected value type: " + r0.getClass());
    }

    public final boolean d() {
        Serializable r0 = this.n;
        if ((r0 instanceof Boolean) == false) goto L7;
        return ((Boolean) r0).booleanValue();
    L7:
        return Boolean.parseBoolean(b());
    }

    public final Number e() {
        Serializable r1 = this.n;
        if ((r1 instanceof Number) == false) goto L7;
        return (Number) r1;
    L7:
        if ((r1 instanceof String) == true) goto L9;
        er1.l("Primitive is neither a number nor a string");
        return null;
    L9:
        return new q72((String) r1);
    }

    public final boolean equals(Object r4) {
        if (this == r4) goto L36;
        if (r4 != null) goto L6;
        return false;
    L6:
        if (k32.class != r4.getClass()) goto L43;
        k32 r5 = (k32) r4;
        Serializable r0 = r5.n;
        Serializable r1 = this.n;
        if (r1 != null) goto L13;
        if (r0 != null) goto L39;
        return true;
    L39:
        return false;
    L13:
        if (f(this) == false) goto L20;
        if (f(r5) == false) goto L20;
        if (e().longValue() != r5.e().longValue()) goto L40;
        return true;
    L40:
        return false;
    L20:
        if ((r1 instanceof Number) == false) goto L32;
        if ((r0 instanceof Number) == false) goto L32;
        double r2 = e().doubleValue();
        double r3 = r5.e().doubleValue();
        if (r2 != r3) goto L26;
        return true;
    L26:
        if (Double.isNaN(r2) == true) goto L28;
        return false;
    L28:
        if (Double.isNaN(r3) == false) goto L42;
        return true;
    L42:
        return false;
    L32:
        return r1.equals(r0);
    L43:
        return false;
    L36:
        return true;
    }

    public final int hashCode() {
        Serializable r0 = this.n;
        if (r0 != null) goto L7;
        return 31;
    L7:
        if (f(this) == false) goto L12;
        long r1 = e().longValue();
    L10:
        return (int) (r1 ^ (r1 >>> 32));
    L12:
        if ((r0 instanceof Number) == false) goto L15;
        r1 = Double.doubleToLongBits(e().doubleValue());
        goto L10
    L15:
        return r0.hashCode();
    }

    public k32(Number r1) {
        Objects.requireNonNull(r1);
        this.n = r1;
    }

    public k32(String r1) {
        Objects.requireNonNull(r1);
        this.n = r1;
    }
}
