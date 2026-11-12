package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
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
    public static final Pattern v = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] w = new String[128];
    public static final String[] x;
    public final Writer n;
    public int[] o;
    public int p;
    public final String q;
    public boolean r;
    public boolean s;
    public String t;
    public boolean u;

    static {
        for (int i = 0; i <= 31; i++) {
            w[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = w;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        x = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public q32(Writer writer) {
        int[] iArr = new int[32];
        this.o = iArr;
        this.p = 0;
        if (iArr.length == 0) {
            this.o = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.o;
        int i = this.p;
        this.p = i + 1;
        iArr2[i] = 6;
        this.q = ":";
        this.u = true;
        Objects.requireNonNull(writer, "out == null");
        this.n = writer;
    }

    public q32 F() throws IOException {
        if (this.t != null) {
            if (!this.u) {
                this.t = null;
                return this;
            }
            Y();
        }
        b();
        this.n.write("null");
        return this;
    }

    public final int H() {
        int i = this.p;
        if (i != 0) {
            return this.o[i - 1];
        }
        kf2.o("JsonWriter is closed.");
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    public final void J(String str) throws IOException {
        String str2;
        String[] strArr = this.s ? x : w;
        Writer writer = this.n;
        writer.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        writer.write(str, i, i2 - i);
                    }
                    writer.write(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                    writer.write(str, i, i2 - i);
                }
                writer.write(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            writer.write(str, i, length - i);
        }
        writer.write(34);
    }

    public void K(double d) throws IOException {
        Y();
        if (this.r || !(Double.isNaN(d) || Double.isInfinite(d))) {
            b();
            this.n.append((CharSequence) Double.toString(d));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
    }

    public void M(long j) throws IOException {
        Y();
        b();
        this.n.write(Long.toString(j));
    }

    public void R(Boolean bool) throws IOException {
        if (bool == null) {
            F();
            return;
        }
        Y();
        b();
        this.n.write(bool.booleanValue() ? "true" : "false");
    }

    public void T(Number number) throws IOException {
        if (number == null) {
            F();
            return;
        }
        Y();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !v.matcher(string).matches()) {
                tb4.h("String created by ", cls, " is not a valid JSON number: ", string);
                return;
            }
        } else if (!this.r) {
            kf2.n("Numeric values must be finite, but was ".concat(string));
            return;
        }
        b();
        this.n.append((CharSequence) string);
    }

    public void W(String str) throws IOException {
        if (str == null) {
            F();
            return;
        }
        Y();
        b();
        J(str);
    }

    public void X(boolean z) throws IOException {
        Y();
        b();
        this.n.write(z ? "true" : "false");
    }

    public final void Y() throws IOException {
        if (this.t != null) {
            int iH = H();
            if (iH == 5) {
                this.n.write(44);
            } else if (iH != 3) {
                kf2.o("Nesting problem.");
                return;
            }
            v();
            this.o[this.p - 1] = 4;
            J(this.t);
            this.t = null;
        }
    }

    public final void b() throws IOException {
        int iH = H();
        if (iH == 1) {
            this.o[this.p - 1] = 2;
            v();
            return;
        }
        Writer writer = this.n;
        if (iH == 2) {
            writer.append(',');
            v();
            return;
        }
        if (iH == 4) {
            writer.append((CharSequence) this.q);
            this.o[this.p - 1] = 5;
            return;
        }
        if (iH != 6) {
            if (iH != 7) {
                kf2.o("Nesting problem.");
                return;
            } else if (!this.r) {
                kf2.o("JSON must have only one top-level value.");
                return;
            }
        }
        this.o[this.p - 1] = 7;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.n.close();
        int i = this.p;
        if (i > 1 || (i == 1 && this.o[i - 1] != 7)) {
            mj0.i("Incomplete document");
        } else {
            this.p = 0;
        }
    }

    public void f() throws IOException {
        Y();
        b();
        int i = this.p;
        int[] iArr = this.o;
        if (i == iArr.length) {
            this.o = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.o;
        int i2 = this.p;
        this.p = i2 + 1;
        iArr2[i2] = 1;
        this.n.write(91);
    }

    public void flush() throws IOException {
        if (this.p != 0) {
            this.n.flush();
        } else {
            kf2.o("JsonWriter is closed.");
        }
    }

    public void j() throws IOException {
        Y();
        b();
        int i = this.p;
        int[] iArr = this.o;
        if (i == iArr.length) {
            this.o = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.o;
        int i2 = this.p;
        this.p = i2 + 1;
        iArr2[i2] = 3;
        this.n.write(123);
    }

    public final void n(int i, int i2, char c) throws IOException {
        int iH = H();
        if (iH != i2 && iH != i) {
            kf2.o("Nesting problem.");
            return;
        }
        if (this.t != null) {
            nz2.x(this.t, "Dangling name: ");
            return;
        }
        this.p--;
        if (iH == i2) {
            v();
        }
        this.n.write(c);
    }

    public void q() throws IOException {
        n(1, 2, ']');
    }

    public void s() throws IOException {
        n(3, 5, '}');
    }

    public void u(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.t != null) {
            tb4.a();
        } else if (this.p != 0) {
            this.t = str;
        } else {
            kf2.o("JsonWriter is closed.");
        }
    }

    public final void v() {
    }
}
