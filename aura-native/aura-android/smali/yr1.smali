.class public final synthetic Lyr1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lgf1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/homemusic/HubFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/homemusic/HubFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyr1;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lyr1;->o:Lcom/eddyizm/tempus/homemusic/HubFragment;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lyr1;->n:I

    .line 2
    .line 3
    sget-object v1, Lj15;->a:Lj15;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object p0, p0, Lyr1;->o:Lcom/eddyizm/tempus/homemusic/HubFragment;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, Lcom/eddyizm/tempus/homemusic/HubFragment;->y0:Ljava/util/List;

    .line 13
    .line 14
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 15
    .line 16
    .line 17
    move-result-wide v4

    .line 18
    iget-wide v6, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->q0:J

    .line 19
    .line 20
    sub-long v6, v4, v6

    .line 21
    .line 22
    const-wide/16 v8, 0x7530

    .line 23
    .line 24
    cmp-long v0, v6, v8

    .line 25
    .line 26
    if-gez v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iput-wide v4, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->q0:J

    .line 30
    .line 31
    sput-object v3, Lhw;->i:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->o0:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p0, v0, v2}, Lcom/eddyizm/tempus/homemusic/HubFragment;->h0(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    :goto_0
    return-object v1

    .line 39
    :pswitch_0
    sget-object v0, Lcom/eddyizm/tempus/homemusic/HubFragment;->y0:Ljava/util/List;

    .line 40
    .line 41
    sget-object v0, Llr1;->a:Ljava/lang/ref/WeakReference;

    .line 42
    .line 43
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 44
    .line 45
    if-eqz p0, :cond_3

    .line 46
    .line 47
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->P:Lbl2;

    .line 48
    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    new-instance v3, Ljr1;

    .line 53
    .line 54
    const/4 v4, 0x0

    .line 55
    invoke-direct {v3, v0, v4}, Ljr1;-><init>(Lbl2;I)V

    .line 56
    .line 57
    .line 58
    invoke-static {p0}, Lud3;->w(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v0, v3, v4}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 63
    .line 64
    .line 65
    :goto_1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->P:Lbl2;

    .line 66
    .line 67
    if-nez v0, :cond_2

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_2
    new-instance v3, Ljr1;

    .line 71
    .line 72
    invoke-direct {v3, v0, v2}, Ljr1;-><init>(Lbl2;I)V

    .line 73
    .line 74
    .line 75
    invoke-static {p0}, Lud3;->w(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {v0, v3, p0}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 80
    .line 81
    .line 82
    :goto_2
    return-object v1

    .line 83
    :cond_3
    const-string p0, "activity"

    .line 84
    .line 85
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
