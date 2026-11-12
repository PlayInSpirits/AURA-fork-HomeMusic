package defpackage;

import android.content.SharedPreferences;
import android.os.Looper;
import android.view.Choreographer;
import com.eddyizm.tempus.App;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t5 implements gf1 {
    public final /* synthetic */ int n;

    public /* synthetic */ t5(int r1) {
        this.n = r1;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        byte r0 = 0;
        vd0 r1 = null;
        switch(this.n) {
            case 0: goto L67;
            case 1: goto L64;
            case 2: goto L62;
            case 3: goto L60;
            case 4: goto L58;
            case 5: goto L56;
            case 6: goto L51;
            case 7: goto L48;
            case 8: goto L47;
            case 9: goto L45;
            case 10: goto L42;
            case 11: goto L40;
            case 12: goto L38;
            case 13: goto L36;
            case 14: goto L35;
            case 15: goto L32;
            case 16: goto L30;
            case 17: goto L28;
            case 18: goto L26;
            case 19: goto L24;
            case 20: goto L22;
            case 21: goto L20;
            case 22: goto L18;
            case 23: goto L16;
            case 24: goto L14;
            case 25: goto L12;
            case 26: goto L10;
            case 27: goto L8;
            case 28: goto L6;
            default: goto L4;
        };
    L4:
        g90.b("LocalTextToolbar");
        throw null;
    L6:
        g90.b("LocalProvidableLocaleList");
        throw null;
    L8:
        g90.b("LocalLayoutDirection");
        throw null;
    L10:
        g90.b("LocalInputManager");
        throw null;
    L12:
        g90.b("LocalHapticFeedback");
        throw null;
    L14:
        g90.b("LocalFontFamilyResolver");
        throw null;
    L16:
        g90.b("LocalFontLoader");
        throw null;
    L18:
        g90.b("LocalFocusManager");
        throw null;
    L20:
        g90.b("LocalDensity");
        throw null;
    L22:
        g90.b("LocalGraphicsContext");
        throw null;
    L24:
        g90.b("LocalClipboard");
        throw null;
    L26:
        g90.b("LocalClipboardManager");
        throw null;
    L28:
        g90.b("LocalAutofillManager");
        throw null;
    L30:
        g90.b("LocalAutofillTree");
        throw null;
    L32:
        wl4 r5 = g90.a;
        return Boolean.FALSE;
    L36:
        wl4 r6 = g90.a;
        return null;
    L38:
        wl4 r7 = y80.a;
        return null;
    L40:
        b00 r8 = b00.a;
        return ((SharedPreferences) b00.b.getValue()).getString("queue", null);
    L42:
        b00 r2 = b00.a;
        return new zz((wz) b00.c.getValue(), new k2(8, r0));
    L48:
        wl4 r9 = nr.a;
        return null;
    L56:
        hb.a("LocalView");
        throw null;
    L58:
        hb.a("LocalResourceIdCache");
        throw null;
    L60:
        hb.a("LocalImageVectorCache");
        throw null;
    L62:
        hb.a("LocalContext");
        throw null;
    L64:
        hb.a("LocalConfiguration");
        throw null;
    L35:
        return new f90();
    L45:
        return new wz(new t5(11), new k2(7, r0));
    L47:
        return App.a().getSharedPreferences("homemusic_catalog_commands", 0);
    L51:
        if (Looper.myLooper() != Looper.getMainLooper()) goto L53;
        Choreographer r3 = Choreographer.getInstance();
    L54:
        bd r10 = new bd(r3, wr1.m(Looper.getMainLooper()));
        return ya4.F(r10, r10.y);
    L53:
        rm0 r4 = rr0.a;
        r3 = (Choreographer) fu.L(uf2.a, new yc(2, r1, r0));
        goto L54
    L67:
        return Integer.valueOf(ku3.o.a(2147418112) + 65536);
    }
}
