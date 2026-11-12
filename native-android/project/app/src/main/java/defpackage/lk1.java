package defpackage;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lk1 extends bz4 {
    public final /* synthetic */ int a;

    public /* synthetic */ lk1(int r1) {
        this.a = r1;
    }

    public static h32 c(int r2, l32 r3) {
        int r0 = xa3.w(r2);
        if (r0 == 5) goto L19;
        if (r0 == 6) goto L17;
        if (r0 == 7) goto L15;
        if (r0 != 8) goto L12;
        r3.a0();
        return i32.n;
    L12:
        kf2.o("Unexpected token: ".concat(b11.x(r2)));
        return null;
    L15:
        return new k32(Boolean.valueOf(r3.R()));
    L17:
        return new k32(new q72(r3.c0()));
    L19:
        return new k32(r3.c0());
    }

    public static void d(q32 r3, h32 r4) {
        if (r4 != null) goto L4;
    L35:
        r3.F();
        return;
    L4:
        if ((r4 instanceof i32) == true) goto L35;
        if ((r4 instanceof k32) == false) goto L19;
        k32 r5 = (k32) r4;
        Serializable r0 = r5.n;
        if ((r0 instanceof Number) == false) goto L13;
        r3.T(r5.e());
        return;
    L13:
        if ((r0 instanceof Boolean) == false) goto L16;
        r3.X(r5.d());
        return;
    L16:
        r3.W(r5.b());
        return;
    L19:
        if ((r4 instanceof f32) == false) goto L26;
        r3.f();
        ArrayList r6 = ((f32) r4).n;
        int r1 = r6.size();
        int r2 = 0;
    L21:
        if (r2 >= r1) goto L23;
        Object r7 = r6.get(r2);
        r2 = r2 + 1;
        d(r3, (h32) r7);
        goto L21
    L23:
        r3.q();
        return;
    L26:
        if ((r4 instanceof j32) == false) goto L33;
        r3.j();
        Iterator r8 = ((lb2) r4.a().n.entrySet()).iterator();
    L29:
        if (((kb2) r8).hasNext() == false) goto L31;
        mb2 r9 = ((kb2) r8).b();
        r3.u((String) r9.getKey());
        d(r3, (h32) r9.getValue());
        goto L29
    L31:
        r3.s();
        return;
    L33:
        kf2.l(r4.getClass(), "Couldn't write ");
    }

    @Override // defpackage.bz4
    public final Object a(l32 r21) {
        int r10 = 0;
        String r12 = null;
        switch(this.a) {
            case 0: goto L306;
            case 1: goto L301;
            case 2: goto L296;
            case 3: goto L283;
            case 4: goto L276;
            case 5: goto L271;
            case 6: goto L266;
            case 7: goto L257;
            case 8: goto L248;
            case 9: goto L240;
            case 10: goto L231;
            case 11: goto L226;
            case 12: goto L221;
            case 13: goto L219;
            case 14: goto L214;
            case 15: goto L206;
            case 16: goto L195;
            case 17: goto L190;
            case 18: goto L181;
            case 19: goto L174;
            case 20: goto L149;
            case 21: goto L128;
            case 22: goto L77;
            case 23: goto L54;
            case 24: goto L47;
            case 25: goto L43;
            case 26: goto L28;
            case 27: goto L13;
            default: goto L5;
        };
    L47:
        int r0 = r21.e0();
        if (r0 != 9) goto L50;
        r21.a0();
        return null;
    L50:
        if (r0 != 6) goto L53;
        return Boolean.valueOf(Boolean.parseBoolean(r21.c0()));
    L53:
        return Boolean.valueOf(r21.R());
    L54:
        BitSet r1 = new BitSet();
        r21.b();
        int r2 = r21.e0();
        int r3 = 0;
    L55:
        if (r2 == 2) goto L74;
        int r7 = xa3.w(r2);
        if (r7 == 5) goto L64;
        if (r7 == 6) goto L64;
        if (r7 != 7) goto L63;
        boolean r4 = r21.R();
    L69:
        if (r4 == false) goto L71;
        r1.set(r3);
    L71:
        r3 = r3 + 1;
        r2 = r21.e0();
        goto L55
    L63:
        throw new JsonSyntaxException("Invalid bitset value type: " + b11.x(r2) + "; at path " + r21.v());
    L64:
        int r5 = r21.W();
        if (r5 != 0) goto L67;
        r4 = false;
        goto L69
    L67:
        if (r5 != 1) goto L72;
        r4 = true;
        goto L69
    L72:
        StringBuilder r6 = f34.j(r5, "Invalid bitset value ", ", expected 0 or 1; at path ");
        r6.append(r21.H());
        throw new JsonSyntaxException(r6.toString());
    L74:
        r21.q();
        return r1;
    L174:
        String r8 = r21.c0();
        return Currency.getInstance(r8);
    L177:
        e = move-exception;
        oi0.a(xa3.j("Failed parsing '", r8, "' as Currency; at path "), r21.H(), e);
        return null;
    L248:
        int r9 = r21.e0();
        if (r9 != 9) goto L252;
        r21.a0();
        return null;
    L252:
        if (r9 != 8) goto L255;
        return Boolean.toString(r21.R());
    L255:
        return r21.c0();
    L283:
        ArrayList r11 = new ArrayList();
        r21.b();
    L285:
        if (r21.J() == false) goto L291;
        r11.add(Integer.valueOf(r21.W()));     // Catch: NumberFormatException -> L288
    L288:
        e = move-exception;
        throw new JsonSyntaxException(e);
    L291:
        r21.q();
        int r13 = r11.size();
        AtomicIntegerArray r14 = new AtomicIntegerArray(r13);
    L292:
        if (r10 >= r13) goto L294;
        r14.set(r10, ((Integer) r11.get(r10)).intValue());
        r10 = r10 + 1;
        goto L292
    L294:
        return r14;
    L5:
        if (r21.e0() != 9) goto L328;
        r21.a0();
        return null;
    L328:
        return Integer.valueOf(r21.W());
    L9:
        e = move-exception;
        throw new JsonSyntaxException(e);
    L13:
        if (r21.e0() != 9) goto L310;
        r21.a0();
        return null;
    L310:
        int r15 = r21.W();     // Catch: NumberFormatException -> L24
        if (r15 <= 65535) goto L19;
    L22:
        StringBuilder r16 = f34.j(r15, "Lossy conversion from ", " to short; at path ");
        r16.append(r21.H());
        throw new JsonSyntaxException(r16.toString());
    L19:
        if (r15 < (-32768)) goto L22;
        return Short.valueOf((short) r15);
    L24:
        e = move-exception;
        throw new JsonSyntaxException(e);
    L28:
        if (r21.e0() != 9) goto L320;
        r21.a0();
        return null;
    L320:
        int r17 = r21.W();     // Catch: NumberFormatException -> L39
        if (r17 <= 255) goto L34;
    L37:
        StringBuilder r18 = f34.j(r17, "Lossy conversion from ", " to byte; at path ");
        r18.append(r21.H());
        throw new JsonSyntaxException(r18.toString());
    L34:
        if (r17 < (-128)) goto L37;
        return Byte.valueOf((byte) r17);
    L39:
        e = move-exception;
        throw new JsonSyntaxException(e);
    L43:
        if (r21.e0() != 9) goto L46;
        r21.a0();
        return null;
    L46:
        return Boolean.valueOf(r21.c0());
    L77:
        if ((r21 instanceof n32) == false) goto L86;
        n32 r19 = (n32) r21;
        int r20 = r19.e0();
        if (r20 == 5) goto L85;
        if (r20 == 2) goto L85;
        if (r20 == 4) goto L85;
        if (r20 == 10) goto L85;
        h32 r110 = (h32) r19.q0();
        r19.k0();
        return r110;
    L85:
        er1.j(b11.x(r20), " when reading a JsonElement.", "Unexpected ");
        return null;
    L86:
        int r22 = r21.e0();
        int r23 = xa3.w(r22);
        if (r23 == 0) goto L91;
        if (r23 == 2) goto L90;
        h32 r24 = null;
    L92:
        if (r24 == null) goto L374;
        ArrayDeque r25 = new ArrayDeque();
    L96:
        if (r21.J() == true) goto L98;
        if ((r24 instanceof f32) == false) goto L121;
        r21.q();
    L123:
        if (r25.isEmpty() == true) goto L125;
        r24 = (h32) r25.removeLast();
        goto L96
    L125:
        return r24;
    L121:
        r21.s();
        goto L123
    L98:
        if ((r24 instanceof j32) == false) goto L100;
        String r26 = r21.Y();
    L101:
        int r27 = r21.e0();
        int r28 = xa3.w(r27);
        if (r28 == 0) goto L106;
        if (r28 == 2) goto L105;
        h32 r29 = null;
    L107:
        if (r29 == null) goto L109;
        boolean r30 = true;
    L110:
        if (r29 != null) goto L113;
        r29 = c(r27, r21);
    L113:
        if ((r24 instanceof f32) == false) goto L115;
        ((f32) r24).n.add(r29);
    L116:
        if (r30 == false) goto L96;
        r25.addLast(r24);
        r24 = r29;
        goto L96
    L115:
        ((j32) r24).n.put(r26, r29);
        goto L116
    L109:
        r30 = false;
        goto L110
    L105:
        r21.f();
        r29 = new j32();
        goto L107
    L106:
        r21.b();
        r29 = new f32();
        goto L107
    L100:
        r26 = null;
        goto L101
    L374:
        return c(r22, r21);
    L90:
        r21.f();
        r24 = new j32();
        goto L92
    L91:
        r21.b();
        r24 = new f32();
        goto L92
    L128:
        if (r21.e0() != 9) goto L130;
        r21.a0();
        return null;
    L130:
        StringTokenizer r31 = new StringTokenizer(r21.c0(), "_");
        if (r31.hasMoreElements() == false) goto L133;
        String r32 = r31.nextToken();
    L135:
        if (r31.hasMoreElements() == false) goto L137;
        String r33 = r31.nextToken();
    L139:
        if (r31.hasMoreElements() == false) goto L141;
        r12 = r31.nextToken();
    L141:
        if (r33 != null) goto L144;
        if (r12 != null) goto L144;
        return new Locale(r32);
    L144:
        if (r12 != null) goto L147;
        return new Locale(r32, r33);
    L147:
        return new Locale(r32, r33, r12);
    L137:
        r33 = null;
        goto L139
    L133:
        r32 = null;
        goto L135
    L149:
        if (r21.e0() != 9) goto L151;
        r21.a0();
        return null;
    L151:
        r21.f();
        int r111 = 0;
        int r112 = 0;
        int r113 = 0;
        int r114 = 0;
        int r115 = 0;
        int r116 = 0;
    L153:
        if (r21.e0() == 4) goto L172;
        String r34 = r21.Y();
        int r35 = r21.W();
        if ("year".equals(r34) == true) goto L156;
        if ("month".equals(r34) == true) goto L159;
        if ("dayOfMonth".equals(r34) == true) goto L162;
        if ("hourOfDay".equals(r34) == true) goto L165;
        if ("minute".equals(r34) == true) goto L168;
        if ("second".equals(r34) == false) goto L153;
        r116 = r35;
        goto L153
    L168:
        r115 = r35;
        goto L153
    L165:
        r114 = r35;
        goto L153
    L162:
        r113 = r35;
        goto L153
    L159:
        r112 = r35;
        goto L153
    L156:
        r111 = r35;
        goto L153
    L172:
        r21.s();
        return new GregorianCalendar(r111, r112, r113, r114, r115, r116);
    L181:
        if (r21.e0() != 9) goto L183;
        r21.a0();
        return null;
    L183:
        String r36 = r21.c0();
        return UUID.fromString(r36);
    L186:
        e = move-exception;
        oi0.a(xa3.j("Failed parsing '", r36, "' as UUID; at path "), r21.H(), e);
        return null;
    L190:
        if (r21.e0() != 9) goto L193;
        r21.a0();
        return null;
    L193:
        return InetAddress.getByName(r21.c0());
    L195:
        if (r21.e0() != 9) goto L324;
        r21.a0();
        return null;
    L324:
        String r37 = r21.c0();     // Catch: URISyntaxException -> L202
        if ("null".equals(r37) == true) goto L384;
        return new URI(r37);
    L384:
        return null;
    L202:
        e = move-exception;
        throw new JsonIOException(e);
    L206:
        if (r21.e0() != 9) goto L208;
        r21.a0();
        return null;
    L208:
        String r38 = r21.c0();
        if ("null".equals(r38) == false) goto L212;
        return null;
    L212:
        return new URL(r38);
    L214:
        if (r21.e0() != 9) goto L217;
        r21.a0();
        return null;
    L217:
        return new StringBuffer(r21.c0());
    L219:
        throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
    L221:
        if (r21.e0() != 9) goto L224;
        r21.a0();
        return null;
    L224:
        return new StringBuilder(r21.c0());
    L226:
        if (r21.e0() != 9) goto L229;
        r21.a0();
        return null;
    L229:
        return new q72(r21.c0());
    L231:
        if (r21.e0() != 9) goto L233;
        r21.a0();
        return null;
    L233:
        String r39 = r21.c0();
        return new BigInteger(r39);
    L236:
        e = move-exception;
        oi0.a(xa3.j("Failed parsing '", r39, "' as BigInteger; at path "), r21.H(), e);
        return null;
    L240:
        if (r21.e0() != 9) goto L242;
        r21.a0();
        return null;
    L242:
        String r40 = r21.c0();
        return new BigDecimal(r40);
    L245:
        e = move-exception;
        oi0.a(xa3.j("Failed parsing '", r40, "' as BigDecimal; at path "), r21.H(), e);
        return null;
    L257:
        if (r21.e0() != 9) goto L259;
        r21.a0();
        return null;
    L259:
        String r41 = r21.c0();
        if (r41.length() == 1) goto L262;
        StringBuilder r42 = xa3.j("Expecting character, got: ", r41, "; at ");
        r42.append(r21.H());
        throw new JsonSyntaxException(r42.toString());
    L262:
        return Character.valueOf(r41.charAt(0));
    L266:
        if (r21.e0() != 9) goto L269;
        r21.a0();
        return null;
    L269:
        return Double.valueOf(r21.T());
    L271:
        if (r21.e0() != 9) goto L274;
        r21.a0();
        return null;
    L274:
        return Float.valueOf((float) r21.T());
    L276:
        if (r21.e0() != 9) goto L314;
        r21.a0();
        return null;
    L314:
        return Long.valueOf(r21.X());
    L280:
        e = move-exception;
        throw new JsonSyntaxException(e);
    L296:
        if (r21.e0() != 9) goto L299;
        r21.a0();
        return null;
    L299:
        return Long.valueOf(r21.X());
    L301:
        if (r21.e0() != 9) goto L304;
        r21.a0();
        return null;
    L304:
        return Float.valueOf((float) r21.T());
    L306:
        if (r21.e0() != 9) goto L309;
        r21.a0();
        return null;
    L309:
        return Double.valueOf(r21.T());
    }

    @Override // defpackage.bz4
    public final void b(q32 r4, Object r5) {
        int r0 = 0;
        String r1 = null;
        switch(this.a) {
            case 0: goto L137;
            case 1: goto L128;
            case 2: goto L123;
            case 3: goto L118;
            case 4: goto L113;
            case 5: goto L104;
            case 6: goto L99;
            case 7: goto L93;
            case 8: goto L91;
            case 9: goto L89;
            case 10: goto L87;
            case 11: goto L85;
            case 12: goto L79;
            case 13: goto L78;
            case 14: goto L71;
            case 15: goto L65;
            case 16: goto L59;
            case 17: goto L53;
            case 18: goto L47;
            case 19: goto L45;
            case 20: goto L40;
            case 21: goto L34;
            case 22: goto L32;
            case 23: goto L27;
            case 24: goto L25;
            case 25: goto L19;
            case 26: goto L14;
            case 27: goto L9;
            default: goto L4;
        };
    L4:
        Number r6 = (Number) r5;
        if (r6 != null) goto L7;
        r4.F();
        return;
    L7:
        r4.M(r6.intValue());
        return;
    L9:
        Number r7 = (Number) r5;
        if (r7 != null) goto L12;
        r4.F();
        return;
    L12:
        r4.M(r7.shortValue());
        return;
    L14:
        Number r8 = (Number) r5;
        if (r8 != null) goto L17;
        r4.F();
        return;
    L17:
        r4.M(r8.byteValue());
        return;
    L19:
        Boolean r9 = (Boolean) r5;
        if (r9 != null) goto L22;
        String r3 = "null";
    L23:
        r4.W(r3);
        return;
    L22:
        r3 = r9.toString();
        goto L23
    L25:
        r4.R((Boolean) r5);
        return;
    L27:
        BitSet r10 = (BitSet) r5;
        r4.f();
        int r11 = r10.length();
    L28:
        if (r0 >= r11) goto L30;
        r4.M(r10.get(r0) ? 1 : 0);
        r0 = r0 + 1;
        goto L28
    L30:
        r4.q();
        return;
    L32:
        d(r4, (h32) r5);
        return;
    L34:
        Locale r12 = (Locale) r5;
        if (r12 == null) goto L38;
        r1 = r12.toString();
    L38:
        r4.W(r1);
        return;
    L40:
        Calendar r13 = (Calendar) r5;
        if (r13 != null) goto L43;
        r4.F();
        return;
    L43:
        r4.j();
        r4.u("year");
        r4.M(r13.get(1));
        r4.u("month");
        r4.M(r13.get(2));
        r4.u("dayOfMonth");
        r4.M(r13.get(5));
        r4.u("hourOfDay");
        r4.M(r13.get(11));
        r4.u("minute");
        r4.M(r13.get(12));
        r4.u("second");
        r4.M(r13.get(13));
        r4.s();
        return;
    L45:
        r4.W(((Currency) r5).getCurrencyCode());
        return;
    L47:
        UUID r14 = (UUID) r5;
        if (r14 == null) goto L51;
        r1 = r14.toString();
    L51:
        r4.W(r1);
        return;
    L53:
        InetAddress r15 = (InetAddress) r5;
        if (r15 == null) goto L57;
        r1 = r15.getHostAddress();
    L57:
        r4.W(r1);
        return;
    L59:
        URI r16 = (URI) r5;
        if (r16 == null) goto L63;
        r1 = r16.toASCIIString();
    L63:
        r4.W(r1);
        return;
    L65:
        URL r17 = (URL) r5;
        if (r17 == null) goto L69;
        r1 = r17.toExternalForm();
    L69:
        r4.W(r1);
        return;
    L71:
        StringBuffer r18 = (StringBuffer) r5;
        if (r18 == null) goto L75;
        r1 = r18.toString();
    L75:
        r4.W(r1);
        return;
    L79:
        StringBuilder r19 = (StringBuilder) r5;
        if (r19 == null) goto L83;
        r1 = r19.toString();
    L83:
        r4.W(r1);
        return;
    L85:
        r4.T((q72) r5);
        return;
    L87:
        r4.T((BigInteger) r5);
        return;
    L89:
        r4.T((BigDecimal) r5);
        return;
    L91:
        r4.W((String) r5);
        return;
    L93:
        Character r20 = (Character) r5;
        if (r20 == null) goto L97;
        r1 = String.valueOf(r20);
    L97:
        r4.W(r1);
        return;
    L99:
        Number r21 = (Number) r5;
        if (r21 != null) goto L102;
        r4.F();
        return;
    L102:
        r4.K(r21.doubleValue());
        return;
    L104:
        Number r22 = (Number) r5;
        if (r22 != null) goto L108;
        r4.F();
        return;
    L108:
        if ((r22 instanceof Float) == true) goto L111;
        r22 = Float.valueOf(r22.floatValue());
    L111:
        r4.T(r22);
        return;
    L113:
        Number r23 = (Number) r5;
        if (r23 != null) goto L116;
        r4.F();
        return;
    L116:
        r4.M(r23.longValue());
        return;
    L118:
        AtomicIntegerArray r24 = (AtomicIntegerArray) r5;
        r4.f();
        int r25 = r24.length();
    L119:
        if (r0 >= r25) goto L121;
        r4.M(r24.get(r0));
        r0 = r0 + 1;
        goto L119
    L121:
        r4.q();
        return;
    L123:
        Number r26 = (Number) r5;
        if (r26 != null) goto L126;
        r4.F();
        return;
    L126:
        r4.W(r26.toString());
        return;
    L128:
        Number r27 = (Number) r5;
        if (r27 != null) goto L131;
        r4.F();
        return;
    L131:
        float r28 = r27.floatValue();
        nk1.a(r28);
        if ((r27 instanceof Float) == true) goto L135;
        r27 = Float.valueOf(r28);
    L135:
        r4.T(r27);
        return;
    L137:
        Number r29 = (Number) r5;
        if (r29 != null) goto L140;
        r4.F();
        return;
    L140:
        double r2 = r29.doubleValue();
        nk1.a(r2);
        r4.K(r2);
        return;
    L78:
        throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) r5).getName() + ". Forgot to register a type adapter?");
    }
}
