/*
 * Decompiled with CFR 0.152.
 */
package retrofit2;

import defpackage.fu4;
import defpackage.oz3;
import retrofit2.Callback;
import retrofit2.Response;

public interface Call<T>
extends Cloneable {
    public void cancel();

    public Call<T> clone();

    public void enqueue(Callback<T> var1);

    public Response<T> execute();

    public boolean isCanceled();

    public boolean isExecuted();

    public oz3 request();

    public fu4 timeout();
}

