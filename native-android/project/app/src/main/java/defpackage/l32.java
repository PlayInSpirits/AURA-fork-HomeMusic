package defpackage;

import com.google.gson.stream.MalformedJsonException;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class l32 implements Closeable {
    public String[] A;
    public int[] B;
    public final Reader n;
    public boolean o;
    public final char[] p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public long v;
    public int w;
    public String x;
    public int[] y;
    public int z;

    static {
        fz0.i0 = new fz0(28);
    }

    public l32(Reader r5) {
        this.o = false;
        this.p = new char[1024];
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        int[] r2 = new int[32];
        this.y = r2;
        this.z = 1;
        r2[0] = 6;
        this.A = new String[32];
        this.B = new int[32];
        Objects.requireNonNull(r5, "in == null");
        this.n = r5;
    }

    public final String F(boolean r6) {
        StringBuilder r0 = new StringBuilder("$");
        int r1 = 0;
    L3:
        int r2 = this.z;
        if (r1 >= r2) goto L28;
        int r3 = this.y[r1];
        if (r3 != 1) goto L8;
    L19:
        int r4 = this.B[r1];
        if (r6 == false) goto L25;
        if (r4 <= 0) goto L25;
        if (r1 != (r2 - 1)) goto L25;
        r4 = r4 - 1;
    L25:
        r0.append('[');
        r0.append(r4);
        r0.append(']');
    L26:
        r1 = r1 + 1;
        goto L3
    L8:
        if (r3 == 2) goto L19;
        if (r3 != 3) goto L12;
    L16:
        r0.append('.');
        String r5 = this.A[r1];
        if (r5 == null) goto L26;
        r0.append(r5);
        goto L26
    L12:
        if (r3 == 4) goto L16;
        if (r3 == 5) goto L16;
    L28:
        return r0.toString();
    }

    public String H() {
        return F(true);
    }

    public boolean J() {
        int r0 = this.u;
        if (r0 != 0) goto L6;
        r0 = n();
    L6:
        if (r0 != 2) goto L8;
        return false;
    L8:
        if (r0 != 4) goto L10;
        return false;
    L10:
        if (r0 == 17) goto L16;
        return true;
    L16:
        return false;
    }

    public final boolean K(char r2) {
        if (r2 != '\t') goto L5;
        return false;
    L5:
        if (r2 != '\n') goto L7;
        return false;
    L7:
        if (r2 != '\f') goto L9;
        return false;
    L9:
        if (r2 != '\r') goto L11;
        return false;
    L11:
        if (r2 != ' ') goto L13;
        return false;
    L13:
        if (r2 != '#') goto L15;
    L31:
        j();
        return false;
    L15:
        if (r2 != ',') goto L17;
        return false;
    L17:
        if (r2 == '/') goto L31;
        if (r2 == '=') goto L31;
        if (r2 != '{') goto L23;
        return false;
    L23:
        if (r2 != '}') goto L25;
        return false;
    L25:
        if (r2 != ':') goto L27;
        return false;
    L27:
        if (r2 == ';') goto L31;
        switch(r2) {
            case 91: goto L43;
            case 92: goto L31;
            case 93: goto L43;
            default: goto L29;
        };
    L29:
        return true;
    L43:
        return false;
    }

    final String M() {
        StringBuilder r0 = b11.t(" at line ", " column ", this.s + 1, (this.q - this.t) + 1, " path ");
        r0.append(v());
        return r0.toString();
    }

    public boolean R() {
        int r0 = this.u;
        if (r0 != 0) goto L6;
        r0 = n();
    L6:
        if (r0 != 5) goto L10;
        this.u = 0;
        int[] r1 = this.B;
        int r4 = this.z - 1;
        r1[r4] = r1[r4] + 1;
        return true;
    L10:
        if (r0 != 6) goto L13;
        this.u = 0;
        int[] r2 = this.B;
        int r5 = this.z - 1;
        r2[r5] = r2[r5] + 1;
        return false;
    L13:
        er1.j(b11.x(e0()), M(), "Expected a boolean but was ");
        return false;
    }

    public double T() {
        int r0 = this.u;
        if (r0 != 0) goto L6;
        r0 = n();
    L6:
        if (r0 != 15) goto L10;
        this.u = 0;
        int[] r1 = this.B;
        int r2 = this.z - 1;
        r1[r2] = r1[r2] + 1;
        return this.v;
    L10:
        if (r0 != 16) goto L13;
        this.x = new String(this.p, this.q, this.w);
        this.q += this.w;
    L28:
        this.u = 11;
        double r3 = Double.parseDouble(this.x);
        if (this.o == false) goto L31;
    L37:
        this.x = null;
        this.u = 0;
        int[] r4 = this.B;
        int r6 = this.z - 1;
        r4[r6] = r4[r6] + 1;
        return r3;
    L31:
        if (Double.isNaN(r3) == true) goto L36;
        if (Double.isInfinite(r3) == false) goto L37;
    L36:
        throw new MalformedJsonException("JSON forbids NaN and infinities: " + r3 + M());
    L13:
        if (r0 != 8) goto L15;
    L24:
        if (r0 != 8) goto L26;
        char r5 = '\'';
    L27:
        this.x = b0(r5);
        goto L28
    L26:
        r5 = '\"';
        goto L27
    L15:
        if (r0 == 9) goto L24;
        if (r0 != 10) goto L20;
        this.x = d0();
        goto L28
    L20:
        if (r0 == 11) goto L28;
        er1.j(b11.x(e0()), M(), "Expected a double but was ");
        return 0.0d;
    }

    public int W() {
        int r0 = this.u;
        if (r0 != 0) goto L6;
        r0 = n();
    L6:
        if (r0 != 15) goto L14;
        long r1 = this.v;
        int r4 = (int) r1;
        if (r1 != r4) goto L12;
        this.u = 0;
        int[] r2 = this.B;
        int r7 = this.z - 1;
        r2[r7] = r2[r7] + 1;
        return r4;
    L12:
        throw new NumberFormatException("Expected an int but was " + this.v + M());
    L14:
        if (r0 != 16) goto L17;
        this.x = new String(this.p, this.q, this.w);
        this.q += this.w;
    L32:
        this.u = 11;
        double r3 = Double.parseDouble(this.x);
        int r5 = (int) r3;
        if (r5 != r3) goto L37;
        this.x = null;
        this.u = 0;
        int[] r6 = this.B;
        int r8 = this.z - 1;
        r6[r8] = r6[r8] + 1;
        return r5;
    L37:
        throw new NumberFormatException("Expected an int but was " + this.x + M());
    L17:
        if (r0 != 8) goto L19;
    L24:
        if (r0 != 10) goto L26;
        this.x = d0();
    L39:
        int r9 = Integer.parseInt(this.x);     // Catch: NumberFormatException -> L38
        this.u = 0;     // Catch: NumberFormatException -> L38
        int[] r10 = this.B;     // Catch: NumberFormatException -> L38
        int r11 = this.z - 1;     // Catch: NumberFormatException -> L38
        r10[r11] = r10[r11] + 1;     // Catch: NumberFormatException -> L38
        return r9;
    L26:
        if (r0 != 8) goto L28;
        char r12 = '\'';
    L29:
        this.x = b0(r12);
        goto L39
    L28:
        r12 = '\"';
        goto L29
    L19:
        if (r0 == 9) goto L24;
        if (r0 == 10) goto L24;
        er1.j(b11.x(e0()), M(), "Expected an int but was ");
        return 0;
    }

    public long X() {
        int r0 = this.u;
        if (r0 != 0) goto L6;
        r0 = n();
    L6:
        if (r0 != 15) goto L10;
        this.u = 0;
        int[] r1 = this.B;
        int r2 = this.z - 1;
        r1[r2] = r1[r2] + 1;
        return this.v;
    L10:
        if (r0 != 16) goto L13;
        this.x = new String(this.p, this.q, this.w);
        this.q += this.w;
    L28:
        this.u = 11;
        double r3 = Double.parseDouble(this.x);
        long r4 = (long) r3;
        if (r4 != r3) goto L33;
        this.x = null;
        this.u = 0;
        int[] r5 = this.B;
        int r8 = this.z - 1;
        r5[r8] = r5[r8] + 1;
        return r4;
    L33:
        throw new NumberFormatException("Expected a long but was " + this.x + M());
    L13:
        if (r0 != 8) goto L15;
    L20:
        if (r0 != 10) goto L22;
        this.x = d0();
    L35:
        long r6 = Long.parseLong(this.x);     // Catch: NumberFormatException -> L34
        this.u = 0;     // Catch: NumberFormatException -> L34
        int[] r7 = this.B;     // Catch: NumberFormatException -> L34
        int r9 = this.z - 1;     // Catch: NumberFormatException -> L34
        r7[r9] = r7[r9] + 1;     // Catch: NumberFormatException -> L34
        return r6;
    L22:
        if (r0 != 8) goto L24;
        char r10 = '\'';
    L25:
        this.x = b0(r10);
        goto L35
    L24:
        r10 = '\"';
        goto L25
    L15:
        if (r0 == 9) goto L20;
        if (r0 == 10) goto L20;
        er1.j(b11.x(e0()), M(), "Expected a long but was ");
        return 0;
    }

    public String Y() {
        int r0 = this.u;
        if (r0 != 0) goto L6;
        r0 = n();
    L6:
        if (r0 != 14) goto L9;
        String r1 = d0();
    L14:
        this.u = 0;
        this.A[this.z - 1] = r1;
        return r1;
    L9:
        if (r0 != 12) goto L12;
        r1 = b0('\'');
        goto L14
    L12:
        if (r0 != 13) goto L16;
        r1 = b0('\"');
        goto L14
    L16:
        er1.j(b11.x(e0()), M(), "Expected a name but was ");
        return null;
    }

    public final int Z(boolean r10) {
        int r0 = this.q;
        int r1 = this.r;
    L4:
        if (r0 != r1) goto L13;
        this.q = r0;
        if (u(1) == false) goto L7;
        r0 = this.q;
        r1 = this.r;
        goto L13
    L7:
        if (r10 == true) goto L11;
        return -1;
    L11:
        throw new EOFException("End of input".concat(M()));
    L13:
        int r3 = r0 + 1;
        char[] r4 = this.p;
        char r5 = r4[r0];
        if (r5 == '\n') goto L15;
        if (r5 == ' ') goto L59;
        if (r5 == '\r') goto L59;
        if (r5 == '\t') goto L59;
        if (r5 == '/') goto L25;
        if (r5 != '#') goto L57;
        this.q = r3;
        j();
        i0();
        r0 = this.q;
        r1 = this.r;
        goto L4
    L57:
        this.q = r3;
        return r5;
    L25:
        this.q = r3;
        if (r3 != r1) goto L30;
        this.q = r0;
        boolean r2 = u(2);
        this.q++;
        if (r2 == true) goto L30;
    L33:
        return r5;
    L30:
        j();
        int r6 = this.q;
        char r7 = r4[r6];
        if (r7 != '*') goto L32;
        this.q = r6 + 1;
    L37:
        if ((this.q + 2) > this.r) goto L39;
    L43:
        int r8 = this.q;
        if (r4[r8] != '\n') goto L46;
        this.s++;
        this.t = r8 + 1;
    L51:
        this.q++;
        goto L37
    L46:
        int r9 = 0;
    L47:
        int r11 = this.q;
        if (r9 >= 2) goto L53;
        if (r4[r11 + r9] != "*/".charAt(r9)) goto L51;
        r9 = r9 + 1;
        goto L47
    L53:
        r0 = r11 + 2;
        r1 = this.r;
        goto L4
    L39:
        if (u(2) == true) goto L43;
        l0("Unterminated comment");
        throw null;
    L32:
        if (r7 != '/') goto L33;
        this.q = r6 + 1;
        i0();
        r0 = this.q;
        r1 = this.r;
    L59:
        r0 = r3;
        goto L4
    L15:
        this.s++;
        this.t = r3;
        goto L59
    }

    public void a0() {
        int r0 = this.u;
        if (r0 != 0) goto L6;
        r0 = n();
    L6:
        if (r0 != 7) goto L9;
        this.u = 0;
        int[] r1 = this.B;
        int r2 = this.z - 1;
        r1[r2] = r1[r2] + 1;
        return;
    L9:
        er1.j(b11.x(e0()), M(), "Expected null but was ");
    }

    public void b() {
        int r0 = this.u;
        if (r0 != 0) goto L6;
        r0 = n();
    L6:
        if (r0 != 3) goto L9;
        f0(1);
        this.B[this.z - 1] = 0;
        this.u = 0;
        return;
    L9:
        er1.j(b11.x(e0()), M(), "Expected BEGIN_ARRAY but was ");
    }

    public final String b0(char r11) {
        StringBuilder r1 = null;
    L3:
        int r2 = this.q;
        int r3 = this.r;
    L4:
        int r4 = r3;
        int r5 = r2;
    L5:
        char[] r7 = this.p;
        if (r2 >= r4) goto L25;
        int r8 = r2 + 1;
        char r6 = r7[r2];
        if (r6 == r11) goto L9;
        if (r6 == '\\') goto L17;
        if (r6 != '\n') goto L24;
        this.s++;
        this.t = r8;
    L24:
        r2 = r8;
        goto L5
    L17:
        this.q = r8;
        int r9 = r8 - r5;
        int r10 = r9 - 1;
        if (r1 != null) goto L20;
        r1 = new StringBuilder(Math.max(r9 * 2, 16));
    L20:
        r1.append(r7, r5, r10);
        r1.append(g0());
        r2 = this.q;
        r3 = this.r;
        goto L4
    L9:
        this.q = r8;
        int r12 = (r8 - r5) - 1;
        if (r1 == null) goto L12;
        r1.append(r7, r5, r12);
        return r1.toString();
    L12:
        return new String(r7, r5, r12);
    L25:
        if (r1 != null) goto L27;
        r1 = new StringBuilder(Math.max((r2 - r5) * 2, 16));
    L27:
        r1.append(r7, r5, r2 - r5);
        this.q = r2;
        if (u(1) == true) goto L3;
        l0("Unterminated string");
        throw null;
    }

    public String c0() {
        int r0 = this.u;
        if (r0 != 0) goto L6;
        r0 = n();
    L6:
        if (r0 != 10) goto L9;
        String r1 = d0();
    L23:
        this.u = 0;
        int[] r2 = this.B;
        int r4 = this.z - 1;
        r2[r4] = r2[r4] + 1;
        return r1;
    L9:
        if (r0 != 8) goto L12;
        r1 = b0('\'');
        goto L23
    L12:
        if (r0 != 9) goto L15;
        r1 = b0('\"');
        goto L23
    L15:
        if (r0 != 11) goto L18;
        r1 = this.x;
        this.x = null;
        goto L23
    L18:
        if (r0 != 15) goto L21;
        r1 = Long.toString(this.v);
        goto L23
    L21:
        if (r0 != 16) goto L25;
        r1 = new String(this.p, this.q, this.w);
        this.q += this.w;
        goto L23
    L25:
        er1.j(b11.x(e0()), M(), "Expected a string but was ");
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.u = 0;
        this.y[0] = 8;
        this.z = 1;
        this.n.close();
    }

    public final String d0() {
        StringBuilder r0 = null;
        int r1 = 0;
    L3:
        int r2 = 0;
    L4:
        int r3 = this.q + r2;
        int r4 = this.r;
        char[] r5 = this.p;
        if (r3 < r4) goto L6;
        if (r2 >= r5.length) goto L41;
        if (u(r2 + 1) == true) goto L4;
    L40:
        r1 = r2;
    L45:
        int r6 = this.q;
        if (r0 != null) goto L48;
        String r7 = new String(r5, r6, r1);
    L49:
        this.q += r1;
        return r7;
    L48:
        r0.append(r5, r6, r1);
        r7 = r0.toString();
        goto L49
    L41:
        if (r0 != null) goto L43;
        r0 = new StringBuilder(Math.max(r2, 16));
    L43:
        r0.append(r5, this.q, r2);
        this.q += r2;
        if (u(1) == true) goto L3;
    L6:
        char r8 = r5[r3];
        if (r8 == '\t') goto L40;
        if (r8 == '\n') goto L40;
        if (r8 == '\f') goto L40;
        if (r8 == '\r') goto L40;
        if (r8 == ' ') goto L40;
        if (r8 == '#') goto L34;
        if (r8 == ',') goto L40;
        if (r8 == '/') goto L34;
        if (r8 == '=') goto L34;
        if (r8 == '{') goto L40;
        if (r8 == '}') goto L40;
        if (r8 == ':') goto L40;
        if (r8 == ';') goto L34;
        switch(r8) {
            case 91: goto L40;
            case 92: goto L34;
            case 93: goto L40;
            default: goto L33;
        };
    L33:
        r2 = r2 + 1;
    L34:
        j();
        goto L40
    }

    public int e0() {
        int r0 = this.u;
        if (r0 != 0) goto L5;
        r0 = n();
    L5:
        switch(r0) {
            case 1: goto L26;
            case 2: goto L24;
            case 3: goto L22;
            case 4: goto L20;
            case 5: goto L18;
            case 6: goto L18;
            case 7: goto L16;
            case 8: goto L14;
            case 9: goto L14;
            case 10: goto L14;
            case 11: goto L14;
            case 12: goto L12;
            case 13: goto L12;
            case 14: goto L12;
            case 15: goto L10;
            case 16: goto L10;
            case 17: goto L8;
            default: goto L7;
        };
    L8:
        return 10;
    L10:
        return 7;
    L12:
        return 5;
    L14:
        return 6;
    L16:
        return 9;
    L18:
        return 8;
    L20:
        return 2;
    L22:
        return 1;
    L24:
        return 4;
    L26:
        return 3;
    L7:
        throw new AssertionError();
    }

    public void f() {
        int r0 = this.u;
        if (r0 != 0) goto L6;
        r0 = n();
    L6:
        if (r0 != 1) goto L9;
        f0(3);
        this.u = 0;
        return;
    L9:
        er1.j(b11.x(e0()), M(), "Expected BEGIN_OBJECT but was ");
    }

    public final void f0(int r4) {
        int r0 = this.z;
        int[] r1 = this.y;
        if (r0 != r1.length) goto L5;
        int r2 = r0 * 2;
        this.y = Arrays.copyOf(r1, r2);
        this.B = Arrays.copyOf(this.B, r2);
        this.A = (String[]) Arrays.copyOf(this.A, r2);
    L5:
        int[] r3 = this.y;
        int r5 = this.z;
        this.z = r5 + 1;
        r3[r5] = r4;
    }

    public final char g0() {
        if (this.q == this.r) goto L5;
    L9:
        int r0 = this.q;
        int r1 = r0 + 1;
        this.q = r1;
        char[] r5 = this.p;
        char r6 = r5[r0];
        if (r6 != '\n') goto L12;
        this.s++;
        this.t = r1;
        return r6;
    L12:
        if (r6 != '\"') goto L14;
    L71:
        return r6;
    L14:
        if (r6 == '\'') goto L71;
        if (r6 == '/') goto L71;
        if (r6 == '\\') goto L71;
        if (r6 != 'b') goto L22;
        return '\b';
    L22:
        if (r6 != 'f') goto L24;
        return '\f';
    L24:
        if (r6 != 'n') goto L26;
        return '\n';
    L26:
        if (r6 != 'r') goto L28;
        return '\r';
    L28:
        if (r6 != 't') goto L30;
        return '\t';
    L30:
        if (r6 == 'u') goto L32;
        l0("Invalid escape sequence");
        throw null;
    L32:
        if ((r0 + 5) > this.r) goto L34;
    L38:
        int r2 = this.q;
        int r3 = r2 + 4;
        char r4 = 0;
    L39:
        if (r2 >= r3) goto L58;
        char r7 = r5[r2];
        char r8 = (char) (r4 << 4);
        if (r7 < '0') goto L47;
        if (r7 > '9') goto L47;
        int r9 = r7 - '0';
    L45:
        r4 = (char) (r9 + r8);
        r2 = r2 + 1;
    L47:
        if (r7 < 'a') goto L51;
        if (r7 > 'f') goto L51;
        r9 = r7 - 'W';
    L51:
        if (r7 < 'A') goto L57;
        if (r7 > 'F') goto L57;
        r9 = r7 - '7';
    L57:
        throw new NumberFormatException("\\u".concat(new String(r5, this.q, 4)));
    L58:
        this.q += 4;
        return r4;
    L34:
        if (u(4) == true) goto L38;
        l0("Unterminated escape sequence");
        throw null;
    L5:
        if (u(1) == true) goto L9;
        l0("Unterminated escape sequence");
        throw null;
    }

    public final void h0(char r6) {
    L2:
        int r0 = this.q;
        int r1 = this.r;
    L4:
        if (r0 >= r1) goto L16;
        int r3 = r0 + 1;
        char r2 = this.p[r0];
        if (r2 == r6) goto L7;
        if (r2 == '\\') goto L11;
        if (r2 != '\n') goto L15;
        this.s++;
        this.t = r3;
    L15:
        r0 = r3;
        goto L4
    L11:
        this.q = r3;
        g0();
        r0 = this.q;
        r1 = this.r;
        goto L4
    L7:
        this.q = r3;
        return;
    L16:
        this.q = r0;
        if (u(1) == true) goto L2;
        l0("Unterminated string");
        throw null;
    }

    public final void i0() {
    L3:
        if (this.q >= this.r) goto L5;
    L6:
        int r0 = this.q;
        int r1 = r0 + 1;
        this.q = r1;
        char r2 = this.p[r0];
        if (r2 == '\n') goto L8;
        if (r2 != '\r') goto L3;
        return;
    L8:
        this.s++;
        this.t = r1;
        return;
    L5:
        if (u(1) == true) goto L6;
    }

    public final void j() {
        if (this.o == false) goto L5;
        return;
    L5:
        l0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final void j0() {
    L2:
        int r0 = 0;
    L3:
        int r1 = this.q + r0;
        if (r1 >= this.r) goto L36;
        char r2 = this.p[r1];
        if (r2 == '\t') goto L34;
        if (r2 == '\n') goto L34;
        if (r2 == '\f') goto L34;
        if (r2 == '\r') goto L34;
        if (r2 == ' ') goto L34;
        if (r2 == '#') goto L33;
        if (r2 == ',') goto L34;
        if (r2 == '/') goto L33;
        if (r2 == '=') goto L33;
        if (r2 == '{') goto L34;
        if (r2 == '}') goto L34;
        if (r2 == ':') goto L34;
        if (r2 == ';') goto L33;
        switch(r2) {
            case 91: goto L34;
            case 92: goto L33;
            case 93: goto L34;
            default: goto L32;
        };
    L32:
        r0 = r0 + 1;
    L33:
        j();
    L34:
        this.q += r0;
        return;
    L36:
        this.q = r1;
        if (u(1) == true) goto L2;
    }

    public void k0() {
        int r1 = 0;
    L3:
        int r2 = this.u;
        if (r2 != 0) goto L7;
        r2 = n();
    L7:
        switch(r2) {
            case 1: goto L30;
            case 2: goto L27;
            case 3: goto L25;
            case 4: goto L23;
            case 5: goto L31;
            case 6: goto L31;
            case 7: goto L31;
            case 8: goto L22;
            case 9: goto L21;
            case 10: goto L20;
            case 11: goto L31;
            case 12: goto L17;
            case 13: goto L14;
            case 14: goto L11;
            case 15: goto L31;
            case 16: goto L10;
            case 17: goto L9;
            default: goto L31;
        };
    L10:
        this.q += this.w;
        goto L31
    L11:
        j0();
        if (r1 != 0) goto L31;
        this.A[this.z - 1] = "<skipped>";
        goto L31
    L14:
        h0('\"');
        if (r1 != 0) goto L31;
        this.A[this.z - 1] = "<skipped>";
        goto L31
    L17:
        h0('\'');
        if (r1 != 0) goto L31;
        this.A[this.z - 1] = "<skipped>";
        goto L31
    L20:
        j0();
        goto L31
    L21:
        h0('\"');
        goto L31
    L22:
        h0('\'');
        goto L31
    L23:
        this.z--;
    L24:
        r1 = r1 - 1;
        goto L31
    L25:
        f0(1);
    L26:
        r1 = r1 + 1;
        goto L31
    L27:
        if (r1 != 0) goto L29;
        this.A[this.z - 1] = null;
    L29:
        this.z--;
        goto L24
    L30:
        f0(3);
    L31:
        this.u = 0;
        if (r1 > 0) goto L3;
        int[] r0 = this.B;
        int r7 = this.z - 1;
        r0[r7] = r0[r7] + 1;
        return;
    }

    public final void l0(String r2) {
        throw new MalformedJsonException(r2.concat(M()));
    }

    public final int n() {
        int[] r1 = this.y;
        boolean r3 = true;
        int r2 = this.z - 1;
        int r4 = r1[r2];
        char[] r6 = this.p;
        if (r4 != 1) goto L5;
        r1[r2] = 2;
    L63:
        int r5 = Z(true);
        if (r5 == 34) goto L235;
        if (r5 == 39) goto L233;
        if (r5 == 44) goto L224;
        if (r5 == 59) goto L224;
        if (r5 == 91) goto L222;
        if (r5 != 93) goto L72;
        int r8 = 1;
        if (r4 != 1) goto L225;
        this.u = 4;
        return 4;
    L225:
        if (r4 != r8) goto L227;
    L231:
        j();
        this.q -= r8;
        this.u = 7;
        return 7;
    L227:
        if (r4 == 2) goto L231;
        l0("Unexpected value");
        throw null;
    L72:
        if (r5 == 123) goto L216;
        int r7 = this.q - 1;
        this.q = r7;
        char r9 = r6[r7];
        if (r9 != 't') goto L76;
    L91:
        String r10 = "true";
        String r11 = "TRUE";
        int r12 = 5;
    L92:
        int r13 = r10.length();
        int r14 = 1;
    L93:
        int r15 = this.q;
        int r16 = this.r;
        if (r14 >= r13) goto L107;
        if ((r15 + r14) >= r16) goto L98;
    L100:
        char r17 = r6[this.q + r14];
        if (r17 == r10.charAt(r14)) goto L105;
        if (r17 == r11.charAt(r14)) goto L105;
    L88:
        int r18 = 0;
    L114:
        if (r18 == 0) goto L116;
        return r18;
    L116:
        int r19 = this.q;
        int r110 = this.r;
        boolean r111 = true;
        int r20 = 0;
        long r21 = 0;
        boolean r22 = false;
        char r112 = 0;
    L118:
        if ((r19 + r20) == r110) goto L120;
    L127:
        char r113 = r6[r19 + r20];
        if (r113 != '+') goto L130;
        if (r112 != 5) goto L121;
    L199:
        r112 = 6;
    L207:
        r20 = r20 + 1;
        r3 = true;
    L121:
        int r23 = 0;
    L208:
        if (r23 == 0) goto L211;
        return r23;
    L211:
        if (K(r6[this.q]) == false) goto L214;
        j();
        this.u = 10;
        return 10;
    L214:
        l0("Expected value");
        throw null;
    L130:
        if (r113 == 'E') goto L201;
        if (r113 == 'e') goto L201;
        if (r113 == '-') goto L196;
        if (r113 == '.') goto L193;
        if (r113 < '0') goto L169;
        if (r113 > '9') goto L169;
        if (r112 == r3) goto L167;
        if (r112 == 0) goto L167;
        if (r112 == 2) goto L148;
        long r24 = r21;
        if (r112 != 3) goto L162;
        r21 = r24;
        r112 = 4;
        goto L207
    L162:
        if (r112 == 5) goto L166;
        if (r112 == 6) goto L166;
        r21 = r24;
    L166:
        r21 = r24;
        r112 = 7;
        goto L207
    L148:
        if (r21 == 0) goto L121;
        long r25 = r21;
        long r26 = (10 * r21) - ((long) (r113 - '0'));
        if (r25 > (-922337203685477580L)) goto L157;
        if (r25 == (-922337203685477580L)) goto L154;
    L156:
        boolean r27 = false;
    L158:
        r111 = r111 & r27;
        r21 = r26;
        goto L207
    L154:
        if (r26 >= r25) goto L156;
    L157:
        r27 = true;
    L167:
        r21 = -(r113 - '0');
        r112 = 2;
    L169:
        if (K(r113) == true) goto L121;
    L125:
        char r28 = 2;
        if (r112 != 2) goto L186;
        if (r111 == true) goto L174;
    L177:
        r28 = 2;
        goto L186
    L174:
        if (r21 != Long.MIN_VALUE) goto L179;
        if (r22 == false) goto L177;
    L179:
        if (r21 != 0) goto L181;
        if (r22 == true) goto L177;
    L181:
        long r29 = r21;
        if (r22 == true) goto L185;
        r29 = -r29;
    L185:
        this.v = r29;
        this.q += r20;
        r23 = 15;
        this.u = 15;
    L186:
        if (r112 != r28) goto L188;
    L191:
        this.w = r20;
        r23 = 16;
        this.u = 16;
        goto L208
    L188:
        if (r112 == 4) goto L191;
        if (r112 != 7) goto L121;
    L193:
        if (r112 != 2) goto L121;
        r112 = 3;
        goto L207
    L196:
        if (r112 != 0) goto L198;
        r22 = true;
        r112 = 1;
        goto L207
    L198:
        if (r112 != 5) goto L121;
    L201:
        if (r112 != 2) goto L203;
    L204:
        r112 = 5;
        goto L207
    L203:
        if (r112 != 4) goto L121;
    L120:
        if (r20 == r6.length) goto L121;
        if (u(r20 + 1) == false) goto L125;
        r19 = this.q;
        r110 = this.r;
    L105:
        r14 = r14 + 1;
        goto L93
    L98:
        if (u(r14 + 1) == true) goto L100;
    L107:
        if ((r15 + r13) < r16) goto L111;
        if (u(r13 + 1) == true) goto L111;
    L113:
        this.q += r13;
        this.u = r12;
        r18 = r12;
    L111:
        if (K(r6[this.q + r13]) == false) goto L113;
    L76:
        if (r9 == 'T') goto L91;
        if (r9 != 'f') goto L81;
    L90:
        r10 = "false";
        r11 = "FALSE";
        r12 = 6;
        goto L92
    L81:
        if (r9 == 'F') goto L90;
        if (r9 != 'n') goto L86;
    L89:
        r10 = "null";
        r11 = "NULL";
        r12 = 7;
        goto L92
    L86:
        if (r9 != 'N') goto L88;
    L216:
        this.u = 1;
        return 1;
    L222:
        this.u = 3;
        return 3;
    L224:
        r8 = 1;
        goto L225
    L233:
        j();
        this.u = 8;
        return 8;
    L235:
        this.u = 9;
        return 9;
    L5:
        if (r4 != 2) goto L16;
        int r30 = Z(true);
        if (r30 == 44) goto L63;
        if (r30 == 59) goto L14;
        if (r30 != 93) goto L12;
        this.u = 4;
        return 4;
    L12:
        l0("Unterminated array");
        throw null;
    L14:
        j();
        goto L63
    L16:
        if (r4 == 3) goto L239;
        if (r4 == 5) goto L239;
        if (r4 != 4) goto L33;
        r1[r2] = 5;
        int r31 = Z(true);
        if (r31 == 58) goto L63;
        if (r31 != 61) goto L31;
        j();
        if (this.q >= this.r) goto L27;
    L28:
        int r32 = this.q;
        if (r6[r32] != '>') goto L63;
        this.q = r32 + 1;
        goto L63
    L27:
        if (u(1) == false) goto L63;
    L31:
        l0("Expected ':'");
        throw null;
    L33:
        if (r4 != 6) goto L55;
        if (this.o == false) goto L53;
        Z(true);
        int r33 = this.q;
        this.q = r33 - 1;
        if ((r33 + 4) > this.r) goto L39;
    L41:
        int r34 = this.q;
        if (r6[r34] != ')') goto L53;
        if (r6[r34 + 1] != ']') goto L53;
        if (r6[r34 + 2] != '}') goto L53;
        if (r6[r34 + 3] != '\'') goto L53;
        if (r6[r34 + 4] != '\n') goto L53;
        this.q = r34 + 5;
        goto L53
    L39:
        if (u(5) == true) goto L41;
    L53:
        this.y[this.z - 1] = 7;
        goto L63
    L55:
        if (r4 != 7) goto L62;
        if (Z(false) != (-1)) goto L60;
        this.u = 17;
        return 17;
    L60:
        j();
        this.q--;
        goto L63
    L62:
        if (r4 != 8) goto L63;
        kf2.o("JsonReader is closed");
        return 0;
    L239:
        r1[r2] = 4;
        if (r4 != 5) goto L250;
        int r35 = Z(true);
        if (r35 == 44) goto L250;
        if (r35 == 59) goto L249;
        if (r35 != 125) goto L247;
        this.u = 2;
        return 2;
    L247:
        l0("Unterminated object");
        throw null;
    L249:
        j();
    L250:
        int r36 = Z(true);
        if (r36 == 34) goto L268;
        if (r36 != 39) goto L254;
        j();
        this.u = 12;
        return 12;
    L254:
        if (r36 == 125) goto L261;
        j();
        this.q--;
        if (K((char) r36) == false) goto L259;
        this.u = 14;
        return 14;
    L259:
        l0("Expected name");
        throw null;
    L261:
        if (r4 == 5) goto L264;
        this.u = 2;
        return 2;
    L264:
        l0("Expected name");
        throw null;
    L268:
        this.u = 13;
        return 13;
    }

    public void q() {
        int r0 = this.u;
        if (r0 != 0) goto L6;
        r0 = n();
    L6:
        if (r0 != 4) goto L9;
        int r1 = this.z;
        this.z = r1 - 1;
        int[] r2 = this.B;
        int r3 = r1 - 2;
        r2[r3] = r2[r3] + 1;
        this.u = 0;
        return;
    L9:
        er1.j(b11.x(e0()), M(), "Expected END_ARRAY but was ");
    }

    public void s() {
        int r0 = this.u;
        if (r0 != 0) goto L6;
        r0 = n();
    L6:
        if (r0 != 2) goto L9;
        int r1 = this.z;
        int r2 = r1 - 1;
        this.z = r2;
        this.A[r2] = null;
        int[] r3 = this.B;
        int r4 = r1 - 2;
        r3[r4] = r3[r4] + 1;
        this.u = 0;
        return;
    L9:
        er1.j(b11.x(e0()), M(), "Expected END_OBJECT but was ");
    }

    public String toString() {
        return getClass().getSimpleName().concat(M());
    }

    public final boolean u(int r8) {
        int r0 = this.t;
        int r1 = this.q;
        this.t = r0 - r1;
        int r2 = this.r;
        char[] r3 = this.p;
        if (r2 == r1) goto L5;
        int r4 = r2 - r1;
        this.r = r4;
        System.arraycopy(r3, r1, r3, 0, r4);
    L6:
        this.q = 0;
    L7:
        int r5 = this.r;
        int r6 = this.n.read(r3, r5, r3.length - r5);
        if (r6 == (-1)) goto L19;
        int r7 = this.r + r6;
        this.r = r7;
        if (this.s != 0) goto L17;
        int r9 = this.t;
        if (r9 != 0) goto L17;
        if (r7 <= 0) goto L17;
        if (r3[0] != 65279) goto L17;
        this.q++;
        this.t = r9 + 1;
        r8 = r8 + 1;
    L17:
        if (r7 < r8) goto L7;
        return true;
    L19:
        return false;
    L5:
        this.r = 0;
        goto L6
    }

    public String v() {
        return F(false);
    }
}
