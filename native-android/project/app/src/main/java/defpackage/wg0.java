package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wg0 {
    public static final int a;
    public static final xq0 b;

    static {
        int i;
        if (xa3.u("rounded_corner", false)) {
            App.b().getClass();
            String string = App.c().getString("rounded_corner_size", "12");
            string.getClass();
            i = Integer.parseInt(string);
        } else {
            i = 1;
        }
        a = i;
        b = xq0.b;
    }

    public static g04 a(int i, Context context, String str) {
        g04 g04Var = (g04) ((g04) ((g04) ((g04) new g04().r(new ColorDrawable(new nz0(context).a(g12.s(context, R.attr.colorSurface, 0), context.getResources().getDimension(R.dimen.m3_sys_elevation_level5))))).h(c(context, i))).g(c(context, i))).e(b);
        Object obj = str;
        if (str == null) {
            obj = 0;
        }
        return (g04) ((g04) g04Var.w(new s73(obj))).D(new m00(), new n34(a));
    }

    public static String b(int i, String str) {
        if (str != null && (str.startsWith("https://") || str.startsWith("http://"))) {
            return str;
        }
        HashMap mapF = App.f(false).f();
        StringBuilder sb = new StringBuilder();
        sb.append(App.f(false).j());
        sb.append("getCoverArt");
        if (mapF.containsKey("u") && mapF.get("u") != null) {
            sb.append("?u=");
            String strEncode = (String) mapF.get("u");
            try {
                strEncode = URLEncoder.encode(strEncode, StandardCharsets.UTF_8.toString());
            } catch (UnsupportedEncodingException unused) {
            }
            sb.append(strEncode);
        }
        if (mapF.containsKey("p") && mapF.get("p") != null) {
            sb.append("&p=");
            sb.append((String) mapF.get("p"));
        }
        if (mapF.containsKey("s") && mapF.get("s") != null) {
            sb.append("&s=");
            sb.append((String) mapF.get("s"));
        }
        if (mapF.containsKey("t") && mapF.get("t") != null) {
            sb.append("&t=");
            sb.append((String) mapF.get("t"));
        }
        if (mapF.containsKey("v") && mapF.get("v") != null) {
            sb.append("&v=");
            sb.append((String) mapF.get("v"));
        }
        if (mapF.containsKey("c") && mapF.get("c") != null) {
            sb.append("&c=");
            sb.append((String) mapF.get("c"));
        }
        if (i != -1) {
            sb.append("&size=");
            sb.append(i);
        }
        return b11.q(sb, "&id=", str);
    }

    public static Drawable c(Context context, int i) {
        switch (xa3.w(i)) {
            case 1:
                return zz1.r(context, R.drawable.ic_placeholder_album);
            case 2:
                return zz1.r(context, R.drawable.ic_placeholder_artist);
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return zz1.r(context, R.drawable.ic_placeholder_folder);
            case 4:
                return zz1.r(context, R.drawable.ic_placeholder_directory);
            case 5:
                return zz1.r(context, R.drawable.ic_placeholder_playlist);
            case 6:
                return zz1.r(context, R.drawable.ic_placeholder_podcast);
            case 7:
                return zz1.r(context, R.drawable.ic_placeholder_radio);
            case 8:
                return zz1.r(context, R.drawable.ic_placeholder_song);
            default:
                return new ColorDrawable(new nz0(context).a(g12.s(context, R.attr.colorSurface, 0), context.getResources().getDimension(R.dimen.m3_sys_elevation_level5)));
        }
    }
}
