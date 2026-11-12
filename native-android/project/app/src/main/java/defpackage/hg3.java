package defpackage;

import android.app.ActionBar;
import android.app.Activity;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.provider.Settings;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.media3.common.ParserException;
import app.homemusic.R;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.interfaces.RadioCallback;
import com.eddyizm.tempus.interfaces.SystemCallback;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hg3 implements zw, j4, fc2, PointerInputEventHandler, r83, th2, ci, f51, r34, p5, fi1, RadioCallback, yh0, SystemCallback, jg2 {
    public static final Object p = null;
    public static volatile hg3 q;
    public static hg3 r;
    public final /* synthetic */ int n;
    public Object o;

    static {
        p = new Object();
    }

    public hg3(int r2) {
        this.n = r2;
        switch(r2) {
            case 14: goto L12;
            case 15: goto L10;
            case 16: goto L8;
            case 25: goto L6;
            default: goto L4;
        };
    L4:
        this.o = new LinkedHashMap();
        return;
    L6:
        this.o = new f13(new v72[16]);
        return;
    L8:
        this.o = new ArrayList();
        return;
    L10:
        this.o = AppDatabase.y().w();
        return;
    L12:
        this.o = wr1.m(Looper.getMainLooper());
    }

    public static hg3 C(Context r3) {
        if (r != null) goto L6;
        hg3 r0 = new hg3(11, false);
        r0.o = r3.getSharedPreferences(r3.getPackageName(), 0);
        r = r0;
    L6:
        return r;
    }

    public static hg3 E(Context r4) {
        Object r0 = p;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (q != null) goto L9;
        Context r5 = r4.getApplicationContext();     // Catch: Throwable -> L7
        hg3 r1 = new hg3(1, false);     // Catch: Throwable -> L7
        wo0 r2 = new wo0();     // Catch: Throwable -> L7
        r2.n = r5;     // Catch: Throwable -> L7
        r2.o = r5.getContentResolver();     // Catch: Throwable -> L7
        r1.o = r2;     // Catch: Throwable -> L7
        q = r1;     // Catch: Throwable -> L7
    L9:
        hg3 r6 = q;     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return r6;
    }

    public void A(t20 r5) {
        LinkedHashMap r4 = (LinkedHashMap) this.o;
        long[] r0 = r5.e;
        if (r0.length > 0) goto L5;
        return;
    L5:
        if (r4.containsKey(Long.valueOf(r0[0])) == true) goto L9;
        r4.put(Long.valueOf(r5.e[0]), r5);
        return;
    }

    public void B(int r23, int r24, l51 r25) {
        ni2 r4 = (ni2) this.o;
        k35 r2 = r4.b;
        SparseArray r5 = r4.c;
        be3 r6 = r4.k;
        be3 r7 = r4.i;
        int r11 = 2;
        int r13 = 0;
        if (r23 == 161) goto L51;
        if (r23 == 163) goto L51;
        if (r23 == 165) goto L41;
        if (r23 != 16877) goto L10;
        r4.h(r23);
        mi2 r0 = r4.y;
        int r3 = r0.h;
        if (r3 != 1685485123) goto L34;
    L38:
        byte[] r8 = new byte[r24];
        r0.P = r8;
        r25.readFully(r8, 0, r24);
        return;
    L34:
        if (r3 == 1685480259) goto L38;
        r25.l(r24);
        return;
    L10:
        if (r23 != 16981) goto L12;
        r4.h(r23);
        byte[] r9 = new byte[r24];
        r4.y.j = r9;
        r25.readFully(r9, 0, r24);
        return;
    L12:
        if (r23 != 18402) goto L14;
        byte[] r10 = new byte[r24];
        r25.readFully(r10, 0, r24);
        r4.h(r23);
        r4.y.k = new vv4(1, 0, 0, r10);
        return;
    L14:
        if (r23 != 21419) goto L16;
        Arrays.fill(r6.a, (byte) 0);
        r25.readFully(r6.a, 4 - r24, r24);
        r6.N(0);
        r4.A = (int) r6.C();
        return;
    L16:
        if (r23 != 25506) goto L18;
        r4.h(r23);
        byte[] r12 = new byte[r24];
        r4.y.l = r12;
        r25.readFully(r12, 0, r24);
        return;
    L18:
        if (r23 != 30322) goto L22;
        r4.h(r23);
        byte[] r14 = new byte[r24];
        r4.y.x = r14;
        r25.readFully(r14, 0, r24);
        return;
    L22:
        throw ParserException.a(null, "Unexpected id: " + r23);
    L41:
        if (r4.O != 2) goto L144;
        mi2 r1 = (mi2) r5.get(r4.U);
        int r15 = r4.X;
        be3 r16 = r4.p;
        if (r15 == 4) goto L46;
    L49:
        r25.l(r24);
        return;
    L46:
        if ("V_VP9".equals(r1.c) == false) goto L49;
        r16.K(r24);
        r25.readFully(r16.a, 0, r24);
        return;
    L144:
        return;
    L51:
        int r17 = 8;
        if (r4.O != 0) goto L54;
        r4.U = (int) r2.b(r25, false, true, 8);
        r4.V = r2.b;
        r4.Q = -9223372036854775807L;
        r4.O = 1;
        r7.K(0);
    L54:
        mi2 r18 = (mi2) r5.get(r4.U);
        if (r18 != null) goto L58;
        r25.l(r24 - r4.V);
        r4.O = 0;
        return;
    L58:
        r18.a0.getClass();
        if (r4.O != 1) goto L135;
        r4.l(r25, 3);
        int r19 = (r7.a[2] & 6) >> 1;
        if (r19 != 0) goto L71;
        r4.S = 1;
        int[] r20 = r4.T;
        if (r20 != null) goto L66;
        r20 = new int[1];
    L69:
        r4.T = r20;
        r20[0] = (r24 - r4.V) - 3;
    L70:
        int r110 = 2;
        int r111 = 0;
    L122:
        byte[] r21 = r7.a;
        int r22 = (r21[1] & 255) | (r21[r111] << 8);
        r4.P = r4.n(r22) + r4.M;
        if (r18.e != 1) goto L125;
    L130:
        int r26 = 1;
    L131:
        r4.W = r26;
        r4.O = r110;
        r4.R = r111;
        goto L135
    L125:
        if (r23 == 163) goto L127;
    L129:
        r26 = r111;
        goto L131
    L127:
        if ((r7.a[r110] & 128) != 128) goto L129;
    L66:
        if (r20.length >= 1) goto L69;
        r20 = new int[Math.max(r20.length * 2, 1)];
        goto L69
    L71:
        r4.l(r25, 4);
        int r112 = (r7.a[3] & 255) + 1;
        r4.S = r112;
        int[] r27 = r4.T;
        if (r27 != null) goto L74;
        r27 = new int[r112];
        int r113 = 4;
    L78:
        r4.T = r27;
        if (r19 != 2) goto L81;
        int r28 = (r24 - r4.V) - 4;
        int r29 = r4.S;
        Arrays.fill(r27, 0, r29, r28 / r29);
        goto L70
    L81:
        if (r19 != 1) goto L91;
        int r30 = 0;
        int r31 = 0;
        int r114 = r113;
    L83:
        int r32 = r4.S - 1;
        int[] r115 = r4.T;
        if (r30 >= r32) goto L90;
        r115[r30] = 0;
    L86:
        int r33 = r114 + 1;
        r4.l(r25, r33);
        int r116 = r7.a[r114] & 255;
        int[] r117 = r4.T;
        int r118 = r117[r30] + r116;
        r117[r30] = r118;
        if (r116 != 255) goto L88;
        r114 = r33;
        goto L86
    L88:
        r31 = r31 + r118;
        r30 = r30 + 1;
        r114 = r33;
        goto L83
    L90:
        r115[r32] = ((r24 - r4.V) - r114) - r31;
        goto L70
    L91:
        if (r19 != 3) goto L134;
        int r34 = 0;
        int r35 = 0;
        int r119 = r113;
    L93:
        int r36 = r4.S - 1;
        int[] r120 = r4.T;
        if (r34 >= r36) goto L121;
        r120[r34] = r13;
        int r37 = r119 + 1;
        r4.l(r25, r37);
        if (r7.a[r119] == 0) goto L120;
        int r121 = r13;
    L98:
        if (r121 >= r17) goto L107;
        int r122 = r17;
        int r38 = 1 << (7 - r121);
        int r123 = r13;
        if ((r7.a[r119] & r38) != 0) goto L101;
        r121 = r121 + 1;
        r13 = r123;
        r17 = r122;
        goto L98
    L101:
        int r124 = r37 + r121;
        r4.l(r25, r124);
        int r125 = r11;
        long r126 = (~r38) & (r7.a[r119] & 255);
    L102:
        if (r37 >= r124) goto L104;
        r126 = (r126 << r122) | ((long) (r7.a[r37] & 255));
        r37 = r37 + 1;
        goto L102
    L104:
        if (r34 <= 0) goto L109;
        r126 = r126 - ((1 << ((r121 * 7) + 6)) - 1);
    L109:
        if (r126 < (-2147483648L)) goto L118;
        if (r126 > 2147483647L) goto L118;
        int r39 = (int) r126;
        int[] r40 = r4.T;
        if (r34 == 0) goto L116;
        r39 = r39 + r40[r34 - 1];
    L116:
        r40[r34] = r39;
        r35 = r35 + r39;
        r34 = r34 + 1;
        r119 = r124;
        r13 = r123;
        r17 = r122;
        r11 = r125;
    L118:
        throw ParserException.a(null, "EBML lacing sample size out of range.");
    L107:
        r122 = r17;
        r125 = r11;
        r123 = r13;
        r126 = 0;
        r124 = r37;
        goto L109
    L120:
        throw ParserException.a(null, "No valid varint length mask found");
    L121:
        r110 = r11;
        r111 = r13;
        r120[r36] = ((r24 - r4.V) - r119) - r35;
        goto L122
    L134:
        throw ParserException.a(null, "Unexpected lacing value: " + r19);
    L74:
        r113 = 4;
        if (r27.length >= r112) goto L78;
        r27 = new int[Math.max(r27.length * 2, r112)];
    L135:
        if (r23 != 163) goto L141;
    L136:
        int r41 = r4.R;
        if (r41 >= r4.S) goto L139;
        r4.i(r18, ((long) ((r4.R * r18.f) / 1000)) + r4.P, r4.W, r4.o(r25, r18, r4.T[r41], false), 0);
        r4.R++;
        goto L136
    L139:
        r4.O = 0;
        return;
    L141:
        int r42 = r4.R;
        if (r42 >= r4.S) goto L158;
        int[] r43 = r4.T;
        r43[r42] = r4.o(r25, r18, r43[r42], true);
        r4.R++;
        goto L141
    }

    public Point D(String r5, Point r6) {
        SharedPreferences r4 = (SharedPreferences) this.o;
        int r0 = r6.x;
        int r7 = r6.y;
        return new Point(r4.getInt(r5 + "_SELECTOR_X", r0), r4.getInt(r5 + "_SELECTOR_Y", r7));
    }

    public void F(int r10, long r11) {
        ni2 r9 = (ni2) this.o;
        if (r10 == 240) goto L184;
        if (r10 == 241) goto L178;
        if (r10 == 20529) goto L173;
        if (r10 == 20530) goto L168;
        boolean r5 = false;
        switch(r10) {
            case 131: goto L150;
            case 136: goto L145;
            case 155: goto L143;
            case 159: goto L141;
            case 176: goto L139;
            case 179: goto L136;
            case 186: goto L133;
            case 215: goto L131;
            case 231: goto L129;
            case 238: goto L127;
            case 247: goto L124;
            case 251: goto L121;
            case 16871: goto L119;
            case 16980: goto L115;
            case 17029: goto L108;
            case 17143: goto L103;
            case 18401: goto L98;
            case 18408: goto L93;
            case 21420: goto L90;
            case 21432: goto L75;
            case 21680: goto L73;
            case 21682: goto L71;
            case 21690: goto L69;
            case 21930: goto L64;
            case 21938: goto L62;
            case 21998: goto L60;
            case 22186: goto L58;
            case 22203: goto L56;
            case 25188: goto L54;
            case 30114: goto L52;
            case 30321: goto L38;
            case 2352003: goto L36;
            case 2807729: goto L34;
            default: goto L12;
        };
    L12:
        switch(r10) {
            case 21945: goto L26;
            case 21946: goto L22;
            case 21947: goto L18;
            case 21948: goto L16;
            case 21949: goto L14;
            default: goto L197;
        };
    L14:
        r9.h(r10);
        r9.y.E = (int) r11;
        return;
    L16:
        r9.h(r10);
        r9.y.D = (int) r11;
        return;
    L18:
        r9.h(r10);
        r9.y.z = true;
        int r12 = c50.f((int) r11);
        if (r12 == (-1)) goto L189;
        r9.y.A = r12;
        return;
    L189:
        return;
    L22:
        r9.h(r10);
        int r13 = c50.g((int) r11);
        if (r13 == (-1)) goto L190;
        r9.y.B = r13;
        return;
    L190:
        return;
    L26:
        r9.h(r10);
        int r14 = (int) r11;
        if (r14 == 1) goto L32;
        if (r14 != 2) goto L198;
        r9.y.C = 1;
        return;
    L198:
        return;
    L32:
        r9.y.C = 2;
        return;
    L197:
        return;
    L34:
        r9.t = r11;
        return;
    L36:
        r9.h(r10);
        r9.y.f = (int) r11;
        return;
    L38:
        r9.h(r10);
        int r15 = (int) r11;
        if (r15 == 0) goto L50;
        if (r15 == 1) goto L48;
        if (r15 == 2) goto L46;
        if (r15 != 3) goto L199;
        r9.y.t = 3;
        return;
    L199:
        return;
    L46:
        r9.y.t = 2;
        return;
    L48:
        r9.y.t = 1;
        return;
    L50:
        r9.y.t = 0;
        return;
    L52:
        r9.Z = r11;
        return;
    L54:
        r9.h(r10);
        r9.y.R = (int) r11;
        return;
    L56:
        r9.h(r10);
        r9.y.U = r11;
        return;
    L58:
        r9.h(r10);
        r9.y.T = r11;
        return;
    L60:
        r9.h(r10);
        r9.y.g = (int) r11;
        return;
    L62:
        r9.h(r10);
        mi2 r16 = r9.y;
        r16.z = true;
        r16.p = (int) r11;
        return;
    L64:
        r9.h(r10);
        mi2 r17 = r9.y;
        if (r11 != 1) goto L67;
        r5 = true;
    L67:
        r17.X = r5;
        return;
    L69:
        r9.h(r10);
        r9.y.r = (int) r11;
        return;
    L71:
        r9.h(r10);
        r9.y.s = (int) r11;
        return;
    L73:
        r9.h(r10);
        r9.y.q = (int) r11;
        return;
    L75:
        int r18 = (int) r11;
        r9.h(r10);
        if (r18 == 0) goto L88;
        if (r18 == 1) goto L86;
        if (r18 != 3) goto L80;
        r9.y.y = 1;
        return;
    L80:
        if (r18 != 15) goto L200;
        r9.y.y = 3;
        return;
    L200:
        return;
    L86:
        r9.y.y = 2;
        return;
    L88:
        r9.y.y = 0;
        return;
    L90:
        r9.B = r11 + r9.s;
        return;
    L119:
        r9.h(r10);
        r9.y.h = (int) r11;
        return;
    L121:
        r9.Y = true;
        return;
    L127:
        r9.X = (int) r11;
        return;
    L129:
        r9.M = r9.n(r11);
        return;
    L131:
        r9.h(r10);
        r9.y.d = (int) r11;
        return;
    L133:
        r9.h(r10);
        r9.y.o = (int) r11;
        return;
    L139:
        r9.h(r10);
        r9.y.n = (int) r11;
        return;
    L141:
        r9.h(r10);
        r9.y.Q = (int) r11;
        return;
    L143:
        r9.Q = r9.n(r11);
        return;
    L145:
        r9.h(r10);
        mi2 r19 = r9.y;
        if (r11 != 1) goto L148;
        r5 = true;
    L148:
        r19.Y = r5;
        return;
    L150:
        int r110 = (int) r11;
        if (r110 == 1) goto L165;
        if (r110 != 2) goto L154;
        r9.h(r10);
        r9.y.e = 1;
        return;
    L154:
        if (r110 != 17) goto L156;
        r9.h(r10);
        r9.y.e = 3;
        return;
    L156:
        if (r110 == 33) goto L159;
        r9.h(r10);
        r9.y.e = -1;
        return;
    L159:
        r9.h(r10);
        r9.y.e = 5;
        return;
    L165:
        r9.h(r10);
        r9.y.e = 2;
        return;
    L93:
        if (r11 != 1) goto L96;
        return;
    L96:
        throw ParserException.a(null, "AESSettingsCipherMode " + r11 + " not supported");
    L98:
        if (r11 != 5) goto L101;
        return;
    L101:
        throw ParserException.a(null, "ContentEncAlgo " + r11 + " not supported");
    L103:
        if (r11 != 1) goto L106;
        return;
    L106:
        throw ParserException.a(null, "EBMLReadVersion " + r11 + " not supported");
    L108:
        if (r11 < 1) goto L113;
        if (r11 > 2) goto L113;
        return;
    L113:
        throw ParserException.a(null, "DocTypeReadVersion " + r11 + " not supported");
    L115:
        if (r11 != 3) goto L118;
        return;
    L118:
        throw ParserException.a(null, "ContentCompAlgo " + r11 + " not supported");
    L124:
        if (r9.z == true) goto L191;
        r9.g(r10);
        r9.F = (int) r11;
        return;
    L191:
        return;
    L136:
        if (r9.z == true) goto L192;
        r9.g(r10);
        r9.E = r9.n(r11);
        return;
    L192:
        return;
    L168:
        if (r11 != 1) goto L171;
        return;
    L171:
        throw ParserException.a(null, "ContentEncodingScope " + r11 + " not supported");
    L173:
        if (r11 != 0) goto L176;
        return;
    L176:
        throw ParserException.a(null, "ContentEncodingOrder " + r11 + " not supported");
    L178:
        if (r9.z == true) goto L193;
        r9.g(r10);
        if (r9.G != (-1)) goto L194;
        r9.G = r11;
        return;
    L194:
        return;
    L193:
        return;
    L184:
        if (r9.z == true) goto L195;
        r9.g(r10);
        if (r9.H != (-1)) goto L196;
        r9.H = r11;
        return;
    L196:
        return;
    }

    public boolean G(ms2 r6) {
        wo0 r5 = (wo0) this.o;
        os2 r7 = r6.a;
        Context r0 = (Context) r5.n;
        int r1 = r7.b;
        String r2 = r7.a;
        int r3 = r7.c;
        if (r0.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", r1, r3) != 0) goto L33;
        return true;
    L33:
        if (r0.getPackageManager().getApplicationInfo(r2, 0) != null) goto L10;
    L28:
        return false;
    L10:
        if (r5.B(r7, "android.permission.STATUS_BAR_SERVICE") == false) goto L12;
        return true;
    L12:
        if (r5.B(r7, "android.permission.MEDIA_CONTENT_CONTROL") == false) goto L14;
        return true;
    L14:
        if (r3 != 1000) goto L16;
        return true;
    L16:
        if (r3 == Process.myUid()) goto L41;
        String r8 = Settings.Secure.getString((ContentResolver) r5.o, "enabled_notification_listeners");
        if (r8 == null) goto L28;
        String[] r9 = r8.split(":");
        int r10 = 0;
    L21:
        if (r10 >= r9.length) goto L28;
        ComponentName r4 = ComponentName.unflattenFromString(r9[r10]);
        if (r4 == null) goto L27;
        if (r4.getPackageName().equals(r2) == false) goto L27;
        return true;
    L27:
        r10 = r10 + 1;
        goto L21
    L41:
        return true;
    L31:
        l93.A("MediaSessionManager", "Package " + r2 + " doesn't exist");
        return false;
    }

    public void H(String r3, List r4, Bundle r5, Bundle r6) {
        Bundle r0 = new Bundle();
        r0.putString("data_media_item_id", r3);
        r0.putBundle("data_options", r5);
        r0.putBundle("data_notify_children_changed_options", r6);
        if (r4 == null) goto L5;
        r0.putParcelableArrayList("data_media_item_list", uc5.k(r4, MediaBrowserCompat$MediaItem.CREATOR));
    L5:
        Message r7 = Message.obtain();
        r7.what = 3;
        r7.arg1 = 2;
        r7.setData(r0);
        ((Messenger) this.o).send(r7);
    }

    public void I(int r8, long r9, long r11) {
        ni2 r7 = (ni2) this.o;
        r7.j0.getClass();
        if (r8 != 160) goto L5;
        r7.Y = false;
        r7.Z = 0;
        return;
    L5:
        if (r8 != 174) goto L7;
        mi2 r10 = new mi2();
        r10.n = -1;
        r10.o = -1;
        r10.p = -1;
        r10.q = -1;
        r10.r = -1;
        r10.s = 0;
        r10.t = -1;
        r10.u = 0.0f;
        r10.v = 0.0f;
        r10.w = 0.0f;
        r10.x = null;
        r10.y = -1;
        r10.z = false;
        r10.A = -1;
        r10.B = -1;
        r10.C = -1;
        r10.D = 1000;
        r10.E = 200;
        r10.F = -1.0f;
        r10.G = -1.0f;
        r10.H = -1.0f;
        r10.I = -1.0f;
        r10.J = -1.0f;
        r10.K = -1.0f;
        r10.L = -1.0f;
        r10.M = -1.0f;
        r10.N = -1.0f;
        r10.O = -1.0f;
        r10.Q = 1;
        r10.R = -1;
        r10.S = 8000;
        r10.T = 0;
        r10.U = 0;
        r10.W = false;
        r10.Y = true;
        r10.Z = "eng";
        r7.y = r10;
        r10.a = r7.w;
        return;
    L7:
        if (r8 == 183) goto L57;
        if (r8 == 187) goto L53;
        if (r8 != 19899) goto L13;
        r7.A = -1;
        r7.B = -1;
        return;
    L13:
        if (r8 != 20533) goto L15;
        r7.h(r8);
        r7.y.i = true;
        return;
    L15:
        if (r8 != 21968) goto L17;
        r7.h(r8);
        r7.y.z = true;
        return;
    L17:
        if (r8 != 408125543) goto L19;
        long r5 = r7.s;
        if (r5 != (-1)) goto L40;
    L44:
        r7.s = r9;
        r7.r = r11;
        return;
    L40:
        if (r5 == r9) goto L44;
        throw ParserException.a(null, "Multiple Segment elements not supported");
    L19:
        if (r8 == 475249515) goto L34;
        if (r8 == 524531317) goto L24;
        return;
    L24:
        if (r7.z == false) goto L26;
        return;
    L26:
        if (r7.d == true) goto L28;
    L31:
        r7.j0.w(new bo(r7.v));
        r7.z = true;
        return;
    L28:
        if (r7.K == (-1)) goto L31;
        r7.J = true;
        return;
    L34:
        if (r7.z == true) goto L65;
        r7.D = true;
        return;
    L65:
        return;
    L53:
        if (r7.z == true) goto L66;
        r7.g(r8);
        r7.E = -9223372036854775807L;
        return;
    L66:
        return;
    L57:
        if (r7.z == true) goto L67;
        r7.g(r8);
        r7.F = -1;
        r7.G = -1;
        r7.H = -1;
        return;
    }

    public void J(int r2, String r3) {
        ni2 r1 = (ni2) this.o;
        if (r2 != 134) goto L5;
        r1.h(r2);
        r1.y.c = r3;
        return;
    L5:
        if (r2 == 17026) goto L16;
        if (r2 != 21358) goto L9;
        r1.h(r2);
        r1.y.b = r3;
        return;
    L9:
        if (r2 == 2274716) goto L11;
        return;
    L11:
        r1.h(r2);
        r1.y.Z = r3;
        return;
    L16:
        if ("webm".equals(r3) == false) goto L18;
    L22:
        r1.w = r3.equals("webm");
        return;
    L18:
        if ("matroska".equals(r3) == true) goto L22;
        throw ParserException.a(null, "DocType " + r3 + " not supported");
    }

    @Override // defpackage.fc2
    public void a(int r1, int r2) {
        ((ni4) this.o).n.c(r1, r2);
    }

    @Override // defpackage.f51
    public int b() {
        return ((ExtendedFloatingActionButton) this.o).getMeasuredHeight();
    }

    @Override // defpackage.fi1
    public g04 build() {
        g04 r0 = (g04) this.o;
        if (r0 == null) goto L6;
        return r0;
    L6:
        return new g04();
    }

    @Override // defpackage.yh0
    public void c() {
        ((aw3) this.o).f();
    }

    @Override // defpackage.f51
    public int d() {
        ExtendedFloatingActionButton r2 = (ExtendedFloatingActionButton) this.o;
        return ((r2.getMeasuredWidth() - (r2.getCollapsedPadding() * 2)) + r2.M) + r2.N;
    }

    @Override // defpackage.j4
    public boolean e() {
        ActionBar r0 = ((Activity) this.o).getActionBar();
        if (r0 != null) goto L5;
        return false;
    L5:
        if ((r0.getDisplayOptions() & 4) == 0) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.r34
    public boolean f(gr1 r1) {
        r1.getClass();
        return ((gv3) this.o).f(r1);
    }

    @Override // defpackage.jg2
    public Object g(Object r1, Object r2) {
        return ((eg1) this.o).mo77apply(r2);
    }

    @Override // defpackage.j4
    public Context h() {
        Activity r1 = (Activity) this.o;
        ActionBar r0 = r1.getActionBar();
        if (r0 != null) goto L5;
        return r1;
    L5:
        return r0.getThemedContext();
    }

    @Override // defpackage.p5
    public void i(Object r4) {
        o5 r5 = (o5) r4;
        ld1 r0 = (ld1) this.o;
        gd1 r1 = (gd1) r0.E.pollLast();
        if (r1 != null) goto L6;
        Log.w("FragmentManager", "No Activities were started for result for " + this);
        return;
    L6:
        String r3 = r1.n;
        int r2 = r1.o;
        kc1 r6 = r0.c.u(r3);
        if (r6 != null) goto L10;
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + r3);
        return;
    L10:
        r6.D(r2, r5.n, r5.o);
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public Object invoke(sn3 r4, vd0 r5) {
        Object r3 = xl.g(r4, new sb((tb) this.o, null, 0), r5);
        if (r3 != xe0.n) goto L6;
        return r3;
    L6:
        return j15.a;
    }

    @Override // defpackage.r34
    public boolean isCanceled() {
        return ((gv3) this.o).x.m();
    }

    @Override // defpackage.f51
    public int j() {
        return ((ExtendedFloatingActionButton) this.o).N;
    }

    @Override // defpackage.fc2
    public void k(int r1, int r2) {
        ((ni4) this.o).n.e(r1, r2);
    }

    @Override // defpackage.yh0
    public Object l() {
        aw3 r0 = (aw3) this.o;
        r0.reset();
        return r0;
    }

    @Override // defpackage.r34
    public boolean m(cv3 r1) {
        return ((gv3) this.o).m(r1);
    }

    @Override // defpackage.r34
    public f6 n() {
        return ((gv3) this.o).v;
    }

    @Override // defpackage.f51
    public ViewGroup.LayoutParams o() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    @Override // com.eddyizm.tempus.interfaces.RadioCallback
    public void onDismiss() {
        hp1 r1 = (hp1) this.o;
        r1.n0.c(r1.v());
    }

    @Override // com.eddyizm.tempus.interfaces.SystemCallback
    public void onError(Exception r3) {
        r3.getClass();
        if (cx.h() == false) goto L5;
        int r0 = R.string.la_server_toast_connection_failure;
    L6:
        oe2.h0((oe2) this.o, r0, r3.getMessage(), 1);
        return;
    L5:
        r0 = R.string.la_server_toast_connection_error;
        goto L6
    }

    @Override // com.eddyizm.tempus.interfaces.SystemCallback
    public void onNetworkFailure(Exception r3) {
        r3.getClass();
        oe2.h0((oe2) this.o, R.string.la_server_toast_connection_error, r3.getMessage(), 1);
    }

    @Override // com.eddyizm.tempus.interfaces.SystemCallback
    public void onSuccess(String r1, String r2, String r3) {
        oe2.h0((oe2) this.o, R.string.la_server_toast_connection_success, null, 0);
    }

    @Override // defpackage.zw
    public int p() {
        switch(this.n) {
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return ((qe1) this.o).n();
    L7:
        return ((w0) this.o).q();
    }

    @Override // defpackage.j4
    public void q(Drawable r1, int r2) {
        ActionBar r0 = ((Activity) this.o).getActionBar();
        if (r0 == null) goto L6;
        r0.setHomeAsUpIndicator(r1);
        r0.setHomeActionContentDescription(r2);
        return;
    }

    @Override // defpackage.fc2
    public void r(int r1, int r2) {
        ((ni4) this.o).n.f(r1, r2);
    }

    @Override // defpackage.f51
    public int s() {
        return ((ExtendedFloatingActionButton) this.o).M;
    }

    @Override // defpackage.j4
    public Drawable t() {
        TypedArray r4 = h().obtainStyledAttributes(null, new int[]{android.R.attr.homeAsUpIndicator}, android.R.attr.actionBarStyle, 0);
        Drawable r0 = r4.getDrawable(0);
        r4.recycle();
        return r0;
    }

    @Override // defpackage.j4
    public void u(int r1) {
        ActionBar r0 = ((Activity) this.o).getActionBar();
        if (r0 == null) goto L6;
        r0.setHomeActionContentDescription(r1);
        return;
    }

    @Override // defpackage.r34
    public ii v() {
        return ((gv3) this.o).B;
    }

    @Override // defpackage.r34
    public q34 w() {
        return ((gv3) this.o).a();
    }

    @Override // defpackage.r83
    public pb5 x(View r5, pb5 r6) {
        switch(this.n) {
            case 7: goto L31;
            default: goto L4;
        };
    L4:
        mb5 r7 = r6.a;
        CoordinatorLayout r4 = (CoordinatorLayout) this.o;
        if (Objects.equals(r4.z, r6) == true) goto L30;
        r4.z = r6;
        int r1 = 0;
        boolean r2 = true;
        if (r6.d() <= 0) goto L9;
        boolean r0 = true;
    L10:
        r4.A = r0;
        if (r0 == false) goto L13;
    L15:
        r2 = false;
    L16:
        r4.setWillNotDraw(r2);
        if (r7.r() == true) goto L29;
        int r3 = r4.getChildCount();
    L20:
        if (r1 >= r3) goto L29;
        View r8 = r4.getChildAt(r1);
        WeakHashMap r9 = j65.a;
        if (r8.getFitsSystemWindows() == false) goto L28;
        if (((ge0) r8.getLayoutParams()).a == null) goto L28;
        if (r7.r() == true) goto L29;
    L28:
        r1 = r1 + 1;
    L29:
        r4.requestLayout();
        goto L30
    L13:
        if (r4.getBackground() != null) goto L15;
    L9:
        r0 = false;
    L30:
        return r6;
    L31:
        fr r10 = (fr) this.o;
        r10.n = r6.a();
        r10.o = r6.b();
        r10.p = r6.c();
        r10.g();
        return r6;
    }

    @Override // defpackage.fc2
    public void y(int r1, int r2, Object r3) {
        ((ni4) this.o).n.d(r1, r2, r3);
    }

    @Override // defpackage.ci
    public Object z(q64 r4, Float r5, Float r6, if1 r7, vg4 r8) {
        Object r3 = su3.c(r4, r5.floatValue(), j51.a(0.0f, r6.floatValue(), 28), (ui0) this.o, r7, r8);
        if (r3 != xe0.n) goto L6;
        return r3;
    L6:
        return (ud) r3;
    }

    public /* synthetic */ hg3(int r1, boolean r2) {
        this.n = r1;
    }

    public hg3(InputStream r2, qj0 r3) {
        this.n = 24;
        aw3 r0 = new aw3(r2, r3);
        this.o = r0;
        r0.mark(5242880);
    }

    public /* synthetic */ hg3(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }
}
