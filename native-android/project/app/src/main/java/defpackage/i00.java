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
    public final be3 h;
    public final h00 i;
    public int j;
    public final int k;
    public final g00[] l;
    public g00 m;
    public List n;
    public List o;
    public h00 p;
    public int q;

    public i00(List r4, int r5) {
        this.h = new be3();
        this.i = new h00();
        this.j = -1;
        if (r5 != (-1)) goto L5;
        r5 = 1;
    L5:
        this.k = r5;
        if (r4 == null) goto L12;
        byte[] r0 = i40.a;
        if (r4.size() != 1) goto L12;
        if (((byte[]) r4.get(0)).length != 1) goto L12;
        byte r6 = ((byte[]) r4.get(0))[0];
    L12:
        this.l = new g00[8];
        int r1 = 0;
    L13:
        g00[] r2 = this.l;
        if (r1 >= 8) goto L16;
        r2[r1] = new g00();
        r1 = r1 + 1;
        goto L13
    L16:
        this.m = r2[0];
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
        List r0 = this.n;
        this.o = r0;
        r0.getClass();
        return new zh0(12, r0);
    }

    @Override // defpackage.l00
    public final void h(j00 r11) {
        ByteBuffer r12 = r11.r;
        r12.getClass();
        byte[] r0 = r12.array();
        int r13 = r12.limit();
        be3 r1 = this.h;
        r1.L(r13, r0);
    L4:
        if (r1.a() < 3) goto L35;
        int r14 = r1.A();
        int r2 = r14 & 3;
        boolean r4 = false;
        if ((r14 & 4) != 4) goto L8;
        boolean r15 = true;
    L9:
        byte r6 = (byte) r1.A();
        byte r7 = (byte) r1.A();
        if (r2 == 2) goto L13;
        if (r2 != 3) goto L4;
    L13:
        if (r15 == false) goto L4;
        if (r2 == 3) goto L17;
        if (r2 != 2) goto L28;
        r4 = true;
    L28:
        rr2.l(r4);
        h00 r3 = this.p;
        if (r3 != null) goto L31;
        l93.F("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
        goto L4
    L31:
        byte[] r16 = r3.b;
        int r5 = r3.e;
        int r8 = r5 + 1;
        r3.e = r8;
        r16[r5] = r6;
        r3.e = r5 + 2;
        r16[r8] = r7;
    L32:
        h00 r17 = this.p;
        if (r17.e != ((r17.d * 2) - 1)) goto L4;
        k();
        goto L4
    L17:
        k();
        int r9 = (r6 & 192) >> 6;
        int r10 = this.j;
        if (r10 != (-1)) goto L20;
    L22:
        this.j = r9;
        int r18 = r6 & 63;
        if (r18 != 0) goto L25;
        r18 = 64;
    L25:
        h00 r19 = new h00(r9, r18);
        this.p = r19;
        byte[] r110 = r19.b;
        r19.e = 1;
        r110[0] = r7;
        goto L32
    L20:
        if (r9 == ((r10 + 1) % 4)) goto L22;
        m();
        l93.q0("Cea708Decoder", "Sequence number discontinuity. previous=" + this.j + " current=" + r9);
        goto L22
    L8:
        r15 = false;
        goto L9
    }

    @Override // defpackage.l00
    public final boolean j() {
        if (this.n == this.o) goto L6;
        return true;
    L6:
        return false;
    }

    public final void k() {
        h00 r1 = this.p;
        if (r1 != null) goto L5;
        return;
    L5:
        int r3 = 2;
        if (r1.e == ((r1.d * 2) - 1)) goto L8;
        l93.A("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.p.d * 2) - 1) + ", but current index is " + this.p.e + " (sequence number " + this.p.c + ");");
    L8:
        h00 r2 = this.p;
        byte[] r4 = r2.b;
        int r5 = r2.e;
        h00 r6 = this.i;
        r6.o(r5, r4);
        boolean r7 = false;
    L10:
        if (r6.b() <= 0) goto L227;
        int r8 = 3;
        int r9 = r6.i(3);
        int r10 = r6.i(5);
        if (r9 != 7) goto L16;
        r6.t(r3);
        r9 = r6.i(6);
        if (r9 >= 7) goto L16;
        xa3.m(r9, "Invalid extended service number: ", "Cea708Decoder");
    L16:
        if (r10 == 0) goto L17;
        if (r9 != this.k) goto L21;
        int r11 = (r10 * 8) + r6.g();
    L24:
        if (r6.g() >= r11) goto L10;
        int r12 = r6.i(8);
        if (r12 != 16) goto L28;
        int r13 = r6.i(8);
        if (r13 > 31) goto L156;
        char r14 = 7;
        if (r13 > 7) goto L150;
    L213:
        r3 = 2;
    L226:
        r3 = r3;
        goto L24
    L150:
        if (r13 > 15) goto L152;
        r6.t(8);
        goto L213
    L152:
        if (r13 > 23) goto L154;
        r6.t(16);
        goto L213
    L154:
        if (r13 > 31) goto L213;
        r6.t(24);
        goto L213
    L156:
        r14 = 7;
        if (r13 > 127) goto L209;
        if (r13 != 32) goto L161;
        this.m.a(' ');
    L207:
        r3 = 2;
        r7 = true;
        goto L226
    L161:
        if (r13 != 33) goto L163;
        this.m.a(160);
        goto L207
    L163:
        if (r13 != 37) goto L165;
        this.m.a(8230);
        goto L207
    L165:
        if (r13 != 42) goto L167;
        this.m.a(352);
        goto L207
    L167:
        if (r13 != 44) goto L169;
        this.m.a(338);
        goto L207
    L169:
        if (r13 != 63) goto L171;
        this.m.a(376);
        goto L207
    L171:
        if (r13 != 57) goto L173;
        this.m.a(8482);
        goto L207
    L173:
        if (r13 != 58) goto L175;
        this.m.a(353);
        goto L207
    L175:
        if (r13 != 60) goto L177;
        this.m.a(339);
        goto L207
    L177:
        if (r13 == 61) goto L197;
        switch(r13) {
            case 48: goto L196;
            case 49: goto L195;
            case 50: goto L194;
            case 51: goto L193;
            case 52: goto L192;
            case 53: goto L191;
            default: goto L179;
        };
    L179:
        switch(r13) {
            case 118: goto L190;
            case 119: goto L189;
            case 120: goto L188;
            case 121: goto L187;
            case 122: goto L186;
            case 123: goto L185;
            case 124: goto L184;
            case 125: goto L183;
            case 126: goto L182;
            case 127: goto L181;
            default: goto L180;
        };
    L180:
        xa3.m(r13, "Invalid G2 character: ", "Cea708Decoder");
        goto L207
    L181:
        this.m.a(9484);
        goto L207
    L182:
        this.m.a(9496);
        goto L207
    L183:
        this.m.a(9472);
        goto L207
    L184:
        this.m.a(9492);
        goto L207
    L185:
        this.m.a(9488);
        goto L207
    L186:
        this.m.a(9474);
        goto L207
    L187:
        this.m.a(8542);
        goto L207
    L188:
        this.m.a(8541);
        goto L207
    L189:
        this.m.a(8540);
        goto L207
    L190:
        this.m.a(8539);
        goto L207
    L191:
        this.m.a(8226);
        goto L207
    L192:
        this.m.a(8221);
        goto L207
    L193:
        this.m.a(8220);
        goto L207
    L194:
        this.m.a(8217);
        goto L207
    L195:
        this.m.a(8216);
        goto L207
    L196:
        this.m.a(9608);
        goto L207
    L197:
        this.m.a(8480);
        goto L207
    L209:
        if (r13 <= 159) goto L211;
        r3 = 2;
        if (r13 > 255) goto L225;
        if (r13 != 160) goto L223;
        this.m.a(13252);
    L224:
        r7 = true;
        goto L226
    L223:
        xa3.m(r13, "Invalid G3 character: ", "Cea708Decoder");
        this.m.a('_');
        goto L224
    L225:
        xa3.m(r13, "Invalid extended command: ", "Cea708Decoder");
        goto L226
    L211:
        if (r13 > 135) goto L215;
        r6.t(32);
        goto L213
    L215:
        if (r13 > 143) goto L217;
        r6.t(40);
        goto L213
    L217:
        if (r13 > 159) goto L213;
        r3 = 2;
        r6.t(2);
        r6.t(r6.i(6) * 8);
        goto L226
    L28:
        if (r12 > 31) goto L48;
        if (r12 == 0) goto L54;
        if (r12 == r8) goto L46;
        if (r12 == 8) goto L43;
        switch(r12) {
            case 12: goto L42;
            case 13: goto L41;
            case 14: goto L54;
            default: goto L34;
        };
    L41:
        this.m.a('\n');
        goto L54
    L42:
        m();
        goto L54
    L34:
        if (r12 < 17) goto L37;
        if (r12 > 23) goto L37;
        l93.q0("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + r12);
        r6.t(8);
    L37:
        if (r12 < 24) goto L40;
        if (r12 > 31) goto L40;
        l93.q0("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + r12);
        r6.t(16);
    L40:
        xa3.m(r12, "Invalid C0 command: ", "Cea708Decoder");
        goto L54
    L43:
        SpannableStringBuilder r15 = this.m.b;
        int r16 = r15.length();
        if (r16 <= 0) goto L54;
        r15.delete(r16 - 1, r16);
        goto L54
    L46:
        this.n = l();
    L54:
        r14 = 7;
        goto L226
    L48:
        if (r12 > 127) goto L55;
        g00 r17 = this.m;
        if (r12 != 127) goto L52;
        r17.a(9835);
    L53:
        r7 = true;
        goto L54
    L52:
        r17.a((char) (r12 & 255));
        goto L53
    L55:
        if (r12 > 159) goto L140;
        g00[] r18 = this.l;
        switch(r12) {
            case 128: goto L134;
            case 129: goto L134;
            case 130: goto L134;
            case 131: goto L134;
            case 132: goto L134;
            case 133: goto L134;
            case 134: goto L134;
            case 135: goto L134;
            case 136: goto L127;
            case 137: goto L120;
            case 138: goto L114;
            case 139: goto L108;
            case 140: goto L102;
            case 141: goto L101;
            case 142: goto L59;
            case 143: goto L100;
            case 144: goto L96;
            case 145: goto L93;
            case 146: goto L86;
            case 147: goto L58;
            case 148: goto L58;
            case 149: goto L58;
            case 150: goto L58;
            case 151: goto L82;
            case 152: goto L61;
            case 153: goto L61;
            case 154: goto L61;
            case 155: goto L61;
            case 156: goto L61;
            case 157: goto L61;
            case 158: goto L61;
            case 159: goto L61;
            default: goto L58;
        };
    L58:
        xa3.m(r12, "Invalid C1 command: ", "Cea708Decoder");
    L59:
        boolean r19 = true;
    L137:
        r7 = r19;
    L138:
        r3 = 2;
        r14 = 7;
        goto L226
    L61:
        int r110 = r12 - 152;
        g00 r20 = r18[r110];
        r6.t(r3);
        boolean r111 = r6.h();
        r6.t(r3);
        int r112 = r6.i(r8);
        boolean r113 = r6.h();
        int r114 = r6.i(7);
        int r21 = r6.i(8);
        int r115 = r6.i(4);
        int r22 = r6.i(4);
        r6.t(r3);
        r6.t(6);
        r6.t(r3);
        int r23 = r6.i(3);
        int r24 = r6.i(3);
        ArrayList r25 = r20.a;
        r20.c = true;
        r20.d = r111;
        r20.e = r112;
        r20.f = r113;
        r20.g = r114;
        r20.h = r21;
        r20.i = r115;
        int r116 = r22 + 1;
        if (r20.j == r116) goto L69;
        r20.j = r116;
    L65:
        if (r25.size() >= r20.j) goto L68;
        if (r25.size() < 15) goto L69;
    L68:
        r25.remove(0);
    L69:
        if (r23 != 0) goto L71;
    L73:
        if (r24 == 0) goto L78;
        if (r20.m == r24) goto L78;
        r20.m = r24;
        int r26 = r24 - 1;
        int r27 = g00.D[r26];
        int r28 = g00.C[r26];
        r20.e(false, false);
        r20.f(g00.v, g00.E[r26]);
    L78:
        if (this.q == r110) goto L80;
        this.q = r110;
        this.m = r18[r110];
    L80:
        r19 = true;
        r8 = 3;
        goto L137
    L71:
        if (r20.l == r23) goto L73;
        r20.l = r23;
        int r29 = r23 - 1;
        int r30 = g00.B[r29];
        boolean r31 = g00.A[r29];
        int r32 = g00.y[r29];
        int r33 = g00.z[r29];
        int r34 = g00.x[r29];
        r20.n = r30;
        r20.k = r34;
        goto L73
    L96:
        int r35 = r3;
        if (this.m.c == true) goto L99;
        r6.t(16);
        goto L80
    L99:
        r6.i(4);
        r6.i(r35);
        r6.i(r35);
        boolean r36 = r6.h();
        boolean r37 = r6.h();
        r8 = 3;
        r6.i(3);
        r6.i(3);
        this.m.e(r36, r37);
        goto L59
    L100:
        m();
        goto L59
    L101:
        r6.t(8);
        goto L59
    L102:
        int r38 = 1;
    L103:
        if (r38 > 8) goto L59;
        if (r6.h() == false) goto L107;
        r18[8 - r38].d();
    L107:
        r38 = r38 + 1;
        goto L103
    L108:
        int r39 = 1;
    L109:
        if (r39 > 8) goto L59;
        if (r6.h() == false) goto L113;
        g00 r40 = r18[8 - r39];
        r40.d = !r40.d;
    L113:
        r39 = r39 + 1;
        goto L109
    L114:
        int r41 = 1;
    L115:
        if (r41 > 8) goto L59;
        if (r6.h() == false) goto L119;
        r18[8 - r41].d = false;
    L119:
        r41 = r41 + 1;
        goto L115
    L120:
        int r42 = 1;
    L121:
        if (r42 > 8) goto L59;
        if (r6.h() == false) goto L126;
        r18[8 - r42].d = true;
    L126:
        r42 = r42 + 1;
        goto L121
    L127:
        r19 = true;
        int r43 = 1;
    L128:
        if (r43 > 8) goto L137;
        if (r6.h() == false) goto L133;
        g00 r44 = r18[8 - r43];
        r44.a.clear();
        r44.b.clear();
        r44.o = -1;
        r44.p = -1;
        r44.q = -1;
        r44.s = -1;
        r44.u = 0;
    L133:
        r43 = r43 + 1;
        goto L128
    L134:
        r19 = true;
        int r117 = r12 - 128;
        if (this.q == r117) goto L137;
        this.q = r117;
        this.m = r18[r117];
        goto L137
    L82:
        if (this.m.c == true) goto L84;
        r6.t(32);
        goto L80
    L84:
        int r45 = g00.c(r6.i(2), r6.i(2), r6.i(2), r6.i(2));
        r6.i(2);
        g00.c(r6.i(2), r6.i(2), r6.i(2), 0);
        r6.h();
        r6.h();
        r6.i(2);
        r6.i(2);
        int r46 = r6.i(2);
        r6.t(8);
        g00 r47 = this.m;
        r47.n = r45;
        r47.k = r46;
        goto L80
    L86:
        if (this.m.c == true) goto L88;
        r6.t(16);
        goto L80
    L88:
        r6.t(4);
        int r48 = r6.i(4);
        r6.t(2);
        r6.i(6);
        g00 r49 = this.m;
        if (r49.u == r48) goto L91;
        r49.a('\n');
    L91:
        r49.u = r48;
        goto L80
    L93:
        if (this.m.c == true) goto L95;
        r6.t(24);
        goto L80
    L95:
        int r50 = g00.c(r6.i(2), r6.i(2), r6.i(2), r6.i(2));
        int r51 = g00.c(r6.i(2), r6.i(2), r6.i(2), r6.i(2));
        r6.t(2);
        g00.c(r6.i(2), r6.i(2), r6.i(2), 0);
        this.m.f(r50, r51);
        goto L80
    L140:
        r19 = true;
        if (r12 > 255) goto L143;
        this.m.a((char) (r12 & 255));
        goto L137
    L143:
        xa3.m(r12, "Invalid base command: ", "Cea708Decoder");
        goto L138
    L21:
        r6.u(r10);
        goto L10
    L17:
        if (r9 == 0) goto L227;
        l93.q0("Cea708Decoder", "serviceNumber is non-zero (" + r9 + ") when blockSize is 0");
    L227:
        if (r7 == false) goto L229;
        this.n = l();
    L229:
        this.p = null;
    }

    public final List l() {
        ArrayList r0 = new ArrayList();
        int r1 = 0;
        int r2 = 0;
    L4:
        if (r2 >= 8) goto L62;
        g00[] r4 = this.l;
        g00 r5 = r4[r2];
        if (r5.c == false) goto L61;
        if (r5.a.isEmpty() == true) goto L10;
    L12:
        g00 r6 = r4[r2];
        if (r6.d == false) goto L61;
        ArrayList r7 = r6.a;
        f00 r8 = null;
        if (r6.c == true) goto L17;
    L59:
        if (r8 == null) goto L61;
        r0.add(r8);
        goto L61
    L17:
        if (r7.isEmpty() == true) goto L19;
    L21:
        SpannableStringBuilder r9 = new SpannableStringBuilder();
        int r10 = 0;
    L23:
        if (r10 >= r7.size()) goto L25;
        r9.append((CharSequence) r7.get(r10));
        r9.append('\n');
        r10 = r10 + 1;
        goto L23
    L25:
        r9.append(r6.b());
        int r11 = r6.k;
        if (r11 == 0) goto L37;
        if (r11 == 1) goto L36;
        if (r11 != 2) goto L30;
        Layout.Alignment r12 = Layout.Alignment.ALIGN_CENTER;
    L35:
        Layout.Alignment r13 = r12;
        boolean r14 = r6.f;
        int r15 = r6.h;
        int r16 = r6.g;
        if (r14 == false) goto L41;
        float r17 = r15 / 99.0f;
        float r18 = r16 / 99.0f;
    L42:
        float r19 = (r17 * 0.9f) + 0.05f;
        float r110 = (r18 * 0.9f) + 0.05f;
        int r20 = r6.i;
        int r21 = r20 / 3;
        if (r21 != 0) goto L45;
        int r111 = 0;
    L48:
        int r22 = r20 % 3;
        if (r22 != 0) goto L51;
        int r112 = 0;
    L54:
        int r23 = r6.n;
        if (r23 == g00.w) goto L57;
        boolean r113 = true;
    L58:
        r8 = new f00(r9, r13, r110, r111, r19, r112, r113, r23, r6.e);
        goto L59
    L57:
        r113 = false;
        goto L58
    L51:
        if (r22 != 1) goto L53;
        r112 = 1;
        goto L54
    L53:
        r112 = 2;
        goto L54
    L45:
        if (r21 != 1) goto L47;
        r111 = 1;
        goto L48
    L47:
        r111 = 2;
        goto L48
    L41:
        r17 = r15 / 209.0f;
        r18 = r16 / 74.0f;
        goto L42
    L30:
        if (r11 == 3) goto L37;
        mj0.f(r6.k, "Unexpected justification value: ");
        return null;
    L36:
        r12 = Layout.Alignment.ALIGN_OPPOSITE;
    L37:
        r12 = Layout.Alignment.ALIGN_NORMAL;
        goto L35
    L19:
        if (r6.b.length() != 0) goto L21;
    L10:
        if (r5.b.length() != 0) goto L12;
    L61:
        r2 = r2 + 1;
        goto L4
    L62:
        Collections.sort(r0, f00.c);
        ArrayList r3 = new ArrayList(r0.size());
    L64:
        if (r1 >= r0.size()) goto L67;
        r3.add(((f00) r0.get(r1)).a);
        r1 = r1 + 1;
        goto L64
    L67:
        return Collections.unmodifiableList(r3);
    }

    public final void m() {
        int r0 = 0;
    L4:
        if (r0 >= 8) goto L6;
        this.l[r0].d();
        r0 = r0 + 1;
        goto L4
    }
}
