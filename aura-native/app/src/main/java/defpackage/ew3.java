/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.database.Observable;
import defpackage.fw3;

public final class ew3
extends Observable {
    public ew3() {
        super();
    }

    public final boolean a() {
        return this.mObservers.isEmpty() ^ true;
    }

    public final void b() {
        for (int i16 = this.mObservers.size() - 1; i16 >= 0; --i16) {
            ((fw3)this.mObservers.get(i16)).a();
        }
    }

    public final void c(int n16, int n17) {
        for (int i16 = this.mObservers.size() - 1; i16 >= 0; --i16) {
            ((fw3)this.mObservers.get(i16)).d(n16, n17);
        }
    }

    public final void d(int n16, int n17, Object object) {
        for (int i16 = this.mObservers.size() - 1; i16 >= 0; --i16) {
            ((fw3)this.mObservers.get(i16)).b(n16, n17, object);
        }
    }

    public final void e(int n16, int n17) {
        for (int i16 = this.mObservers.size() - 1; i16 >= 0; --i16) {
            ((fw3)this.mObservers.get(i16)).c(n16, n17);
        }
    }

    public final void f(int n16, int n17) {
        for (int i16 = this.mObservers.size() - 1; i16 >= 0; --i16) {
            ((fw3)this.mObservers.get(i16)).e(n16, n17);
        }
    }

    public final void g() {
        for (int i16 = this.mObservers.size() - 1; i16 >= 0; --i16) {
            ((fw3)this.mObservers.get(i16)).f();
        }
    }
}

