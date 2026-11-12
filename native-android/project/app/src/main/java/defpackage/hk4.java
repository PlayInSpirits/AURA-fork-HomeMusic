package defpackage;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hk4 implements zn4 {
    public static final Pattern t = null;
    public final boolean n;
    public final qx0 o;
    public final be3 p;
    public LinkedHashMap q;
    public float r;
    public float s;

    static {
        t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    }

    public hk4(List r5) {
        this.r = -3.4028235E38f;
        this.s = -3.4028235E38f;
        this.p = new be3();
        if (r5 != null) goto L5;
    L8:
        this.n = false;
        this.o = null;
        return;
    L5:
        if (r5.isEmpty() == true) goto L8;
        this.n = true;
        byte[] r0 = (byte[]) r5.get(0);
        Charset r3 = StandardCharsets.UTF_8;
        String r2 = new String(r0, r3);
        rr2.l(r2.startsWith("Format:"));
        qx0 r1 = qx0.a(r2);
        r1.getClass();
        this.o = r1;
        d(new be3((byte[]) r5.get(1)), r3);
    }

    public static int a(long r3, ArrayList r5, ArrayList r6) {
        int r0 = r5.size() - 1;
    L3:
        if (r0 < 0) goto L11;
        if (((Long) r5.get(r0)).longValue() == r3) goto L6;
        if (((Long) r5.get(r0)).longValue() < r3) goto L9;
        r0 = r0 - 1;
        goto L3
    L9:
        int r1 = r0 + 1;
    L12:
        r5.add(r1, Long.valueOf(r3));
        if (r1 != 0) goto L15;
        ArrayList r4 = new ArrayList();
    L16:
        r6.add(r1, r4);
        return r1;
    L15:
        r4 = new ArrayList((Collection) r6.get(r1 - 1));
        goto L16
    L6:
        return r0;
    L11:
        r1 = 0;
        goto L12
    }

    public static long e(String r6) {
        Matcher r7 = t.matcher(r6.trim());
        if (r7.matches() == true) goto L6;
        return -9223372036854775807L;
    L6:
        String r0 = r7.group(1);
        String r1 = f35.a;
        long r2 = Long.parseLong(r0) * 3600000000L;
        long r3 = (Long.parseLong(r7.group(2)) * 60000000) + r2;
        long r4 = (Long.parseLong(r7.group(3)) * 1000000) + r3;
        return (Long.parseLong(r7.group(4)) * 10000) + r4;
    }

    @Override // defpackage.zn4
    public final void c(byte[] r44, int r45, int r46, yn4 r47, wc0 r48) {
        hk4 r0 = this;
        long r4 = r47.b;
        ArrayList r6 = new ArrayList();
        ArrayList r7 = new ArrayList();
        be3 r9 = r0.p;
        r9.L(r45 + r46, r44);
        r9.N(r45);
        Charset r1 = r9.J();
        if (r1 != null) goto L6;
        r1 = StandardCharsets.UTF_8;
    L6:
        boolean r8 = r0.n;
        if (r8 == true) goto L9;
        r0.d(r9, r1);
    L9:
        if (r8 == false) goto L11;
        qx0 r10 = r0.o;
    L12:
        String r11 = r9.n(r1);
        if (r11 == null) goto L149;
        if (r11.startsWith("Format:") == true) goto L16;
        if (r11.startsWith("Dialogue:") == true) goto L20;
    L22:
        Charset r38 = r1;
    L23:
        long r39 = r4;
        be3 r42 = r9;
    L148:
        r0 = this;
        r1 = r38;
        r4 = r39;
        r10 = r10;
        r9 = r42;
        goto L12
    L20:
        if (r10 != null) goto L24;
        l93.q0("SsaParser", "Skipping dialogue line before complete format: ".concat(r11));
        goto L22
    L24:
        int r13 = r10.f;
        rr2.l(r11.startsWith("Dialogue:"));
        String r12 = r11.substring(9);
        int r14 = r10.a;
        String[] r15 = r12.split(",", r13);
        if (r15.length == r13) goto L28;
        l93.q0("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(r11));
        goto L22
    L28:
        if (r14 != (-1)) goto L188;
    L32:
        int r37 = 0;
    L33:
        long r16 = e(r15[r10.b]);
        r38 = r1;
        if (r16 != (-9223372036854775807L)) goto L36;
        l93.q0("SsaParser", "Skipping invalid timing: ".concat(r11));
        goto L23
    L36:
        r39 = r4;
        long r5 = e(r15[r10.c]);
        if (r5 != (-9223372036854775807L)) goto L39;
    L40:
        r42 = r9;
        l93.q0("SsaParser", "Skipping invalid timing: ".concat(r11));
        goto L148
    L39:
        if (r5 <= r16) goto L40;
        LinkedHashMap r2 = r0.q;
        if (r2 == null) goto L46;
        int r17 = r10.d;
        if (r17 == (-1)) goto L46;
        kk4 r3 = (kk4) r2.get(r15[r17].trim());
    L47:
        String r18 = r15[r10.e];
        Matcher r19 = jk4.a.matcher(r18);
        PointF r20 = null;
        int r110 = -1;
    L49:
        if (r19.find() == false) goto L62;
        be3 r43 = r9;
        String r21 = r19.group(1);
        r21.getClass();
        PointF r22 = jk4.a(r21);     // Catch: RuntimeException -> L182
        if (r22 == null) goto L186;
        r20 = r22;
    L186:
        Matcher r23 = jk4.d.matcher(r21);     // Catch: RuntimeException -> L183
        if (r23.find() == false) goto L58;
        String r24 = r23.group(1);     // Catch: RuntimeException -> L183
        r24.getClass();     // Catch: RuntimeException -> L183
        int r25 = kk4.a(r24);     // Catch: RuntimeException -> L183
    L59:
        if (r25 == (-1)) goto L61;
        r110 = r25;
        goto L61
    L58:
        r25 = -1;
    L61:
        r9 = r43;
        goto L49
    L62:
        r42 = r9;
        String r26 = jk4.a.matcher(r18).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
        float r27 = r0.r;
        float r111 = r0.s;
        SpannableString r112 = new SpannableString(r26);
        if (r3 == null) goto L95;
        boolean r28 = r3.g;
        Integer r29 = r3.d;
        Integer r30 = r3.c;
        if (r30 == null) goto L67;
        int r31 = 33;
        int r113 = 0;
        r112.setSpan(new ForegroundColorSpan(r30.intValue()), 0, r112.length(), 33);
    L69:
        if (r3.j != 3) goto L72;
        if (r29 == null) goto L72;
        r112.setSpan(new BackgroundColorSpan(r29.intValue()), r113, r112.length(), r31);
    L72:
        float r32 = r3.e;
        if (r32 != (-3.4028235E38f)) goto L75;
    L77:
        float r33 = -3.4028235E38f;
        int r34 = Integer.MIN_VALUE;
    L78:
        boolean r35 = r3.f;
        if (r35 == false) goto L82;
        if (r28 == false) goto L82;
        int r114 = r34;
        float r210 = r33;
        int r36 = 33;
        int r40 = 0;
        r112.setSpan(new StyleSpan(3), 0, r112.length(), 33);
    L88:
        if (r3.h == false) goto L91;
        r112.setSpan(new UnderlineSpan(), r40, r112.length(), r36);
    L91:
        if (r3.i == false) goto L93;
        r112.setSpan(new StrikethroughSpan(), r40, r112.length(), r36);
    L93:
        int r211 = r114;
        float r310 = r210;
    L96:
        if (r110 != (-1)) goto L102;
        if (r3 == null) goto L100;
        r110 = r3.b;
        goto L102
    L100:
        r110 = -1;
    L102:
        switch(r110) {
            case -1: goto L104;
            case 0: goto L103;
            case 1: goto L108;
            case 2: goto L107;
            case 3: goto L105;
            case 4: goto L108;
            case 5: goto L107;
            case 6: goto L105;
            case 7: goto L108;
            case 8: goto L107;
            case 9: goto L105;
            default: goto L103;
        };
    L103:
        xa3.m(r110, "Unknown alignment: ", "SsaParser");
    L104:
        Layout.Alignment r212 = null;
    L109:
        int r41 = Integer.MIN_VALUE;
        switch(r110) {
            case -1: goto L112;
            case 0: goto L111;
            case 1: goto L115;
            case 2: goto L114;
            case 3: goto L113;
            case 4: goto L115;
            case 5: goto L114;
            case 6: goto L113;
            case 7: goto L115;
            case 8: goto L114;
            case 9: goto L113;
            default: goto L111;
        };
    L111:
        xa3.m(r110, "Unknown alignment: ", "SsaParser");
    L112:
        int r49 = Integer.MIN_VALUE;
    L116:
        switch(r110) {
            case -1: goto L121;
            case 0: goto L117;
            case 1: goto L120;
            case 2: goto L120;
            case 3: goto L120;
            case 4: goto L119;
            case 5: goto L119;
            case 6: goto L119;
            case 7: goto L118;
            case 8: goto L118;
            case 9: goto L118;
            default: goto L117;
        };
    L117:
        xa3.m(r110, "Unknown alignment: ", "SsaParser");
        goto L121
    L118:
        r41 = r40;
        goto L121
    L119:
        r41 = 1;
        goto L121
    L120:
        r41 = 2;
    L121:
        if (r20 != null) goto L123;
    L127:
        float r115 = 0.95f;
        if (r49 == 0) goto L136;
        int r116 = 1;
        if (r49 == 1) goto L135;
        int r117 = 2;
        if (r49 == 2) goto L134;
        float r118 = -3.4028235E38f;
    L137:
        if (r41 == 0) goto L142;
        if (r41 == r116) goto L141;
        if (r41 == r117) goto L143;
        r115 = -3.4028235E38f;
    L143:
        float r213 = r115;
        float r214 = r118;
    L144:
        ig0 r119 = new ig0(r112, r212, null, null, r213, r40, r41, r214, r49, r211, r310, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, r37);
        int r50 = a(r16, r7, r6);
        int r51 = a(r5, r7, r6);
    L145:
        if (r50 >= r51) goto L148;
        ((List) r6.get(r50)).add(r119);
        r50 = r50 + 1;
        goto L145
    L141:
        r115 = 0.5f;
        goto L143
    L142:
        r115 = 0.05f;
        goto L143
    L134:
        r118 = 0.95f;
        goto L137
    L135:
        r117 = 2;
        r118 = 0.5f;
        goto L137
    L136:
        r116 = 1;
        r117 = 2;
        r118 = 0.05f;
        goto L137
    L123:
        if (r111 == (-3.4028235E38f)) goto L127;
        if (r27 == (-3.4028235E38f)) goto L127;
        r214 = r20.x / r27;
        r213 = r20.y / r111;
        goto L144
    L113:
        r49 = 2;
        goto L116
    L114:
        r49 = 1;
        goto L116
    L115:
        r49 = r40;
        goto L116
    L105:
        Layout.Alignment r52 = Layout.Alignment.ALIGN_OPPOSITE;
    L106:
        r212 = r52;
        goto L109
    L107:
        r52 = Layout.Alignment.ALIGN_CENTER;
        goto L106
    L108:
        r52 = Layout.Alignment.ALIGN_NORMAL;
    L82:
        r114 = r34;
        r210 = r33;
        r36 = 33;
        r40 = 0;
        if (r35 == false) goto L85;
        r112.setSpan(new StyleSpan(1), 0, r112.length(), 33);
        goto L88
    L85:
        if (r28 == 0) goto L88;
        r112.setSpan(new StyleSpan(2), 0, r112.length(), 33);
        goto L88
    L75:
        if (r111 == (-3.4028235E38f)) goto L77;
        r33 = r32 / r111;
        r34 = 1;
        goto L78
    L67:
        r31 = 33;
        r113 = 0;
        goto L69
    L95:
        r27 = r27;
        r111 = r111;
        r40 = 0;
        r310 = -3.4028235E38f;
        r211 = Integer.MIN_VALUE;
    L46:
        r3 = null;
        goto L47
    L188:
        r37 = Integer.parseInt(r15[r14].trim());     // Catch: RuntimeException -> L31
    L31:
        l93.q0("SsaParser", "Fail to parse layer: " + r15[r14]);
        goto L32
    L16:
        r10 = qx0.a(r11);
        goto L12
    L149:
        long r311 = r4;
        if (r311 != (-9223372036854775807L)) goto L152;
    L154:
        ArrayList r120 = null;
    L155:
        int r53 = 0;
    L157:
        if (r53 >= r6.size()) goto L177;
        List r215 = (List) r6.get(r53);
        if (r215.isEmpty() == false) goto L163;
        if (r53 == 0) goto L163;
    L173:
        r53 = r53 + 1;
    L163:
        if (r53 == (r6.size() - 1)) goto L174;
        long r121 = ((Long) r7.get(r53)).longValue();
        long r54 = ((Long) r7.get(r53 + 1)).longValue();
        lg0 r122 = new lg0(r121, r54 - r121, r215);
        if (r311 == (-9223372036854775807L)) goto L172;
        if (r54 >= r311) goto L172;
        if (r120 == null) goto L173;
        r120.add(r122);
    L172:
        r48.accept(r122);
        goto L173
    L174:
        tb4.a();
        return;
    L177:
        if (r120 == null) goto L181;
        int r55 = r120.size();
        int r123 = 0;
    L179:
        if (r123 >= r55) goto L207;
        Object r56 = r120.get(r123);
        r123 = r123 + 1;
        r48.accept((lg0) r56);
        goto L179
    L207:
        return;
    L181:
        return;
    L152:
        if (r47.a == false) goto L154;
        r120 = new ArrayList();
        goto L155
    L11:
        r10 = null;
        goto L12
    }

    public final void d(be3 r39, Charset r40) {
    L3:
        String r0 = r39.n(r40);
        if (r0 == null) goto L178;
        int r5 = 0;
        int r6 = 91;
        if ("[Script Info]".equalsIgnoreCase(r0) == true) goto L7;
        if ("[V4+ Styles]".equalsIgnoreCase(r0) == true) goto L29;
        if ("[V4 Styles]".equalsIgnoreCase(r0) == true) goto L175;
        if ("[Events]".equalsIgnoreCase(r0) == false) goto L3;
        return;
    L175:
        l93.K("SsaParser", "[V4 Styles] are not supported");
        goto L3
    L29:
        LinkedHashMap r2 = new LinkedHashMap();
        ik4 r10 = null;
    L30:
        String r11 = r39.n(r40);
        if (r11 == null) goto L172;
        if (r39.a() == 0) goto L39;
        int r1 = r39.h(r40);
        if (r1 == 0) goto L37;
        int r3 = jz4.m(r1 >>> 8);
    L38:
        if (r3 == r6) goto L172;
    L37:
        r3 = 1114112;
    L39:
        int r14 = -1;
        if (r11.startsWith("Format:") == true) goto L41;
        if (r11.startsWith("Style:") == false) goto L171;
        if (r10 != null) goto L108;
        l93.q0("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(r11));
        goto L171
    L108:
        rr2.l(r11.startsWith("Style:"));
        String[] r4 = TextUtils.split(r11.substring(6), ",");
        int r7 = r4.length;
        int r12 = r10.k;
        if (r7 == r12) goto L181;
        int r8 = r4.length;
        String r9 = f35.a;
        Locale r13 = Locale.US;
        StringBuilder r15 = b11.t("Skipping malformed 'Style:' line (expected ", " values, found ", r12, r8, "): '");
        r15.append(r11);
        r15.append("'");
        l93.q0("SsaStyle", r15.toString());
    L111:
        kk4 r16 = null;
    L169:
        if (r16 == null) goto L171;
        r2.put(r16.a, r16);
        goto L171
    L181:
        String r28 = r4[r10.a].trim();     // Catch: RuntimeException -> L115
        int r17 = r10.b;     // Catch: RuntimeException -> L115
        if (r17 == (-1)) goto L117;
        int r29 = kk4.a(r4[r17].trim());     // Catch: RuntimeException -> L115
    L118:
        int r18 = r10.c;     // Catch: RuntimeException -> L115
        if (r18 == (-1)) goto L121;
        Integer r30 = kk4.c(r4[r18].trim());     // Catch: RuntimeException -> L115
    L122:
        int r19 = r10.d;     // Catch: RuntimeException -> L115
        if (r19 == (-1)) goto L125;
        Integer r31 = kk4.c(r4[r19].trim());     // Catch: RuntimeException -> L115
    L126:
        int r20 = r10.e;     // Catch: RuntimeException -> L115
        float r110 = -3.4028235E38f;
        if (r20 == (-1)) goto L133;
        String r21 = r4[r20].trim();     // Catch: RuntimeException -> L115
        r110 = Float.parseFloat(r21);     // Catch: RuntimeException -> L115 NumberFormatException -> L131
    L131:
        e = move-exception;
        l93.r0("SsaStyle", "Failed to parse font size: '" + r21 + "'", e);     // Catch: RuntimeException -> L115
    L133:
        float r32 = r110;
        int r22 = r10.f;     // Catch: RuntimeException -> L115
        if (r22 != (-1)) goto L136;
    L138:
        boolean r33 = false;
    L139:
        int r23 = r10.g;     // Catch: RuntimeException -> L115
        if (r23 != (-1)) goto L142;
    L144:
        boolean r34 = false;
    L145:
        int r24 = r10.h;     // Catch: RuntimeException -> L115
        if (r24 != (-1)) goto L148;
    L150:
        boolean r35 = false;
    L151:
        int r25 = r10.i;     // Catch: RuntimeException -> L115
        if (r25 != (-1)) goto L154;
    L156:
        boolean r36 = false;
    L157:
        int r26 = r10.j;     // Catch: RuntimeException -> L115
        if (r26 == (-1)) goto L167;
        String r27 = r4[r26].trim();     // Catch: RuntimeException -> L115
        int r37 = Integer.parseInt(r27.trim());     // Catch: RuntimeException -> L115 NumberFormatException -> L180
        if (r37 == 1) goto L164;
        if (r37 != 3) goto L165;
    L164:
        r14 = r37;
    L165:
        l93.q0("SsaStyle", "Ignoring unknown BorderStyle: " + r27);     // Catch: RuntimeException -> L115
    L167:
        r16 = new kk4(r28, r29, r30, r31, r32, r33, r34, r35, r36, r14);     // Catch: RuntimeException -> L115
        goto L169
    L154:
        if (kk4.b(r4[r25].trim()) == false) goto L156;
        r36 = true;
        goto L157
    L148:
        if (kk4.b(r4[r24].trim()) == false) goto L150;
        r35 = true;
        goto L151
    L142:
        if (kk4.b(r4[r23].trim()) == false) goto L144;
        r34 = true;
        goto L145
    L136:
        if (kk4.b(r4[r22].trim()) == false) goto L138;
        r33 = true;
        goto L139
    L125:
        r31 = null;
        goto L126
    L121:
        r30 = null;
        goto L122
    L117:
        r29 = -1;
    L115:
        e = move-exception;
        l93.r0("SsaStyle", "Skipping malformed 'Style:' line: '" + r11 + "'", e);
    L171:
        r5 = 0;
        r6 = 91;
        goto L30
    L41:
        String[] r111 = TextUtils.split(r11.substring(7), ",");
        int r112 = r5;
        int r113 = -1;
        int r114 = -1;
        int r115 = -1;
        int r116 = -1;
        int r210 = -1;
        int r211 = -1;
        int r212 = -1;
        int r213 = -1;
        int r214 = -1;
        int r215 = -1;
    L43:
        if (r112 >= r111.length) goto L100;
        String r38 = rr2.U(r111[r112].trim());
        r38.getClass();
        switch(r38.hashCode()) {
            case -1178781136: goto L84;
            case -1026963764: goto L80;
            case -192095652: goto L76;
            case -70925746: goto L72;
            case 3029637: goto L68;
            case 3373707: goto L64;
            case 366554320: goto L60;
            case 767321349: goto L56;
            case 1767875043: goto L52;
            case 1988365454: goto L48;
            default: goto L46;
        };
    L46:
        int r41 = -1;
    L87:
        switch(r41) {
            case 0: goto L98;
            case 1: goto L97;
            case 2: goto L96;
            case 3: goto L95;
            case 4: goto L94;
            case 5: goto L93;
            case 6: goto L92;
            case 7: goto L91;
            case 8: goto L90;
            case 9: goto L89;
            default: goto L99;
        };
    L89:
        r116 = r112;
        goto L99
    L90:
        r114 = r112;
        goto L99
    L91:
        r215 = r112;
        goto L99
    L92:
        r210 = r112;
        goto L99
    L93:
        r113 = r112;
        goto L99
    L94:
        r211 = r112;
        goto L99
    L95:
        r115 = r112;
        goto L99
    L96:
        r214 = r112;
        goto L99
    L97:
        r213 = r112;
        goto L99
    L98:
        r212 = r112;
    L99:
        r112 = r112 + 1;
        goto L43
    L48:
        if (r38.equals("outlinecolour") == false) goto L230;
        r41 = 9;
        goto L87
    L230:
        r41 = -1;
        goto L87
    L52:
        if (r38.equals("alignment") == false) goto L231;
        r41 = 8;
        goto L87
    L231:
        r41 = -1;
        goto L87
    L56:
        if (r38.equals("borderstyle") == false) goto L232;
        r41 = 7;
        goto L87
    L232:
        r41 = -1;
        goto L87
    L60:
        if (r38.equals("fontsize") == false) goto L233;
        r41 = 6;
        goto L87
    L233:
        r41 = -1;
        goto L87
    L64:
        if (r38.equals("name") == false) goto L234;
        r41 = 5;
        goto L87
    L234:
        r41 = -1;
        goto L87
    L68:
        if (r38.equals("bold") == false) goto L235;
        r41 = 4;
        goto L87
    L235:
        r41 = -1;
        goto L87
    L72:
        if (r38.equals("primarycolour") == false) goto L236;
        r41 = 3;
        goto L87
    L236:
        r41 = -1;
        goto L87
    L76:
        if (r38.equals("strikeout") == false) goto L237;
        r41 = 2;
        goto L87
    L237:
        r41 = -1;
        goto L87
    L80:
        if (r38.equals("underline") == false) goto L238;
        r41 = 1;
        goto L87
    L238:
        r41 = -1;
        goto L87
    L84:
        if (r38.equals("italic") == false) goto L239;
        r41 = r5;
        goto L87
    L239:
        r41 = -1;
        goto L87
    L100:
        if (r113 == (-1)) goto L102;
        r10 = new ik4(r113, r114, r115, r116, r210, r211, r212, r213, r214, r215, r111.length);
        goto L30
    L102:
        r10 = null;
    L172:
        this.q = r2;
    L7:
        String r42 = r39.n(r40);
        if (r42 == null) goto L3;
        if (r39.a() == 0) goto L16;
        int r43 = r39.h(r40);
        if (r43 == 0) goto L14;
        int r44 = jz4.m(r43 >>> 8);
    L15:
        if (r44 == 91) goto L3;
    L14:
        r44 = 1114112;
    L16:
        String[] r45 = r42.split(":");
        if (r45.length != 2) goto L7;
        String r46 = rr2.U(r45[0].trim());
        r46.getClass();
        if (r46.equals("playresx") == false) goto L22;
        this.r = Float.parseFloat(r45[1].trim());     // Catch: NumberFormatException -> L179
        goto L7
    L22:
        if (r46.equals("playresy") == false) goto L7;
        this.s = Float.parseFloat(r45[1].trim());     // Catch: NumberFormatException -> L179
        goto L7
    }
}
