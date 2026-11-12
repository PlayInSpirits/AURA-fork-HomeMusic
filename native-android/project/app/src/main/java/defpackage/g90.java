package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g90 {
    public static final wl4 a = new wl4(new t5(13));
    public static final wl4 b = new wl4(new t5(13));
    public static final wl4 c = new wl4(new t5(16));
    public static final wl4 d = new wl4(new t5(17));
    public static final wl4 e = new wl4(new t5(18));
    public static final wl4 f = new wl4(new t5(19));
    public static final wl4 g = new wl4(new t5(20));
    public static final wl4 h = new wl4(new t5(21));
    public static final wl4 i = new wl4(new t5(22));
    public static final wl4 j = new wl4(new t5(23));
    public static final wl4 k = new wl4(new t5(24));
    public static final wl4 l = new wl4(new t5(25));
    public static final wl4 m = new wl4(new t5(26));
    public static final wl4 n = new wl4(new t5(27));
    public static final wl4 o = new wl4(new t5(28));
    public static final wl4 p = new wl4(new t5(13));
    public static final wl4 q = new wl4(new t5(13));
    public static final wl4 r = new wl4(new t5(29));
    public static final wl4 s = new wl4(new e90(0));
    public static final wl4 t = new wl4(new e90(1));
    public static final wl4 u = new wl4(new e90(2));
    public static final wl4 v = new wl4(new t5(14));
    public static final wl4 w = new wl4(new t5(13));
    public static final l90 x = new l90(new t5(15));

    public static final void a(ub3 ub3Var, pa paVar, r70 r70Var, rg1 rg1Var, int i2) {
        rg1Var.S(1925803616);
        int i3 = i2 | (rg1Var.e(ub3Var) ? 4 : 2) | (rg1Var.e(paVar) ? 32 : 16) | (rg1Var.g(r70Var) ? 256 : 128);
        if (rg1Var.K(i3 & 1, (i3 & 147) != 146)) {
            ra raVar = (ra) ub3Var;
            rr3 rr3VarA = a.a(raVar.getAccessibilityManager());
            rr3 rr3VarA2 = b.a(raVar.getAutofill());
            rr3 rr3VarA3 = d.a(raVar.getAutofillManager());
            rr3 rr3VarA4 = c.a(raVar.getAutofillTree());
            rr3 rr3VarA5 = e.a(raVar.getClipboardManager());
            rr3 rr3VarA6 = f.a(raVar.getClipboard());
            rr3 rr3VarA7 = h.a(raVar.getDensity());
            rr3 rr3VarA8 = i.a(raVar.getFocusOwner());
            rr3 rr3VarA9 = j.a(raVar.getFontLoader());
            rr3VarA9.g = false;
            rr3 rr3VarA10 = k.a(raVar.getFontFamilyResolver());
            rr3VarA10.g = false;
            rr3 rr3VarA11 = l.a(raVar.getHapticFeedBack());
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objH = rg1Var.H();
            i80 i80Var = j80.a;
            if (z || objH == i80Var) {
                objH = new ja(raVar, 4);
                rg1Var.b0(objH);
            }
            rr3 rr3VarC = m.c((if1) objH);
            rr3 rr3VarA12 = n.a(raVar.getLayoutDirection());
            boolean z2 = i4 == 4;
            Object objH2 = rg1Var.H();
            if (z2 || objH2 == i80Var) {
                objH2 = new ja(raVar, 5);
                rg1Var.b0(objH2);
            }
            rr3 rr3VarC2 = p.c((if1) objH2);
            boolean z3 = i4 == 4;
            Object objH3 = rg1Var.H();
            if (z3 || objH3 == i80Var) {
                objH3 = new ja(raVar, 6);
                rg1Var.b0(objH3);
            }
            rr3 rr3VarC3 = q.c((if1) objH3);
            boolean z4 = i4 == 4;
            Object objH4 = rg1Var.H();
            if (z4 || objH4 == i80Var) {
                objH4 = new ja(raVar, 7);
                rg1Var.b0(objH4);
            }
            rr3 rr3VarC4 = r.c((if1) objH4);
            rr3 rr3VarA13 = s.a(paVar);
            rr3 rr3VarA14 = t.a(raVar.getViewConfiguration());
            rr3 rr3VarA15 = u.a(raVar.getWindowInfo());
            boolean z5 = i4 == 4;
            Object objH5 = rg1Var.H();
            int i5 = 8;
            if (z5 || objH5 == i80Var) {
                objH5 = new ja(raVar, i5);
                rg1Var.b0(objH5);
            }
            gi1.b(new rr3[]{rr3VarA, rr3VarA2, rr3VarA3, rr3VarA4, rr3VarA5, rr3VarA6, rr3VarA7, rr3VarA8, rr3VarA9, rr3VarA10, rr3VarA11, rr3VarC, rr3VarA12, rr3VarC2, rr3VarC3, rr3VarC4, rr3VarA13, rr3VarA14, rr3VarA15, w.c((if1) objH5), g.a(raVar.getGraphicsContext()), sd2.a.a(raVar.getRetainedValuesStore()), o.a(raVar.getLocaleList())}, r70Var, rg1Var, ((i3 >> 3) & 112) | 8);
        } else {
            rg1Var.N();
        }
        lv3 lv3VarP = rg1Var.p();
        if (lv3VarP != null) {
            lv3VarP.d = new d90(ub3Var, paVar, r70Var, i2, 0);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
