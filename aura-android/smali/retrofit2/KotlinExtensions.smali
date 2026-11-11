.class public final Lretrofit2/KotlinExtensions;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# direct methods
.method public static final await(Lretrofit2/Call;Lvd0;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lretrofit2/Call<",
            "TT;>;",
            "Lvd0<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcz;

    .line 2
    .line 3
    invoke-static {p1}, Lya4;->x(Lvd0;)Lvd0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p1}, Lcz;-><init>(ILvd0;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcz;->u()V

    .line 12
    .line 13
    .line 14
    new-instance p1, Lretrofit2/KotlinExtensions$await$2$1;

    .line 15
    .line 16
    invoke-direct {p1, p0}, Lretrofit2/KotlinExtensions$await$2$1;-><init>(Lretrofit2/Call;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lcz;->w(Lif1;)V

    .line 20
    .line 21
    .line 22
    new-instance p1, Lretrofit2/KotlinExtensions$await$2$2;

    .line 23
    .line 24
    invoke-direct {p1, v0}, Lretrofit2/KotlinExtensions$await$2$2;-><init>(Laz;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p0, p1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcz;->q()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public static final awaitNullable(Lretrofit2/Call;Lvd0;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lretrofit2/Call<",
            "TT;>;",
            "Lvd0<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcz;

    .line 2
    .line 3
    invoke-static {p1}, Lya4;->x(Lvd0;)Lvd0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p1}, Lcz;-><init>(ILvd0;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcz;->u()V

    .line 12
    .line 13
    .line 14
    new-instance p1, Lretrofit2/KotlinExtensions$await$4$1;

    .line 15
    .line 16
    invoke-direct {p1, p0}, Lretrofit2/KotlinExtensions$await$4$1;-><init>(Lretrofit2/Call;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lcz;->w(Lif1;)V

    .line 20
    .line 21
    .line 22
    new-instance p1, Lretrofit2/KotlinExtensions$await$4$2;

    .line 23
    .line 24
    invoke-direct {p1, v0}, Lretrofit2/KotlinExtensions$await$4$2;-><init>(Laz;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p0, p1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcz;->q()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public static final awaitResponse(Lretrofit2/Call;Lvd0;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lretrofit2/Call<",
            "TT;>;",
            "Lvd0<",
            "-",
            "Lretrofit2/Response<",
            "TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcz;

    .line 2
    .line 3
    invoke-static {p1}, Lya4;->x(Lvd0;)Lvd0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p1}, Lcz;-><init>(ILvd0;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcz;->u()V

    .line 12
    .line 13
    .line 14
    new-instance p1, Lretrofit2/KotlinExtensions$awaitResponse$2$1;

    .line 15
    .line 16
    invoke-direct {p1, p0}, Lretrofit2/KotlinExtensions$awaitResponse$2$1;-><init>(Lretrofit2/Call;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lcz;->w(Lif1;)V

    .line 20
    .line 21
    .line 22
    new-instance p1, Lretrofit2/KotlinExtensions$awaitResponse$2$2;

    .line 23
    .line 24
    invoke-direct {p1, v0}, Lretrofit2/KotlinExtensions$awaitResponse$2$2;-><init>(Laz;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p0, p1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcz;->q()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public static final awaitUnit(Lretrofit2/Call;Lvd0;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/Call<",
            "Lj15;",
            ">;",
            "Lvd0<",
            "-",
            "Lj15;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1}, Lretrofit2/KotlinExtensions;->awaitNullable(Lretrofit2/Call;Lvd0;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method public static final create(Lretrofit2/Retrofit;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lretrofit2/Retrofit;",
            ")TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 5
    .line 6
    const-string v0, "This function has a reified type parameter and thus can only be inlined at compilation time, not called directly."

    .line 7
    .line 8
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    throw p0
.end method

.method public static final suspendAndThrow(Ljava/lang/Throwable;Lvd0;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Lvd0<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lretrofit2/KotlinExtensions$suspendAndThrow$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lretrofit2/KotlinExtensions$suspendAndThrow$1;

    .line 7
    .line 8
    iget v1, v0, Lretrofit2/KotlinExtensions$suspendAndThrow$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lretrofit2/KotlinExtensions$suspendAndThrow$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lretrofit2/KotlinExtensions$suspendAndThrow$1;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lretrofit2/KotlinExtensions$suspendAndThrow$1;-><init>(Lvd0;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lretrofit2/KotlinExtensions$suspendAndThrow$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lretrofit2/KotlinExtensions$suspendAndThrow$1;->label:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    if-eq v1, v2, :cond_1

    .line 34
    .line 35
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 36
    .line 37
    invoke-static {p1}, Lkf2;->o(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_1
    iget-object v0, v0, Lretrofit2/KotlinExtensions$suspendAndThrow$1;->L$0:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Ljava/lang/Throwable;

    .line 44
    .line 45
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-static {}, Ler1;->a()V

    .line 49
    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_2
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iput-object p0, v0, Lretrofit2/KotlinExtensions$suspendAndThrow$1;->L$0:Ljava/lang/Object;

    .line 56
    .line 57
    iput v2, v0, Lretrofit2/KotlinExtensions$suspendAndThrow$1;->label:I

    .line 58
    .line 59
    sget-object p1, Lrr0;->a:Lrm0;

    .line 60
    .line 61
    invoke-interface {v0}, Lvd0;->getContext()Lne0;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    new-instance v2, Lretrofit2/KotlinExtensions$suspendAndThrow$2$1;

    .line 66
    .line 67
    invoke-direct {v2, v0, p0}, Lretrofit2/KotlinExtensions$suspendAndThrow$2$1;-><init>(Lvd0;Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v1, v2}, Lrm0;->W(Lne0;Ljava/lang/Runnable;)V

    .line 71
    .line 72
    .line 73
    sget-object p0, Lxe0;->n:Lxe0;

    .line 74
    .line 75
    return-object p0
.end method
