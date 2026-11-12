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

    public oi2(String str, byte[] bArr, int i, int i2) {
        byte b;
        str.getClass();
        boolean z = false;
        switch (str) {
            case "com.android.capture.fps":
                if (i2 == 23 && bArr.length == 4) {
                    z = true;
                }
                rr2.l(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i2 == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                rr2.l(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i2 == 78 && bArr.length == 8) {
                    z = true;
                }
                rr2.l(z);
                break;
            case "auxiliary.tracks.map":
                rr2.l(i2 == 0);
                break;
        }
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }

    public final ArrayList d() {
        rr2.v("Metadata is not an auxiliary tracks map", this.a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.b;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2]));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && oi2.class == obj.getClass()) {
            oi2 oi2Var = (oi2) obj;
            if (this.a.equals(oi2Var.a) && Arrays.equals(this.b, oi2Var.b) && this.c == oi2Var.c && this.d == oi2Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + f34.e(this.a, 527, 31)) * 31) + this.c) * 31) + this.d;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:54:0x0117  */
    /* JADX WARN: Code duplicated, block: B:57:0x011e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0129  */
    /* JADX WARN: Code duplicated, block: B:62:0x0132  */
    /* JADX WARN: Code duplicated, block: B:63:0x0135 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0137  */
    /* JADX WARN: Code duplicated, block: B:65:0x0139  */
    /* JADX WARN: Code duplicated, block: B:68:0x013e  */
    /* JADX WARN: Code duplicated, block: B:73:0x016f A[EDGE_INSN: B:73:0x016f->B:75:0x0175 BREAK  A[LOOP:0: B:33:0x00c6->B:74:0x0171]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0171 A[LOOP:0: B:33:0x00c6->B:74:0x0171, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x0179  */
    /* JADX WARN: Code duplicated, block: B:78:0x017b  */
    /* JADX WARN: Code duplicated, block: B:91:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x00c0, please report this as an issue */
    public final String toString() {
        String string;
        mp mpVar;
        op mpVar2;
        lp lpVar;
        char[] cArr;
        int i;
        int length;
        int i2;
        boolean z;
        char[] cArr2;
        int i3;
        lp lpVar2;
        byte[] bArr;
        byte[] bArrCopyOf;
        int i4;
        int i5;
        byte b;
        byte b2;
        boolean z2;
        char c;
        char c2;
        char c3;
        char c4;
        int i6 = this.d;
        if (i6 != 0) {
            if (i6 == 1) {
                byte[] bArr2 = this.b;
                String str = f35.a;
                string = new String(bArr2, StandardCharsets.UTF_8);
            } else if (i6 == 23) {
                byte[] bArr3 = this.b;
                rr2.i(bArr3.length, 4, "array too small: %s < %s", bArr3.length >= 4);
                string = String.valueOf(Float.intBitsToFloat(jz4.u(bArr3[0], bArr3[1], bArr3[2], bArr3[3])));
            } else if (i6 == 67) {
                byte[] bArr4 = this.b;
                rr2.i(bArr4.length, 4, "array too small: %s < %s", bArr4.length >= 4);
                string = String.valueOf(jz4.u(bArr4[0], bArr4[1], bArr4[2], bArr4[3]));
            } else if (i6 == 75) {
                string = String.valueOf(this.b[0] & 255);
            } else if (i6 != 78) {
                byte[] bArr5 = this.b;
                String str2 = f35.a;
                mpVar = op.d;
                mpVar2 = mpVar.c;
                if (mpVar2 == null) {
                    lpVar = mpVar.a;
                    cArr = lpVar.b;
                    for (char c5 : cArr) {
                        if (rr2.J(c5)) {
                            length = cArr.length;
                            i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    z = false;
                                    break;
                                }
                                c4 = cArr[i2];
                                if (c4 < 'a' && c4 <= 'z') {
                                    z = true;
                                    break;
                                }
                                i2++;
                            }
                            rr2.v("Cannot call lowerCase() on a mixed-case alphabet", !z);
                            cArr2 = new char[cArr.length];
                            for (i3 = 0; i3 < cArr.length; i3++) {
                                c3 = cArr[i3];
                                if (rr2.J(c3)) {
                                    c3 = (char) (c3 ^ ' ');
                                }
                                cArr2[i3] = c3;
                            }
                            lpVar2 = new lp(b11.q(new StringBuilder(), lpVar.a, ".lowerCase()"), cArr2);
                            if (lpVar.h) {
                                lpVar = lpVar2;
                                break;
                            }
                            bArr = lpVar2.g;
                            if (lpVar2.h) {
                                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                                for (i4 = 65; i4 <= 90; i4++) {
                                    i5 = i4 | 32;
                                    b = bArr[i4];
                                    b2 = bArr[i5];
                                    if (b == -1) {
                                        bArrCopyOf[i4] = b2;
                                    } else {
                                        if (b2 == -1) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        c = (char) i4;
                                        c2 = (char) i5;
                                        if (z2) {
                                            kf2.o(gh0.s("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c), Character.valueOf(c2)));
                                            return null;
                                        }
                                        bArrCopyOf[i5] = b;
                                    }
                                }
                                lpVar = new lp(b11.q(new StringBuilder(), lpVar2.a, ".ignoreCase()"), lpVar2.b, bArrCopyOf, true);
                                break;
                            }
                            lpVar = lpVar2;
                            break;
                        }
                    }
                    if (lpVar == mpVar.a) {
                        mpVar2 = mpVar;
                    } else {
                        mpVar2 = new mp(lpVar);
                    }
                    mpVar.c = mpVar2;
                }
                int length2 = bArr5.length;
                rr2.u(0, length2, bArr5.length);
                lp lpVar3 = mpVar2.a;
                int i7 = lpVar3.e;
                int i8 = lpVar3.f;
                RoundingMode roundingMode = RoundingMode.CEILING;
                StringBuilder sb = new StringBuilder(h12.m(length2, i8) * i7);
                try {
                    mpVar2.b(sb, bArr5, length2);
                    string = sb.toString();
                } catch (IOException e) {
                    throw new AssertionError(e);
                }
            } else {
                string = String.valueOf(new be3(this.b).G());
            }
        } else if (this.a.equals("auxiliary.tracks.map")) {
            ArrayList arrayListD = d();
            StringBuilder sbI = xa3.i("track types = ");
            new uc0(String.valueOf(',')).a(sbI, arrayListD.iterator());
            string = sbI.toString();
        } else {
            byte[] bArr6 = this.b;
            String str3 = f35.a;
            mpVar = op.d;
            mpVar2 = mpVar.c;
            if (mpVar2 == null) {
                lpVar = mpVar.a;
                cArr = lpVar.b;
                while (i < r6) {
                    if (rr2.J(c5)) {
                        length = cArr.length;
                        i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                z = false;
                                break;
                            }
                            c4 = cArr[i2];
                            if (c4 < 'a') {
                            }
                            i2++;
                        }
                        rr2.v("Cannot call lowerCase() on a mixed-case alphabet", !z);
                        cArr2 = new char[cArr.length];
                        while (i3 < cArr.length) {
                            c3 = cArr[i3];
                            if (rr2.J(c3)) {
                                c3 = (char) (c3 ^ ' ');
                            }
                            cArr2[i3] = c3;
                        }
                        lpVar2 = new lp(b11.q(new StringBuilder(), lpVar.a, ".lowerCase()"), cArr2);
                        if (lpVar.h) {
                            lpVar = lpVar2;
                            break;
                        }
                        bArr = lpVar2.g;
                        if (lpVar2.h) {
                            bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                            while (i4 <= 90) {
                                i5 = i4 | 32;
                                b = bArr[i4];
                                b2 = bArr[i5];
                                if (b == -1) {
                                    bArrCopyOf[i4] = b2;
                                } else {
                                    if (b2 == -1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    c = (char) i4;
                                    c2 = (char) i5;
                                    if (z2) {
                                        kf2.o(gh0.s("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c), Character.valueOf(c2)));
                                        return null;
                                    }
                                    bArrCopyOf[i5] = b;
                                }
                            }
                            lpVar = new lp(b11.q(new StringBuilder(), lpVar2.a, ".ignoreCase()"), lpVar2.b, bArrCopyOf, true);
                            break;
                        }
                        lpVar = lpVar2;
                        break;
                    }
                }
                if (lpVar == mpVar.a) {
                    mpVar2 = mpVar;
                } else {
                    mpVar2 = new mp(lpVar);
                }
                mpVar.c = mpVar2;
            }
            int length3 = bArr6.length;
            rr2.u(0, length3, bArr6.length);
            lp lpVar4 = mpVar2.a;
            int i9 = lpVar4.e;
            int i10 = lpVar4.f;
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            StringBuilder sb2 = new StringBuilder(h12.m(length3, i10) * i9);
            mpVar2.b(sb2, bArr6, length3);
            string = sb2.toString();
        }
        return "mdta: key=" + this.a + ", value=" + string;
    }
}
