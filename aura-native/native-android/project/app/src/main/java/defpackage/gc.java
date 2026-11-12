package defpackage;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.Notification$Action$Builder
 *  android.app.Notification$Builder
 *  android.content.Context
 *  android.graphics.ColorFilter
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.PorterDuffXfermode
 *  android.graphics.Xfermode
 *  android.graphics.drawable.Icon
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.HandlerThread
 *  android.os.Parcelable
 *  android.text.TextUtils
 */
import android.app.Notification;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public final class gc {
    public int a;
    public final Object b;
    public Object c;
    public Object d;

    public gc() {
        this.b = new Object();
        this.c = null;
        this.d = null;
        this.a = 0;
    }

    public gc(int n16, String list, int n17, ArrayList arrayList, byte[] byArray) {
        this.b = list;
        this.a = n17;
        list = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
        this.c = list;
        this.d = byArray;
    }

    public gc(Paint paint) {
        this.b = paint;
        this.a = 3;
    }

    public gc(List list) {
        short s16;
        this.a = ((j50)list.get((int)(list.size() - 1))).c + 1;
        HashSet<Short> hashSet = new HashSet<Short>();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            hashSet.add(((j50)iterator.next()).c);
        }
        this.c = new int[this.a];
        for (short s17 = 0; s17 < (s16 = this.a); s17 = (short)(s17 + 1)) {
            if (!hashSet.contains(s17)) continue;
            ((int[])this.c)[s17] = 0x40000000;
        }
        this.b = new m50(s16 * 4 + 16, 514, 16);
        this.d = new ew4(list, hashSet, s16);
    }

    public gc(UUID uUID, int n16, byte[] byArray, UUID[] uUIDArray) {
        this.b = uUID;
        this.a = n16;
        this.c = byArray;
        this.d = uUIDArray;
    }

    public gc(s63 s632) {
        Object object;
        Object object2;
        this.d = new Bundle();
        this.c = s632;
        Object object3 = s632.a;
        ArrayList arrayList = s632.x;
        ArrayList arrayList2 = s632.c;
        ArrayList arrayList3 = s632.d;
        this.b = Build.VERSION.SDK_INT >= 26 ? r50.b((Context)object3, s632.s) : new Notification.Builder((Context)object3);
        Notification notification = s632.v;
        Object object4 = ((Notification.Builder)this.b).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        boolean bl5 = (notification.flags & 2) != 0;
        object4 = object4.setOngoing(bl5);
        bl5 = (notification.flags & 8) != 0;
        object4 = object4.setOnlyAlertOnce(bl5);
        bl5 = (notification.flags & 0x10) != 0;
        object4 = object4.setAutoCancel(bl5).setDefaults(notification.defaults).setContentTitle(s632.e).setContentText(s632.f).setContentInfo(null).setContentIntent(s632.g).setDeleteIntent(notification.deleteIntent);
        bl5 = (notification.flags & 0x80) != 0;
        object4.setFullScreenIntent(null, bl5).setNumber(0).setProgress(s632.m, s632.n, false);
        object4 = (Notification.Builder)this.b;
        Object object5 = s632.h;
        object3 = object5 == null ? null : ((IconCompat)object5).e((Context)object3);
        object4.setLargeIcon((Icon)object3);
        ((Notification.Builder)this.b).setSubText(null).setUsesChronometer(s632.k).setPriority(s632.i);
        object3 = s632.b;
        int n16 = ((ArrayList)object3).size();
        int n17 = 0;
        while (n17 < n16) {
            int n18;
            object4 = ((ArrayList)object3).get(n17);
            ++n17;
            object5 = (q63)object4;
            if (((q63)object5).b == null && (n18 = ((q63)object5).e) != 0) {
                ((q63)object5).b = IconCompat.b(null, "", n18);
            }
            object4 = ((q63)object5).b;
            bl5 = ((q63)object5).c;
            object2 = ((q63)object5).a;
            object4 = object4 != null ? ((IconCompat)object4).e(null) : null;
            object = new Notification.Action.Builder((Icon)object4, ((q63)object5).f, ((q63)object5).g);
            object4 = object2 != null ? new Bundle(object2) : new Bundle();
            object4.putBoolean("android.support.allowGeneratedReplies", bl5);
            object.setAllowGeneratedReplies(bl5);
            object4.putInt("android.support.action.semanticAction", 0);
            n18 = Build.VERSION.SDK_INT;
            if (n18 >= 28) {
                ne.s(object);
            }
            if (n18 >= 29) {
                yh.o(object);
            }
            if (n18 >= 31) {
                qe.e(object);
            }
            object4.putBoolean("android.support.action.showsUserInterface", ((q63)object5).d);
            object.addExtras((Bundle)object4);
            ((Notification.Builder)this.b).addAction(object.build());
        }
        object3 = s632.q;
        if (object3 != null) {
            ((Bundle)this.d).putAll((Bundle)object3);
        }
        ((Notification.Builder)this.b).setShowWhen(s632.j);
        ((Notification.Builder)this.b).setLocalOnly(s632.p);
        ((Notification.Builder)this.b).setGroup(s632.o);
        ((Notification.Builder)this.b).setSortKey(null);
        ((Notification.Builder)this.b).setGroupSummary(false);
        this.a = 0;
        ((Notification.Builder)this.b).setCategory(null);
        ((Notification.Builder)this.b).setColor(0);
        ((Notification.Builder)this.b).setVisibility(s632.r);
        ((Notification.Builder)this.b).setPublicVersion(null);
        ((Notification.Builder)this.b).setSound(notification.sound, notification.audioAttributes);
        object3 = arrayList;
        if (Build.VERSION.SDK_INT < 28) {
            if (arrayList2 == null) {
                object3 = null;
            } else {
                object3 = new ArrayList(arrayList2.size());
                object4 = arrayList2.iterator();
                if (object4.hasNext()) {
                    throw xa3.d((Iterator)object4);
                }
            }
            if (object3 == null) {
                object3 = arrayList;
            } else if (arrayList != null) {
                n17 = object3.size();
                object4 = new qi(arrayList.size() + n17);
                ((qi)object4).addAll((Collection)object3);
                ((qi)object4).addAll((Collection)arrayList);
                object3 = new ArrayList(object4);
            }
        }
        if (object3 != null && !object3.isEmpty()) {
            n16 = ((ArrayList)object3).size();
            for (n17 = 0; n17 < n16; ++n17) {
                object4 = ((ArrayList)object3).get(n17);
                object4 = (String)object4;
                ((Notification.Builder)this.b).addPerson((String)object4);
            }
        }
        if (arrayList3.size() > 0) {
            if (s632.q == null) {
                s632.q = new Bundle();
            }
            object4 = object3 = s632.q.getBundle("android.car.EXTENSIONS");
            if (object3 == null) {
                object4 = new Bundle();
            }
            arrayList = new Bundle((Bundle)object4);
            object5 = new Bundle();
            object3 = arrayList2;
            for (n17 = 0; n17 < arrayList3.size(); ++n17) {
                object2 = Integer.toString(n17);
                object = (q63)arrayList3.get(n17);
                Bundle bundle = new Bundle();
                if (object.b == null && (n16 = object.e) != 0) {
                    object.b = IconCompat.b(null, "", n16);
                }
                IconCompat iconCompat = object.b;
                arrayList2 = object.a;
                n16 = iconCompat != null ? iconCompat.c() : 0;
                bundle.putInt("icon", n16);
                bundle.putCharSequence("title", object.f);
                bundle.putParcelable("actionIntent", (Parcelable)object.g);
                arrayList2 = arrayList2 != null ? new Bundle((Bundle)arrayList2) : new Bundle();
                arrayList2.putBoolean("android.support.allowGeneratedReplies", object.c);
                bundle.putBundle("extras", (Bundle)arrayList2);
                bundle.putParcelableArray("remoteInputs", null);
                bundle.putBoolean("showsUserInterface", object.d);
                bundle.putInt("semanticAction", 0);
                object5.putBundle((String)object2, bundle);
            }
            object4.putBundle("invisible_actions", (Bundle)object5);
            arrayList.putBundle("invisible_actions", (Bundle)object5);
            if (s632.q == null) {
                s632.q = new Bundle();
            }
            s632.q.putBundle("android.car.EXTENSIONS", (Bundle)object4);
            ((Bundle)this.d).putBundle("android.car.EXTENSIONS", (Bundle)arrayList);
        } else {
            object3 = arrayList2;
        }
        ((Notification.Builder)this.b).setExtras(s632.q);
        ((Notification.Builder)this.b).setRemoteInputHistory(null);
        n17 = Build.VERSION.SDK_INT;
        if (n17 >= 26) {
            r50.l((Notification.Builder)this.b);
            r50.r((Notification.Builder)this.b);
            r50.s((Notification.Builder)this.b);
            r50.t((Notification.Builder)this.b);
            r50.n((Notification.Builder)this.b, 0);
            if (!TextUtils.isEmpty((CharSequence)s632.s)) {
                ((Notification.Builder)this.b).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (n17 >= 28 && (object3 = ((ArrayList)object3).iterator()).hasNext()) {
            throw xa3.d((Iterator)object3);
        }
        if (n17 >= 29) {
            yh.m((Notification.Builder)this.b, s632.u);
            yh.n((Notification.Builder)this.b);
        }
        if (n17 >= 31 && (n16 = s632.t) != 0) {
            qe.f((Notification.Builder)this.b, n16);
        }
        if (n17 >= 36) {
            r3.e((Notification.Builder)this.b);
        }
        if (s632.w) {
            ((s63)this.c).getClass();
            this.a = 1;
            ((Notification.Builder)this.b).setVibrate(null);
            ((Notification.Builder)this.b).setSound(null);
            notification.defaults = n16 = notification.defaults & 0xFFFFFFFC;
            ((Notification.Builder)this.b).setDefaults(n16);
            if (n17 >= 26) {
                if (TextUtils.isEmpty((CharSequence)((s63)this.c).o)) {
                    ((Notification.Builder)this.b).setGroup("silent");
                }
                r50.n((Notification.Builder)this.b, 1);
            }
        }
    }

    public long a() {
        Paint paint = (Paint)this.b;
        if (Build.VERSION.SDK_INT >= 29) {
            return xd5.a.a(paint);
        }
        return e35.b(paint.getColor());
    }

    public int b() {
        int n16 = this.a;
        if (n16 != 2) {
            if (n16 != 3) {
                return 0;
            }
            return 512;
        }
        return 2048;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c() {
        Object object = this.b;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        HandlerThread handlerThread;
                        int n16;
                        boolean bl5 = this.a > 0;
                        rr2.w(bl5);
                        this.a = n16 = this.a - 1;
                        if (n16 != 0 || (handlerThread = (HandlerThread)this.d) == null) break block3;
                        handlerThread.quit();
                        this.d = null;
                        this.c = null;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public void d(float f16) {
        ((Paint)this.b).setAlpha((int)Math.rint(f16 * 255.0f));
    }

    public void e(int n16) {
        if (this.a == n16) {
            return;
        }
        this.a = n16;
        Paint paint = (Paint)this.b;
        if (Build.VERSION.SDK_INT >= 29) {
            xd5.a.b(paint, n16);
            return;
        }
        paint.setXfermode((Xfermode)new PorterDuffXfermode(q05.B(n16)));
    }

    public void f(long l16) {
        Paint paint = (Paint)this.b;
        if (Build.VERSION.SDK_INT >= 29) {
            xd5.a.c(paint, l16);
            return;
        }
        paint.setColor(e35.U(l16));
    }

    public void g(dt dt5) {
        this.d = dt5;
        Paint paint = (Paint)this.b;
        dt5 = dt5 != null ? dt5.a : null;
        paint.setColorFilter((ColorFilter)dt5);
    }

    public void h(int n16) {
        Paint paint = (Paint)this.b;
        Paint.Style style = n16 == 1 ? Paint.Style.STROKE : Paint.Style.FILL;
        paint.setStyle(style);
    }
}

