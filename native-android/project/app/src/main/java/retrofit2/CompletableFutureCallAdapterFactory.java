package retrofit2;

import defpackage.kf2;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
final class CompletableFutureCallAdapterFactory extends CallAdapter.Factory {

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class BodyCallAdapter<R> implements CallAdapter<R, CompletableFuture<R>> {
        private final Type responseType;

        /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
        public class BodyCallback implements Callback<R> {
            private final CompletableFuture<R> future;
            final /* synthetic */ BodyCallAdapter this$0;

            public BodyCallback(BodyCallAdapter r1, CompletableFuture<R> r2) {
                this.this$0 = r1;
                this.future = r2;
            }

            @Override // retrofit2.Callback
            public void onFailure(Call<R> r1, Throwable r2) {
                this.future.completeExceptionally(r2);
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<R> r1, Response<R> r2) {
                boolean r3 = r2.isSuccessful();
                CompletableFuture<R> r0 = this.future;
                if (r3 == false) goto L6;
                r0.complete(r2.body());
                return;
            L6:
                r0.completeExceptionally(new HttpException(r2));
            }
        }

        public BodyCallAdapter(Type r1) {
            this.responseType = r1;
        }

        @Override // retrofit2.CallAdapter
        public CompletableFuture<R> adapt(Call<R> r3) {
            CallCancelCompletableFuture r0 = new CallCancelCompletableFuture(r3);
            r3.enqueue(new BodyCallback(this, r0));
            return r0;
        }

        @Override // retrofit2.CallAdapter
        public Type responseType() {
            return this.responseType;
        }

        @Override // retrofit2.CallAdapter
        public /* bridge */ /* synthetic */ Object adapt(Call r1) {
            return adapt(r1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class CallCancelCompletableFuture<T> extends CompletableFuture<T> {
        private final Call<?> call;

        public CallCancelCompletableFuture(Call<?> r1) {
            this.call = r1;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean r2) {
            if (r2 == false) goto L5;
            this.call.cancel();
        L5:
            return super.cancel(r2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class ResponseCallAdapter<R> implements CallAdapter<R, CompletableFuture<Response<R>>> {
        private final Type responseType;

        /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
        public class ResponseCallback implements Callback<R> {
            private final CompletableFuture<Response<R>> future;
            final /* synthetic */ ResponseCallAdapter this$0;

            public ResponseCallback(ResponseCallAdapter r1, CompletableFuture<Response<R>> r2) {
                this.this$0 = r1;
                this.future = r2;
            }

            @Override // retrofit2.Callback
            public void onFailure(Call<R> r1, Throwable r2) {
                this.future.completeExceptionally(r2);
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<R> r1, Response<R> r2) {
                this.future.complete(r2);
            }
        }

        public ResponseCallAdapter(Type r1) {
            this.responseType = r1;
        }

        @Override // retrofit2.CallAdapter
        public CompletableFuture<Response<R>> adapt(Call<R> r3) {
            CallCancelCompletableFuture r0 = new CallCancelCompletableFuture(r3);
            r3.enqueue(new ResponseCallback(this, r0));
            return r0;
        }

        @Override // retrofit2.CallAdapter
        public Type responseType() {
            return this.responseType;
        }

        @Override // retrofit2.CallAdapter
        public /* bridge */ /* synthetic */ Object adapt(Call r1) {
            return adapt(r1);
        }
    }

    public CompletableFutureCallAdapterFactory() {
    }

    @Override // retrofit2.CallAdapter.Factory
    @Nullable
    public CallAdapter<?, ?> get(Type r2, Annotation[] r3, Retrofit r4) {
        if (CallAdapter.Factory.getRawType(r2) == CompletableFuture.class) goto L6;
        return null;
    L6:
        if ((r2 instanceof ParameterizedType) == false) goto L17;
        Type r5 = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) r2);
        if (CallAdapter.Factory.getRawType(r5) == Response.class) goto L12;
        return new BodyCallAdapter(r5);
    L12:
        if ((r5 instanceof ParameterizedType) == true) goto L14;
        kf2.o("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        return null;
    L14:
        return new ResponseCallAdapter(CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) r5));
    L17:
        kf2.o("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        return null;
    }
}
