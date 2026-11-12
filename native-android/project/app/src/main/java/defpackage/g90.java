package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g90 {
    public static final wl4 a = null;
    public static final wl4 b = null;
    public static final wl4 c = null;
    public static final wl4 d = null;
    public static final wl4 e = null;
    public static final wl4 f = null;
    public static final wl4 g = null;
    public static final wl4 h = null;
    public static final wl4 i = null;
    public static final wl4 j = null;
    public static final wl4 k = null;
    public static final wl4 l = null;
    public static final wl4 m = null;
    public static final wl4 n = null;
    public static final wl4 o = null;
    public static final wl4 p = null;
    public static final wl4 q = null;
    public static final wl4 r = null;
    public static final wl4 s = null;
    public static final wl4 t = null;
    public static final wl4 u = null;
    public static final wl4 v = null;
    public static final wl4 w = null;
    public static final l90 x = null;

    static {
        a = new wl4(new t5(13));
        b = new wl4(new t5(13));
        c = new wl4(new t5(16));
        d = new wl4(new t5(17));
        e = new wl4(new t5(18));
        f = new wl4(new t5(19));
        g = new wl4(new t5(20));
        h = new wl4(new t5(21));
        i = new wl4(new t5(22));
        j = new wl4(new t5(23));
        k = new wl4(new t5(24));
        l = new wl4(new t5(25));
        m = new wl4(new t5(26));
        n = new wl4(new t5(27));
        o = new wl4(new t5(28));
        p = new wl4(new t5(13));
        q = new wl4(new t5(13));
        r = new wl4(new t5(29));
        s = new wl4(new e90(0));
        t = new wl4(new e90(1));
        u = new wl4(new e90(2));
        v = new wl4(new t5(14));
        w = new wl4(new t5(13));
        x = new l90(new t5(15));
    }

    public static final void a(ub3 r35, pa r36, r70 r37, rg1 r38, int r39) {
        r38.S(1925803616);
        if (r38.e(r35) == false) goto L5;
        int r4 = 4;
    L6:
        int r5 = r39 | r4;
        if (r38.e(r36) == false) goto L9;
        int r6 = 32;
    L10:
        int r7 = r5 | r6;
        if (r38.g(r37) == false) goto L13;
        int r8 = 256;
    L14:
        int r9 = r7 | r8;
        if ((r9 & 147) == 146) goto L17;
        boolean r10 = true;
    L19:
        if (r38.K(r9 & 1, r10) == false) goto L63;
        ra r11 = (ra) r35;
        rr3 r12 = a.a(r11.getAccessibilityManager());
        rr3 r13 = b.a(r11.getAutofill());
        rr3 r14 = d.a(r11.getAutofillManager());
        rr3 r15 = c.a(r11.getAutofillTree());
        rr3 r16 = e.a(r11.getClipboardManager());
        rr3 r17 = f.a(r11.getClipboard());
        rr3 r18 = h.a(r11.getDensity());
        rr3 r19 = i.a(r11.getFocusOwner());
        rr3 r20 = j.a(r11.getFontLoader());
        r20.g = false;
        rr3 r21 = k.a(r11.getFontFamilyResolver());
        r21.g = false;
        rr3 r22 = l.a(r11.getHapticFeedBack());
        int r23 = r9 & 14;
        if (r23 == 4) goto L23;
        boolean r110 = false;
    L24:
        Object r24 = r38.H();
        i80 r1 = j80.a;
        if (r110 == true) goto L29;
        if (r24 == r1) goto L29;
    L30:
        rr3 r25 = m.c((if1) r24);
        rr3 r26 = n.a(r11.getLayoutDirection());
        if (r23 == 4) goto L33;
        boolean r27 = false;
    L34:
        Object r111 = r38.H();
        if (r27 == true) goto L37;
        if (r111 == r1) goto L37;
    L38:
        rr3 r28 = p.c((if1) r111);
        if (r23 == 4) goto L41;
        boolean r29 = false;
    L42:
        Object r112 = r38.H();
        if (r29 == true) goto L45;
        if (r112 == r1) goto L45;
    L46:
        rr3 r210 = q.c((if1) r112);
        if (r23 == 4) goto L49;
        boolean r30 = false;
    L50:
        Object r113 = r38.H();
        if (r30 == true) goto L53;
        if (r113 == r1) goto L53;
    L54:
        rr3 r211 = r.c((if1) r113);
        rr3 r212 = s.a(r36);
        rr3 r213 = t.a(r11.getViewConfiguration());
        rr3 r214 = u.a(r11.getWindowInfo());
        if (r23 == 4) goto L57;
        boolean r31 = false;
    L58:
        Object r32 = r38.H();
        int r114 = 8;
        if (r31 == true) goto L61;
        if (r32 == r1) goto L61;
    L62:
        gi1.b(new rr3[]{r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r25, r26, r28, r210, r211, r212, r213, r214, w.c((if1) r32), g.a(r11.getGraphicsContext()), sd2.a.a(r11.getRetainedValuesStore()), o.a(r11.getLocaleList())}, r37, r38, ((r9 >> 3) & 112) | 8);
    L64:
        lv3 r33 = r38.p();
        if (r33 == null) goto L68;
        r33.d = new d90(r35, r36, r37, r39, 0);
        return;
    L68:
        return;
    L61:
        r32 = new ja(r11, r114);
        r38.b0(r32);
        goto L62
    L57:
        r31 = true;
    L53:
        r113 = new ja(r11, 7);
        r38.b0(r113);
        goto L54
    L49:
        r30 = true;
    L45:
        r112 = new ja(r11, 6);
        r38.b0(r112);
        goto L46
    L41:
        r29 = true;
    L37:
        r111 = new ja(r11, 5);
        r38.b0(r111);
        goto L38
    L33:
        r27 = true;
    L29:
        r24 = new ja(r11, 4);
        r38.b0(r24);
        goto L30
    L23:
        r110 = true;
        goto L24
    L63:
        r38.N();
        goto L64
    L17:
        r10 = false;
        goto L19
    L13:
        r8 = 128;
        goto L14
    L9:
        r6 = 16;
        goto L10
    L5:
        r4 = 2;
        goto L6
    }

    public static final void b(String r3) {
        throw new IllegalStateException(("CompositionLocal " + r3 + " not present").toString());
    }
}
