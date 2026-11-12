package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i00 extends l00 {
    public final be3 h = new be3();
    public final h00 i = new h00();
    public int j = -1;
    public final int k;
    public final g00[] l;
    public g00 m;
    public List n;
    public List o;
    public h00 p;
    public int q;

    public i00(List list, int i) {
        this.k = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = i40.a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.l = new g00[8];
        int i2 = 0;
        while (true) {
            g00[] g00VarArr = this.l;
            if (i2 >= 8) {
                this.m = g00VarArr[0];
                return;
            } else {
                g00VarArr[i2] = new g00();
                i2++;
            }
        }
    }

    @Override // defpackage.l00, defpackage.zi0
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.q = 0;
        this.m = this.l[0];
        m();
        this.p = null;
    }

    @Override // defpackage.l00
    public final zh0 g() {
        List list = this.n;
        this.o = list;
        list.getClass();
        return new zh0(12, list);
    }

    @Override // defpackage.l00
    public final void h(j00 j00Var) {
        ByteBuffer byteBuffer = j00Var.r;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        be3 be3Var = this.h;
        be3Var.L(iLimit, bArrArray);
        while (be3Var.a() >= 3) {
            int iA = be3Var.A();
            int i = iA & 3;
            boolean z = (iA & 4) == 4;
            byte bA = (byte) be3Var.A();
            byte bA2 = (byte) be3Var.A();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        k();
                        int i2 = (bA & 192) >> 6;
                        int i3 = this.j;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            m();
                            l93.q0("Cea708Decoder", "Sequence number discontinuity. previous=" + this.j + " current=" + i2);
                        }
                        this.j = i2;
                        int i4 = bA & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        h00 h00Var = new h00(i2, i4);
                        this.p = h00Var;
                        byte[] bArr = h00Var.b;
                        h00Var.e = 1;
                        bArr[0] = bA2;
                    } else {
                        rr2.l(i == 2);
                        h00 h00Var2 = this.p;
                        if (h00Var2 == null) {
                            l93.F("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = h00Var2.b;
                            int i5 = h00Var2.e;
                            int i6 = i5 + 1;
                            h00Var2.e = i6;
                            bArr2[i5] = bA;
                            h00Var2.e = i5 + 2;
                            bArr2[i6] = bA2;
                        }
                    }
                    h00 h00Var3 = this.p;
                    if (h00Var3.e == (h00Var3.d * 2) - 1) {
                        k();
                    }
                }
            }
        }
    }

    @Override // defpackage.l00
    public final boolean j() {
        return this.n != this.o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:228:0x053d  */
    public final void k() {
        char c;
        boolean z;
        h00 h00Var = this.p;
        if (h00Var == null) {
            return;
        }
        int i = 2;
        if (h00Var.e != (h00Var.d * 2) - 1) {
            l93.A("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.p.d * 2) - 1) + ", but current index is " + this.p.e + " (sequence number " + this.p.c + ");");
        }
        h00 h00Var2 = this.p;
        byte[] bArr = h00Var2.b;
        int i2 = h00Var2.e;
        h00 h00Var3 = this.i;
        h00Var3.o(i2, bArr);
        boolean z2 = false;
        while (h00Var3.b() > 0) {
            int i3 = 3;
            int i4 = h00Var3.i(3);
            int i5 = h00Var3.i(5);
            if (i4 == 7) {
                h00Var3.t(i);
                i4 = h00Var3.i(6);
                if (i4 < 7) {
                    xa3.m(i4, "Invalid extended service number: ", "Cea708Decoder");
                }
            }
            if (i5 == 0) {
                if (i4 != 0) {
                    l93.q0("Cea708Decoder", "serviceNumber is non-zero (" + i4 + ") when blockSize is 0");
                }
                if (z2) {
                    this.n = l();
                }
                this.p = null;
            }
            if (i4 != this.k) {
                h00Var3.u(i5);
            } else {
                int iG = (i5 * 8) + h00Var3.g();
                while (h00Var3.g() < iG) {
                    int i6 = h00Var3.i(8);
                    if (i6 != 16) {
                        if (i6 <= 31) {
                            if (i6 != 0) {
                                if (i6 == i3) {
                                    this.n = l();
                                } else if (i6 != 8) {
                                    switch (i6) {
                                        case 12:
                                            m();
                                            break;
                                        case 13:
                                            this.m.a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (i6 >= 17 && i6 <= 23) {
                                                l93.q0("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i6);
                                                h00Var3.t(8);
                                            } else if (i6 < 24 || i6 > 31) {
                                                xa3.m(i6, "Invalid C0 command: ", "Cea708Decoder");
                                            } else {
                                                l93.q0("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i6);
                                                h00Var3.t(16);
                                            }
                                            break;
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = this.m.b;
                                    int length = spannableStringBuilder.length();
                                    if (length > 0) {
                                        spannableStringBuilder.delete(length - 1, length);
                                    }
                                }
                            }
                        } else if (i6 <= 127) {
                            g00 g00Var = this.m;
                            if (i6 == 127) {
                                g00Var.a((char) 9835);
                            } else {
                                g00Var.a((char) (i6 & 255));
                            }
                            z2 = true;
                        } else {
                            if (i6 <= 159) {
                                g00[] g00VarArr = this.l;
                                switch (i6) {
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        z = true;
                                        int i7 = i6 - 128;
                                        if (this.q != i7) {
                                            this.q = i7;
                                            this.m = g00VarArr[i7];
                                        }
                                        break;
                                    case 136:
                                        z = true;
                                        for (int i8 = 1; i8 <= 8; i8++) {
                                            if (h00Var3.h()) {
                                                g00 g00Var2 = g00VarArr[8 - i8];
                                                g00Var2.a.clear();
                                                g00Var2.b.clear();
                                                g00Var2.o = -1;
                                                g00Var2.p = -1;
                                                g00Var2.q = -1;
                                                g00Var2.s = -1;
                                                g00Var2.u = 0;
                                            }
                                        }
                                        break;
                                    case 137:
                                        for (int i9 = 1; i9 <= 8; i9++) {
                                            if (h00Var3.h()) {
                                                g00VarArr[8 - i9].d = true;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 138:
                                        for (int i10 = 1; i10 <= 8; i10++) {
                                            if (h00Var3.h()) {
                                                g00VarArr[8 - i10].d = false;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 139:
                                        for (int i11 = 1; i11 <= 8; i11++) {
                                            if (h00Var3.h()) {
                                                g00 g00Var3 = g00VarArr[8 - i11];
                                                g00Var3.d = !g00Var3.d;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 140:
                                        for (int i12 = 1; i12 <= 8; i12++) {
                                            if (h00Var3.h()) {
                                                g00VarArr[8 - i12].d();
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 141:
                                        h00Var3.t(8);
                                        z = true;
                                        break;
                                    case 142:
                                        z = true;
                                        break;
                                    case 143:
                                        m();
                                        z = true;
                                        break;
                                    case 144:
                                        int i13 = i;
                                        if (this.m.c) {
                                            h00Var3.i(4);
                                            h00Var3.i(i13);
                                            h00Var3.i(i13);
                                            boolean zH = h00Var3.h();
                                            boolean zH2 = h00Var3.h();
                                            i3 = 3;
                                            h00Var3.i(3);
                                            h00Var3.i(3);
                                            this.m.e(zH, zH2);
                                            z = true;
                                        } else {
                                            h00Var3.t(16);
                                            z = true;
                                            i3 = 3;
                                        }
                                        break;
                                    case 145:
                                        if (this.m.c) {
                                            int iC = g00.c(h00Var3.i(2), h00Var3.i(2), h00Var3.i(2), h00Var3.i(2));
                                            int iC2 = g00.c(h00Var3.i(2), h00Var3.i(2), h00Var3.i(2), h00Var3.i(2));
                                            h00Var3.t(2);
                                            g00.c(h00Var3.i(2), h00Var3.i(2), h00Var3.i(2), 0);
                                            this.m.f(iC, iC2);
                                        } else {
                                            h00Var3.t(24);
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                    case 146:
                                        if (this.m.c) {
                                            h00Var3.t(4);
                                            int i14 = h00Var3.i(4);
                                            h00Var3.t(2);
                                            h00Var3.i(6);
                                            g00 g00Var4 = this.m;
                                            if (g00Var4.u != i14) {
                                                g00Var4.a('\n');
                                            }
                                            g00Var4.u = i14;
                                        } else {
                                            h00Var3.t(16);
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                    case 147:
                                    case 148:
                                    case 149:
                                    case 150:
                                    default:
                                        xa3.m(i6, "Invalid C1 command: ", "Cea708Decoder");
                                        z = true;
                                        break;
                                    case 151:
                                        if (this.m.c) {
                                            int iC3 = g00.c(h00Var3.i(2), h00Var3.i(2), h00Var3.i(2), h00Var3.i(2));
                                            h00Var3.i(2);
                                            g00.c(h00Var3.i(2), h00Var3.i(2), h00Var3.i(2), 0);
                                            h00Var3.h();
                                            h00Var3.h();
                                            h00Var3.i(2);
                                            h00Var3.i(2);
                                            int i15 = h00Var3.i(2);
                                            h00Var3.t(8);
                                            g00 g00Var5 = this.m;
                                            g00Var5.n = iC3;
                                            g00Var5.k = i15;
                                        } else {
                                            h00Var3.t(32);
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                    case 152:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                        int i16 = i6 - 152;
                                        g00 g00Var6 = g00VarArr[i16];
                                        h00Var3.t(i);
                                        boolean zH3 = h00Var3.h();
                                        h00Var3.t(i);
                                        int i17 = h00Var3.i(i3);
                                        boolean zH4 = h00Var3.h();
                                        int i18 = h00Var3.i(7);
                                        int i19 = h00Var3.i(8);
                                        int i20 = h00Var3.i(4);
                                        int i21 = h00Var3.i(4);
                                        h00Var3.t(i);
                                        h00Var3.t(6);
                                        h00Var3.t(i);
                                        int i22 = h00Var3.i(3);
                                        int i23 = h00Var3.i(3);
                                        ArrayList arrayList = g00Var6.a;
                                        g00Var6.c = true;
                                        g00Var6.d = zH3;
                                        g00Var6.e = i17;
                                        g00Var6.f = zH4;
                                        g00Var6.g = i18;
                                        g00Var6.h = i19;
                                        g00Var6.i = i20;
                                        int i24 = i21 + 1;
                                        if (g00Var6.j != i24) {
                                            g00Var6.j = i24;
                                            while (true) {
                                                if (arrayList.size() >= g00Var6.j || arrayList.size() >= 15) {
                                                    arrayList.remove(0);
                                                }
                                            }
                                        }
                                        if (i22 != 0 && g00Var6.l != i22) {
                                            g00Var6.l = i22;
                                            int i25 = i22 - 1;
                                            int i26 = g00.B[i25];
                                            boolean z3 = g00.A[i25];
                                            int i27 = g00.y[i25];
                                            int i28 = g00.z[i25];
                                            int i29 = g00.x[i25];
                                            g00Var6.n = i26;
                                            g00Var6.k = i29;
                                        }
                                        if (i23 != 0 && g00Var6.m != i23) {
                                            g00Var6.m = i23;
                                            int i30 = i23 - 1;
                                            int i31 = g00.D[i30];
                                            int i32 = g00.C[i30];
                                            g00Var6.e(false, false);
                                            g00Var6.f(g00.v, g00.E[i30]);
                                        }
                                        if (this.q != i16) {
                                            this.q = i16;
                                            this.m = g00VarArr[i16];
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                }
                            } else {
                                z = true;
                                if (i6 <= 255) {
                                    this.m.a((char) (i6 & 255));
                                } else {
                                    xa3.m(i6, "Invalid base command: ", "Cea708Decoder");
                                }
                                i = 2;
                                c = 7;
                            }
                            z2 = z;
                            i = 2;
                            c = 7;
                        }
                        c = 7;
                    } else {
                        int i33 = h00Var3.i(8);
                        if (i33 <= 31) {
                            c = 7;
                            if (i33 > 7) {
                                if (i33 <= 15) {
                                    h00Var3.t(8);
                                } else if (i33 <= 23) {
                                    h00Var3.t(16);
                                } else if (i33 <= 31) {
                                    h00Var3.t(24);
                                }
                            }
                        } else {
                            c = 7;
                            if (i33 <= 127) {
                                if (i33 == 32) {
                                    this.m.a(' ');
                                } else if (i33 == 33) {
                                    this.m.a((char) 160);
                                } else if (i33 == 37) {
                                    this.m.a((char) 8230);
                                } else if (i33 == 42) {
                                    this.m.a((char) 352);
                                } else if (i33 == 44) {
                                    this.m.a((char) 338);
                                } else if (i33 == 63) {
                                    this.m.a((char) 376);
                                } else if (i33 == 57) {
                                    this.m.a((char) 8482);
                                } else if (i33 == 58) {
                                    this.m.a((char) 353);
                                } else if (i33 == 60) {
                                    this.m.a((char) 339);
                                } else if (i33 != 61) {
                                    switch (i33) {
                                        case 48:
                                            this.m.a((char) 9608);
                                            break;
                                        case 49:
                                            this.m.a((char) 8216);
                                            break;
                                        case 50:
                                            this.m.a((char) 8217);
                                            break;
                                        case 51:
                                            this.m.a((char) 8220);
                                            break;
                                        case 52:
                                            this.m.a((char) 8221);
                                            break;
                                        case 53:
                                            this.m.a((char) 8226);
                                            break;
                                        default:
                                            switch (i33) {
                                                case 118:
                                                    this.m.a((char) 8539);
                                                    break;
                                                case 119:
                                                    this.m.a((char) 8540);
                                                    break;
                                                case 120:
                                                    this.m.a((char) 8541);
                                                    break;
                                                case 121:
                                                    this.m.a((char) 8542);
                                                    break;
                                                case 122:
                                                    this.m.a((char) 9474);
                                                    break;
                                                case 123:
                                                    this.m.a((char) 9488);
                                                    break;
                                                case 124:
                                                    this.m.a((char) 9492);
                                                    break;
                                                case 125:
                                                    this.m.a((char) 9472);
                                                    break;
                                                case 126:
                                                    this.m.a((char) 9496);
                                                    break;
                                                case 127:
                                                    this.m.a((char) 9484);
                                                    break;
                                                default:
                                                    xa3.m(i33, "Invalid G2 character: ", "Cea708Decoder");
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    this.m.a((char) 8480);
                                }
                                i = 2;
                                z2 = true;
                            } else if (i33 > 159) {
                                i = 2;
                                if (i33 <= 255) {
                                    if (i33 == 160) {
                                        this.m.a((char) 13252);
                                    } else {
                                        xa3.m(i33, "Invalid G3 character: ", "Cea708Decoder");
                                        this.m.a('_');
                                    }
                                    z2 = true;
                                } else {
                                    xa3.m(i33, "Invalid extended command: ", "Cea708Decoder");
                                }
                            } else if (i33 <= 135) {
                                h00Var3.t(32);
                            } else if (i33 <= 143) {
                                h00Var3.t(40);
                            } else if (i33 <= 159) {
                                i = 2;
                                h00Var3.t(2);
                                h00Var3.t(h00Var3.i(6) * 8);
                            }
                        }
                        i = 2;
                    }
                    i = i;
                }
            }
        }
        if (z2) {
            this.n = l();
        }
        this.p = null;
    }

    public final List l() {
        Layout.Alignment alignment;
        float f;
        float f2;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            g00[] g00VarArr = this.l;
            g00 g00Var = g00VarArr[i];
            if (g00Var.c && (!g00Var.a.isEmpty() || g00Var.b.length() != 0)) {
                g00 g00Var2 = g00VarArr[i];
                if (g00Var2.d) {
                    ArrayList arrayList2 = g00Var2.a;
                    f00 f00Var = null;
                    if (g00Var2.c && (!arrayList2.isEmpty() || g00Var2.b.length() != 0)) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i2));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) g00Var2.b());
                        int i3 = g00Var2.k;
                        if (i3 == 0) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else if (i3 == 1) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else if (i3 != 2) {
                            if (i3 != 3) {
                                mj0.f(g00Var2.k, "Unexpected justification value: ");
                                return null;
                            }
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = Layout.Alignment.ALIGN_CENTER;
                        }
                        Layout.Alignment alignment2 = alignment;
                        boolean z = g00Var2.f;
                        int i4 = g00Var2.h;
                        int i5 = g00Var2.g;
                        if (z) {
                            f = i4 / 99.0f;
                            f2 = i5 / 99.0f;
                        } else {
                            f = i4 / 209.0f;
                            f2 = i5 / 74.0f;
                        }
                        float f3 = (f * 0.9f) + 0.05f;
                        float f4 = (f2 * 0.9f) + 0.05f;
                        int i6 = g00Var2.i;
                        int i7 = i6 / 3;
                        int i8 = i7 == 0 ? 0 : i7 == 1 ? 1 : 2;
                        int i9 = i6 % 3;
                        int i10 = i9 == 0 ? 0 : i9 == 1 ? 1 : 2;
                        int i11 = g00Var2.n;
                        f00Var = new f00(spannableStringBuilder, alignment2, f4, i8, f3, i10, i11 != g00.w, i11, g00Var2.e);
                    }
                    if (f00Var != null) {
                        arrayList.add(f00Var);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, f00.c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList3.add(((f00) arrayList.get(i12)).a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    public final void m() {
        for (int i = 0; i < 8; i++) {
            this.l[i].d();
        }
    }
}
