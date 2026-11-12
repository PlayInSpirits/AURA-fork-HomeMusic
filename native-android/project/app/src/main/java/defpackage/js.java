package defpackage;

import android.text.SpannableStringBuilder;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class js {
    public static final String b = null;
    public static final String c = null;
    public static final js d = null;
    public static final js e = null;
    public final boolean a;

    static {
        xk0 r0 = vr4.c;
        b = Character.toString(8206);
        c = Character.toString(8207);
        d = new js(false);
        e = new js(true);
    }

    public js(boolean r2) {
        xk0 r0 = vr4.a;
        this.a = r2;
    }

    public static int a(CharSequence r9) {
        is r0 = new is(r9);
        r0.c = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
    L3:
        int r4 = r0.c;
        if (r4 >= r0.b) goto L29;
        if (r1 != 0) goto L29;
        CharSequence r5 = r0.a;
        char r6 = r5.charAt(r4);
        r0.d = r6;
        boolean r7 = Character.isHighSurrogate(r6);
        int r8 = r0.c;
        if (r7 == false) goto L9;
        int r10 = Character.codePointAt(r5, r8);
        r0.c = Character.charCount(r10) + r0.c;
        byte r11 = Character.getDirectionality(r10);
    L13:
        if (r11 == 0) goto L26;
        if (r11 == 1) goto L24;
        if (r11 == 2) goto L24;
        if (r11 == 9) goto L3;
        switch(r11) {
            case 14: goto L23;
            case 15: goto L23;
            case 16: goto L22;
            case 17: goto L22;
            case 18: goto L21;
            default: goto L28;
        };
    L22:
        r3 = r3 + 1;
        r2 = 1;
        goto L3
    L23:
        r3 = r3 + 1;
        r2 = -1;
    L28:
        r1 = r3;
        goto L3
    L21:
        r3 = r3 - 1;
        r2 = 0;
    L24:
        if (r3 != 0) goto L28;
    L40:
        return 1;
    L26:
        if (r3 != 0) goto L28;
    L43:
        return -1;
    L9:
        r0.c = r8 + 1;
        char r12 = r0.d;
        if (r12 >= 1792) goto L12;
        r11 = is.e[r12];
        goto L13
    L12:
        r11 = Character.getDirectionality(r12);
    L29:
        if (r1 == 0) goto L44;
        if (r2 == 0) goto L34;
        return r2;
    L34:
        if (r0.c <= 0) goto L44;
        switch(r0.a()) {
            case 14: goto L42;
            case 15: goto L42;
            case 16: goto L39;
            case 17: goto L39;
            case 18: goto L38;
            default: goto L34;
        };
    L38:
        r3 = r3 + 1;
        goto L34
    L39:
        if (r1 == r3) goto L40;
    L41:
        r3 = r3 - 1;
        goto L34
    L42:
        if (r1 != r3) goto L41;
    L44:
        return 0;
    }

    public static int b(CharSequence r6) {
        is r0 = new is(r6);
        r0.c = r0.b;
        int r1 = 0;
    L3:
        int r2 = r1;
    L5:
        if (r0.c <= 0) goto L32;
        byte r3 = r0.a();
        if (r3 != 0) goto L9;
        if (r1 == 0) goto L59;
        if (r2 != 0) goto L5;
    L59:
        return -1;
    L9:
        if (r3 == 1) goto L23;
        if (r3 == 2) goto L23;
        if (r3 == 9) goto L5;
        switch(r3) {
            case 14: goto L21;
            case 15: goto L21;
            case 16: goto L18;
            case 17: goto L18;
            case 18: goto L17;
            default: goto L15;
        };
    L17:
        r1 = r1 + 1;
        goto L5
    L18:
        if (r2 == r1) goto L24;
    L20:
        r1 = r1 - 1;
    L24:
        return 1;
    L21:
        if (r2 != r1) goto L20;
        return -1;
    L15:
        if (r2 != 0) goto L5;
    L23:
        if (r1 == 0) goto L24;
        if (r2 != 0) goto L5;
    L32:
        return 0;
    }

    public final SpannableStringBuilder c(CharSequence r10) {
        xk0 r0 = vr4.c;
        if (r10 != null) goto L6;
        return null;
    L6:
        boolean r1 = r0.j(r10, r10.length());
        SpannableStringBuilder r2 = new SpannableStringBuilder();
        if (r1 == false) goto L9;
        xk0 r3 = vr4.b;
    L10:
        boolean r4 = r3.j(r10, r10.length());
        String r5 = "";
        String r6 = c;
        String r7 = b;
        boolean r9 = this.a;
        if (r9 == true) goto L16;
        if (r4 == false) goto L14;
    L15:
        String r8 = r7;
    L22:
        r2.append(r8);
        if (r1 == r9) goto L28;
        if (r1 == false) goto L26;
        char r11 = 8235;
    L27:
        r2.append(r11);
        r2.append(r10);
        r2.append(8236);
    L29:
        if (r1 == false) goto L31;
        xk0 r12 = vr4.b;
    L32:
        boolean r13 = r12.j(r10, r10.length());
        if (r9 == true) goto L38;
        if (r13 == false) goto L36;
    L37:
        r5 = r7;
    L43:
        r2.append(r5);
        return r2;
    L36:
        if (b(r10) == 1) goto L37;
    L38:
        if (r9 == false) goto L43;
        if (r13 == true) goto L41;
    L42:
        r5 = r6;
        goto L43
    L41:
        if (b(r10) != (-1)) goto L43;
    L31:
        r12 = vr4.a;
        goto L32
    L26:
        r11 = 8234;
        goto L27
    L28:
        r2.append(r10);
        goto L29
    L14:
        if (a(r10) == 1) goto L15;
    L16:
        if (r9 == false) goto L21;
        if (r4 == true) goto L19;
    L20:
        r8 = r6;
        goto L22
    L19:
        if (a(r10) == (-1)) goto L20;
    L21:
        r8 = "";
        goto L22
    L9:
        r3 = vr4.a;
        goto L10
    }
}
