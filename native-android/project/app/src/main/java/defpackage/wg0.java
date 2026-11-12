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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wg0 {
    public static final int a = 0;
    public static final xq0 b = null;

    static {
        if (xa3.u("rounded_corner", false) == false) goto L5;
        App.b().getClass();
        String r0 = App.c().getString("rounded_corner_size", "12");
        r0.getClass();
        int r1 = Integer.parseInt(r0);
    L6:
        a = r1;
        b = xq0.b;
        return;
    L5:
        r1 = 1;
        goto L6
    }

    public static g04 a(int r6, Context r7, String r8) {
        g04 r9 = (g04) ((g04) ((g04) ((g04) new g04().r(new ColorDrawable(new nz0(r7).a(g12.s(r7, R.attr.colorSurface, 0), r7.getResources().getDimension(R.dimen.m3_sys_elevation_level5))))).h(c(r7, r6))).g(c(r7, r6))).e(b);
        Object r10 = r8;
        if (r8 != null) goto L7;
        r10 = 0;
    L7:
        return (g04) ((g04) r9.w(new s73(r10))).D(new uw4[]{new m00(), new n34(a)});
    }

    public static String b(int r4, String r5) {
        if (r5 != null) goto L4;
    L8:
        HashMap r1 = App.f(false).f();
        StringBuilder r2 = new StringBuilder();
        r2.append(App.f(false).j());
        r2.append("getCoverArt");
        if (r1.containsKey("u") == false) goto L16;
        if (r1.get("u") == null) goto L16;
        r2.append("?u=");
        String r0 = (String) r1.get("u");
        r0 = URLEncoder.encode(r0, StandardCharsets.UTF_8.toString());     // Catch: UnsupportedEncodingException -> L45
    L14:
        r2.append(r0);
    L16:
        if (r1.containsKey("p") == false) goto L21;
        if (r1.get("p") == null) goto L21;
        r2.append("&p=");
        r2.append((String) r1.get("p"));
    L21:
        if (r1.containsKey("s") == false) goto L26;
        if (r1.get("s") == null) goto L26;
        r2.append("&s=");
        r2.append((String) r1.get("s"));
    L26:
        if (r1.containsKey("t") == false) goto L31;
        if (r1.get("t") == null) goto L31;
        r2.append("&t=");
        r2.append((String) r1.get("t"));
    L31:
        if (r1.containsKey("v") == false) goto L36;
        if (r1.get("v") == null) goto L36;
        r2.append("&v=");
        r2.append((String) r1.get("v"));
    L36:
        if (r1.containsKey("c") == false) goto L41;
        if (r1.get("c") == null) goto L41;
        r2.append("&c=");
        r2.append((String) r1.get("c"));
    L41:
        if (r4 == (-1)) goto L44;
        r2.append("&size=");
        r2.append(r4);
    L44:
        return b11.q(r2, "&id=", r5);
    L4:
        if (r5.startsWith("https://") == false) goto L6;
    L7:
        return r5;
    L6:
        if (r5.startsWith("http://") == false) goto L8;
        goto L7
    }

    public static Drawable c(Context r4, int r5) {
        switch(xa3.w(r5)) {
            case 1: goto L21;
            case 2: goto L19;
            case 3: goto L17;
            case 4: goto L15;
            case 5: goto L13;
            case 6: goto L11;
            case 7: goto L9;
            case 8: goto L7;
            default: goto L4;
        };
    L4:
        float r0 = r4.getResources().getDimension(R.dimen.m3_sys_elevation_level5);
        return new ColorDrawable(new nz0(r4).a(g12.s(r4, R.attr.colorSurface, 0), r0));
    L7:
        return zz1.r(r4, R.drawable.ic_placeholder_song);
    L9:
        return zz1.r(r4, R.drawable.ic_placeholder_radio);
    L11:
        return zz1.r(r4, R.drawable.ic_placeholder_podcast);
    L13:
        return zz1.r(r4, R.drawable.ic_placeholder_playlist);
    L15:
        return zz1.r(r4, R.drawable.ic_placeholder_directory);
    L17:
        return zz1.r(r4, R.drawable.ic_placeholder_folder);
    L19:
        return zz1.r(r4, R.drawable.ic_placeholder_artist);
    L21:
        return zz1.r(r4, R.drawable.ic_placeholder_album);
    }
}
