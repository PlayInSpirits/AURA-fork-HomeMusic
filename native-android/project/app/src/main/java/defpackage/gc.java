package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gc {
    public int a;
    public final Object b;
    public Object c;
    public Object d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.content.Context, android.content.res.Resources] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public gc(s63 r20) {
        this.d = new Bundle();
        this.c = r20;
        Context r2 = r20.a;
        ArrayList r3 = r20.x;
        ArrayList r4 = r20.c;
        ArrayList r5 = r20.d;
        if (Build.VERSION.SDK_INT < 26) goto L5;
        this.b = r50.b(r2, r20.s);
    L6:
        Notification r6 = r20.v;
        ?? r10 = 0;
        Notification.Builder r8 = ((Notification.Builder) this.b).setWhen(r6.when).setSmallIcon(r6.icon, r6.iconLevel).setContent(r6.contentView).setTicker(r6.tickerText, null).setVibrate(r6.vibrate).setLights(r6.ledARGB, r6.ledOnMS, r6.ledOffMS);
        if ((r6.flags & 2) == 0) goto L9;
        boolean r9 = true;
    L10:
        Notification.Builder r11 = r8.setOngoing(r9);
        if ((r6.flags & 8) == 0) goto L13;
        boolean r12 = true;
    L14:
        Notification.Builder r13 = r11.setOnlyAlertOnce(r12);
        if ((r6.flags & 16) == 0) goto L17;
        boolean r14 = true;
    L18:
        Notification.Builder r15 = r13.setAutoCancel(r14).setDefaults(r6.defaults).setContentTitle(r20.e).setContentText(r20.f).setContentInfo(null).setContentIntent(r20.g).setDeleteIntent(r6.deleteIntent);
        if ((r6.flags & 128) == 0) goto L21;
        boolean r16 = true;
    L22:
        r15.setFullScreenIntent(null, r16).setNumber(0).setProgress(r20.m, r20.n, false);
        Notification.Builder r17 = (Notification.Builder) this.b;
        IconCompat r18 = r20.h;
        if (r18 != null) goto L25;
        Icon r7 = null;
    L26:
        r17.setLargeIcon(r7);
        ((Notification.Builder) this.b).setSubText(null).setUsesChronometer(r20.k).setPriority(r20.i);
        ArrayList r19 = r20.b;
        int r21 = r19.size();
        int r22 = 0;
    L28:
        if (r22 >= r21) goto L52;
        Object r110 = r19.get(r22);
        r22 = r22 + 1;
        q63 r111 = (q63) r110;
        if (r111.b != null) goto L34;
        int r112 = r111.e;
        if (r112 == 0) goto L34;
        r111.b = IconCompat.b(r10, "", r112);
    L34:
        IconCompat r113 = r111.b;
        boolean r114 = r111.c;
        Bundle r23 = r111.a;
        if (r113 == 0) goto L37;
        Icon r115 = r113.e(r10);
    L38:
        ArrayList r116 = r19;
        Notification.Action.Builder r117 = new Notification.Action.Builder(r115, r111.f, r111.g);
        if (r23 == null) goto L41;
        Bundle r24 = new Bundle(r23);
    L42:
        r24.putBoolean("android.support.allowGeneratedReplies", r114);
        r117.setAllowGeneratedReplies(r114);
        r24.putInt("android.support.action.semanticAction", 0);
        int r25 = Build.VERSION.SDK_INT;
        if (r25 < 28) goto L46;
        ne.s(r117);
    L46:
        if (r25 < 29) goto L49;
        yh.o(r117);
    L49:
        if (r25 < 31) goto L51;
        qe.e(r117);
    L51:
        r24.putBoolean("android.support.action.showsUserInterface", r111.d);
        r117.addExtras(r24);
        ((Notification.Builder) this.b).addAction(r117.build());
        r19 = r116;
        r10 = 0;
        goto L28
    L41:
        r24 = new Bundle();
        goto L42
    L37:
        r115 = r10;
        goto L38
    L52:
        Bundle r26 = r20.q;
        if (r26 == null) goto L55;
        ((Bundle) this.d).putAll(r26);
    L55:
        ((Notification.Builder) this.b).setShowWhen(r20.j);
        ((Notification.Builder) this.b).setLocalOnly(r20.p);
        ((Notification.Builder) this.b).setGroup(r20.o);
        ((Notification.Builder) this.b).setSortKey(null);
        ((Notification.Builder) this.b).setGroupSummary(false);
        this.a = 0;
        ((Notification.Builder) this.b).setCategory(null);
        ((Notification.Builder) this.b).setColor(0);
        ((Notification.Builder) this.b).setVisibility(r20.r);
        ((Notification.Builder) this.b).setPublicVersion(null);
        ((Notification.Builder) this.b).setSound(r6.sound, r6.audioAttributes);
        if (Build.VERSION.SDK_INT >= 28) goto L68;
        if (r4 != null) goto L59;
        ArrayList r27 = null;
    L61:
        if (r27 == null) goto L68;
        if (r3 != null) goto L65;
        r3 = r27;
        goto L68
    L65:
        qi r28 = new qi(r3.size() + r27.size());
        r28.addAll(r27);
        r28.addAll(r3);
        r3 = new ArrayList(r28);
        goto L68
    L59:
        r27 = new ArrayList(r4.size());
        Iterator r29 = r4.iterator();
        if (r29.hasNext() == false) goto L61;
        throw xa3.d(r29);
    L68:
        if (r3 == null) goto L75;
        if (r3.isEmpty() == true) goto L75;
        int r30 = r3.size();
        int r31 = 0;
    L72:
        if (r31 >= r30) goto L75;
        Object r32 = r3.get(r31);
        r31 = r31 + 1;
        ((Notification.Builder) this.b).addPerson((String) r32);
    L75:
        if (r5.size() > 0) goto L77;
        ArrayList r118 = r4;
    L106:
        ((Notification.Builder) this.b).setExtras(r20.q);
        ((Notification.Builder) this.b).setRemoteInputHistory(null);
        int r33 = Build.VERSION.SDK_INT;
        if (r33 < 26) goto L112;
        r50.l((Notification.Builder) this.b);
        r50.r((Notification.Builder) this.b);
        r50.s((Notification.Builder) this.b);
        r50.t((Notification.Builder) this.b);
        r50.n((Notification.Builder) this.b, 0);
        if (TextUtils.isEmpty(r20.s) == true) goto L112;
        ((Notification.Builder) this.b).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
    L112:
        if (r33 < 28) goto L118;
        Iterator r34 = r118.iterator();
        if (r34.hasNext() == false) goto L118;
        throw xa3.d(r34);
    L118:
        if (r33 < 29) goto L121;
        yh.m((Notification.Builder) this.b, r20.u);
        yh.n((Notification.Builder) this.b);
    L121:
        if (r33 < 31) goto L126;
        int r35 = r20.t;
        if (r35 == 0) goto L126;
        qe.f((Notification.Builder) this.b, r35);
    L126:
        if (r33 < 36) goto L129;
        r3.e((Notification.Builder) this.b);
    L129:
        if (r20.w == false) goto L144;
        ((s63) this.c).getClass();
        this.a = 1;
        ((Notification.Builder) this.b).setVibrate(null);
        ((Notification.Builder) this.b).setSound(null);
        int r1 = r6.defaults & (-4);
        r6.defaults = r1;
        ((Notification.Builder) this.b).setDefaults(r1);
        if (r33 >= 26) goto L133;
        return;
    L133:
        if (TextUtils.isEmpty(((s63) this.c).o) == false) goto L135;
        ((Notification.Builder) this.b).setGroup("silent");
    L135:
        r50.n((Notification.Builder) this.b, 1);
        return;
    L144:
        return;
    L77:
        if (r20.q != null) goto L79;
        r20.q = new Bundle();
    L79:
        Bundle r36 = r20.q.getBundle("android.car.EXTENSIONS");
        if (r36 != null) goto L82;
        r36 = new Bundle();
    L82:
        Bundle r37 = new Bundle(r36);
        Bundle r38 = new Bundle();
        int r119 = 0;
    L84:
        if (r119 >= r5.size()) goto L101;
        String r39 = Integer.toString(r119);
        q63 r120 = (q63) r5.get(r119);
        Bundle r121 = new Bundle();
        if (r120.b != null) goto L91;
        int r122 = r120.e;
        if (r122 == 0) goto L91;
        r120.b = IconCompat.b(null, "", r122);
    L91:
        IconCompat r40 = r120.b;
        Bundle r123 = r120.a;
        if (r40 == null) goto L95;
        int r41 = r40.c();
    L94:
        ArrayList r124 = r5;
        r121.putInt("icon", r41);
        r121.putCharSequence("title", r120.f);
        r121.putParcelable("actionIntent", r120.g);
        if (r123 == null) goto L99;
        Bundle r42 = new Bundle(r123);
    L100:
        r42.putBoolean("android.support.allowGeneratedReplies", r120.c);
        r121.putBundle("extras", r42);
        r121.putParcelableArray("remoteInputs", null);
        r121.putBoolean("showsUserInterface", r120.d);
        r121.putInt("semanticAction", 0);
        r38.putBundle(r39, r121);
        r119 = r119 + 1;
        r4 = r4;
        r5 = r124;
        goto L84
    L99:
        r42 = new Bundle();
        goto L100
    L95:
        r41 = 0;
        goto L94
    L101:
        r118 = r4;
        r36.putBundle("invisible_actions", r38);
        r37.putBundle("invisible_actions", r38);
        if (r20.q != null) goto L104;
        r20.q = new Bundle();
    L104:
        r20.q.putBundle("android.car.EXTENSIONS", r36);
        ((Bundle) this.d).putBundle("android.car.EXTENSIONS", r37);
        goto L106
    L25:
        r7 = r18.e(r2);
        goto L26
    L21:
        r16 = false;
        goto L22
    L17:
        r14 = false;
        goto L18
    L13:
        r12 = false;
        goto L14
    L9:
        r9 = false;
        goto L10
    L5:
        this.b = new Notification.Builder(r2);
        goto L6
    }

    public long a() {
        Paint r2 = (Paint) this.b;
        if (Build.VERSION.SDK_INT < 29) goto L7;
        return xd5.a.a(r2);
    L7:
        return e35.b(r2.getColor());
    }

    public int b() {
        int r1 = this.a;
        if (r1 != 2) goto L5;
        return 2048;
    L5:
        if (r1 == 3) goto L8;
        return 0;
    L8:
        return 512;
    }

    public void c() {
        Object r0 = this.b;
        monitor-enter(r0);
    L13:
        th = move-exception;
        throw th;
    L5:
        if (this.a <= 0) goto L7;
        boolean r1 = true;
    L8:
        rr2.w(r1);     // Catch: Throwable -> L13
        int r2 = this.a - 1;     // Catch: Throwable -> L13
        this.a = r2;     // Catch: Throwable -> L13
        if (r2 != 0) goto L15;
        HandlerThread r3 = (HandlerThread) this.d;     // Catch: Throwable -> L13
        if (r3 == null) goto L15;
        r3.quit();     // Catch: Throwable -> L13
        this.d = null;     // Catch: Throwable -> L13
        this.c = null;     // Catch: Throwable -> L13
    L15:
        monitor-exit(r0);     // Catch: Throwable -> L13
        return;
    L7:
        r1 = false;
        goto L8
    }

    public void d(float r3) {
        ((Paint) this.b).setAlpha((int) Math.rint(r3 * 255.0f));
    }

    public void e(int r3) {
        if (this.a != r3) goto L5;
        return;
    L5:
        this.a = r3;
        Paint r2 = (Paint) this.b;
        if (Build.VERSION.SDK_INT < 29) goto L9;
        xd5.a.b(r2, r3);
        return;
    L9:
        r2.setXfermode(new PorterDuffXfermode(q05.B(r3)));
    }

    public void f(long r3) {
        Paint r2 = (Paint) this.b;
        if (Build.VERSION.SDK_INT < 29) goto L6;
        xd5.a.c(r2, r3);
        return;
    L6:
        r2.setColor(e35.U(r3));
    }

    public void g(dt r1) {
        this.d = r1;
        Paint r0 = (Paint) this.b;
        if (r1 == null) goto L5;
        ColorFilter r2 = r1.a;
    L6:
        r0.setColorFilter(r2);
        return;
    L5:
        r2 = null;
        goto L6
    }

    public void h(int r2) {
        Paint r1 = (Paint) this.b;
        if (r2 != 1) goto L5;
        Paint.Style r3 = Paint.Style.STROKE;
    L6:
        r1.setStyle(r3);
        return;
    L5:
        r3 = Paint.Style.FILL;
        goto L6
    }

    public gc(Paint r1) {
        this.b = r1;
        this.a = 3;
    }

    public gc() {
        this.b = new Object();
        this.c = null;
        this.d = null;
        this.a = 0;
    }

    public gc(int r1, String r2, int r3, ArrayList r4, byte[] r5) {
        this.b = r2;
        this.a = r3;
        if (r4 != null) goto L5;
        List r6 = Collections.EMPTY_LIST;
    L6:
        this.c = r6;
        this.d = r5;
        return;
    L5:
        r6 = Collections.unmodifiableList(r4);
        goto L6
    }

    public gc(UUID r1, int r2, byte[] r3, UUID[] r4) {
        this.b = r1;
        this.a = r2;
        this.c = r3;
        this.d = r4;
    }

    public gc(List r7) {
        this.a = ((j50) r7.get(r7.size() - 1)).c + 1;
        HashSet r0 = new HashSet();
        Iterator r1 = r7.iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        r0.add(Short.valueOf(((j50) r1.next()).c));
        goto L4
    L6:
        this.c = new int[this.a];
        short r2 = 0;
    L7:
        int r3 = this.a;
        if (r2 >= r3) goto L13;
        if (r0.contains(Short.valueOf(r2)) == false) goto L12;
        ((int[]) this.c)[r2] = 1073741824;
    L12:
        r2 = (short) (r2 + 1);
        goto L7
    L13:
        this.b = new m50((r3 * 4) + 16, 514, 16);
        this.d = new ew4(r7, r0, r3);
    }
}
