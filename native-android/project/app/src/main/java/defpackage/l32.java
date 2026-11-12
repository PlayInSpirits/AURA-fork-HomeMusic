package defpackage;

import com.eddyizm.tempus.homemusic.WaveRetry;
import com.google.gson.stream.MalformedJsonException;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class l32 implements Closeable {
    public String[] A;
    public int[] B;
    public final Reader n;
    public long v;
    public int w;
    public String x;
    public int[] y;
    public boolean o = false;
    public final char[] p = new char[1024];
    public int q = 0;
    public int r = 0;
    public int s = 0;
    public int t = 0;
    public int u = 0;
    public int z = 1;

    static {
        fz0.i0 = new fz0(28);
    }

    public l32(Reader reader) {
        int[] iArr = new int[32];
        this.y = iArr;
        iArr[0] = 6;
        this.A = new String[32];
        this.B = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.n = reader;
    }

    public final String F(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.z;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.y[i];
            if (i3 == 1 || i3 == 2) {
                int i4 = this.B[i];
                if (z && i4 > 0 && i == i2 - 1) {
                    i4--;
                }
                sb.append('[');
                sb.append(i4);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = this.A[i];
                if (str != null) {
                    sb.append(str);
                }
            }
            i++;
        }
    }

    public String H() {
        return F(true);
    }

    public boolean J() throws IOException {
        int iN = this.u;
        if (iN == 0) {
            iN = n();
        }
        return (iN == 2 || iN == 4 || iN == 17) ? false : true;
    }

    public final boolean K(char c) throws MalformedJsonException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        j();
        return false;
    }

    final String M() {
        StringBuilder sbT = b11.t(" at line ", " column ", this.s + 1, (this.q - this.t) + 1, " path ");
        sbT.append(v());
        return sbT.toString();
    }

    public boolean R() throws IOException {
        int iN = this.u;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 5) {
            this.u = 0;
            int[] iArr = this.B;
            int i = this.z - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iN != 6) {
            er1.j(b11.x(e0()), M(), "Expected a boolean but was ");
            return false;
        }
        this.u = 0;
        int[] iArr2 = this.B;
        int i2 = this.z - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    public double T() throws IOException {
        int iN = this.u;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 15) {
            this.u = 0;
            int[] iArr = this.B;
            int i = this.z - 1;
            iArr[i] = iArr[i] + 1;
            return this.v;
        }
        if (iN == 16) {
            this.x = new String(this.p, this.q, this.w);
            this.q += this.w;
        } else if (iN == 8 || iN == 9) {
            this.x = b0(iN == 8 ? '\'' : '\"');
        } else if (iN == 10) {
            this.x = d0();
        } else if (iN != 11) {
            er1.j(b11.x(e0()), M(), "Expected a double but was ");
            return 0.0d;
        }
        this.u = 11;
        double d = Double.parseDouble(this.x);
        if (!this.o && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + d + M());
        }
        this.x = null;
        this.u = 0;
        int[] iArr2 = this.B;
        int i2 = this.z - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    public int W() throws IOException {
        int iN = this.u;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 15) {
            long j = this.v;
            int i = (int) j;
            if (j == i) {
                this.u = 0;
                int[] iArr = this.B;
                int i2 = this.z - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new NumberFormatException("Expected an int but was " + this.v + M());
        }
        if (iN == 16) {
            this.x = new String(this.p, this.q, this.w);
            this.q += this.w;
        } else {
            if (iN != 8 && iN != 9 && iN != 10) {
                er1.j(b11.x(e0()), M(), "Expected an int but was ");
                return 0;
            }
            if (iN == 10) {
                this.x = d0();
            } else {
                this.x = b0(iN == 8 ? '\'' : '\"');
            }
            try {
                int i3 = Integer.parseInt(this.x);
                this.u = 0;
                int[] iArr2 = this.B;
                int i4 = this.z - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        }
        this.u = 11;
        double d = Double.parseDouble(this.x);
        int i5 = (int) d;
        if (i5 == d) {
            this.x = null;
            this.u = 0;
            int[] iArr3 = this.B;
            int i6 = this.z - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.x + M());
    }

    public long X() throws IOException {
        int iN = this.u;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 15) {
            this.u = 0;
            int[] iArr = this.B;
            int i = this.z - 1;
            iArr[i] = iArr[i] + 1;
            return this.v;
        }
        if (iN == 16) {
            this.x = new String(this.p, this.q, this.w);
            this.q += this.w;
        } else {
            if (iN != 8 && iN != 9 && iN != 10) {
                er1.j(b11.x(e0()), M(), "Expected a long but was ");
                return 0L;
            }
            if (iN == 10) {
                this.x = d0();
            } else {
                this.x = b0(iN == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.x);
                this.u = 0;
                int[] iArr2 = this.B;
                int i2 = this.z - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.u = 11;
        double d = Double.parseDouble(this.x);
        long j2 = (long) d;
        if (j2 == d) {
            this.x = null;
            this.u = 0;
            int[] iArr3 = this.B;
            int i3 = this.z - 1;
            iArr3[i3] = iArr3[i3] + 1;
            return j2;
        }
        throw new NumberFormatException("Expected a long but was " + this.x + M());
    }

    public String Y() throws IOException {
        String strB0;
        int iN = this.u;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 14) {
            strB0 = d0();
        } else if (iN == 12) {
            strB0 = b0('\'');
        } else {
            if (iN != 13) {
                er1.j(b11.x(e0()), M(), "Expected a name but was ");
                return null;
            }
            strB0 = b0('\"');
        }
        this.u = 0;
        this.A[this.z - 1] = strB0;
        return strB0;
    }

    public final int Z(boolean z) throws IOException {
        int i = this.q;
        int i2 = this.r;
        while (true) {
            if (i == i2) {
                this.q = i;
                if (!u(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(M()));
                    }
                    return -1;
                }
                i = this.q;
                i2 = this.r;
            }
            int i3 = i + 1;
            char[] cArr = this.p;
            char c = cArr[i];
            if (c == '\n') {
                this.s++;
                this.t = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.q = i3;
                    if (i3 == i2) {
                        this.q = i;
                        boolean zU = u(2);
                        this.q++;
                        if (!zU) {
                        }
                        return c;
                    }
                    j();
                    int i4 = this.q;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.q = i4 + 1;
                        while (true) {
                            if (this.q + 2 > this.r && !u(2)) {
                                l0("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.q;
                            if (cArr[i5] != '\n') {
                                int i6 = 0;
                                while (true) {
                                    int i7 = this.q;
                                    if (i6 >= 2) {
                                        i = i7 + 2;
                                        i2 = this.r;
                                        break;
                                    }
                                    if (cArr[i7 + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                this.s++;
                                this.t = i5 + 1;
                            }
                            this.q++;
                        }
                    } else {
                        if (c2 != '/') {
                            return c;
                        }
                        this.q = i4 + 1;
                        i0();
                        i = this.q;
                        i2 = this.r;
                    }
                } else {
                    if (c != '#') {
                        this.q = i3;
                        return c;
                    }
                    this.q = i3;
                    j();
                    i0();
                    i = this.q;
                    i2 = this.r;
                }
            }
            i = i3;
        }
    }

    public void a0() throws IOException {
        int iN = this.u;
        if (iN == 0) {
            iN = n();
        }
        if (iN != 7) {
            er1.j(b11.x(e0()), M(), "Expected null but was ");
            return;
        }
        this.u = 0;
        int[] iArr = this.B;
        int i = this.z - 1;
        iArr[i] = iArr[i] + 1;
    }

    public void b() throws IOException {
        int iN = this.u;
        if (iN == 0) {
            iN = n();
        }
        if (iN != 3) {
            er1.j(b11.x(e0()), M(), "Expected BEGIN_ARRAY but was ");
            return;
        }
        f0(1);
        this.B[this.z - 1] = 0;
        this.u = 0;
    }

    public final String b0(char c) throws MalformedJsonException {
        int i;
        char[] cArr;
        StringBuilder sb = null;
        do {
            int i2 = this.q;
            int i3 = this.r;
            while (true) {
                int i4 = i3;
                i = i2;
                while (true) {
                    cArr = this.p;
                    if (i2 < i4) {
                        int i5 = i2 + 1;
                        char c2 = cArr[i2];
                        if (c2 == c) {
                            this.q = i5;
                            int i6 = (i5 - i) - 1;
                            if (sb == null) {
                                return new String(cArr, i, i6);
                            }
                            sb.append(cArr, i, i6);
                            return sb.toString();
                        }
                        if (c2 == '\\') {
                            this.q = i5;
                            int i7 = i5 - i;
                            int i8 = i7 - 1;
                            if (sb == null) {
                                sb = new StringBuilder(Math.max(i7 * 2, 16));
                            }
                            sb.append(cArr, i, i8);
                            sb.append(g0());
                            i2 = this.q;
                            i3 = this.r;
                        } else {
                            if (c2 == '\n') {
                                this.s++;
                                this.t = i5;
                            }
                            i2 = i5;
                        }
                    }
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i2 - i) * 2, 16));
            }
            sb.append(cArr, i, i2 - i);
            this.q = i2;
        } while (u(1));
        l0("Unterminated string");
        throw null;
    }

    public String c0() {
        String str;
        int iN = this.u;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 10) {
            str = d0();
        } else if (iN == 8) {
            str = b0('\'');
        } else if (iN == 9) {
            str = b0('\"');
        } else if (iN == 11) {
            str = this.x;
            this.x = null;
        } else if (iN == 15) {
            str = Long.toString(this.v);
        } else {
            if (iN != 16) {
                er1.j(b11.x(e0()), M(), "Expected a string but was ");
                return null;
            }
            str = new String(this.p, this.q, this.w);
            this.q += this.w;
        }
        this.u = 0;
        int[] iArr = this.B;
        int i = this.z - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.u = 0;
        this.y[0] = 8;
        this.z = 1;
        this.n.close();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
    public final String d0() throws MalformedJsonException {
        String string;
        StringBuilder sb = null;
        int i = 0;
        while (true) {
            int i2 = 0;
            while (true) {
                int i3 = this.q + i2;
                int i4 = this.r;
                char[] cArr = this.p;
                if (i3 < i4) {
                    char c = cArr[i3];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        j();
                    }
                    i = i2;
                } else if (i2 >= cArr.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i2, 16));
                    }
                    sb.append(cArr, this.q, i2);
                    this.q += i2;
                    if (!u(1)) {
                    }
                } else if (!u(i2 + 1)) {
                    i = i2;
                }
                int i5 = this.q;
                if (sb == null) {
                    string = new String(cArr, i5, i);
                } else {
                    sb.append(cArr, i5, i);
                    string = sb.toString();
                }
                this.q += i;
                return string;
            }
        }
    }

    public int e0() {
        int iN = this.u;
        if (iN == 0) {
            iN = n();
        }
        switch (iN) {
            case 1:
                return 3;
            case 2:
                return 4;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case WaveRetry.MAX_FAILURES /* 16 */:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public void f() throws IOException {
        int iN = this.u;
        if (iN == 0) {
            iN = n();
        }
        if (iN != 1) {
            er1.j(b11.x(e0()), M(), "Expected BEGIN_OBJECT but was ");
        } else {
            f0(3);
            this.u = 0;
        }
    }

    public final void f0(int i) {
        int i2 = this.z;
        int[] iArr = this.y;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.y = Arrays.copyOf(iArr, i3);
            this.B = Arrays.copyOf(this.B, i3);
            this.A = (String[]) Arrays.copyOf(this.A, i3);
        }
        int[] iArr2 = this.y;
        int i4 = this.z;
        this.z = i4 + 1;
        iArr2[i4] = i;
    }

    public final char g0() throws MalformedJsonException {
        int i;
        if (this.q == this.r && !u(1)) {
            l0("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.q;
        int i3 = i2 + 1;
        this.q = i3;
        char[] cArr = this.p;
        char c = cArr[i2];
        if (c == '\n') {
            this.s++;
            this.t = i3;
            return c;
        }
        if (c == '\"' || c == '\'' || c == '/' || c == '\\') {
            return c;
        }
        if (c == 'b') {
            return '\b';
        }
        if (c == 'f') {
            return '\f';
        }
        if (c == 'n') {
            return '\n';
        }
        if (c == 'r') {
            return '\r';
        }
        if (c == 't') {
            return '\t';
        }
        if (c != 'u') {
            l0("Invalid escape sequence");
            throw null;
        }
        if (i2 + 5 > this.r && !u(4)) {
            l0("Unterminated escape sequence");
            throw null;
        }
        int i4 = this.q;
        int i5 = i4 + 4;
        char c2 = 0;
        while (i4 < i5) {
            char c3 = cArr[i4];
            char c4 = (char) (c2 << 4);
            if (c3 >= '0' && c3 <= '9') {
                i = c3 - '0';
            } else if (c3 >= 'a' && c3 <= 'f') {
                i = c3 - 'W';
            } else {
                if (c3 < 'A' || c3 > 'F') {
                    throw new NumberFormatException("\\u".concat(new String(cArr, this.q, 4)));
                }
                i = c3 - '7';
            }
            c2 = (char) (i + c4);
            i4++;
        }
        this.q += 4;
        return c2;
    }

    public final void h0(char c) throws MalformedJsonException {
        do {
            int i = this.q;
            int i2 = this.r;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.p[i];
                if (c2 == c) {
                    this.q = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.q = i3;
                    g0();
                    i = this.q;
                    i2 = this.r;
                } else {
                    if (c2 == '\n') {
                        this.s++;
                        this.t = i3;
                    }
                    i = i3;
                }
            }
            this.q = i;
        } while (u(1));
        l0("Unterminated string");
        throw null;
    }

    public final void i0() {
        char c;
        do {
            if (this.q >= this.r && !u(1)) {
                return;
            }
            int i = this.q;
            int i2 = i + 1;
            this.q = i2;
            c = this.p[i];
            if (c == '\n') {
                this.s++;
                this.t = i2;
                return;
            }
        } while (c != '\r');
    }

    public final void j() throws MalformedJsonException {
        if (this.o) {
            return;
        }
        l0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final void j0() throws MalformedJsonException {
        do {
            int i = 0;
            while (true) {
                int i2 = this.q + i;
                if (i2 < this.r) {
                    char c = this.p[i2];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        j();
                    }
                    this.q += i;
                    return;
                }
                this.q = i2;
            }
        } while (u(1));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void k0() throws IOException {
        int i = 0;
        do {
            int iN = this.u;
            if (iN == 0) {
                iN = n();
            }
            switch (iN) {
                case 1:
                    f0(3);
                    i++;
                    this.u = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.A[this.z - 1] = null;
                    }
                    this.z--;
                    i--;
                    this.u = 0;
                    break;
                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                    f0(1);
                    i++;
                    this.u = 0;
                    break;
                case 4:
                    this.z--;
                    i--;
                    this.u = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.u = 0;
                    break;
                case 8:
                    h0('\'');
                    this.u = 0;
                    break;
                case 9:
                    h0('\"');
                    this.u = 0;
                    break;
                case 10:
                    j0();
                    this.u = 0;
                    break;
                case 12:
                    h0('\'');
                    if (i == 0) {
                        this.A[this.z - 1] = "<skipped>";
                    }
                    this.u = 0;
                    break;
                case 13:
                    h0('\"');
                    if (i == 0) {
                        this.A[this.z - 1] = "<skipped>";
                    }
                    this.u = 0;
                    break;
                case 14:
                    j0();
                    if (i == 0) {
                        this.A[this.z - 1] = "<skipped>";
                    }
                    this.u = 0;
                    break;
                case WaveRetry.MAX_FAILURES /* 16 */:
                    this.q += this.w;
                    this.u = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.B;
        int i2 = this.z - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    public final void l0(String str) throws MalformedJsonException {
        throw new MalformedJsonException(str.concat(M()));
    }

    /* JADX WARN: Code duplicated, block: B:115:0x017b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:116:0x017c  */
    /* JADX WARN: Code duplicated, block: B:119:0x018d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0193  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a4 A[PHI: r1 r10
  0x01a4: PHI (r1v56 int) = (r1v55 int), (r1v72 int) binds: [B:118:0x018b, B:126:0x01a0] A[DONT_GENERATE, DONT_INLINE]
  0x01a4: PHI (r10v11 int) = (r10v10 int), (r10v12 int) binds: [B:118:0x018b, B:126:0x01a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:129:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:172:0x021e  */
    /* JADX WARN: Code duplicated, block: B:173:0x0220  */
    /* JADX WARN: Code duplicated, block: B:186:0x0243 A[DONT_INVERT, PHI: r8
  0x0243: PHI (r8v20 char) = (r8v19 char), (r8v21 char) binds: [B:171:0x021c, B:177:0x0229] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:187:0x0245  */
    /* JADX WARN: Code duplicated, block: B:200:0x0261  */
    /* JADX WARN: Code duplicated, block: B:202:0x0264  */
    /* JADX WARN: Code duplicated, block: B:205:0x0269 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:209:0x0275 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:210:0x0276  */
    /* JADX WARN: Code duplicated, block: B:212:0x0280  */
    /* JADX WARN: Code duplicated, block: B:214:0x0288  */
    /* JADX WARN: Code duplicated, block: B:276:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x019b A[SYNTHETIC] */
    public final int n() throws IOException {
        int iZ;
        int i;
        String str;
        String str2;
        int i2;
        int i3;
        char c;
        int i4;
        int i5;
        boolean z;
        int i6;
        char c2;
        char c3;
        int i7;
        char c4;
        int[] iArr = this.y;
        boolean z2 = true;
        int i8 = this.z - 1;
        int i9 = iArr[i8];
        char[] cArr = this.p;
        if (i9 == 1) {
            iArr[i8] = 2;
        } else if (i9 == 2) {
            int iZ2 = Z(true);
            if (iZ2 != 44) {
                if (iZ2 != 59) {
                    if (iZ2 == 93) {
                        this.u = 4;
                        return 4;
                    }
                    l0("Unterminated array");
                    throw null;
                }
                j();
            }
        } else {
            if (i9 == 3 || i9 == 5) {
                iArr[i8] = 4;
                if (i9 == 5 && (iZ = Z(true)) != 44) {
                    if (iZ != 59) {
                        if (iZ == 125) {
                            this.u = 2;
                            return 2;
                        }
                        l0("Unterminated object");
                        throw null;
                    }
                    j();
                }
                int iZ3 = Z(true);
                if (iZ3 == 34) {
                    this.u = 13;
                    return 13;
                }
                if (iZ3 == 39) {
                    j();
                    this.u = 12;
                    return 12;
                }
                if (iZ3 == 125) {
                    if (i9 != 5) {
                        this.u = 2;
                        return 2;
                    }
                    l0("Expected name");
                    throw null;
                }
                j();
                this.q--;
                if (K((char) iZ3)) {
                    this.u = 14;
                    return 14;
                }
                l0("Expected name");
                throw null;
            }
            if (i9 == 4) {
                iArr[i8] = 5;
                int iZ4 = Z(true);
                if (iZ4 != 58) {
                    if (iZ4 != 61) {
                        l0("Expected ':'");
                        throw null;
                    }
                    j();
                    if (this.q < this.r || u(1)) {
                        int i10 = this.q;
                        if (cArr[i10] == '>') {
                            this.q = i10 + 1;
                        }
                    }
                }
            } else if (i9 == 6) {
                if (this.o) {
                    Z(true);
                    int i11 = this.q;
                    this.q = i11 - 1;
                    if (i11 + 4 <= this.r || u(5)) {
                        int i12 = this.q;
                        if (cArr[i12] == ')' && cArr[i12 + 1] == ']' && cArr[i12 + 2] == '}' && cArr[i12 + 3] == '\'' && cArr[i12 + 4] == '\n') {
                            this.q = i12 + 5;
                        }
                    }
                }
                this.y[this.z - 1] = 7;
            } else if (i9 == 7) {
                if (Z(false) == -1) {
                    this.u = 17;
                    return 17;
                }
                j();
                this.q--;
            } else if (i9 == 8) {
                kf2.o("JsonReader is closed");
                return 0;
            }
        }
        int iZ5 = Z(true);
        if (iZ5 == 34) {
            this.u = 9;
            return 9;
        }
        if (iZ5 == 39) {
            j();
            this.u = 8;
            return 8;
        }
        if (iZ5 == 44 || iZ5 == 59) {
            i = 1;
        } else {
            if (iZ5 == 91) {
                this.u = 3;
                return 3;
            }
            if (iZ5 != 93) {
                if (iZ5 == 123) {
                    this.u = 1;
                    return 1;
                }
                int i13 = this.q - 1;
                this.q = i13;
                char c5 = cArr[i13];
                if (c5 == 't' || c5 == 'T') {
                    str = "true";
                    str2 = "TRUE";
                    i2 = 5;
                } else {
                    if (c5 != 'f' && c5 != 'F') {
                        if (c5 != 'n' && c5 != 'N') {
                            i3 = 0;
                            break;
                        }
                        str = "null";
                        str2 = "NULL";
                        i2 = 7;
                        if (i3 != 0) {
                            return i3;
                        }
                        i4 = this.q;
                        i5 = this.r;
                        z = true;
                        i6 = 0;
                        long j = 0;
                        boolean z3 = false;
                        c2 = 0;
                        while (true) {
                            if (i4 + i6 != i5) {
                                c3 = cArr[i4 + i6];
                                if (c3 != '+') {
                                    if (c3 != 'E' || c3 == 'e') {
                                        if (c2 != 2 || c2 == 4) {
                                            c2 = 5;
                                            i6++;
                                            z2 = true;
                                        }
                                    } else if (c3 == '-') {
                                        if (c2 == 0) {
                                            z3 = true;
                                            c2 = 1;
                                        } else {
                                            if (c2 != 5) {
                                            }
                                            c2 = 6;
                                        }
                                        i6++;
                                        z2 = true;
                                    } else if (c3 != '.') {
                                        if (c3 >= '0' && c3 <= '9') {
                                            if (c2 == z2 || c2 == 0) {
                                                j = -(c3 - '0');
                                                c2 = 2;
                                            } else if (c2 != 2) {
                                                long j2 = j;
                                                if (c2 == 3) {
                                                    j = j2;
                                                    c2 = 4;
                                                } else if (c2 == 5 || c2 == 6) {
                                                    j = j2;
                                                    c2 = 7;
                                                } else {
                                                    j = j2;
                                                }
                                            } else if (j != 0) {
                                                long j3 = j;
                                                long j4 = (10 * j) - ((long) (c3 - '0'));
                                                z &= j3 > -922337203685477580L || (j3 == -922337203685477580L && j4 < j3);
                                                j = j4;
                                            }
                                            i6++;
                                            z2 = true;
                                        } else if (!K(c3)) {
                                            c4 = 2;
                                            if (c2 != 2) {
                                                if (c2 != c4 || c2 == 4 || c2 == 7) {
                                                    this.w = i6;
                                                    i7 = 16;
                                                    this.u = 16;
                                                }
                                            } else if (z || ((j == Long.MIN_VALUE && !z3) || (j == 0 && z3))) {
                                                c4 = 2;
                                                if (c2 != c4) {
                                                }
                                                this.w = i6;
                                                i7 = 16;
                                                this.u = 16;
                                            } else {
                                                long j5 = j;
                                                if (!z3) {
                                                    j5 = -j5;
                                                }
                                                this.v = j5;
                                                this.q += i6;
                                                i7 = 15;
                                                this.u = 15;
                                            }
                                        }
                                    } else if (c2 == 2) {
                                        c2 = 3;
                                        i6++;
                                        z2 = true;
                                    }
                                    if (i7 != 0) {
                                        return i7;
                                    }
                                    if (K(cArr[this.q])) {
                                        l0("Expected value");
                                        throw null;
                                    }
                                    j();
                                    this.u = 10;
                                    return 10;
                                }
                                if (c2 != 5) {
                                }
                                c2 = 6;
                                i6++;
                                z2 = true;
                            } else if (i6 != cArr.length) {
                                if (!u(i6 + 1)) {
                                    i4 = this.q;
                                    i5 = this.r;
                                    c3 = cArr[i4 + i6];
                                    if (c3 != '+') {
                                        if (c3 != 'E') {
                                            if (c2 != 2) {
                                            }
                                            c2 = 5;
                                            i6++;
                                            z2 = true;
                                        } else {
                                            if (c2 != 2) {
                                            }
                                            c2 = 5;
                                            i6++;
                                            z2 = true;
                                        }
                                        if (i7 != 0) {
                                            return i7;
                                        }
                                        if (K(cArr[this.q])) {
                                            l0("Expected value");
                                            throw null;
                                        }
                                        j();
                                        this.u = 10;
                                        return 10;
                                    }
                                    if (c2 != 5) {
                                    }
                                    c2 = 6;
                                    i6++;
                                    z2 = true;
                                }
                                c4 = 2;
                                if (c2 != 2) {
                                    if (c2 != c4) {
                                    }
                                    this.w = i6;
                                    i7 = 16;
                                    this.u = 16;
                                } else {
                                    if (z) {
                                    }
                                    c4 = 2;
                                    if (c2 != c4) {
                                    }
                                    this.w = i6;
                                    i7 = 16;
                                    this.u = 16;
                                }
                                if (i7 != 0) {
                                    return i7;
                                }
                                if (K(cArr[this.q])) {
                                    l0("Expected value");
                                    throw null;
                                }
                                j();
                                this.u = 10;
                                return 10;
                            }
                            i7 = 0;
                            if (i7 != 0) {
                                return i7;
                            }
                            if (K(cArr[this.q])) {
                                l0("Expected value");
                                throw null;
                            }
                            j();
                            this.u = 10;
                            return 10;
                        }
                    }
                    str = "false";
                    str2 = "FALSE";
                    i2 = 6;
                }
                int length = str.length();
                int i14 = 1;
                while (true) {
                    int i15 = this.q;
                    int i16 = this.r;
                    if (i14 >= length) {
                        if ((i15 + length >= i16 && !u(length + 1)) || !K(cArr[this.q + length])) {
                            this.q += length;
                            this.u = i2;
                            i3 = i2;
                            break;
                        }
                        break;
                    }
                    if ((i15 + i14 < i16 || u(i14 + 1)) && ((c = cArr[this.q + i14]) == str.charAt(i14) || c == str2.charAt(i14))) {
                        i14++;
                    }
                    i3 = 0;
                    break;
                }
                if (i3 != 0) {
                    return i3;
                }
                i4 = this.q;
                i5 = this.r;
                z = true;
                i6 = 0;
                long j6 = 0;
                boolean z4 = false;
                c2 = 0;
                while (true) {
                    if (i4 + i6 != i5) {
                        c3 = cArr[i4 + i6];
                        if (c3 != '+') {
                            if (c3 != 'E') {
                                if (c2 != 2) {
                                }
                                c2 = 5;
                                i6++;
                                z2 = true;
                            } else {
                                if (c2 != 2) {
                                }
                                c2 = 5;
                                i6++;
                                z2 = true;
                            }
                            if (i7 != 0) {
                                return i7;
                            }
                            if (K(cArr[this.q])) {
                                l0("Expected value");
                                throw null;
                            }
                            j();
                            this.u = 10;
                            return 10;
                        }
                        if (c2 != 5) {
                        }
                        c2 = 6;
                        i6++;
                        z2 = true;
                    } else if (i6 != cArr.length) {
                        if (!u(i6 + 1)) {
                            i4 = this.q;
                            i5 = this.r;
                            c3 = cArr[i4 + i6];
                            if (c3 != '+') {
                                if (c3 != 'E') {
                                    if (c2 != 2) {
                                    }
                                    c2 = 5;
                                    i6++;
                                    z2 = true;
                                } else {
                                    if (c2 != 2) {
                                    }
                                    c2 = 5;
                                    i6++;
                                    z2 = true;
                                }
                                if (i7 != 0) {
                                    return i7;
                                }
                                if (K(cArr[this.q])) {
                                    l0("Expected value");
                                    throw null;
                                }
                                j();
                                this.u = 10;
                                return 10;
                            }
                            if (c2 != 5) {
                            }
                            c2 = 6;
                            i6++;
                            z2 = true;
                        }
                        c4 = 2;
                        if (c2 != 2) {
                            if (c2 != c4) {
                            }
                            this.w = i6;
                            i7 = 16;
                            this.u = 16;
                        } else {
                            if (z) {
                            }
                            c4 = 2;
                            if (c2 != c4) {
                            }
                            this.w = i6;
                            i7 = 16;
                            this.u = 16;
                        }
                        if (i7 != 0) {
                            return i7;
                        }
                        if (K(cArr[this.q])) {
                            l0("Expected value");
                            throw null;
                        }
                        j();
                        this.u = 10;
                        return 10;
                    }
                    i7 = 0;
                    if (i7 != 0) {
                        return i7;
                    }
                    if (K(cArr[this.q])) {
                        l0("Expected value");
                        throw null;
                    }
                    j();
                    this.u = 10;
                    return 10;
                }
            }
            i = 1;
            if (i9 == 1) {
                this.u = 4;
                return 4;
            }
        }
        if (i9 != i && i9 != 2) {
            l0("Unexpected value");
            throw null;
        }
        j();
        this.q -= i;
        this.u = 7;
        return 7;
    }

    public void q() throws IOException {
        int iN = this.u;
        if (iN == 0) {
            iN = n();
        }
        if (iN != 4) {
            er1.j(b11.x(e0()), M(), "Expected END_ARRAY but was ");
            return;
        }
        int i = this.z;
        this.z = i - 1;
        int[] iArr = this.B;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.u = 0;
    }

    public void s() throws IOException {
        int iN = this.u;
        if (iN == 0) {
            iN = n();
        }
        if (iN != 2) {
            er1.j(b11.x(e0()), M(), "Expected END_OBJECT but was ");
            return;
        }
        int i = this.z;
        int i2 = i - 1;
        this.z = i2;
        this.A[i2] = null;
        int[] iArr = this.B;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.u = 0;
    }

    public String toString() {
        return getClass().getSimpleName().concat(M());
    }

    public final boolean u(int i) throws IOException {
        int i2;
        int i3;
        int i4 = this.t;
        int i5 = this.q;
        this.t = i4 - i5;
        int i6 = this.r;
        char[] cArr = this.p;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.r = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.r = 0;
        }
        this.q = 0;
        do {
            int i8 = this.r;
            int i9 = this.n.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.r + i9;
            this.r = i2;
            if (this.s == 0 && (i3 = this.t) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.q++;
                this.t = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    public String v() {
        return F(false);
    }
}
