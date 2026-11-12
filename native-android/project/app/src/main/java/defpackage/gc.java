package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
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
    public gc(s63 s63Var) {
        ArrayList arrayList;
        int i;
        int i2;
        ArrayList arrayList2;
        int i3;
        this.d = new Bundle();
        this.c = s63Var;
        Context context = s63Var.a;
        ArrayList arrayList3 = s63Var.x;
        ArrayList arrayList4 = s63Var.c;
        ArrayList arrayList5 = s63Var.d;
        if (Build.VERSION.SDK_INT >= 26) {
            this.b = r50.b(context, s63Var.s);
        } else {
            this.b = new Notification.Builder(context);
        }
        Notification notification = s63Var.v;
        ?? r10 = 0;
        ((Notification.Builder) this.b).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(s63Var.e).setContentText(s63Var.f).setContentInfo(null).setContentIntent(s63Var.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(s63Var.m, s63Var.n, false);
        Notification.Builder builder = (Notification.Builder) this.b;
        IconCompat iconCompat = s63Var.h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.e(context));
        ((Notification.Builder) this.b).setSubText(null).setUsesChronometer(s63Var.k).setPriority(s63Var.i);
        ArrayList arrayList6 = s63Var.b;
        int size = arrayList6.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList6.get(i4);
            i4++;
            q63 q63Var = (q63) obj;
            if (q63Var.b == null && (i3 = q63Var.e) != 0) {
                q63Var.b = IconCompat.b(r10, "", i3);
            }
            IconCompat iconCompat2 = q63Var.b;
            boolean z = q63Var.c;
            Bundle bundle = q63Var.a;
            ArrayList arrayList7 = arrayList6;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat2 != 0 ? iconCompat2.e(r10) : r10, q63Var.f, q63Var.g);
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putBoolean("android.support.allowGeneratedReplies", z);
            builder2.setAllowGeneratedReplies(z);
            bundle2.putInt("android.support.action.semanticAction", 0);
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 28) {
                ne.s(builder2);
            }
            if (i5 >= 29) {
                yh.o(builder2);
            }
            if (i5 >= 31) {
                qe.e(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", q63Var.d);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.b).addAction(builder2.build());
            arrayList6 = arrayList7;
            r10 = 0;
        }
        Bundle bundle3 = s63Var.q;
        if (bundle3 != null) {
            ((Bundle) this.d).putAll(bundle3);
        }
        ((Notification.Builder) this.b).setShowWhen(s63Var.j);
        ((Notification.Builder) this.b).setLocalOnly(s63Var.p);
        ((Notification.Builder) this.b).setGroup(s63Var.o);
        ((Notification.Builder) this.b).setSortKey(null);
        ((Notification.Builder) this.b).setGroupSummary(false);
        this.a = 0;
        ((Notification.Builder) this.b).setCategory(null);
        ((Notification.Builder) this.b).setColor(0);
        ((Notification.Builder) this.b).setVisibility(s63Var.r);
        ((Notification.Builder) this.b).setPublicVersion(null);
        ((Notification.Builder) this.b).setSound(notification.sound, notification.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
            if (arrayList4 == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList(arrayList4.size());
                Iterator it = arrayList4.iterator();
                if (it.hasNext()) {
                    throw xa3.d(it);
                }
            }
            if (arrayList2 != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList2;
                } else {
                    qi qiVar = new qi(arrayList3.size() + arrayList2.size());
                    qiVar.addAll(arrayList2);
                    qiVar.addAll(arrayList3);
                    arrayList3 = new ArrayList(qiVar);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            int i6 = 0;
            while (i6 < size2) {
                Object obj2 = arrayList3.get(i6);
                i6++;
                ((Notification.Builder) this.b).addPerson((String) obj2);
            }
        }
        if (arrayList5.size() > 0) {
            if (s63Var.q == null) {
                s63Var.q = new Bundle();
            }
            Bundle bundle4 = s63Var.q.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            int i7 = 0;
            while (i7 < arrayList5.size()) {
                String string = Integer.toString(i7);
                q63 q63Var2 = (q63) arrayList5.get(i7);
                Bundle bundle7 = new Bundle();
                if (q63Var2.b == null && (i2 = q63Var2.e) != 0) {
                    q63Var2.b = IconCompat.b(null, "", i2);
                }
                IconCompat iconCompat3 = q63Var2.b;
                Bundle bundle8 = q63Var2.a;
                ArrayList arrayList8 = arrayList5;
                bundle7.putInt("icon", iconCompat3 != null ? iconCompat3.c() : 0);
                bundle7.putCharSequence("title", q63Var2.f);
                bundle7.putParcelable("actionIntent", q63Var2.g);
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean("android.support.allowGeneratedReplies", q63Var2.c);
                bundle7.putBundle("extras", bundle9);
                bundle7.putParcelableArray("remoteInputs", null);
                bundle7.putBoolean("showsUserInterface", q63Var2.d);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(string, bundle7);
                i7++;
                arrayList4 = arrayList4;
                arrayList5 = arrayList8;
            }
            arrayList = arrayList4;
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (s63Var.q == null) {
                s63Var.q = new Bundle();
            }
            s63Var.q.putBundle("android.car.EXTENSIONS", bundle4);
            ((Bundle) this.d).putBundle("android.car.EXTENSIONS", bundle5);
        } else {
            arrayList = arrayList4;
        }
        ((Notification.Builder) this.b).setExtras(s63Var.q);
        ((Notification.Builder) this.b).setRemoteInputHistory(null);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 26) {
            r50.l((Notification.Builder) this.b);
            r50.r((Notification.Builder) this.b);
            r50.s((Notification.Builder) this.b);
            r50.t((Notification.Builder) this.b);
            r50.n((Notification.Builder) this.b, 0);
            if (!TextUtils.isEmpty(s63Var.s)) {
                ((Notification.Builder) this.b).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i8 >= 28) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                throw xa3.d(it2);
            }
        }
        if (i8 >= 29) {
            yh.m((Notification.Builder) this.b, s63Var.u);
            yh.n((Notification.Builder) this.b);
        }
        if (i8 >= 31 && (i = s63Var.t) != 0) {
            qe.f((Notification.Builder) this.b, i);
        }
        if (i8 >= 36) {
            r3.e((Notification.Builder) this.b);
        }
        if (s63Var.w) {
            ((s63) this.c).getClass();
            this.a = 1;
            ((Notification.Builder) this.b).setVibrate(null);
            ((Notification.Builder) this.b).setSound(null);
            int i9 = notification.defaults & (-4);
            notification.defaults = i9;
            ((Notification.Builder) this.b).setDefaults(i9);
            if (i8 >= 26) {
                if (TextUtils.isEmpty(((s63) this.c).o)) {
                    ((Notification.Builder) this.b).setGroup("silent");
                }
                r50.n((Notification.Builder) this.b, 1);
            }
        }
    }

    public long a() {
        Paint paint = (Paint) this.b;
        return Build.VERSION.SDK_INT >= 29 ? xd5.a.a(paint) : e35.b(paint.getColor());
    }

    public int b() {
        int i = this.a;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    public void c() {
        HandlerThread handlerThread;
        synchronized (this.b) {
            try {
                rr2.w(this.a > 0);
                int i = this.a - 1;
                this.a = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.d) != null) {
                    handlerThread.quit();
                    this.d = null;
                    this.c = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(float f) {
        ((Paint) this.b).setAlpha((int) Math.rint(f * 255.0f));
    }

    public void e(int i) {
        if (this.a == i) {
            return;
        }
        this.a = i;
        Paint paint = (Paint) this.b;
        if (Build.VERSION.SDK_INT >= 29) {
            xd5.a.b(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(q05.B(i)));
        }
    }

    public void f(long j) {
        Paint paint = (Paint) this.b;
        if (Build.VERSION.SDK_INT >= 29) {
            xd5.a.c(paint, j);
        } else {
            paint.setColor(e35.U(j));
        }
    }

    public void g(dt dtVar) {
        this.d = dtVar;
        ((Paint) this.b).setColorFilter(dtVar != null ? dtVar.a : null);
    }

    public void h(int i) {
        ((Paint) this.b).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public gc(Paint paint) {
        this.b = paint;
        this.a = 3;
    }

    public gc() {
        this.b = new Object();
        this.c = null;
        this.d = null;
        this.a = 0;
    }

    public gc(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.b = str;
        this.a = i2;
        if (arrayList == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.c = listUnmodifiableList;
        this.d = bArr;
    }

    public gc(UUID uuid, int i, byte[] bArr, UUID[] uuidArr) {
        this.b = uuid;
        this.a = i;
        this.c = bArr;
        this.d = uuidArr;
    }

    public gc(List list) {
        this.a = ((j50) list.get(list.size() - 1)).c + 1;
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(Short.valueOf(((j50) it.next()).c));
        }
        this.c = new int[this.a];
        short s = 0;
        while (true) {
            int i = this.a;
            if (s < i) {
                if (hashSet.contains(Short.valueOf(s))) {
                    ((int[]) this.c)[s] = 1073741824;
                }
                s = (short) (s + 1);
            } else {
                this.b = new m50((i * 4) + 16, (short) 514, (short) 16);
                this.d = new ew4(list, hashSet, i);
                return;
            }
        }
    }
}
