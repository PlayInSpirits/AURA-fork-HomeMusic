package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tz0 {
    public static final Object j = new Object();
    public static volatile tz0 k;
    public final ReentrantReadWriteLock a;
    public final qi b;
    public volatile int c;
    public final Handler d;
    public final pz0 e;
    public final sz0 f;
    public final om0 g;
    public final int h;
    public final wk0 i;

    public tz0(sa1 sa1Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        sz0 sz0Var = (sz0) sa1Var.b;
        this.f = sz0Var;
        int i = sa1Var.a;
        this.h = i;
        this.i = (wk0) sa1Var.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new qi(0);
        this.g = new om0(20);
        pz0 pz0Var = new pz0(this);
        this.e = pz0Var;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                sz0Var.a(new oz0(pz0Var));
            } catch (Throwable th2) {
                e(th2);
            }
        }
    }

    public static tz0 a() {
        tz0 tz0Var;
        synchronized (j) {
            try {
                tz0Var = k;
                if (!(tz0Var != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tz0Var;
    }

    public static boolean c() {
        return k != null;
    }

    public final int b() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void d() {
        if (!(this.h == 1)) {
            kf2.o("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (b() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                this.a.writeLock().unlock();
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            pz0 pz0Var = this.e;
            tz0 tz0Var = pz0Var.a;
            try {
                tz0Var.f.a(new oz0(pz0Var));
            } catch (Throwable th) {
                tz0Var.e(th);
            }
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void e(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new rq(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a5 A[Catch: all -> 0x0088, TryCatch #1 {all -> 0x0088, blocks: (B:36:0x0060, B:39:0x0065, B:41:0x0069, B:43:0x0076, B:50:0x0095, B:52:0x009f, B:54:0x00a2, B:56:0x00a5, B:58:0x00b5, B:59:0x00b8), top: B:95:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b5 A[Catch: all -> 0x0088, TryCatch #1 {all -> 0x0088, blocks: (B:36:0x0060, B:39:0x0065, B:41:0x0069, B:43:0x0076, B:50:0x0095, B:52:0x009f, B:54:0x00a2, B:56:0x00a5, B:58:0x00b5, B:59:0x00b8), top: B:95:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:84:0x0104  */
    public final CharSequence f(int i, int i2, int i3, CharSequence charSequence) throws Throwable {
        Throwable th;
        CharSequence charSequence2;
        int i4;
        int i5;
        l05[] l05VarArr;
        int spanStart;
        q15 q15Var = null;
        if (!(b() == 1)) {
            kf2.o("Not initialized yet");
            return null;
        }
        if (i < 0) {
            kf2.n("start cannot be negative");
            return null;
        }
        if (i2 < 0) {
            kf2.n("end cannot be negative");
            return null;
        }
        l93.j("start should be <= than end", i <= i2);
        if (charSequence == null) {
            return null;
        }
        l93.j("start should be < than charSequence length", i <= charSequence.length());
        l93.j("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        boolean z = i3 == 1;
        qp4 qp4Var = this.e.b;
        qp4Var.getClass();
        boolean z2 = charSequence instanceof lj4;
        if (z2) {
            ((lj4) charSequence).a();
        }
        if (z2) {
            q15Var = new q15((Spannable) charSequence);
            if (q15Var != null) {
                for (l05 l05Var : l05VarArr) {
                    spanStart = q15Var.o.getSpanStart(l05Var);
                    int spanEnd = q15Var.o.getSpanEnd(l05Var);
                    if (spanStart != i2) {
                        q15Var.removeSpan(l05Var);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd, i2);
                }
            }
            i4 = i;
            i5 = i2;
            if (i4 != i5) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            }
            ((lj4) charSequence2).b();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    q15Var = new q15((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((lj4) charSequence2).b();
                    throw th;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, l05.class) <= i2) {
                q15Var = new q15();
                q15Var.n = false;
                q15Var.o = new SpannableString(charSequence);
            }
            if (q15Var != null && (l05VarArr = (l05[]) q15Var.o.getSpans(i, i2, l05.class)) != null && l05VarArr.length > 0) {
                while (i < r0) {
                    spanStart = q15Var.o.getSpanStart(l05Var);
                    int spanEnd2 = q15Var.o.getSpanEnd(l05Var);
                    if (spanStart != i2) {
                        q15Var.removeSpan(l05Var);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd2, i2);
                }
            }
            i4 = i;
            i5 = i2;
            if (i4 != i5 || i4 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                try {
                    q15 q15Var2 = (q15) qp4Var.n(charSequence2, i4, i5, Integer.MAX_VALUE, z, new hd5(7, q15Var, (om0) qp4Var.a));
                    if (q15Var2 != null) {
                        Spannable spannable = q15Var2.o;
                        if (z2) {
                            ((lj4) charSequence2).b();
                        }
                        return spannable;
                    }
                    if (!z2) {
                        return charSequence2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((lj4) charSequence2).b();
                    throw th;
                }
            }
            ((lj4) charSequence2).b();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z2) {
            throw th;
        }
        ((lj4) charSequence2).b();
        throw th;
    }

    public final void g(rz0 rz0Var) {
        l93.m(rz0Var, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new rq(Arrays.asList(rz0Var), this.c, (Throwable) null));
            } else {
                this.b.add(rz0Var);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }
}
