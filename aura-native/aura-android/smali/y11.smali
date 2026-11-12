.class public final Ly11;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lkc1;


# direct methods
.method public synthetic constructor <init>(ILkc1;)V
    .locals 0

    .line 1
    iput p1, p0, Ly11;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Ly11;->o:Lkc1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .line 1
    iget v0, p0, Ly11;->n:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, Ly11;->o:Lkc1;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, Lvb4;

    .line 10
    .line 11
    check-cast p2, Lxp;

    .line 12
    .line 13
    iput-object p2, p0, Lvb4;->x0:Lxp;

    .line 14
    .line 15
    iput-boolean v1, p0, Lvb4;->y0:Z

    .line 16
    .line 17
    invoke-virtual {p0}, Lvb4;->n0()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lvb4;->l0()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 25
    .line 26
    check-cast p2, Lxp;

    .line 27
    .line 28
    iput-boolean v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->N0:Z

    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    check-cast p2, Lxp;

    .line 38
    .line 39
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;

    .line 40
    .line 41
    iget-object p1, p2, Lxp;->e:Lcom/eddyizm/tempus/service/MediaService;

    .line 42
    .line 43
    iget-object p1, p1, Lcom/eddyizm/tempus/service/MediaService;->A:Lwo0;

    .line 44
    .line 45
    if-eqz p1, :cond_0

    .line 46
    .line 47
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->n0:Lwo0;

    .line 48
    .line 49
    invoke-static {p0}, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->h0(Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;)V

    .line 50
    .line 51
    .line 52
    invoke-static {p0}, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->i0(Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_0
    const-string p0, "equalizerManager"

    .line 57
    .line 58
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const/4 p0, 0x0

    .line 62
    throw p0

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 3

    .line 1
    iget v0, p0, Ly11;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, Ly11;->o:Lkc1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Lvb4;

    .line 11
    .line 12
    iput-object v2, p0, Lvb4;->x0:Lxp;

    .line 13
    .line 14
    iput-boolean v1, p0, Lvb4;->y0:Z

    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 18
    .line 19
    iput-boolean v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->N0:Z

    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;

    .line 26
    .line 27
    iput-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->n0:Lwo0;

    .line 28
    .line 29
    return-void

    .line 30
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
