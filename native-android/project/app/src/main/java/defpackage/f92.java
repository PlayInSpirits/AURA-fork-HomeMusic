package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import app.homemusic.R;
import com.eddyizm.tempus.service.MediaService;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f92 {
    public static final jx1 a = null;

    static {
        int r1 = jx1.p;
        Object[] r2 = new Object[32];
        r2[0] = "android.media.metadata.TITLE";
        r2[1] = "android.media.metadata.ARTIST";
        r2[2] = "android.media.metadata.DURATION";
        r2[3] = "android.media.metadata.ALBUM";
        r2[4] = "android.media.metadata.AUTHOR";
        r2[5] = "android.media.metadata.WRITER";
        System.arraycopy(new String[]{"android.media.metadata.COMPOSER", "android.media.metadata.COMPILATION", "android.media.metadata.DATE", "android.media.metadata.YEAR", "android.media.metadata.GENRE", "android.media.metadata.TRACK_NUMBER", "android.media.metadata.NUM_TRACKS", "android.media.metadata.DISC_NUMBER", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.ART", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.USER_RATING", "android.media.metadata.RATING", "android.media.metadata.DISPLAY_TITLE", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION", "android.media.metadata.DISPLAY_ICON", "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.MEDIA_ID", "android.media.metadata.MEDIA_URI", "android.media.metadata.BT_FOLDER_TYPE", "android.media.metadata.ADVERTISEMENT", "android.media.metadata.DOWNLOAD_STATUS", "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"}, 0, r2, 6, 26);
        a = jx1.j(32, r2);
    }

    public static ij2 a(gn2 r1, Bitmap r2) {
        pm2 r3 = i(r1, r2);
        do2 r4 = r1.d;
        Boolean r0 = r4.q;
        if (r0 != null) goto L5;
    L7:
        int r5 = 0;
    L8:
        Boolean r6 = r4.r;
        if (r6 == null) goto L14;
        if (r6.booleanValue() == false) goto L14;
        r5 = r5 | 2;
    L14:
        return new ij2(r3, r5);
    L5:
        if (r0.booleanValue() == false) goto L7;
        r5 = 1;
        goto L8
    }

    public static long b(ei3 r8, eo2 r9, long r10) {
        if (r8 != null) goto L5;
        long r0 = 0;
    L4:
        long r2 = r0;
        long r4 = c(r8, r9, r10);
        long r6 = d(r9);
        if (r6 != (-9223372036854775807L)) goto L11;
        return Math.max(r4, r2);
    L11:
        return f35.k(r2, r4, r6);
    L5:
        r0 = r8.p;
        goto L4
    }

    public static long c(ei3 r14, eo2 r15, long r16) {
        if (r14 != null) goto L5;
        return 0;
    L5:
        long r2 = r14.o;
        if (r14.n == 3) goto L8;
    L16:
        long r8 = r2;
        long r12 = d(r15);
        if (r12 != (-9223372036854775807L)) goto L21;
        return Math.max(0, r8);
    L21:
        return f35.k(r8, 0, r12);
    L8:
        if (r16 != (-9223372036854775807L)) goto L10;
        Long r4 = null;
    L11:
        float r5 = r14.q;
        if (r4 == null) goto L14;
        long r9 = r4.longValue();
    L15:
        r2 = Math.max(0, r2 + ((long) (r5 * r9)));
        goto L16
    L14:
        r9 = SystemClock.elapsedRealtime() - r14.u;
        goto L15
    L10:
        r4 = Long.valueOf(r16);
        goto L11
    }

    public static long d(eo2 r6) {
        if (r6 != null) goto L5;
    L11:
        return -9223372036854775807L;
    L5:
        if (r6.n.containsKey("android.media.metadata.DURATION") == false) goto L11;
        long r2 = r6.a("android.media.metadata.DURATION");
        if (r2 > 0) goto L10;
        return -9223372036854775807L;
    L10:
        return r2;
    }

    public static long e(int r2) {
        switch(r2) {
            case 0: goto L17;
            case 1: goto L15;
            case 2: goto L13;
            case 3: goto L11;
            case 4: goto L9;
            case 5: goto L7;
            case 6: goto L5;
            default: goto L3;
        };
    L3:
        kf2.n(f34.f(r2, "Unrecognized FolderType: "));
        return 0;
    L5:
        return 6;
    L7:
        return 5;
    L9:
        return 4;
    L11:
        return 3;
    L13:
        return 2;
    L15:
        return 1;
    L17:
        return 0;
    }

    public static int f(long r4) {
        if (r4 != 0) goto L6;
        return 0;
    L6:
        if (r4 != 1) goto L10;
        return 1;
    L10:
        if (r4 != 2) goto L14;
        return 2;
    L14:
        if (r4 != 3) goto L18;
        return 3;
    L18:
        if (r4 != 4) goto L22;
        return 4;
    L22:
        if (r4 != 5) goto L26;
        return 5;
    L26:
        if (r4 != 6) goto L29;
        return 6;
    L29:
        return 0;
    }

    public static int g(int r2) {
        if (r2 != (-110)) goto L5;
        return 8;
    L5:
        if (r2 != (-109)) goto L7;
        return 11;
    L7:
        if (r2 != (-6)) goto L9;
        return 2;
    L9:
        if (r2 == (-2)) goto L28;
        if (r2 == 1) goto L26;
        switch(r2) {
            case -107: goto L24;
            case -106: goto L22;
            case -105: goto L20;
            case -104: goto L18;
            case -103: goto L16;
            case -102: goto L14;
            default: goto L12;
        };
    L12:
        return 0;
    L14:
        return 3;
    L16:
        return 4;
    L18:
        return 5;
    L20:
        return 6;
    L22:
        return 7;
    L24:
        return 9;
    L26:
        return 10;
    L28:
        return 1;
    }

    public static jn2 h(MediaService r4, Bundle r5) {
        if (r5 != null) goto L18;
        return null;
    L18:
        r5.setClassLoader(r4.getClassLoader());     // Catch: Exception -> L16
        int r6 = r5.getInt("androidx.media.MediaBrowserCompat.Extras.KEY_ROOT_CHILDREN_SUPPORTED_FLAGS", -1);     // Catch: Exception -> L16
        if (r6 < 0) goto L14;
        r5.remove("androidx.media.MediaBrowserCompat.Extras.KEY_ROOT_CHILDREN_SUPPORTED_FLAGS");     // Catch: Exception -> L16
        boolean r2 = true;
        if (r6 == 1) goto L13;
        r2 = false;
    L13:
        r5.putBoolean("androidx.media3.session.LibraryParams.Extras.KEY_ROOT_CHILDREN_BROWSABLE_ONLY", r2);     // Catch: Exception -> L16
    L14:
        Bundle r7 = Bundle.EMPTY;     // Catch: Exception -> L16
        return new jn2(r5, r5.getBoolean("android.service.media.extra.RECENT"), r5.getBoolean("android.service.media.extra.OFFLINE"), r5.getBoolean("android.service.media.extra.SUGGESTED"));
    L16:
        Bundle r8 = Bundle.EMPTY;
        return new jn2(r5, false, false, false);
    }

    public static pm2 i(gn2 r17, Bitmap r18) {
        if (r17.a.equals("") == false) goto L5;
        String r4 = null;
    L6:
        do2 r1 = r17.d;
        if (r18 == null) goto L9;
        Bitmap r8 = r18;
    L10:
        Bundle r3 = r1.I;
        CharSequence r5 = r1.a;
        CharSequence r6 = r1.g;
        CharSequence r7 = r1.f;
        yw1 r9 = r1.J;
        Integer r10 = r1.H;
        Integer r11 = r1.p;
        if (r3 == null) goto L14;
        r3 = new Bundle(r3);
    L14:
        if (r11 != null) goto L16;
    L18:
        boolean r15 = false;
    L19:
        if (r10 == null) goto L21;
        boolean r16 = true;
    L22:
        if (r15 == true) goto L26;
        if (r16 == true) goto L26;
        int r19 = 0;
    L34:
        if (r9.isEmpty() == true) goto L38;
        if (r3 != null) goto L37;
        r3 = new Bundle();
    L37:
        r3.putStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST", new ArrayList(r9));
    L38:
        CharSequence r12 = r1.e;
        if (r12 == null) goto L44;
        if (r3 != null) goto L42;
        r3 = new Bundle();
    L42:
        r3.putCharSequence("androidx.media3.mediadescriptioncompat.title", r5);
    L103:
        return new pm2(r4, r12, r7, r6, r8, r1.m, r3, r17.f.a);
    L44:
        int r13 = 3;
        CharSequence[] r14 = new CharSequence[3];
        int r110 = r19;
        int r111 = r110;
    L45:
        int r112 = 2;
        if (r110 >= r13) goto L101;
        String[] r2 = eo2.r;
        if (r111 >= r2.length) goto L101;
        int r20 = r111 + 1;
        String r21 = r2[r111];
        r21.getClass();
        switch(r21.hashCode()) {
            case -1853648227: goto L84;
            case -1850878751: goto L80;
            case -1224124471: goto L77;
            case 194702059: goto L73;
            case 1058837545: goto L69;
            case 1684534006: goto L65;
            case 1879671865: goto L61;
            case 1897146402: goto L57;
            case 1965214221: goto L53;
            default: goto L51;
        };
    L51:
        r112 = -1;
    L87:
        switch(r112) {
            case 0: goto L96;
            case 1: goto L88;
            case 2: goto L95;
            case 3: goto L94;
            case 4: goto L93;
            case 5: goto L92;
            case 6: goto L91;
            case 7: goto L90;
            case 8: goto L89;
            default: goto L88;
        };
    L88:
        CharSequence r22 = null;
    L98:
        if (TextUtils.isEmpty(r22) == true) goto L100;
        r14[r110] = r22;
        r110 = r110 + 1;
    L100:
        r111 = r20;
        r13 = 3;
        goto L45
    L89:
        r22 = r1.d;
        goto L98
    L90:
        r22 = r5;
        goto L98
    L91:
        r22 = r1.c;
        goto L98
    L92:
        r22 = r1.A;
        goto L98
    L93:
        r22 = r6;
        goto L98
    L94:
        r22 = r7;
        goto L98
    L95:
        r22 = r1.z;
        goto L98
    L96:
        r22 = r1.b;
        goto L98
    L53:
        if (r21.equals("android.media.metadata.ALBUM_ARTIST") == false) goto L51;
        r112 = 8;
        goto L87
    L57:
        if (r21.equals("android.media.metadata.TITLE") == false) goto L51;
        r112 = 7;
        goto L87
    L61:
        if (r21.equals("android.media.metadata.ALBUM") == false) goto L51;
        r112 = 6;
        goto L87
    L65:
        if (r21.equals("android.media.metadata.COMPOSER") == false) goto L51;
        r112 = 5;
        goto L87
    L69:
        if (r21.equals("android.media.metadata.DISPLAY_DESCRIPTION") == false) goto L51;
        r112 = 4;
        goto L87
    L73:
        if (r21.equals("android.media.metadata.DISPLAY_SUBTITLE") == false) goto L51;
        r112 = 3;
        goto L87
    L77:
        if (r21.equals("android.media.metadata.WRITER") == true) goto L87;
    L80:
        if (r21.equals("android.media.metadata.AUTHOR") == false) goto L51;
        r112 = 1;
        goto L87
    L84:
        if (r21.equals("android.media.metadata.ARTIST") == false) goto L51;
        r112 = r19;
    L101:
        r12 = r14[r19];
        r7 = r14[1];
        r6 = r14[2];
    L26:
        if (r3 != null) goto L28;
        r3 = new Bundle();
    L28:
        if (r15 == false) goto L30;
        r11.getClass();
        r19 = 0;
        r3.putLong("android.media.extra.BT_FOLDER_TYPE", e(r11.intValue()));
    L31:
        if (r16 == false) goto L34;
        r10.getClass();
        r3.putLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", r10.intValue());
        goto L34
    L30:
        r19 = 0;
        goto L31
    L21:
        r16 = false;
        goto L22
    L16:
        if (r11.intValue() == (-1)) goto L18;
        r15 = true;
        goto L19
    L9:
        r8 = null;
        goto L10
    L5:
        r4 = r17.a;
        goto L6
    }

    public static gn2 j(pm2 r10) {
        r10.getClass();
        String r0 = r10.n;
        um2 r1 = new um2();
        vw1 r2 = yw1.o;
        gy3 r3 = gy3.r;
        List r4 = Collections.EMPTY_LIST;
        zm2 r5 = new zm2();
        cn2 r6 = cn2.d;
        if (r0 != null) goto L5;
        r0 = "";
    L5:
        String r7 = r0;
        yc5 r8 = new yc5();
        r8.n = r10.v;
        cn2 r9 = new cn2(r8);
        do2 r11 = l(r10, 0);
        wm2 r12 = new wm2(r1);
        an2 r13 = new an2(r5);
        if (r11 != null) goto L10;
        r11 = do2.K;
    L10:
        return new gn2(r7, r12, null, r13, r11, r9);
    }

    public static gn2 k(String r11, eo2 r12, int r13) {
        um2 r0 = new um2();
        vw1 r1 = yw1.o;
        gy3 r2 = gy3.r;
        List r3 = Collections.EMPTY_LIST;
        gy3 r4 = gy3.r;
        zm2 r5 = new zm2();
        cn2 r6 = cn2.d;
        String r7 = null;
        if (r11 != null) goto L6;
        r11 = null;
    L6:
        CharSequence r8 = r12.n.getCharSequence("android.media.metadata.MEDIA_URI");
        if (r8 == null) goto L9;
        r7 = r8.toString();
    L9:
        if (r7 == null) goto L11;
        yc5 r9 = new yc5();
        r9.n = Uri.parse(r7);
        cn2 r10 = new cn2(r9);
    L12:
        do2 r14 = m(r12, r13);
        if (r11 == null) goto L15;
    L14:
        String r15 = r11;
        wm2 r16 = new wm2(r0);
        an2 r17 = new an2(r5);
        if (r14 != null) goto L21;
        r14 = do2.K;
    L21:
        return new gn2(r15, r16, null, r17, r14, r10);
    L15:
        r11 = "";
        goto L14
    L11:
        r10 = r6;
        goto L12
    }

    public static do2 l(pm2 r6, int r7) {
        if (r6 == null) goto L4;
        CharSequence r0 = r6.o;
        co2 r1 = new co2();
        r1.f = r6.p;
        r1.g = r6.q;
        r1.m = r6.t;
        Bundle r2 = null;
        switch(r7) {
            case 1: goto L8;
            case 2: goto L8;
            case 3: goto L8;
            case 4: goto L8;
            case 5: goto L8;
            case 6: goto L8;
            default: goto L7;
        };
    L7:
        mu3 r3 = null;
    L9:
        r1.i = q(r3);
        Bitmap r8 = r6.r;
        if (r8 != null) goto L13;
        byte[] r9 = null;
    L28:
        if (r9 == null) goto L30;
        r1.c(r9, 3);
    L30:
        Bundle r10 = r6.u;
        if (r10 == null) goto L34;
        r2 = new Bundle(r10);
    L34:
        if (r2 != null) goto L36;
    L38:
        r1.q = Boolean.FALSE;
        if (r2 != null) goto L41;
    L43:
        if (r2 != null) goto L45;
    L47:
        if (r2 != null) goto L49;
    L51:
        r1.a = r0;
    L52:
        if (r2 != null) goto L54;
    L56:
        r1.r = Boolean.TRUE;
        return new do2(r1);
    L54:
        if (r2.isEmpty() == true) goto L56;
        r1.H = r2;
        goto L56
    L49:
        if (r2.containsKey("androidx.media3.mediadescriptioncompat.title") == false) goto L51;
        r1.a = r2.getCharSequence("androidx.media3.mediadescriptioncompat.title");
        r1.e = r0;
        r2.remove("androidx.media3.mediadescriptioncompat.title");
        goto L52
    L45:
        if (r2.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST") == false) goto L47;
        ArrayList<String> r11 = r2.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST");
        r11.getClass();
        r1.I = yw1.k(yw1.k(r11));
        goto L47
    L41:
        if (r2.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT") == false) goto L43;
        r1.G = Integer.valueOf((int) r2.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
        r2.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        goto L43
    L36:
        if (r2.containsKey("android.media.extra.BT_FOLDER_TYPE") == false) goto L38;
        r1.p = Integer.valueOf(f(r2.getLong("android.media.extra.BT_FOLDER_TYPE")));
        r2.remove("android.media.extra.BT_FOLDER_TYPE");
        goto L38
    L13:
        if (r6.s == null) goto L60;
    L27:
        r9 = r6.s;
        goto L28
    L60:
        ByteArrayOutputStream r4 = new ByteArrayOutputStream();     // Catch: IOException -> L18
        r8.compress(Bitmap.CompressFormat.PNG, 0, r4);     // Catch: Throwable -> L20
        r6.s = r4.toByteArray();     // Catch: Throwable -> L20
        r4.close();     // Catch: IOException -> L18
        goto L27
    L20:
        th = move-exception;
        r4.close();     // Catch: Throwable -> L23
    L25:
        throw th;     // Catch: IOException -> L18
    L23:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L18
    L18:
        e = move-exception;
        l93.r0("MediaDescriptionCompat", "Failed to compress MediaDescriptionCompat artwork", e);
        goto L27
    L8:
        r3 = new mu3(r7, -1.0f);
        goto L9
    L4:
        return do2.K;
    }

    public static do2 m(eo2 r13, int r14) {
        if (r13 == null) goto L5;
        Bundle r2 = r13.n;
        co2 r3 = new co2();
        CharSequence r4 = r2.getCharSequence("android.media.metadata.DISPLAY_TITLE");
        if (r4 == null) goto L9;
        CharSequence r7 = r2.getCharSequence("android.media.metadata.DISPLAY_SUBTITLE");
        CharSequence r8 = r2.getCharSequence("android.media.metadata.DISPLAY_DESCRIPTION");
    L18:
        CharSequence r9 = r2.getCharSequence("android.media.metadata.TITLE");
        if (r9 != null) goto L22;
        r9 = r4;
    L22:
        r3.a = r9;
        r3.e = r4;
        r3.f = r7;
        r3.g = r8;
        r3.b = r2.getCharSequence("android.media.metadata.ARTIST");
        r3.c = r2.getCharSequence("android.media.metadata.ALBUM");
        r3.d = r2.getCharSequence("android.media.metadata.ALBUM_ARTIST");
        byte[] r10 = null;
        mu3 r5 = mu3.a(r2.getParcelable("android.media.metadata.RATING"));     // Catch: Exception -> L25
    L27:
        r3.j = q(r5);
        if (r2.containsKey("android.media.metadata.DURATION") == false) goto L102;
        long r11 = r13.a("android.media.metadata.DURATION");
        if (r11 < 0) goto L102;
        r3.d(Long.valueOf(r11));
    L102:
        mu3 r0 = mu3.a(r2.getParcelable("android.media.metadata.USER_RATING"));     // Catch: Exception -> L35
    L37:
        lu3 r1 = q(r0);
        if (r1 == null) goto L40;
        r3.i = r1;
    L45:
        if (r2.containsKey("android.media.metadata.YEAR") == false) goto L47;
        r3.s = Integer.valueOf((int) r13.a("android.media.metadata.YEAR"));
    L47:
        String[] r15 = {"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.ART_URI"};
        int r6 = 0;
    L48:
        if (r6 >= 3) goto L55;
        String r12 = r15[r6];
        if (r2.containsKey(r12) == true) goto L51;
        r6 = r6 + 1;
        goto L48
    L51:
        CharSequence r16 = r2.getCharSequence(r12);
        if (r16 == null) goto L55;
        String r17 = r16.toString();
    L56:
        if (r17 == null) goto L58;
        Uri r18 = Uri.parse(r17);
    L59:
        if (r18 == null) goto L61;
        r3.m = r18;
    L61:
        Bitmap r19 = r13.b();
        if (r19 != null) goto L65;
    L80:
        if (r10 == null) goto L82;
        r3.c(r10, 3);
    L82:
        boolean r20 = r2.containsKey("android.media.metadata.BT_FOLDER_TYPE");
        r3.q = Boolean.valueOf(r20);
        if (r20 == false) goto L86;
        r3.p = Integer.valueOf(f(r13.a("android.media.metadata.BT_FOLDER_TYPE")));
    L86:
        if (r2.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT") == false) goto L88;
        r3.G = Integer.valueOf((int) r13.a("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
    L88:
        r3.r = Boolean.TRUE;
        Bundle r110 = new Bundle(r2);
        o15 r111 = a.h();
    L90:
        if (r111.hasNext() == false) goto L93;
        r110.remove((String) r111.next());
        goto L90
    L93:
        if (r110.isEmpty() == true) goto L96;
        r3.H = r110;
    L96:
        return new do2(r3);
    L65:
        if (r13.p == null) goto L99;
    L79:
        r10 = r13.p;
        goto L80
    L99:
        ByteArrayOutputStream r21 = new ByteArrayOutputStream();     // Catch: IOException -> L70
        r19.compress(Bitmap.CompressFormat.PNG, 0, r21);     // Catch: Throwable -> L72
        r13.p = r21.toByteArray();     // Catch: Throwable -> L72
        r21.close();     // Catch: IOException -> L70
        goto L79
    L72:
        th = move-exception;
        r21.close();     // Catch: Throwable -> L75
    L77:
        throw th;     // Catch: IOException -> L70
    L75:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L70
    L70:
        e = move-exception;
        l93.r0("MediaMetadata", "Failed to compress MediaMetadataCompat artwork", e);
        goto L79
    L58:
        r18 = null;
    L55:
        r17 = null;
        goto L56
    L40:
        switch(r14) {
            case 1: goto L42;
            case 2: goto L42;
            case 3: goto L42;
            case 4: goto L42;
            case 5: goto L42;
            case 6: goto L42;
            default: goto L41;
        };
    L41:
        mu3 r22 = null;
    L43:
        r3.i = q(r22);
        goto L45
    L42:
        r22 = new mu3(r14, -1.0f);
    L35:
        e = move-exception;
        l93.r0("MediaMetadata", "Failed to retrieve a key as Rating.", e);
        r0 = null;
    L25:
        e = move-exception;
        l93.r0("MediaMetadata", "Failed to retrieve a key as Rating.", e);
        r5 = null;
        goto L27
    L9:
        CharSequence[] r23 = new CharSequence[3];
        int r24 = 0;
        int r25 = 0;
    L10:
        if (r24 >= 3) goto L17;
        String[] r26 = eo2.r;
        if (r25 >= r26.length) goto L17;
        int r112 = r25 + 1;
        CharSequence r27 = r2.getCharSequence(r26[r25]);
        if (TextUtils.isEmpty(r27) == true) goto L16;
        r23[r24] = r27;
        r24 = r24 + 1;
    L16:
        r25 = r112;
    L17:
        CharSequence r28 = r23[0];
        CharSequence r29 = r23[1];
        r8 = r23[2];
        r4 = r28;
        r7 = r29;
        goto L18
    L5:
        return do2.K;
    }

    public static eo2 n(do2 r6, String r7, Uri r8, long r9, Bitmap r11) {
        pz1 r0 = new pz1(7);
        r0.F("android.media.metadata.MEDIA_ID", r7);
        CharSequence r10 = r6.a;
        Bundle r1 = r6.I;
        Integer r2 = r6.p;
        Uri r3 = r6.m;
        if (r10 == null) goto L5;
        r0.G(r10, "android.media.metadata.TITLE");
    L5:
        CharSequence r12 = r6.e;
        if (r12 == null) goto L8;
        r0.G(r12, "android.media.metadata.DISPLAY_TITLE");
    L8:
        CharSequence r13 = r6.f;
        if (r13 == null) goto L11;
        r0.G(r13, "android.media.metadata.DISPLAY_SUBTITLE");
    L11:
        CharSequence r14 = r6.g;
        if (r14 == null) goto L14;
        r0.G(r14, "android.media.metadata.DISPLAY_DESCRIPTION");
    L14:
        CharSequence r15 = r6.b;
        if (r15 == null) goto L17;
        r0.G(r15, "android.media.metadata.ARTIST");
    L17:
        CharSequence r16 = r6.c;
        if (r16 == null) goto L20;
        r0.G(r16, "android.media.metadata.ALBUM");
    L20:
        CharSequence r17 = r6.d;
        if (r17 == null) goto L23;
        r0.G(r17, "android.media.metadata.ALBUM_ARTIST");
    L23:
        Integer r18 = r6.t;
        if (r18 == null) goto L26;
        r0.D("android.media.metadata.YEAR", r18.intValue());
    L26:
        CharSequence r19 = r6.z;
        if (r19 == null) goto L29;
        r0.G(r19, "android.media.metadata.WRITER");
    L29:
        CharSequence r20 = r6.A;
        if (r20 == null) goto L32;
        r0.G(r20, "android.media.metadata.COMPOSER");
    L32:
        if (r8 == null) goto L34;
        r0.F("android.media.metadata.MEDIA_URI", r8.toString());
    L34:
        if (r3 == null) goto L36;
        r0.F("android.media.metadata.DISPLAY_ICON_URI", r3.toString());
        r0.F("android.media.metadata.ALBUM_ART_URI", r3.toString());
        r0.F("android.media.metadata.ART_URI", r3.toString());
    L36:
        if (r11 == null) goto L38;
        r0.C("android.media.metadata.DISPLAY_ICON", r11);
        r0.C("android.media.metadata.ALBUM_ART", r11);
    L38:
        if (r2 == null) goto L43;
        if (r2.intValue() == (-1)) goto L43;
        r0.D("android.media.metadata.BT_FOLDER_TYPE", e(r2.intValue()));
    L43:
        if (r9 != (-9223372036854775807L)) goto L48;
        Long r110 = r6.h;
        if (r110 == null) goto L48;
        r9 = r110.longValue();
    L48:
        if (r9 != (-9223372036854775807L)) goto L51;
        r9 = -1;
    L51:
        r0.D("android.media.metadata.DURATION", r9);
        mu3 r21 = r(r6.i);
        if (r21 == null) goto L54;
        r0.E("android.media.metadata.USER_RATING", r21);
    L54:
        mu3 r22 = r(r6.j);
        if (r22 == null) goto L57;
        r0.E("android.media.metadata.RATING", r22);
    L57:
        Integer r23 = r6.H;
        if (r23 == null) goto L60;
        r0.D("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", r23.intValue());
    L60:
        if (r1 == null) goto L80;
        Iterator<String> r24 = r1.keySet().iterator();
    L63:
        if (r24.hasNext() == false) goto L80;
        String r25 = r24.next();
        Object r26 = r1.get(r25);
        if (r26 == null) goto L78;
        if ((r26 instanceof CharSequence) == true) goto L78;
        if ((r26 instanceof Byte) == true) goto L77;
        if ((r26 instanceof Short) == true) goto L77;
        if ((r26 instanceof Integer) == true) goto L77;
        if ((r26 instanceof Long) == false) goto L63;
    L77:
        r0.D(r25, ((Number) r26).longValue());
    L78:
        r0.G((CharSequence) r26, r25);
    L80:
        return new eo2((Bundle) r0.o);
    }

    public static PlaybackException o(ei3 r10, Context r11) {
        String r0 = null;
        if (r10 == null) goto L25;
        int r1 = r10.s;
        if (r10.n != 7) goto L25;
        CharSequence r2 = r10.t;
        if (r2 != null) goto L10;
        r2 = x(r11, t(r1));
    L10:
        Bundle r12 = r10.x;
        if (r2 == null) goto L13;
        r0 = r2.toString();
    L13:
        String r4 = r0;
        int r13 = t(r1);
        if (r13 != (-5)) goto L16;
        r13 = 2000;
    L17:
        int r6 = r13;
        if (r12 == null) goto L22;
    L21:
        Bundle r7 = r12;
        return new PlaybackException(r4, null, r6, r7, SystemClock.elapsedRealtime());
    L22:
        r12 = Bundle.EMPTY;
        goto L21
    L16:
        if (r13 != (-1)) goto L17;
        r13 = 1000;
    L25:
        return null;
    }

    public static int p(int r3) {
        if (r3 == 0) goto L11;
        int r1 = 1;
        if (r3 == 1) goto L10;
        r1 = 2;
        if (r3 == 2) goto L10;
        l93.q0("LegacyConversions", "Unrecognized RepeatMode: " + r3 + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
        return 0;
    L10:
        return r1;
    L11:
        return 0;
    }

    public static lu3 q(mu3 r6) {
        if (r6 == null) goto L59;
        float r0 = r6.o;
        int r1 = r6.n;
        boolean r2 = true;
        switch(r1) {
            case 1: goto L49;
            case 2: goto L38;
            case 3: goto L32;
            case 4: goto L26;
            case 5: goto L20;
            case 6: goto L9;
            default: goto L6;
        };
    L6:
        return null;
    L9:
        if (r6.c() == false) goto L18;
        if (r1 == 6) goto L13;
    L14:
        r0 = -1.0f;
    L16:
        return new jf3(r0);
    L13:
        if (r6.c() == true) goto L16;
    L18:
        return new jf3();
    L20:
        if (r6.c() == false) goto L24;
        return new xk4(5, r6.b());
    L24:
        return new xk4(5);
    L26:
        if (r6.c() == false) goto L30;
        return new xk4(4, r6.b());
    L30:
        return new xk4(4);
    L32:
        if (r6.c() == false) goto L36;
        return new xk4(3, r6.b());
    L36:
        return new xk4(3);
    L38:
        if (r6.c() == false) goto L47;
        if (r1 == 2) goto L43;
    L41:
        r2 = false;
    L45:
        return new qt4(r2);
    L43:
        if (r0 != 1.0f) goto L41;
    L47:
        return new qt4();
    L49:
        if (r6.c() == false) goto L58;
        if (r1 == 1) goto L54;
    L52:
        r2 = false;
    L56:
        return new vl1(r2);
    L54:
        if (r0 != 1.0f) goto L52;
    L58:
        return new vl1();
    L59:
        return null;
    }

    public static mu3 r(lu3 r4) {
        if (r4 == null) goto L13;
        int r1 = w(r4);
        if (r4.b() == true) goto L11;
        switch(r1) {
            case 1: goto L10;
            case 2: goto L10;
            case 3: goto L10;
            case 4: goto L10;
            case 5: goto L10;
            case 6: goto L10;
            default: goto L8;
        };
    L8:
        return null;
    L10:
        return new mu3(r1, -1.0f);
    L11:
        float r2 = 0.0f;
        switch(r1) {
            case 1: goto L24;
            case 2: goto L19;
            case 3: goto L17;
            case 4: goto L17;
            case 5: goto L17;
            case 6: goto L15;
            default: goto L13;
        };
    L15:
        return mu3.d(((jf3) r4).b);
    L17:
        return mu3.e(r1, ((xk4) r4).c);
    L19:
        if (((qt4) r4).c == false) goto L22;
        r2 = 1.0f;
    L22:
        return new mu3(2, r2);
    L24:
        if (((vl1) r4).c == false) goto L27;
        r2 = 1.0f;
    L27:
        return new mu3(1, r2);
    L13:
        return null;
    }

    public static int s(int r3) {
        if (r3 == (-1)) goto L14;
        if (r3 == 0) goto L14;
        int r0 = 1;
        if (r3 == 1) goto L13;
        r0 = 2;
        if (r3 == 2) goto L13;
        if (r3 == 3) goto L13;
        l93.q0("LegacyConversions", "Unrecognized PlaybackStateCompat.RepeatMode: " + r3 + " was converted to `Player.REPEAT_MODE_OFF`");
        return 0;
    L13:
        return r0;
    L14:
        return 0;
    }

    public static int t(int r0) {
        switch(r0) {
            case 1: goto L25;
            case 2: goto L23;
            case 3: goto L21;
            case 4: goto L19;
            case 5: goto L17;
            case 6: goto L15;
            case 7: goto L13;
            case 8: goto L11;
            case 9: goto L9;
            case 10: goto L7;
            case 11: goto L5;
            default: goto L3;
        };
    L3:
        return -1;
    L5:
        return -109;
    L7:
        return 1;
    L9:
        return -107;
    L11:
        return -110;
    L13:
        return -106;
    L15:
        return -105;
    L17:
        return -104;
    L19:
        return -103;
    L21:
        return -102;
    L23:
        return -6;
    L25:
        return -2;
    }

    public static boolean u(int r2) {
        if (r2 == (-1)) goto L13;
        if (r2 != 0) goto L6;
        return false;
    L6:
        if (r2 != 1) goto L8;
    L12:
        return true;
    L8:
        if (r2 == 2) goto L12;
        kf2.n(f34.f(r2, "Unrecognized ShuffleMode: "));
        return false;
    L13:
        return false;
    }

    public static void v(ic2 r8) {
        /*  JADX ERROR: Simple mode code generation failed
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:361)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.codegen.MethodGen.generateSimpleCode(MethodGen.java:354)
            	at jadx.core.codegen.MethodGen.addSimpleMethodCode(MethodGen.java:316)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:279)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            */
        /*
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2 = 3000(0xbb8, double:1.482E-320)
            r4 = 0
            r5 = r2
        L8:
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L17 java.lang.InterruptedException -> L19
            r8.get(r5, r7)     // Catch: java.lang.Throwable -> L17 java.lang.InterruptedException -> L19
            if (r4 == 0) goto L16
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            r8.interrupt()
        L16:
            return
        L17:
            r8 = move-exception
            goto L2c
        L19:
            r4 = 1
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L17
            long r5 = r5 - r0
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 >= 0) goto L26
            long r5 = r2 - r5
            goto L8
        L26:
            java.util.concurrent.TimeoutException r8 = new java.util.concurrent.TimeoutException     // Catch: java.lang.Throwable -> L17
            r8.<init>()     // Catch: java.lang.Throwable -> L17
            throw r8     // Catch: java.lang.Throwable -> L17
        L2c:
            if (r4 == 0) goto L35
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L35:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f92.v(ic2):void");
    }

    public static int w(lu3 r1) {
        if ((r1 instanceof vl1) == false) goto L7;
        return 1;
    L7:
        if ((r1 instanceof qt4) == false) goto L11;
        return 2;
    L11:
        if ((r1 instanceof xk4) == false) goto L21;
        int r2 = ((xk4) r1).b;
        int r0 = 3;
        if (r2 == 3) goto L19;
        r0 = 4;
        if (r2 == 4) goto L19;
        r0 = 5;
        if (r2 == 5) goto L19;
        return 0;
    L19:
        return r0;
    L21:
        if ((r1 instanceof jf3) == false) goto L24;
        return 6;
    L24:
        return 0;
    }

    public static String x(Context r1, int r2) {
        if (r2 == (-100)) goto L50;
        if (r2 == 1) goto L48;
        if (r2 == (-6)) goto L46;
        if (r2 == (-5)) goto L44;
        if (r2 == (-4)) goto L42;
        if (r2 == (-3)) goto L40;
        if (r2 == (-2)) goto L38;
        switch(r2) {
            case -110: goto L36;
            case -109: goto L34;
            case -108: goto L32;
            case -107: goto L30;
            case -106: goto L28;
            case -105: goto L26;
            case -104: goto L24;
            case -103: goto L22;
            case -102: goto L20;
            default: goto L18;
        };
    L18:
        return r1.getString(R.string.error_message_fallback);
    L20:
        return r1.getString(R.string.error_message_authentication_expired);
    L22:
        return r1.getString(R.string.error_message_premium_account_required);
    L24:
        return r1.getString(R.string.error_message_concurrent_stream_limit);
    L26:
        return r1.getString(R.string.error_message_parental_control_restricted);
    L28:
        return r1.getString(R.string.error_message_not_available_in_region);
    L30:
        return r1.getString(R.string.error_message_skip_limit_reached);
    L32:
        return r1.getString(R.string.error_message_setup_required);
    L34:
        return r1.getString(R.string.error_message_end_of_playlist);
    L36:
        return r1.getString(R.string.error_message_content_already_playing);
    L38:
        return r1.getString(R.string.error_message_invalid_state);
    L40:
        return r1.getString(R.string.error_message_bad_value);
    L42:
        return r1.getString(R.string.error_message_permission_denied);
    L44:
        return r1.getString(R.string.error_message_io);
    L46:
        return r1.getString(R.string.error_message_not_supported);
    L48:
        return r1.getString(R.string.error_message_info_cancelled);
    L50:
        return r1.getString(R.string.error_message_disconnected);
    }

    public static boolean y(long r0, long r2) {
        if ((r0 & r2) == 0) goto L6;
        return true;
    L6:
        return false;
    }
}
