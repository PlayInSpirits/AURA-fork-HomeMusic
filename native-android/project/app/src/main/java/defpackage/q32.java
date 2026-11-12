package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class q32 implements Closeable, Flushable {
    public static final Pattern v = null;
    public static final String[] w = null;
    public static final String[] x = null;
    public final Writer n;
    public int[] o;
    public int p;
    public final String q;
    public boolean r;
    public boolean s;
    public String t;
    public boolean u;

    static {
        v = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
        w = new String[128];
        int r0 = 0;
    L4:
        if (r0 > 31) goto L6;
        w[r0] = String.format("\\u%04x", new Object[]{Integer.valueOf(r0)});
        r0 = r0 + 1;
        goto L4
    L6:
        String[] r1 = w;
        r1[34] = "\\\"";
        r1[92] = "\\\\";
        r1[9] = "\\t";
        r1[8] = "\\b";
        r1[10] = "\\n";
        r1[13] = "\\r";
        r1[12] = "\\f";
        String[] r2 = (String[]) r1.clone();
        x = r2;
        r2[60] = "\\u003c";
        r2[62] = "\\u003e";
        r2[38] = "\\u0026";
        r2[61] = "\\u003d";
        r2[39] = "\\u0027";
    }

    public q32(Writer r4) {
        int[] r0 = new int[32];
        this.o = r0;
        this.p = 0;
        if (r0.length != 0) goto L5;
        this.o = Arrays.copyOf(r0, 0);
    L5:
        int[] r1 = this.o;
        int r2 = this.p;
        this.p = r2 + 1;
        r1[r2] = 6;
        this.q = ":";
        this.u = true;
        Objects.requireNonNull(r4, "out == null");
        this.n = r4;
    }

    public q32 F() {
        if (this.t != null) goto L5;
    L9:
        b();
        this.n.write("null");
        return this;
    L5:
        if (this.u == false) goto L7;
        Y();
        goto L9
    L7:
        this.t = null;
        return this;
    }

    public final int H() {
        int r0 = this.p;
        if (r0 != 0) goto L5;
        kf2.o("JsonWriter is closed.");
        return 0;
    L5:
        return this.o[r0 - 1];
    }

    public final void J(String r8) {
        if (this.s == false) goto L5;
        String[] r0 = x;
    L6:
        Writer r7 = this.n;
        r7.write(34);
        int r2 = r8.length();
        int r3 = 0;
        int r4 = 0;
    L7:
        if (r3 >= r2) goto L23;
        char r5 = r8.charAt(r3);
        if (r5 >= 128) goto L14;
        String r6 = r0[r5];
        if (r6 == null) goto L22;
    L19:
        if (r4 >= r3) goto L21;
        r7.write(r8, r4, r3 - r4);
    L21:
        r7.write(r6);
        r4 = r3 + 1;
    L22:
        r3 = r3 + 1;
        goto L7
    L14:
        if (r5 != 8232) goto L17;
        r6 = "\\u2028";
        goto L19
    L17:
        if (r5 != 8233) goto L22;
        r6 = "\\u2029";
        goto L19
    L23:
        if (r4 >= r2) goto L25;
        r7.write(r8, r4, r2 - r4);
    L25:
        r7.write(34);
        return;
    L5:
        r0 = w;
        goto L6
    }

    public void K(double r3) {
        Y();
        if (this.r == false) goto L5;
    L11:
        b();
        this.n.append(Double.toString(r3));
        return;
    L5:
        if (Double.isNaN(r3) == true) goto L10;
        if (Double.isInfinite(r3) == false) goto L11;
    L10:
        throw new IllegalArgumentException("Numeric values must be finite, but was " + r3);
    }

    public void M(long r1) {
        Y();
        b();
        this.n.write(Long.toString(r1));
    }

    public void R(Boolean r1) {
        if (r1 != null) goto L5;
        F();
        return;
    L5:
        Y();
        b();
        if (r1.booleanValue() == false) goto L8;
        String r2 = "true";
    L9:
        this.n.write(r2);
        return;
    L8:
        r2 = "false";
        goto L9
    }

    public void T(Number r3) {
        if (r3 != null) goto L5;
        F();
        return;
    L5:
        Y();
        String r0 = r3.toString();
        if (r0.equals("-Infinity") == true) goto L39;
        if (r0.equals("Infinity") == true) goto L39;
        if (r0.equals("NaN") == true) goto L39;
        Class<?> r4 = r3.getClass();
        if (r4 != Integer.class) goto L15;
    L40:
        b();
        this.n.append(r0);
        return;
    L15:
        if (r4 == Long.class) goto L40;
        if (r4 == Double.class) goto L40;
        if (r4 == Float.class) goto L40;
        if (r4 == Byte.class) goto L40;
        if (r4 == Short.class) goto L40;
        if (r4 == BigDecimal.class) goto L40;
        if (r4 == BigInteger.class) goto L40;
        if (r4 == AtomicInteger.class) goto L40;
        if (r4 == AtomicLong.class) goto L40;
        if (v.matcher(r0).matches() == true) goto L40;
        tb4.h("String created by ", r4, " is not a valid JSON number: ", r0);
        return;
    L39:
        if (this.r == true) goto L40;
        kf2.n("Numeric values must be finite, but was ".concat(r0));
    }

    public void W(String r1) {
        if (r1 != null) goto L5;
        F();
        return;
    L5:
        Y();
        b();
        J(r1);
    }

    public void X(boolean r1) {
        Y();
        b();
        if (r1 == false) goto L5;
        String r2 = "true";
    L6:
        this.n.write(r2);
        return;
    L5:
        r2 = "false";
        goto L6
    }

    public final void Y() {
        if (this.t == null) goto L13;
        int r0 = H();
        if (r0 != 5) goto L8;
        this.n.write(44);
    L9:
        v();
        this.o[this.p - 1] = 4;
        J(this.t);
        this.t = null;
        return;
    L8:
        if (r0 == 3) goto L9;
        kf2.o("Nesting problem.");
        return;
    }

    public final void b() {
        int r0 = H();
        if (r0 == 1) goto L24;
        Writer r3 = this.n;
        if (r0 != 2) goto L7;
        r3.append(',');
        v();
        return;
    L7:
        if (r0 != 4) goto L9;
        r3.append(this.q);
        this.o[this.p - 1] = 5;
        return;
    L9:
        if (r0 == 6) goto L18;
        if (r0 == 7) goto L12;
        kf2.o("Nesting problem.");
        return;
    L12:
        if (this.r == true) goto L18;
        kf2.o("JSON must have only one top-level value.");
        return;
    L18:
        this.o[this.p - 1] = 7;
        return;
    L24:
        this.o[this.p - 1] = 2;
        v();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.n.close();
        int r0 = this.p;
        if (r0 > 1) goto L9;
        if (r0 == 1) goto L6;
    L7:
        this.p = 0;
        return;
    L6:
        if (this.o[r0 - 1] == 7) goto L7;
    L9:
        mj0.i("Incomplete document");
    }

    public void f() {
        Y();
        b();
        int r0 = this.p;
        int[] r1 = this.o;
        if (r0 != r1.length) goto L5;
        this.o = Arrays.copyOf(r1, r0 * 2);
    L5:
        int[] r2 = this.o;
        int r3 = this.p;
        this.p = r3 + 1;
        r2[r3] = 1;
        this.n.write(91);
    }

    public void flush() {
        if (this.p == 0) goto L6;
        this.n.flush();
        return;
    L6:
        kf2.o("JsonWriter is closed.");
    }

    public void j() {
        Y();
        b();
        int r0 = this.p;
        int[] r1 = this.o;
        if (r0 != r1.length) goto L5;
        this.o = Arrays.copyOf(r1, r0 * 2);
    L5:
        int[] r2 = this.o;
        int r3 = this.p;
        this.p = r3 + 1;
        r2[r3] = 3;
        this.n.write(123);
    }

    public final void n(int r2, int r3, char r4) {
        int r0 = H();
        if (r0 == r3) goto L9;
        if (r0 == r2) goto L9;
        kf2.o("Nesting problem.");
        return;
    L9:
        if (this.t != null) goto L15;
        this.p--;
        if (r0 != r3) goto L13;
        v();
    L13:
        this.n.write(r4);
        return;
    L15:
        nz2.x(this.t, "Dangling name: ");
    }

    public void q() {
        n(1, 2, ']');
    }

    public void s() {
        n(3, 5, '}');
    }

    public void u(String r2) {
        Objects.requireNonNull(r2, "name == null");
        if (this.t == null) goto L5;
        tb4.a();
        return;
    L5:
        if (this.p == 0) goto L8;
        this.t = r2;
        return;
    L8:
        kf2.o("JsonWriter is closed.");
    }

    public final void v() {
    }
}
