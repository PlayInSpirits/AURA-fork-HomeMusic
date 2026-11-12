package retrofit2;

import defpackage.az;
import defpackage.cz;
import defpackage.er1;
import defpackage.i30;
import defpackage.j15;
import defpackage.kb4;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.oz3;
import defpackage.ri0;
import defpackage.rr0;
import defpackage.s14;
import defpackage.vd0;
import defpackage.wd0;
import defpackage.xe0;
import defpackage.ya4;
import kotlin.KotlinNullPointerException;

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

        public AnonymousClass1(vd0<? super AnonymousClass1> vd0Var) {
            super(vd0Var);
        }

        @Override // defpackage.jp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KotlinExtensions.suspendAndThrow(null, this);
        }
    }

    public static final <T> Object await(Call<T> call, vd0<? super T> vd0Var) {
        final cz czVar = new cz(1, ya4.x(vd0Var));
        czVar.u();
        czVar.w(new KotlinExtensions$await$2$1(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$2$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable th) {
                call2.getClass();
                th.getClass();
                czVar.resumeWith(new s14(th));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                call2.getClass();
                response.getClass();
                if (!response.isSuccessful()) {
                    czVar.resumeWith(new s14(new HttpException(response)));
                    return;
                }
                T tBody = response.body();
                if (tBody != null) {
                    czVar.resumeWith(tBody);
                    return;
                }
                oz3 oz3VarRequest = call2.request();
                oz3VarRequest.getClass();
                i30 i30VarA = kx3.a(Invocation.class);
                Class cls = i30VarA.n;
                cls.getClass();
                Object objCast = cls.cast(oz3VarRequest.e.get(i30VarA));
                objCast.getClass();
                Invocation invocation = (Invocation) objCast;
                czVar.resumeWith(new s14(new KotlinNullPointerException("Response from " + invocation.service().getName() + '.' + invocation.method().getName() + " was null but response body type was declared as non-null")));
            }
        });
        return czVar.q();
    }

    public static final <T> Object awaitNullable(Call<T> call, vd0<? super T> vd0Var) {
        final cz czVar = new cz(1, ya4.x(vd0Var));
        czVar.u();
        czVar.w(new KotlinExtensions$await$4$1(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$4$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable th) {
                call2.getClass();
                th.getClass();
                czVar.resumeWith(new s14(th));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                call2.getClass();
                response.getClass();
                boolean zIsSuccessful = response.isSuccessful();
                az azVar = czVar;
                if (zIsSuccessful) {
                    azVar.resumeWith(response.body());
                } else {
                    azVar.resumeWith(new s14(new HttpException(response)));
                }
            }
        });
        return czVar.q();
    }

    public static final <T> Object awaitResponse(Call<T> call, vd0<? super Response<T>> vd0Var) {
        final cz czVar = new cz(1, ya4.x(vd0Var));
        czVar.u();
        czVar.w(new KotlinExtensions$awaitResponse$2$1(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable th) {
                call2.getClass();
                th.getClass();
                czVar.resumeWith(new s14(th));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                call2.getClass();
                response.getClass();
                czVar.resumeWith(response);
            }
        });
        return czVar.q();
    }

    public static final Object awaitUnit(Call<j15> call, vd0<? super j15> vd0Var) {
        call.getClass();
        return awaitNullable(call, vd0Var);
    }

    public static final <T> T create(Retrofit retrofit) {
        retrofit.getClass();
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object suspendAndThrow(final Throwable th, vd0<?> vd0Var) {
        final AnonymousClass1 anonymousClass1;
        if (vd0Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) vd0Var;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(vd0Var);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(vd0Var);
        }
        Object obj = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            kb4.X(obj);
            anonymousClass1.L$0 = th;
            anonymousClass1.label = 1;
            rr0.a.W(anonymousClass1.getContext(), new Runnable() { // from class: retrofit2.KotlinExtensions$suspendAndThrow$2$1
                @Override // java.lang.Runnable
                public final void run() {
                    ya4.x(anonymousClass1).resumeWith(kb4.o(th));
                }
            });
            return xe0.n;
        }
        if (i2 != 1) {
            kf2.o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kb4.X(obj);
        er1.a();
        return null;
    }
}
