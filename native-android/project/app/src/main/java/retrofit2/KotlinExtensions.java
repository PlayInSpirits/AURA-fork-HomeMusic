package retrofit2;

import defpackage.cz;
import defpackage.er1;
import defpackage.j15;
import defpackage.kb4;
import defpackage.kf2;
import defpackage.ri0;
import defpackage.rr0;
import defpackage.vd0;
import defpackage.wd0;
import defpackage.xe0;
import defpackage.ya4;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class KotlinExtensions {

    /* JADX INFO: renamed from: retrofit2.KotlinExtensions$suspendAndThrow$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    @ri0(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {119}, m = "suspendAndThrow")
    public static final class AnonymousClass1 extends wd0 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(vd0<? super AnonymousClass1> r1) {
            super(r1);
        }

        @Override // defpackage.jp
        public final Object invokeSuspend(Object r2) {
            this.result = r2;
            this.label |= Integer.MIN_VALUE;
            return KotlinExtensions.suspendAndThrow(null, this);
        }
    }

    public static final <T> Object await(Call<T> r2, vd0<? super T> r3) {
        final cz r0 = new cz(1, ya4.x(r3));
        r0.u();
        r0.w(new KotlinExtensions$await$2$1(r2));
        r2.enqueue(new KotlinExtensions$await$2$2(r0));
        return r0.q();
    }

    public static final <T> Object awaitNullable(Call<T> r2, vd0<? super T> r3) {
        final cz r0 = new cz(1, ya4.x(r3));
        r0.u();
        r0.w(new KotlinExtensions$await$4$1(r2));
        r2.enqueue(new KotlinExtensions$await$4$2(r0));
        return r0.q();
    }

    public static final <T> Object awaitResponse(Call<T> r2, vd0<? super Response<T>> r3) {
        final cz r0 = new cz(1, ya4.x(r3));
        r0.u();
        r0.w(new KotlinExtensions$awaitResponse$2$1(r2));
        r2.enqueue(new KotlinExtensions$awaitResponse$2$2(r0));
        return r0.q();
    }

    public static final Object awaitUnit(Call<j15> r0, vd0<? super j15> r1) {
        r0.getClass();
        return awaitNullable(r0, r1);
    }

    public static final <T> T create(Retrofit r1) {
        r1.getClass();
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static final Object suspendAndThrow(final Throwable r4, vd0<?> r5) {
        if ((r5 instanceof AnonymousClass1) == false) goto L7;
        final AnonymousClass1 r0 = (AnonymousClass1) r5;
        int r1 = r0.label;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.label = r1 - Integer.MIN_VALUE;
    L8:
        Object r6 = r0.result;
        int r2 = r0.label;
        if (r2 != 0) goto L11;
        kb4.X(r6);
        r0.L$0 = r4;
        r0.label = 1;
        rr0.a.W(r0.getContext(), new KotlinExtensions$suspendAndThrow$2$1(r0, r4));
        return xe0.n;
    L11:
        if (r2 == 1) goto L14;
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L14:
        Throwable r3 = (Throwable) r0.L$0;
        kb4.X(r6);
        er1.a();
        return null;
    L7:
        r0 = new AnonymousClass1(r5);
        goto L8
    }
}
