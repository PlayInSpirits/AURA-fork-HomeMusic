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
import com.eddyizm.tempus.homemusic.HomeOffline$musicFolders$1$1;
import com.eddyizm.tempus.homemusic.SmartPlan;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.Artist;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.ArtistWithAlbumsID3;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Directory;
import com.eddyizm.tempus.subsonic.models.Index;
import com.eddyizm.tempus.subsonic.models.Indexes;
import com.google.android.libraries.identity.googleid.GoogleIdTokenParsingException;
import com.skydoves.colorpickerview.ColorPickerView;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
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
    public static final ca1 a = null;
    public static final sp1 b = null;
    public static final p61 c = null;
    public static final p61[] d = null;
    public static Boolean e;
    public static Boolean f;
    public static Boolean g;
    public static Boolean h;

    static {
        a = new ca1(26);
        b = new sp1(1);
        p61 r0 = new p61("GET_CREDENTIAL", 1);
        c = r0;
        d = new p61[]{r0, new p61("CREDENTIAL_REGISTRY", 1), new p61("CLEAR_REGISTRY", 1)};
    }

    public static int A(List r4, InputStream r5, qj0 r6) {
        if (r5 != null) goto L6;
        return -1;
    L6:
        if (r5.markSupported() == true) goto L8;
        r5 = new aw3(r5, r6);
    L8:
        r5.mark(5242880);
        int r1 = r4.size();
        int r2 = 0;
    L9:
        if (r2 >= r1) goto L24;
        int r3 = ((wv1) r4.get(r2)).b(r5, r6);     // Catch: Throwable -> L16
        r5.reset();
        if (r3 != (-1)) goto L19;
        r2 = r2 + 1;
        goto L9
    L19:
        return r3;
    L16:
        th = move-exception;
        r5.reset();
        throw th;
    L24:
        return -1;
    }

    public static ImageHeaderParser$ImageType B(List r3, InputStream r4, qj0 r5) {
        if (r4 != null) goto L6;
        return ImageHeaderParser$ImageType.UNKNOWN;
    L6:
        if (r4.markSupported() == true) goto L8;
        r4 = new aw3(r4, r5);
    L8:
        r4.mark(5242880);
        int r6 = r3.size();
        int r0 = 0;
    L9:
        if (r0 >= r6) goto L20;
        ImageHeaderParser$ImageType r1 = ((wv1) r3.get(r0)).d(r4);     // Catch: Throwable -> L16
        r4.reset();
        if (r1 != ImageHeaderParser$ImageType.UNKNOWN) goto L25;
        r0 = r0 + 1;
        goto L9
    L25:
        return r1;
    L16:
        th = move-exception;
        r4.reset();
        throw th;
    L20:
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static ImageHeaderParser$ImageType C(List r5, ByteBuffer r6) {
        if (r6 == null) goto L4;
        int r0 = r5.size();
        int r2 = 0;
    L6:
        if (r2 >= r0) goto L17;
        ImageHeaderParser$ImageType r3 = ((wv1) r5.get(r2)).a(r6);     // Catch: Throwable -> L13
        AtomicReference r4 = vw.a;
        ByteBuffer r7 = (ByteBuffer) r6.position(0);
        if (r3 != ImageHeaderParser$ImageType.UNKNOWN) goto L11;
        r2 = r2 + 1;
        goto L6
    L11:
        return r3;
    L13:
        th = move-exception;
        AtomicReference r1 = vw.a;
        ByteBuffer r8 = (ByteBuffer) r6.position(0);
        throw th;
    L17:
        return ImageHeaderParser$ImageType.UNKNOWN;
    L4:
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static ArrayList D(List r5, ArrayList r6) {
        HashSet r0 = new HashSet();
        int r1 = r6.size();
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L5;
        Object r4 = r6.get(r3);
        r3 = r3 + 1;
        r0.add(((AlbumID3) r4).getId());
        goto L3
    L5:
        ArrayList r7 = new ArrayList();
        Iterator r8 = r5.iterator();
    L7:
        if (r8.hasNext() == false) goto L11;
        Object r9 = r8.next();
        if (r0.contains(((AlbumID3) r9).getId()) == false) goto L7;
        r7.add(r9);
        goto L7
    L11:
        HashSet r10 = new HashSet();
        ArrayList r11 = new ArrayList();
        int r12 = r7.size();
    L12:
        if (r2 >= r12) goto L16;
        Object r13 = r7.get(r2);
        r2 = r2 + 1;
        if (r10.add(((AlbumID3) r13).getId()) == false) goto L12;
        r11.add(r13);
        goto L12
    L16:
        return r11;
    }

    public static final Indexes E(Indexes r13) {
        if (r13 != null) goto L4;
    L6:
        ArrayList r14 = e(t());
        ArrayList r0 = new ArrayList();
        int r1 = r14.size();
        int r3 = 0;
    L7:
        if (r3 >= r1) goto L11;
        Object r4 = r14.get(r3);
        r3 = r3 + 1;
        if (((jo1) r4).d == null) goto L7;
        r0.add(r4);
        goto L7
    L11:
        HashSet r15 = new HashSet();
        ArrayList r2 = new ArrayList();
        int r5 = r0.size();
        int r6 = 0;
    L12:
        if (r6 >= r5) goto L16;
        Object r7 = r0.get(r6);
        r6 = r6 + 1;
        if (r15.add(((jo1) r7).d) == false) goto L12;
        r2.add(r7);
        goto L12
    L16:
        ArrayList r16 = new ArrayList(r40.k0(r2, 10));
        int r8 = r2.size();
        int r9 = 0;
    L17:
        if (r9 >= r8) goto L19;
        Object r10 = r2.get(r9);
        r9 = r9 + 1;
        jo1 r11 = (jo1) r10;
        r16.add(new Artist(r11.d, r11.e, null, null, null, 28, null));
        goto L17
    L19:
        List r17 = q40.K0(r16, new ca1(25));
        Indexes r12 = new Indexes();
        LinkedHashMap r18 = new LinkedHashMap();
        Iterator r19 = r17.iterator();
    L21:
        if (r19.hasNext() == false) goto L42;
        Object r20 = r19.next();
        String r21 = ((Artist) r20).getName();
        if (r21 == null) goto L37;
        String r22 = qm4.K0(r21).toString();
        if (r22 == null) goto L37;
        Character r23 = null;
        if (r22.length() != 0) goto L29;
        Character r24 = null;
    L30:
        if (r24 == null) goto L37;
        char r25 = Character.toUpperCase(r24.charValue());
        Character r26 = Character.valueOf(r25);
        if (Character.isLetter(r25) == false) goto L34;
        r23 = r26;
    L34:
        if (r23 == null) goto L37;
        String r27 = String.valueOf(r23.charValue());
        if (r27 == null) goto L37;
    L38:
        Object r28 = r18.get(r27);
        if (r28 != null) goto L41;
        r28 = new ArrayList();
        r18.put(r27, r28);
    L41:
        ((List) r28).add(r20);
        goto L21
    L29:
        r24 = Character.valueOf(r22.charAt(0));
    L37:
        r27 = "#";
        goto L38
    L42:
        ArrayList r110 = new ArrayList(r18.size());
        Iterator r29 = r18.entrySet().iterator();
    L44:
        if (r29.hasNext() == false) goto L46;
        Map.Entry r30 = (Map.Entry) r29.next();
        String r31 = (String) r30.getKey();
        List<Artist> r32 = (List) r30.getValue();
        Index r33 = new Index();
        r33.setName(r31);
        r33.setArtists(r32);
        r110.add(r33);
        goto L44
    L46:
        r12.setIndices(r110);
        return r12;
    L4:
        if (O() == true) goto L6;
        return r13;
    }

    public static final boolean F(wv3 r2, wv3 r3, wv3 r4, int r5) {
        if (G(r5, r2, r4) == true) goto L6;
        return false;
    L6:
        if (G(r5, r3, r4) == true) goto L9;
        return true;
    L9:
        if (j(r4, r2, r3, r5) == false) goto L12;
        return true;
    L12:
        if (j(r4, r3, r2, r5) == false) goto L15;
        return false;
    L15:
        if (H(r5, r4, r2) >= H(r5, r4, r3)) goto L18;
        return true;
    L18:
        return false;
    }

    public static final boolean G(int r3, wv3 r4, wv3 r5) {
        if (r3 != 3) goto L13;
        float r6 = r5.c;
        float r7 = r5.a;
        float r0 = r4.c;
        if (r6 > r0) goto L9;
        if (r7 >= r0) goto L9;
    L11:
        return false;
    L9:
        if (r7 <= r4.a) goto L11;
        return true;
    L13:
        if (r3 != 4) goto L23;
        float r8 = r5.a;
        float r9 = r5.c;
        float r1 = r4.a;
        if (r8 < r1) goto L19;
        if (r9 <= r1) goto L19;
    L21:
        return false;
    L19:
        if (r9 >= r4.c) goto L21;
        return true;
    L23:
        if (r3 != 5) goto L33;
        float r10 = r5.d;
        float r11 = r5.b;
        float r2 = r4.d;
        if (r10 > r2) goto L29;
        if (r11 >= r2) goto L29;
    L31:
        return false;
    L29:
        if (r11 <= r4.b) goto L31;
        return true;
    L33:
        if (r3 != 6) goto L42;
        float r12 = r5.b;
        float r13 = r5.d;
        float r14 = r4.b;
        if (r12 < r14) goto L39;
        if (r13 <= r14) goto L39;
    L41:
        return false;
    L39:
        if (r13 >= r4.d) goto L41;
        return true;
    L42:
        kf2.o("This function should only be used for 2-D focus search");
        return false;
    }

    public static final long H(int r10, wv3 r11, wv3 r12) {
        if (r10 != 3) goto L6;
        float r7 = r11.a;
        float r8 = r12.c;
    L5:
        float r9 = r7 - r8;
        if (r9 >= 0.0f) goto L15;
        r9 = 0.0f;
    L15:
        long r13 = (long) r9;
        if (r10 == 3) goto L19;
        if (r10 == 4) goto L19;
        if (r10 == 5) goto L24;
        if (r10 == 6) goto L24;
        kf2.o("This function should only be used for 2-D focus search");
        return 0;
    L24:
        float r14 = r11.a;
        float r15 = ((r11.c - r14) / 2.0f) + r14;
        float r16 = r12.a;
        float r17 = r12.c;
    L25:
        long r18 = (long) (r15 - (((r17 - r16) / 2.0f) + r16));
        return (r18 * r18) + ((13 * r13) * r13);
    L19:
        float r19 = r11.b;
        r15 = ((r11.d - r19) / 2.0f) + r19;
        r16 = r12.b;
        r17 = r12.d;
        goto L25
    L6:
        if (r10 != 4) goto L8;
        r7 = r12.a;
        r8 = r11.c;
        goto L5
    L8:
        if (r10 != 5) goto L10;
        r7 = r11.b;
        r8 = r12.d;
        goto L5
    L10:
        if (r10 != 6) goto L29;
        r7 = r12.b;
        r8 = r11.d;
        goto L5
    L29:
        kf2.o("This function should only be used for 2-D focus search");
        return 0;
    }

    public static boolean I(k14 r2, oz3 r3) {
        r3.getClass();
        int r0 = r2.q;
        if (r0 == 200) goto L36;
        if (r0 == 410) goto L36;
        if (r0 == 414) goto L36;
        if (r0 == 501) goto L36;
        if (r0 == 203) goto L36;
        if (r0 == 204) goto L36;
        if (r0 != 307) goto L17;
    L24:
        String r1 = r2.s.a("Expires");
        if (r1 != null) goto L27;
        r1 = null;
    L27:
        if (r1 != null) goto L36;
        if (r2.b().c != (-1)) goto L36;
        if (r2.b().f == true) goto L36;
        if (r2.b().e == true) goto L36;
        return false;
    L17:
        if (r0 == 308) goto L36;
        if (r0 == 404) goto L36;
        if (r0 == 405) goto L36;
        switch(r0) {
            case 300: goto L36;
            case 301: goto L36;
            case 302: goto L24;
            default: goto L47;
        };
    L47:
        return false;
    L36:
        if (r2.b().b == true) goto L44;
        ix r4 = r3.f;
        if (r4 != null) goto L41;
        int r5 = ix.n;
        r4 = au0.O(r3.c);
        r3.f = r4;
    L41:
        if (r4.b == true) goto L46;
        return true;
    L46:
        return false;
    L44:
        return false;
    }

    public static boolean J(Context r2) {
        PackageManager r0 = r2.getPackageManager();
        if (e != null) goto L5;
        e = Boolean.valueOf(r0.hasSystemFeature("android.hardware.type.watch"));
    L5:
        e.booleanValue();
        if (f != null) goto L9;
        f = Boolean.valueOf(r2.getPackageManager().hasSystemFeature("cn.google"));
    L9:
        if (f.booleanValue() == false) goto L16;
        int r3 = Build.VERSION.SDK_INT;
        if (r3 >= 26) goto L13;
        return true;
    L13:
        if (r3 < 30) goto L19;
        return true;
    L19:
        return false;
    L16:
        return false;
    }

    public static LinkedHashSet K(Set r6, Object r7) {
        r6.getClass();
        LinkedHashSet r0 = new LinkedHashSet(lg2.W(r6.size()));
        Iterator r8 = r6.iterator();
        boolean r2 = false;
    L4:
        if (r8.hasNext() == false) goto L12;
        Object r3 = r8.next();
        boolean r4 = true;
        if (r2 == false) goto L8;
    L10:
        if (r4 == false) goto L4;
        r0.add(r3);
        goto L4
    L8:
        if (h12.c(r3, r7) == false) goto L10;
        r2 = true;
        r4 = false;
        goto L10
    L12:
        return r0;
    }

    public static final List L(List r3) {
        SharedPreferences r0 = App.a().getSharedPreferences("homemusic_offline", 0);
        if (r3 == null) goto L6;
        SharedPreferences.Editor r1 = r0.edit();
        rr1 r2 = rr1.a;
        r1.putString("music_folders", rr1.c.j(r3)).apply();
        return r3;
    L6:
        Object r4 = null;
        String r5 = r0.getString("music_folders", null);
        if (r5 != null) goto L19;
        return null;
    L19:
        rr1 r6 = rr1.a;     // Catch: Throwable -> L11
        Object r7 = (List) rr1.c.f(r5, new HomeOffline$musicFolders$1$1().getType());     // Catch: Throwable -> L11
    L14:
        if ((r7 instanceof s14) == true) goto L18;
        r4 = r7;
    L18:
        return (List) r4;
    L11:
        th = move-exception;
        r7 = new s14(th);
        goto L14
    }

    public static String M(Context r2) {
        r2.getClass();
        String r3 = r2.getSharedPreferences("lan-playback", 0).getString("name", Build.MODEL);
        r3.getClass();
        return qm4.J0(40, r3);
    }

    public static final void N(ba2 r6, Runnable r7) {
        r6.getClass();
        fx3 r0 = new fx3();
        r0.n = true;
        ss0 r2 = AppDatabase.y().w();
        ((s24) r2.n).i().a(new String[]{"download"}, new os0(r2, 1)).e(r6, new wd1(new o(11, r0, r7), 3));
    }

    public static boolean O() {
        return !cx.h();
    }

    public static ArrayList P(List r3, List r4) {
        r3.getClass();
        HashSet r0 = new HashSet();
        Iterator r5 = r4.iterator();
    L4:
        if (r5.hasNext() == false) goto L8;
        String r1 = ((Child) r5.next()).getId();
        if (r1 == null) goto L4;
        r0.add(r1);
        goto L4
    L8:
        ArrayList r6 = new ArrayList();
        Iterator r7 = r3.iterator();
    L10:
        if (r7.hasNext() == false) goto L14;
        Object r2 = r7.next();
        if (r0.contains(((Child) r2).getId()) == false) goto L10;
        r6.add(r2);
        goto L10
    L14:
        return r6;
    }

    public static LinkedHashSet Q(Set r2, Object r3) {
        r2.getClass();
        LinkedHashSet r0 = new LinkedHashSet(lg2.W(r2.size() + 1));
        r0.addAll(r2);
        r0.add(r3);
        return r0;
    }

    public static final boolean R(int r10, dd0 r11, ba1 r12, wv3 r13) {
        f13 r0 = new f13(new ba1[16]);
        if (r12.n.A == true) goto L5;
        cz1.b("visitChildren called on an unattached node");
    L5:
        f13 r2 = new f13(new cx2[16]);
        cx2 r14 = r12.n;
        cx2 r3 = r14.s;
        if (r3 != null) goto L8;
        j51.b(r2, r14);
    L9:
        int r15 = r2.p;
        if (r15 == 0) goto L46;
        cx2 r16 = (cx2) r2.k(r15 - 1);
        if ((r16.q & 1024) == 0) goto L13;
    L14:
        if (r16 == null) goto L9;
        if ((r16.p & 1024) != 0) goto L17;
        r16 = r16.s;
        goto L14
    L17:
        f13 r6 = null;
    L18:
        if (r16 == null) goto L9;
        if ((r16 instanceof ba1) == true) goto L21;
        if ((r16.p & 1024) == 0) goto L43;
        if ((r16 instanceof fo0) == false) goto L43;
        cx2 r7 = ((fo0) r16).C;
        int r8 = 0;
    L29:
        if (r7 == null) goto L41;
        if ((r7.p & 1024) == 0) goto L40;
        r8 = r8 + 1;
        if (r8 != 1) goto L35;
        r16 = r7;
        goto L40
    L35:
        if (r6 != null) goto L37;
        r6 = new f13(new cx2[16]);
    L37:
        if (r16 == null) goto L39;
        r6.b(r16);
        r16 = null;
    L39:
        r6.b(r7);
    L40:
        r7 = r7.s;
        goto L29
    L41:
        if (r8 == 1) goto L18;
    L43:
        r16 = j51.c(r6);
        goto L18
    L21:
        ba1 r17 = (ba1) r16;
        if (r17.A == false) goto L43;
        r0.b(r17);
        goto L43
    L13:
        j51.b(r2, r16);
    L46:
        if (r0.p == 0) goto L58;
        ba1 r18 = u(r0, r13, r10);
        if (r18 == null) goto L58;
        if (r18.s0().a == true) goto L53;
        if (x(r10, r11, r18, r13) == true) goto L56;
        r0.j(r18);
        goto L46
    L56:
        return true;
    L53:
        return ((Boolean) r11.invoke(r18)).booleanValue();
    L58:
        return false;
    L8:
        r2.b(r3);
        goto L9
    }

    public static Set S(Object r0) {
        Set r1 = Collections.singleton(r0);
        r1.getClass();
        return r1;
    }

    public static final void T(df r10) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 29) goto L5;
        om0 r1 = new om0(18);
    L8:
        Window r2 = r10.getWindow();
        r2.getClass();
        View r3 = r10.findViewById(R.id.content);
        r3.getClass();
        Resources.Theme r11 = r10.getTheme();
        r11.getClass();
        boolean r7 = false;
        switch(r1.n) {
            case 16: goto L31;
            case 17: goto L22;
            default: goto L10;
        };
    L10:
        l93.d0(r2, false);
        Resources r4 = r3.getResources();
        ThreadLocal r9 = g14.a;
        int r12 = r4.getColor(R.color.transparent, r11);
        if ((r4.getConfiguration().uiMode & 48) != 32) goto L13;
        r7 = true;
    L13:
        r2.setStatusBarColor(r12);
        r2.setNavigationBarColor(r12);
        om1 r13 = new om1(r3);
        int r5 = Build.VERSION.SDK_INT;
        if (r5 < 35) goto L16;
        su3 r6 = new tb5(r2, r13);
    L21:
        boolean r14 = !r7;
        r6.D(r14);
        r6.C(r14);
        return;
    L16:
        if (r5 < 30) goto L18;
        r6 = new sb5(r2, r13);
        goto L21
    L18:
        if (r5 < 26) goto L20;
        r6 = new rb5(r2, r13);
        goto L21
    L20:
        r6 = new qb5(r2, r13);
        goto L21
    L22:
        l93.d0(r2, false);
        Resources r8 = r3.getResources();
        ThreadLocal r15 = g14.a;
        int r16 = r8.getColor(R.color.transparent, r11);
        int r17 = r8.getColor(app.homemusic.R.color.navigation_bar_scrim_light, r11);
        r2.setStatusBarColor(r16);
        r2.setNavigationBarColor(r17);
        om1 r18 = new om1(r3);
        int r19 = Build.VERSION.SDK_INT;
        if (r19 < 35) goto L25;
        su3 r20 = new tb5(r2, r18);
    L30:
        r20.D(true);
        r20.C(true);
        return;
    L25:
        if (r19 < 30) goto L27;
        r20 = new sb5(r2, r18);
        goto L30
    L27:
        if (r19 < 26) goto L29;
        r20 = new rb5(r2, r18);
        goto L30
    L29:
        r20 = new qb5(r2, r18);
        goto L30
    L31:
        l93.d0(r2, false);
        Resources r21 = r3.getResources();
        ThreadLocal r22 = g14.a;
        r2.setStatusBarColor(r21.getColor(R.color.transparent, r11));
        om1 r110 = new om1(r3);
        int r23 = Build.VERSION.SDK_INT;
        if (r23 < 35) goto L34;
        su3 r24 = new tb5(r2, r110);
    L39:
        r24.D(true);
        r2.addFlags(134217728);
        return;
    L34:
        if (r23 < 30) goto L36;
        r24 = new sb5(r2, r110);
        goto L39
    L36:
        if (r23 < 26) goto L38;
        r24 = new rb5(r2, r110);
        goto L39
    L38:
        r24 = new qb5(r2, r110);
        goto L39
    L5:
        if (r0 < 26) goto L7;
        r1 = new om0(17);
        goto L8
    L7:
        r1 = new om0(16);
        goto L8
    }

    public static final List U(List r1) {
        r1.getClass();
        if (O() == true) goto L6;
        return r1;
    L6:
        return P(r1, t());
    }

    public static final long V(String r4, long r5, long r7, long r9) {
        int r0 = eq4.a;
        String r1 = System.getProperty(r4);     // Catch: SecurityException -> L5
    L6:
        if (r1 != null) goto L8;
        return r5;
    L8:
        Long r6 = xm4.m0(r1);
        if (r6 == null) goto L18;
        long r2 = r6.longValue();
        if (r7 > r2) goto L16;
        if (r2 > r9) goto L16;
        return r2;
    L16:
        throw new IllegalStateException(("System property '" + r4 + "' should be in range " + r7 + ".." + r9 + ", but is '" + r2 + '\'').toString());
    L18:
        throw new IllegalStateException(("System property '" + r4 + "' has unrecognized value '" + r1 + '\'').toString());
    L5:
        r1 = null;
        goto L6
    }

    public static int W(String r7, int r8, int r9) {
        if ((r9 & 8) == 0) goto L5;
        int r10 = Integer.MAX_VALUE;
    L7:
        return (int) V(r7, r8, 1, r10);
    L5:
        r10 = 2097150;
        goto L7
    }

    public static final void X(Object r1) {
        if ((r1 instanceof s14) == true) goto L6;
        return;
    L6:
        throw ((s14) r1).n;
    }

    public static AlbumID3 Y(jo1 r29) {
        String r1 = r29.a;
        Child r2 = r29.c;
        String r3 = r2.getAlbum();
        String r4 = r29.e;
        String r5 = r29.d;
        String r6 = r2.getCoverArtId();
        List r0 = r29.b;
        Integer r7 = Integer.valueOf(r0.size());
        Iterator r8 = r0.iterator();
        int r9 = 0;
        int r10 = 0;
    L4:
        if (r8.hasNext() == false) goto L10;
        Integer r11 = ((Child) r8.next()).getDuration();
        if (r11 == null) goto L8;
        int r12 = r11.intValue();
    L9:
        r10 = r10 + r12;
        goto L4
    L8:
        r12 = 0;
        goto L9
    L10:
        Integer r13 = Integer.valueOf(r10);
        Date r14 = r2.getCreated();
        Integer r15 = r2.getYear();
        if (r15 == null) goto L14;
        r9 = r15.intValue();
    L14:
        return new AlbumID3(r1, r3, r4, r5, r6, r7, r13, null, r14, null, r9, r2.getGenre(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67105408, null);
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
    public static final List Z(String r8, List r9) {
        if (r9 != null) goto L4;
    L6:
        List r0 = t();
        ?? r1 = u01.n;
        ?? r10 = r9;
        if (r9 != null) goto L9;
        r10 = r1;
    L9:
        ArrayList r11 = P(r10, r0);
        boolean r2 = r11.isEmpty();
        ?? r12 = r11;
        if (r2 == false) goto L28;
        if (r8 != null) goto L13;
    L26:
        r12 = r1;
        goto L28
    L13:
        if (qm4.u0(r8) == true) goto L26;
        ArrayList r13 = e(r0);
        r1 = new ArrayList();
        int r3 = r13.size();
        int r4 = 0;
    L16:
        if (r4 >= r3) goto L26;
        Object r5 = r13.get(r4);
        r4 = r4 + 1;
        jo1 r6 = (jo1) r5;
        List r7 = r6.b;
        ArrayList r14 = new ArrayList();
        Iterator r15 = r7.iterator();
    L19:
        if (r15.hasNext() == false) goto L25;
        Object r16 = r15.next();
        if (r8.equalsIgnoreCase(((Child) r16).getArtist()) == true) goto L24;
        if (r8.equalsIgnoreCase(r6.e) == false) goto L19;
    L24:
        r14.add(r16);
        goto L19
    L25:
        v40.n0(r14, r1);
    L28:
        return new ArrayList(r12);
    L4:
        if (O() == true) goto L6;
        return r9;
    }

    public static final List a(int r7, ArrayList r8) {
        if (r8 == null) goto L7;
        if (O() == true) goto L7;
        return r8;
    L7:
        return new ArrayList(q40.L0(q40.u0(c("alphabeticalByName", 0, null, null, r8, t()), r7), SmartPlan.MAX_QUEUE));
    }

    public static Set a0(Context r2) {
        r2.getClass();
        Set<String> r3 = r2.getSharedPreferences("lan-playback", 0).getStringSet("trusted", z01.n);
        r3.getClass();
        return q40.T0(r3);
    }

    public static final List b(String r7, int r8, Integer r9, Integer r10, List r11) {
        if (r11 == null) goto L7;
        if (O() == true) goto L7;
        return r11;
    L7:
        return new ArrayList(c(r7, r8, r9, r10, r11, t()));
    }

    public static final Boolean b0(int r7, dd0 r8, ba1 r9, wv3 r10) {
        int r0 = r9.v0().ordinal();
        if (r0 == 0) goto L52;
        if (r0 == 1) goto L19;
        if (r0 == 2) goto L52;
        if (r0 == 3) goto L9;
        er1.n();
        return null;
    L9:
        if (r9.s0().a == true) goto L11;
        if (r10 != null) goto L16;
        return Boolean.valueOf(v(r9, r7, r8));
    L16:
        return Boolean.valueOf(R(r7, r8, r9, r10));
    L11:
        return (Boolean) r8.invoke(r9);
    L19:
        ba1 r1 = te5.s(r9);
        if (r1 == null) goto L49;
        int r6 = r1.v0().ordinal();
        if (r6 == 0) goto L45;
        if (r6 == 1) goto L30;
        if (r6 == 2) goto L45;
        if (r6 == 3) goto L28;
        er1.n();
        return null;
    L28:
        kf2.o("ActiveParent must have a focusedChild");
        return null;
    L30:
        Boolean r2 = b0(r7, r8, r1, r10);
        if (h12.c(r2, Boolean.FALSE) == true) goto L33;
        return r2;
    L33:
        if (r10 != null) goto L44;
        if (r1.v0() != z91.o) goto L41;
        ba1 r11 = te5.p(r1);
        if (r11 == null) goto L39;
        r10 = te5.r(r11);
        goto L44
    L39:
        kf2.o("ActiveParent must have a focusedChild");
        return null;
    L41:
        kf2.o("Searching for active node in inactive hierarchy");
        return null;
    L44:
        return Boolean.valueOf(x(r7, r8, r9, r10));
    L45:
        if (r10 != null) goto L48;
        r10 = te5.r(r1);
    L48:
        return Boolean.valueOf(x(r7, r8, r9, r10));
    L49:
        kf2.o("ActiveParent must have a focusedChild");
        return null;
    L52:
        return Boolean.valueOf(v(r9, r7, r8));
    }

    public static List c(String r7, int r8, Integer r9, Integer r10, List r11, List r12) {
        if (r11 != null) goto L4;
        List r0 = u01.n;
    L5:
        int r2 = lg2.W(r40.k0(r0, 10));
        if (r2 >= 16) goto L8;
        r2 = 16;
    L8:
        LinkedHashMap r3 = new LinkedHashMap(r2);
        Iterator r1 = r0.iterator();
    L10:
        if (r1.hasNext() == false) goto L12;
        Object r4 = r1.next();
        r3.put(((AlbumID3) r4).getId(), r4);
        goto L10
    L12:
        ArrayList r13 = e(r12);
        ArrayList r5 = new ArrayList(r40.k0(r13, 10));
        int r6 = r13.size();
        int r14 = 0;
        int r15 = 0;
    L13:
        if (r15 >= r6) goto L18;
        Object r16 = r13.get(r15);
        r15 = r15 + 1;
        jo1 r17 = (jo1) r16;
        AlbumID3 r18 = (AlbumID3) r3.get(r17.a);
        if (r18 != null) goto L17;
        r18 = Y(r17);
    L17:
        r5.add(r18);
        goto L13
    L18:
        int r19 = r7.hashCode();
        ca1 r20 = a;
        switch(r19) {
            case -1897187073: goto L62;
            case -1526279474: goto L59;
            case -1374812876: goto L42;
            case -1048839194: goto L36;
            case -938285885: goto L32;
            case -934918565: goto L29;
            case 915484836: goto L26;
            case 1920194134: goto L22;
            default: goto L63;
        };
    L63:
        List r21 = q40.K0(r5, r20);
    L67:
        if (r8 > 0) goto L69;
        return r21;
    L69:
        return q40.L0(r21, r8);
    L22:
        if (r7.equals("alphabeticalByArtist") == false) goto L63;
        r21 = q40.K0(r5, new w60(r14, new ca1(19)));
        goto L67
    L26:
        if (r7.equals("highest") == false) goto L63;
    L64:
        if (r11 == null) goto L66;
        r21 = D(r11, r5);
        goto L67
    L66:
        r21 = q40.K0(r5, r20);
        goto L67
    L29:
        if (r7.equals("recent") == true) goto L64;
    L32:
        if (r7.equals("random") == false) goto L63;
        r21 = q40.S0(r5);
        Collections.shuffle(r21);
        goto L67
    L36:
        if (r7.equals("newest") == false) goto L63;
        if (r11 == null) goto L40;
        r21 = D(r11, r5);
        goto L67
    L40:
        r21 = q40.K0(r5, new ca1(22));
        goto L67
    L42:
        if (r7.equals("byYear") == false) goto L63;
        if (r9 == null) goto L57;
        if (r10 == null) goto L57;
        j02 r22 = new j02(Math.min(r9.intValue(), r10.intValue()), Math.max(r9.intValue(), r10.intValue()), 1);
        ArrayList r110 = new ArrayList();
        int r111 = r5.size();
    L48:
        if (r14 >= r111) goto L54;
        Object r23 = r5.get(r14);
        r14 = r14 + 1;
        int r24 = ((AlbumID3) r23).getYear();
        if (r22.n > r24) goto L48;
        if (r24 > r22.o) goto L48;
        r110.add(r23);
        goto L48
    L54:
        r21 = q40.K0(r110, new ca1(21));
        if (r9.intValue() <= r10.intValue()) goto L67;
        r21 = q40.H0(r21);
    L57:
        r21 = q40.K0(r5, new ca1(20));
        goto L67
    L59:
        if (r7.equals("frequent") == true) goto L64;
    L62:
        if (r7.equals("starred") == true) goto L64;
    L4:
        r0 = r11;
        goto L5
    }

    public static byte[] c0(byte[]... r7) {
        int r1 = 0;
        int r2 = 0;
    L3:
        int r3 = r7.length;
        if (r1 >= r3) goto L6;
        r2 = r2 + r7[r1].length;
        r1 = r1 + 1;
        goto L3
    L6:
        byte[] r4 = new byte[r2];
        int r5 = 0;
        int r6 = 0;
    L7:
        if (r5 >= r3) goto L9;
        byte[] r8 = r7[r5];
        int r9 = r8.length;
        System.arraycopy(r8, 0, r4, r6, r9);
        r6 = r6 + r9;
        r5 = r5 + 1;
        goto L7
    L9:
        return r4;
    }

    public static final List d(String r4, List r5) {
        r5.getClass();
        if (r5.isEmpty() == false) goto L5;
    L7:
        List r0 = t();
        if (r5.isEmpty() == false) goto L10;
        if (r4 == null) goto L24;
        ArrayList r6 = e(r0);
        int r1 = r6.size();
        int r2 = 0;
    L14:
        if (r2 >= r1) goto L18;
        Object r3 = r6.get(r2);
        r2 = r2 + 1;
        if (((jo1) r3).a.equals(r4) == false) goto L14;
    L19:
        jo1 r7 = (jo1) r3;
        if (r7 == null) goto L24;
        return r7.b;
    L18:
        r3 = null;
    L24:
        return u01.n;
    L10:
        return P(r5, r0);
    L5:
        if (O() == true) goto L7;
        return r5;
    }

    public static ArrayList e(List r10) {
        ArrayList r0 = new ArrayList();
        Iterator r11 = r10.iterator();
    L4:
        if (r11.hasNext() == false) goto L8;
        Object r1 = r11.next();
        if (((Child) r1).isDir() == true) goto L4;
        r0.add(r1);
        goto L4
    L8:
        LinkedHashMap r12 = new LinkedHashMap();
        int r2 = r0.size();
        byte r3 = 0;
        int r4 = 0;
    L9:
        String r5 = null;
        if (r4 >= r2) goto L29;
        Object r6 = r0.get(r4);
        r4 = r4 + 1;
        Child r7 = (Child) r6;
        String r8 = r7.getAlbumId();
        if (r8 != null) goto L14;
    L20:
        String r9 = r7.getParentId();
        if (r9 != null) goto L23;
    L25:
        Object r13 = r12.get(r5);
        if (r13 != null) goto L28;
        r13 = new ArrayList();
        r12.put(r5, r13);
    L28:
        ((List) r13).add(r6);
        goto L9
    L23:
        if (qm4.u0(r9) == true) goto L25;
        r5 = r9;
        goto L25
    L14:
        if (qm4.u0(r8) == false) goto L17;
        r8 = null;
    L17:
        if (r8 == null) goto L20;
        r5 = r8;
        goto L25
    L29:
        ArrayList r14 = new ArrayList();
        Iterator r15 = r12.entrySet().iterator();
    L31:
        if (r15.hasNext() == false) goto L38;
        Map.Entry r16 = (Map.Entry) r15.next();
        String r17 = (String) r16.getKey();
        List r18 = (List) r16.getValue();
        if (r17 == null) goto L35;
        jo1 r19 = new jo1(r17, q40.K0(r18, new w60(1, new if1[]{new k2(21, r3), new k2(22, r3), new k2(23, r3)})));
    L36:
        if (r19 == null) goto L31;
        r14.add(r19);
        goto L31
    L35:
        r19 = null;
        goto L36
    L38:
        return r14;
    }

    public static Point f(ColorPickerView r4, Point r5, Point r6) {
        if (((int) Math.sqrt((Math.abs(r6.y - r5.y) * Math.abs(r6.y - r5.y)) + (Math.abs(r6.x - r5.x) * Math.abs(r6.x - r5.x)))) > 3) goto L5;
        return r6;
    L5:
        Point r0 = new Point((r6.x + r5.x) / 2, (r6.y + r5.y) / 2);
        if (Color.alpha(r4.d(r0.x, r0.y)) != 0) goto L10;
        return f(r4, r0, r6);
    L10:
        return f(r4, r5, r0);
    }

    public static final ArtistID3 g(String r10, ArtistWithAlbumsID3 r11) {
        if (r11 != null) goto L4;
    L6:
        List r0 = t();
        if (r10 != null) goto L9;
        return r11;
    L9:
        ArrayList r1 = e(r0);
        ArrayList r2 = new ArrayList();
        int r3 = r1.size();
        int r4 = 0;
        int r5 = 0;
    L10:
        if (r5 >= r3) goto L22;
        Object r6 = r1.get(r5);
        r5 = r5 + 1;
        jo1 r7 = (jo1) r6;
        if (h12.c(r7.d, r10) == true) goto L21;
        List r8 = r7.b;
        if (r8.isEmpty() == true) goto L10;
        Iterator r9 = r8.iterator();
    L18:
        if (r9.hasNext() == false) goto L10;
        if (h12.c(((Child) r9.next()).getArtistId(), r10) == false) goto L18;
    L21:
        r2.add(r6);
        goto L10
    L22:
        Date r12 = null;
        if (r11 == null) goto L25;
    L27:
        if (r11 == null) goto L29;
        ArtistWithAlbumsID3 r13 = r11;
    L30:
        u01 r14 = u01.n;
        if (r13 == null) goto L39;
        List<AlbumID3> r15 = r13.getAlbums();
        if (r15 != null) goto L35;
        r15 = r14;
    L35:
        List<AlbumID3> r16 = r13.getAppearsOn();
        if (r16 != null) goto L38;
        r16 = r14;
    L38:
        List<AlbumID3> r17 = q40.G0(r15, r16);
    L40:
        if (r17 != null) goto L42;
        r17 = r14;
    L42:
        int r18 = lg2.W(r40.k0(r17, 10));
        if (r18 >= 16) goto L45;
        r18 = 16;
    L45:
        LinkedHashMap r19 = new LinkedHashMap(r18);
        Iterator<T> r20 = r17.iterator();
    L47:
        if (r20.hasNext() == false) goto L49;
        Object r21 = r20.next();
        r19.put(((AlbumID3) r21).getId(), r21);
        goto L47
    L49:
        int r22 = r2.size();
        int r23 = 0;
    L50:
        if (r23 >= r22) goto L54;
        Object r24 = r2.get(r23);
        r23 = r23 + 1;
        if (h12.c(((jo1) r24).d, r10) == false) goto L50;
    L55:
        jo1 r25 = (jo1) r24;
        if (r25 != null) goto L58;
        r25 = (jo1) q40.x0(r2);
    L58:
        ArrayList r26 = new ArrayList(r40.k0(r2, 10));
        int r27 = r2.size();
    L59:
        if (r4 >= r27) goto L64;
        Object r28 = r2.get(r4);
        r4 = r4 + 1;
        jo1 r29 = (jo1) r28;
        AlbumID3 r30 = (AlbumID3) r19.get(r29.a);
        if (r30 != null) goto L63;
        r30 = Y(r29);
    L63:
        r26.add(r30);
        goto L59
    L64:
        ArtistWithAlbumsID3 r31 = new ArtistWithAlbumsID3(r26, r14);
        r31.setId(r10);
        if (r11 == null) goto L68;
        String r110 = r11.getName();
        if (r110 == null) goto L68;
    L71:
        r31.setName(r110);
        if (r11 == null) goto L75;
        String r111 = r11.getCoverArtId();
        if (r111 == null) goto L75;
    L80:
        r31.setCoverArtId(r111);
        r31.setAlbumCount(r2.size());
        if (r11 == null) goto L83;
        r12 = r11.getStarred();
    L83:
        r31.setStarred(r12);
        return r31;
    L75:
        if (r25 == null) goto L79;
        Child r112 = r25.c;
        if (r112 == null) goto L79;
        r111 = r112.getCoverArtId();
    L79:
        r111 = null;
    L68:
        if (r25 == null) goto L70;
        r110 = r25.e;
        goto L71
    L70:
        r110 = null;
        goto L71
    L54:
        r24 = null;
        goto L55
    L39:
        r17 = null;
        goto L40
    L29:
        r13 = null;
        goto L30
    L25:
        if (r2.isEmpty() == false) goto L27;
        return null;
    L4:
        if (O() == true) goto L6;
        return r11;
    }

    public static final List h(ArrayList r13) {
        if (r13 != null) goto L4;
    L6:
        List r1 = t();
        Iterable r14 = r13;
        if (r13 != null) goto L9;
        r14 = u01.n;
    L9:
        int r2 = lg2.W(r40.k0(r14, 10));
        if (r2 >= 16) goto L12;
        r2 = 16;
    L12:
        LinkedHashMap r3 = new LinkedHashMap(r2);
        Iterator r15 = r14.iterator();
    L14:
        if (r15.hasNext() == false) goto L16;
        Object r4 = r15.next();
        r3.put(((ArtistID3) r4).getId(), r4);
        goto L14
    L16:
        ArrayList r16 = e(r1);
        ArrayList r5 = new ArrayList();
        int r6 = r16.size();
        int r7 = 0;
        int r8 = 0;
    L17:
        if (r8 >= r6) goto L21;
        Object r9 = r16.get(r8);
        r8 = r8 + 1;
        if (((jo1) r9).d == null) goto L17;
        r5.add(r9);
        goto L17
    L21:
        LinkedHashMap r17 = new LinkedHashMap();
        int r10 = r5.size();
    L22:
        if (r7 >= r10) goto L27;
        Object r11 = r5.get(r7);
        r7 = r7 + 1;
        String r12 = ((jo1) r11).d;
        r12.getClass();
        Object r18 = r17.get(r12);
        if (r18 != null) goto L26;
        r18 = new ArrayList();
        r17.put(r12, r18);
    L26:
        ((List) r18).add(r11);
        goto L22
    L27:
        ArrayList r19 = new ArrayList(r17.size());
        Iterator r110 = r17.entrySet().iterator();
    L29:
        if (r110.hasNext() == false) goto L35;
        Map.Entry r20 = (Map.Entry) r110.next();
        String r21 = (String) r20.getKey();
        List r22 = (List) r20.getValue();
        ArtistID3 r23 = (ArtistID3) r3.get(r21);
        if (r23 != null) goto L33;
        r23 = new ArtistID3(r21, ((jo1) q40.w0(r22)).e, ((jo1) q40.w0(r22)).c.getCoverArtId(), r22.size(), null, 16, null);
    L33:
        r19.add(r23);
        goto L29
    L35:
        return new ArrayList(q40.K0(r19, new ca1(23)));
    L4:
        if (O() == true) goto L6;
        return r13;
    }

    public static dx2 i(dx2 r1, long r2) {
        return r1.c(new to(r2));
    }

    public static final boolean j(wv3 r18, wv3 r19, wv3 r20, int r21) {
        boolean r4 = k(r21, r20, r18);
        float r5 = r20.b;
        float r6 = r20.d;
        float r7 = r20.a;
        float r2 = r20.c;
        float r8 = r18.d;
        float r9 = r18.b;
        float r10 = r18.c;
        float r11 = r18.a;
        if (r4 == false) goto L5;
    L59:
        return false;
    L5:
        if (k(r21, r19, r18) == false) goto L59;
        if (r21 == 3) goto L10;
        if (r21 == 4) goto L14;
        if (r21 == 5) goto L18;
        if (r21 == 6) goto L22;
        kf2.o("This function should only be used for 2-D focus search");
        goto L59
    L22:
        if (r8 > r5) goto L57;
    L23:
        if (r21 == 3) goto L26;
        if (r21 == 4) goto L26;
        if (r21 != 3) goto L29;
        float r1 = r11 - r19.c;
    L36:
        if (r1 >= 0.0f) goto L38;
        r1 = 0.0f;
    L38:
        if (r21 != 3) goto L40;
        float r12 = r11 - r7;
    L47:
        if (r12 >= 1.0f) goto L50;
        r12 = 1.0f;
    L50:
        if (r1 >= r12) goto L52;
        return true;
    L52:
        return false;
    L40:
        if (r21 != 4) goto L42;
        r12 = r2 - r10;
        goto L47
    L42:
        if (r21 != 5) goto L44;
        r12 = r9 - r5;
        goto L47
    L44:
        if (r21 != 6) goto L53;
        r12 = r6 - r8;
        goto L47
    L53:
        kf2.o("This function should only be used for 2-D focus search");
        return false;
    L29:
        if (r21 != 4) goto L31;
        r1 = r19.a - r10;
        goto L36
    L31:
        if (r21 != 5) goto L33;
        r1 = r9 - r19.d;
        goto L36
    L33:
        if (r21 != 6) goto L55;
        r1 = r19.b - r8;
        goto L36
    L55:
        kf2.o("This function should only be used for 2-D focus search");
        return false;
    L26:
        return true;
    L57:
        return true;
    L18:
        if (r9 < r6) goto L57;
    L14:
        if (r10 > r7) goto L57;
    L10:
        if (r11 < r2) goto L57;
        goto L57
    }

    public static final boolean k(int r3, wv3 r4, wv3 r5) {
        if (r3 == 3) goto L8;
        if (r3 == 4) goto L8;
        if (r3 == 5) goto L19;
        if (r3 == 6) goto L19;
        kf2.o("This function should only be used for 2-D focus search");
        return false;
    L19:
        if (r4.c > r5.a) goto L21;
    L23:
        return false;
    L21:
        if (r4.a >= r5.c) goto L23;
        return true;
    L8:
        if (r4.d > r5.b) goto L10;
    L12:
        return false;
    L10:
        if (r4.b >= r5.d) goto L12;
        return true;
    }

    public static fb4 l(fb4 r1) {
        ag2 r0 = r1.n;
        r0.b();
        if (r0.v <= 0) goto L6;
        return r1;
    L6:
        return fb4.o;
    }

    public static final void m(ba1 r8, f13 r9) {
        if (r8.n.A == true) goto L5;
        cz1.b("visitChildren called on an unattached node");
    L5:
        f13 r0 = new f13(new cx2[16]);
        cx2 r10 = r8.n;
        cx2 r2 = r10.s;
        if (r2 != null) goto L8;
        j51.b(r0, r10);
    L9:
        int r11 = r0.p;
        if (r11 == 0) goto L52;
        cx2 r12 = (cx2) r0.k(r11 - 1);
        if ((r12.q & 1024) == 0) goto L13;
    L14:
        if (r12 == null) goto L9;
        if ((r12.p & 1024) != 0) goto L17;
        r12 = r12.s;
        goto L14
    L17:
        f13 r3 = null;
    L18:
        if (r12 == null) goto L9;
        if ((r12 instanceof ba1) == true) goto L21;
        if ((r12.p & 1024) == 0) goto L50;
        if ((r12 instanceof fo0) == false) goto L50;
        cx2 r4 = ((fo0) r12).C;
        int r5 = 0;
    L36:
        if (r4 == null) goto L48;
        if ((r4.p & 1024) == 0) goto L47;
        r5 = r5 + 1;
        if (r5 != 1) goto L42;
        r12 = r4;
        goto L47
    L42:
        if (r3 != null) goto L44;
        r3 = new f13(new cx2[16]);
    L44:
        if (r12 == null) goto L46;
        r3.b(r12);
        r12 = null;
    L46:
        r3.b(r4);
    L47:
        r4 = r4.s;
        goto L36
    L48:
        if (r5 == 1) goto L18;
    L50:
        r12 = j51.c(r3);
        goto L18
    L21:
        ba1 r13 = (ba1) r12;
        if (r13.A == false) goto L50;
        if (j51.O(r13).Z == true) goto L50;
        if (r13.s0().a == false) goto L29;
        r9.b(r13);
        goto L50
    L29:
        m(r13, r9);
        goto L50
    L13:
        j51.b(r0, r12);
        goto L9
    L52:
        return;
    L8:
        r0.b(r2);
        goto L9
    }

    public static final ce n(ce r4) {
        ce r0 = r4.c();
        int r1 = r0.b();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        r0.d(r2, r4.a(r2));
        r2 = r2 + 1;
        goto L3
    L5:
        return r0;
    }

    public static final s14 o(Throwable r1) {
        r1.getClass();
        return new s14(r1);
    }

    public static kj1 p(Bundle r10) {
        r10.getClass();
        String r3 = r10.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID");     // Catch: Exception -> L10
        String r4 = r10.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN");     // Catch: Exception -> L10
        String r5 = r10.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME");     // Catch: Exception -> L10
        String r6 = r10.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME");     // Catch: Exception -> L10
        String r7 = r10.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME");     // Catch: Exception -> L10
        if (Build.VERSION.SDK_INT < 33) goto L7;
        Uri r0 = (Uri) n3.p(r10);     // Catch: Exception -> L10
    L6:
        Uri r8 = r0;
        String r9 = r10.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER");     // Catch: Exception -> L10
        r3.getClass();     // Catch: Exception -> L10
        r4.getClass();     // Catch: Exception -> L10
        return new kj1(r3, r4, r5, r6, r7, r8, r9);
    L7:
        r0 = (Uri) r10.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI");     // Catch: Exception -> L10
    L10:
        e = move-exception;
        throw new GoogleIdTokenParsingException(e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object q(a90 r1, qr3 r2) {
        if (((cx2) r1).n.A == true) goto L5;
        cz1.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
    L5:
        mf3 r3 = (mf3) j51.O(r1).M;
        r3.getClass();
        return vr1.C(r3, r2);
    }

    public static final Set r(List r2, int r3) {
        String r4 = (String) q40.y0(r2, r3);
        if (r4 != null) goto L5;
        r4 = "";
    L5:
        List r5 = qm4.C0(r4, new String[]{","}, 6);
        ArrayList r6 = new ArrayList();
        Iterator r7 = r5.iterator();
    L7:
        if (r7.hasNext() == false) goto L12;
        Object r0 = r7.next();
        if (qm4.u0((String) r0) == true) goto L7;
        r6.add(r0);
        goto L7
    L12:
        return q40.T0(r6);
    }

    public static final Directory s(String r48, Directory r49) {
        if (r49 != null) goto L5;
    L7:
        List r1 = t();
        Directory r3 = null;
        ArrayList r4 = null;
        Object r5 = null;
        r3 = null;
        if (r49 == null) goto L37;
        HashSet r2 = new HashSet();
        Iterator r6 = r1.iterator();
    L11:
        if (r6.hasNext() == false) goto L15;
        String r7 = ((Child) r6.next()).getId();
        if (r7 == null) goto L11;
        r2.add(r7);
        goto L11
    L15:
        HashSet r8 = new HashSet();
        Iterator r9 = r1.iterator();
    L17:
        if (r9.hasNext() == false) goto L24;
        Child r10 = (Child) r9.next();
        Iterator r11 = gb.P(new String[]{r10.getAlbumId(), r10.getParentId(), r10.getArtistId()}).iterator();
    L20:
        if (r11.hasNext() == false) goto L17;
        String r12 = (String) r11.next();
        if (r12 == null) goto L20;
        r8.add(r12);
        goto L20
    L24:
        List<Child> r13 = r49.getChildren();
        if (r13 == null) goto L35;
        r4 = new ArrayList();
        Iterator<T> r14 = r13.iterator();
    L28:
        if (r14.hasNext() == false) goto L35;
        Object r15 = r14.next();
        Child r16 = (Child) r15;
        boolean r17 = r16.isDir();
        String r18 = r16.getId();
        if (r17 == false) goto L32;
        boolean r19 = r8.contains(r18);
    L33:
        if (r19 == false) goto L28;
        r4.add(r15);
        goto L28
    L32:
        r19 = r2.contains(r18);
    L35:
        r49.setChildren(r4);
        return r49;
    L37:
        if (r48 == null) goto L81;
        ArrayList r0 = e(r1);
        int r20 = r0.size();
        int r21 = 0;
        int r22 = 0;
    L40:
        if (r22 >= r20) goto L44;
        Object r23 = r0.get(r22);
        r22 = r22 + 1;
        if (((jo1) r23).a.equals(r48) == false) goto L40;
    L45:
        jo1 r24 = (jo1) r23;
        if (r24 == null) goto L49;
        Directory r25 = new Directory(r24.b, r48, r24.d, r24.c.getAlbum(), null, null, null, null, 240, null);
    L48:
        r3 = r25;
        goto L81
    L49:
        ArrayList r26 = new ArrayList();
        int r27 = r0.size();
        int r28 = 0;
    L50:
        if (r28 >= r27) goto L63;
        Object r29 = r0.get(r28);
        r28 = r28 + 1;
        jo1 r30 = (jo1) r29;
        if (h12.c(r30.d, r48) == true) goto L61;
        List r31 = r30.b;
        if (r31.isEmpty() == true) goto L50;
        Iterator r32 = r31.iterator();
    L58:
        if (r32.hasNext() == false) goto L50;
        if (h12.c(((Child) r32.next()).getArtistId(), r48) == false) goto L58;
    L61:
        r26.add(r29);
        goto L50
    L63:
        if (r26.isEmpty() == true) goto L81;
        ArrayList r33 = new ArrayList(r40.k0(r26, 10));
        int r34 = r26.size();
        int r35 = 0;
    L66:
        if (r35 >= r34) goto L68;
        Object r36 = r26.get(r35);
        r35 = r35 + 1;
        jo1 r37 = (jo1) r36;
        String r38 = r37.a;
        Child r110 = r37.c;
        Child r39 = new Child(r38, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 7, null);
        r39.setDir(true);
        r39.setParentId(r48);
        r39.setTitle(r110.getAlbum());
        r39.setAlbum(r110.getAlbum());
        r39.setArtist(r37.e);
        r39.setArtistId(r48);
        r39.setAlbumId(r37.a);
        r39.setCoverArtId(r110.getCoverArtId());
        r39.setYear(r110.getYear());
        r33.add(r39);
        goto L66
    L68:
        List r40 = q40.K0(r33, new ca1(24));
        int r41 = r26.size();
    L69:
        if (r21 >= r41) goto L73;
        Object r42 = r26.get(r21);
        r21 = r21 + 1;
        if (h12.c(((jo1) r42).d, r48) == false) goto L69;
        r5 = r42;
    L73:
        jo1 r43 = (jo1) r5;
        if (r43 == null) goto L79;
        String r44 = r43.e;
        if (r44 == null) goto L79;
    L78:
        String r45 = r44;
        r25 = new Directory(r40, r48, null, r45, null, null, null, null, 244, null);
    L79:
        r44 = ((jo1) q40.w0(r26)).e;
        goto L78
    L44:
        r23 = null;
    L81:
        if (r3 == null) goto L83;
        return r3;
    L83:
        return new Directory(u01.n, r48, null, App.a().getString(app.homemusic.R.string.homemusic_offline_nothing), null, null, null, null, 244, null);
    L5:
        if (O() == true) goto L7;
        return r49;
    }

    public static List t() {
        int r2 = 10;
        lg1 r1 = new lg1(r2, AppDatabase.y().w());
        Thread r0 = new Thread(r1);
        r0.start();
        r0.join();     // Catch: InterruptedException -> L5
    L7:
        List r3 = (List) r1.p;
        r3.getClass();
        return r3;
    L5:
        e = move-exception;
        e.printStackTrace();
        goto L7
    }

    public static final ba1 u(f13 r7, wv3 r8, int r9) {
        ba1 r1 = null;
        if (r9 != 3) goto L6;
        wv3 r0 = r8.e((r8.c - r8.a) + 1.0f, 0.0f);
    L14:
        Object[] r2 = r7.n;
        int r10 = r7.p;
        int r3 = 0;
    L15:
        if (r3 >= r10) goto L22;
        ba1 r4 = (ba1) r2[r3];
        if (te5.B(r4) == false) goto L21;
        wv3 r5 = te5.r(r4);
        if (F(r5, r0, r8, r9) == false) goto L21;
        r1 = r4;
        r0 = r5;
    L21:
        r3 = r3 + 1;
        goto L15
    L22:
        return r1;
    L6:
        if (r9 != 4) goto L9;
        r0 = r8.e(-((r8.c - r8.a) + 1.0f), 0.0f);
        goto L14
    L9:
        if (r9 != 5) goto L12;
        r0 = r8.e(0.0f, (r8.d - r8.b) + 1.0f);
        goto L14
    L12:
        if (r9 != 6) goto L23;
        r0 = r8.e(0.0f, -((r8.d - r8.b) + 1.0f));
        goto L14
    L23:
        kf2.o("This function should only be used for 2-D focus search");
        return null;
    }

    public static final boolean v(ba1 r4, int r5, if1 r6) {
        f13 r0 = new f13(new ba1[16]);
        m(r4, r0);
        int r1 = r0.p;
        if (r1 > 1) goto L12;
        if (r1 != 0) goto L6;
        Object r7 = null;
    L7:
        ba1 r8 = (ba1) r7;
        if (r8 != null) goto L10;
    L29:
        return false;
    L10:
        return ((Boolean) r6.invoke(r8)).booleanValue();
    L6:
        r7 = r0.n[0];
        goto L7
    L12:
        if (r5 != 7) goto L14;
        r5 = 4;
    L14:
        if (r5 != 4) goto L17;
    L18:
        wv3 r9 = te5.r(r4);
        float r2 = r9.a;
        float r10 = r9.b;
        wv3 r3 = new wv3(r2, r10, r2, r10);
    L25:
        ba1 r11 = u(r0, r3, r5);
        if (r11 == null) goto L29;
        return ((Boolean) r6.invoke(r11)).booleanValue();
    L17:
        if (r5 == 6) goto L18;
        if (r5 != 3) goto L23;
    L24:
        wv3 r12 = te5.r(r4);
        float r13 = r12.c;
        float r14 = r12.d;
        r3 = new wv3(r13, r14, r13, r14);
        goto L25
    L23:
        if (r5 == 5) goto L24;
        kf2.o("This function should only be used for 2-D focus search");
        return false;
    }

    public static final pe0 w(Executor r1) {
        return new y21(r1);
    }

    public static final boolean x(int r8, dd0 r9, ba1 r10, wv3 r11) {
        if (R(r8, r9, r10, r11) == false) goto L6;
        return true;
    L6:
        Boolean r12 = (Boolean) uc5.U(r10, r8, new x50(((ey) ((ra) j51.P(r10)).getFocusOwner()).f(), r10, r11, r8, r9, 2));
        if (r12 != null) goto L9;
        return false;
    L9:
        return r12.booleanValue();
    }

    public static final j54 y(View r3) {
        r3.getClass();
    L4:
        if (r3 == null) goto L15;
        Object r1 = r3.getTag(app.homemusic.R.id.view_tree_saved_state_registry_owner);
        if ((r1 instanceof j54) == false) goto L8;
        j54 r2 = (j54) r1;
    L9:
        if (r2 != null) goto L10;
        Object r4 = au0.z(r3);
        if ((r4 instanceof View) == true) goto L13;
        r3 = null;
        goto L4
    L13:
        r3 = (View) r4;
        goto L4
    L10:
        return r2;
    L8:
        r2 = null;
        goto L9
    L15:
        return null;
    }

    public static Point z(ColorPickerView r7, Point r8) {
        Point r0 = new Point(r7.getWidth() / 2, r7.getMeasuredHeight() / 2);
        if (r7.e() == false) goto L10;
        float r1 = r7.getWidth() * 0.5f;
        float r9 = r7.getHeight() * 0.5f;
        float r2 = r8.x - r1;
        float r10 = r8.y - r9;
        float r3 = Math.min(r1, r9);
        double r4 = Math.sqrt((r10 * r10) + (r2 * r2));
        double r5 = r3;
        if (r4 <= r5) goto L8;
        double r6 = r5 / r4;
        r2 = (float) (((double) r2) * r6);
        r10 = (float) (((double) r10) * r6);
    L8:
        return new Point((int) (r2 + r1), (int) (r10 + r9));
    L10:
        if (r7.E == true) goto L13;
        return r8;
    L13:
        return f(r7, r8, r0);
    }
}
