package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nn4 implements zn4 {
    public static final Pattern q = null;
    public static final Pattern r = null;
    public final StringBuilder n;
    public final ArrayList o;
    public final be3 p;

    static {
        q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
        r = Pattern.compile("\\{\\\\.*?\\}");
    }

    public nn4() {
        this.n = new StringBuilder();
        this.o = new ArrayList();
        this.p = new be3();
    }

    public static ig0 a(Spanned r21, String r22) {
        if (r22 != null) goto L7;
        return new ig0(r21, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
    L7:
        switch(r22.hashCode()) {
            case -685620710: goto L28;
            case -685620679: goto L26;
            case -685620648: goto L24;
            case -685620617: goto L21;
            case -685620586: goto L19;
            case -685620555: goto L17;
            case -685620524: goto L14;
            case -685620493: goto L12;
            case -685620462: goto L10;
            default: goto L30;
        };
    L12:
        r22.equals("{\\an8}");
        goto L30
    L19:
        r22.equals("{\\an5}");
        goto L30
    L26:
        r22.equals("{\\an2}");
    L30:
        int r1 = 1;
    L32:
        switch(r22.hashCode()) {
            case -685620710: goto L53;
            case -685620679: goto L50;
            case -685620648: goto L47;
            case -685620617: goto L45;
            case -685620586: goto L44;
            case -685620555: goto L43;
            case -685620524: goto L41;
            case -685620493: goto L38;
            case -685620462: goto L35;
            default: goto L55;
        };
    L43:
        r22.equals("{\\an6}");
        goto L55
    L44:
        r22.equals("{\\an5}");
        goto L55
    L45:
        r22.equals("{\\an4}");
    L55:
        int r3 = 1;
    L56:
        float r5 = 0.92f;
        if (r1 == 0) goto L64;
        if (r1 == 1) goto L63;
        if (r1 != 2) goto L61;
        float r9 = 0.92f;
    L65:
        if (r3 == 0) goto L72;
        if (r3 == 1) goto L71;
        if (r3 == 2) goto L74;
        nz2.c();
        return null;
    L74:
        return new ig0(r21, null, null, null, r5, 0, r3, r9, r1, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
    L71:
        r5 = 0.5f;
        goto L74
    L72:
        r5 = 0.08f;
        goto L74
    L61:
        nz2.c();
        return null;
    L63:
        r9 = 0.5f;
        goto L65
    L64:
        r9 = 0.08f;
        goto L65
    L35:
        if (r22.equals("{\\an9}") == false) goto L55;
    L42:
        r3 = 0;
        goto L56
    L38:
        if (r22.equals("{\\an8}") == false) goto L55;
    L41:
        if (r22.equals("{\\an7}") == false) goto L55;
    L47:
        if (r22.equals("{\\an3}") == false) goto L55;
    L54:
        r3 = 2;
        goto L56
    L50:
        if (r22.equals("{\\an2}") == false) goto L55;
    L53:
        if (r22.equals("{\\an1}") == false) goto L55;
    L10:
        if (r22.equals("{\\an9}") == false) goto L30;
    L25:
        r1 = 2;
        goto L32
    L14:
        if (r22.equals("{\\an7}") == false) goto L30;
    L29:
        r1 = 0;
        goto L32
    L17:
        if (r22.equals("{\\an6}") == false) goto L30;
    L21:
        if (r22.equals("{\\an4}") == false) goto L30;
    L24:
        if (r22.equals("{\\an3}") == false) goto L30;
    L28:
        if (r22.equals("{\\an1}") == false) goto L30;
        goto L29
    }

    public static long d(Matcher r6, int r7) {
        String r0 = r6.group(r7 + 1);
        if (r0 == null) goto L5;
        long r1 = Long.parseLong(r0) * 3600000;
    L6:
        String r2 = r6.group(r7 + 2);
        r2.getClass();
        long r3 = (Long.parseLong(r2) * 60000) + r1;
        String r4 = r6.group(r7 + 3);
        r4.getClass();
        long r5 = (Long.parseLong(r4) * 1000) + r3;
        String r8 = r6.group(r7 + 4);
        if (r8 == null) goto L10;
        r5 = r5 + Long.parseLong(r8);
    L10:
        return r5 * 1000;
    L5:
        r1 = 0;
        goto L6
    }

    @Override // defpackage.zn4
    public final void c(byte[] r23, int r24, int r25, yn4 r26, wc0 r27) {
        nn4 r0 = this;
        long r4 = r26.b;
        be3 r8 = r0.p;
        r8.L(r24 + r25, r23);
        r8.N(r24);
        Charset r1 = r8.J();
        if (r1 != null) goto L6;
        r1 = StandardCharsets.UTF_8;
    L6:
        long r9 = -9223372036854775807L;
        if (r4 != (-9223372036854775807L)) goto L9;
    L11:
        ArrayList r2 = null;
    L12:
        String r7 = r8.n(r1);
        if (r7 == null) goto L54;
        if (r7.isEmpty() == true) goto L12;
        Integer.parseInt(r7);     // Catch: NumberFormatException -> L53
        String r10 = r8.n(r1);
        if (r10 == null) goto L20;
        Matcher r13 = q.matcher(r10);
        if (r13.matches() == true) goto L23;
        l93.q0("SubripParser", "Skipping invalid timing: ".concat(r10));
    L52:
        r0 = this;
        goto L12
    L23:
        long r15 = d(r13, 1);
        long r14 = d(r13, 6);
        StringBuilder r11 = r0.n;
        r11.setLength(0);
        long r28 = r9;
        ArrayList r12 = r0.o;
        r12.clear();
        String r16 = r8.n(r1);
    L25:
        if (TextUtils.isEmpty(r16) == true) goto L34;
        if (r11.length() <= 0) goto L29;
        r11.append("<br>");
    L29:
        String r17 = r16.trim();
        StringBuilder r18 = new StringBuilder(r17);
        Matcher r19 = r.matcher(r17);
        int r110 = 0;
    L31:
        if (r19.find() == false) goto L33;
        String r3 = r19.group();
        r12.add(r3);
        int r5 = r19.start() - r110;
        int r111 = r3.length();
        long r20 = r4;
        r18.replace(r5, r5 + r111, "");
        r110 = r110 + r111;
        r4 = r20;
        goto L31
    L33:
        r11.append(r18.toString());
        r16 = r8.n(r1);
        goto L25
    L34:
        long r21 = r4;
        Spanned r6 = Html.fromHtml(r11.toString());
        int r112 = 0;
    L36:
        if (r112 >= r12.size()) goto L41;
        String r22 = (String) r12.get(r112);
        if (r22.matches("\\{\\\\an[1-9]\\}") == true) goto L43;
        r112 = r112 + 1;
    L43:
        if (r21 == r28) goto L49;
        if (r14 >= r21) goto L49;
        if (r2 == null) goto L50;
        long r113 = r14 - r15;
        r2.add(new lg0(r15, r113, yw1.o(a(r6, r22))));
    L50:
        r0 = this;
        r9 = r28;
        r4 = r21;
    L49:
        long r114 = r14 - r15;
        r27.accept(new lg0(r15, r114, yw1.o(a(r6, r22))));
        goto L50
    L41:
        r22 = null;
        goto L43
    L20:
        l93.q0("SubripParser", "Unexpected end");
    L53:
        l93.q0("SubripParser", "Skipping invalid index: ".concat(r7));
    L54:
        if (r2 == null) goto L58;
        int r29 = r2.size();
        int r115 = 0;
    L56:
        if (r115 >= r29) goto L75;
        Object r30 = r2.get(r115);
        r115 = r115 + 1;
        r27.accept((lg0) r30);
        goto L56
    L75:
        return;
    L58:
        return;
    L9:
        if (r26.a == false) goto L11;
        r2 = new ArrayList();
        goto L12
    }
}
