.class public final synthetic Lretrofit2/a;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lretrofit2/DefaultCallAdapterFactory$ExecutorCallbackCall$1;

.field public final synthetic p:Lretrofit2/Callback;

.field public final synthetic q:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lretrofit2/DefaultCallAdapterFactory$ExecutorCallbackCall$1;Lretrofit2/Callback;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lretrofit2/a;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lretrofit2/a;->o:Lretrofit2/DefaultCallAdapterFactory$ExecutorCallbackCall$1;

    .line 4
    .line 5
    iput-object p2, p0, Lretrofit2/a;->p:Lretrofit2/Callback;

    .line 6
    .line 7
    iput-object p3, p0, Lretrofit2/a;->q:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lretrofit2/a;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Lretrofit2/a;->q:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lretrofit2/a;->p:Lretrofit2/Callback;

    .line 6
    .line 7
    iget-object p0, p0, Lretrofit2/a;->o:Lretrofit2/DefaultCallAdapterFactory$ExecutorCallbackCall$1;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v1, Ljava/lang/Throwable;

    .line 13
    .line 14
    invoke-static {p0, v2, v1}, Lretrofit2/DefaultCallAdapterFactory$ExecutorCallbackCall$1;->a(Lretrofit2/DefaultCallAdapterFactory$ExecutorCallbackCall$1;Lretrofit2/Callback;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    check-cast v1, Lretrofit2/Response;

    .line 19
    .line 20
    invoke-static {p0, v2, v1}, Lretrofit2/DefaultCallAdapterFactory$ExecutorCallbackCall$1;->b(Lretrofit2/DefaultCallAdapterFactory$ExecutorCallbackCall$1;Lretrofit2/Callback;Lretrofit2/Response;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
