package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ds4 extends nv1 {
    public final String b;
    public final String c;
    public final yw1 d;

    public ds4(String r1, String r2, gy3 r3) {
        super(r1);
        rr2.l(!r3.isEmpty());
        this.b = r2;
        yw1 r4 = yw1.k(r3);
        this.d = r4;
        this.c = (String) r4.get(0);
    }

    public static ArrayList d(String r7) {
        ArrayList r0 = new ArrayList();
        if (r7.length() < 10) goto L8;
        r0.add(Integer.valueOf(Integer.parseInt(r7.substring(0, 4))));     // Catch: NumberFormatException -> L15
        r0.add(Integer.valueOf(Integer.parseInt(r7.substring(5, 7))));     // Catch: NumberFormatException -> L15
        r0.add(Integer.valueOf(Integer.parseInt(r7.substring(8, 10))));     // Catch: NumberFormatException -> L15
        return r0;
    L8:
        if (r7.length() < 7) goto L12;
        r0.add(Integer.valueOf(Integer.parseInt(r7.substring(0, 4))));     // Catch: NumberFormatException -> L15
        r0.add(Integer.valueOf(Integer.parseInt(r7.substring(5, 7))));     // Catch: NumberFormatException -> L15
        return r0;
    L12:
        if (r7.length() < 4) goto L14;
        r0.add(Integer.valueOf(Integer.parseInt(r7.substring(0, 4))));     // Catch: NumberFormatException -> L15
    L14:
        return r0;
    L16:
        return new ArrayList();
    }

    @Override // defpackage.pv2
    public final void b(co2 r9) {
        String r0 = this.a;
        switch(r0.hashCode()) {
            case 82815: goto L94;
            case 82878: goto L90;
            case 82897: goto L86;
            case 83253: goto L82;
            case 83254: goto L78;
            case 83255: goto L74;
            case 83341: goto L70;
            case 83378: goto L66;
            case 83536: goto L62;
            case 83552: goto L58;
            case 2567331: goto L54;
            case 2569357: goto L50;
            case 2569358: goto L46;
            case 2569891: goto L42;
            case 2570401: goto L38;
            case 2570410: goto L34;
            case 2571565: goto L30;
            case 2575251: goto L26;
            case 2581512: goto L22;
            case 2581513: goto L18;
            case 2581514: goto L14;
            case 2583398: goto L10;
            case 2590194: goto L6;
            default: goto L4;
        };
    L4:
        byte r1 = -1;
    L97:
        yw1 r8 = this.d;
        switch(r1) {
            case 0: goto L149;
            case 1: goto L147;
            case 2: goto L145;
            case 3: goto L143;
            case 4: goto L141;
            case 5: goto L139;
            case 6: goto L132;
            case 7: goto L130;
            case 8: goto L128;
            case 9: goto L126;
            case 10: goto L149;
            case 11: goto L147;
            case 12: goto L118;
            case 13: goto L145;
            case 14: goto L109;
            case 15: goto L100;
            case 16: goto L128;
            case 17: goto L130;
            case 18: goto L143;
            case 19: goto L141;
            case 20: goto L139;
            case 21: goto L132;
            case 22: goto L126;
            default: goto L177;
        };
    L100:
        ArrayList r10 = d((String) r8.get(0));
        int r2 = r10.size();
        if (r2 == 1) goto L107;
        if (r2 == 2) goto L106;
        if (r2 != 3) goto L178;
        r9.x = (Integer) r10.get(2);
        goto L106
    L178:
        return;
    L106:
        r9.w = (Integer) r10.get(1);
    L107:
        r9.v = (Integer) r10.get(0);
        return;
    L109:
        ArrayList r11 = d((String) r8.get(0));
        int r3 = r11.size();
        if (r3 == 1) goto L116;
        if (r3 == 2) goto L115;
        if (r3 != 3) goto L179;
        r9.u = (Integer) r11.get(2);
        goto L115
    L179:
        return;
    L115:
        r9.t = (Integer) r11.get(1);
    L116:
        r9.s = (Integer) r11.get(0);
        return;
    L118:
        Integer r4 = jz4.O((String) r8.get(0));
        if (r4 != null) goto L122;
        r9.D = (CharSequence) r8.get(0);
        return;
    L122:
        String r12 = pv1.a(r4.intValue());
        if (r12 == null) goto L176;
        r9.D = r12;
        return;
    L176:
        return;
    L126:
        r9.s = Integer.valueOf(Integer.parseInt((String) r8.get(0)));     // Catch: Throwable -> L151
        return;
    L128:
        r9.y = (CharSequence) r8.get(0);
        return;
    L130:
        r9.a = (CharSequence) r8.get(0);
        return;
    L132:
        String r13 = (String) r8.get(0);
        String r5 = f35.a;
        String[] r14 = r13.split("/", -1);
        int r6 = Integer.parseInt(r14[0]);     // Catch: Throwable -> L151
        if (r14.length <= 1) goto L136;
        Integer r15 = Integer.valueOf(Integer.parseInt(r14[1]));     // Catch: Throwable -> L151
    L137:
        r9.n = Integer.valueOf(r6);     // Catch: Throwable -> L151
        r9.o = r15;     // Catch: Throwable -> L151
        return;
    L136:
        r15 = null;
        goto L137
    L139:
        r9.A = (CharSequence) r8.get(0);
        return;
    L141:
        r9.d = (CharSequence) r8.get(0);
        return;
    L143:
        r9.b = (CharSequence) r8.get(0);
        return;
    L145:
        String r16 = (String) r8.get(0);     // Catch: Throwable -> L151
        int r7 = Integer.parseInt(r16.substring(2, 4));     // Catch: Throwable -> L151
        int r17 = Integer.parseInt(r16.substring(0, 2));     // Catch: Throwable -> L151
        r9.t = Integer.valueOf(r7);     // Catch: Throwable -> L151
        r9.u = Integer.valueOf(r17);     // Catch: Throwable -> L151
        return;
    L147:
        r9.z = (CharSequence) r8.get(0);
        return;
    L149:
        r9.c = (CharSequence) r8.get(0);
        return;
    L177:
        return;
    L180:
        return;
    L6:
        if (r0.equals("TYER") == false) goto L153;
        r1 = 22;
        goto L97
    L153:
        r1 = -1;
        goto L97
    L10:
        if (r0.equals("TRCK") == false) goto L154;
        r1 = 21;
        goto L97
    L154:
        r1 = -1;
        goto L97
    L14:
        if (r0.equals("TPE3") == false) goto L155;
        r1 = 20;
        goto L97
    L155:
        r1 = -1;
        goto L97
    L18:
        if (r0.equals("TPE2") == false) goto L156;
        r1 = 19;
        goto L97
    L156:
        r1 = -1;
        goto L97
    L22:
        if (r0.equals("TPE1") == false) goto L157;
        r1 = 18;
        goto L97
    L157:
        r1 = -1;
        goto L97
    L26:
        if (r0.equals("TIT2") == false) goto L158;
        r1 = 17;
        goto L97
    L158:
        r1 = -1;
        goto L97
    L30:
        if (r0.equals("TEXT") == false) goto L159;
        r1 = 16;
        goto L97
    L159:
        r1 = -1;
        goto L97
    L34:
        if (r0.equals("TDRL") == false) goto L160;
        r1 = 15;
        goto L97
    L160:
        r1 = -1;
        goto L97
    L38:
        if (r0.equals("TDRC") == false) goto L161;
        r1 = 14;
        goto L97
    L161:
        r1 = -1;
        goto L97
    L42:
        if (r0.equals("TDAT") == false) goto L162;
        r1 = 13;
        goto L97
    L162:
        r1 = -1;
        goto L97
    L46:
        if (r0.equals("TCON") == false) goto L163;
        r1 = 12;
        goto L97
    L163:
        r1 = -1;
        goto L97
    L50:
        if (r0.equals("TCOM") == false) goto L164;
        r1 = 11;
        goto L97
    L164:
        r1 = -1;
        goto L97
    L54:
        if (r0.equals("TALB") == false) goto L165;
        r1 = 10;
        goto L97
    L165:
        r1 = -1;
        goto L97
    L58:
        if (r0.equals("TYE") == false) goto L166;
        r1 = 9;
        goto L97
    L166:
        r1 = -1;
        goto L97
    L62:
        if (r0.equals("TXT") == false) goto L167;
        r1 = 8;
        goto L97
    L167:
        r1 = -1;
        goto L97
    L66:
        if (r0.equals("TT2") == false) goto L168;
        r1 = 7;
        goto L97
    L168:
        r1 = -1;
        goto L97
    L70:
        if (r0.equals("TRK") == false) goto L169;
        r1 = 6;
        goto L97
    L169:
        r1 = -1;
        goto L97
    L74:
        if (r0.equals("TP3") == false) goto L170;
        r1 = 5;
        goto L97
    L170:
        r1 = -1;
        goto L97
    L78:
        if (r0.equals("TP2") == false) goto L171;
        r1 = 4;
        goto L97
    L171:
        r1 = -1;
        goto L97
    L82:
        if (r0.equals("TP1") == false) goto L172;
        r1 = 3;
        goto L97
    L172:
        r1 = -1;
        goto L97
    L86:
        if (r0.equals("TDA") == false) goto L173;
        r1 = 2;
        goto L97
    L173:
        r1 = -1;
        goto L97
    L90:
        if (r0.equals("TCM") == false) goto L174;
        r1 = 1;
        goto L97
    L174:
        r1 = -1;
        goto L97
    L94:
        if (r0.equals("TAL") == false) goto L175;
        r1 = 0;
        goto L97
    L175:
        r1 = -1;
        goto L97
    }

    public final boolean equals(Object r3) {
        if (this == r3) goto L18;
        if (r3 != null) goto L6;
        return false;
    L6:
        if (ds4.class != r3.getClass()) goto L22;
        ds4 r4 = (ds4) r3;
        if (this.a.equals(r4.a) == true) goto L11;
        return false;
    L11:
        if (Objects.equals(this.b, r4.b) == true) goto L13;
        return false;
    L13:
        if (this.d.equals(r4.d) == false) goto L21;
        return true;
    L21:
        return false;
    L22:
        return false;
    L18:
        return true;
    }

    public final int hashCode() {
        int r0 = f34.e(this.a, 527, 31);
        String r1 = this.b;
        if (r1 == null) goto L5;
        int r2 = r1.hashCode();
    L6:
        int r3 = this.d.hashCode();
        return r3 + ((r0 + r2) * 31);
    L5:
        r2 = 0;
        goto L6
    }

    @Override // defpackage.nv1
    public final String toString() {
        return this.a + ": description=" + this.b + ": values=" + this.d;
    }
}
