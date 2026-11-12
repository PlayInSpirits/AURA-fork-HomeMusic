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
    public final be3 n;
    public final boolean o;
    public final int p;
    public final int q;
    public final String r;
    public final float s;
    public final int t;

    public az4(List r9) {
        this.n = new be3();
        String r2 = "sans-serif";
        boolean r3 = false;
        if (r9.size() == 1) goto L5;
    L20:
        this.p = 0;
        this.q = -1;
        this.r = "sans-serif";
        this.o = false;
        this.s = 0.85f;
        this.t = -1;
        return;
    L5:
        if (((byte[]) r9.get(0)).length != 48) goto L7;
    L8:
        byte[] r10 = (byte[]) r9.get(0);
        this.p = r10[24];
        this.q = ((((r10[26] & 255) << 24) | ((r10[27] & 255) << 16)) | ((r10[28] & 255) << 8)) | (r10[29] & 255);
        if ("Serif".equals(new String(r10, 43, r10.length - 43, StandardCharsets.UTF_8)) == false) goto L11;
        r2 = "serif";
    L11:
        this.r = r2;
        int r0 = r10[25] * 20;
        this.t = r0;
        if ((r10[0] & 32) == 0) goto L14;
        r3 = true;
    L14:
        this.o = r3;
        if (r3 == false) goto L18;
        this.s = f35.i(((r10[11] & 255) | ((r10[10] & 255) << 8)) / r0, 0.0f, 0.95f);
        return;
    L18:
        this.s = 0.85f;
        return;
    L7:
        if (((byte[]) r9.get(0)).length != 53) goto L20;
        goto L8
    }

    public static void a(SpannableStringBuilder r0, int r1, int r2, int r3, int r4, int r5) {
        if (r1 == r2) goto L5;
        int r6 = (r1 & 255) << 24;
        r0.setSpan(new ForegroundColorSpan((r1 >>> 8) | r6), r3, r4, r5 | 33);
        return;
    }

    public static void d(SpannableStringBuilder r5, int r6, int r7, int r8, int r9, int r10) {
        if (r6 == r7) goto L28;
        int r11 = r10 | 33;
        boolean r1 = true;
        if ((r6 & 1) == 0) goto L6;
        boolean r12 = true;
    L8:
        if ((r6 & 2) == 0) goto L10;
        boolean r2 = true;
    L11:
        if (r12 == false) goto L15;
        if (r2 == false) goto L14;
        r5.setSpan(new StyleSpan(3), r8, r9, r11);
    L18:
        if ((r6 & 4) != 0) goto L21;
        r1 = false;
    L21:
        if (r1 == false) goto L23;
        r5.setSpan(new UnderlineSpan(), r8, r9, r11);
    L23:
        if (r1 == true) goto L29;
        if (r12 == true) goto L30;
        if (r2 == true) goto L31;
        r5.setSpan(new StyleSpan(0), r8, r9, r11);
        return;
    L31:
        return;
    L30:
        return;
    L29:
        return;
    L14:
        r5.setSpan(new StyleSpan(1), r8, r9, r11);
        goto L18
    L15:
        if (r2 == false) goto L18;
        r5.setSpan(new StyleSpan(2), r8, r9, r11);
        goto L18
    L10:
        r2 = false;
        goto L11
    L6:
        r12 = false;
        goto L8
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zn4
    public final void c(byte[] r29, int r30, int r31, yn4 r32, wc0 r33) {
        be3 r4 = this.n;
        r4.L(r30 + r31, r29);
        r4.N(r30);
        int r3 = 1;
        int r5 = 0;
        int r6 = 2;
        if (r4.a() < 2) goto L5;
        boolean r1 = true;
    L6:
        rr2.l(r1);
        int r2 = r4.H();
        if (r2 != 0) goto L9;
        String r7 = "";
    L15:
        if (r7.isEmpty() == false) goto L18;
        vw1 r0 = yw1.o;
        r33.accept(new lg0(-9223372036854775807L, -9223372036854775807L, gy3.r));
        return;
    L18:
        SpannableStringBuilder r9 = new SpannableStringBuilder(r7);
        d(r9, this.p, 0, 0, r9.length(), 16711680);
        a(r9, this.q, -1, 0, r9.length(), 16711680);
        int r8 = r9.length();
        String r10 = this.r;
        if (r10 == "sans-serif") goto L21;
        r9.setSpan(new TypefaceSpan(r10), 0, r8, 16711713);
    L21:
        float r11 = this.s;
    L23:
        if (r4.a() < 8) goto L55;
        int r12 = r4.b;
        int r13 = r4.m();
        int r14 = r4.m();
        if (r14 != 1937013100) goto L45;
        if (r4.a() < r6) goto L29;
        boolean r15 = r3;
    L30:
        rr2.l(r15);
        int r16 = r4.H();
        int r17 = r5;
    L31:
        if (r17 >= r16) goto L43;
        if (r4.a() < 12) goto L35;
        boolean r18 = r3;
    L36:
        rr2.l(r18);
        int r19 = r4.H();
        int r110 = r4.H();
        r4.O(r6);
        int r111 = r17;
        int r112 = r4.A();
        r4.O(r3);
        int r113 = r4.m();
        if (r110 <= r9.length()) goto L39;
        StringBuilder r20 = f34.j(r110, "Truncating styl end (", ") to cueText.length() (");
        r20.append(r9.length());
        r20.append(").");
        l93.q0("Tx3gParser", r20.toString());
        r110 = r9.length();
    L39:
        if (r19 < r110) goto L41;
        l93.q0("Tx3gParser", b11.n("Ignoring styl with start (", ") >= end (", r19, r110, ")."));
    L42:
        r17 = r111 + 1;
        r3 = 1;
        r5 = 0;
        r6 = 2;
        goto L31
    L41:
        int r114 = r110;
        d(r9, r112, this.p, r19, r114, 0);
        a(r9, r113, this.q, r19, r114, 0);
        goto L42
    L35:
        r18 = r5;
        goto L36
    L43:
        int r21 = r6;
    L54:
        r4.N(r12 + r13);
        r6 = r21;
        r3 = 1;
        r5 = 0;
        goto L23
    L29:
        r15 = r5;
        goto L30
    L45:
        if (r14 == 1952608120) goto L47;
    L53:
        r21 = 2;
        goto L54
    L47:
        if (this.o == false) goto L53;
        r21 = 2;
        if (r4.a() < 2) goto L51;
        boolean r22 = true;
    L52:
        rr2.l(r22);
        r11 = f35.i(r4.H() / this.t, 0.0f, 0.95f);
        goto L54
    L51:
        r22 = false;
        goto L52
    L55:
        r33.accept(new lg0(-9223372036854775807L, -9223372036854775807L, yw1.o(new ig0(r9, null, null, null, r11, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0))));
        return;
    L9:
        int r23 = r4.b;
        Charset r24 = r4.J();
        int r25 = r2 - (r4.b - r23);
        if (r24 != null) goto L13;
        r24 = StandardCharsets.UTF_8;
    L13:
        r7 = r4.y(r25, r24);
        goto L15
    L5:
        r1 = false;
        goto L6
    }
}
