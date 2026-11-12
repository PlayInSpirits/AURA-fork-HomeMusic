.class public final synthetic Lvl2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lxl2;
.implements Lks2;
.implements Lwc0;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:I

.field public final synthetic q:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lvl2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lvl2;->o:Ljava/lang/Object;

    .line 4
    .line 5
    iput p2, p0, Lvl2;->p:I

    .line 6
    .line 7
    iput-object p3, p0, Lvl2;->q:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 13
    iput p4, p0, Lvl2;->n:I

    iput-object p1, p0, Lvl2;->o:Ljava/lang/Object;

    iput-object p2, p0, Lvl2;->q:Ljava/lang/Object;

    iput p3, p0, Lvl2;->p:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lvl2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ltn2;

    .line 4
    .line 5
    iget-object v1, p0, Lvl2;->q:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lfr2;

    .line 8
    .line 9
    check-cast p1, Lic2;

    .line 10
    .line 11
    const-string v2, "MediaSessionStub"

    .line 12
    .line 13
    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lab4;

    .line 18
    .line 19
    const-string v3, "SessionResult must not be null"

    .line 20
    .line 21
    invoke-static {p1, v3}, Lrr2;->s(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    goto :goto_3

    .line 25
    :catch_0
    move-exception p1

    .line 26
    goto :goto_0

    .line 27
    :catch_1
    move-exception p1

    .line 28
    goto :goto_0

    .line 29
    :catch_2
    move-exception p1

    .line 30
    goto :goto_2

    .line 31
    :goto_0
    const-string v3, "Session operation failed"

    .line 32
    .line 33
    invoke-static {v2, v3, p1}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    new-instance v2, Lab4;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    instance-of p1, p1, Ljava/lang/UnsupportedOperationException;

    .line 43
    .line 44
    if-eqz p1, :cond_0

    .line 45
    .line 46
    const/4 p1, -0x6

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    const/4 p1, -0x1

    .line 49
    :goto_1
    invoke-direct {v2, p1}, Lab4;-><init>(I)V

    .line 50
    .line 51
    .line 52
    move-object p1, v2

    .line 53
    goto :goto_3

    .line 54
    :goto_2
    const-string v3, "Session operation cancelled"

    .line 55
    .line 56
    invoke-static {v2, v3, p1}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    new-instance p1, Lab4;

    .line 60
    .line 61
    const/4 v2, 0x1

    .line 62
    invoke-direct {p1, v2}, Lab4;-><init>(I)V

    .line 63
    .line 64
    .line 65
    :goto_3
    iget p0, p0, Lvl2;->p:I

    .line 66
    .line 67
    invoke-static {v0, v1, p0, p1}, Lkt2;->P0(Ltn2;Lfr2;ILab4;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public b(Lfr2;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lvl2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lls2;

    .line 4
    .line 5
    iget-object v1, p0, Lvl2;->q:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lpm2;

    .line 8
    .line 9
    iget-object v2, v1, Lpm2;->n:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    const-string p0, "MediaSessionLegacyStub"

    .line 18
    .line 19
    const-string p1, "onAddQueueItem(): Media ID shouldn\'t be empty"

    .line 20
    .line 21
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-static {v1}, Lf92;->j(Lpm2;)Lgn2;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iget-object v2, v0, Lls2;->g:Ltn2;

    .line 30
    .line 31
    invoke-static {v1}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v2, p1, v1}, Ltn2;->o(Lfr2;Ljava/util/List;)Lmw1;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    new-instance v2, Lue1;

    .line 40
    .line 41
    iget p0, p0, Lvl2;->p:I

    .line 42
    .line 43
    invoke-direct {v2, v0, p1, p0}, Lue1;-><init>(Lls2;Lfr2;I)V

    .line 44
    .line 45
    .line 46
    new-instance p0, Llg1;

    .line 47
    .line 48
    const/4 p1, 0x0

    .line 49
    invoke-direct {p0, p1, v1, v2}, Llg1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    sget-object p1, Lgq0;->n:Lgq0;

    .line 53
    .line 54
    invoke-virtual {v1, p0, p1}, Lmw1;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public d(Lpu1;I)V
    .locals 7

    .line 1
    iget v0, p0, Lvl2;->n:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, Lvl2;->q:Ljava/lang/Object;

    .line 5
    .line 6
    iget v3, p0, Lvl2;->p:I

    .line 7
    .line 8
    iget-object p0, p0, Lvl2;->o:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lbm2;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast v2, Lgn2;

    .line 16
    .line 17
    iget-object v0, p0, Lbm2;->n:Lcb4;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v0, v0, Lcb4;->a:Lbb4;

    .line 23
    .line 24
    invoke-interface {v0}, Lbb4;->f()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object p0, p0, Lbm2;->c:Lmm2;

    .line 29
    .line 30
    const/4 v4, 0x2

    .line 31
    if-lt v0, v4, :cond_0

    .line 32
    .line 33
    invoke-virtual {v2, v1}, Lgn2;->c(Z)Landroid/os/Bundle;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {p1, p0, p2, v3, v0}, Lpu1;->G0(Lju1;IILandroid/os/Bundle;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    add-int/lit8 v0, v3, 0x1

    .line 42
    .line 43
    invoke-virtual {v2, v1}, Lgn2;->c(Z)Landroid/os/Bundle;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-interface {p1, p0, p2, v0, v1}, Lpu1;->D(Lju1;IILandroid/os/Bundle;)V

    .line 48
    .line 49
    .line 50
    invoke-interface {p1, p0, p2, v3}, Lpu1;->N(Lju1;II)V

    .line 51
    .line 52
    .line 53
    :goto_0
    return-void

    .line 54
    :pswitch_0
    check-cast v2, Ljava/util/List;

    .line 55
    .line 56
    iget-object p0, p0, Lbm2;->c:Lmm2;

    .line 57
    .line 58
    new-instance v0, Liw;

    .line 59
    .line 60
    invoke-static {}, Lyw1;->j()Luw1;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    const/4 v5, 0x0

    .line 65
    :goto_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    if-ge v5, v6, :cond_1

    .line 70
    .line 71
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    check-cast v6, Lgn2;

    .line 76
    .line 77
    invoke-virtual {v6, v1}, Lgn2;->c(Z)Landroid/os/Bundle;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-virtual {v4, v6}, Lpw1;->c(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    add-int/lit8 v5, v5, 0x1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    invoke-virtual {v4}, Luw1;->f()Lgy3;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-direct {v0, v1}, Liw;-><init>(Ljava/util/List;)V

    .line 92
    .line 93
    .line 94
    invoke-interface {p1, p0, p2, v3, v0}, Lpu1;->Z(Lju1;IILandroid/os/IBinder;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
