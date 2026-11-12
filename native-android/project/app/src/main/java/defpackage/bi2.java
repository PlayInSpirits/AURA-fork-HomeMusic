package defpackage;

import com.eddyizm.tempus.model.Queue;
import com.eddyizm.tempus.subsonic.models.Child;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bi2 implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ bi2(int r1) {
        this.a = r1;
    }

    @Override // java.util.function.Function
    public final Object apply(Object r14) {
        double r0 = 20.0d;
        double r2 = 40.0d;
        double r4 = 10.0d;
        double r6 = 30.0d;
        switch(this.a) {
            case 0: goto L109;
            case 1: goto L103;
            case 2: goto L100;
            case 3: goto L99;
            case 4: goto L97;
            case 5: goto L95;
            case 6: goto L93;
            case 7: goto L88;
            case 8: goto L86;
            case 9: goto L80;
            case 10: goto L78;
            case 11: goto L72;
            case 12: goto L70;
            case 13: goto L65;
            case 14: goto L62;
            case 15: goto L61;
            case 16: goto L56;
            case 17: goto L51;
            case 18: goto L49;
            case 19: goto L44;
            case 20: goto L42;
            case 21: goto L36;
            case 22: goto L34;
            case 23: goto L28;
            case 24: goto L26;
            case 25: goto L15;
            case 26: goto L11;
            case 27: goto L9;
            case 28: goto L7;
            default: goto L5;
        };
    L15:
        d64 r15 = (d64) r14;
        boolean r13 = tv1.C(r15);
        boolean r16 = r15.c;
        if (r13 == false) goto L21;
        if (r16 == false) goto L19;
        double r17 = 100.0d;
    L111:
        return Double.valueOf(r17);
    L19:
        r17 = 0.0d;
        goto L111
    L21:
        if (r16 == false) goto L24;
        r2 = 80.0d;
    L24:
        return Double.valueOf(r2);
    L62:
        d64 r18 = (d64) r14;
        return gy0.c(new ai2(13), new ai2(14), null, null);
    L100:
        d64 r19 = (d64) r14;
        return gy0.c(new bi2(15), new bi2(17), null, null);
    L5:
        return (Child) Child.class.cast((Queue) r14);
    L7:
        return ((Queue) r14).getId();
    L9:
        return (Queue) r14;
    L11:
        if (((d64) r14).c == false) goto L14;
        return gy0.c(new zh2(29), new ai2(0), null, null);
    L14:
        return gy0.c(new zh2(1), new zh2(2), null, null);
    L26:
        return ((d64) r14).e;
    L28:
        if (((d64) r14).c == true) goto L32;
        r6 = 90.0d;
    L32:
        return Double.valueOf(r6);
    L34:
        return ((d64) r14).j;
    L36:
        if (((d64) r14).c == true) goto L40;
        r6 = 80.0d;
    L40:
        return Double.valueOf(r6);
    L42:
        return ((d64) r14).i;
    L44:
        if (((d64) r14).c == false) goto L47;
        r4 = 90.0d;
    L47:
        return Double.valueOf(r4);
    L49:
        return ((d64) r14).j;
    L51:
        if (((d64) r14).c == false) goto L54;
        r0 = 90.0d;
    L54:
        return Double.valueOf(r0);
    L56:
        if (((d64) r14).c == false) goto L59;
        r4 = 90.0d;
    L59:
        return Double.valueOf(r4);
    L61:
        return ((d64) r14).h;
    L65:
        if (((d64) r14).c == false) goto L68;
        r6 = 80.0d;
    L68:
        return Double.valueOf(r6);
    L70:
        return ((d64) r14).i;
    L72:
        if (((d64) r14).c == false) goto L74;
        double r110 = 12.0d;
    L76:
        return Double.valueOf(r110);
    L74:
        r110 = 94.0d;
        goto L76
    L78:
        return ((d64) r14).h;
    L80:
        if (((d64) r14).c == true) goto L84;
        r4 = 90.0d;
    L84:
        return Double.valueOf(r4);
    L86:
        return ((d64) r14).h;
    L88:
        if (((d64) r14).c == false) goto L91;
        r2 = 80.0d;
    L91:
        return Double.valueOf(r2);
    L93:
        return ((d64) r14).h;
    L95:
        return ((d64) r14).j;
    L97:
        return ((d64) r14).f;
    L99:
        return ((d64) r14).g;
    L103:
        if (((d64) r14).c == true) goto L107;
        r0 = 95.0d;
    L107:
        return Double.valueOf(r0);
    L109:
        return ((d64) r14).h;
    }

    public /* synthetic */ bi2(tv1 r1, int r2) {
        this.a = r2;
    }
}
