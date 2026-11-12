package defpackage;

import java.text.BreakIterator;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c3 extends b3 {
    public static c3 e;
    public static c3 f;
    public static c3 g;
    public static final o04 h = null;
    public static final o04 i = null;
    public final /* synthetic */ int c;
    public Object d;

    static {
        h = o04.o;
        i = o04.n;
    }

    public /* synthetic */ c3(int r1) {
        this.c = r1;
    }

    @Override // defpackage.b3
    public final int[] f(int r6) {
        switch(this.c) {
            case 0: goto L66;
            case 1: goto L33;
            default: goto L5;
        };
    L66:
        int r0 = j().length();
        if (r0 <= 0) goto L114;
        if (r6 >= r0) goto L115;
        if (r6 >= 0) goto L73;
        r6 = 0;
    L73:
        BreakIterator r1 = (BreakIterator) this.d;
        if (r1 == null) goto L91;
        boolean r2 = r1.isBoundary(r6);
        BreakIterator r3 = (BreakIterator) this.d;
        if (r2 == true) goto L83;
        if (r3 == null) goto L81;
        r6 = r3.following(r6);
        if (r6 != (-1)) goto L73;
        return null;
    L81:
        h12.Q("impl");
        throw null;
    L83:
        if (r3 == null) goto L89;
        int r4 = r3.following(r6);
        if (r4 != (-1)) goto L88;
        return null;
    L88:
        return i(r6, r4);
    L89:
        h12.Q("impl");
        throw null;
    L91:
        h12.Q("impl");
        throw null;
    L115:
        return null;
    L114:
        return null;
    L5:
        if (j().length() > 0) goto L8;
        return null;
    L8:
        if (r6 >= j().length()) goto L107;
        ms4 r5 = (ms4) this.d;
        o04 r7 = h;
        if (r6 >= 0) goto L16;
        if (r5 == null) goto L14;
        int r8 = r5.a(0);
    L21:
        ms4 r9 = (ms4) this.d;
        if (r9 != null) goto L24;
        h12.Q("layoutResult");
        throw null;
    L24:
        if (r8 < r9.b.b) goto L27;
        return null;
    L27:
        return i(o(r8, r7), o(r8, i) + 1);
    L14:
        h12.Q("layoutResult");
        throw null;
    L16:
        if (r5 == null) goto L30;
        int r10 = r5.a(r6);
        if (o(r10, r7) != r6) goto L20;
        r8 = r10;
        goto L21
    L20:
        r8 = r10 + 1;
        goto L21
    L30:
        h12.Q("layoutResult");
        throw null;
    L107:
        return null;
    L33:
        if (j().length() > 0) goto L36;
        return null;
    L36:
        if (r6 >= j().length()) goto L111;
        if (r6 >= 0) goto L41;
        r6 = 0;
    L41:
        if (r(r6) == true) goto L55;
        if (r(r6) == false) goto L48;
        if (r6 == 0) goto L55;
        if (r(r6 - 1) == false) goto L55;
    L48:
        BreakIterator r11 = (BreakIterator) this.d;
        if (r11 == null) goto L53;
        r6 = r11.following(r6);
        if (r6 != (-1)) goto L41;
        return null;
    L53:
        h12.Q("impl");
        throw null;
    L55:
        BreakIterator r12 = (BreakIterator) this.d;
        if (r12 == null) goto L64;
        int r13 = r12.following(r6);
        if (r13 != (-1)) goto L60;
        return null;
    L60:
        if (q(r13) == true) goto L63;
        return null;
    L63:
        return i(r6, r13);
    L64:
        h12.Q("impl");
        throw null;
    L111:
        return null;
    }

    @Override // defpackage.b3
    public final int[] m(int r6) {
        switch(this.c) {
            case 0: goto L58;
            case 1: goto L26;
            default: goto L5;
        };
    L26:
        int r0 = j().length();
        if (r0 <= 0) goto L104;
        if (r6 <= 0) goto L105;
        if (r6 <= r0) goto L33;
        r6 = r0;
    L33:
        if (r6 <= 0) goto L45;
        if (r(r6 - 1) == true) goto L45;
        if (q(r6) == true) goto L45;
        BreakIterator r1 = (BreakIterator) this.d;
        if (r1 == null) goto L43;
        r6 = r1.preceding(r6);
        if (r6 != (-1)) goto L33;
        return null;
    L43:
        h12.Q("impl");
        throw null;
    L45:
        BreakIterator r2 = (BreakIterator) this.d;
        if (r2 == null) goto L56;
        int r3 = r2.preceding(r6);
        if (r3 != (-1)) goto L50;
        return null;
    L50:
        if (r(r3) == false) goto L102;
        if (r3 == 0) goto L55;
        if (r(r3 - 1) == false) goto L55;
        return null;
    L55:
        return i(r3, r6);
    L102:
        return null;
    L56:
        h12.Q("impl");
        throw null;
    L105:
        return null;
    L104:
        return null;
    L58:
        int r4 = j().length();
        if (r4 <= 0) goto L107;
        if (r6 <= 0) goto L108;
        if (r6 <= r4) goto L65;
        r6 = r4;
    L65:
        BreakIterator r5 = (BreakIterator) this.d;
        if (r5 == null) goto L83;
        boolean r7 = r5.isBoundary(r6);
        BreakIterator r8 = (BreakIterator) this.d;
        if (r7 == true) goto L75;
        if (r8 == null) goto L73;
        r6 = r8.preceding(r6);
        if (r6 != (-1)) goto L65;
        return null;
    L73:
        h12.Q("impl");
        throw null;
    L75:
        if (r8 == null) goto L81;
        int r9 = r8.preceding(r6);
        if (r9 != (-1)) goto L80;
        return null;
    L80:
        return i(r9, r6);
    L81:
        h12.Q("impl");
        throw null;
    L83:
        h12.Q("impl");
        throw null;
    L108:
        return null;
    L107:
        return null;
    L5:
        if (j().length() <= 0) goto L98;
        if (r6 <= 0) goto L99;
        int r10 = j().length();
        ms4 r11 = (ms4) this.d;
        o04 r12 = i;
        if (r6 <= r10) goto L15;
        if (r11 == null) goto L13;
        int r13 = r11.a(j().length());
    L20:
        if (r13 >= 0) goto L23;
        return null;
    L23:
        return i(o(r13, h), o(r13, r12) + 1);
    L13:
        h12.Q("layoutResult");
        throw null;
    L15:
        if (r11 == null) goto L24;
        int r14 = r11.a(r6);
        if ((o(r14, r12) + 1) != r6) goto L19;
        r13 = r14;
        goto L20
    L19:
        r13 = r14 - 1;
        goto L20
    L24:
        h12.Q("layoutResult");
        throw null;
    L99:
        return null;
    L98:
        return null;
    }

    public int o(int r5, o04 r6) {
        ms4 r0 = (ms4) this.d;
        if (r0 == null) goto L20;
        int r1 = r0.c(r5);
        ms4 r3 = (ms4) this.d;
        if (r3 == null) goto L18;
        o04 r2 = r3.e(r1);
        ms4 r4 = (ms4) this.d;
        if (r6 == r2) goto L13;
        if (r4 != null) goto L10;
        h12.Q("layoutResult");
        throw null;
    L10:
        return r4.c(r5);
    L13:
        if (r4 == null) goto L16;
        fd r7 = r4.b;
        r7.c(r5);
        ArrayList r8 = (ArrayList) r7.e;
        od3 r9 = (od3) r8.get(rr2.D(r8, r5));
        ic r10 = r9.a;
        return (r10.d.e(r5 - r9.d) + r9.b) - 1;
    L16:
        h12.Q("layoutResult");
        throw null;
    L18:
        h12.Q("layoutResult");
        throw null;
    L20:
        h12.Q("layoutResult");
        throw null;
    }

    public void p(String r4) {
        switch(this.c) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        this.a = r4;
        BreakIterator r3 = (BreakIterator) this.d;
        if (r3 == null) goto L8;
        r3.setText(r4);
        return;
    L8:
        h12.Q("impl");
        throw null;
    L10:
        this.a = r4;
        BreakIterator r5 = (BreakIterator) this.d;
        if (r5 == null) goto L14;
        r5.setText(r4);
        return;
    L14:
        h12.Q("impl");
        throw null;
    }

    public boolean q(int r2) {
        if (r2 > 0) goto L4;
        return false;
    L4:
        if (r(r2 - 1) == true) goto L6;
        return false;
    L6:
        if (r2 != j().length()) goto L8;
        return true;
    L8:
        if (r(r2) == true) goto L15;
        return true;
    L15:
        return false;
    }

    public boolean r(int r2) {
        if (r2 >= 0) goto L4;
        return false;
    L4:
        if (r2 < j().length()) goto L6;
        return false;
    L6:
        return Character.isLetterOrDigit(j().codePointAt(r2));
    }
}
