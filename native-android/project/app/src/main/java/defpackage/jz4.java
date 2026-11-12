package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import app.homemusic.R;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.SongListPageFragment;
import com.google.android.material.appbar.MaterialToolbar;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
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
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jz4 {
    public static final ca1 a = null;
    public static final String[] b = null;
    public static final int[] c = null;
    public static final int[] d = null;
    public static final int[] e = null;
    public static final int[] f = null;
    public static final int[] g = null;
    public static final int[] h = null;
    public static final StackTraceElement[] i = null;

    static {
        a = new ca1(17);
        b = new String[]{"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
        c = new int[]{44100, 48000, 32000};
        d = new int[]{32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
        e = new int[]{32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
        f = new int[]{32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
        g = new int[]{32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
        h = new int[]{8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
        i = new StackTraceElement[0];
    }

    public static boolean A(int r3, Object r4) {
        if ((r4 instanceof sf1) == true) goto L5;
    L73:
        return false;
    L5:
        if ((r4 instanceof gg1) == false) goto L8;
        int r5 = ((gg1) r4).getArity();
    L71:
        if (r5 != r3) goto L73;
        return true;
    L8:
        if ((r4 instanceof gf1) == false) goto L11;
        r5 = 0;
        goto L71
    L11:
        if ((r4 instanceof if1) == false) goto L14;
        r5 = 1;
        goto L71
    L14:
        if ((r4 instanceof wf1) == false) goto L17;
        r5 = 2;
        goto L71
    L17:
        if ((r4 instanceof xf1) == false) goto L20;
        r5 = 3;
        goto L71
    L20:
        if ((r4 instanceof yf1) == false) goto L23;
        r5 = 4;
        goto L71
    L23:
        if ((r4 instanceof zf1) == false) goto L26;
        r5 = 5;
        goto L71
    L26:
        if ((r4 instanceof ag1) == false) goto L29;
        r5 = 6;
        goto L71
    L29:
        if ((r4 instanceof bg1) == false) goto L32;
        r5 = 7;
        goto L71
    L32:
        if ((r4 instanceof cg1) == false) goto L35;
        r5 = 8;
        goto L71
    L35:
        if ((r4 instanceof dg1) == false) goto L38;
        r5 = 9;
        goto L71
    L38:
        if ((r4 instanceof hf1) == false) goto L41;
        r5 = 10;
        goto L71
    L41:
        if ((r4 instanceof jf1) == false) goto L44;
        r5 = 11;
        goto L71
    L44:
        if ((r4 instanceof lf1) == false) goto L47;
        r5 = 13;
        goto L71
    L47:
        if ((r4 instanceof mf1) == false) goto L50;
        r5 = 14;
        goto L71
    L50:
        if ((r4 instanceof nf1) == false) goto L53;
        r5 = 15;
        goto L71
    L53:
        if ((r4 instanceof of1) == false) goto L56;
        r5 = 16;
        goto L71
    L56:
        if ((r4 instanceof pf1) == false) goto L59;
        r5 = 17;
        goto L71
    L59:
        if ((r4 instanceof qf1) == false) goto L62;
        r5 = 18;
        goto L71
    L62:
        if ((r4 instanceof rf1) == false) goto L65;
        r5 = 19;
        goto L71
    L65:
        if ((r4 instanceof tf1) == false) goto L68;
        r5 = 20;
        goto L71
    L68:
        if ((r4 instanceof uf1) == false) goto L70;
        r5 = 21;
        goto L71
    L70:
        r5 = -1;
        goto L71
    }

    public static final boolean B(float[] r5) {
        if (r5.length >= 16) goto L6;
        return false;
    L6:
        if (r5[0] == 1.0f) goto L8;
    L38:
        return false;
    L8:
        if (r5[1] != 0.0f) goto L38;
        if (r5[2] != 0.0f) goto L38;
        if (r5[3] != 0.0f) goto L38;
        if (r5[4] != 0.0f) goto L38;
        if (r5[5] != 1.0f) goto L38;
        if (r5[6] != 0.0f) goto L38;
        if (r5[7] != 0.0f) goto L38;
        if (r5[8] != 0.0f) goto L38;
        if (r5[9] != 0.0f) goto L38;
        if (r5[10] != 1.0f) goto L38;
        if (r5[11] != 0.0f) goto L38;
        if (r5[12] != 0.0f) goto L38;
        if (r5[13] != 0.0f) goto L38;
        if (r5[14] != 0.0f) goto L38;
        if (r5[15] != 1.0f) goto L38;
        return true;
    }

    public static boolean C(Child r2) {
        String r0 = r2.getId();
        if (r2.getStarred() == null) goto L5;
        boolean r3 = true;
    L7:
        return n61.f(1, r0, r3);
    L5:
        r3 = false;
        goto L7
    }

    public static boolean D(Context r1, Child r2) {
        if (ud3.o() != null) goto L7;
        eu0 r3 = au0.w(r1);
        String r4 = r2.getId();
        r3.getClass();
        return eu0.d(r4);
    L7:
        if (g51.e(r2) == null) goto L10;
        return true;
    L10:
        return false;
    }

    public static final void E(Context r10) {
        r10.getClass();
        File r1 = r10.getDatabasePath("androidx.work.workdb");
        r1.getClass();
        if (r1.exists() == false) goto L27;
        cx.f().b(nc5.a, "Migrating WorkDatabase to the no-backup directory");
        File r2 = r10.getDatabasePath("androidx.work.workdb");
        r2.getClass();
        File r11 = r10.getNoBackupFilesDir();
        r11.getClass();
        File r3 = new File(r11, "androidx.work.workdb");
        String[] r12 = nc5.b;
        int r0 = lg2.W(r12.length);
        if (r0 >= 16) goto L7;
        r0 = 16;
    L7:
        LinkedHashMap r4 = new LinkedHashMap(r0);
        int r5 = r12.length;
        int r6 = 0;
    L8:
        if (r6 >= r5) goto L11;
        String r7 = r12[r6];
        r4.put(new File(r2.getPath() + r7), new File(r3.getPath() + r7));
        r6 = r6 + 1;
        goto L8
    L11:
        if (r4.isEmpty() == false) goto L13;
        Map r13 = Collections.singletonMap(r2, r3);
        r13.getClass();
        Map r14 = r13;
    L14:
        Iterator r15 = r14.entrySet().iterator();
    L16:
        if (r15.hasNext() == false) goto L34;
        Map.Entry r8 = (Map.Entry) r15.next();
        File r9 = (File) r8.getKey();
        File r16 = (File) r8.getValue();
        if (r9.exists() == false) goto L16;
        if (r16.exists() == false) goto L23;
        cx.f().k(nc5.a, "Over-writing contents of " + r16);
    L23:
        if (r9.renameTo(r16) == false) goto L25;
        String r17 = "Migrated " + r9 + "to " + r16;
    L26:
        cx.f().b(nc5.a, r17);
        goto L16
    L25:
        r17 = "Renaming " + r9 + " to " + r16 + " failed";
        goto L26
    L34:
        return;
    L13:
        LinkedHashMap r18 = new LinkedHashMap(r4);
        r18.put(r2, r3);
        r14 = r18;
        goto L14
    }

    public static String F(StringBuilder r7, int r8, int r9) {
        if (r8 < r9) goto L6;
        return r7.toString();
    L6:
        if (r7.charAt(r8) != '/') goto L8;
        r8 = r8 + 1;
    L8:
        int r0 = r8;
        int r2 = r0;
    L9:
        if (r0 > r9) goto L36;
        if (r0 == r9) goto L11;
        if (r7.charAt(r0) == '/') goto L14;
        r0 = r0 + 1;
        goto L9
    L14:
        int r3 = r0 + 1;
    L15:
        int r4 = r2 + 1;
        if (r0 != r4) goto L21;
        if (r7.charAt(r2) != '.') goto L21;
        r7.delete(r2, r3);
        r9 = r9 - (r3 - r2);
    L33:
        r0 = r2;
    L21:
        if (r0 == (r2 + 2)) goto L23;
    L32:
        int r1 = r0 + 1;
    L31:
        r2 = r1;
        goto L33
    L23:
        if (r7.charAt(r2) != '.') goto L32;
        if (r7.charAt(r4) != '.') goto L32;
        r1 = r7.lastIndexOf("/", r2 - 2) + 1;
        if (r1 <= r8) goto L29;
        int r5 = r1;
    L30:
        r7.delete(r5, r3);
        r9 = r9 - (r3 - r5);
        goto L31
    L29:
        r5 = r8;
        goto L30
    L11:
        r3 = r0;
        goto L15
    L36:
        return r7.toString();
    }

    public static String G(String r10, String r11) {
        StringBuilder r0 = new StringBuilder();
        if (r10 != null) goto L5;
        r10 = "";
    L5:
        if (r11 != null) goto L7;
        r11 = "";
    L7:
        int[] r1 = x(r11);
        if (r1[0] == (-1)) goto L11;
        r0.append(r11);
        F(r0, r1[1], r1[2]);
        return r0.toString();
    L11:
        int[] r3 = x(r10);
        if (r1[3] != 0) goto L16;
        r0.append(r10, 0, r3[3]);
        r0.append(r11);
        return r0.toString();
    L16:
        if (r1[2] != 0) goto L19;
        r0.append(r10, 0, r3[2]);
        r0.append(r11);
        return r0.toString();
    L19:
        int r7 = r1[1];
        if (r7 == 0) goto L24;
        int r4 = r3[0] + 1;
        r0.append(r10, 0, r4);
        r0.append(r11);
        return F(r0, r1[1] + r4, r4 + r1[2]);
    L24:
        if (r11.charAt(r7) != '/') goto L27;
        r0.append(r10, 0, r3[1]);
        r0.append(r11);
        int r12 = r3[1];
        return F(r0, r12, r1[2] + r12);
    L27:
        int r8 = r3[0] + 2;
        int r9 = r3[1];
        if (r8 < r9) goto L30;
    L33:
        int r13 = r10.lastIndexOf(47, r3[2] - 1);
        if (r13 != (-1)) goto L36;
        int r5 = r3[1];
    L37:
        r0.append(r10, 0, r5);
        r0.append(r11);
        return F(r0, r3[1], r5 + r1[2]);
    L36:
        r5 = r13 + 1;
        goto L37
    L30:
        if (r9 != r3[2]) goto L33;
        r0.append(r10, 0, r9);
        r0.append('/');
        r0.append(r11);
        int r14 = r3[1];
        return F(r0, r14, (r1[2] + r14) + 1);
    }

    public static Uri H(String r0, String r1) {
        return Uri.parse(G(r0, r1));
    }

    public static int I(long r2) {
        if (r2 <= 2147483647L) goto L7;
        return Integer.MAX_VALUE;
    L7:
        if (r2 >= (-2147483648L)) goto L11;
        return Integer.MIN_VALUE;
    L11:
        return (int) r2;
    }

    public static void J(Context r6, List r7, boolean r8) {
        d34 r0 = new d34(25);
        Iterator r1 = r7.iterator();
    L4:
        if (r1.hasNext() == false) goto L18;
        Child r2 = (Child) r1.next();
        Date r4 = null;
        if (ot1.c(r2.getId()) == false) goto L9;
        ConcurrentHashMap r3 = ot1.a;
        ot1.g(r6, r2, r8);
    L15:
        if (r8 == false) goto L17;
        r4 = new Date();
    L17:
        r2.setStarred(r4);
        goto L4
    L9:
        if (hw.t() == false) goto L11;
        r0.J(r2.getId(), null, r8, null);
        goto L15
    L11:
        mf4 r5 = new mf4(r0, r2, r8);
        String r9 = r2.getId();
        if (r8 == false) goto L14;
        d34.I(r9, null, null, r5);
        goto L15
    L14:
        d34.K(r9, null, null, r5);
        goto L15
    L18:
        if (r8 == true) goto L20;
        return;
    L20:
        if (hw.t() == false) goto L22;
        return;
    L22:
        if (ud3.X() == true) goto L24;
        return;
    L24:
        if (ud3.o() != null) goto L49;
        ArrayList r10 = new ArrayList();
        Iterator r11 = r7.iterator();
    L27:
        if (r11.hasNext() == false) goto L34;
        Object r12 = r11.next();
        Child r13 = (Child) r12;
        if (ot1.c(r13.getId()) == true) goto L27;
        if (D(r6, r13) == true) goto L27;
        r10.add(r12);
        goto L27
    L34:
        p(r6, r10);
        return;
    }

    public static String K(String r1) {
        int r0 = r1.hashCode();
        switch(r0) {
            case -2061550653: goto L300;
            case -2056817302: goto L295;
            case -2034166429: goto L290;
            case -1979556166: goto L285;
            case -1571515090: goto L280;
            case -1383349348: goto L275;
            case -1383343454: goto L270;
            case -1325958191: goto L265;
            case -1182275604: goto L262;
            case -1062240117: goto L257;
            case -688322466: goto L252;
            case -527879800: goto L247;
            case -515992664: goto L242;
            case -246476834: goto L239;
            case -207262728: goto L236;
            case -165139126: goto L231;
            case 104431: goto L228;
            case 3039496: goto L223;
            case 3052374: goto L218;
            case 3327612: goto L213;
            case 64711720: goto L208;
            case 65821278: goto L203;
            case 77230534: goto L200;
            case 97526364: goto L197;
            case 109413500: goto L194;
            case 155276373: goto L191;
            case 226173651: goto L188;
            case 344809556: goto L185;
            case 398507100: goto L182;
            case 398585941: goto L177;
            case 398795216: goto L174;
            case 482629606: goto L171;
            case 499831342: goto L166;
            case 577341676: goto L161;
            case 599019395: goto L158;
            case 761287205: goto L155;
            case 1052881309: goto L150;
            case 1063877011: goto L145;
            case 1195259493: goto L140;
            case 1275614662: goto L135;
            case 1383693018: goto L132;
            case 1630335596: goto L127;
            case 1877171123: goto L124;
            default: goto L4;
        };
    L4:
        switch(r0) {
            case -1811142716: goto L119;
            case -1811142715: goto L114;
            case -1811142714: goto L109;
            case -1811142713: goto L104;
            case -1811142712: goto L99;
            case -1811142711: goto L94;
            case -1811142710: goto L89;
            case -1811142709: goto L84;
            case -1811142708: goto L79;
            case -1811142707: goto L74;
            default: goto L5;
        };
    L5:
        switch(r0) {
            case -1811142685: goto L69;
            case -1811142684: goto L64;
            case -1811142683: goto L59;
            default: goto L6;
        };
    L6:
        switch(r0) {
            case 80123371: goto L54;
            case 80123372: goto L49;
            case 80123373: goto L44;
            case 80123374: goto L39;
            case 80123375: goto L34;
            case 80123376: goto L29;
            case 80123377: goto L24;
            case 80123378: goto L19;
            case 80123379: goto L14;
            case 80123380: goto L9;
            default: goto L313;
        };
    L313:
        return null;
    L9:
        if (r1.equals("kotlin.jvm.functions.Function9") == false) goto L314;
        return "Function9";
    L314:
        return null;
    L14:
        if (r1.equals("kotlin.jvm.functions.Function8") == false) goto L315;
        return "Function8";
    L315:
        return null;
    L19:
        if (r1.equals("kotlin.jvm.functions.Function7") == false) goto L316;
        return "Function7";
    L316:
        return null;
    L24:
        if (r1.equals("kotlin.jvm.functions.Function6") == false) goto L317;
        return "Function6";
    L317:
        return null;
    L29:
        if (r1.equals("kotlin.jvm.functions.Function5") == false) goto L318;
        return "Function5";
    L318:
        return null;
    L34:
        if (r1.equals("kotlin.jvm.functions.Function4") == false) goto L319;
        return "Function4";
    L319:
        return null;
    L39:
        if (r1.equals("kotlin.jvm.functions.Function3") == false) goto L320;
        return "Function3";
    L320:
        return null;
    L44:
        if (r1.equals("kotlin.jvm.functions.Function2") == false) goto L321;
        return "Function2";
    L321:
        return null;
    L49:
        if (r1.equals("kotlin.jvm.functions.Function1") == false) goto L322;
        return "Function1";
    L322:
        return null;
    L54:
        if (r1.equals("kotlin.jvm.functions.Function0") == false) goto L323;
        return "Function0";
    L323:
        return null;
    L59:
        if (r1.equals("kotlin.jvm.functions.Function22") == false) goto L324;
        return "Function22";
    L324:
        return null;
    L64:
        if (r1.equals("kotlin.jvm.functions.Function21") == false) goto L325;
        return "Function21";
    L325:
        return null;
    L69:
        if (r1.equals("kotlin.jvm.functions.Function20") == false) goto L326;
        return "Function20";
    L326:
        return null;
    L74:
        if (r1.equals("kotlin.jvm.functions.Function19") == false) goto L327;
        return "Function19";
    L327:
        return null;
    L79:
        if (r1.equals("kotlin.jvm.functions.Function18") == false) goto L328;
        return "Function18";
    L328:
        return null;
    L84:
        if (r1.equals("kotlin.jvm.functions.Function17") == false) goto L329;
        return "Function17";
    L329:
        return null;
    L89:
        if (r1.equals("kotlin.jvm.functions.Function16") == false) goto L330;
        return "Function16";
    L330:
        return null;
    L94:
        if (r1.equals("kotlin.jvm.functions.Function15") == false) goto L331;
        return "Function15";
    L331:
        return null;
    L99:
        if (r1.equals("kotlin.jvm.functions.Function14") == false) goto L332;
        return "Function14";
    L332:
        return null;
    L104:
        if (r1.equals("kotlin.jvm.functions.Function13") == false) goto L333;
        return "Function13";
    L333:
        return null;
    L109:
        if (r1.equals("kotlin.jvm.functions.Function12") == false) goto L334;
        return "Function12";
    L334:
        return null;
    L114:
        if (r1.equals("kotlin.jvm.functions.Function11") == false) goto L335;
        return "Function11";
    L335:
        return null;
    L119:
        if (r1.equals("kotlin.jvm.functions.Function10") == false) goto L336;
        return "Function10";
    L336:
        return null;
    L124:
        if (r1.equals("kotlin.jvm.internal.IntCompanionObject") == false) goto L337;
        return "Companion";
    L337:
        return null;
    L127:
        if (r1.equals("java.lang.Throwable") == false) goto L338;
        return "Throwable";
    L338:
        return null;
    L132:
        if (r1.equals("kotlin.jvm.internal.BooleanCompanionObject") == true) goto L379;
        return null;
    L379:
        return "Companion";
    L135:
        if (r1.equals("java.lang.Iterable") == false) goto L340;
        return "Iterable";
    L340:
        return null;
    L140:
        if (r1.equals("java.lang.String") == false) goto L341;
        return "String";
    L341:
        return null;
    L145:
        if (r1.equals("java.lang.Object") == false) goto L342;
        return "Any";
    L342:
        return null;
    L150:
        if (r1.equals("java.lang.Number") == false) goto L343;
        return "Number";
    L343:
        return null;
    L155:
        if (r1.equals("java.lang.Double") == false) goto L344;
        return "Double";
    L344:
        return null;
    L158:
        if (r1.equals("kotlin.jvm.internal.StringCompanionObject") == true) goto L380;
        return null;
    L380:
        return "Companion";
    L161:
        if (r1.equals("java.util.ListIterator") == false) goto L346;
        return "ListIterator";
    L346:
        return null;
    L166:
        if (r1.equals("java.util.Iterator") == false) goto L347;
        return "Iterator";
    L347:
        return null;
    L171:
        if (r1.equals("kotlin.jvm.internal.FloatCompanionObject") == true) goto L381;
        return null;
    L381:
        return "Companion";
    L174:
        if (r1.equals("java.lang.Long") == false) goto L349;
        return "Long";
    L349:
        return null;
    L177:
        if (r1.equals("java.lang.Enum") == false) goto L350;
        return "Enum";
    L350:
        return null;
    L182:
        if (r1.equals("java.lang.Byte") == false) goto L351;
        return "Byte";
    L351:
        return null;
    L185:
        if (r1.equals("java.lang.Boolean") == false) goto L352;
        return "Boolean";
    L352:
        return null;
    L188:
        if (r1.equals("kotlin.jvm.internal.EnumCompanionObject") == true) goto L382;
        return null;
    L382:
        return "Companion";
    L191:
        if (r1.equals("java.lang.Character") == false) goto L354;
        return "Char";
    L354:
        return null;
    L194:
        if (r1.equals("short") == false) goto L355;
        return "Short";
    L355:
        return null;
    L197:
        if (r1.equals("float") == false) goto L356;
        return "Float";
    L356:
        return null;
    L200:
        if (r1.equals("kotlin.jvm.internal.ShortCompanionObject") == true) goto L383;
        return null;
    L383:
        return "Companion";
    L203:
        if (r1.equals("java.util.List") == false) goto L358;
        return "List";
    L358:
        return null;
    L208:
        if (r1.equals("boolean") == false) goto L359;
        return "Boolean";
    L359:
        return null;
    L213:
        if (r1.equals("long") == false) goto L360;
        return "Long";
    L360:
        return null;
    L218:
        if (r1.equals("char") == false) goto L361;
        return "Char";
    L361:
        return null;
    L223:
        if (r1.equals("byte") == false) goto L362;
        return "Byte";
    L362:
        return null;
    L228:
        if (r1.equals("int") == false) goto L363;
        return "Int";
    L363:
        return null;
    L231:
        if (r1.equals("java.util.Map$Entry") == false) goto L364;
        return "Entry";
    L364:
        return null;
    L236:
        if (r1.equals("kotlin.jvm.internal.LongCompanionObject") == true) goto L384;
        return null;
    L384:
        return "Companion";
    L239:
        if (r1.equals("kotlin.jvm.internal.CharCompanionObject") == true) goto L385;
        return null;
    L385:
        return "Companion";
    L242:
        if (r1.equals("java.lang.Short") == false) goto L367;
        return "Short";
    L367:
        return null;
    L247:
        if (r1.equals("java.lang.Float") == false) goto L368;
        return "Float";
    L368:
        return null;
    L252:
        if (r1.equals("java.util.Collection") == false) goto L369;
        return "Collection";
    L369:
        return null;
    L257:
        if (r1.equals("java.lang.CharSequence") == false) goto L370;
        return "CharSequence";
    L370:
        return null;
    L262:
        if (r1.equals("kotlin.jvm.internal.ByteCompanionObject") == true) goto L386;
        return null;
    L386:
        return "Companion";
    L265:
        if (r1.equals("double") == false) goto L372;
        return "Double";
    L372:
        return null;
    L270:
        if (r1.equals("java.util.Set") == false) goto L373;
        return "Set";
    L373:
        return null;
    L275:
        if (r1.equals("java.util.Map") == false) goto L374;
        return "Map";
    L374:
        return null;
    L280:
        if (r1.equals("java.lang.Comparable") == false) goto L375;
        return "Comparable";
    L375:
        return null;
    L285:
        if (r1.equals("java.lang.annotation.Annotation") == false) goto L376;
        return "Annotation";
    L376:
        return null;
    L290:
        if (r1.equals("java.lang.Cloneable") == false) goto L377;
        return "Cloneable";
    L377:
        return null;
    L295:
        if (r1.equals("java.lang.Integer") == false) goto L378;
        return "Int";
    L378:
        return null;
    L300:
        if (r1.equals("kotlin.jvm.internal.DoubleCompanionObject") == true) goto L387;
        return null;
    L387:
        return "Companion";
    }

    public static final long L(wv3 r6) {
        float r0 = r6.c - r6.a;
        float r1 = r6.d - r6.b;
        long r2 = Float.floatToRawIntBits(r0);
        return (((long) Float.floatToRawIntBits(r1)) & 4294967295L) | (r2 << 32);
    }

    public static void M(Object r1, String r2) {
        if (r1 != null) goto L4;
        String r3 = "null";
    L5:
        ClassCastException r4 = new ClassCastException(b11.o(r3, " cannot be cast to ", r2));
        h12.M(r4, jz4.class.getName());
        throw r4;
    L4:
        r3 = r1.getClass().getName();
        goto L5
    }

    public static int[] N(Collection r4) {
        if ((r4 instanceof m12) == false) goto L6;
        m12 r5 = (m12) r4;
        return Arrays.copyOfRange(r5.n, r5.o, r5.p);
    L6:
        Object[] r6 = r4.toArray();
        int r0 = r6.length;
        int[] r1 = new int[r0];
        int r2 = 0;
    L7:
        if (r2 >= r0) goto L9;
        Object r3 = r6[r2];
        r3.getClass();
        r1[r2] = ((Number) r3).intValue();
        r2 = r2 + 1;
        goto L7
    L9:
        return r1;
    }

    public static Integer O(String r13) {
        r13.getClass();
        if (r13.isEmpty() == false) goto L5;
    L4:
        Long r14 = null;
    L41:
        if (r14 != null) goto L43;
    L47:
        return null;
    L43:
        if (r14.longValue() != r14.intValue()) goto L47;
        return Integer.valueOf(r14.intValue());
    L5:
        int r0 = 0;
        if (r13.charAt(0) != '-') goto L9;
        r0 = 1;
    L9:
        if (r0 == r13.length()) goto L4;
        int r2 = r0 + 1;
        char r3 = r13.charAt(r0);
        if (r3 >= 128) goto L14;
        byte r4 = ye2.a[r3];
    L15:
        if (r4 < 0) goto L4;
        if (r4 >= 10) goto L4;
        long r7 = -r4;
    L21:
        if (r2 >= r13.length()) goto L35;
        int r5 = r2 + 1;
        char r6 = r13.charAt(r2);
        if (r6 >= 128) goto L25;
        byte r8 = ye2.a[r6];
    L26:
        if (r8 < 0) goto L4;
        if (r8 >= 10) goto L4;
        if (r7 < (-922337203685477580L)) goto L4;
        long r9 = r7 * 10;
        long r11 = r8;
        if (r9 < (Long.MIN_VALUE + r11)) goto L4;
        r7 = r9 - r11;
        r2 = r5;
        goto L21
    L25:
        byte[] r10 = ye2.a;
        r8 = -1;
        goto L26
    L35:
        if (r0 == 0) goto L38;
        r14 = Long.valueOf(r7);
        goto L41
    L38:
        if (r7 == Long.MIN_VALUE) goto L4;
        r14 = Long.valueOf(-r7);
        goto L41
    L14:
        byte[] r12 = ye2.a;
        r4 = -1;
        goto L15
    }

    public static void P(final SongListPageFragment r10, final ni4 r11, final List r12, final boolean r13, final si4 r14) {
        final Context r1 = r10.Z();
        List r0 = r11.u;
        r0.getClass();
        final List r6 = q40.Q0(r0);
        J(r1, r12, false);
        if (r13 == false) goto L15;
        ArrayList r2 = new ArrayList(r40.k0(r12, 10));
        Iterator r3 = r12.iterator();
    L6:
        if (r3.hasNext() == false) goto L8;
        r2.add(((Child) r3.next()).getId());
        goto L6
    L8:
        Set r4 = q40.T0(r2);
        ArrayList r5 = new ArrayList();
        Iterator r7 = r6.iterator();
    L10:
        if (r7.hasNext() == false) goto L14;
        Object r8 = r7.next();
        if (r4.contains(((Child) r8).getId()) == true) goto L10;
        r5.add(r8);
        goto L10
    L14:
        r11.r(r5);
        r14.run();
    L15:
        View r9 = r10.T;
        if (r9 != null) goto L18;
        return;
    L18:
        nc1 r15 = r10.l();
        FrameLayout r16 = null;
        if ((r15 instanceof MainActivity) == false) goto L21;
        MainActivity r17 = (MainActivity) r15;
    L22:
        qg4 r18 = qg4.h(r9, r1.getResources().getQuantityString(R.plurals.homemusic_selection_unliked, r12.size(), new Object[]{Integer.valueOf(r12.size())}), 0);
        if (r17 == null) goto L25;
        r16 = r17.u();
    L25:
        r18.e(r16);
        r18.i(R.string.homemusic_undo, new to1(r1, r12, r13, r10, r11, r6, r14));
        r18.j();
        return;
    L21:
        r17 = null;
        goto L22
    }

    public static final f15 Q(vd0 r2, ne0 r3, Object r4) {
        f15 r1 = null;
        if ((r2 instanceof ye0) == true) goto L6;
    L19:
        return r1;
    L6:
        if (r3.K(iz.p) == null) goto L19;
        ye0 r5 = (ye0) r2;
    L9:
        if ((r5 instanceof nr0) == true) goto L17;
        r5 = r5.getCallerFrame();
        if (r5 == null) goto L17;
        if ((r5 instanceof f15) == false) goto L9;
        r1 = (f15) r5;
    L17:
        if (r1 == null) goto L19;
        r1.n0(r3, r4);
        goto L19
    }

    public static final void a(final String r11, dx2 r12, final zs4 r13, int r14, boolean r15, int r16, int r17, rg1 r18, final int r19) {
        r18.S(-1040751001);
        if (r18.e(r11) == false) goto L5;
        int r0 = 4;
    L6:
        int r1 = (r19 | r0) | 48;
        if (r18.e(r13) == false) goto L9;
        int r4 = 256;
    L10:
        int r2 = (r1 | r4) | 920349696;
        if ((306783379 & r2) == 306783378) goto L13;
        boolean r5 = true;
    L15:
        if (r18.K(r2 & 1, r5) == true) goto L17;
        r18.N();
        final dx2 r3 = r12;
        final int r6 = r14;
        final boolean r7 = r15;
        final int r8 = r16;
        final int r9 = r17;
    L47:
        lv3 r10 = r18.p();
        if (r10 == null) goto L54;
        r10.d = new lr(r11, r3, r13, r6, r7, r8, r9, r19);
        return;
    L54:
        return;
    L17:
        if (r18.i(c94.a) != null) goto L44;
        r18.R(357055103);
        r18.o(false);
        ha1 r20 = (ha1) r18.i(g90.k);
        Executor r110 = (Executor) r18.i(nr.a);
        if (r110 == null) goto L38;
        int r21 = r11.length();
        if (Build.VERSION.SDK_INT < 28) goto L38;
        if (r21 < 8) goto L38;
        if (r21 >= 1000) goto L38;
        if (nr.b == null) goto L29;
    L33:
        Boolean r22 = nr.b;
        r22.getClass();
        if (r22.booleanValue() == false) goto L38;
        r18.R(-1250263182);
        r110.execute(new mr(r13, (r62) r18.i(g90.n), r11, (oo0) r18.i(g90.h), r20, 0));     // Catch: RejectedExecutionException -> L51
    L37:
        r18.o(false);
    L39:
        r18.R(358076243);
        r18.o(false);
        vs4 r23 = new vs4(r11, r13, r20);
        w01 r24 = w01.b;
        int r25 = Long.hashCode(r18.T);
        dx2 r26 = j51.E(r18, r23);
        mf3 r27 = r18.k();
        e80.e.getClass();
        r18.U();
        if (r18.S == false) goto L42;
        r18.j();
    L43:
        l93.c0(fz0.I, r18, r24);
        l93.c0(fz0.H, r18, r27);
        l93.a0(r18);
        l93.c0(fz0.G, r18, r26);
        l93.c0(fz0.J, r18, Integer.valueOf(r25));
        r18.o(true);
        r8 = Integer.MAX_VALUE;
        r6 = 1;
        r7 = true;
        r9 = 1;
        r3 = ax2.a;
        goto L47
    L42:
        r18.e0();
        goto L43
    L29:
        if (Runtime.getRuntime().availableProcessors() < 4) goto L31;
        boolean r28 = true;
    L32:
        nr.b = Boolean.valueOf(r28);
        goto L33
    L31:
        r28 = false;
    L38:
        r18.R(-1248455541);
        r18.o(false);
        goto L39
    L44:
        kf2.k();
        return;
    L13:
        r5 = false;
        goto L15
    L9:
        r4 = 128;
        goto L10
    L5:
        r0 = 2;
        goto L6
    }

    public static final void b(final Object r17, final int r18, final n82 r19, final r70 r20, rg1 r21, final int r22) {
        r21.S(872548579);
        if ((r22 & 6) == 0) goto L5;
        int r6 = r22;
    L11:
        if ((r22 & 48) != 0) goto L18;
        if (r21.d(r18) == false) goto L15;
        int r7 = 32;
    L16:
        r6 = r6 | r7;
        goto L18
    L15:
        r7 = 16;
    L18:
        if ((r22 & 384) != 0) goto L25;
        if (r21.g(r19) == false) goto L22;
        int r8 = 256;
    L23:
        r6 = r6 | r8;
        goto L25
    L22:
        r8 = 128;
    L25:
        if ((r22 & 3072) != 0) goto L32;
        if (r21.g(r20) == false) goto L29;
        int r9 = 2048;
    L30:
        r6 = r6 | r9;
        goto L32
    L29:
        r9 = 1024;
    L32:
        if ((r6 & 1171) == 1170) goto L34;
        boolean r10 = true;
    L36:
        if (r21.K(r6 & 1, r10) == false) goto L66;
        boolean r11 = r21.e(r17) | r21.e(r19);
        Object r12 = r21.H();
        Object r13 = j80.a;
        if (r11 == true) goto L40;
        if (r12 == r13) goto L40;
    L41:
        l82 r14 = (l82) r12;
        r14.c = r18;
        zd3 r15 = r14.g;
        qr3 r16 = fg3.a;
        l82 r110 = (l82) r21.i(r16);
        ch4 r111 = ya4.t();
        if (r111 == null) goto L44;
        if1 r112 = r111.e();
    L45:
        ch4 r113 = ya4.z(r111);
    L53:
        th = move-exception;
        ya4.H(r111, r113, r112);
        throw th;
    L47:
        if (r110 == ((l82) r15.getValue())) goto L59;
        r15.setValue(r110);     // Catch: Throwable -> L53
        if (r14.d <= 0) goto L59;
        l82 r23 = r14.e;     // Catch: Throwable -> L53
        if (r23 == null) goto L55;
        r23.b();     // Catch: Throwable -> L53
    L55:
        if (r110 == null) goto L57;
        r110.a();     // Catch: Throwable -> L53
    L58:
        r14.e = r110;     // Catch: Throwable -> L53
        goto L59
    L57:
        r110 = null;
    L59:
        ya4.H(r111, r113, r112);
        boolean r24 = r21.e(r14);
        Object r114 = r21.H();
        if (r24 == true) goto L62;
        if (r114 == r13) goto L62;
    L63:
        bu.b(r14, (if1) r114, r21);
        gi1.a(r16.a(r14), r20, r21, ((r6 >> 6) & 112) | 8);
    L67:
        lv3 r25 = r21.p();
        if (r25 == null) goto L73;
        r25.d = new m82(r17, r18, r19, r20, r22);
        return;
    L73:
        return;
    L62:
        r114 = new x(22, r14);
        r21.b0(r114);
        goto L63
    L44:
        r112 = null;
    L40:
        r12 = new l82(r17, r19);
        r21.b0(r12);
        goto L41
    L66:
        r21.N();
        goto L67
    L34:
        r10 = false;
        goto L36
    L5:
        if (r21.g(r17) == false) goto L7;
        int r26 = 4;
    L8:
        r6 = r26 | r22;
        goto L11
    L7:
        r26 = 2;
        goto L8
    }

    public static final boolean c(e94 r2) {
        p94 r0 = n94.r;
        w03 r3 = r2.n;
        Object r1 = r3.g(r0);
        if (r1 != null) goto L6;
        r1 = null;
    L6:
        if (h12.c(r1, fz0.O) == false) goto L9;
        return false;
    L9:
        if (r3.b(d94.g) == false) goto L11;
        return true;
    L11:
        if (r3.b(d94.h) == true) goto L18;
        return false;
    L18:
        return true;
    }

    public static final void d(String r1) {
        r1.getClass();
        if (r1.equals("light") == false) goto L7;
        pf.o(1);
        return;
    L7:
        if (r1.equals("dark") == false) goto L10;
        pf.o(2);
        return;
    L10:
        pf.o(-1);
    }

    public static List e(int... r3) {
        if (r3.length != 0) goto L7;
        return Collections.EMPTY_LIST;
    L7:
        return new m12(0, r3.length, r3);
    }

    public static Map f(Object r1) {
        if ((r1 instanceof x32) == true) goto L5;
    L14:
        return (Map) r1;
    L11:
        e = move-exception;
        h12.M(e, jz4.class.getName());
        throw e;
    L5:
        if ((r1 instanceof a42) == true) goto L14;
        M(r1, "kotlin.collections.MutableMap");
        throw null;
    }

    public static final ArrayList g(rm3 r7, ni4 r8) {
        List r0 = r8.v.f;
        r0.getClass();
        List r9 = r8.u;
        r9.getClass();
        ArrayList r10 = q40.G0(r0, r9);
        ArrayList r1 = new ArrayList();
        int r2 = r10.size();
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L7;
        Object r5 = r10.get(r4);
        r4 = r4 + 1;
        if (((LinkedHashSet) r7.n).contains(((Child) r5).getId()) == false) goto L3;
        r1.add(r5);
        goto L3
    L7:
        HashSet r11 = new HashSet();
        ArrayList r12 = new ArrayList();
        int r6 = r1.size();
    L8:
        if (r3 >= r6) goto L12;
        Object r13 = r1.get(r3);
        r3 = r3 + 1;
        if (r11.add(((Child) r13).getId()) == false) goto L8;
        r12.add(r13);
        goto L8
    L12:
        return r12;
    }

    public static final void h(rm3 r5, MaterialToolbar r6, MaterialToolbar r7, bd1 r8, Context r9, boolean r10, ni4 r11) {
        ArrayList r0 = g(r5, r11);
        boolean r12 = ((LinkedHashSet) r5.n).isEmpty();
        boolean r1 = !r12;
        int r2 = 8;
        if (r12 == true) goto L5;
        int r4 = 0;
    L6:
        r6.setVisibility(r4);
        if (r12 == false) goto L10;
        r2 = 0;
    L10:
        r7.setVisibility(r2);
        r8.c(r1);
        r6.setTitle(r9.getString(R.string.homemusic_selection_count, new Object[]{Integer.valueOf(r0.size())}));
        ArrayList r13 = new ArrayList();
        int r14 = r0.size();
        int r15 = 0;
    L11:
        if (r15 >= r14) goto L16;
        Object r3 = r0.get(r15);
        r15 = r15 + 1;
        if (ot1.c(((Child) r3).getId()) == true) goto L11;
        r13.add(r3);
        goto L11
    L16:
        if (r0.isEmpty() == false) goto L18;
    L26:
        boolean r16 = false;
    L27:
        uo1.p.getClass();
        if (r16 == true) goto L30;
        uo1 r17 = uo1.q;
    L33:
        MenuItem r18 = r6.getMenu().findItem(R.id.homemusic_selection_like);
        r18.setVisible(!r0.isEmpty());
        r18.setTitle(r17.n);
        r18.setIcon(r17.o);
        MenuItem r19 = r6.getMenu().findItem(R.id.homemusic_selection_download);
        if (r13.isEmpty() == false) goto L36;
    L35:
        boolean r110 = false;
    L41:
        r19.setVisible(r110);
        MenuItem r20 = r6.getMenu().findItem(R.id.homemusic_selection_remove);
        if (r13.isEmpty() == false) goto L44;
    L43:
        boolean r21 = false;
    L49:
        r20.setVisible(r21);
        r6.getMenu().findItem(R.id.homemusic_selection_playlist).setVisible(!r13.isEmpty());
        Iterator r22 = gb.P(new Integer[]{Integer.valueOf(R.id.homemusic_selection_play), Integer.valueOf(R.id.homemusic_selection_play_next), Integer.valueOf(R.id.homemusic_selection_queue)}).iterator();
    L51:
        if (r22.hasNext() == false) goto L53;
        r6.getMenu().findItem(((Number) r22.next()).intValue()).setVisible(!r0.isEmpty());
        goto L51
    L53:
        r11.n.d(0, r11.a(), "payload_homemusic_selection");
        return;
    L44:
        int r111 = r13.size();
        int r23 = 0;
    L45:
        if (r23 >= r111) goto L43;
        Object r24 = r13.get(r23);
        r23 = r23 + 1;
        if (D(r9, (Child) r24) == false) goto L45;
        r21 = true;
        goto L49
    L36:
        int r112 = r13.size();
        int r25 = 0;
    L37:
        if (r25 >= r112) goto L35;
        Object r26 = r13.get(r25);
        r25 = r25 + 1;
        if (D(r9, (Child) r26) == true) goto L37;
        r110 = true;
        goto L41
    L30:
        if (r10 == false) goto L32;
        r17 = uo1.s;
        goto L33
    L32:
        r17 = uo1.r;
        goto L33
    L18:
        if (r0.isEmpty() == true) goto L25;
        int r27 = r0.size();
        int r28 = 0;
    L21:
        if (r28 >= r27) goto L25;
        Object r29 = r0.get(r28);
        r28 = r28 + 1;
        if (C((Child) r29) == true) goto L21;
    L25:
        r16 = true;
        goto L27
    L5:
        r4 = 8;
        goto L6
    }

    public static final Object i(rq3 r4, gf1 r5, wd0 r6) {
        if ((r6 instanceof qq3) == false) goto L7;
        qq3 r0 = (qq3) r6;
        int r1 = r0.p;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.p = r1 - Integer.MIN_VALUE;
    L8:
        Object r7 = r0.o;
        int r2 = r0.p;
        if (r2 == 0) goto L18;
        if (r2 != 1) goto L16;
        r5 = r0.n;
        kb4.X(r7);     // Catch: Throwable -> L14
    L24:
        r5.invoke();
        return j15.a;
    L16:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L18:
        kb4.X(r7);
        if (r0.getContext().K(fz0.h0) != r4) goto L28;
        r0.n = r5;     // Catch: Throwable -> L14
        r0.p = 1;     // Catch: Throwable -> L14
        cz r8 = new cz(1, ya4.x(r0));     // Catch: Throwable -> L14
        r8.u();     // Catch: Throwable -> L14
        kv r3 = new kv(2, r8);     // Catch: Throwable -> L14
        r4.s.z(r3);     // Catch: Throwable -> L14
        Object r9 = r8.q();     // Catch: Throwable -> L14
        xe0 r10 = xe0.n;
        if (r9 != r10) goto L24;
        return r10;
    L28:
        kf2.o("awaitClose() can only be invoked from the producer context");
        return null;
    L14:
        th = move-exception;
        r5.invoke();
        throw th;
    L7:
        r0 = new qq3(r6);
        goto L8
    }

    public static void j(int r2, Object r3) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (A(r2, r3) == true) goto L9;
        M(r3, "kotlin.jvm.functions.Function" + r2);
        throw null;
    }

    public static final void k(View r7, ViewGroup r8, rm3 r9, Child r10) {
        r7.getClass();
        r10.getClass();
        boolean r0 = false;
        View r1 = r8.getChildAt(0);
        if ((r1 instanceof ImageView) == false) goto L5;
        ImageView r2 = (ImageView) r1;
    L6:
        if (r2 != null) goto L9;
        return;
    L9:
        if (r9 != null) goto L11;
    L13:
        boolean r4 = false;
    L14:
        if (r4 == false) goto L19;
        r9.getClass();
        if (((LinkedHashSet) r9.n).contains(r10.getId()) == false) goto L19;
        r0 = true;
    L19:
        if (r0 == false) goto L21;
        ColorDrawable r5 = new ColorDrawable(v50.i(g12.s(r7.getContext(), R.attr.colorPrimary, -7829368), 46));
    L22:
        r7.setForeground(r5);
        if (r4 == false) goto L25;
        int r3 = 22;
    L26:
        int r6 = ji2.L(r3 * r7.getResources().getDisplayMetrics().density);
        ViewGroup.LayoutParams r11 = r2.getLayoutParams();
        r11.width = r6;
        r11.height = r6;
        r2.setLayoutParams(r11);
        if (r0 == false) goto L29;
        r2.setBackgroundResource(R.drawable.ic_homemusic_check_circle);
        r2.setBackgroundTintList(ColorStateList.valueOf(g12.s(r7.getContext(), R.attr.colorPrimary, -7829368)));
    L32:
        Context r12 = r7.getContext();
        if (r4 == false) goto L35;
        int r13 = R.string.homemusic_selection_toggle;
    L36:
        r8.setContentDescription(r12.getString(r13));
        return;
    L35:
        r13 = R.string.homemusic_selection_more;
        goto L36
    L29:
        if (r4 == false) goto L31;
        r2.setBackgroundResource(R.drawable.ic_homemusic_circle_outline);
        r2.setBackgroundTintList(ColorStateList.valueOf(g12.s(r7.getContext(), R.attr.colorOnSurfaceVariant, -7829368)));
        goto L32
    L31:
        r2.setBackgroundResource(R.drawable.ic_more_vert);
        r2.setBackgroundTintList(null);
        goto L32
    L25:
        r3 = 18;
        goto L26
    L21:
        r5 = null;
        goto L22
    L11:
        if ((!((LinkedHashSet) r9.n).isEmpty()) != true) goto L13;
        r4 = true;
        goto L14
    L5:
        r2 = null;
        goto L6
    }

    public static int m(long r3) {
        int r0 = (int) r3;
        if (r0 != r3) goto L5;
        boolean r1 = true;
    L6:
        rr2.m(r1, "Out of range: %s", r3);
        return r0;
    L5:
        r1 = false;
        goto L6
    }

    public static String n(String r1) {
        int r0 = r1.hashCode();
        switch(r0) {
            case -2061550653: goto L318;
            case -2056817302: goto L313;
            case -2034166429: goto L308;
            case -1979556166: goto L303;
            case -1571515090: goto L298;
            case -1383349348: goto L293;
            case -1383343454: goto L288;
            case -1325958191: goto L283;
            case -1182275604: goto L278;
            case -1062240117: goto L273;
            case -688322466: goto L268;
            case -527879800: goto L263;
            case -515992664: goto L258;
            case -246476834: goto L253;
            case -207262728: goto L248;
            case -165139126: goto L243;
            case 104431: goto L240;
            case 3039496: goto L235;
            case 3052374: goto L230;
            case 3327612: goto L225;
            case 64711720: goto L220;
            case 65821278: goto L215;
            case 77230534: goto L210;
            case 97526364: goto L207;
            case 109413500: goto L204;
            case 155276373: goto L201;
            case 226173651: goto L196;
            case 344809556: goto L193;
            case 398507100: goto L190;
            case 398585941: goto L185;
            case 398795216: goto L182;
            case 482629606: goto L177;
            case 499831342: goto L172;
            case 577341676: goto L167;
            case 599019395: goto L162;
            case 761287205: goto L159;
            case 1052881309: goto L154;
            case 1063877011: goto L149;
            case 1195259493: goto L144;
            case 1275614662: goto L139;
            case 1383693018: goto L134;
            case 1630335596: goto L129;
            case 1877171123: goto L124;
            default: goto L4;
        };
    L4:
        switch(r0) {
            case -1811142716: goto L119;
            case -1811142715: goto L114;
            case -1811142714: goto L109;
            case -1811142713: goto L104;
            case -1811142712: goto L99;
            case -1811142711: goto L94;
            case -1811142710: goto L89;
            case -1811142709: goto L84;
            case -1811142708: goto L79;
            case -1811142707: goto L74;
            default: goto L5;
        };
    L5:
        switch(r0) {
            case -1811142685: goto L69;
            case -1811142684: goto L64;
            case -1811142683: goto L59;
            default: goto L6;
        };
    L6:
        switch(r0) {
            case 80123371: goto L54;
            case 80123372: goto L49;
            case 80123373: goto L44;
            case 80123374: goto L39;
            case 80123375: goto L34;
            case 80123376: goto L29;
            case 80123377: goto L24;
            case 80123378: goto L19;
            case 80123379: goto L14;
            case 80123380: goto L9;
            default: goto L331;
        };
    L331:
        return null;
    L9:
        if (r1.equals("kotlin.jvm.functions.Function9") == false) goto L332;
        return "kotlin.Function9";
    L332:
        return null;
    L14:
        if (r1.equals("kotlin.jvm.functions.Function8") == false) goto L333;
        return "kotlin.Function8";
    L333:
        return null;
    L19:
        if (r1.equals("kotlin.jvm.functions.Function7") == false) goto L334;
        return "kotlin.Function7";
    L334:
        return null;
    L24:
        if (r1.equals("kotlin.jvm.functions.Function6") == false) goto L335;
        return "kotlin.Function6";
    L335:
        return null;
    L29:
        if (r1.equals("kotlin.jvm.functions.Function5") == false) goto L336;
        return "kotlin.Function5";
    L336:
        return null;
    L34:
        if (r1.equals("kotlin.jvm.functions.Function4") == false) goto L337;
        return "kotlin.Function4";
    L337:
        return null;
    L39:
        if (r1.equals("kotlin.jvm.functions.Function3") == false) goto L338;
        return "kotlin.Function3";
    L338:
        return null;
    L44:
        if (r1.equals("kotlin.jvm.functions.Function2") == false) goto L339;
        return "kotlin.Function2";
    L339:
        return null;
    L49:
        if (r1.equals("kotlin.jvm.functions.Function1") == false) goto L340;
        return "kotlin.Function1";
    L340:
        return null;
    L54:
        if (r1.equals("kotlin.jvm.functions.Function0") == false) goto L341;
        return "kotlin.Function0";
    L341:
        return null;
    L59:
        if (r1.equals("kotlin.jvm.functions.Function22") == false) goto L342;
        return "kotlin.Function22";
    L342:
        return null;
    L64:
        if (r1.equals("kotlin.jvm.functions.Function21") == false) goto L343;
        return "kotlin.Function21";
    L343:
        return null;
    L69:
        if (r1.equals("kotlin.jvm.functions.Function20") == false) goto L344;
        return "kotlin.Function20";
    L344:
        return null;
    L74:
        if (r1.equals("kotlin.jvm.functions.Function19") == false) goto L345;
        return "kotlin.Function19";
    L345:
        return null;
    L79:
        if (r1.equals("kotlin.jvm.functions.Function18") == false) goto L346;
        return "kotlin.Function18";
    L346:
        return null;
    L84:
        if (r1.equals("kotlin.jvm.functions.Function17") == false) goto L347;
        return "kotlin.Function17";
    L347:
        return null;
    L89:
        if (r1.equals("kotlin.jvm.functions.Function16") == false) goto L348;
        return "kotlin.Function16";
    L348:
        return null;
    L94:
        if (r1.equals("kotlin.jvm.functions.Function15") == false) goto L349;
        return "kotlin.Function15";
    L349:
        return null;
    L99:
        if (r1.equals("kotlin.jvm.functions.Function14") == false) goto L350;
        return "kotlin.Function14";
    L350:
        return null;
    L104:
        if (r1.equals("kotlin.jvm.functions.Function13") == false) goto L351;
        return "kotlin.Function13";
    L351:
        return null;
    L109:
        if (r1.equals("kotlin.jvm.functions.Function12") == false) goto L352;
        return "kotlin.Function12";
    L352:
        return null;
    L114:
        if (r1.equals("kotlin.jvm.functions.Function11") == false) goto L353;
        return "kotlin.Function11";
    L353:
        return null;
    L119:
        if (r1.equals("kotlin.jvm.functions.Function10") == false) goto L354;
        return "kotlin.Function10";
    L354:
        return null;
    L124:
        if (r1.equals("kotlin.jvm.internal.IntCompanionObject") == false) goto L355;
        return "kotlin.Int.Companion";
    L355:
        return null;
    L129:
        if (r1.equals("java.lang.Throwable") == false) goto L356;
        return "kotlin.Throwable";
    L356:
        return null;
    L134:
        if (r1.equals("kotlin.jvm.internal.BooleanCompanionObject") == false) goto L357;
        return "kotlin.Boolean.Companion";
    L357:
        return null;
    L139:
        if (r1.equals("java.lang.Iterable") == false) goto L358;
        return "kotlin.collections.Iterable";
    L358:
        return null;
    L144:
        if (r1.equals("java.lang.String") == false) goto L359;
        return "kotlin.String";
    L359:
        return null;
    L149:
        if (r1.equals("java.lang.Object") == false) goto L360;
        return "kotlin.Any";
    L360:
        return null;
    L154:
        if (r1.equals("java.lang.Number") == false) goto L361;
        return "kotlin.Number";
    L361:
        return null;
    L159:
        if (r1.equals("java.lang.Double") == false) goto L362;
        return "kotlin.Double";
    L362:
        return null;
    L162:
        if (r1.equals("kotlin.jvm.internal.StringCompanionObject") == false) goto L363;
        return "kotlin.String.Companion";
    L363:
        return null;
    L167:
        if (r1.equals("java.util.ListIterator") == false) goto L364;
        return "kotlin.collections.ListIterator";
    L364:
        return null;
    L172:
        if (r1.equals("java.util.Iterator") == false) goto L365;
        return "kotlin.collections.Iterator";
    L365:
        return null;
    L177:
        if (r1.equals("kotlin.jvm.internal.FloatCompanionObject") == false) goto L366;
        return "kotlin.Float.Companion";
    L366:
        return null;
    L182:
        if (r1.equals("java.lang.Long") == false) goto L367;
        return "kotlin.Long";
    L367:
        return null;
    L185:
        if (r1.equals("java.lang.Enum") == false) goto L368;
        return "kotlin.Enum";
    L368:
        return null;
    L190:
        if (r1.equals("java.lang.Byte") == false) goto L369;
        return "kotlin.Byte";
    L369:
        return null;
    L193:
        if (r1.equals("java.lang.Boolean") == false) goto L370;
        return "kotlin.Boolean";
    L370:
        return null;
    L196:
        if (r1.equals("kotlin.jvm.internal.EnumCompanionObject") == false) goto L371;
        return "kotlin.Enum.Companion";
    L371:
        return null;
    L201:
        if (r1.equals("java.lang.Character") == false) goto L372;
        return "kotlin.Char";
    L372:
        return null;
    L204:
        if (r1.equals("short") == false) goto L373;
        return "kotlin.Short";
    L373:
        return null;
    L207:
        if (r1.equals("float") == false) goto L374;
        return "kotlin.Float";
    L374:
        return null;
    L210:
        if (r1.equals("kotlin.jvm.internal.ShortCompanionObject") == false) goto L375;
        return "kotlin.Short.Companion";
    L375:
        return null;
    L215:
        if (r1.equals("java.util.List") == false) goto L376;
        return "kotlin.collections.List";
    L376:
        return null;
    L220:
        if (r1.equals("boolean") == false) goto L377;
        return "kotlin.Boolean";
    L377:
        return null;
    L225:
        if (r1.equals("long") == false) goto L378;
        return "kotlin.Long";
    L378:
        return null;
    L230:
        if (r1.equals("char") == false) goto L379;
        return "kotlin.Char";
    L379:
        return null;
    L235:
        if (r1.equals("byte") == false) goto L380;
        return "kotlin.Byte";
    L380:
        return null;
    L240:
        if (r1.equals("int") == false) goto L381;
        return "kotlin.Int";
    L381:
        return null;
    L243:
        if (r1.equals("java.util.Map$Entry") == false) goto L382;
        return "kotlin.collections.Map.Entry";
    L382:
        return null;
    L248:
        if (r1.equals("kotlin.jvm.internal.LongCompanionObject") == false) goto L383;
        return "kotlin.Long.Companion";
    L383:
        return null;
    L253:
        if (r1.equals("kotlin.jvm.internal.CharCompanionObject") == false) goto L384;
        return "kotlin.Char.Companion";
    L384:
        return null;
    L258:
        if (r1.equals("java.lang.Short") == false) goto L385;
        return "kotlin.Short";
    L385:
        return null;
    L263:
        if (r1.equals("java.lang.Float") == false) goto L386;
        return "kotlin.Float";
    L386:
        return null;
    L268:
        if (r1.equals("java.util.Collection") == false) goto L387;
        return "kotlin.collections.Collection";
    L387:
        return null;
    L273:
        if (r1.equals("java.lang.CharSequence") == false) goto L388;
        return "kotlin.CharSequence";
    L388:
        return null;
    L278:
        if (r1.equals("kotlin.jvm.internal.ByteCompanionObject") == false) goto L389;
        return "kotlin.Byte.Companion";
    L389:
        return null;
    L283:
        if (r1.equals("double") == false) goto L390;
        return "kotlin.Double";
    L390:
        return null;
    L288:
        if (r1.equals("java.util.Set") == false) goto L391;
        return "kotlin.collections.Set";
    L391:
        return null;
    L293:
        if (r1.equals("java.util.Map") == false) goto L392;
        return "kotlin.collections.Map";
    L392:
        return null;
    L298:
        if (r1.equals("java.lang.Comparable") == false) goto L393;
        return "kotlin.Comparable";
    L393:
        return null;
    L303:
        if (r1.equals("java.lang.annotation.Annotation") == false) goto L394;
        return "kotlin.Annotation";
    L394:
        return null;
    L308:
        if (r1.equals("java.lang.Cloneable") == false) goto L395;
        return "kotlin.Cloneable";
    L395:
        return null;
    L313:
        if (r1.equals("java.lang.Integer") == false) goto L396;
        return "kotlin.Int";
    L396:
        return null;
    L318:
        if (r1.equals("kotlin.jvm.internal.DoubleCompanionObject") == true) goto L321;
        return null;
    L321:
        return "kotlin.Double.Companion";
    }

    public static int o(int r3, int r4) {
        if (r4 > 1073741823) goto L5;
        boolean r1 = true;
    L6:
        rr2.i(r4, 1073741823, "min (%s) must be less than or equal to max (%s)", r1);
        return Math.min(Math.max(r3, r4), 1073741823);
    L5:
        r1 = false;
        goto L6
    }

    public static void p(Context r7, ArrayList r8) {
        if (r8.isEmpty() == false) goto L6;
        return;
    L6:
        if (ud3.o() != null) goto L12;
        eu0 r9 = au0.w(r7);
        ArrayList r0 = gi1.H(r8);
        ArrayList r2 = new ArrayList(r40.k0(r8, 10));
        int r3 = r8.size();
        int r4 = 0;
    L8:
        if (r4 >= r3) goto L10;
        Object r5 = r8.get(r4);
        r4 = r4 + 1;
        r2.add(new Download((Child) r5));
        goto L8
    L10:
        r9.a(r0, r2, false);
        return;
    L12:
        int r1 = r8.size();
        int r6 = 0;
    L13:
        if (r6 >= r1) goto L18;
        Object r10 = r8.get(r6);
        r6 = r6 + 1;
        i51.b(r7, (Child) r10, null, null, false);
        goto L13
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x007f -> B:14:0x0032). Please report as a decompilation issue!!! */
    public static final Object q(q81 r7, y00 r8, boolean r9, wd0 r10) {
        if ((r10 instanceof t81) == false) goto L7;
        t81 r0 = (t81) r10;
        int r1 = r0.s;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.s = r1 - Integer.MIN_VALUE;
    L8:
        Object r11 = r0.r;
        int r2 = r0.s;
        CancellationException r3 = null;
        xe0 r5 = xe0.n;
        if (r2 == 0) goto L22;
        if (r2 == 1) goto L19;
        if (r2 != 2) goto L17;
        r9 = r0.q;
        xv r12 = r0.p;
        r8 = r0.o;
        q81 r4 = r0.n;
        kb4.X(r11);     // Catch: Throwable -> L15
    L14:
        xv r13 = r12;
        r7 = r4;
    L24:
        r0.n = r7;     // Catch: Throwable -> L15
        r0.o = r8;     // Catch: Throwable -> L15
        r0.p = r13;     // Catch: Throwable -> L15
        r0.q = r9;     // Catch: Throwable -> L15
        r0.s = 1;     // Catch: Throwable -> L15
        Object r6 = r13.b(r0);     // Catch: Throwable -> L15
        if (r6 == r5) goto L32;
        r4 = r7;
        r12 = r13;
        r11 = r6;
    L29:
        if (((Boolean) r11).booleanValue() == false) goto L33;
        Object r14 = r12.c();     // Catch: Throwable -> L15
        r0.n = r4;     // Catch: Throwable -> L15
        r0.o = r8;     // Catch: Throwable -> L15
        r0.p = r12;     // Catch: Throwable -> L15
        r0.q = r9;     // Catch: Throwable -> L15
        r0.s = 2;     // Catch: Throwable -> L15
        if (r4.b(r14, r0) != r5) goto L14;
    L33:
        if (r9 == false) goto L36;
        r8.f(null);
    L36:
        return j15.a;
    L32:
        return r5;
    L17:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L19:
        r9 = r0.q;
        r12 = r0.p;
        r8 = r0.o;
        r4 = r0.n;
        kb4.X(r11);     // Catch: Throwable -> L15
        goto L29
    L22:
        kb4.X(r11);
        r13 = r8.iterator();     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        throw th;     // Catch: Throwable -> L38
    L38:
        th = move-exception;
        if (r9 == true) goto L41;
    L46:
        throw th;
    L41:
        if ((th instanceof CancellationException) == false) goto L43;
        r3 = th;
    L43:
        if (r3 != null) goto L45;
        r3 = new CancellationException("Channel was consumed, consumer had failed");
        r3.initCause(th);
    L45:
        r8.f(r3);
    L7:
        r0 = new t81(r10);
        goto L8
    }

    public static final void r(df r18) {
        String r0 = ud3.H();
        int r2 = r18.getResources().getConfiguration().uiMode & 48;
        if (r0.equals("default") == true) goto L5;
    L7:
        boolean r3 = false;
    L9:
        if (ud3.Q() == true) goto L11;
    L14:
        boolean r4 = false;
    L15:
        String r1 = ud3.m();
        if (ud3.S() == false) goto L19;
        ly0.a(r18, new qr2(new gp3(7)));
    L26:
        if (r4 == false) goto L31;
        ArrayList r5 = gb.Q(new Integer[]{Integer.valueOf(android.R.attr.colorBackground), Integer.valueOf(android.R.attr.statusBarColor), Integer.valueOf(android.R.attr.navigationBarColor), Integer.valueOf(R.attr.colorSurface), Integer.valueOf(R.attr.colorSurfaceVariant), Integer.valueOf(R.attr.colorSurfaceContainerLowest), Integer.valueOf(R.attr.colorSurfaceContainerLow), Integer.valueOf(R.attr.colorSurfaceContainer), Integer.valueOf(R.attr.colorSurfaceContainerHigh), Integer.valueOf(R.attr.colorSurfaceContainerHighest), Integer.valueOf(R.attr.colorOutline), Integer.valueOf(R.attr.colorOutlineVariant)});
        if (Build.VERSION.SDK_INT < 27) goto L30;
        r5.add(Integer.valueOf(android.R.attr.navigationBarDividerColor));
    L30:
        TypedArray r6 = r18.obtainStyledAttributes(q40.P0(r5));
        r6.getClass();
        r6.recycle();
        r18.getTheme().applyStyle(R.style.AppTheme_Amoled_SurfacesOnly, true);
        r18.getWindow().setBackgroundDrawable(new ColorDrawable(-16777216));
        return;
    L31:
        TypedValue r7 = new TypedValue();
        r18.getTheme().resolveAttribute(R.attr.colorSurface, r7, true);
        r18.getWindow().setBackgroundDrawable(new ColorDrawable(r7.data));
        return;
    L19:
        if (xm4.k0(r1, "HEX:", false) == false) goto L26;
        int r8 = Color.parseColor(qm4.z0(r1, "HEX:"));     // Catch: IllegalArgumentException -> L23
        gp3 r9 = new gp3(7);     // Catch: IllegalArgumentException -> L23
        r9.p = Integer.valueOf(r8);     // Catch: IllegalArgumentException -> L23
        r9.o = new tb4(5);     // Catch: IllegalArgumentException -> L23
        ly0.a(r18, new qr2(r9));     // Catch: IllegalArgumentException -> L23
    L23:
        e = move-exception;
        Log.e("ThemeHelper", e.toString());
        ly0.a(r18, new qr2(new gp3(7)));
        goto L26
    L11:
        if (r0.equals("dark") == true) goto L13;
        if (r3 == false) goto L14;
    L13:
        r4 = true;
        goto L15
    L5:
        if (r2 != 32) goto L7;
        r3 = true;
        goto L9
    }

    public static r23 s(t23 r2) {
        Iterator r3 = fa4.c0(k5.z, r2).iterator();
        if (r3.hasNext() == false) goto L10;
        Object r0 = r3.next();
    L6:
        if (r3.hasNext() == false) goto L9;
        r0 = r3.next();
        goto L6
    L9:
        return (r23) r0;
    L10:
        kf2.m("Sequence is empty.");
        return null;
    }

    public static final ne0 t(ne0 r4, ne0 r5, boolean r6) {
        Boolean r7 = Boolean.FALSE;
        int r1 = 10;
        byte r2 = 0;
        boolean r0 = ((Boolean) r4.s(new d60(r1, r2), r7)).booleanValue();
        boolean r8 = ((Boolean) r5.s(new d60(r1, r2), r7)).booleanValue();
        if (r0 == true) goto L7;
        if (r8 == true) goto L7;
        return r4.J(r5);
    L7:
        d60 r3 = new d60(11, r2);
        q01 r9 = q01.n;
        ne0 r10 = (ne0) r4.s(r3, r9);
        Object r11 = r5;
        if (r8 == false) goto L11;
        r11 = r5.s(new d60(12, r2), r9);
    L11:
        return r10.J((ne0) r11);
    }

    public static int u(byte r0, byte r1, byte r2, byte r3) {
        return (((r0 << 24) | ((r1 & 255) << 16)) | ((r2 & 255) << 8)) | (r3 & 255);
    }

    public static int v(int r7) {
        if ((r7 & (-2097152)) != (-2097152)) goto L42;
        int r0 = (r7 >>> 19) & 3;
        if (r0 == 1) goto L42;
        int r4 = (r7 >>> 17) & 3;
        if (r4 == 0) goto L42;
        int r5 = (r7 >>> 12) & 15;
        if (r5 == 0) goto L42;
        if (r5 == 15) goto L42;
        int r6 = (r7 >>> 10) & 3;
        if (r6 == 3) goto L42;
        int r2 = c[r6];
        if (r0 != 2) goto L20;
        r2 = r2 / 2;
    L22:
        int r8 = (r7 >>> 9) & 1;
        if (r4 != 3) goto L29;
        if (r0 != 3) goto L26;
        int r1 = d[r5 - 1];
    L28:
        return (((r1 * 12) / r2) + r8) * 4;
    L26:
        r1 = e[r5 - 1];
        goto L28
    L29:
        if (r0 != 3) goto L33;
        if (r4 != 2) goto L32;
        int r9 = f[r5 - 1];
    L34:
        int r10 = 144;
        if (r0 == 3) goto L37;
        if (r4 != 1) goto L41;
        r10 = 72;
    L41:
        return ((r10 * r9) / r2) + r8;
    L37:
        return ((r9 * 144) / r2) + r8;
    L32:
        r9 = g[r5 - 1];
        goto L34
    L33:
        r9 = h[r5 - 1];
        goto L34
    L20:
        if (r0 != 0) goto L22;
        r2 = r2 / 4;
    L42:
        return -1;
    }

    public static final Bundle w(String r1, Bundle r2) {
        Bundle r3 = r2.getBundle(r1);
        if (r3 == null) goto L5;
        return r3;
    L5:
        kf2.n(xa3.h("No valid saved state was found for the key '", r1, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
        return null;
    }

    public static int[] x(String r9) {
        int[] r0 = new int[4];
        if (TextUtils.isEmpty(r9) == false) goto L6;
        r0[0] = -1;
        return r0;
    L6:
        int r1 = r9.length();
        int r4 = r9.indexOf(35);
        if (r4 == (-1)) goto L10;
        r1 = r4;
    L10:
        int r5 = r9.indexOf(63);
        if (r5 == (-1)) goto L13;
        if (r5 > r1) goto L13;
    L14:
        int r6 = r9.indexOf(47);
        if (r6 == (-1)) goto L17;
        if (r6 > r5) goto L17;
    L18:
        int r7 = r9.indexOf(58);
        if (r7 <= r6) goto L21;
        r7 = -1;
    L21:
        int r8 = r7 + 2;
        if (r8 < r5) goto L24;
    L31:
        int r10 = r7 + 1;
    L32:
        r0[0] = r7;
        r0[1] = r10;
        r0[2] = r5;
        r0[3] = r1;
        return r0;
    L24:
        if (r9.charAt(r7 + 1) != '/') goto L31;
        if (r9.charAt(r8) != '/') goto L31;
        r10 = r9.indexOf(47, r7 + 3);
        if (r10 == (-1)) goto L30;
        if (r10 <= r5) goto L32;
    L30:
        r10 = r5;
    L17:
        r6 = r5;
    L13:
        r5 = r1;
        goto L14
    }

    public static int y(int[] r1, int r2, int r3, int r4) {
    L2:
        if (r3 >= r4) goto L7;
        if (r1[r3] == r2) goto L5;
        r3 = r3 + 1;
        goto L2
    L5:
        return r3;
    L7:
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void z(rv0 r1) {
        if (((cx2) r1).n.A == false) goto L6;
        j51.M(r1, 1).I0();
        return;
    }

    public abstract void l();
}
