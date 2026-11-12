package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class az4 implements zn4 {
    public final be3 n = new be3();
    public final boolean o;
    public final int p;
    public final int q;
    public final String r;
    public final float s;
    public final int t;

    public az4(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.p = 0;
            this.q = -1;
            this.r = "sans-serif";
            this.o = false;
            this.s = 0.85f;
            this.t = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.p = bArr[24];
        this.q = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.r = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.t = i;
        boolean z = (bArr[0] & 32) != 0;
        this.o = z;
        if (z) {
            this.s = f35.i(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.s = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void d(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zn4
    public final void c(byte[] bArr, int i, int i2, yn4 yn4Var, wc0 wc0Var) {
        String strY;
        int i3;
        be3 be3Var = this.n;
        be3Var.L(i + i2, bArr);
        be3Var.N(i);
        int i4 = 1;
        int i5 = 0;
        int i6 = 2;
        rr2.l(be3Var.a() >= 2);
        int iH = be3Var.H();
        if (iH == 0) {
            strY = "";
        } else {
            int i7 = be3Var.b;
            Charset charsetJ = be3Var.J();
            int i8 = iH - (be3Var.b - i7);
            if (charsetJ == null) {
                charsetJ = StandardCharsets.UTF_8;
            }
            strY = be3Var.y(i8, charsetJ);
        }
        if (strY.isEmpty()) {
            vw1 vw1Var = yw1.o;
            wc0Var.accept(new lg0(-9223372036854775807L, -9223372036854775807L, gy3.r));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strY);
        d(spannableStringBuilder, this.p, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.q, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.r;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fI = this.s;
        while (be3Var.a() >= 8) {
            int i9 = be3Var.b;
            int iM = be3Var.m();
            int iM2 = be3Var.m();
            if (iM2 == 1937013100) {
                rr2.l(be3Var.a() >= i6 ? i4 : i5);
                int iH2 = be3Var.H();
                int i10 = i5;
                while (i10 < iH2) {
                    rr2.l(be3Var.a() >= 12 ? i4 : i5);
                    int iH3 = be3Var.H();
                    int iH4 = be3Var.H();
                    be3Var.O(i6);
                    int i11 = i10;
                    int iA = be3Var.A();
                    be3Var.O(i4);
                    int iM3 = be3Var.m();
                    if (iH4 > spannableStringBuilder.length()) {
                        StringBuilder sbJ = f34.j(iH4, "Truncating styl end (", ") to cueText.length() (");
                        sbJ.append(spannableStringBuilder.length());
                        sbJ.append(").");
                        l93.q0("Tx3gParser", sbJ.toString());
                        iH4 = spannableStringBuilder.length();
                    }
                    if (iH3 >= iH4) {
                        l93.q0("Tx3gParser", b11.n("Ignoring styl with start (", ") >= end (", iH3, iH4, ")."));
                    } else {
                        int i12 = iH4;
                        d(spannableStringBuilder, iA, this.p, iH3, i12, 0);
                        a(spannableStringBuilder, iM3, this.q, iH3, i12, 0);
                    }
                    i10 = i11 + 1;
                    i4 = 1;
                    i5 = 0;
                    i6 = 2;
                }
                i3 = i6;
            } else if (iM2 == 1952608120 && this.o) {
                i3 = 2;
                rr2.l(be3Var.a() >= 2);
                fI = f35.i(be3Var.H() / this.t, 0.0f, 0.95f);
            } else {
                i3 = 2;
            }
            be3Var.N(i9 + iM);
            i6 = i3;
            i4 = 1;
            i5 = 0;
        }
        wc0Var.accept(new lg0(-9223372036854775807L, -9223372036854775807L, yw1.o(new ig0(spannableStringBuilder, null, null, null, fI, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0))));
    }
}
