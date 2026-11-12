package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uy4 {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final xy4 f;
    public final String[] g;
    public final String h;
    public final String i;
    public final uy4 j;
    public final HashMap k;
    public final HashMap l;
    public ArrayList m;

    public uy4(String r1, String r2, long r3, long r5, xy4 r7, String[] r8, String r9, String r10, uy4 r11) {
        this.a = r1;
        this.b = r2;
        this.i = r10;
        this.f = r7;
        this.g = r8;
        if (r2 == null) goto L5;
        boolean r4 = true;
    L6:
        this.c = r4;
        this.d = r3;
        this.e = r5;
        r9.getClass();
        this.h = r9;
        this.j = r11;
        this.k = new HashMap();
        this.l = new HashMap();
        return;
    L5:
        r4 = false;
        goto L6
    }

    public static uy4 a(String r12) {
        return new uy4(null, r12.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String r2, TreeMap r3) {
        if (r3.containsKey(r2) == true) goto L5;
        hg0 r0 = new hg0();
        r0.a = new SpannableStringBuilder();
        r0.b = null;
        r3.put(r2, r0);
    L5:
        CharSequence r4 = ((hg0) r3.get(r2)).a;
        r4.getClass();
        return (SpannableStringBuilder) r4;
    }

    public final uy4 b(int r1) {
        ArrayList r0 = this.m;
        if (r0 == null) goto L7;
        return (uy4) r0.get(r1);
    L7:
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList r0 = this.m;
        if (r0 != null) goto L7;
        return 0;
    L7:
        return r0.size();
    }

    public final void d(TreeSet r7, boolean r8) {
        String r1 = this.a;
        boolean r0 = "p".equals(r1);
        boolean r2 = "div".equals(r1);
        if (r8 == true) goto L8;
        if (r0 == true) goto L8;
        if (r2 == false) goto L15;
        if (this.i != null) goto L8;
    L15:
        if (this.m == null) goto L27;
        int r3 = 0;
    L19:
        if (r3 >= this.m.size()) goto L31;
        uy4 r4 = (uy4) this.m.get(r3);
        if (r8 == true) goto L25;
        if (r0 == true) goto L25;
        boolean r5 = false;
    L26:
        r4.d(r7, r5);
        r3 = r3 + 1;
    L25:
        r5 = true;
        goto L26
    L31:
        return;
    L27:
        return;
    L8:
        long r6 = this.d;
        if (r6 == (-9223372036854775807L)) goto L11;
        r7.add(Long.valueOf(r6));
    L11:
        long r9 = this.e;
        if (r9 == (-9223372036854775807L)) goto L15;
        r7.add(Long.valueOf(r9));
        goto L15
    }

    public final boolean f(long r8) {
        long r0 = this.d;
        long r5 = this.e;
        if (r0 != (-9223372036854775807L)) goto L7;
        if (r5 != (-9223372036854775807L)) goto L7;
        return true;
    L7:
        if (r0 > r8) goto L11;
        if (r5 != (-9223372036854775807L)) goto L11;
        return true;
    L11:
        if (r0 != (-9223372036854775807L)) goto L15;
        if (r8 >= r5) goto L15;
        return true;
    L15:
        if (r0 <= r8) goto L17;
        return false;
    L17:
        if (r8 >= r5) goto L25;
        return true;
    L25:
        return false;
    }

    public final void g(long r3, String r5, ArrayList r6) {
        String r1 = this.h;
        if ("".equals(r1) == true) goto L7;
        r5 = r1;
    L7:
        if (f(r3) == true) goto L9;
    L14:
        int r0 = 0;
    L16:
        if (r0 >= c()) goto L18;
        b(r0).g(r3, r5, r6);
        r0 = r0 + 1;
        goto L16
    L18:
        return;
    L9:
        if ("div".equals(this.a) == false) goto L14;
        String r2 = this.i;
        if (r2 == null) goto L14;
        r6.add(new Pair(r5, r2));
    }

    public final void h(long r21, Map r23, HashMap r24, String r25, TreeMap r26) {
        Map r4 = r23;
        if (f(r21) == false) goto L188;
        String r2 = this.h;
        if ("".equals(r2) == false) goto L8;
        String r6 = r25;
    L9:
        Iterator r1 = this.l.entrySet().iterator();
    L11:
        if (r1.hasNext() == false) goto L184;
        Map.Entry r3 = (Map.Entry) r1.next();
        String r5 = (String) r3.getKey();
        HashMap r7 = this.k;
        if (r7.containsKey(r5) == false) goto L15;
        int r8 = ((Integer) r7.get(r5)).intValue();
    L16:
        int r9 = ((Integer) r3.getValue()).intValue();
        if (r8 == r9) goto L182;
        hg0 r10 = (hg0) r26.get(r5);
        r10.getClass();
        wy4 r11 = (wy4) r24.get(r6);
        r11.getClass();
        int r12 = r11.j;
        xy4 r13 = j51.Q(this.f, this.g, r4);
        SpannableStringBuilder r14 = (SpannableStringBuilder) r10.a;
        if (r14 != null) goto L21;
        r14 = new SpannableStringBuilder();
        r10.a = r14;
        r10.b = null;
    L21:
        if (r13 == null) goto L182;
        int r15 = r13.h;
        int r16 = 1;
        if (r15 == (-1)) goto L25;
    L27:
        if (r15 != 1) goto L29;
        char r17 = 1;
    L31:
        if (r13.i != 1) goto L33;
        char r18 = 2;
    L34:
        int r19 = r17 | r18;
    L35:
        if (r19 == (-1)) goto L51;
        int r110 = r13.h;
        if (r110 == (-1)) goto L39;
    L42:
        if (r110 != r16) goto L44;
        int r111 = r16;
    L46:
        if (r13.i != r16) goto L48;
        int r112 = 2;
    L49:
        int r113 = r111 | r112;
    L50:
        StyleSpan r114 = new StyleSpan(r113);
        int r115 = 33;
        r14.setSpan(r114, r8, r9, 33);
    L53:
        if (r13.f != r16) goto L56;
        r14.setSpan(new StrikethroughSpan(), r8, r9, r115);
    L56:
        if (r13.g != r16) goto L59;
        r14.setSpan(new UnderlineSpan(), r8, r9, r115);
    L59:
        if (r13.c == false) goto L66;
        if (r13.c == false) goto L63;
        xl.d(r14, new ForegroundColorSpan(r13.b), r8, r9);
        goto L66
    L63:
        kf2.o("Font color has not been defined.");
        return;
    L66:
        if (r13.e == false) goto L73;
        if (r13.e == false) goto L70;
        xl.d(r14, new BackgroundColorSpan(r13.d), r8, r9);
        goto L73
    L70:
        kf2.o("Background color has not been defined.");
        return;
    L73:
        if (r13.a == null) goto L75;
        xl.d(r14, new TypefaceSpan(r13.a), r8, r9);
    L75:
        yr4 r20 = r13.r;
        if (r20 == null) goto L92;
        int r116 = r20.a;
        if (r116 == (-1)) goto L80;
        int r117 = r20.b;
    L88:
        int r22 = r20.c;
        if (r22 != (-2)) goto L91;
        r22 = 1;
    L91:
        xl.d(r14, new zr4(r116, r117, r22), r8, r9);
        goto L92
    L80:
        if (r12 != 2) goto L82;
    L85:
        int r118 = 3;
    L86:
        r116 = r118;
        r117 = 1;
        goto L88
    L82:
        if (r12 == 1) goto L85;
        r118 = 1;
    L92:
        int r27 = r13.m;
        if (r27 == 2) goto L99;
        if (r27 != 3) goto L96;
    L98:
        r14.setSpan(new ko0(), r8, r9, 33);
    L97:
        int r119 = 0;
    L142:
        if (r13.q != 1) goto L144;
        xl.d(r14, new tp1(), r8, r9);
    L144:
        int r28 = r13.j;
        float r120 = 100.0f;
        if (r28 != 1) goto L147;
        Iterator r121 = r1;
        float r29 = 100.0f;
        xl.d(r14, new AbsoluteSizeSpan((int) r13.k, true), r8, r9);
    L171:
        if ("p".equals(this.a) == false) goto L183;
        float r30 = r13.s;
        if (r30 == Float.MAX_VALUE) goto L175;
        r10.q = (r30 * (-90.0f)) / r29;
    L175:
        Layout.Alignment r31 = r13.o;
        if (r31 == null) goto L178;
        r10.c = r31;
    L178:
        Layout.Alignment r32 = r13.p;
        if (r32 == null) goto L183;
        r10.d = r32;
    L183:
        r1 = r121;
        goto L11
    L147:
        if (r28 != 2) goto L149;
        r121 = r1;
        r29 = 100.0f;
        xl.d(r14, new RelativeSizeSpan(r13.k), r8, r9);
        goto L171
    L149:
        if (r28 == 3) goto L151;
        r121 = r1;
        r29 = 100.0f;
        goto L171
    L151:
        float r33 = r13.k / 100.0f;
        RelativeSizeSpan[] r122 = (RelativeSizeSpan[]) r14.getSpans(r8, r9, RelativeSizeSpan.class);
        int r123 = r122.length;
        int r124 = r119;
        float r125 = r33;
        int r34 = r124;
    L152:
        if (r34 >= r123) goto L167;
        float r210 = r120;
        RelativeSizeSpan r126 = r122[r34];
        Iterator r127 = r1;
        if (r14.getSpanStart(r126) > r8) goto L159;
        if (r14.getSpanEnd(r126) < r9) goto L159;
        r125 = r126.getSizeChange() * r125;
    L159:
        if (r14.getSpanStart(r126) == r8) goto L161;
    L165:
        int r128 = r34;
    L166:
        r34 = r128 + 1;
        r120 = r210;
        r1 = r127;
        goto L152
    L161:
        if (r14.getSpanEnd(r126) != r9) goto L165;
        r128 = r34;
        if (r14.getSpanFlags(r126) != 33) goto L166;
        r14.removeSpan(r126);
        goto L166
    L167:
        r121 = r1;
        r29 = r120;
        r14.setSpan(new RelativeSizeSpan(r125), r8, r9, 33);
        goto L171
    L96:
        if (r27 == 4) goto L98;
    L99:
        uy4 r35 = this.j;
    L100:
        if (r35 == null) goto L107;
        xy4 r129 = j51.Q(r35.f, r35.g, r4);
        if (r129 == null) goto L106;
        if (r129.m != 1) goto L106;
    L108:
        if (r35 == null) goto L97;
        ArrayDeque r130 = new ArrayDeque();
        r130.push(r35);
    L112:
        if (r130.isEmpty() == true) goto L122;
        uy4 r131 = (uy4) r130.pop();
        xy4 r132 = j51.Q(r131.f, r131.g, r4);
        if (r132 != null) goto L116;
    L118:
        int r133 = r131.c() - 1;
    L119:
        if (r133 < 0) goto L112;
        r130.push(r131.b(r133));
        r133 = r133 - 1;
        goto L119
    L116:
        if (r132.m != 3) goto L118;
        uy4 r134 = r131;
    L123:
        if (r134 == null) goto L97;
        if (r134.c() != 1) goto L139;
        r119 = 0;
        if (r134.b(0).b == null) goto L140;
        String r135 = r134.b(0).b;
        String r136 = f35.a;
        xy4 r137 = j51.Q(r134.f, r134.g, r4);
        if (r137 == null) goto L133;
        int r138 = r137.n;
    L134:
        if (r138 != (-1)) goto L138;
        xy4 r36 = j51.Q(r35.f, r35.g, r4);
        if (r36 == null) goto L138;
        r138 = r36.n;
    L138:
        r14.setSpan(new u34(r138, r135), r8, r9, 33);
        goto L142
    L133:
        r138 = -1;
    L140:
        l93.K("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
        goto L142
    L139:
        r119 = 0;
        goto L140
    L122:
        r134 = null;
    L106:
        r35 = r35.j;
        goto L100
    L107:
        r35 = null;
        goto L108
    L48:
        r112 = 0;
        goto L49
    L44:
        r111 = 0;
        goto L46
    L39:
        if (r13.i != (-1)) goto L41;
        r113 = -1;
        r16 = 1;
        goto L50
    L41:
        r16 = 1;
        goto L42
    L51:
        r115 = 33;
        goto L53
    L33:
        r18 = 0;
        goto L34
    L29:
        r17 = 0;
        goto L31
    L25:
        if (r13.i != (-1)) goto L27;
        r19 = -1;
    L182:
        r121 = r1;
        goto L183
    L15:
        r8 = 0;
        goto L16
    L184:
        int r139 = 0;
    L186:
        if (r139 >= c()) goto L208;
        b(r139).h(r21, r4, r24, r6, r26);
        r139 = r139 + 1;
        r4 = r23;
        goto L186
    L208:
        return;
    L8:
        r6 = r2;
        goto L9
    }

    public final void i(long r12, boolean r14, String r15, TreeMap r16) {
        HashMap r0 = this.k;
        r0.clear();
        HashMap r6 = this.l;
        r6.clear();
        String r2 = this.a;
        if ("metadata".equals(r2) == true) goto L56;
        String r3 = this.h;
        if ("".equals(r3) == false) goto L8;
        String r4 = r15;
    L10:
        if (this.c == false) goto L15;
        if (r14 == false) goto L15;
        SpannableStringBuilder r13 = e(r4, r16);
        String r11 = this.b;
        r11.getClass();
        r13.append(r11);
        return;
    L15:
        if ("br".equals(r2) == false) goto L20;
        if (r14 == false) goto L20;
        e(r4, r16).append('\n');
        return;
    L20:
        if (f(r12) == false) goto L50;
        Iterator r1 = r16.entrySet().iterator();
    L23:
        if (r1.hasNext() == false) goto L25;
        Map.Entry r5 = (Map.Entry) r1.next();
        String r8 = (String) r5.getKey();
        CharSequence r7 = ((hg0) r5.getValue()).a;
        r7.getClass();
        r0.put(r8, Integer.valueOf(r7.length()));
        goto L23
    L25:
        boolean r9 = "p".equals(r2);
        int r10 = 0;
    L27:
        if (r10 >= c()) goto L36;
        uy4 r17 = b(r10);
        if (r14 == true) goto L34;
        if (r9 == true) goto L34;
        boolean r18 = false;
    L35:
        r17.i(r12, r18, r4, r16);
        r10 = r10 + 1;
    L34:
        r18 = true;
        goto L35
    L36:
        if (r9 == false) goto L46;
        SpannableStringBuilder r19 = e(r4, r16);
        int r110 = r19.length() - 1;
    L38:
        if (r110 < 0) goto L42;
        if (r19.charAt(r110) != ' ') goto L42;
        r110 = r110 - 1;
    L42:
        if (r110 < 0) goto L46;
        if (r19.charAt(r110) == '\n') goto L46;
        r19.append('\n');
    L46:
        Iterator r111 = r16.entrySet().iterator();
    L48:
        if (r111.hasNext() == false) goto L57;
        Map.Entry r112 = (Map.Entry) r111.next();
        String r113 = (String) r112.getKey();
        CharSequence r114 = ((hg0) r112.getValue()).a;
        r114.getClass();
        r6.put(r113, Integer.valueOf(r114.length()));
        goto L48
    L57:
        return;
    L50:
        return;
    L8:
        r4 = r3;
        goto L10
    }
}
