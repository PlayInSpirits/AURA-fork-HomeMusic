package defpackage;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.eddyizm.tempus.homemusic.PlayEvent;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w95 {
    public static final Pattern a = null;
    public static final Pattern b = null;
    public static final Map c = null;
    public static final Map d = null;

    static {
        a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
        b = Pattern.compile("(\\S+?):(\\S+)");
        HashMap r0 = new HashMap();
        r0.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        r0.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        r0.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        r0.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        r0.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        r0.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        r0.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        r0.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        c = Collections.unmodifiableMap(r0);
        HashMap r1 = new HashMap();
        r1.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        r1.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        r1.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        r1.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        r1.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        r1.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        r1.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        r1.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        d = Collections.unmodifiableMap(r1);
    }

    public static void a(String r19, t95 r20, List r21, SpannableStringBuilder r22, List r23) {
        int r4 = r20.b;
        int r5 = r22.length();
        String r6 = r20.a;
        r6.getClass();
        int r10 = -1;
        switch(r6.hashCode()) {
            case 0: goto L34;
            case 98: goto L30;
            case 99: goto L26;
            case 105: goto L22;
            case 117: goto L18;
            case 118: goto L14;
            case 3314158: goto L10;
            case 3511770: goto L6;
            default: goto L4;
        };
    L4:
        byte r7 = -1;
    L38:
        switch(r7) {
            case 0: goto L67;
            case 1: goto L66;
            case 2: goto L57;
            case 3: goto L56;
            case 4: goto L55;
            case 5: goto L54;
            case 6: goto L67;
            case 7: goto L40;
            default: goto L138;
        };
    L40:
        int r8 = c(r23, r19, r20);
        ArrayList r13 = new ArrayList(r21.size());
        r13.addAll(r21);
        Collections.sort(r13, s95.c);
        int r14 = r20.b;
        int r15 = 0;
        int r16 = 0;
    L42:
        if (r15 >= r13.size()) goto L67;
        if ("rt".equals(((s95) r13.get(r15)).a.a) == false) goto L53;
        s95 r9 = (s95) r13.get(r15);
        int r11 = c(r23, r19, r9.a);
        if (r11 != r10) goto L52;
        if (r8 == r10) goto L51;
        r11 = r8;
        goto L52
    L51:
        r11 = 1;
    L52:
        int r12 = r9.a.b - r16;
        int r17 = r9.b - r16;
        CharSequence r18 = r22.subSequence(r12, r17);
        r22.delete(r12, r17);
        r22.setSpan(new u34(r11, r18.toString()), r14, r12, 33);
        r16 = r18.length() + r16;
        r14 = r12;
    L53:
        r15 = r15 + 1;
        r10 = -1;
        goto L42
    L54:
        r22.setSpan(new p85(r20.c), r4, r5, 33);
        goto L67
    L55:
        r22.setSpan(new UnderlineSpan(), r4, r5, 33);
        goto L67
    L56:
        r22.setSpan(new StyleSpan(2), r4, r5, 33);
        goto L67
    L57:
        Iterator r24 = r20.d.iterator();
    L59:
        if (r24.hasNext() == false) goto L67;
        String r25 = (String) r24.next();
        Map r110 = c;
        if (r110.containsKey(r25) == true) goto L62;
        Map r111 = d;
        if (r111.containsKey(r25) == false) goto L59;
        r22.setSpan(new BackgroundColorSpan(((Integer) r111.get(r25)).intValue()), r4, r5, 33);
        goto L59
    L62:
        r22.setSpan(new ForegroundColorSpan(((Integer) r110.get(r25)).intValue()), r4, r5, 33);
        goto L59
    L66:
        r22.setSpan(new StyleSpan(1), r4, r5, 33);
    L67:
        ArrayList r0 = b(r23, r19, r20);
        int r1 = 0;
    L69:
        if (r1 >= r0.size()) goto L163;
        q95 r3 = ((u95) r0.get(r1)).o;
        int r26 = r3.l;
        if (r26 != (-1)) goto L77;
        if (r3.m != (-1)) goto L77;
        int r27 = -1;
    L85:
        if (r27 == (-1)) goto L101;
        int r112 = r3.l;
        if (r112 == (-1)) goto L89;
    L91:
        int r113 = 1;
        if (r112 != 1) goto L94;
        int r114 = 1;
    L96:
        if (r3.m != 1) goto L98;
        int r115 = 2;
    L99:
        int r116 = r114 | r115;
    L100:
        xl.d(r22, new StyleSpan(r116), r4, r5);
    L103:
        if (r3.j != r113) goto L106;
        r22.setSpan(new StrikethroughSpan(), r4, r5, 33);
    L106:
        if (r3.k != r113) goto L109;
        r22.setSpan(new UnderlineSpan(), r4, r5, 33);
    L109:
        if (r3.g == false) goto L116;
        if (r3.g == false) goto L113;
        xl.d(r22, new ForegroundColorSpan(r3.f), r4, r5);
        goto L116
    L113:
        kf2.o("Font color not defined");
        return;
    L116:
        if (r3.i == false) goto L123;
        if (r3.i == false) goto L120;
        xl.d(r22, new BackgroundColorSpan(r3.h), r4, r5);
        goto L123
    L120:
        kf2.o("Background color not defined.");
        return;
    L123:
        if (r3.e == null) goto L125;
        xl.d(r22, new TypefaceSpan(r3.e), r4, r5);
    L125:
        int r28 = r3.n;
        if (r28 == 1) goto L133;
        if (r28 != 2) goto L129;
        xl.d(r22, new RelativeSizeSpan(r3.o), r4, r5);
    L135:
        if (r3.q == false) goto L137;
        r22.setSpan(new tp1(), r4, r5, 33);
    L137:
        r1 = r1 + 1;
        goto L69
    L129:
        if (r28 != 3) goto L135;
        xl.d(r22, new RelativeSizeSpan(r3.o / 100.0f), r4, r5);
        goto L135
    L133:
        xl.d(r22, new AbsoluteSizeSpan((int) r3.o, true), r4, r5);
        goto L135
    L98:
        r115 = 0;
        goto L99
    L94:
        r114 = 0;
        goto L96
    L89:
        if (r3.m != (-1)) goto L91;
        r116 = -1;
        r113 = 1;
        goto L100
    L101:
        r113 = 1;
    L77:
        if (r26 != 1) goto L79;
        char r29 = 1;
    L81:
        if (r3.m != 1) goto L83;
        char r30 = 2;
    L84:
        r27 = r30 | r29;
        goto L85
    L83:
        r30 = 0;
        goto L84
    L79:
        r29 = 0;
        goto L81
    L163:
        return;
    L138:
        return;
    L6:
        if (r6.equals("ruby") == false) goto L155;
        r7 = 7;
        goto L38
    L155:
        r7 = -1;
        goto L38
    L10:
        if (r6.equals("lang") == false) goto L156;
        r7 = 6;
        goto L38
    L156:
        r7 = -1;
        goto L38
    L14:
        if (r6.equals("v") == false) goto L157;
        r7 = 5;
        goto L38
    L157:
        r7 = -1;
        goto L38
    L18:
        if (r6.equals("u") == false) goto L158;
        r7 = 4;
        goto L38
    L158:
        r7 = -1;
        goto L38
    L22:
        if (r6.equals("i") == false) goto L159;
        r7 = 3;
        goto L38
    L159:
        r7 = -1;
        goto L38
    L26:
        if (r6.equals("c") == false) goto L160;
        r7 = 2;
        goto L38
    L160:
        r7 = -1;
        goto L38
    L30:
        if (r6.equals("b") == false) goto L161;
        r7 = 1;
        goto L38
    L161:
        r7 = -1;
        goto L38
    L34:
        if (r6.equals("") == false) goto L162;
        r7 = 0;
        goto L38
    L162:
        r7 = -1;
        goto L38
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static ArrayList b(List r10, String r11, t95 r12) {
        ArrayList r0 = new ArrayList();
        int r2 = 0;
    L4:
        if (r2 >= r10.size()) goto L24;
        q95 r3 = (q95) r10.get(r2);
        String r4 = r12.a;
        Set r5 = r12.d;
        String r6 = r12.c;
        if (r3.a.isEmpty() == true) goto L8;
    L14:
        int r7 = q95.a(q95.a(q95.a(0, 1073741824, r3.a, r11), 2, r3.b, r4), 4, r3.d, r6);
        if (r7 != (-1)) goto L17;
    L20:
        ?? r8 = 0;
    L21:
        if (r8 <= 0) goto L23;
        r0.add(new u95(r8, r3));
    L23:
        r2 = r2 + 1;
        goto L4
    L17:
        if (r5.containsAll(r3.c) == false) goto L20;
        r8 = r7 + (r3.c.size() * 4);
        goto L21
    L8:
        if (r3.b.isEmpty() == false) goto L14;
        if (r3.c.isEmpty() == false) goto L14;
        if (r3.d.isEmpty() == false) goto L14;
        r8 = TextUtils.isEmpty(r4);
        goto L21
    L24:
        Collections.sort(r0);
        return r0;
    }

    public static int c(List r1, String r2, t95 r3) {
        ArrayList r4 = b(r1, r2, r3);
        int r5 = 0;
    L4:
        if (r5 >= r4.size()) goto L9;
        int r6 = ((u95) r4.get(r5)).o.p;
        if (r6 != (-1)) goto L7;
        r5 = r5 + 1;
        goto L4
    L7:
        return r6;
    L9:
        return -1;
    }

    public static r95 d(String r7, Matcher r8, be3 r9, ArrayList r10) {
        v95 r0 = new v95();
        String r1 = r8.group(1);     // Catch: IllegalArgumentException -> L13
        r1.getClass();     // Catch: IllegalArgumentException -> L13
        r0.a = y95.c(r1);     // Catch: IllegalArgumentException -> L13
        String r2 = r8.group(2);     // Catch: IllegalArgumentException -> L13
        r2.getClass();     // Catch: IllegalArgumentException -> L13
        r0.b = y95.c(r2);     // Catch: IllegalArgumentException -> L13
        String r11 = r8.group(3);
        r11.getClass();
        e(r11, r0);
        StringBuilder r12 = new StringBuilder();
        r9.getClass();
        String r3 = r9.n(StandardCharsets.UTF_8);
    L6:
        if (TextUtils.isEmpty(r3) == true) goto L11;
        if (r12.length() <= 0) goto L10;
        r12.append("\n");
    L10:
        r12.append(r3.trim());
        r3 = r9.n(StandardCharsets.UTF_8);
        goto L6
    L11:
        r0.c = f(r7, r12.toString(), r10);
        return new r95(r0.a().a(), r0.a, r0.b);
    L13:
        l93.q0("WebvttCueParser", "Skipping cue with bad header: " + r8.group());
        return null;
    }

    public static void e(String r18, v95 r19) {
        Matcher r2 = b.matcher(r18);
    L4:
        if (r2.find() == false) goto L100;
        String r4 = r2.group(1);
        r4.getClass();
        String r6 = r2.group(2);
        r6.getClass();
        if ("line".equals(r4) == true) goto L8;
        byte r12 = 5;
        byte r15 = 0;
        if ("align".equals(r4) == true) goto L13;
        if ("position".equals(r4) == true) goto L48;
        if ("size".equals(r4) == true) goto L86;
        if ("vertical".equals(r4) == true) goto L90;
        l93.q0("WebvttCueParser", "Unknown cue setting " + r4 + ":" + r6);     // Catch: NumberFormatException -> L99
        goto L4
    L90:
        if (r6.equals("lr") == false) goto L92;
        int r3 = 2;
    L96:
        r19.k = r3;     // Catch: NumberFormatException -> L99
        goto L4
    L92:
        if (r6.equals("rl") == true) goto L94;
        l93.q0("WebvttCueParser", "Invalid 'vertical' value: ".concat(r6));     // Catch: NumberFormatException -> L99
        r3 = Integer.MIN_VALUE;
        goto L96
    L94:
        r3 = 1;
        goto L96
    L86:
        r19.j = y95.b(r6);     // Catch: NumberFormatException -> L99
        goto L4
    L48:
        int r5 = r6.indexOf(44);     // Catch: NumberFormatException -> L99
        if (r5 == (-1)) goto L83;
        String r7 = r6.substring(r5 + 1);     // Catch: NumberFormatException -> L99
        switch(r7.hashCode()) {
            case -1842484672: goto L74;
            case -1364013995: goto L70;
            case -1276788989: goto L66;
            case -1074341483: goto L62;
            case 100571: goto L58;
            case 109757538: goto L55;
            default: goto L53;
        };
    L53:
        r12 = -1;
    L77:
        switch(r12) {
            case 0: goto L81;
            case 1: goto L80;
            case 2: goto L79;
            case 3: goto L80;
            case 4: goto L79;
            case 5: goto L81;
            default: goto L78;
        };
    L78:
        l93.q0("WebvttCueParser", "Invalid anchor value: ".concat(r7));     // Catch: NumberFormatException -> L99
        int r8 = Integer.MIN_VALUE;
    L82:
        r19.i = r8;     // Catch: NumberFormatException -> L99
        r6 = r6.substring(0, r5);     // Catch: NumberFormatException -> L99
        goto L83
    L79:
        r8 = 2;
        goto L82
    L80:
        r8 = 1;
        goto L82
    L81:
        r8 = 0;
        goto L82
    L55:
        if (r7.equals(PlayEvent.START) == true) goto L77;
        r12 = -1;
        goto L77
    L58:
        if (r7.equals("end") == false) goto L124;
        r12 = 4;
        goto L77
    L124:
        r12 = -1;
        goto L77
    L62:
        if (r7.equals("middle") == false) goto L125;
        r12 = 3;
        goto L77
    L125:
        r12 = -1;
        goto L77
    L66:
        if (r7.equals("line-right") == false) goto L126;
        r12 = 2;
        goto L77
    L126:
        r12 = -1;
        goto L77
    L70:
        if (r7.equals("center") == false) goto L127;
        r12 = 1;
        goto L77
    L127:
        r12 = -1;
        goto L77
    L74:
        if (r7.equals("line-left") == false) goto L128;
        r12 = 0;
        goto L77
    L128:
        r12 = -1;
    L83:
        r19.h = y95.b(r6);     // Catch: NumberFormatException -> L99
        goto L4
    L13:
        switch(r6.hashCode()) {
            case -1364013995: goto L36;
            case -1074341483: goto L32;
            case 100571: goto L28;
            case 3317767: goto L24;
            case 108511772: goto L20;
            case 109757538: goto L16;
            default: goto L14;
        };
    L14:
        r15 = -1;
    L38:
        switch(r15) {
            case 0: goto L40;
            case 1: goto L40;
            case 2: goto L44;
            case 3: goto L43;
            case 4: goto L42;
            case 5: goto L41;
            default: goto L39;
        };
    L39:
        l93.q0("WebvttCueParser", "Invalid alignment value: ".concat(r6));     // Catch: NumberFormatException -> L99
    L40:
        int r9 = 2;
    L45:
        r19.d = r9;     // Catch: NumberFormatException -> L99
        goto L4
    L41:
        r9 = 1;
        goto L45
    L42:
        r9 = 5;
        goto L45
    L43:
        r9 = 4;
        goto L45
    L44:
        r9 = 3;
        goto L45
    L16:
        if (r6.equals(PlayEvent.START) == false) goto L129;
        r15 = 5;
        goto L38
    L129:
        r15 = -1;
        goto L38
    L20:
        if (r6.equals("right") == false) goto L130;
        r15 = 4;
        goto L38
    L130:
        r15 = -1;
        goto L38
    L24:
        if (r6.equals("left") == false) goto L131;
        r15 = 3;
        goto L38
    L131:
        r15 = -1;
        goto L38
    L28:
        if (r6.equals("end") == false) goto L132;
        r15 = 2;
        goto L38
    L132:
        r15 = -1;
        goto L38
    L32:
        if (r6.equals("middle") == false) goto L133;
        r15 = 1;
        goto L38
    L133:
        r15 = -1;
        goto L38
    L36:
        if (r6.equals("center") == true) goto L38;
        r15 = -1;
        goto L38
    L8:
        g(r6, r19);     // Catch: NumberFormatException -> L99
    L99:
        l93.q0("WebvttCueParser", "Skipping bad cue setting: " + r2.group());
        goto L4
    }

    public static SpannedString f(String r18, String r19, List r20) {
        SpannableStringBuilder r3 = new SpannableStringBuilder();
        ArrayDeque r4 = new ArrayDeque();
        ArrayList r5 = new ArrayList();
        int r7 = 0;
    L3:
        String r9 = "";
        if (r7 >= r19.length()) goto L129;
        char r8 = r19.charAt(r7);
        byte r10 = -1;
        if (r8 != '&') goto L7;
        r7 = r7 + 1;
        int r6 = r19.indexOf(59, r7);
        int r15 = r19.indexOf(32, r7);
        if (r6 != (-1)) goto L95;
        r6 = r15;
    L98:
        if (r6 != (-1)) goto L99;
        r3.append(r8);
        goto L3
    L99:
        String r11 = r19.substring(r7, r6);
        switch(r11.hashCode()) {
            case 3309: goto L115;
            case 3464: goto L111;
            case 96708: goto L107;
            case 3374865: goto L103;
            default: goto L118;
        };
    L118:
        switch(r10) {
            case 0: goto L123;
            case 1: goto L122;
            case 2: goto L121;
            case 3: goto L120;
            default: goto L119;
        };
    L119:
        l93.q0("WebvttCueParser", "ignoring unsupported entity: '&" + r11 + ";'");
    L124:
        if (r6 != r15) goto L126;
        r3.append(" ");
    L126:
        r7 = r6 + 1;
        goto L3
    L120:
        r3.append(' ');
        goto L124
    L121:
        r3.append('&');
        goto L124
    L122:
        r3.append('<');
        goto L124
    L123:
        r3.append('>');
        goto L124
    L103:
        if (r11.equals("nbsp") == false) goto L118;
        r10 = 3;
        goto L118
    L107:
        if (r11.equals("amp") == false) goto L118;
        r10 = 2;
        goto L118
    L111:
        if (r11.equals("lt") == false) goto L118;
        r10 = 1;
        goto L118
    L115:
        if (r11.equals("gt") == false) goto L118;
        r10 = 0;
        goto L118
    L95:
        if (r15 == (-1)) goto L98;
        r6 = Math.min(r6, r15);
        goto L98
    L7:
        if (r8 != '<') goto L8;
        int r12 = r7 + 1;
        if (r12 < r19.length()) goto L13;
    L70:
        r7 = r12;
        goto L3
    L13:
        if (r19.charAt(r12) != '/') goto L15;
        boolean r13 = true;
    L16:
        int r14 = r19.indexOf(62, r12);
        if (r14 != (-1)) goto L19;
        r12 = r19.length();
    L20:
        int r16 = r12 - 2;
        if (r19.charAt(r16) != '/') goto L23;
        boolean r17 = true;
    L24:
        if (r13 == false) goto L26;
        int r110 = 2;
    L27:
        int r21 = r7 + r110;
        if (r17 == true) goto L31;
        r16 = r12 - 1;
    L31:
        String r22 = r19.substring(r21, r16);
        if (r22.trim().isEmpty() == true) goto L70;
        String r111 = r22.trim();
        rr2.l(!r111.isEmpty());
        String r112 = f35.a;
        String r113 = r111.split("[ \\.]", 2)[0];
        r113.getClass();
        switch(r113.hashCode()) {
            case 98: goto L66;
            case 99: goto L62;
            case 105: goto L58;
            case 117: goto L54;
            case 118: goto L50;
            case 3650: goto L46;
            case 3314158: goto L42;
            case 3511770: goto L38;
            default: goto L36;
        };
    L36:
        byte r114 = -1;
    L69:
        switch(r114) {
            case 0: goto L71;
            case 1: goto L71;
            case 2: goto L71;
            case 3: goto L71;
            case 4: goto L71;
            case 5: goto L71;
            case 6: goto L71;
            case 7: goto L71;
            default: goto L70;
        };
    L71:
        if (r13 == true) goto L73;
        if (r17 == true) goto L70;
        int r23 = r3.length();
        String r24 = r22.trim();
        rr2.l(!r24.isEmpty());
        int r115 = r24.indexOf(" ");
        if (r115 != (-1)) goto L86;
        char r116 = 0;
    L87:
        String[] r25 = r24.split("\\.", -1);
        String r117 = r25[r116];
        HashSet r118 = new HashSet();
        int r119 = 1;
    L89:
        if (r119 >= r25.length) goto L91;
        r118.add(r25[r119]);
        r119 = r119 + 1;
        goto L89
    L91:
        r4.push(new t95(r117, r23, r9, r118));
        goto L70
    L86:
        r9 = r24.substring(r115).trim();
        r116 = 0;
        r24 = r24.substring(0, r115);
    L73:
        if (r4.isEmpty() == true) goto L70;
        t95 r26 = (t95) r4.pop();
        a(r18, r26, r5, r3, r20);
        if (r4.isEmpty() == true) goto L78;
        r5.add(new s95(r26, r3.length()));
    L80:
        if (r26.a.equals(r113) == false) goto L73;
    L78:
        r5.clear();
        goto L80
    L38:
        if (r113.equals("ruby") == false) goto L150;
        r114 = 7;
        goto L69
    L150:
        r114 = -1;
        goto L69
    L42:
        if (r113.equals("lang") == false) goto L151;
        r114 = 6;
        goto L69
    L151:
        r114 = -1;
        goto L69
    L46:
        if (r113.equals("rt") == false) goto L152;
        r114 = 5;
        goto L69
    L152:
        r114 = -1;
        goto L69
    L50:
        if (r113.equals("v") == false) goto L153;
        r114 = 4;
        goto L69
    L153:
        r114 = -1;
        goto L69
    L54:
        if (r113.equals("u") == false) goto L154;
        r114 = 3;
        goto L69
    L154:
        r114 = -1;
        goto L69
    L58:
        if (r113.equals("i") == false) goto L155;
        r114 = 2;
        goto L69
    L155:
        r114 = -1;
        goto L69
    L62:
        if (r113.equals("c") == false) goto L156;
        r114 = 1;
        goto L69
    L156:
        r114 = -1;
        goto L69
    L66:
        if (r113.equals("b") == false) goto L157;
        r114 = 0;
        goto L69
    L157:
        r114 = -1;
        goto L69
    L26:
        r110 = 1;
        goto L27
    L23:
        r17 = false;
        goto L24
    L19:
        r12 = r14 + 1;
        goto L20
    L15:
        r13 = false;
        goto L16
    L8:
        r3.append(r8);
        r7 = r7 + 1;
    L129:
        if (r4.isEmpty() == true) goto L131;
        a(r18, (t95) r4.pop(), r5, r3, r20);
        goto L129
    L131:
        a(r18, new t95("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, r3, r20);
        return SpannedString.valueOf(r3);
    }

    public static void g(String r7, v95 r8) {
        int r0 = r7.indexOf(44);
        byte r3 = -1;
        if (r0 == (-1)) goto L29;
        String r4 = r7.substring(r0 + 1);
        int r6 = 2;
        switch(r4.hashCode()) {
            case -1364013995: goto L20;
            case -1074341483: goto L16;
            case 100571: goto L12;
            case 109757538: goto L8;
            default: goto L23;
        };
    L23:
        switch(r3) {
            case 0: goto L26;
            case 1: goto L26;
            case 2: goto L27;
            case 3: goto L25;
            default: goto L24;
        };
    L24:
        l93.q0("WebvttCueParser", "Invalid anchor value: ".concat(r4));
        r6 = Integer.MIN_VALUE;
        goto L27
    L25:
        r6 = 0;
        goto L27
    L26:
        r6 = 1;
    L27:
        r8.g = r6;
        r7 = r7.substring(0, r0);
        goto L29
    L8:
        if (r4.equals(PlayEvent.START) == false) goto L23;
        r3 = 3;
        goto L23
    L12:
        if (r4.equals("end") == false) goto L23;
        r3 = 2;
        goto L23
    L16:
        if (r4.equals("middle") == false) goto L23;
        r3 = 1;
        goto L23
    L20:
        if (r4.equals("center") == false) goto L23;
        r3 = 0;
    L29:
        if (r7.endsWith("%") == false) goto L32;
        r8.e = y95.b(r7);
        r8.f = 0;
        return;
    L32:
        r8.e = Integer.parseInt(r7);
        r8.f = 1;
    }
}
