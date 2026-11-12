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
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f92 {
    public static final jx1 a;

    static {
        int i = jx1.p;
        Object[] objArr = new Object[32];
        objArr[0] = "android.media.metadata.TITLE";
        objArr[1] = "android.media.metadata.ARTIST";
        objArr[2] = "android.media.metadata.DURATION";
        objArr[3] = "android.media.metadata.ALBUM";
        objArr[4] = "android.media.metadata.AUTHOR";
        objArr[5] = "android.media.metadata.WRITER";
        System.arraycopy(new String[]{"android.media.metadata.COMPOSER", "android.media.metadata.COMPILATION", "android.media.metadata.DATE", "android.media.metadata.YEAR", "android.media.metadata.GENRE", "android.media.metadata.TRACK_NUMBER", "android.media.metadata.NUM_TRACKS", "android.media.metadata.DISC_NUMBER", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.ART", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.USER_RATING", "android.media.metadata.RATING", "android.media.metadata.DISPLAY_TITLE", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION", "android.media.metadata.DISPLAY_ICON", "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.MEDIA_ID", "android.media.metadata.MEDIA_URI", "android.media.metadata.BT_FOLDER_TYPE", "android.media.metadata.ADVERTISEMENT", "android.media.metadata.DOWNLOAD_STATUS", "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"}, 0, objArr, 6, 26);
        a = jx1.j(32, objArr);
    }

    public static ij2 a(gn2 gn2Var, Bitmap bitmap) {
        pm2 pm2VarI = i(gn2Var, bitmap);
        do2 do2Var = gn2Var.d;
        Boolean bool = do2Var.q;
        int i = (bool == null || !bool.booleanValue()) ? 0 : 1;
        Boolean bool2 = do2Var.r;
        if (bool2 != null && bool2.booleanValue()) {
            i |= 2;
        }
        return new ij2(pm2VarI, i);
    }

    public static long b(ei3 ei3Var, eo2 eo2Var, long j) {
        long j2 = ei3Var == null ? 0L : ei3Var.p;
        long jC = c(ei3Var, eo2Var, j);
        long jD = d(eo2Var);
        return jD == -9223372036854775807L ? Math.max(jC, j2) : f35.k(j2, jC, jD);
    }

    public static long c(ei3 ei3Var, eo2 eo2Var, long j) {
        if (ei3Var == null) {
            return 0L;
        }
        long jMax = ei3Var.o;
        if (ei3Var.n == 3) {
            Long lValueOf = j == -9223372036854775807L ? null : Long.valueOf(j);
            jMax = Math.max(0L, jMax + ((long) (ei3Var.q * (lValueOf != null ? lValueOf.longValue() : SystemClock.elapsedRealtime() - ei3Var.u))));
        }
        long j2 = jMax;
        long jD = d(eo2Var);
        return jD == -9223372036854775807L ? Math.max(0L, j2) : f35.k(j2, 0L, jD);
    }

    public static long d(eo2 eo2Var) {
        if (eo2Var == null || !eo2Var.n.containsKey("android.media.metadata.DURATION")) {
            return -9223372036854775807L;
        }
        long jA = eo2Var.a("android.media.metadata.DURATION");
        if (jA <= 0) {
            return -9223372036854775807L;
        }
        return jA;
    }

    public static long e(int i) {
        switch (i) {
            case 0:
                return 0L;
            case 1:
                return 1L;
            case 2:
                return 2L;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return 3L;
            case 4:
                return 4L;
            case 5:
                return 5L;
            case 6:
                return 6L;
            default:
                kf2.n(f34.f(i, "Unrecognized FolderType: "));
                return 0L;
        }
    }

    public static int f(long j) {
        if (j == 0) {
            return 0;
        }
        if (j == 1) {
            return 1;
        }
        if (j == 2) {
            return 2;
        }
        if (j == 3) {
            return 3;
        }
        if (j == 4) {
            return 4;
        }
        if (j == 5) {
            return 5;
        }
        return j == 6 ? 6 : 0;
    }

    public static int g(int i) {
        if (i == -110) {
            return 8;
        }
        if (i == -109) {
            return 11;
        }
        if (i == -6) {
            return 2;
        }
        if (i == -2) {
            return 1;
        }
        if (i == 1) {
            return 10;
        }
        switch (i) {
            case -107:
                return 9;
            case -106:
                return 7;
            case -105:
                return 6;
            case -104:
                return 5;
            case -103:
                return 4;
            case -102:
                return 3;
            default:
                return 0;
        }
    }

    public static jn2 h(MediaService mediaService, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        try {
            bundle.setClassLoader(mediaService.getClassLoader());
            int i = bundle.getInt("androidx.media.MediaBrowserCompat.Extras.KEY_ROOT_CHILDREN_SUPPORTED_FLAGS", -1);
            if (i >= 0) {
                bundle.remove("androidx.media.MediaBrowserCompat.Extras.KEY_ROOT_CHILDREN_SUPPORTED_FLAGS");
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                bundle.putBoolean("androidx.media3.session.LibraryParams.Extras.KEY_ROOT_CHILDREN_BROWSABLE_ONLY", z);
            }
            Bundle bundle2 = Bundle.EMPTY;
            return new jn2(bundle, bundle.getBoolean("android.service.media.extra.RECENT"), bundle.getBoolean("android.service.media.extra.OFFLINE"), bundle.getBoolean("android.service.media.extra.SUGGESTED"));
        } catch (Exception unused) {
            Bundle bundle3 = Bundle.EMPTY;
            return new jn2(bundle, false, false, false);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:51:0x00bf  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static pm2 i(gn2 gn2Var, Bitmap bitmap) {
        int i;
        CharSequence charSequence;
        String str = gn2Var.a.equals("") ? null : gn2Var.a;
        do2 do2Var = gn2Var.d;
        Bitmap bitmap2 = bitmap != null ? bitmap : null;
        Bundle bundle = do2Var.I;
        CharSequence charSequence2 = do2Var.a;
        CharSequence charSequence3 = do2Var.g;
        CharSequence charSequence4 = do2Var.f;
        yw1 yw1Var = do2Var.J;
        Integer num = do2Var.H;
        Integer num2 = do2Var.p;
        if (bundle != null) {
            bundle = new Bundle(bundle);
        }
        boolean z = (num2 == null || num2.intValue() == -1) ? false : true;
        boolean z2 = num != null;
        if (z || z2) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            if (z) {
                num2.getClass();
                i = 0;
                bundle.putLong("android.media.extra.BT_FOLDER_TYPE", e(num2.intValue()));
            } else {
                i = 0;
            }
            if (z2) {
                num.getClass();
                bundle.putLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", num.intValue());
            }
        } else {
            i = 0;
        }
        if (!yw1Var.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST", new ArrayList<>(yw1Var));
        }
        CharSequence charSequence5 = do2Var.e;
        if (charSequence5 != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putCharSequence("androidx.media3.mediadescriptioncompat.title", charSequence2);
        } else {
            int i2 = 3;
            CharSequence[] charSequenceArr = new CharSequence[3];
            int i3 = i;
            int i4 = i3;
            while (true) {
                int i5 = 2;
                if (i3 < i2) {
                    String[] strArr = eo2.r;
                    if (i4 < strArr.length) {
                        int i6 = i4 + 1;
                        String str2 = strArr[i4];
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -1853648227:
                                if (!str2.equals("android.media.metadata.ARTIST")) {
                                    i5 = -1;
                                } else {
                                    i5 = i;
                                }
                                break;
                            case -1850878751:
                                if (!str2.equals("android.media.metadata.AUTHOR")) {
                                    i5 = -1;
                                } else {
                                    i5 = 1;
                                }
                                break;
                            case -1224124471:
                                if (!str2.equals("android.media.metadata.WRITER")) {
                                    i5 = -1;
                                }
                                break;
                            case 194702059:
                                if (!str2.equals("android.media.metadata.DISPLAY_SUBTITLE")) {
                                    i5 = -1;
                                } else {
                                    i5 = 3;
                                }
                                break;
                            case 1058837545:
                                if (!str2.equals("android.media.metadata.DISPLAY_DESCRIPTION")) {
                                    i5 = -1;
                                } else {
                                    i5 = 4;
                                }
                                break;
                            case 1684534006:
                                if (!str2.equals("android.media.metadata.COMPOSER")) {
                                    i5 = -1;
                                } else {
                                    i5 = 5;
                                }
                                break;
                            case 1879671865:
                                if (!str2.equals("android.media.metadata.ALBUM")) {
                                    i5 = -1;
                                } else {
                                    i5 = 6;
                                }
                                break;
                            case 1897146402:
                                if (!str2.equals("android.media.metadata.TITLE")) {
                                    i5 = -1;
                                } else {
                                    i5 = 7;
                                }
                                break;
                            case 1965214221:
                                if (!str2.equals("android.media.metadata.ALBUM_ARTIST")) {
                                    i5 = -1;
                                } else {
                                    i5 = 8;
                                }
                                break;
                            default:
                                i5 = -1;
                                break;
                        }
                        switch (i5) {
                            case 0:
                                charSequence = do2Var.b;
                                break;
                            case 1:
                            default:
                                charSequence = null;
                                break;
                            case 2:
                                charSequence = do2Var.z;
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                charSequence = charSequence4;
                                break;
                            case 4:
                                charSequence = charSequence3;
                                break;
                            case 5:
                                charSequence = do2Var.A;
                                break;
                            case 6:
                                charSequence = do2Var.c;
                                break;
                            case 7:
                                charSequence = charSequence2;
                                break;
                            case 8:
                                charSequence = do2Var.d;
                                break;
                        }
                        if (!TextUtils.isEmpty(charSequence)) {
                            charSequenceArr[i3] = charSequence;
                            i3++;
                        }
                        i4 = i6;
                        i2 = 3;
                    }
                }
            }
            charSequence5 = charSequenceArr[i];
            charSequence4 = charSequenceArr[1];
            charSequence3 = charSequenceArr[2];
        }
        return new pm2(str, charSequence5, charSequence4, charSequence3, bitmap2, do2Var.m, bundle, gn2Var.f.a);
    }

    public static gn2 j(pm2 pm2Var) {
        pm2Var.getClass();
        String str = pm2Var.n;
        um2 um2Var = new um2();
        vw1 vw1Var = yw1.o;
        gy3 gy3Var = gy3.r;
        List list = Collections.EMPTY_LIST;
        zm2 zm2Var = new zm2();
        cn2 cn2Var = cn2.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        yc5 yc5Var = new yc5();
        yc5Var.n = pm2Var.v;
        cn2 cn2Var2 = new cn2(yc5Var);
        do2 do2VarL = l(pm2Var, 0);
        wm2 wm2Var = new wm2(um2Var);
        an2 an2Var = new an2(zm2Var);
        if (do2VarL == null) {
            do2VarL = do2.K;
        }
        return new gn2(str2, wm2Var, null, an2Var, do2VarL, cn2Var2);
    }

    public static gn2 k(String str, eo2 eo2Var, int i) {
        cn2 cn2Var;
        um2 um2Var = new um2();
        vw1 vw1Var = yw1.o;
        gy3 gy3Var = gy3.r;
        List list = Collections.EMPTY_LIST;
        gy3 gy3Var2 = gy3.r;
        zm2 zm2Var = new zm2();
        cn2 cn2Var2 = cn2.d;
        if (str == null) {
            str = null;
        }
        CharSequence charSequence = eo2Var.n.getCharSequence("android.media.metadata.MEDIA_URI");
        String string = charSequence != null ? charSequence.toString() : null;
        if (string != null) {
            yc5 yc5Var = new yc5();
            yc5Var.n = Uri.parse(string);
            cn2Var = new cn2(yc5Var);
        } else {
            cn2Var = cn2Var2;
        }
        do2 do2VarM = m(eo2Var, i);
        if (str == null) {
            str = "";
        }
        String str2 = str;
        wm2 wm2Var = new wm2(um2Var);
        an2 an2Var = new an2(zm2Var);
        if (do2VarM == null) {
            do2VarM = do2.K;
        }
        return new gn2(str2, wm2Var, null, an2Var, do2VarM, cn2Var);
    }

    public static do2 l(pm2 pm2Var, int i) {
        mu3 mu3Var;
        byte[] bArr;
        if (pm2Var == null) {
            return do2.K;
        }
        CharSequence charSequence = pm2Var.o;
        co2 co2Var = new co2();
        co2Var.f = pm2Var.p;
        co2Var.g = pm2Var.q;
        co2Var.m = pm2Var.t;
        switch (i) {
            case 1:
            case 2:
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
            case 4:
            case 5:
            case 6:
                mu3Var = new mu3(i, -1.0f);
                break;
            default:
                mu3Var = null;
                break;
        }
        co2Var.i = q(mu3Var);
        Bitmap bitmap = pm2Var.r;
        if (bitmap == null) {
            bArr = null;
        } else {
            if (pm2Var.s == null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                        pm2Var.s = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    l93.r0("MediaDescriptionCompat", "Failed to compress MediaDescriptionCompat artwork", e);
                }
            }
            bArr = pm2Var.s;
        }
        if (bArr != null) {
            co2Var.c(bArr, 3);
        }
        Bundle bundle = pm2Var.u;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : null;
        if (bundle2 != null && bundle2.containsKey("android.media.extra.BT_FOLDER_TYPE")) {
            co2Var.p = Integer.valueOf(f(bundle2.getLong("android.media.extra.BT_FOLDER_TYPE")));
            bundle2.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        co2Var.q = Boolean.FALSE;
        if (bundle2 != null && bundle2.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            co2Var.G = Integer.valueOf((int) bundle2.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle2.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle2 != null && bundle2.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST");
            stringArrayList.getClass();
            co2Var.I = yw1.k(yw1.k(stringArrayList));
        }
        if (bundle2 == null || !bundle2.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            co2Var.a = charSequence;
        } else {
            co2Var.a = bundle2.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            co2Var.e = charSequence;
            bundle2.remove("androidx.media3.mediadescriptioncompat.title");
        }
        if (bundle2 != null && !bundle2.isEmpty()) {
            co2Var.H = bundle2;
        }
        co2Var.r = Boolean.TRUE;
        return new do2(co2Var);
    }

    public static do2 m(eo2 eo2Var, int i) {
        CharSequence charSequence;
        CharSequence charSequence2;
        mu3 mu3VarA;
        mu3 mu3VarA2;
        mu3 mu3Var;
        String[] strArr;
        int i2;
        String string;
        if (eo2Var == null) {
            return do2.K;
        }
        Bundle bundle = eo2Var.n;
        co2 co2Var = new co2();
        CharSequence charSequence3 = bundle.getCharSequence("android.media.metadata.DISPLAY_TITLE");
        if (charSequence3 != null) {
            charSequence2 = bundle.getCharSequence("android.media.metadata.DISPLAY_SUBTITLE");
            charSequence = bundle.getCharSequence("android.media.metadata.DISPLAY_DESCRIPTION");
        } else {
            CharSequence[] charSequenceArr = new CharSequence[3];
            int i3 = 0;
            int i4 = 0;
            while (i3 < 3) {
                String[] strArr2 = eo2.r;
                if (i4 >= strArr2.length) {
                    break;
                }
                int i5 = i4 + 1;
                CharSequence charSequence4 = bundle.getCharSequence(strArr2[i4]);
                if (!TextUtils.isEmpty(charSequence4)) {
                    charSequenceArr[i3] = charSequence4;
                    i3++;
                }
                i4 = i5;
            }
            CharSequence charSequence5 = charSequenceArr[0];
            CharSequence charSequence6 = charSequenceArr[1];
            charSequence = charSequenceArr[2];
            charSequence3 = charSequence5;
            charSequence2 = charSequence6;
        }
        CharSequence charSequence7 = bundle.getCharSequence("android.media.metadata.TITLE");
        if (charSequence7 == null) {
            charSequence7 = charSequence3;
        }
        co2Var.a = charSequence7;
        co2Var.e = charSequence3;
        co2Var.f = charSequence2;
        co2Var.g = charSequence;
        co2Var.b = bundle.getCharSequence("android.media.metadata.ARTIST");
        co2Var.c = bundle.getCharSequence("android.media.metadata.ALBUM");
        co2Var.d = bundle.getCharSequence("android.media.metadata.ALBUM_ARTIST");
        byte[] bArr = null;
        try {
            mu3VarA = mu3.a(bundle.getParcelable("android.media.metadata.RATING"));
        } catch (Exception e) {
            l93.r0("MediaMetadata", "Failed to retrieve a key as Rating.", e);
            mu3VarA = null;
        }
        co2Var.j = q(mu3VarA);
        if (bundle.containsKey("android.media.metadata.DURATION")) {
            long jA = eo2Var.a("android.media.metadata.DURATION");
            if (jA >= 0) {
                co2Var.d(Long.valueOf(jA));
            }
        }
        try {
            mu3VarA2 = mu3.a(bundle.getParcelable("android.media.metadata.USER_RATING"));
            while (true) {
                if (i2 < 3) {
                    String str = strArr[i2];
                    if (bundle.containsKey(str)) {
                        CharSequence charSequence8 = bundle.getCharSequence(str);
                        if (charSequence8 != null) {
                            string = charSequence8.toString();
                        }
                    } else {
                        i2++;
                    }
                }
                string = null;
            }
        } catch (Exception e2) {
            l93.r0("MediaMetadata", "Failed to retrieve a key as Rating.", e2);
            mu3VarA2 = null;
        }
        lu3 lu3VarQ = q(mu3VarA2);
        if (lu3VarQ != null) {
            co2Var.i = lu3VarQ;
        } else {
            switch (i) {
                case 1:
                case 2:
                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                case 4:
                case 5:
                case 6:
                    mu3Var = new mu3(i, -1.0f);
                    break;
                default:
                    mu3Var = null;
                    break;
            }
            co2Var.i = q(mu3Var);
        }
        if (bundle.containsKey("android.media.metadata.YEAR")) {
            co2Var.s = Integer.valueOf((int) eo2Var.a("android.media.metadata.YEAR"));
        }
        strArr = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.ART_URI"};
        i2 = 0;
        Uri uri = string != null ? Uri.parse(string) : null;
        if (uri != null) {
            co2Var.m = uri;
        }
        Bitmap bitmapB = eo2Var.b();
        if (bitmapB != null) {
            if (eo2Var.p == null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        bitmapB.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                        eo2Var.p = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    l93.r0("MediaMetadata", "Failed to compress MediaMetadataCompat artwork", e3);
                }
            }
            bArr = eo2Var.p;
        }
        if (bArr != null) {
            co2Var.c(bArr, 3);
        }
        boolean zContainsKey = bundle.containsKey("android.media.metadata.BT_FOLDER_TYPE");
        co2Var.q = Boolean.valueOf(zContainsKey);
        if (zContainsKey) {
            co2Var.p = Integer.valueOf(f(eo2Var.a("android.media.metadata.BT_FOLDER_TYPE")));
        }
        if (bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            co2Var.G = Integer.valueOf((int) eo2Var.a("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
        }
        co2Var.r = Boolean.TRUE;
        Bundle bundle2 = new Bundle(bundle);
        o15 it = a.iterator();
        while (it.hasNext()) {
            bundle2.remove((String) it.next());
        }
        if (!bundle2.isEmpty()) {
            co2Var.H = bundle2;
        }
        return new do2(co2Var);
    }

    public static eo2 n(do2 do2Var, String str, Uri uri, long j, Bitmap bitmap) {
        Long l;
        pz1 pz1Var = new pz1(7);
        pz1Var.F("android.media.metadata.MEDIA_ID", str);
        CharSequence charSequence = do2Var.a;
        Bundle bundle = do2Var.I;
        Integer num = do2Var.p;
        Uri uri2 = do2Var.m;
        if (charSequence != null) {
            pz1Var.G(charSequence, "android.media.metadata.TITLE");
        }
        CharSequence charSequence2 = do2Var.e;
        if (charSequence2 != null) {
            pz1Var.G(charSequence2, "android.media.metadata.DISPLAY_TITLE");
        }
        CharSequence charSequence3 = do2Var.f;
        if (charSequence3 != null) {
            pz1Var.G(charSequence3, "android.media.metadata.DISPLAY_SUBTITLE");
        }
        CharSequence charSequence4 = do2Var.g;
        if (charSequence4 != null) {
            pz1Var.G(charSequence4, "android.media.metadata.DISPLAY_DESCRIPTION");
        }
        CharSequence charSequence5 = do2Var.b;
        if (charSequence5 != null) {
            pz1Var.G(charSequence5, "android.media.metadata.ARTIST");
        }
        CharSequence charSequence6 = do2Var.c;
        if (charSequence6 != null) {
            pz1Var.G(charSequence6, "android.media.metadata.ALBUM");
        }
        CharSequence charSequence7 = do2Var.d;
        if (charSequence7 != null) {
            pz1Var.G(charSequence7, "android.media.metadata.ALBUM_ARTIST");
        }
        Integer num2 = do2Var.t;
        if (num2 != null) {
            pz1Var.D("android.media.metadata.YEAR", num2.intValue());
        }
        CharSequence charSequence8 = do2Var.z;
        if (charSequence8 != null) {
            pz1Var.G(charSequence8, "android.media.metadata.WRITER");
        }
        CharSequence charSequence9 = do2Var.A;
        if (charSequence9 != null) {
            pz1Var.G(charSequence9, "android.media.metadata.COMPOSER");
        }
        if (uri != null) {
            pz1Var.F("android.media.metadata.MEDIA_URI", uri.toString());
        }
        if (uri2 != null) {
            pz1Var.F("android.media.metadata.DISPLAY_ICON_URI", uri2.toString());
            pz1Var.F("android.media.metadata.ALBUM_ART_URI", uri2.toString());
            pz1Var.F("android.media.metadata.ART_URI", uri2.toString());
        }
        if (bitmap != null) {
            pz1Var.C("android.media.metadata.DISPLAY_ICON", bitmap);
            pz1Var.C("android.media.metadata.ALBUM_ART", bitmap);
        }
        if (num != null && num.intValue() != -1) {
            pz1Var.D("android.media.metadata.BT_FOLDER_TYPE", e(num.intValue()));
        }
        if (j == -9223372036854775807L && (l = do2Var.h) != null) {
            j = l.longValue();
        }
        if (j == -9223372036854775807L) {
            j = -1;
        }
        pz1Var.D("android.media.metadata.DURATION", j);
        mu3 mu3VarR = r(do2Var.i);
        if (mu3VarR != null) {
            pz1Var.E("android.media.metadata.USER_RATING", mu3VarR);
        }
        mu3 mu3VarR2 = r(do2Var.j);
        if (mu3VarR2 != null) {
            pz1Var.E("android.media.metadata.RATING", mu3VarR2);
        }
        Integer num3 = do2Var.H;
        if (num3 != null) {
            pz1Var.D("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", num3.intValue());
        }
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj == null || (obj instanceof CharSequence)) {
                    pz1Var.G((CharSequence) obj, str2);
                } else if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                    pz1Var.D(str2, ((Number) obj).longValue());
                }
            }
        }
        return new eo2((Bundle) pz1Var.o);
    }

    public static PlaybackException o(ei3 ei3Var, Context context) {
        if (ei3Var != null) {
            int i = ei3Var.s;
            if (ei3Var.n == 7) {
                CharSequence charSequenceX = ei3Var.t;
                if (charSequenceX == null) {
                    charSequenceX = x(context, t(i));
                }
                Bundle bundle = ei3Var.x;
                String string = charSequenceX != null ? charSequenceX.toString() : null;
                int iT = t(i);
                if (iT == -5) {
                    iT = 2000;
                } else if (iT == -1) {
                    iT = 1000;
                }
                int i2 = iT;
                if (bundle == null) {
                    bundle = Bundle.EMPTY;
                }
                return new PlaybackException(string, null, i2, bundle, SystemClock.elapsedRealtime());
            }
        }
        return null;
    }

    public static int p(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                l93.q0("LegacyConversions", "Unrecognized RepeatMode: " + i + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
                return 0;
            }
        }
        return i2;
    }

    public static lu3 q(mu3 mu3Var) {
        if (mu3Var == null) {
            return null;
        }
        float f = mu3Var.o;
        int i = mu3Var.n;
        switch (i) {
            case 1:
                if (mu3Var.c()) {
                    return new vl1(i == 1 && f == 1.0f);
                }
                return new vl1();
            case 2:
                if (mu3Var.c()) {
                    return new qt4(i == 2 && f == 1.0f);
                }
                return new qt4();
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return mu3Var.c() ? new xk4(3, mu3Var.b()) : new xk4(3);
            case 4:
                return mu3Var.c() ? new xk4(4, mu3Var.b()) : new xk4(4);
            case 5:
                return mu3Var.c() ? new xk4(5, mu3Var.b()) : new xk4(5);
            case 6:
                if (!mu3Var.c()) {
                    return new jf3();
                }
                if (i != 6 || !mu3Var.c()) {
                    f = -1.0f;
                }
                return new jf3(f);
            default:
                return null;
        }
    }

    public static mu3 r(lu3 lu3Var) {
        if (lu3Var != null) {
            int iW = w(lu3Var);
            if (!lu3Var.b()) {
                switch (iW) {
                    case 1:
                    case 2:
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                    case 4:
                    case 5:
                    case 6:
                        return new mu3(iW, -1.0f);
                    default:
                        return null;
                }
            }
            switch (iW) {
                case 1:
                    return new mu3(1, ((vl1) lu3Var).c ? 1.0f : 0.0f);
                case 2:
                    return new mu3(2, ((qt4) lu3Var).c ? 1.0f : 0.0f);
                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                case 4:
                case 5:
                    return mu3.e(iW, ((xk4) lu3Var).c);
                case 6:
                    return mu3.d(((jf3) lu3Var).b);
            }
        }
        return null;
    }

    public static int s(int i) {
        if (i == -1 || i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                l93.q0("LegacyConversions", "Unrecognized PlaybackStateCompat.RepeatMode: " + i + " was converted to `Player.REPEAT_MODE_OFF`");
                return 0;
            }
        }
        return i2;
    }

    public static int t(int i) {
        switch (i) {
            case 1:
                return -2;
            case 2:
                return -6;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return -102;
            case 4:
                return -103;
            case 5:
                return -104;
            case 6:
                return -105;
            case 7:
                return -106;
            case 8:
                return -110;
            case 9:
                return -107;
            case 10:
                return 1;
            case 11:
                return -109;
            default:
                return -1;
        }
    }

    public static boolean u(int i) {
        if (i == -1 || i == 0) {
            return false;
        }
        if (i == 1 || i == 2) {
            return true;
        }
        kf2.n(f34.f(i, "Unrecognized ShuffleMode: "));
        return false;
    }

    public static void v(ic2 ic2Var) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        long j = 3000;
        while (true) {
            try {
                try {
                    ic2Var.get(j, TimeUnit.MILLISECONDS);
                    if (z) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                } catch (InterruptedException unused) {
                    z = true;
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    if (jElapsedRealtime2 >= 3000) {
                        throw new TimeoutException();
                    }
                    j = 3000 - jElapsedRealtime2;
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
    }

    public static int w(lu3 lu3Var) {
        if (lu3Var instanceof vl1) {
            return 1;
        }
        if (lu3Var instanceof qt4) {
            return 2;
        }
        if (!(lu3Var instanceof xk4)) {
            return lu3Var instanceof jf3 ? 6 : 0;
        }
        int i = ((xk4) lu3Var).b;
        int i2 = 3;
        if (i != 3) {
            i2 = 4;
            if (i != 4) {
                i2 = 5;
                if (i != 5) {
                    return 0;
                }
            }
        }
        return i2;
    }

    public static String x(Context context, int i) {
        if (i == -100) {
            return context.getString(R.string.error_message_disconnected);
        }
        if (i == 1) {
            return context.getString(R.string.error_message_info_cancelled);
        }
        if (i == -6) {
            return context.getString(R.string.error_message_not_supported);
        }
        if (i == -5) {
            return context.getString(R.string.error_message_io);
        }
        if (i == -4) {
            return context.getString(R.string.error_message_permission_denied);
        }
        if (i == -3) {
            return context.getString(R.string.error_message_bad_value);
        }
        if (i == -2) {
            return context.getString(R.string.error_message_invalid_state);
        }
        switch (i) {
            case -110:
                return context.getString(R.string.error_message_content_already_playing);
            case -109:
                return context.getString(R.string.error_message_end_of_playlist);
            case -108:
                return context.getString(R.string.error_message_setup_required);
            case -107:
                return context.getString(R.string.error_message_skip_limit_reached);
            case -106:
                return context.getString(R.string.error_message_not_available_in_region);
            case -105:
                return context.getString(R.string.error_message_parental_control_restricted);
            case -104:
                return context.getString(R.string.error_message_concurrent_stream_limit);
            case -103:
                return context.getString(R.string.error_message_premium_account_required);
            case -102:
                return context.getString(R.string.error_message_authentication_expired);
            default:
                return context.getString(R.string.error_message_fallback);
        }
    }

    public static boolean y(long j, long j2) {
        return (j & j2) != 0;
    }
}
