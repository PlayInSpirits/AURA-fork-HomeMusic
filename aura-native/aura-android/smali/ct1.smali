.class public final synthetic Lct1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/homemusic/SmartSession;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/homemusic/SmartSession;Ljava/lang/String;Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p4, p0, Lct1;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lct1;->o:Lcom/eddyizm/tempus/homemusic/SmartSession;

    .line 4
    .line 5
    iput-object p2, p0, Lct1;->p:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Lct1;->q:Landroid/content/Context;

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
    .locals 5

    .line 1
    iget v0, p0, Lct1;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Lct1;->q:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v2, p0, Lct1;->p:Ljava/lang/String;

    .line 6
    .line 7
    iget-object p0, p0, Lct1;->o:Lcom/eddyizm/tempus/homemusic/SmartSession;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    :try_start_0
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/SmartSession;->getId()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0, v2}, Lrr1;->u(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lj15;->a:Lj15;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    new-instance v0, Ls14;

    .line 24
    .line 25
    invoke-direct {v0, p0}, Ls14;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    move-object p0, v0

    .line 29
    :goto_0
    sget-object v0, Lio1;->b:Landroid/os/Handler;

    .line 30
    .line 31
    new-instance v2, Lws1;

    .line 32
    .line 33
    const/4 v3, 0x3

    .line 34
    invoke-direct {v2, v3, p0, v1}, Lws1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_0
    :try_start_1
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/SmartSession;->getId()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0, v2}, Lrr1;->t(Ljava/lang/String;Ljava/lang/String;)Lcom/eddyizm/tempus/homemusic/SmartAddOut;

    .line 46
    .line 47
    .line 48
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 49
    goto :goto_1

    .line 50
    :catchall_1
    move-exception v0

    .line 51
    new-instance v3, Ls14;

    .line 52
    .line 53
    invoke-direct {v3, v0}, Ls14;-><init>(Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    move-object v0, v3

    .line 57
    :goto_1
    sget-object v3, Lio1;->b:Landroid/os/Handler;

    .line 58
    .line 59
    new-instance v4, Lt6;

    .line 60
    .line 61
    invoke-direct {v4, v0, p0, v2, v1}, Lt6;-><init>(Ljava/lang/Object;Lcom/eddyizm/tempus/homemusic/SmartSession;Ljava/lang/String;Landroid/content/Context;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
