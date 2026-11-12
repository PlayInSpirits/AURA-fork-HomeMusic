package defpackage;

import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oi2 implements pv2 {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    public oi2(String r6, byte[] r7, int r8, int r9) {
        r6.getClass();
        boolean r2 = false;
        byte r4 = -1;
        switch(r6.hashCode()) {
            case -1949883051: goto L22;
            case -269399509: goto L18;
            case 1011693540: goto L14;
            case 1098277265: goto L10;
            case 2002123038: goto L6;
            default: goto L25;
        };
    L25:
        switch(r4) {
            case 0: goto L46;
            case 1: goto L37;
            case 2: goto L31;
            case 3: goto L31;
            case 4: goto L27;
            default: goto L51;
        };
    L27:
        if (r9 != 0) goto L29;
        r2 = true;
    L29:
        rr2.l(r2);
    L51:
        this.a = r6;
        this.b = r7;
        this.c = r8;
        this.d = r9;
        return;
    L31:
        if (r9 == 78) goto L33;
    L35:
        rr2.l(r2);
        goto L51
    L33:
        if (r7.length != 8) goto L35;
        r2 = true;
        goto L35
    L37:
        if (r9 == 75) goto L39;
    L44:
        rr2.l(r2);
        goto L51
    L39:
        if (r7.length != 1) goto L44;
        byte r0 = r7[0];
        if (r0 == 0) goto L43;
        if (r0 != 1) goto L44;
    L43:
        r2 = true;
        goto L44
    L46:
        if (r9 == 23) goto L48;
    L50:
        rr2.l(r2);
        goto L51
    L48:
        if (r7.length != 4) goto L50;
        r2 = true;
        goto L50
    L6:
        if (r6.equals("auxiliary.tracks.map") == false) goto L25;
        r4 = 4;
        goto L25
    L10:
        if (r6.equals("auxiliary.tracks.offset") == false) goto L25;
        r4 = 3;
        goto L25
    L14:
        if (r6.equals("auxiliary.tracks.length") == false) goto L25;
        r4 = 2;
        goto L25
    L18:
        if (r6.equals("auxiliary.tracks.interleaved") == false) goto L25;
        r4 = 1;
        goto L25
    L22:
        if (r6.equals("com.android.capture.fps") == false) goto L25;
        r4 = 0;
        goto L25
    }

    public final ArrayList d() {
        rr2.v("Metadata is not an auxiliary tracks map", this.a.equals("auxiliary.tracks.map"));
        byte[] r4 = this.b;
        byte r0 = r4[1];
        ArrayList r1 = new ArrayList();
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        r1.add(Integer.valueOf(r4[r2 + 2]));
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L19:
        return false;
    L8:
        if (oi2.class != r5.getClass()) goto L19;
        oi2 r6 = (oi2) r5;
        if (this.a.equals(r6.a) == false) goto L19;
        if (Arrays.equals(this.b, r6.b) == false) goto L19;
        if (this.c != r6.c) goto L19;
        if (this.d != r6.d) goto L19;
        return true;
    }

    public final int hashCode() {
        int r0 = f34.e(this.a, 527, 31);
        return ((((Arrays.hashCode(this.b) + r0) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        int r0 = this.d;
        if (r0 == 0) goto L28;
        if (r0 != 1) goto L6;
        byte[] r1 = this.b;
        String r2 = f35.a;
        String r3 = new String(r1, StandardCharsets.UTF_8);
    L84:
        return "mdta: key=" + this.a + ", value=" + r3;
    L6:
        if (r0 != 23) goto L8;
        byte[] r4 = this.b;
        if (r4.length < 4) goto L24;
        boolean r5 = true;
    L25:
        rr2.i(r4.length, 4, "array too small: %s < %s", r5);
        r3 = String.valueOf(Float.intBitsToFloat(jz4.u(r4[0], r4[1], r4[2], r4[3])));
        goto L84
    L24:
        r5 = false;
        goto L25
    L8:
        if (r0 != 67) goto L10;
        byte[] r6 = this.b;
        if (r6.length < 4) goto L19;
        boolean r7 = true;
    L20:
        rr2.i(r6.length, 4, "array too small: %s < %s", r7);
        r3 = String.valueOf(jz4.u(r6[0], r6[1], r6[2], r6[3]));
        goto L84
    L19:
        r7 = false;
        goto L20
    L10:
        if (r0 != 75) goto L12;
        r3 = String.valueOf(this.b[0] & 255);
        goto L84
    L12:
        if (r0 != 78) goto L30;
        r3 = String.valueOf(new be3(this.b).G());
    L30:
        byte[] r8 = this.b;
        String r9 = f35.a;
        mp r10 = op.d;
        op r11 = r10.c;
        if (r11 != null) goto L80;
        lp r12 = r10.a;
        char[] r13 = r12.b;
        int r14 = r13.length;
        int r15 = 0;
    L33:
        if (r15 >= r14) goto L76;
        if (rr2.J(r13[r15]) == true) goto L36;
        r15 = r15 + 1;
        goto L33
    L36:
        int r16 = r13.length;
        int r17 = 0;
    L37:
        if (r17 >= r16) goto L44;
        char r18 = r13[r17];
        if (r18 < 'a') goto L43;
        if (r18 > 'z') goto L43;
        boolean r19 = true;
    L45:
        rr2.v("Cannot call lowerCase() on a mixed-case alphabet", !r19);
        char[] r20 = new char[r13.length];
        int r21 = 0;
    L47:
        if (r21 >= r13.length) goto L52;
        char r22 = r13[r21];
        if (rr2.J(r22) == false) goto L51;
        r22 = (char) (r22 ^ ' ');
    L51:
        r20[r21] = r22;
        r21 = r21 + 1;
        goto L47
    L52:
        lp r23 = new lp(b11.q(new StringBuilder(), r12.a, ".lowerCase()"), r20);
        if (r12.h == false) goto L73;
        byte[] r24 = r23.g;
        if (r23.h == true) goto L73;
        byte[] r25 = Arrays.copyOf(r24, r24.length);
        int r26 = 65;
    L59:
        if (r26 > 90) goto L72;
        int r27 = r26 | 32;
        byte r28 = r24[r26];
        byte r110 = r24[r27];
        if (r28 != (-1)) goto L63;
        r25[r26] = r110;
    L69:
        r26 = r26 + 1;
        goto L59
    L63:
        if (r110 != (-1)) goto L65;
        boolean r111 = true;
    L66:
        char r112 = (char) r26;
        char r113 = (char) r27;
        if (r111 == false) goto L70;
        r25[r27] = r28;
        goto L69
    L70:
        kf2.o(gh0.s("Can't ignoreCase() since '%s' and '%s' encode different values", new Object[]{Character.valueOf(r112), Character.valueOf(r113)}));
        return null;
    L65:
        r111 = false;
        goto L66
    L72:
        r12 = new lp(b11.q(new StringBuilder(), r23.a, ".ignoreCase()"), r23.b, r25, true);
    L73:
        r12 = r23;
    L43:
        r17 = r17 + 1;
        goto L37
    L44:
        r19 = false;
    L76:
        if (r12 != r10.a) goto L78;
        r11 = r10;
    L79:
        r10.c = r11;
        goto L80
    L78:
        r11 = new mp(r12);
    L80:
        int r29 = r8.length;
        rr2.u(0, r29, r8.length);
        lp r30 = r11.a;
        int r31 = r30.e;
        int r32 = r30.f;
        RoundingMode r33 = RoundingMode.CEILING;
        StringBuilder r34 = new StringBuilder(h12.m(r29, r32) * r31);
        r11.b(r34, r8, r29);     // Catch: IOException -> L85
        r3 = r34.toString();
    L85:
        e = move-exception;
        throw new AssertionError(e);
    L28:
        if (this.a.equals("auxiliary.tracks.map") == false) goto L30;
        ArrayList r35 = d();
        StringBuilder r36 = xa3.i("track types = ");
        new uc0(String.valueOf(',')).a(r36, r35.iterator());
        r3 = r36.toString();
        goto L84
    }
}
