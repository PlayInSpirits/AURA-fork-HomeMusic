package defpackage;

import com.eddyizm.tempus.homemusic.SmartSession;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l94 {
    public final c72 a;
    public final x01 b;
    public final e02 c;
    public final q03 d;

    public l94(c72 r1, x01 r2, i03 r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = new q03(2);
    }

    public final i94 a() {
        e94 r0 = new e94();
        return new i94(this.b, false, this.a, r0);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void b(c72 r18, e94 r19) {
        q03 r0 = this.d;
        Object[] r2 = r0.a;
        int r1 = r0.b;
        int r4 = 0;
    L3:
        if (r4 >= r1) goto L122;
        y9 r5 = (y9) r2[r4];
        r5.getClass();
        e94 r6 = r18.v();
        int r8 = r18.o;
        qr2 r9 = r5.n;
        ra r10 = r5.p;
        if (r19 == null) goto L10;
        Object r12 = r19.n.g(n94.r);
        if (r12 != null) goto L9;
        r12 = null;
    L9:
        mb r13 = (mb) r12;
    L11:
        if (r6 == null) goto L16;
        Object r14 = r6.n.g(n94.r);
        if (r14 != null) goto L15;
        r14 = null;
    L15:
        mb r15 = (mb) r14;
    L17:
        mb r16 = fz0.O;
        boolean r11 = true;
        if (h12.c(r15, r16) == false) goto L23;
        if (h12.c(r13, r16) == true) goto L106;
        r9.p(r10, r8, false);
    L106:
        if (r19 != null) goto L108;
    L110:
        boolean r17 = false;
    L111:
        if (r6 != null) goto L113;
    L115:
        r11 = false;
    L116:
        if (r17 == r11) goto L121;
        j03 r7 = r5.t;
        if (r11 == false) goto L120;
        r7.a(r8);
        goto L121
    L120:
        r7.f(r8);
    L121:
        r4 = r4 + 1;
        goto L3
    L113:
        if (r6.n.b(n94.q) != true) goto L115;
    L108:
        if (r19.n.b(n94.q) != true) goto L110;
        r17 = true;
        goto L111
    L23:
        if (h12.c(r13, r16) == true) goto L25;
    L27:
        if (r19 == null) goto L34;
        Object r110 = r19.n.g(n94.C);
        if (r110 != null) goto L31;
        r110 = null;
    L31:
        he r111 = (he) r110;
        if (r111 == null) goto L34;
        String r112 = r111.o;
    L35:
        if (r6 == null) goto L42;
        Object r113 = r6.n.g(n94.C);
        if (r113 != null) goto L39;
        r113 = null;
    L39:
        he r114 = (he) r113;
        if (r114 == null) goto L42;
        String r115 = r114.o;
    L43:
        if (r112 == r115) goto L60;
        if (r112 != null) goto L46;
        r9.p(r10, r8, true);
        goto L60
    L46:
        if (r115 != null) goto L49;
        r9.p(r10, r8, false);
        goto L60
    L49:
        if (h12.c(r15, fz0.P) == false) goto L60;
        int r116 = r115.length();
        CharSequence r117 = r115;
        if (r116 > 5000) goto L54;
    L59:
        gm0.v(r9.k(), r10, r8, tn.g(r117));
        goto L60
    L54:
        if (Character.isHighSurrogate(r115.charAt(4999)) == true) goto L56;
    L58:
        r117 = qm4.I0(SmartSession.MAX_SONGS, r115);
        goto L59
    L56:
        if (Character.isLowSurrogate(r115.charAt(SmartSession.MAX_SONGS)) == false) goto L58;
        r117 = qm4.I0(4999, r115);
    L60:
        if (r19 == null) goto L65;
        Object r118 = r19.n.g(n94.H);
        if (r118 != null) goto L64;
        r118 = null;
    L64:
        qu4 r119 = (qu4) r118;
    L66:
        if (r6 == null) goto L71;
        Object r120 = r6.n.g(n94.H);
        if (r120 != null) goto L70;
        r120 = null;
    L70:
        qu4 r121 = (qu4) r120;
    L72:
        if (r119 == r121) goto L87;
        if (r119 != null) goto L75;
        r9.p(r10, r8, true);
        goto L87
    L75:
        if (r121 != null) goto L78;
        r9.p(r10, r8, false);
        goto L87
    L78:
        if (h12.c(r15, fz0.Q) == false) goto L87;
        int r122 = r121.ordinal();
        if (r122 == 0) goto L84;
        if (r122 == 1) goto L83;
        Boolean r123 = null;
    L85:
        if (r123 == null) goto L87;
        gm0.v(r9.k(), r10, r8, tn.h(r123.booleanValue()));
        goto L87
    L83:
        r123 = Boolean.FALSE;
        goto L85
    L84:
        r123 = Boolean.TRUE;
    L87:
        if (r19 == null) goto L92;
        Object r124 = r19.n.g(n94.s);
        if (r124 != null) goto L91;
        r124 = null;
    L91:
        wb r125 = (wb) r124;
    L93:
        if (r6 == null) goto L98;
        Object r126 = r6.n.g(n94.s);
        if (r126 != null) goto L97;
        r126 = null;
    L97:
        wb r127 = (wb) r126;
    L100:
        if (h12.c(r125, r127) == true) goto L106;
        if (r125 != null) goto L103;
        r9.p(r10, r8, true);
        goto L106
    L103:
        if (r127 != null) goto L105;
        r9.p(r10, r8, false);
        goto L106
    L105:
        gm0.v(r9.k(), r10, r8, r127.a);
        goto L106
    L98:
        r127 = null;
        goto L100
    L92:
        r125 = null;
        goto L93
    L71:
        r121 = null;
        goto L72
    L65:
        r119 = null;
    L42:
        r115 = null;
    L34:
        r112 = null;
        goto L35
    L25:
        if (h12.c(r15, r16) == true) goto L27;
        r9.p(r10, r8, true);
        goto L27
    L16:
        r15 = null;
        goto L17
    L10:
        r13 = null;
        goto L11
    }
}
