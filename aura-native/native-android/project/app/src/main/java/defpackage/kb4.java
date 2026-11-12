package defpackage;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.homemusic.SmartPlan;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.Artist;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.ArtistWithAlbumsID3;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Directory;
import com.eddyizm.tempus.subsonic.models.Index;
import com.eddyizm.tempus.subsonic.models.Indexes;
import com.eddyizm.tempus.subsonic.models.MusicFolder;
import com.google.android.libraries.identity.googleid.GoogleIdTokenParsingException;
import com.google.gson.reflect.TypeToken;
import com.skydoves.colorpickerview.ColorPickerView;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class kb4 {
    public static final ca1 a = new ca1(26);
    public static final sp1 b = new sp1(1);
    public static final p61 c;
    public static final p61[] d;
    public static Boolean e;
    public static Boolean f;
    public static Boolean g;
    public static Boolean h;

    static {
        p61 p61Var = new p61("GET_CREDENTIAL", 1L);
        c = p61Var;
        d = new p61[]{p61Var, new p61("CREDENTIAL_REGISTRY", 1L), new p61("CLEAR_REGISTRY", 1L)};
    }

    public static int A(List list, InputStream inputStream, qj0 qj0Var) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new aw3(inputStream, qj0Var);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                int iB = ((wv1) list.get(i)).b(inputStream, qj0Var);
                inputStream.reset();
                if (iB != -1) {
                    return iB;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType B(List list, InputStream inputStream, qj0 qj0Var) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new aw3(inputStream, qj0Var);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeD = ((wv1) list.get(i)).d(inputStream);
                inputStream.reset();
                if (imageHeaderParser$ImageTypeD != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeD;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static ImageHeaderParser$ImageType C(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeA = ((wv1) list.get(i)).a(byteBuffer);
                AtomicReference atomicReference = vw.a;
                if (imageHeaderParser$ImageTypeA != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeA;
                }
            } catch (Throwable th) {
                AtomicReference atomicReference2 = vw.a;
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static ArrayList D(List list, ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            hashSet.add(((AlbumID3) obj).getId());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (hashSet.contains(((AlbumID3) obj2).getId())) {
                arrayList2.add(obj2);
            }
        }
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj3 = arrayList2.get(i);
            i++;
            if (hashSet2.add(((AlbumID3) obj3).getId())) {
                arrayList3.add(obj3);
            }
        }
        return arrayList3;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ea  */
    public static final Indexes E(Indexes indexes) {
        String strValueOf;
        String string;
        if (indexes != null && !O()) {
            return indexes;
        }
        ArrayList arrayListE = e(t());
        ArrayList arrayList = new ArrayList();
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            if (((jo1) obj).d != null) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            if (hashSet.add(((jo1) obj2).d)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(r40.k0(arrayList2, 10));
        int size3 = arrayList2.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            jo1 jo1Var = (jo1) obj3;
            arrayList3.add(new Artist(jo1Var.d, jo1Var.e, null, null, null, 28, null));
        }
        List listK0 = q40.K0(arrayList3, new ca1(25));
        Indexes indexes2 = new Indexes();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj4 : listK0) {
            String name = ((Artist) obj4).getName();
            if (name == null || (string = qm4.K0(name).toString()) == null) {
                strValueOf = "#";
            } else {
                Character chValueOf = string.length() == 0 ? null : Character.valueOf(string.charAt(0));
                if (chValueOf != null) {
                    char upperCase = Character.toUpperCase(chValueOf.charValue());
                    Character chValueOf2 = Character.isLetter(upperCase) ? Character.valueOf(upperCase) : null;
                    if (chValueOf2 == null || (strValueOf = String.valueOf(chValueOf2.charValue())) == null) {
                        strValueOf = "#";
                    }
                } else {
                    strValueOf = "#";
                }
            }
            Object arrayList4 = linkedHashMap.get(strValueOf);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(strValueOf, arrayList4);
            }
            ((List) arrayList4).add(obj4);
        }
        ArrayList arrayList5 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List<Artist> list = (List) entry.getValue();
            Index index = new Index();
            index.setName(str);
            index.setArtists(list);
            arrayList5.add(index);
        }
        indexes2.setIndices(arrayList5);
        return indexes2;
    }

    public static final boolean F(wv3 wv3Var, wv3 wv3Var2, wv3 wv3Var3, int i) {
        if (!G(i, wv3Var, wv3Var3)) {
            return false;
        }
        if (G(i, wv3Var2, wv3Var3) && !j(wv3Var3, wv3Var, wv3Var2, i)) {
            return !j(wv3Var3, wv3Var2, wv3Var, i) && H(i, wv3Var3, wv3Var) < H(i, wv3Var3, wv3Var2);
        }
        return true;
    }

    public static final boolean G(int i, wv3 wv3Var, wv3 wv3Var2) {
        if (i == 3) {
            float f2 = wv3Var2.c;
            float f3 = wv3Var2.a;
            float f4 = wv3Var.c;
            return (f2 > f4 || f3 >= f4) && f3 > wv3Var.a;
        }
        if (i == 4) {
            float f5 = wv3Var2.a;
            float f6 = wv3Var2.c;
            float f7 = wv3Var.a;
            return (f5 < f7 || f6 <= f7) && f6 < wv3Var.c;
        }
        if (i == 5) {
            float f8 = wv3Var2.d;
            float f9 = wv3Var2.b;
            float f10 = wv3Var.d;
            return (f8 > f10 || f9 >= f10) && f9 > wv3Var.b;
        }
        if (i != 6) {
            kf2.o("This function should only be used for 2-D focus search");
            return false;
        }
        float f11 = wv3Var2.b;
        float f12 = wv3Var2.d;
        float f13 = wv3Var.b;
        return (f11 < f13 || f12 <= f13) && f12 < wv3Var.d;
    }

    public static final long H(int i, wv3 wv3Var, wv3 wv3Var2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        if (i == 3) {
            f2 = wv3Var.a;
            f3 = wv3Var2.c;
        } else if (i == 4) {
            f2 = wv3Var2.a;
            f3 = wv3Var.c;
        } else if (i == 5) {
            f2 = wv3Var.b;
            f3 = wv3Var2.d;
        } else {
            if (i != 6) {
                kf2.o("This function should only be used for 2-D focus search");
                return 0L;
            }
            f2 = wv3Var2.b;
            f3 = wv3Var.d;
        }
        float f7 = f2 - f3;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        long j = (long) f7;
        if (i == 3 || i == 4) {
            float f8 = wv3Var.b;
            f4 = ((wv3Var.d - f8) / 2.0f) + f8;
            f5 = wv3Var2.b;
            f6 = wv3Var2.d;
        } else {
            if (i != 5 && i != 6) {
                kf2.o("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f9 = wv3Var.a;
            f4 = ((wv3Var.c - f9) / 2.0f) + f9;
            f5 = wv3Var2.a;
            f6 = wv3Var2.c;
        }
        long j2 = (long) (f4 - (((f6 - f5) / 2.0f) + f5));
        return (j2 * j2) + (13 * j * j);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0031  */
    /* JADX WARN: Code duplicated, block: B:26:0x003b  */
    public static boolean I(k14 k14Var, oz3 oz3Var) {
        String strA;
        oz3Var.getClass();
        int i = k14Var.q;
        if (i != 200 && i != 410 && i != 414 && i != 501 && i != 203 && i != 204) {
            if (i == 307) {
                strA = k14Var.s.a("Expires");
                if (strA == null) {
                    strA = null;
                }
                if (strA == null && k14Var.b().c == -1 && !k14Var.b().f && !k14Var.b().e) {
                    return false;
                }
            } else if (i != 308 && i != 404 && i != 405) {
                switch (i) {
                    case 300:
                    case 301:
                        break;
                    case 302:
                        strA = k14Var.s.a("Expires");
                        if (strA == null) {
                            strA = null;
                        }
                        if (strA == null) {
                            return false;
                        }
                        break;
                    default:
                        return false;
                }
            }
        }
        if (k14Var.b().b) {
            return false;
        }
        ix ixVarO = oz3Var.f;
        if (ixVarO == null) {
            int i2 = ix.n;
            ixVarO = au0.O(oz3Var.c);
            oz3Var.f = ixVarO;
        }
        return !ixVarO.b;
    }

    public static boolean J(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (e == null) {
            e = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        e.booleanValue();
        if (f == null) {
            f = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (!f.booleanValue()) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        return i < 26 || i >= 30;
    }

    public static LinkedHashSet K(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(lg2.W(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && h12.c(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static final List L(List list) {
        Object s14Var;
        SharedPreferences sharedPreferences = App.a().getSharedPreferences("homemusic_offline", 0);
        if (list != null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            rr1 rr1Var = rr1.a;
            editorEdit.putString("music_folders", rr1.c.j(list)).apply();
            return list;
        }
        String string = sharedPreferences.getString("music_folders", null);
        if (string == null) {
            return null;
        }
        try {
            rr1 rr1Var2 = rr1.a;
            s14Var = (List) rr1.c.f(string, new TypeToken<List<? extends MusicFolder>>() { // from class: com.eddyizm.tempus.homemusic.HomeOffline$musicFolders$1$1
            }.getType());
        } catch (Throwable th) {
            s14Var = new s14(th);
        }
        return (List) (s14Var instanceof s14 ? null : s14Var);
    }

    public static String M(Context context) {
        context.getClass();
        String string = context.getSharedPreferences("lan-playback", 0).getString("name", Build.MODEL);
        string.getClass();
        return qm4.J0(40, string);
    }

    public static final void N(ba2 ba2Var, Runnable runnable) {
        ba2Var.getClass();
        fx3 fx3Var = new fx3();
        fx3Var.n = true;
        ss0 ss0VarW = AppDatabase.y().w();
        ((s24) ss0VarW.n).i().a(new String[]{"download"}, new os0(ss0VarW, 1)).e(ba2Var, new wd1(new o(11, fx3Var, runnable), 3));
    }

    public static boolean O() {
        return !cx.h();
    }

    public static ArrayList P(List list, List list2) {
        list.getClass();
        HashSet hashSet = new HashSet();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String id = ((Child) it.next()).getId();
            if (id != null) {
                hashSet.add(id);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.contains(((Child) obj).getId())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static LinkedHashSet Q(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(lg2.W(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static final boolean R(int i, dd0 dd0Var, ba1 ba1Var, wv3 wv3Var) {
        ba1 ba1VarU;
        f13 f13Var = new f13(new ba1[16]);
        if (!ba1Var.n.A) {
            cz1.b("visitChildren called on an unattached node");
        }
        f13 f13Var2 = new f13(new cx2[16]);
        cx2 cx2Var = ba1Var.n;
        cx2 cx2Var2 = cx2Var.s;
        if (cx2Var2 == null) {
            j51.b(f13Var2, cx2Var);
        } else {
            f13Var2.b(cx2Var2);
        }
        while (true) {
            int i2 = f13Var2.p;
            if (i2 == 0) {
                break;
            }
            cx2 cx2VarC = (cx2) f13Var2.k(i2 - 1);
            if ((cx2VarC.q & 1024) == 0) {
                j51.b(f13Var2, cx2VarC);
            } else {
                while (cx2VarC != null) {
                    if ((cx2VarC.p & 1024) != 0) {
                        f13 f13Var3 = null;
                        while (cx2VarC != null) {
                            if (cx2VarC instanceof ba1) {
                                ba1 ba1Var2 = (ba1) cx2VarC;
                                if (ba1Var2.A) {
                                    f13Var.b(ba1Var2);
                                }
                            } else if ((cx2VarC.p & 1024) != 0 && (cx2VarC instanceof fo0)) {
                                int i3 = 0;
                                for (cx2 cx2Var3 = ((fo0) cx2VarC).C; cx2Var3 != null; cx2Var3 = cx2Var3.s) {
                                    if ((cx2Var3.p & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            cx2VarC = cx2Var3;
                                        } else {
                                            if (f13Var3 == null) {
                                                f13Var3 = new f13(new cx2[16]);
                                            }
                                            if (cx2VarC != null) {
                                                f13Var3.b(cx2VarC);
                                                cx2VarC = null;
                                            }
                                            f13Var3.b(cx2Var3);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            cx2VarC = j51.c(f13Var3);
                        }
                        break;
                    }
                    cx2VarC = cx2VarC.s;
                }
            }
        }
        while (f13Var.p != 0 && (ba1VarU = u(f13Var, wv3Var, i)) != null) {
            if (ba1VarU.s0().a) {
                return ((Boolean) dd0Var.invoke(ba1VarU)).booleanValue();
            }
            if (x(i, dd0Var, ba1VarU, wv3Var)) {
                return true;
            }
            f13Var.j(ba1VarU);
        }
        return false;
    }

    public static Set S(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        setSingleton.getClass();
        return setSingleton;
    }

    public static final void T(df dfVar) {
        om0 om0Var;
        su3 rb5Var;
        su3 rb5Var2;
        su3 rb5Var3;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            om0Var = new om0(18);
        } else {
            om0Var = i >= 26 ? new om0(17) : new om0(16);
        }
        Window window = dfVar.getWindow();
        window.getClass();
        View viewFindViewById = dfVar.findViewById(R.id.content);
        viewFindViewById.getClass();
        Resources.Theme theme = dfVar.getTheme();
        theme.getClass();
        switch (om0Var.n) {
            case WaveRetry.MAX_FAILURES /* 16 */:
                l93.d0(window, false);
                Resources resources = viewFindViewById.getResources();
                ThreadLocal threadLocal = g14.a;
                window.setStatusBarColor(resources.getColor(R.color.transparent, theme));
                om1 om1Var = new om1(viewFindViewById);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 35) {
                    rb5Var = new tb5(window, om1Var);
                } else if (i2 >= 30) {
                    rb5Var = new sb5(window, om1Var);
                } else {
                    rb5Var = i2 >= 26 ? new rb5(window, om1Var) : new qb5(window, om1Var);
                }
                rb5Var.D(true);
                window.addFlags(134217728);
                break;
            case 17:
                l93.d0(window, false);
                Resources resources2 = viewFindViewById.getResources();
                ThreadLocal threadLocal2 = g14.a;
                int color = resources2.getColor(R.color.transparent, theme);
                int color2 = resources2.getColor(app.homemusic.R.color.navigation_bar_scrim_light, theme);
                window.setStatusBarColor(color);
                window.setNavigationBarColor(color2);
                om1 om1Var2 = new om1(viewFindViewById);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 35) {
                    rb5Var2 = new tb5(window, om1Var2);
                } else if (i3 >= 30) {
                    rb5Var2 = new sb5(window, om1Var2);
                } else {
                    rb5Var2 = i3 >= 26 ? new rb5(window, om1Var2) : new qb5(window, om1Var2);
                }
                rb5Var2.D(true);
                rb5Var2.C(true);
                break;
            default:
                l93.d0(window, false);
                Resources resources3 = viewFindViewById.getResources();
                ThreadLocal threadLocal3 = g14.a;
                int color3 = resources3.getColor(R.color.transparent, theme);
                boolean z = (resources3.getConfiguration().uiMode & 48) == 32;
                window.setStatusBarColor(color3);
                window.setNavigationBarColor(color3);
                om1 om1Var3 = new om1(viewFindViewById);
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 35) {
                    rb5Var3 = new tb5(window, om1Var3);
                } else if (i4 >= 30) {
                    rb5Var3 = new sb5(window, om1Var3);
                } else {
                    rb5Var3 = i4 >= 26 ? new rb5(window, om1Var3) : new qb5(window, om1Var3);
                }
                boolean z2 = !z;
                rb5Var3.D(z2);
                rb5Var3.C(z2);
                break;
        }
    }

    public static final List U(List list) {
        list.getClass();
        return !O() ? list : P(list, t());
    }

    public static final long V(String str, long j, long j2, long j3) {
        String property;
        int i = eq4.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lM0 = xm4.m0(property);
        if (lM0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lM0.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int W(String str, int i, int i2) {
        return (int) V(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final void X(Object obj) {
        if (obj instanceof s14) {
            throw ((s14) obj).n;
        }
    }

    public static AlbumID3 Y(jo1 jo1Var) {
        String str = jo1Var.a;
        Child child = jo1Var.c;
        String album = child.getAlbum();
        String str2 = jo1Var.e;
        String str3 = jo1Var.d;
        String coverArtId = child.getCoverArtId();
        List list = jo1Var.b;
        Integer numValueOf = Integer.valueOf(list.size());
        Iterator it = list.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            Integer duration = ((Child) it.next()).getDuration();
            iIntValue += duration != null ? duration.intValue() : 0;
        }
        Integer numValueOf2 = Integer.valueOf(iIntValue);
        Date created = child.getCreated();
        Integer year = child.getYear();
        return new AlbumID3(str, album, str2, str3, coverArtId, numValueOf, numValueOf2, null, created, null, year != null ? year.intValue() : 0, child.getGenre(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67105408, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [u01] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static final List Z(String str, List list) {
        if (list != null && !O()) {
            return list;
        }
        List listT = t();
        List arrayList = u01.n;
        List r9 = list;
        if (list == null) {
            r9 = arrayList;
        }
        ArrayList arrayListP = P(r9, listT);
        boolean zIsEmpty = arrayListP.isEmpty();
        List r10 = arrayListP;
        if (zIsEmpty) {
            if (str != null && !qm4.u0(str)) {
                ArrayList arrayListE = e(listT);
                arrayList = new ArrayList();
                int size = arrayListE.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListE.get(i);
                    i++;
                    jo1 jo1Var = (jo1) obj;
                    List list2 = jo1Var.b;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list2) {
                        if (str.equalsIgnoreCase(((Child) obj2).getArtist()) || str.equalsIgnoreCase(jo1Var.e)) {
                            arrayList2.add(obj2);
                        }
                    }
                    v40.n0(arrayList2, arrayList);
                }
            }
            r10 = arrayList;
        }
        return new ArrayList((Collection) r10);
    }

    public static final List a(int i, ArrayList arrayList) {
        return (arrayList == null || O()) ? new ArrayList(q40.L0(q40.u0(c("alphabeticalByName", 0, null, null, arrayList, t()), i), SmartPlan.MAX_QUEUE)) : arrayList;
    }

    public static Set a0(Context context) {
        context.getClass();
        Set<String> stringSet = context.getSharedPreferences("lan-playback", 0).getStringSet("trusted", z01.n);
        stringSet.getClass();
        return q40.T0(stringSet);
    }

    public static final List b(String str, int i, Integer num, Integer num2, List list) {
        return (list == null || O()) ? new ArrayList(c(str, i, num, num2, list, t())) : list;
    }

    public static final Boolean b0(int i, dd0 dd0Var, ba1 ba1Var, wv3 wv3Var) {
        int iOrdinal = ba1Var.v0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ba1 ba1VarS = te5.s(ba1Var);
                if (ba1VarS == null) {
                    kf2.o("ActiveParent must have a focusedChild");
                    return null;
                }
                int iOrdinal2 = ba1VarS.v0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolB0 = b0(i, dd0Var, ba1VarS, wv3Var);
                        if (!h12.c(boolB0, Boolean.FALSE)) {
                            return boolB0;
                        }
                        if (wv3Var == null) {
                            if (ba1VarS.v0() != z91.o) {
                                kf2.o("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            ba1 ba1VarP = te5.p(ba1VarS);
                            if (ba1VarP == null) {
                                kf2.o("ActiveParent must have a focusedChild");
                                return null;
                            }
                            wv3Var = te5.r(ba1VarP);
                        }
                        return Boolean.valueOf(x(i, dd0Var, ba1Var, wv3Var));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            er1.n();
                            return null;
                        }
                        kf2.o("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (wv3Var == null) {
                    wv3Var = te5.r(ba1VarS);
                }
                return Boolean.valueOf(x(i, dd0Var, ba1Var, wv3Var));
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    er1.n();
                    return null;
                }
                if (ba1Var.s0().a) {
                    return (Boolean) dd0Var.invoke(ba1Var);
                }
                return wv3Var == null ? Boolean.valueOf(v(ba1Var, i, dd0Var)) : Boolean.valueOf(R(i, dd0Var, ba1Var, wv3Var));
            }
        }
        return Boolean.valueOf(v(ba1Var, i, dd0Var));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:63:0x0157  */
    /* JADX WARN: Code duplicated, block: B:64:0x015c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x015e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0163  */
    /*  JADX ERROR: UnsupportedOperationException in pass: SwitchBreakVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1068)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$BaseSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:210)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$IterativeSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:177)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor.runSwitchTraverse(SwitchBreakVisitor.java:52)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor.visit(SwitchBreakVisitor.java:45)
        */
    public static java.util.List c(java.lang.String r7, int r8, java.lang.Integer r9, java.lang.Integer r10, java.util.List r11, java.util.List r12) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb4.c(java.lang.String, int, java.lang.Integer, java.lang.Integer, java.util.List, java.util.List):java.util.List");
    }

    public static byte[] c0(byte[]... bArr) {
        int i = 0;
        int length = 0;
        while (true) {
            if (i >= bArr.length) {
                break;
            }
            length += bArr[i].length;
            i++;
        }
        byte[] bArr2 = new byte[length];
        int i2 = 0;
        for (byte[] bArr3 : bArr) {
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i2, length2);
            i2 += length2;
        }
        return bArr2;
    }

    public static final List d(String str, List list) {
        Object obj;
        list.getClass();
        if (!list.isEmpty() && !O()) {
            return list;
        }
        List listT = t();
        if (!list.isEmpty()) {
            return P(list, listT);
        }
        if (str != null) {
            ArrayList arrayListE = e(listT);
            int size = arrayListE.size();
            int i = 0;
            do {
                if (i >= size) {
                    obj = null;
                    break;
                }
                obj = arrayListE.get(i);
                i++;
            } while (!((jo1) obj).a.equals(str));
            jo1 jo1Var = (jo1) obj;
            if (jo1Var != null) {
                return jo1Var.b;
            }
        }
        return u01.n;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    public static ArrayList e(List list) {
        String parentId;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((Child) obj).isDir()) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        byte b2 = 0;
        int i = 0;
        while (true) {
            String str = null;
            if (i >= size) {
                break;
            }
            Object obj2 = arrayList.get(i);
            i++;
            Child child = (Child) obj2;
            String albumId = child.getAlbumId();
            if (albumId == null) {
                parentId = child.getParentId();
                if (parentId != null && !qm4.u0(parentId)) {
                    str = parentId;
                }
            } else {
                if (qm4.u0(albumId)) {
                    albumId = null;
                }
                if (albumId == null) {
                    parentId = child.getParentId();
                    if (parentId != null) {
                        str = parentId;
                    }
                } else {
                    str = albumId;
                }
            }
            Object arrayList2 = linkedHashMap.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(str, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            jo1 jo1Var = str2 != null ? new jo1(str2, q40.K0((List) entry.getValue(), new w60(1, new if1[]{new k2(21, b2), new k2(22, b2), new k2(23, b2)}))) : null;
            if (jo1Var != null) {
                arrayList3.add(jo1Var);
            }
        }
        return arrayList3;
    }

    public static Point f(ColorPickerView colorPickerView, Point point, Point point2) {
        if (((int) Math.sqrt((Math.abs(point2.y - point.y) * Math.abs(point2.y - point.y)) + (Math.abs(point2.x - point.x) * Math.abs(point2.x - point.x)))) <= 3) {
            return point2;
        }
        Point point3 = new Point((point2.x + point.x) / 2, (point2.y + point.y) / 2);
        return Color.alpha(colorPickerView.d((float) point3.x, (float) point3.y)) == 0 ? f(colorPickerView, point3, point2) : f(colorPickerView, point, point3);
    }

    public static final ArtistID3 g(String str, ArtistWithAlbumsID3 artistWithAlbumsID3) {
        List<AlbumID3> listG0;
        Object obj;
        String name;
        String coverArtId;
        Child child;
        if (artistWithAlbumsID3 != null && !O()) {
            return artistWithAlbumsID3;
        }
        List listT = t();
        if (str == null) {
            return artistWithAlbumsID3;
        }
        ArrayList arrayListE = e(listT);
        ArrayList arrayList = new ArrayList();
        int size = arrayListE.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayListE.get(i2);
            i2++;
            jo1 jo1Var = (jo1) obj2;
            if (!h12.c(jo1Var.d, str)) {
                List list = jo1Var.b;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (h12.c(((Child) it.next()).getArtistId(), str)) {
                        }
                    }
                }
            }
            arrayList.add(obj2);
        }
        if (artistWithAlbumsID3 == null && arrayList.isEmpty()) {
            return null;
        }
        ArtistWithAlbumsID3 artistWithAlbumsID4 = artistWithAlbumsID3 != null ? artistWithAlbumsID3 : null;
        u01 u01Var = u01.n;
        if (artistWithAlbumsID4 != null) {
            List<AlbumID3> albums = artistWithAlbumsID4.getAlbums();
            if (albums == null) {
                albums = u01Var;
            }
            List<AlbumID3> appearsOn = artistWithAlbumsID4.getAppearsOn();
            if (appearsOn == null) {
                appearsOn = u01Var;
            }
            listG0 = q40.G0(albums, appearsOn);
        } else {
            listG0 = null;
        }
        if (listG0 == null) {
            listG0 = u01Var;
        }
        int iW = lg2.W(r40.k0(listG0, 10));
        if (iW < 16) {
            iW = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
        for (Object obj3 : listG0) {
            linkedHashMap.put(((AlbumID3) obj3).getId(), obj3);
        }
        int size2 = arrayList.size();
        int i3 = 0;
        do {
            if (i3 >= size2) {
                obj = null;
                break;
            }
            obj = arrayList.get(i3);
            i3++;
        } while (!h12.c(((jo1) obj).d, str));
        jo1 jo1Var2 = (jo1) obj;
        if (jo1Var2 == null) {
            jo1Var2 = (jo1) q40.x0(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(r40.k0(arrayList, 10));
        int size3 = arrayList.size();
        while (i < size3) {
            Object obj4 = arrayList.get(i);
            i++;
            jo1 jo1Var3 = (jo1) obj4;
            AlbumID3 albumID3Y = (AlbumID3) linkedHashMap.get(jo1Var3.a);
            if (albumID3Y == null) {
                albumID3Y = Y(jo1Var3);
            }
            arrayList2.add(albumID3Y);
        }
        ArtistWithAlbumsID3 artistWithAlbumsID5 = new ArtistWithAlbumsID3(arrayList2, u01Var);
        artistWithAlbumsID5.setId(str);
        if (artistWithAlbumsID3 == null || (name = artistWithAlbumsID3.getName()) == null) {
            name = jo1Var2 != null ? jo1Var2.e : null;
        }
        artistWithAlbumsID5.setName(name);
        if (artistWithAlbumsID3 == null || (coverArtId = artistWithAlbumsID3.getCoverArtId()) == null) {
            coverArtId = (jo1Var2 == null || (child = jo1Var2.c) == null) ? null : child.getCoverArtId();
        }
        artistWithAlbumsID5.setCoverArtId(coverArtId);
        artistWithAlbumsID5.setAlbumCount(arrayList.size());
        artistWithAlbumsID5.setStarred(artistWithAlbumsID3 != null ? artistWithAlbumsID3.getStarred() : null);
        return artistWithAlbumsID5;
    }

    public static final List h(ArrayList arrayList) {
        if (arrayList != null && !O()) {
            return arrayList;
        }
        List listT = t();
        Iterable iterable = arrayList;
        if (arrayList == null) {
            iterable = u01.n;
        }
        int iW = lg2.W(r40.k0(iterable, 10));
        if (iW < 16) {
            iW = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
        for (Object obj : iterable) {
            linkedHashMap.put(((ArtistID3) obj).getId(), obj);
        }
        ArrayList arrayListE = e(listT);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayListE.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayListE.get(i2);
            i2++;
            if (((jo1) obj2).d != null) {
                arrayList2.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj3 = arrayList2.get(i);
            i++;
            String str = ((jo1) obj3).d;
            str.getClass();
            Object arrayList3 = linkedHashMap2.get(str);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap2.put(str, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        ArrayList arrayList4 = new ArrayList(linkedHashMap2.size());
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            String str2 = (String) entry.getKey();
            List list = (List) entry.getValue();
            ArtistID3 artistID3 = (ArtistID3) linkedHashMap.get(str2);
            if (artistID3 == null) {
                artistID3 = new ArtistID3(str2, ((jo1) q40.w0(list)).e, ((jo1) q40.w0(list)).c.getCoverArtId(), list.size(), null, 16, null);
            }
            arrayList4.add(artistID3);
        }
        return new ArrayList(q40.K0(arrayList4, new ca1(23)));
    }

    public static dx2 i(dx2 dx2Var, long j) {
        return dx2Var.c(new to(j));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        r1 = r11 - r19.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r1 = r19.a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r1 = r9 - r19.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        r1 = r19.b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0090, code lost:
    
        defpackage.kf2.o("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0094, code lost:
    
        defpackage.kf2.o("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0098, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean j(wv3 wv3Var, wv3 wv3Var2, wv3 wv3Var3, int i) {
        boolean zK = k(i, wv3Var3, wv3Var);
        float f2 = wv3Var3.b;
        float f3 = wv3Var3.d;
        float f4 = wv3Var3.a;
        float f5 = wv3Var3.c;
        float f6 = wv3Var.d;
        float f7 = wv3Var.b;
        float f8 = wv3Var.c;
        float f9 = wv3Var.a;
        if (!zK && k(i, wv3Var2, wv3Var)) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            kf2.o("This function should only be used for 2-D focus search");
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean k(int i, wv3 wv3Var, wv3 wv3Var2) {
        if (i == 3 || i == 4) {
            return wv3Var.d > wv3Var2.b && wv3Var.b < wv3Var2.d;
        }
        if (i == 5 || i == 6) {
            return wv3Var.c > wv3Var2.a && wv3Var.a < wv3Var2.c;
        }
        kf2.o("This function should only be used for 2-D focus search");
        return false;
    }

    public static fb4 l(fb4 fb4Var) {
        ag2 ag2Var = fb4Var.n;
        ag2Var.b();
        return ag2Var.v > 0 ? fb4Var : fb4.o;
    }

    public static final void m(ba1 ba1Var, f13 f13Var) {
        if (!ba1Var.n.A) {
            cz1.b("visitChildren called on an unattached node");
        }
        f13 f13Var2 = new f13(new cx2[16]);
        cx2 cx2Var = ba1Var.n;
        cx2 cx2Var2 = cx2Var.s;
        if (cx2Var2 == null) {
            j51.b(f13Var2, cx2Var);
        } else {
            f13Var2.b(cx2Var2);
        }
        while (true) {
            int i = f13Var2.p;
            if (i == 0) {
                return;
            }
            cx2 cx2VarC = (cx2) f13Var2.k(i - 1);
            if ((cx2VarC.q & 1024) == 0) {
                j51.b(f13Var2, cx2VarC);
            } else {
                while (cx2VarC != null) {
                    if ((cx2VarC.p & 1024) != 0) {
                        f13 f13Var3 = null;
                        while (cx2VarC != null) {
                            if (cx2VarC instanceof ba1) {
                                ba1 ba1Var2 = (ba1) cx2VarC;
                                if (ba1Var2.A && !j51.O(ba1Var2).Z) {
                                    if (ba1Var2.s0().a) {
                                        f13Var.b(ba1Var2);
                                    } else {
                                        m(ba1Var2, f13Var);
                                    }
                                }
                            } else if ((cx2VarC.p & 1024) != 0 && (cx2VarC instanceof fo0)) {
                                int i2 = 0;
                                for (cx2 cx2Var3 = ((fo0) cx2VarC).C; cx2Var3 != null; cx2Var3 = cx2Var3.s) {
                                    if ((cx2Var3.p & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            cx2VarC = cx2Var3;
                                        } else {
                                            if (f13Var3 == null) {
                                                f13Var3 = new f13(new cx2[16]);
                                            }
                                            if (cx2VarC != null) {
                                                f13Var3.b(cx2VarC);
                                                cx2VarC = null;
                                            }
                                            f13Var3.b(cx2Var3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            cx2VarC = j51.c(f13Var3);
                        }
                        break;
                    }
                    cx2VarC = cx2VarC.s;
                }
            }
        }
    }

    public static final ce n(ce ceVar) {
        ce ceVarC = ceVar.c();
        int iB = ceVarC.b();
        for (int i = 0; i < iB; i++) {
            ceVarC.d(i, ceVar.a(i));
        }
        return ceVarC;
    }

    public static final s14 o(Throwable th) {
        th.getClass();
        return new s14(th);
    }

    public static kj1 p(Bundle bundle) throws GoogleIdTokenParsingException {
        bundle.getClass();
        try {
            String string = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID");
            String string2 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN");
            String string3 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME");
            String string4 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME");
            String string5 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME");
            Uri uri = Build.VERSION.SDK_INT >= 33 ? (Uri) bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", Uri.class) : (Uri) bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI");
            String string6 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER");
            string.getClass();
            string2.getClass();
            return new kj1(string, string2, string3, string4, string5, uri, string6);
        } catch (Exception e2) {
            throw new GoogleIdTokenParsingException(e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object q(a90 a90Var, qr3 qr3Var) {
        if (!((cx2) a90Var).n.A) {
            cz1.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        mf3 mf3Var = (mf3) j51.O(a90Var).M;
        mf3Var.getClass();
        return vr1.C(mf3Var, qr3Var);
    }

    public static final Set r(List list, int i) {
        String str = (String) q40.y0(list, i);
        if (str == null) {
            str = "";
        }
        List listC0 = qm4.C0(str, new String[]{","}, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC0) {
            if (!qm4.u0((String) obj)) {
                arrayList.add(obj);
            }
        }
        return q40.T0(arrayList);
    }

    public static final Directory s(String str, Directory directory) {
        Object obj;
        String str2;
        Directory directory2;
        if (directory != null && !O()) {
            return directory;
        }
        List<Child> listT = t();
        Directory directory3 = null;
        ArrayList arrayList = null;
        Object obj2 = null;
        directory3 = null;
        if (directory != null) {
            HashSet hashSet = new HashSet();
            Iterator it = listT.iterator();
            while (it.hasNext()) {
                String id = ((Child) it.next()).getId();
                if (id != null) {
                    hashSet.add(id);
                }
            }
            HashSet hashSet2 = new HashSet();
            for (Child child : listT) {
                for (String str3 : gb.P(child.getAlbumId(), child.getParentId(), child.getArtistId())) {
                    if (str3 != null) {
                        hashSet2.add(str3);
                    }
                }
            }
            List<Child> children = directory.getChildren();
            if (children != null) {
                arrayList = new ArrayList();
                for (Object obj3 : children) {
                    Child child2 = (Child) obj3;
                    boolean zIsDir = child2.isDir();
                    String id2 = child2.getId();
                    if (zIsDir ? hashSet2.contains(id2) : hashSet.contains(id2)) {
                        arrayList.add(obj3);
                    }
                }
            }
            directory.setChildren(arrayList);
            return directory;
        }
        if (str != null) {
            ArrayList arrayListE = e(listT);
            int size = arrayListE.size();
            int i = 0;
            int i2 = 0;
            do {
                if (i2 >= size) {
                    obj = null;
                    break;
                }
                obj = arrayListE.get(i2);
                i2++;
            } while (!((jo1) obj).a.equals(str));
            jo1 jo1Var = (jo1) obj;
            if (jo1Var != null) {
                directory2 = new Directory(jo1Var.b, str, jo1Var.d, jo1Var.c.getAlbum(), null, null, null, null, 240, null);
            } else {
                ArrayList arrayList2 = new ArrayList();
                int size2 = arrayListE.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj4 = arrayListE.get(i3);
                    i3++;
                    jo1 jo1Var2 = (jo1) obj4;
                    if (!h12.c(jo1Var2.d, str)) {
                        List list = jo1Var2.b;
                        if (!list.isEmpty()) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                if (h12.c(((Child) it2.next()).getArtistId(), str)) {
                                }
                            }
                        }
                    }
                    arrayList2.add(obj4);
                }
                if (!arrayList2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList(r40.k0(arrayList2, 10));
                    int size3 = arrayList2.size();
                    int i4 = 0;
                    while (i4 < size3) {
                        Object obj5 = arrayList2.get(i4);
                        i4++;
                        jo1 jo1Var3 = (jo1) obj5;
                        String str4 = jo1Var3.a;
                        Child child3 = jo1Var3.c;
                        Child child4 = new Child(str4, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 7, null);
                        child4.setDir(true);
                        child4.setParentId(str);
                        child4.setTitle(child3.getAlbum());
                        child4.setAlbum(child3.getAlbum());
                        child4.setArtist(jo1Var3.e);
                        child4.setArtistId(str);
                        child4.setAlbumId(jo1Var3.a);
                        child4.setCoverArtId(child3.getCoverArtId());
                        child4.setYear(child3.getYear());
                        arrayList3.add(child4);
                    }
                    List listK0 = q40.K0(arrayList3, new ca1(24));
                    int size4 = arrayList2.size();
                    while (i < size4) {
                        Object obj6 = arrayList2.get(i);
                        i++;
                        if (h12.c(((jo1) obj6).d, str)) {
                            obj2 = obj6;
                            break;
                        }
                    }
                    jo1 jo1Var4 = (jo1) obj2;
                    if (jo1Var4 == null || (str2 = jo1Var4.e) == null) {
                        str2 = ((jo1) q40.w0(arrayList2)).e;
                    }
                    directory2 = new Directory(listK0, str, null, str2, null, null, null, null, 244, null);
                }
            }
            directory3 = directory2;
        }
        return directory3 == null ? new Directory(u01.n, str, null, App.a().getString(app.homemusic.R.string.homemusic_offline_nothing), null, null, null, null, 244, null) : directory3;
    }

    public static List t() {
        lg1 lg1Var = new lg1(10, AppDatabase.y().w());
        Thread thread = new Thread(lg1Var);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        List list = (List) lg1Var.p;
        list.getClass();
        return list;
    }

    public static final ba1 u(f13 f13Var, wv3 wv3Var, int i) {
        wv3 wv3VarE;
        ba1 ba1Var = null;
        if (i == 3) {
            wv3VarE = wv3Var.e((wv3Var.c - wv3Var.a) + 1.0f, 0.0f);
        } else if (i == 4) {
            wv3VarE = wv3Var.e(-((wv3Var.c - wv3Var.a) + 1.0f), 0.0f);
        } else if (i == 5) {
            wv3VarE = wv3Var.e(0.0f, (wv3Var.d - wv3Var.b) + 1.0f);
        } else {
            if (i != 6) {
                kf2.o("This function should only be used for 2-D focus search");
                return null;
            }
            wv3VarE = wv3Var.e(0.0f, -((wv3Var.d - wv3Var.b) + 1.0f));
        }
        Object[] objArr = f13Var.n;
        int i2 = f13Var.p;
        for (int i3 = 0; i3 < i2; i3++) {
            ba1 ba1Var2 = (ba1) objArr[i3];
            if (te5.B(ba1Var2)) {
                wv3 wv3VarR = te5.r(ba1Var2);
                if (F(wv3VarR, wv3VarE, wv3Var, i)) {
                    ba1Var = ba1Var2;
                    wv3VarE = wv3VarR;
                }
            }
        }
        return ba1Var;
    }

    public static final boolean v(ba1 ba1Var, int i, if1 if1Var) {
        wv3 wv3Var;
        f13 f13Var = new f13(new ba1[16]);
        m(ba1Var, f13Var);
        int i2 = f13Var.p;
        if (i2 <= 1) {
            ba1 ba1Var2 = (ba1) (i2 == 0 ? null : f13Var.n[0]);
            if (ba1Var2 != null) {
                return ((Boolean) if1Var.invoke(ba1Var2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                wv3 wv3VarR = te5.r(ba1Var);
                float f2 = wv3VarR.a;
                float f3 = wv3VarR.b;
                wv3Var = new wv3(f2, f3, f2, f3);
            } else {
                if (i != 3 && i != 5) {
                    kf2.o("This function should only be used for 2-D focus search");
                    return false;
                }
                wv3 wv3VarR2 = te5.r(ba1Var);
                float f4 = wv3VarR2.c;
                float f5 = wv3VarR2.d;
                wv3Var = new wv3(f4, f5, f4, f5);
            }
            ba1 ba1VarU = u(f13Var, wv3Var, i);
            if (ba1VarU != null) {
                return ((Boolean) if1Var.invoke(ba1VarU)).booleanValue();
            }
        }
        return false;
    }

    public static final pe0 w(Executor executor) {
        return new y21(executor);
    }

    public static final boolean x(int i, dd0 dd0Var, ba1 ba1Var, wv3 wv3Var) {
        if (R(i, dd0Var, ba1Var, wv3Var)) {
            return true;
        }
        Boolean bool = (Boolean) uc5.U(ba1Var, i, new x50(((ey) ((ra) j51.P(ba1Var)).getFocusOwner()).f(), ba1Var, wv3Var, i, dd0Var, 2));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final j54 y(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(app.homemusic.R.id.view_tree_saved_state_registry_owner);
            j54 j54Var = tag instanceof j54 ? (j54) tag : null;
            if (j54Var != null) {
                return j54Var;
            }
            Object objZ = au0.z(view);
            view = objZ instanceof View ? (View) objZ : null;
        }
        return null;
    }

    public static Point z(ColorPickerView colorPickerView, Point point) {
        Point point2 = new Point(colorPickerView.getWidth() / 2, colorPickerView.getMeasuredHeight() / 2);
        if (!colorPickerView.e()) {
            return !colorPickerView.E ? point : f(colorPickerView, point, point2);
        }
        float width = colorPickerView.getWidth() * 0.5f;
        float height = colorPickerView.getHeight() * 0.5f;
        float f2 = point.x - width;
        float f3 = point.y - height;
        float fMin = Math.min(width, height);
        double dSqrt = Math.sqrt((f3 * f3) + (f2 * f2));
        double d2 = fMin;
        if (dSqrt > d2) {
            double d3 = d2 / dSqrt;
            f2 = (float) (((double) f2) * d3);
            f3 = (float) (((double) f3) * d3);
        }
        return new Point((int) (f2 + width), (int) (f3 + height));
    }
}
