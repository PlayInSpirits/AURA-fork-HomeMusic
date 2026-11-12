.class public final synthetic Lpm;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Z

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZI)V
    .locals 0

    .line 1
    iput p3, p0, Lpm;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lpm;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iput-boolean p2, p0, Lpm;->o:Z

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lpm;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lpm;->p:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/app/Activity;

    .line 9
    .line 10
    iget-boolean p0, p0, Lpm;->o:Z

    .line 11
    .line 12
    invoke-static {v0, p0}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->j(Landroid/app/Activity;Z)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Lpm;->p:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lcom/eddyizm/tempus/service/MediaService;

    .line 19
    .line 20
    iget-boolean p0, p0, Lpm;->o:Z

    .line 21
    .line 22
    iget-boolean v1, v0, Lcom/eddyizm/tempus/service/MediaService;->D:Z

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    if-eqz p0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/eddyizm/tempus/service/MediaService;->p()Lkn2;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Lkn2;->a()Lqi3;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p0}, Lcom/eddyizm/tempus/service/MediaService;->v(Lqi3;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    sget-object p0, Lrs3;->a:Lrs3;

    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/eddyizm/tempus/service/MediaService;->p()Lkn2;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Lkn2;->a()Lqi3;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v0, v1}, Lrs3;->c(Landroid/content/Context;Lqi3;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    return-void

    .line 60
    :pswitch_1
    iget-object v0, p0, Lpm;->p:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, Lxc5;

    .line 63
    .line 64
    iget-boolean p0, p0, Lpm;->o:Z

    .line 65
    .line 66
    iget-object v0, v0, Lxc5;->p:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Lqm;

    .line 69
    .line 70
    sget-object v1, Lf35;->a:Ljava/lang/String;

    .line 71
    .line 72
    invoke-interface {v0, p0}, Lqm;->d(Z)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
