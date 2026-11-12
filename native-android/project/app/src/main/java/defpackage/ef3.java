package defpackage;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ef3 {
    public final z80 a;
    public final u80 b;
    public final rg1 c;
    public final wf1 d;
    public final boolean e;
    public final d15 f;
    public final Object g;
    public final AtomicReference h = new AtomicReference(gf3.p);
    public long i = te5.m();
    public x03 j;
    public final uy3 k;
    public final uv3 l;

    public ef3(z80 z80Var, u80 u80Var, rg1 rg1Var, z03 z03Var, wf1 wf1Var, boolean z, d15 d15Var, Object obj) {
        this.a = z80Var;
        this.b = u80Var;
        this.c = rg1Var;
        this.d = wf1Var;
        this.e = z;
        this.f = d15Var;
        this.g = obj;
        x03 x03Var = w54.a;
        x03Var.getClass();
        this.j = x03Var;
        uy3 uy3Var = new uy3();
        uy3Var.g(z03Var, rg1Var.v());
        this.k = uy3Var;
        this.l = new uv3(d15Var.p);
    }

    public final void a() throws Exception {
        AtomicReference atomicReference = this.h;
        try {
            switch (((gf3) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    b();
                    gf3 gf3Var = gf3.s;
                    gf3 gf3Var2 = gf3.t;
                    while (!atomicReference.compareAndSet(gf3Var, gf3Var2)) {
                        if (atomicReference.get() != gf3Var) {
                            oo3.b("Unexpected state change from: " + gf3Var + " to: " + gf3Var2 + ".");
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e) {
            atomicReference.set(gf3.n);
            throw e;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.g) {
                try {
                    this.l.f(this.f, this.k);
                    this.k.c();
                    this.k.d();
                    this.k.b();
                    this.a.D = null;
                } catch (Throwable th) {
                    this.k.b();
                    this.a.D = null;
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final boolean c() {
        return ((gf3) this.h.get()).compareTo(gf3.s) >= 0;
    }

    public final void d() {
        gf3 gf3Var;
        gf3 gf3Var2;
        boolean z;
        while (true) {
            AtomicReference atomicReference = this.h;
            gf3Var = gf3.q;
            gf3Var2 = gf3.s;
            if (atomicReference.compareAndSet(gf3Var, gf3Var2)) {
                z = true;
                break;
            } else if (atomicReference.get() != gf3Var) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        oo3.b("Unexpected state change from: " + gf3Var + " to: " + gf3Var2 + ".");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0082 A[Catch: Exception -> 0x0023, TryCatch #1 {Exception -> 0x0023, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x0040, B:16:0x0041, B:22:0x0069, B:24:0x0079, B:25:0x007b, B:31:0x00a3, B:33:0x00ab, B:28:0x0082, B:30:0x0088, B:35:0x00b1, B:36:0x00b3, B:38:0x00b9, B:41:0x00c0, B:42:0x00db, B:19:0x0048, B:21:0x004e, B:45:0x00e3, B:48:0x00f2, B:50:0x00f6, B:54:0x0100, B:53:0x00fb, B:55:0x0105, B:56:0x0107, B:62:0x012f, B:64:0x0137, B:59:0x010e, B:61:0x0114, B:68:0x0140, B:69:0x0141, B:70:0x0148, B:71:0x0149, B:72:0x0150, B:23:0x006b, B:46:0x00e8), top: B:77:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab A[Catch: Exception -> 0x0023, TryCatch #1 {Exception -> 0x0023, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x0040, B:16:0x0041, B:22:0x0069, B:24:0x0079, B:25:0x007b, B:31:0x00a3, B:33:0x00ab, B:28:0x0082, B:30:0x0088, B:35:0x00b1, B:36:0x00b3, B:38:0x00b9, B:41:0x00c0, B:42:0x00db, B:19:0x0048, B:21:0x004e, B:45:0x00e3, B:48:0x00f2, B:50:0x00f6, B:54:0x0100, B:53:0x00fb, B:55:0x0105, B:56:0x0107, B:62:0x012f, B:64:0x0137, B:59:0x010e, B:61:0x0114, B:68:0x0140, B:69:0x0141, B:70:0x0148, B:71:0x0149, B:72:0x0150, B:23:0x006b, B:46:0x00e8), top: B:77:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0137 A[Catch: Exception -> 0x0023, TRY_LEAVE, TryCatch #1 {Exception -> 0x0023, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x0040, B:16:0x0041, B:22:0x0069, B:24:0x0079, B:25:0x007b, B:31:0x00a3, B:33:0x00ab, B:28:0x0082, B:30:0x0088, B:35:0x00b1, B:36:0x00b3, B:38:0x00b9, B:41:0x00c0, B:42:0x00db, B:19:0x0048, B:21:0x004e, B:45:0x00e3, B:48:0x00f2, B:50:0x00f6, B:54:0x0100, B:53:0x00fb, B:55:0x0105, B:56:0x0107, B:62:0x012f, B:64:0x0137, B:59:0x010e, B:61:0x0114, B:68:0x0140, B:69:0x0141, B:70:0x0148, B:71:0x0149, B:72:0x0150, B:23:0x006b, B:46:0x00e8), top: B:77:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[LOOP:1: B:25:0x007b->B:85:?, LOOP_END, SYNTHETIC] */
    public final boolean e(md4 md4Var) throws Exception {
        long j;
        gf3 gf3Var = gf3.r;
        AtomicReference atomicReference = this.h;
        try {
            int iOrdinal = ((gf3) atomicReference.get()).ordinal();
            gf3 gf3Var2 = gf3.q;
            z80 z80Var = this.a;
            u80 u80Var = this.b;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    rg1 rg1Var = this.c;
                    boolean z = this.e;
                    if (z) {
                        rg1Var.z = 0;
                        rg1Var.y = true;
                    }
                    this.j = u80Var.b(z80Var, md4Var, this.d);
                    if (z) {
                        if (rg1Var.F || rg1Var.z != 0) {
                            oo3.a("Cannot disable reuse from root if it was caused by other groups");
                        }
                        rg1Var.z = -1;
                        rg1Var.y = false;
                    }
                    gf3 gf3Var3 = gf3.p;
                    while (!atomicReference.compareAndSet(gf3Var3, gf3Var2)) {
                        if (atomicReference.get() != gf3Var3) {
                            oo3.b("Unexpected state change from: " + gf3Var3 + " to: " + gf3Var2 + ".");
                            if (this.j.g()) {
                                d();
                            }
                            return c();
                        }
                    }
                    if (this.j.g()) {
                        d();
                    }
                    return c();
                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                    try {
                        while (!atomicReference.compareAndSet(gf3Var2, gf3Var)) {
                            if (atomicReference.get() != gf3Var2) {
                                oo3.b("Unexpected state change from: " + gf3Var2 + " to: " + gf3Var + ".");
                                j = this.i;
                                this.i = te5.m();
                                this.j = u80Var.n(z80Var, md4Var, this.j);
                                this.i = j;
                                while (!atomicReference.compareAndSet(gf3Var, gf3Var2)) {
                                    if (atomicReference.get() != gf3Var) {
                                        oo3.b("Unexpected state change from: " + gf3Var + " to: " + gf3Var2 + ".");
                                        if (this.j.g()) {
                                            d();
                                        }
                                        return c();
                                    }
                                }
                                if (this.j.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        this.i = te5.m();
                        this.j = u80Var.n(z80Var, md4Var, this.j);
                        this.i = j;
                        while (!atomicReference.compareAndSet(gf3Var, gf3Var2)) {
                            if (atomicReference.get() != gf3Var) {
                                oo3.b("Unexpected state change from: " + gf3Var + " to: " + gf3Var2 + ".");
                                if (this.j.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th) {
                        this.i = j;
                        while (!atomicReference.compareAndSet(gf3Var, gf3Var2)) {
                            if (atomicReference.get() != gf3Var) {
                                oo3.b("Unexpected state change from: " + gf3Var + " to: " + gf3Var2 + ".");
                                throw th;
                            }
                        }
                        throw th;
                    }
                    j = this.i;
                case 4:
                    l80.b("Recursive call to resume()");
                    throw new KotlinNothingValueException();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e) {
            atomicReference.set(gf3.n);
            throw e;
        }
    }
}
