package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nl {
    public static final nl c = null;
    public static final gy3 d = null;
    public static final bx1 e = null;
    public final SparseArray a;
    public final int b;

    static {
        c = new nl(yw1.o(ml.d));
        Object[] r0 = {2, 5, 6};
        gh0.f(3, r0);
        d = yw1.i(3, r0);
        ue1 r1 = new ue1(4);
        r1.x(5, 6);
        r1.x(17, 6);
        r1.x(7, 6);
        r1.x(30, 10);
        r1.x(18, 6);
        r1.x(6, 8);
        r1.x(8, 8);
        r1.x(14, 8);
        e = r1.d(true);
    }

    public nl(gy3 r6) {
        this.a = new SparseArray();
        int r0 = 0;
        int r1 = 0;
    L4:
        if (r1 >= r6.q) goto L6;
        ml r2 = (ml) r6.get(r1);
        this.a.put(r2.a, r2);
        r1 = r1 + 1;
        goto L4
    L6:
        int r7 = 0;
    L8:
        if (r0 >= this.a.size()) goto L10;
        r7 = Math.max(r7, ((ml) this.a.valueAt(r0)).b);
        r0 = r0 + 1;
        goto L8
    L10:
        this.b = r7;
    }

    public static gy3 a(int[] r4, int r5) {
        uw1 r0 = yw1.j();
        int r1 = 0;
        if (r4 != null) goto L6;
        r4 = new int[0];
    L6:
        if (r1 >= r4.length) goto L9;
        r0.c(new ml(r4[r1], r5));
        r1 = r1 + 1;
        goto L6
    L9:
        return r0.f();
    }

    public static nl b(Context r2, il r3, AudioDeviceInfo r4) {
        return c(r2, r2.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), r3, r4);
    }

    public static nl c(Context r16, Intent r17, il r18, AudioDeviceInfo r19) {
        AudioManager r3 = xl.n(r16);
        int r5 = 0;
        if (r19 == null) goto L6;
        AudioDeviceInfo r6 = r19;
    L12:
        int r7 = Build.VERSION.SDK_INT;
        bx1 r8 = e;
        if (r7 >= 33) goto L15;
    L40:
        if (r6 != null) goto L42;
        AudioDeviceInfo[] r4 = r3.getDevices(2);
    L43:
        ix1 r9 = new ix1(4);
        Integer[] r13 = {8, 7};
        gh0.f(2, r13);
        r9.e(2);
        System.arraycopy(r13, 0, r9.a, r9.b, 2);
        r9.b += 2;
        if (r7 < 31) goto L46;
        Integer[] r14 = {26, 27};
        gh0.f(2, r14);
        r9.e(2);
        System.arraycopy(r14, 0, r9.a, r9.b, 2);
        r9.b += 2;
    L46:
        if (r7 < 33) goto L48;
        r9.c(30);
    L48:
        jx1 r1 = r9.g();
        int r10 = r4.length;
        int r11 = 0;
    L49:
        if (r11 >= r10) goto L55;
        if (r1.contains(Integer.valueOf(r4[r11].getType())) == true) goto L53;
        r11 = r11 + 1;
        goto L49
    L53:
        return c;
    L55:
        ix1 r2 = new ix1(4);
        r2.c(2);
        if (Build.VERSION.SDK_INT >= 29) goto L58;
    L75:
        ContentResolver r12 = r16.getContentResolver();
        if (Settings.Global.getInt(r12, "use_external_surround_sound_flag", 0) != 1) goto L78;
        boolean r15 = true;
    L79:
        if (r15 == true) goto L85;
        String r20 = Build.MANUFACTURER;
        if (r20.equals("Amazon") == true) goto L85;
        if (r20.equals("Xiaomi") == true) goto L85;
    L87:
        if (r17 == null) goto L97;
        if (r15 == true) goto L97;
        if (r17.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) goto L97;
        int[] r21 = r17.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (r21 == null) goto L95;
        List r22 = jz4.e(r21);
        r22.getClass();
        r2.d(r22);
    L95:
        return new nl(a(jz4.N(r2.g()), r17.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    L97:
        return new nl(a(jz4.N(r2.g()), 10));
    L85:
        if (Settings.Global.getInt(r12, "external_surround_sound_enabled", 0) != 1) goto L87;
        gy3 r23 = d;
        r23.getClass();
        r2.d(r23);
        goto L87
    L78:
        r15 = false;
        goto L79
    L58:
        if (f35.O(r16) == false) goto L60;
    L61:
        uw1 r0 = yw1.j();
        jx1 r24 = r8.o;
        if (r24 != null) goto L64;
        r24 = r8.d();
        r8.o = r24;
    L64:
        o15 r25 = r24.h();
    L66:
        if (r25.hasNext() == false) goto L73;
        Integer r26 = (Integer) r25.next();
        int r27 = r26.intValue();
        if (Build.VERSION.SDK_INT < f35.r(r27)) goto L66;
        if (z9.w(new AudioFormat.Builder().setChannelMask(12).setEncoding(r27).setSampleRate(48000).build(), r18.c()) == false) goto L66;
        r0.c(r26);
        goto L66
    L73:
        r0.c(2);
        gy3 r28 = r0.f();
        r28.getClass();
        r2.d(r28);
        return new nl(a(jz4.N(r2.g()), 10));
    L60:
        if (r16.getPackageManager().hasSystemFeature("android.hardware.type.automotive") == false) goto L75;
    L42:
        r4 = new AudioDeviceInfo[]{r6};
        goto L43
    L15:
        if (f35.O(r16) == false) goto L17;
    L18:
        List r29 = n3.B(r3, r18.c());
        HashMap r30 = new HashMap();
        r30.put(2, new HashSet(jz4.e(new int[]{12})));
    L20:
        if (r5 >= r29.size()) goto L34;
        AudioProfile r31 = db.d(r29.get(r5));
        if (db.a(r31) == 1) goto L33;
        int r32 = db.A(r31);
        if (f35.L(r32) == true) goto L30;
        if (r8.containsKey(Integer.valueOf(r32)) == false) goto L33;
    L30:
        if (r30.containsKey(Integer.valueOf(r32)) == false) goto L32;
        Set r33 = (Set) r30.get(Integer.valueOf(r32));
        r33.getClass();
        r33.addAll(jz4.e(db.z(r31)));
        goto L33
    L32:
        r30.put(Integer.valueOf(r32), new HashSet(jz4.e(db.z(r31))));
    L33:
        r5 = r5 + 1;
        goto L20
    L34:
        uw1 r34 = yw1.j();
        Iterator r35 = r30.entrySet().iterator();
    L36:
        if (r35.hasNext() == false) goto L39;
        Map.Entry r36 = (Map.Entry) r35.next();
        r34.c(new ml(((Integer) r36.getKey()).intValue(), (Set) r36.getValue()));
        goto L36
    L39:
        return new nl(r34.f());
    L17:
        if (r16.getPackageManager().hasSystemFeature("android.hardware.type.automotive") == false) goto L40;
    L6:
        if (Build.VERSION.SDK_INT < 33) goto L11;
        List r37 = n3.r(r3, r18.c());
        if (r37.isEmpty() == true) goto L11;
        r6 = (AudioDeviceInfo) r37.get(0);
    L11:
        r6 = null;
        goto L12
    }

    public final Pair d(tb1 r14, il r15) {
        String r0 = r14.n;
        r0.getClass();
        int r1 = lw2.c(r0, r14.k);
        Integer r2 = Integer.valueOf(r1);
        bx1 r3 = e;
        if (r3.containsKey(r2) == false) goto L92;
        int r4 = 6;
        SparseArray r13 = this.a;
        if (r1 == 18) goto L8;
    L10:
        if (r1 != 8) goto L14;
        if (f35.l(r13, 8) == true) goto L14;
    L17:
        r1 = 7;
    L19:
        if (f35.l(r13, r1) == false) goto L93;
        ml r16 = (ml) r13.get(r1);
        r16.getClass();
        int r6 = r16.b;
        jx1 r7 = r16.c;
        int r8 = r14.F;
        boolean r10 = false;
        if (r8 == (-1)) goto L40;
        if (r1 == 18) goto L40;
        if (r14.n.equals("audio/vnd.dts.uhd;profile=p2") == true) goto L28;
    L31:
        if (r7 != null) goto L34;
        if (r8 > r6) goto L38;
        r10 = true;
    L38:
        if (r10 == false) goto L95;
    L64:
        int r17 = Build.VERSION.SDK_INT;
        if (r17 > 28) goto L75;
        if (r8 != 7) goto L69;
        r4 = 8;
    L77:
        if (r17 <= 26) goto L79;
    L82:
        int r18 = f35.s(r4);
        if (r18 != 0) goto L87;
        return null;
    L87:
        return Pair.create(Integer.valueOf(r1), Integer.valueOf(r18));
    L79:
        if ("fugu".equals(Build.DEVICE) == false) goto L82;
        if (r4 != 1) goto L82;
        r4 = 2;
        goto L82
    L69:
        if (r8 == 3) goto L77;
        if (r8 == 4) goto L77;
        if (r8 == 5) goto L77;
    L75:
        r4 = r8;
        goto L77
    L95:
        return null;
    L34:
        int r19 = f35.s(r8);
        if (r19 == 0) goto L38;
        r10 = r7.contains(Integer.valueOf(r19));
        goto L38
    L28:
        if (Build.VERSION.SDK_INT >= 33) goto L31;
        if (r8 <= 10) goto L64;
        return null;
    L40:
        int r110 = r14.G;
        if (r110 != (-1)) goto L44;
        r110 = 48000;
    L44:
        int r111 = r16.a;
        if (r7 == null) goto L48;
    L63:
        r8 = r6;
        goto L64
    L48:
        if (Build.VERSION.SDK_INT < 29) goto L59;
        r6 = 10;
    L50:
        if (r6 <= 0) goto L58;
        int r5 = f35.s(r6);
        if (r5 == 0) goto L57;
        if (z9.w(new AudioFormat.Builder().setEncoding(r111).setSampleRate(r110).setChannelMask(r5).build(), r15.c()) == true) goto L63;
    L57:
        r6 = r6 - 1;
        goto L50
    L58:
        r6 = 0;
        goto L63
    L59:
        Object r112 = 0;
        Object r113 = r3.get(Integer.valueOf(r111));
        if (r113 == null) goto L62;
        r112 = r113;
    L62:
        r6 = ((Integer) r112).intValue();
        goto L63
    L93:
        return null;
    L14:
        if (r1 != 30) goto L19;
        if (f35.l(r13, 30) == true) goto L19;
    L8:
        if (f35.l(r13, 18) == true) goto L10;
        r1 = 6;
        goto L19
    L92:
        return null;
    }

    public final boolean equals(Object r9) {
        if (this != r9) goto L6;
    L30:
        return true;
    L6:
        if ((r9 instanceof nl) == false) goto L31;
        nl r10 = (nl) r9;
        SparseArray r1 = r10.a;
        String r3 = f35.a;
        SparseArray r4 = this.a;
        if (r4 != null) goto L13;
        if (r1 != null) goto L12;
    L11:
        boolean r2 = true;
    L27:
        if (r2 == false) goto L31;
        if (this.b != r10.b) goto L31;
    L12:
        r2 = false;
        goto L27
    L13:
        if (r1 == null) goto L12;
        if (Build.VERSION.SDK_INT < 31) goto L18;
        r2 = b05.f(r4, r1);
        goto L27
    L18:
        int r5 = r4.size();
        if (r5 != r1.size()) goto L12;
        int r6 = 0;
    L22:
        if (r6 >= r5) goto L11;
        if (Objects.equals(r4.valueAt(r6), r1.get(r4.keyAt(r6))) == false) goto L12;
        r6 = r6 + 1;
    L31:
        return false;
    }

    public final int hashCode() {
        String r0 = f35.a;
        int r1 = Build.VERSION.SDK_INT;
        SparseArray r2 = this.a;
        if (r1 < 31) goto L5;
        int r3 = b05.b(r2);
    L10:
        return (r3 * 31) + this.b;
    L5:
        r3 = 17;
        int r4 = 0;
    L7:
        if (r4 >= r2.size()) goto L10;
        int r5 = r2.keyAt(r4);
        int r6 = (r5 + (r3 * 31)) * 31;
        r3 = Objects.hashCode(r2.valueAt(r4)) + r6;
        r4 = r4 + 1;
        goto L7
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + "]";
    }
}
