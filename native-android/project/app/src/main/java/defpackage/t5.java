package defpackage;

import android.content.SharedPreferences;
import android.os.Looper;
import android.view.Choreographer;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.WaveRetry;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t5 implements gf1 {
    public final /* synthetic */ int n;

    public /* synthetic */ t5(int i) {
        this.n = i;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        Choreographer choreographer;
        byte b = 0;
        vd0 vd0Var = null;
        switch (this.n) {
            case 0:
                return Integer.valueOf(ku3.o.a(2147418112) + 65536);
            case 1:
                hb.a("LocalConfiguration");
                throw null;
            case 2:
                hb.a("LocalContext");
                throw null;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                hb.a("LocalImageVectorCache");
                throw null;
            case 4:
                hb.a("LocalResourceIdCache");
                throw null;
            case 5:
                hb.a("LocalView");
                throw null;
            case 6:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    rm0 rm0Var = rr0.a;
                    choreographer = (Choreographer) fu.L(uf2.a, new yc(2, vd0Var, b));
                }
                bd bdVar = new bd(choreographer, wr1.m(Looper.getMainLooper()));
                return ya4.F(bdVar, bdVar.y);
            case 7:
                wl4 wl4Var = nr.a;
                return null;
            case 8:
                return App.a().getSharedPreferences("homemusic_catalog_commands", 0);
            case 9:
                return new wz(new t5(11), new k2(7, b));
            case 10:
                b00 b00Var = b00.a;
                return new zz((wz) b00.c.getValue(), new k2(8, b));
            case 11:
                b00 b00Var2 = b00.a;
                return ((SharedPreferences) b00.b.getValue()).getString("queue", null);
            case 12:
                wl4 wl4Var2 = y80.a;
                return null;
            case 13:
                wl4 wl4Var3 = g90.a;
                return null;
            case 14:
                return new f90();
            case 15:
                wl4 wl4Var4 = g90.a;
                return Boolean.FALSE;
            case WaveRetry.MAX_FAILURES /* 16 */:
                g90.b("LocalAutofillTree");
                throw null;
            case 17:
                g90.b("LocalAutofillManager");
                throw null;
            case 18:
                g90.b("LocalClipboardManager");
                throw null;
            case 19:
                g90.b("LocalClipboard");
                throw null;
            case 20:
                g90.b("LocalGraphicsContext");
                throw null;
            case 21:
                g90.b("LocalDensity");
                throw null;
            case 22:
                g90.b("LocalFocusManager");
                throw null;
            case 23:
                g90.b("LocalFontLoader");
                throw null;
            case 24:
                g90.b("LocalFontFamilyResolver");
                throw null;
            case 25:
                g90.b("LocalHapticFeedback");
                throw null;
            case 26:
                g90.b("LocalInputManager");
                throw null;
            case 27:
                g90.b("LocalLayoutDirection");
                throw null;
            case 28:
                g90.b("LocalProvidableLocaleList");
                throw null;
            default:
                g90.b("LocalTextToolbar");
                throw null;
        }
    }
}
