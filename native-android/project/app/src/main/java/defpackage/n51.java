package defpackage;

import android.net.Uri;
import java.util.Map;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface n51 {
    public static final q2 a = new n51() { // from class: q2
        public final /* synthetic */ int b = 4;

        @Override // defpackage.n51
        public final k51[] c() {
            switch (this.b) {
                case 0:
                    return new k51[]{new r2()};
                case 1:
                    return new k51[]{new t2()};
                case 2:
                    return new k51[]{new h6(0)};
                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                    return new k51[]{new p9()};
                case 4:
                    return new k51[0];
                case 5:
                    return new k51[]{new s71()};
                case 6:
                    return new k51[]{new n91()};
                case 7:
                    return new k51[]{new sy2(xn4.m, 16)};
                case 8:
                    return new k51[]{new i83()};
                case 9:
                    return new k51[]{new ur3()};
                case 10:
                    iu4 iu4Var = new iu4(0L);
                    vw1 vw1Var = yw1.o;
                    return new k51[]{new qy4(1, 1, xn4.m, iu4Var, new qn0(gy3.r, 0))};
                default:
                    return new k51[]{new d95()};
            }
        }
    };

    default void a(om0 om0Var) {
    }

    default void b() {
    }

    k51[] c();

    default void d(boolean z) {
    }

    default k51[] e(Uri uri, Map map) {
        return c();
    }
}
