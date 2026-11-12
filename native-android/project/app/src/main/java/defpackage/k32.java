package defpackage;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k32 extends h32 {
    public final Serializable n;

    public k32(Boolean bool) {
        Objects.requireNonNull(bool);
        this.n = bool;
    }

    public static boolean f(k32 k32Var) {
        Serializable serializable = k32Var.n;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // defpackage.h32
    public final String b() {
        Serializable serializable = this.n;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return e().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean d() {
        Serializable serializable = this.n;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(b());
    }

    public final Number e() {
        Serializable serializable = this.n;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new q72((String) serializable);
        }
        er1.l("Primitive is neither a number nor a string");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k32.class != obj.getClass()) {
            return false;
        }
        k32 k32Var = (k32) obj;
        Serializable serializable = k32Var.n;
        Serializable serializable2 = this.n;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (f(this) && f(k32Var)) {
            return e().longValue() == k32Var.e().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        double dDoubleValue = e().doubleValue();
        double dDoubleValue2 = k32Var.e().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.n;
        if (serializable == null) {
            return 31;
        }
        if (f(this)) {
            jDoubleToLongBits = e().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(e().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public k32(Number number) {
        Objects.requireNonNull(number);
        this.n = number;
    }

    public k32(String str) {
        Objects.requireNonNull(str);
        this.n = str;
    }
}
