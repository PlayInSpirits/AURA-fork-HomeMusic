package defpackage;

import android.text.TextUtils;
import androidx.media3.common.ParserException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x95 implements k51 {
    public static final Pattern i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern j = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final iu4 b;
    public final xn4 d;
    public final boolean e;
    public m51 f;
    public int h;
    public final be3 c = new be3();
    public byte[] g = new byte[1024];

    public x95(String str, iu4 iu4Var, xn4 xn4Var, boolean z) {
        this.a = str;
        this.b = iu4Var;
        this.d = xn4Var;
        this.e = z;
    }

    @Override // defpackage.k51
    public final void a() {
    }

    @Override // defpackage.k51
    public final int b(l51 l51Var, t71 t71Var) throws ParserException {
        String strN;
        this.f.getClass();
        int length = (int) l51Var.getLength();
        int i2 = this.h;
        byte[] bArr = this.g;
        if (i2 == bArr.length) {
            this.g = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.g;
        int i3 = this.h;
        int i4 = l51Var.read(bArr2, i3, bArr2.length - i3);
        if (i4 != -1) {
            int i5 = this.h + i4;
            this.h = i5;
            if (length == -1 || i5 != length) {
                return 0;
            }
        }
        be3 be3Var = new be3(this.g);
        y95.d(be3Var);
        String strN2 = be3Var.n(StandardCharsets.UTF_8);
        long jA0 = 0;
        long jC = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(strN2)) {
                while (true) {
                    String strN3 = be3Var.n(StandardCharsets.UTF_8);
                    if (strN3 == null) {
                        break;
                    }
                    if (y95.a.matcher(strN3).matches()) {
                        do {
                            strN = be3Var.n(StandardCharsets.UTF_8);
                            if (strN == null) {
                                break;
                            }
                        } while (!strN.isEmpty());
                    } else {
                        Matcher matcher2 = w95.a.matcher(strN3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    g(0L);
                    return -1;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jC2 = y95.c(strGroup);
                String str = f35.a;
                long jB = this.b.b(f35.a0((jA0 + jC2) - jC, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                wv4 wv4VarG = g(jB - jC2);
                byte[] bArr3 = this.g;
                int i6 = this.h;
                be3 be3Var2 = this.c;
                be3Var2.L(i6, bArr3);
                wv4VarG.e(this.h, be3Var2);
                wv4VarG.a(jB, 1, this.h, 0, null);
                return -1;
            }
            if (strN2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = i.matcher(strN2);
                if (!matcher3.find()) {
                    throw ParserException.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strN2));
                }
                Matcher matcher4 = j.matcher(strN2);
                if (!matcher4.find()) {
                    throw ParserException.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strN2));
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jC = y95.c(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                long j2 = Long.parseLong(strGroup3);
                String str2 = f35.a;
                jA0 = f35.a0(j2, 1000000L, 90000L, RoundingMode.DOWN);
            }
            strN2 = be3Var.n(StandardCharsets.UTF_8);
        }
    }

    @Override // defpackage.k51
    public final boolean c(l51 l51Var) {
        rk0 rk0Var = (rk0) l51Var;
        rk0Var.e(this.g, 0, 6, false);
        byte[] bArr = this.g;
        be3 be3Var = this.c;
        be3Var.L(6, bArr);
        if (y95.a(be3Var)) {
            return true;
        }
        rk0Var.e(this.g, 6, 3, false);
        be3Var.L(9, this.g);
        return y95.a(be3Var);
    }

    @Override // defpackage.k51
    public final void d(long j2, long j3) {
        throw new IllegalStateException();
    }

    @Override // defpackage.k51
    public final void f(m51 m51Var) {
        if (this.e) {
            m51Var = new ll(m51Var, this.d);
        }
        this.f = m51Var;
        m51Var.w(new bo(-9223372036854775807L));
    }

    public final wv4 g(long j2) {
        wv4 wv4VarT = this.f.t(0, 3);
        sb1 sb1Var = new sb1();
        sb1Var.m = lw2.m("text/vtt");
        sb1Var.d = this.a;
        sb1Var.r = j2;
        f34.l(sb1Var, wv4VarT);
        this.f.p();
        return wv4VarT;
    }
}
